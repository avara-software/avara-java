// File generated from our OpenAPI spec by Stainless.

package com.avara.api.client

import com.avara.api.core.ClientOptions
import com.avara.api.core.getPackageVersion
import com.avara.api.services.async.AutoScribeServiceAsync
import com.avara.api.services.async.AutoScribeServiceAsyncImpl
import com.avara.api.services.async.OrgServiceAsync
import com.avara.api.services.async.OrgServiceAsyncImpl
import com.avara.api.services.async.ViewerServiceAsync
import com.avara.api.services.async.ViewerServiceAsyncImpl
import com.avara.api.services.async.WebhookServiceAsync
import com.avara.api.services.async.WebhookServiceAsyncImpl
import java.util.function.Consumer

class AvaraClientAsyncImpl(private val clientOptions: ClientOptions) : AvaraClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: AvaraClient by lazy { AvaraClientImpl(clientOptions) }

    private val withRawResponse: AvaraClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoScribe: AutoScribeServiceAsync by lazy {
        AutoScribeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val viewer: ViewerServiceAsync by lazy {
        ViewerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orgs: OrgServiceAsync by lazy { OrgServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): AvaraClient = sync

    override fun withRawResponse(): AvaraClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClientAsync =
        AvaraClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoScribe(): AutoScribeServiceAsync = autoScribe

    override fun viewer(): ViewerServiceAsync = viewer

    override fun orgs(): OrgServiceAsync = orgs

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
    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvaraClientAsync.WithRawResponse {

        private val autoScribe: AutoScribeServiceAsync.WithRawResponse by lazy {
            AutoScribeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val viewer: ViewerServiceAsync.WithRawResponse by lazy {
            ViewerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgServiceAsync.WithRawResponse by lazy {
            OrgServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvaraClientAsync.WithRawResponse =
            AvaraClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autoScribe(): AutoScribeServiceAsync.WithRawResponse = autoScribe

        override fun viewer(): ViewerServiceAsync.WithRawResponse = viewer

        override fun orgs(): OrgServiceAsync.WithRawResponse = orgs

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
        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
