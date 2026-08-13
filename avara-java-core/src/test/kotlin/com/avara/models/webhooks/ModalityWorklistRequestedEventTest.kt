// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModalityWorklistRequestedEventTest {

    @Test
    fun create() {
        val modalityWorklistRequestedEvent =
            ModalityWorklistRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ModalityWorklistRequestedEventData.builder()
                        .callingAe("CT_SCANNER_01")
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .dateEnd("2026-08-13")
                        .dateStart("2026-08-13")
                        .sourceIp("10.0.0.25")
                        .modality("CT")
                        .build()
                )
                .build()

        assertThat(modalityWorklistRequestedEvent.id())
            .isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(modalityWorklistRequestedEvent.data())
            .isEqualTo(
                ModalityWorklistRequestedEventData.builder()
                    .callingAe("CT_SCANNER_01")
                    .clinicId("123e4567-e89b-12d3-a456-426614174000")
                    .dateEnd("2026-08-13")
                    .dateStart("2026-08-13")
                    .sourceIp("10.0.0.25")
                    .modality("CT")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modalityWorklistRequestedEvent =
            ModalityWorklistRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ModalityWorklistRequestedEventData.builder()
                        .callingAe("CT_SCANNER_01")
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .dateEnd("2026-08-13")
                        .dateStart("2026-08-13")
                        .sourceIp("10.0.0.25")
                        .modality("CT")
                        .build()
                )
                .build()

        val roundtrippedModalityWorklistRequestedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modalityWorklistRequestedEvent),
                jacksonTypeRef<ModalityWorklistRequestedEvent>(),
            )

        assertThat(roundtrippedModalityWorklistRequestedEvent)
            .isEqualTo(modalityWorklistRequestedEvent)
    }
}
