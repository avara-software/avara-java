// File generated from our OpenAPI spec by Stainless.

package com.avara.api.client

import com.avara.api.core.ClientOptions
import com.avara.api.core.getPackageVersion
import com.avara.api.services.blocking.AutoScribeService
import com.avara.api.services.blocking.AutoScribeServiceImpl
import com.avara.api.services.blocking.OrgService
import com.avara.api.services.blocking.OrgServiceImpl
import com.avara.api.services.blocking.ViewerService
import com.avara.api.services.blocking.ViewerServiceImpl
import com.avara.api.services.blocking.WebhookService
import com.avara.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class AvaraClientImpl(private val clientOptions: ClientOptions) : AvaraClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: AvaraClientAsync by lazy { AvaraClientAsyncImpl(clientOptions) }

    private val withRawResponse: AvaraClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoScribe: AutoScribeService by lazy {
        AutoScribeServiceImpl(clientOptionsWithUserAgent)
    }

    private val viewer: ViewerService by lazy { ViewerServiceImpl(clientOptionsWithUserAgent) }

    private val orgs: OrgService by lazy { OrgServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): AvaraClientAsync = async

    override fun withRawResponse(): AvaraClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClient =
        AvaraClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoScribe(): AutoScribeService = autoScribe

    override fun viewer(): ViewerService = viewer

    override fun orgs(): OrgService = orgs

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
    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvaraClient.WithRawResponse {

        private val autoScribe: AutoScribeService.WithRawResponse by lazy {
            AutoScribeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val viewer: ViewerService.WithRawResponse by lazy {
            ViewerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgService.WithRawResponse by lazy {
            OrgServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvaraClient.WithRawResponse =
            AvaraClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autoScribe(): AutoScribeService.WithRawResponse = autoScribe

        override fun viewer(): ViewerService.WithRawResponse = viewer

        override fun orgs(): OrgService.WithRawResponse = orgs

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
        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
