// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListResponseTest {

    @Test
    fun create() {
        val reportListResponse =
            ReportListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .hasReportText(true)
                .reportPdfPresent(true)
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .readerName("readerName")
                .signedAt("signedAt")
                .build()

        assertThat(reportListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reportListResponse.externalReportId())
            .isEqualTo("ext_1234567890abcdef1234567890abcdef")
        assertThat(reportListResponse.hasReportText()).isEqualTo(true)
        assertThat(reportListResponse.reportPdfPresent()).isEqualTo(true)
        assertThat(reportListResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(reportListResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(reportListResponse.readerName()).contains("readerName")
        assertThat(reportListResponse.signedAt()).contains("signedAt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportListResponse =
            ReportListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .hasReportText(true)
                .reportPdfPresent(true)
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .readerName("readerName")
                .signedAt("signedAt")
                .build()

        val roundtrippedReportListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportListResponse),
                jacksonTypeRef<ReportListResponse>(),
            )

        assertThat(roundtrippedReportListResponse).isEqualTo(reportListResponse)
    }
}
