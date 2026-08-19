// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalContextEnrichmentPriorReportTest {

    @Test
    fun create() {
        val clinicalContextEnrichmentPriorReport =
            ClinicalContextEnrichmentPriorReport.builder()
                .reportText("IMPRESSION: No acute cardiopulmonary process.")
                .externalStudyId("EXT-2024-001")
                .modality("CT")
                .studyDate("2024-01-15")
                .studyDescription("CT Chest without contrast")
                .build()

        assertThat(clinicalContextEnrichmentPriorReport.reportText())
            .isEqualTo("IMPRESSION: No acute cardiopulmonary process.")
        assertThat(clinicalContextEnrichmentPriorReport.externalStudyId()).contains("EXT-2024-001")
        assertThat(clinicalContextEnrichmentPriorReport.modality()).contains("CT")
        assertThat(clinicalContextEnrichmentPriorReport.studyDate()).contains("2024-01-15")
        assertThat(clinicalContextEnrichmentPriorReport.studyDescription())
            .contains("CT Chest without contrast")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalContextEnrichmentPriorReport =
            ClinicalContextEnrichmentPriorReport.builder()
                .reportText("IMPRESSION: No acute cardiopulmonary process.")
                .externalStudyId("EXT-2024-001")
                .modality("CT")
                .studyDate("2024-01-15")
                .studyDescription("CT Chest without contrast")
                .build()

        val roundtrippedClinicalContextEnrichmentPriorReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalContextEnrichmentPriorReport),
                jacksonTypeRef<ClinicalContextEnrichmentPriorReport>(),
            )

        assertThat(roundtrippedClinicalContextEnrichmentPriorReport)
            .isEqualTo(clinicalContextEnrichmentPriorReport)
    }
}
