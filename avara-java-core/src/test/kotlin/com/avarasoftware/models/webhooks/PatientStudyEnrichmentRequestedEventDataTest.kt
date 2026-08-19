// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PatientStudyEnrichmentRequestedEventDataTest {

    @Test
    fun create() {
        val patientStudyEnrichmentRequestedEventData =
            PatientStudyEnrichmentRequestedEventData.builder()
                .clinicId("123e4567-e89b-12d3-a456-426614174000")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .accessionNumber("ACC-98765")
                .patientId("MRN-12345")
                .build()

        assertThat(patientStudyEnrichmentRequestedEventData.clinicId())
            .isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(patientStudyEnrichmentRequestedEventData.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1234567890")
        assertThat(patientStudyEnrichmentRequestedEventData.accessionNumber()).contains("ACC-98765")
        assertThat(patientStudyEnrichmentRequestedEventData.patientId()).contains("MRN-12345")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val patientStudyEnrichmentRequestedEventData =
            PatientStudyEnrichmentRequestedEventData.builder()
                .clinicId("123e4567-e89b-12d3-a456-426614174000")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .accessionNumber("ACC-98765")
                .patientId("MRN-12345")
                .build()

        val roundtrippedPatientStudyEnrichmentRequestedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(patientStudyEnrichmentRequestedEventData),
                jacksonTypeRef<PatientStudyEnrichmentRequestedEventData>(),
            )

        assertThat(roundtrippedPatientStudyEnrichmentRequestedEventData)
            .isEqualTo(patientStudyEnrichmentRequestedEventData)
    }
}
