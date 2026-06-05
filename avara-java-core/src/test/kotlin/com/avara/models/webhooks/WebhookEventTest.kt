// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class WebhookEventTest {

    @Test
    fun ofStudyAccessRequested() {
        val studyAccessRequested =
            StudyAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    StudyAccessRequestedEventData.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .build()
                )
                .build()

        val webhookEvent = WebhookEvent.ofStudyAccessRequested(studyAccessRequested)

        assertThat(webhookEvent.studyAccessRequested()).contains(studyAccessRequested)
        assertThat(webhookEvent.reportDelivered()).isEmpty
        assertThat(webhookEvent.secondaryCaptureAccessRequested()).isEmpty
    }

    @Test
    fun ofStudyAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofStudyAccessRequested(
                StudyAccessRequestedEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        StudyAccessRequestedEventData.builder()
                            .studyId("stu_1234567890abcdef1234567890abcdef")
                            .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                            .build()
                    )
                    .build()
            )

        val roundtrippedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEvent),
                jacksonTypeRef<WebhookEvent>(),
            )

        assertThat(roundtrippedWebhookEvent).isEqualTo(webhookEvent)
    }

    @Test
    fun ofReportDelivered() {
        val reportDelivered =
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

        val webhookEvent = WebhookEvent.ofReportDelivered(reportDelivered)

        assertThat(webhookEvent.studyAccessRequested()).isEmpty
        assertThat(webhookEvent.reportDelivered()).contains(reportDelivered)
        assertThat(webhookEvent.secondaryCaptureAccessRequested()).isEmpty
    }

    @Test
    fun ofReportDeliveredRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofReportDelivered(
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
            )

        val roundtrippedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEvent),
                jacksonTypeRef<WebhookEvent>(),
            )

        assertThat(roundtrippedWebhookEvent).isEqualTo(webhookEvent)
    }

    @Test
    fun ofSecondaryCaptureAccessRequested() {
        val secondaryCaptureAccessRequested =
            WebhookEvent.SecondaryCaptureAccessRequested.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    WebhookEvent.SecondaryCaptureAccessRequested.Data.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                        .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                        .build()
                )
                .build()

        val webhookEvent =
            WebhookEvent.ofSecondaryCaptureAccessRequested(secondaryCaptureAccessRequested)

        assertThat(webhookEvent.studyAccessRequested()).isEmpty
        assertThat(webhookEvent.reportDelivered()).isEmpty
        assertThat(webhookEvent.secondaryCaptureAccessRequested())
            .contains(secondaryCaptureAccessRequested)
    }

    @Test
    fun ofSecondaryCaptureAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofSecondaryCaptureAccessRequested(
                WebhookEvent.SecondaryCaptureAccessRequested.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        WebhookEvent.SecondaryCaptureAccessRequested.Data.builder()
                            .studyId("stu_1234567890abcdef1234567890abcdef")
                            .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                            .seriesInstanceUid("1.2.840.113619.2.55.3.1234567890.1")
                            .sopInstanceUid("1.2.840.113619.2.55.3.1234567890.1.1")
                            .build()
                    )
                    .build()
            )

        val roundtrippedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEvent),
                jacksonTypeRef<WebhookEvent>(),
            )

        assertThat(roundtrippedWebhookEvent).isEqualTo(webhookEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val webhookEvent = jsonMapper().convertValue(testCase.value, jacksonTypeRef<WebhookEvent>())

        val e = assertThrows<AvaraInvalidDataException> { webhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
