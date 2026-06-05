// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecondaryCaptureAccessRequestedWebhookEventTest {

    @Test
    fun create() {
        val secondaryCaptureAccessRequestedWebhookEvent =
            SecondaryCaptureAccessRequestedWebhookEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    SecondaryCaptureAccessRequestedWebhookEvent.Data.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                        .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                        .build()
                )
                .build()

        assertThat(secondaryCaptureAccessRequestedWebhookEvent.id())
            .isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(secondaryCaptureAccessRequestedWebhookEvent.data())
            .isEqualTo(
                SecondaryCaptureAccessRequestedWebhookEvent.Data.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                    .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                    .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secondaryCaptureAccessRequestedWebhookEvent =
            SecondaryCaptureAccessRequestedWebhookEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    SecondaryCaptureAccessRequestedWebhookEvent.Data.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                        .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                        .build()
                )
                .build()

        val roundtrippedSecondaryCaptureAccessRequestedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secondaryCaptureAccessRequestedWebhookEvent),
                jacksonTypeRef<SecondaryCaptureAccessRequestedWebhookEvent>(),
            )

        assertThat(roundtrippedSecondaryCaptureAccessRequestedWebhookEvent)
            .isEqualTo(secondaryCaptureAccessRequestedWebhookEvent)
    }
}
