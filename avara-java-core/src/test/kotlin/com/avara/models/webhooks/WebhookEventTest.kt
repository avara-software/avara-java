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
        assertThat(webhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(webhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(webhookEvent.clinicalContextEnrichmentRequested()).isEmpty
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
        assertThat(webhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(webhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(webhookEvent.clinicalContextEnrichmentRequested()).isEmpty
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
            SecondaryCaptureAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    SecondaryCaptureAccessRequestedEventData.builder()
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
        assertThat(webhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(webhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(webhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofSecondaryCaptureAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofSecondaryCaptureAccessRequested(
                SecondaryCaptureAccessRequestedEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        SecondaryCaptureAccessRequestedEventData.builder()
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

    @Test
    fun ofModalityWorklistRequested() {
        val modalityWorklistRequested =
            ModalityWorklistRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ModalityWorklistRequestedEventData.builder()
                        .callingAe("CT_SCANNER_01")
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .dateEnd("2026-08-13")
                        .dateStart("2026-08-13")
                        .sourceIp("10.0.0.25")
                        .modality("CT")
                        .build()
                )
                .build()

        val webhookEvent = WebhookEvent.ofModalityWorklistRequested(modalityWorklistRequested)

        assertThat(webhookEvent.studyAccessRequested()).isEmpty
        assertThat(webhookEvent.reportDelivered()).isEmpty
        assertThat(webhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(webhookEvent.modalityWorklistRequested()).contains(modalityWorklistRequested)
        assertThat(webhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(webhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofModalityWorklistRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofModalityWorklistRequested(
                ModalityWorklistRequestedEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        ModalityWorklistRequestedEventData.builder()
                            .callingAe("CT_SCANNER_01")
                            .clinicId("123e4567-e89b-12d3-a456-426614174000")
                            .dateEnd("2026-08-13")
                            .dateStart("2026-08-13")
                            .sourceIp("10.0.0.25")
                            .modality("CT")
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
    fun ofPatientStudyEnrichmentRequested() {
        val patientStudyEnrichmentRequested =
            PatientStudyEnrichmentRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    PatientStudyEnrichmentRequestedEventData.builder()
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .accessionNumber("ACC-98765")
                        .patientId("MRN-12345")
                        .build()
                )
                .build()

        val webhookEvent =
            WebhookEvent.ofPatientStudyEnrichmentRequested(patientStudyEnrichmentRequested)

        assertThat(webhookEvent.studyAccessRequested()).isEmpty
        assertThat(webhookEvent.reportDelivered()).isEmpty
        assertThat(webhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(webhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(webhookEvent.patientStudyEnrichmentRequested())
            .contains(patientStudyEnrichmentRequested)
        assertThat(webhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofPatientStudyEnrichmentRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofPatientStudyEnrichmentRequested(
                PatientStudyEnrichmentRequestedEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        PatientStudyEnrichmentRequestedEventData.builder()
                            .clinicId("123e4567-e89b-12d3-a456-426614174000")
                            .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                            .accessionNumber("ACC-98765")
                            .patientId("MRN-12345")
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
    fun ofClinicalContextEnrichmentRequested() {
        val clinicalContextEnrichmentRequested =
            ClinicalContextEnrichmentRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    ClinicalContextEnrichmentRequestedEventData.builder()
                        .clinicId("123e4567-e89b-12d3-a456-426614174000")
                        .studyId("123e4567-e89b-12d3-a456-426614174111")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .externalPatientId("EHR-999")
                        .mrn("MRN-12345")
                        .build()
                )
                .build()

        val webhookEvent =
            WebhookEvent.ofClinicalContextEnrichmentRequested(clinicalContextEnrichmentRequested)

        assertThat(webhookEvent.studyAccessRequested()).isEmpty
        assertThat(webhookEvent.reportDelivered()).isEmpty
        assertThat(webhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(webhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(webhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(webhookEvent.clinicalContextEnrichmentRequested())
            .contains(clinicalContextEnrichmentRequested)
    }

    @Test
    fun ofClinicalContextEnrichmentRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEvent =
            WebhookEvent.ofClinicalContextEnrichmentRequested(
                ClinicalContextEnrichmentRequestedEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        ClinicalContextEnrichmentRequestedEventData.builder()
                            .clinicId("123e4567-e89b-12d3-a456-426614174000")
                            .studyId("123e4567-e89b-12d3-a456-426614174111")
                            .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                            .externalPatientId("EHR-999")
                            .mrn("MRN-12345")
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
