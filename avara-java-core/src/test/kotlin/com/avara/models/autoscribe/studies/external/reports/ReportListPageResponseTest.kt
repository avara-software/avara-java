// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListPageResponseTest {

    @Test
    fun create() {
        val reportListPageResponse =
            ReportListPageResponse.builder()
                .hasMore(true)
                .addReport(
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
                )
                .cursor("cursor")
                .build()

        assertThat(reportListPageResponse.hasMore()).isEqualTo(true)
        assertThat(reportListPageResponse.reports())
            .containsExactly(
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
            )
        assertThat(reportListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportListPageResponse =
            ReportListPageResponse.builder()
                .hasMore(true)
                .addReport(
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
                )
                .cursor("cursor")
                .build()

        val roundtrippedReportListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportListPageResponse),
                jacksonTypeRef<ReportListPageResponse>(),
            )

        assertThat(roundtrippedReportListPageResponse).isEqualTo(reportListPageResponse)
    }
}
