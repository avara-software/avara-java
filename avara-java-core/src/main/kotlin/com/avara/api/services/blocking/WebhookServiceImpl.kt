// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.blocking

import com.avara.api.core.ClientOptions
import com.avara.api.errors.AvaraInvalidDataException
import com.avara.api.models.webhooks.UnwrapWebhookEvent
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.function.Consumer

/**
 * Webhook event handling utilities for Avara.
 *
 * Avara sends webhook events to your configured endpoint with Standard Webhooks headers
 * (`webhook-id`, `webhook-timestamp`, `webhook-signature`) for signature verification.
 *
 * ## Event Types
 * - **`study.access_requested`**: Synchronous - you must return presigned DICOM image URLs within
 *   the request timeout
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
 * The `unwrap()` method verifies the webhook signature using your `webhookKey` before parsing. This
 * ensures the request came from Avara and wasn't tampered with.
 */
class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws AvaraInvalidDataException if the body could not be parsed.
     */
    override fun unwrap(body: String): UnwrapWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnwrapWebhookEvent>())
        } catch (e: Exception) {
            throw AvaraInvalidDataException("Error parsing body", e)
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
