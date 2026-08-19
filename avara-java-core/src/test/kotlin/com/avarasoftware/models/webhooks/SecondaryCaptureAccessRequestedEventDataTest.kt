// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecondaryCaptureAccessRequestedEventDataTest {

    @Test
    fun create() {
        val secondaryCaptureAccessRequestedEventData =
            SecondaryCaptureAccessRequestedEventData.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                .build()

        assertThat(secondaryCaptureAccessRequestedEventData.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(secondaryCaptureAccessRequestedEventData.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1234567890")
        assertThat(secondaryCaptureAccessRequestedEventData.seriesInstanceUid())
            .contains("1.2.840.113619.2.55.3.1234567890.1")
        assertThat(secondaryCaptureAccessRequestedEventData.sopInstanceUid())
            .contains("1.2.840.113619.2.55.3.1234567890.1.1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secondaryCaptureAccessRequestedEventData =
            SecondaryCaptureAccessRequestedEventData.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                .build()

        val roundtrippedSecondaryCaptureAccessRequestedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secondaryCaptureAccessRequestedEventData),
                jacksonTypeRef<SecondaryCaptureAccessRequestedEventData>(),
            )

        assertThat(roundtrippedSecondaryCaptureAccessRequestedEventData)
            .isEqualTo(secondaryCaptureAccessRequestedEventData)
    }
}
