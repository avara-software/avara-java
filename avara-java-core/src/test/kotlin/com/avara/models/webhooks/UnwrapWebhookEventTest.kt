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

internal class UnwrapWebhookEventTest {

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

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofStudyAccessRequested(studyAccessRequested)

        assertThat(unwrapWebhookEvent.studyAccessRequested()).contains(studyAccessRequested)
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
    }

    @Test
    fun ofStudyAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofStudyAccessRequested(
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

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofReportDelivered() {
        val reportDelivered =
            ReportDeliveredEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ReportDeliveredEventData.builder()
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

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofReportDelivered(reportDelivered)

        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).contains(reportDelivered)
    }

    @Test
    fun ofReportDeliveredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofReportDelivered(
                ReportDeliveredEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        ReportDeliveredEventData.builder()
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

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
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
        val unwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnwrapWebhookEvent>())

        val e = assertThrows<AvaraInvalidDataException> { unwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
