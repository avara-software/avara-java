// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalContextEnrichmentRequestedEventTest {

    @Test
    fun create() {
        val clinicalContextEnrichmentRequestedEvent =
            ClinicalContextEnrichmentRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ClinicalContextEnrichmentRequestedEventData.builder()
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .studyId("123e4567-e89b-12d3-a456-426614174111")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .externalPatientId("EHR-999")
                        .mrn("MRN-12345")
                        .build()
                )
                .build()

        assertThat(clinicalContextEnrichmentRequestedEvent.id())
            .isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(clinicalContextEnrichmentRequestedEvent.data())
            .isEqualTo(
                ClinicalContextEnrichmentRequestedEventData.builder()
                    .clinicId("123e4567-e89b-12d3-a456-426614174000")
                    .studyId("123e4567-e89b-12d3-a456-426614174111")
                    .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                    .externalPatientId("EHR-999")
                    .mrn("MRN-12345")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalContextEnrichmentRequestedEvent =
            ClinicalContextEnrichmentRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ClinicalContextEnrichmentRequestedEventData.builder()
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .studyId("123e4567-e89b-12d3-a456-426614174111")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .externalPatientId("EHR-999")
                        .mrn("MRN-12345")
                        .build()
                )
                .build()

        val roundtrippedClinicalContextEnrichmentRequestedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalContextEnrichmentRequestedEvent),
                jacksonTypeRef<ClinicalContextEnrichmentRequestedEvent>(),
            )

        assertThat(roundtrippedClinicalContextEnrichmentRequestedEvent)
            .isEqualTo(clinicalContextEnrichmentRequestedEvent)
    }
}
