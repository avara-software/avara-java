// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriorReportTest {

    @Test
    fun create() {
        val priorReport =
            PriorReport.builder()
                .reportText("IMPRESSION: No acute cardiopulmonary process.")
                .externalStudyId("EXT-2024-001")
                .modality("CT")
                .studyDate("2024-01-15")
                .studyDescription("CT Chest without contrast")
                .build()

        assertThat(priorReport.reportText())
            .isEqualTo("IMPRESSION: No acute cardiopulmonary process.")
        assertThat(priorReport.externalStudyId()).contains("EXT-2024-001")
        assertThat(priorReport.modality()).contains("CT")
        assertThat(priorReport.studyDate()).contains("2024-01-15")
        assertThat(priorReport.studyDescription()).contains("CT Chest without contrast")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val priorReport =
            PriorReport.builder()
                .reportText("IMPRESSION: No acute cardiopulmonary process.")
                .externalStudyId("EXT-2024-001")
                .modality("CT")
                .studyDate("2024-01-15")
                .studyDescription("CT Chest without contrast")
                .build()

        val roundtrippedPriorReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(priorReport),
                jacksonTypeRef<PriorReport>(),
            )

        assertThat(roundtrippedPriorReport).isEqualTo(priorReport)
    }
}
