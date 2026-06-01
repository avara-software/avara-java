// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.jsonMapper
import com.avara.models.autoscribe.ReportStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportIdWithStatusTest {

    @Test
    fun create() {
        val reportIdWithStatus =
            ReportIdWithStatus.builder()
                .isCritical(false)
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .status(ReportStatus.COMPLETED)
                .build()

        assertThat(reportIdWithStatus.isCritical()).contains(false)
        assertThat(reportIdWithStatus.reportId()).isEqualTo("rep_1234567890abcdef1234567890abcdef")
        assertThat(reportIdWithStatus.status()).isEqualTo(ReportStatus.COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportIdWithStatus =
            ReportIdWithStatus.builder()
                .isCritical(false)
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .status(ReportStatus.COMPLETED)
                .build()

        val roundtrippedReportIdWithStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportIdWithStatus),
                jacksonTypeRef<ReportIdWithStatus>(),
            )

        assertThat(roundtrippedReportIdWithStatus).isEqualTo(reportIdWithStatus)
    }
}
