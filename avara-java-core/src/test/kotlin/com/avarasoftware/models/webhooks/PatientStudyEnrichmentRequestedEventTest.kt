// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PatientStudyEnrichmentRequestedEventTest {

    @Test
    fun create() {
        val patientStudyEnrichmentRequestedEvent =
            PatientStudyEnrichmentRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    PatientStudyEnrichmentRequestedEventData.builder()
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .accessionNumber("ACC-98765")
                        .patientId("MRN-12345")
                        .build()
                )
                .build()

        assertThat(patientStudyEnrichmentRequestedEvent.id())
            .isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(patientStudyEnrichmentRequestedEvent.data())
            .isEqualTo(
                PatientStudyEnrichmentRequestedEventData.builder()
                    .clinicId("123e4567-e89b-12d3-a456-426614174000")
                    .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                    .accessionNumber("ACC-98765")
                    .patientId("MRN-12345")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val patientStudyEnrichmentRequestedEvent =
            PatientStudyEnrichmentRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    PatientStudyEnrichmentRequestedEventData.builder()
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .accessionNumber("ACC-98765")
                        .patientId("MRN-12345")
                        .build()
                )
                .build()

        val roundtrippedPatientStudyEnrichmentRequestedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(patientStudyEnrichmentRequestedEvent),
                jacksonTypeRef<PatientStudyEnrichmentRequestedEvent>(),
            )

        assertThat(roundtrippedPatientStudyEnrichmentRequestedEvent)
            .isEqualTo(patientStudyEnrichmentRequestedEvent)
    }
}
