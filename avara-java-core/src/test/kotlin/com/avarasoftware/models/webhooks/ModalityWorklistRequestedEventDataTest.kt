// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModalityWorklistRequestedEventDataTest {

    @Test
    fun create() {
        val modalityWorklistRequestedEventData =
            ModalityWorklistRequestedEventData.builder()
                .callingAe("CT_SCANNER_01")
                .clinicId("123e4567-e89b-12d3-a456-426614174000")
                .dateEnd("2026-08-13")
                .dateStart("2026-08-13")
                .sourceIp("10.0.0.25")
                .modality("CT")
                .build()

        assertThat(modalityWorklistRequestedEventData.callingAe()).isEqualTo("CT_SCANNER_01")
        assertThat(modalityWorklistRequestedEventData.clinicId())
            .isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(modalityWorklistRequestedEventData.dateEnd()).isEqualTo("2026-08-13")
        assertThat(modalityWorklistRequestedEventData.dateStart()).isEqualTo("2026-08-13")
        assertThat(modalityWorklistRequestedEventData.sourceIp()).isEqualTo("10.0.0.25")
        assertThat(modalityWorklistRequestedEventData.modality()).contains("CT")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modalityWorklistRequestedEventData =
            ModalityWorklistRequestedEventData.builder()
                .callingAe("CT_SCANNER_01")
                .clinicId("123e4567-e89b-12d3-a456-426614174000")
                .dateEnd("2026-08-13")
                .dateStart("2026-08-13")
                .sourceIp("10.0.0.25")
                .modality("CT")
                .build()

        val roundtrippedModalityWorklistRequestedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modalityWorklistRequestedEventData),
                jacksonTypeRef<ModalityWorklistRequestedEventData>(),
            )

        assertThat(roundtrippedModalityWorklistRequestedEventData)
            .isEqualTo(modalityWorklistRequestedEventData)
    }
}
