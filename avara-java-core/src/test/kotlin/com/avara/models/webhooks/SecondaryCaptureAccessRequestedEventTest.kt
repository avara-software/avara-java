// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecondaryCaptureAccessRequestedEventTest {

    @Test
    fun create() {
        val secondaryCaptureAccessRequestedEvent =
            SecondaryCaptureAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    SecondaryCaptureAccessRequestedEventData.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                        .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                        .build()
                )
                .build()

        assertThat(secondaryCaptureAccessRequestedEvent.id())
            .isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(secondaryCaptureAccessRequestedEvent.data())
            .isEqualTo(
                SecondaryCaptureAccessRequestedEventData.builder()
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
        val secondaryCaptureAccessRequestedEvent =
            SecondaryCaptureAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    SecondaryCaptureAccessRequestedEventData.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                        .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                        .build()
                )
                .build()

        val roundtrippedSecondaryCaptureAccessRequestedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secondaryCaptureAccessRequestedEvent),
                jacksonTypeRef<SecondaryCaptureAccessRequestedEvent>(),
            )

        assertThat(roundtrippedSecondaryCaptureAccessRequestedEvent)
            .isEqualTo(secondaryCaptureAccessRequestedEvent)
    }
}
