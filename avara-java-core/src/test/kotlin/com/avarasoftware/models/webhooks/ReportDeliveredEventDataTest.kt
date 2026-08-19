// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportDeliveredEventDataTest {

    @Test
    fun create() {
        val reportDeliveredEventData =
            ReportDeliveredEventData.builder()
                .isCritical(false)
                .presignedUrl("https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789")
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .plainText("FINDINGS: Normal brain MRI. No acute intracranial abnormality...")
                .build()

        assertThat(reportDeliveredEventData.isCritical()).isEqualTo(false)
        assertThat(reportDeliveredEventData.presignedUrl())
            .isEqualTo("https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789")
        assertThat(reportDeliveredEventData.reportId())
            .isEqualTo("rep_1234567890abcdef1234567890abcdef")
        assertThat(reportDeliveredEventData.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(reportDeliveredEventData.plainText())
            .contains("FINDINGS: Normal brain MRI. No acute intracranial abnormality...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportDeliveredEventData =
            ReportDeliveredEventData.builder()
                .isCritical(false)
                .presignedUrl("https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789")
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .plainText("FINDINGS: Normal brain MRI. No acute intracranial abnormality...")
                .build()

        val roundtrippedReportDeliveredEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportDeliveredEventData),
                jacksonTypeRef<ReportDeliveredEventData>(),
            )

        assertThat(roundtrippedReportDeliveredEventData).isEqualTo(reportDeliveredEventData)
    }
}
