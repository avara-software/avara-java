// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCreateResponseTest {

    @Test
    fun create() {
        val reportCreateResponse =
            ReportCreateResponse.builder()
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        assertThat(reportCreateResponse.externalReportId())
            .isEqualTo("ext_1234567890abcdef1234567890abcdef")
        assertThat(reportCreateResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(reportCreateResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportCreateResponse =
            ReportCreateResponse.builder()
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val roundtrippedReportCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportCreateResponse),
                jacksonTypeRef<ReportCreateResponse>(),
            )

        assertThat(roundtrippedReportCreateResponse).isEqualTo(reportCreateResponse)
    }
}
