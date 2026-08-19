// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalContextEnrichmentRequestedEventDataTest {

    @Test
    fun create() {
        val clinicalContextEnrichmentRequestedEventData =
            ClinicalContextEnrichmentRequestedEventData.builder()
                .clinicId("123e4567-e89b-12d3-a456-426614174000")
                .studyId("123e4567-e89b-12d3-a456-426614174111")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .externalPatientId("EHR-999")
                .mrn("MRN-12345")
                .build()

        assertThat(clinicalContextEnrichmentRequestedEventData.clinicId())
            .isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(clinicalContextEnrichmentRequestedEventData.studyId())
            .isEqualTo("123e4567-e89b-12d3-a456-426614174111")
        assertThat(clinicalContextEnrichmentRequestedEventData.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1234567890")
        assertThat(clinicalContextEnrichmentRequestedEventData.externalPatientId())
            .contains("EHR-999")
        assertThat(clinicalContextEnrichmentRequestedEventData.mrn()).contains("MRN-12345")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalContextEnrichmentRequestedEventData =
            ClinicalContextEnrichmentRequestedEventData.builder()
                .clinicId("123e4567-e89b-12d3-a456-426614174000")
                .studyId("123e4567-e89b-12d3-a456-426614174111")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .externalPatientId("EHR-999")
                .mrn("MRN-12345")
                .build()

        val roundtrippedClinicalContextEnrichmentRequestedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalContextEnrichmentRequestedEventData),
                jacksonTypeRef<ClinicalContextEnrichmentRequestedEventData>(),
            )

        assertThat(roundtrippedClinicalContextEnrichmentRequestedEventData)
            .isEqualTo(clinicalContextEnrichmentRequestedEventData)
    }
}
