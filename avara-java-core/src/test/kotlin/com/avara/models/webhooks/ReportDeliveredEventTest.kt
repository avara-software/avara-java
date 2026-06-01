// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportDeliveredEventTest {

    @Test
    fun create() {
        val reportDeliveredEvent =
            ReportDeliveredEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ReportDeliveredEventData.builder()
                        .isCritical(false)
                        .presignedUrl(
                            "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789"
                        )
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .plainText(
                            "FINDINGS: Normal brain MRI. No acute intracranial abnormality..."
                        )
                        .build()
                )
                .build()

        assertThat(reportDeliveredEvent.id()).isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(reportDeliveredEvent.data())
            .isEqualTo(
                ReportDeliveredEventData.builder()
                    .isCritical(false)
                    .presignedUrl(
                        "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789"
                    )
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .plainText("FINDINGS: Normal brain MRI. No acute intracranial abnormality...")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportDeliveredEvent =
            ReportDeliveredEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ReportDeliveredEventData.builder()
                        .isCritical(false)
                        .presignedUrl(
                            "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789"
                        )
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .plainText(
                            "FINDINGS: Normal brain MRI. No acute intracranial abnormality..."
                        )
                        .build()
                )
                .build()

        val roundtrippedReportDeliveredEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportDeliveredEvent),
                jacksonTypeRef<ReportDeliveredEvent>(),
            )

        assertThat(roundtrippedReportDeliveredEvent).isEqualTo(reportDeliveredEvent)
    }
}
