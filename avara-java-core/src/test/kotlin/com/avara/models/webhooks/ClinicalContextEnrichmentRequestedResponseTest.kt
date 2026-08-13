// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalContextEnrichmentRequestedResponseTest {

    @Test
    fun create() {
        val clinicalContextEnrichmentRequestedResponse =
            ClinicalContextEnrichmentRequestedResponse.builder()
                .clinicalIndication("Chest pain, rule out PE")
                .addDocument(
                    ClinicalContextEnrichmentDocument.builder()
                        .addContent("Patient presents with chest pain.")
                        .fileName("order-notes.txt")
                        .build()
                )
                .addDocumentUrl(
                    ClinicalContextEnrichmentDocumentUrl.builder()
                        .url("https://ehr.example.com/docs/note.pdf")
                        .fileName("clinical-note.pdf")
                        .build()
                )
                .addPriorReport(
                    ClinicalContextEnrichmentPriorReport.builder()
                        .reportText("IMPRESSION: No acute cardiopulmonary process.")
                        .externalStudyId("EXT-2024-001")
                        .modality("CT")
                        .studyDate("2024-01-15")
                        .studyDescription("CT Chest without contrast")
                        .build()
                )
                .addTechnologistNote("Patient tolerated contrast well.")
                .technologistTechnique("Helical CT with IV contrast")
                .build()

        assertThat(clinicalContextEnrichmentRequestedResponse.clinicalIndication())
            .contains("Chest pain, rule out PE")
        assertThat(clinicalContextEnrichmentRequestedResponse.documents().getOrNull())
            .containsExactly(
                ClinicalContextEnrichmentDocument.builder()
                    .addContent("Patient presents with chest pain.")
                    .fileName("order-notes.txt")
                    .build()
            )
        assertThat(clinicalContextEnrichmentRequestedResponse.documentUrls().getOrNull())
            .containsExactly(
                ClinicalContextEnrichmentDocumentUrl.builder()
                    .url("https://ehr.example.com/docs/note.pdf")
                    .fileName("clinical-note.pdf")
                    .build()
            )
        assertThat(clinicalContextEnrichmentRequestedResponse.priorReports().getOrNull())
            .containsExactly(
                ClinicalContextEnrichmentPriorReport.builder()
                    .reportText("IMPRESSION: No acute cardiopulmonary process.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Chest without contrast")
                    .build()
            )
        assertThat(clinicalContextEnrichmentRequestedResponse.technologistNotes().getOrNull())
            .containsExactly("Patient tolerated contrast well.")
        assertThat(clinicalContextEnrichmentRequestedResponse.technologistTechnique())
            .contains("Helical CT with IV contrast")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalContextEnrichmentRequestedResponse =
            ClinicalContextEnrichmentRequestedResponse.builder()
                .clinicalIndication("Chest pain, rule out PE")
                .addDocument(
                    ClinicalContextEnrichmentDocument.builder()
                        .addContent("Patient presents with chest pain.")
                        .fileName("order-notes.txt")
                        .build()
                )
                .addDocumentUrl(
                    ClinicalContextEnrichmentDocumentUrl.builder()
                        .url("https://ehr.example.com/docs/note.pdf")
                        .fileName("clinical-note.pdf")
                        .build()
                )
                .addPriorReport(
                    ClinicalContextEnrichmentPriorReport.builder()
                        .reportText("IMPRESSION: No acute cardiopulmonary process.")
                        .externalStudyId("EXT-2024-001")
                        .modality("CT")
                        .studyDate("2024-01-15")
                        .studyDescription("CT Chest without contrast")
                        .build()
                )
                .addTechnologistNote("Patient tolerated contrast well.")
                .technologistTechnique("Helical CT with IV contrast")
                .build()

        val roundtrippedClinicalContextEnrichmentRequestedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalContextEnrichmentRequestedResponse),
                jacksonTypeRef<ClinicalContextEnrichmentRequestedResponse>(),
            )

        assertThat(roundtrippedClinicalContextEnrichmentRequestedResponse)
            .isEqualTo(clinicalContextEnrichmentRequestedResponse)
    }
}
