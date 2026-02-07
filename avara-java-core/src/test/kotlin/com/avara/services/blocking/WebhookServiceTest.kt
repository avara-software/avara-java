// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.TestServerExtension
import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.core.UnwrapWebhookParams
import com.avara.core.http.Headers
import com.avara.errors.AvaraWebhookException
import com.standardwebhooks.Webhook
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceTest {

    @Test
    fun unwrap() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"id\":\"whe_1234567890abcdef1234567890abcdef\",\"data\":{\"studyId\":\"stu_1234567890abcdef1234567890abcdef\",\"studyInstanceUid\":\"1.2.840.113619.2.55.3.1234567890\"},\"type\":\"study.access_requested\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val messageId = "1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "webhook-signature" to listOf(signature),
                        "webhook-id" to listOf(messageId),
                        "webhook-timestamp" to listOf(timestampSeconds.toString()),
                    )
                )
                .build()

        webhookService.unwrap(payload).validate()

        // Wrong key should throw
        assertThrows<AvaraWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }

        // Bad signature should throw
        assertThrows<AvaraWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Old timestamp should throw
        assertThrows<AvaraWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }

        // Wrong message ID should throw
        assertThrows<AvaraWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
    }
}
