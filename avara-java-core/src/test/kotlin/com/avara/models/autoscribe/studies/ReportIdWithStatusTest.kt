// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportIdWithStatusTest {

    @Test
    fun create() {
        val reportIdWithStatus =
            ReportIdWithStatus.builder()
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .status(ReportIdWithStatus.Status.COMPLETED)
                .build()

        assertThat(reportIdWithStatus.reportId()).isEqualTo("rep_1234567890abcdef1234567890abcdef")
        assertThat(reportIdWithStatus.status()).isEqualTo(ReportIdWithStatus.Status.COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportIdWithStatus =
            ReportIdWithStatus.builder()
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .status(ReportIdWithStatus.Status.COMPLETED)
                .build()

        val roundtrippedReportIdWithStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportIdWithStatus),
                jacksonTypeRef<ReportIdWithStatus>(),
            )

        assertThat(roundtrippedReportIdWithStatus).isEqualTo(reportIdWithStatus)
    }
}
