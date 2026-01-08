// File generated from our OpenAPI spec by Stainless.

package com.avara.api.client

import com.avara.api.core.ClientOptions
import com.avara.api.services.blocking.AutoScribeService
import com.avara.api.services.blocking.OrgService
import com.avara.api.services.blocking.ViewerService
import com.avara.api.services.blocking.WebhookService
import java.util.function.Consumer

/**
 * A client for interacting with the Avara REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface AvaraClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): AvaraClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClient

    fun autoScribe(): AutoScribeService

    fun viewer(): ViewerService

    fun orgs(): OrgService

    /**
     * Webhook event handling utilities for Avara.
     *
     * Avara sends webhook events to your configured endpoint with Standard Webhooks headers
     * (`webhook-id`, `webhook-timestamp`, `webhook-signature`) for signature verification.
     *
     * ## Event Types
     * - **`study.access_requested`**: Synchronous - you must return presigned DICOM image URLs
     *   within the request timeout
     * - **`report.delivered`**: Asynchronous notification when a report is completed
     *
     * ## TypeScript
     *
     * ```typescript
     * import Avara from 'avara';
     * import express from 'express';
     *
     * const client = new Avara({
     *   webhookKey: process.env.AVARA_WEBHOOK_KEY, // From your Avara dashboard
     * });
     *
     * app.post('/webhooks/avara', express.raw({ type: 'application/json' }), (req, res) => {
     *   try {
     *     const event = client.webhooks.unwrap(req.body.toString(), req.headers);
     *
     *     if (event.type === 'report.delivered') {
     *       console.log('Report ready:', event.data.reportId);
     *       console.log('PDF URL:', event.data.presignedUrl);
     *       return res.json({ success: true });
     *     }
     *
     *     if (event.type === 'study.access_requested') {
     *       // Fetch presigned URLs from your PACS/storage
     *       const urls = await getPresignedUrls(event.data.studyInstanceUid);
     *       return res.json({ authorized: true, urls });
     *     }
     *   } catch (err) {
     *     console.error('Webhook error:', err);
     *     return res.status(400).json({ error: 'Invalid webhook' });
     *   }
     * });
     * ```
     *
     * ## Python
     *
     * ```python
     * import os
     * from flask import Flask, request, jsonify
     * from avara import Avara
     *
     * app = Flask(__name__)
     * client = Avara(webhook_key=os.environ['AVARA_WEBHOOK_KEY'])
     *
     * @app.route('/webhooks/avara', methods=['POST'])
     * def handle_webhook():
     *     try:
     *         event = client.webhooks.unwrap(request.data, dict(request.headers))
     *
     *         if event.type == 'report.delivered':
     *             print(f"Report ready: {event.data.report_id}")
     *             print(f"PDF URL: {event.data.presigned_url}")
     *             return jsonify({'success': True})
     *
     *         if event.type == 'study.access_requested':
     *             # Fetch presigned URLs from your PACS/storage
     *             urls = get_presigned_urls(event.data.study_instance_uid)
     *             return jsonify({'authorized': True, 'urls': urls})
     *
     *     except Exception as e:
     *         print(f"Webhook error: {e}")
     *         return jsonify({'error': 'Invalid webhook'}), 400
     * ```
     *
     * ## Verification
     *
     * The `unwrap()` method verifies the webhook signature using your `webhookKey` before parsing.
     * This ensures the request came from Avara and wasn't tampered with.
     */
    fun webhooks(): WebhookService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [AvaraClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClient.WithRawResponse

        fun autoScribe(): AutoScribeService.WithRawResponse

        fun viewer(): ViewerService.WithRawResponse

        fun orgs(): OrgService.WithRawResponse

        /**
         * Webhook event handling utilities for Avara.
         *
         * Avara sends webhook events to your configured endpoint with Standard Webhooks headers
         * (`webhook-id`, `webhook-timestamp`, `webhook-signature`) for signature verification.
         *
         * ## Event Types
         * - **`study.access_requested`**: Synchronous - you must return presigned DICOM image URLs
         *   within the request timeout
         * - **`report.delivered`**: Asynchronous notification when a report is completed
         *
         * ## TypeScript
         *
         * ```typescript
         * import Avara from 'avara';
         * import express from 'express';
         *
         * const client = new Avara({
         *   webhookKey: process.env.AVARA_WEBHOOK_KEY, // From your Avara dashboard
         * });
         *
         * app.post('/webhooks/avara', express.raw({ type: 'application/json' }), (req, res) => {
         *   try {
         *     const event = client.webhooks.unwrap(req.body.toString(), req.headers);
         *
         *     if (event.type === 'report.delivered') {
         *       console.log('Report ready:', event.data.reportId);
         *       console.log('PDF URL:', event.data.presignedUrl);
         *       return res.json({ success: true });
         *     }
         *
         *     if (event.type === 'study.access_requested') {
         *       // Fetch presigned URLs from your PACS/storage
         *       const urls = await getPresignedUrls(event.data.studyInstanceUid);
         *       return res.json({ authorized: true, urls });
         *     }
         *   } catch (err) {
         *     console.error('Webhook error:', err);
         *     return res.status(400).json({ error: 'Invalid webhook' });
         *   }
         * });
         * ```
         *
         * ## Python
         *
         * ```python
         * import os
         * from flask import Flask, request, jsonify
         * from avara import Avara
         *
         * app = Flask(__name__)
         * client = Avara(webhook_key=os.environ['AVARA_WEBHOOK_KEY'])
         *
         * @app.route('/webhooks/avara', methods=['POST'])
         * def handle_webhook():
         *     try:
         *         event = client.webhooks.unwrap(request.data, dict(request.headers))
         *
         *         if event.type == 'report.delivered':
         *             print(f"Report ready: {event.data.report_id}")
         *             print(f"PDF URL: {event.data.presigned_url}")
         *             return jsonify({'success': True})
         *
         *         if event.type == 'study.access_requested':
         *             # Fetch presigned URLs from your PACS/storage
         *             urls = get_presigned_urls(event.data.study_instance_uid)
         *             return jsonify({'authorized': True, 'urls': urls})
         *
         *     except Exception as e:
         *         print(f"Webhook error: {e}")
         *         return jsonify({'error': 'Invalid webhook'}), 400
         * ```
         *
         * ## Verification
         *
         * The `unwrap()` method verifies the webhook signature using your `webhookKey` before
         * parsing. This ensures the request came from Avara and wasn't tampered with.
         */
        fun webhooks(): WebhookService.WithRawResponse
    }
}
