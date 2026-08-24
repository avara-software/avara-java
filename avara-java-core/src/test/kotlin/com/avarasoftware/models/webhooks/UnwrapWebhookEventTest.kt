// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnwrapWebhookEventTest {

    @Test
    fun ofEphemeralAccessRequested() {
        val ephemeralAccessRequested =
            EphemeralAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    EphemeralAccessRequestedEventData.builder()
                        .retrievalId("order-12345")
                        .options(
                            EphemeralAccessRequestedEventData.Options.builder()
                                .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofEphemeralAccessRequested(ephemeralAccessRequested)

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).contains(ephemeralAccessRequested)
        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofEphemeralAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofEphemeralAccessRequested(
                EphemeralAccessRequestedEvent.builder()
                    .id("whe_1234567890abcdef1234567890abcdef")
                    .data(
                        EphemeralAccessRequestedEventData.builder()
                            .retrievalId("order-12345")
                            .options(
                                EphemeralAccessRequestedEventData.Options.builder()
                                    .putAdditionalProperty(
                                        "studyInstanceUids",
                                        JsonValue.from("bar"),
                                    )
                                    .build()
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

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.studyAccessRequested()).contains(studyAccessRequested)
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
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
                        .isCritical(false)
                        .presignedUrl(
                            "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789"
                        )
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .externalPatientId("EHR-999")
                        .plainText(
                            "FINDINGS: Normal brain MRI. No acute intracranial abnormality..."
                        )
                        .build()
                )
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofReportDelivered(reportDelivered)

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).contains(reportDelivered)
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
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
                            .isCritical(false)
                            .presignedUrl(
                                "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=xyz789"
                            )
                            .reportId("rep_1234567890abcdef1234567890abcdef")
                            .studyId("stu_1234567890abcdef1234567890abcdef")
                            .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                            .externalPatientId("EHR-999")
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

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSecondaryCaptureAccessRequested(secondaryCaptureAccessRequested)

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested())
            .contains(secondaryCaptureAccessRequested)
        assertThat(unwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofSecondaryCaptureAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSecondaryCaptureAccessRequested(
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

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
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

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofModalityWorklistRequested(modalityWorklistRequested)

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.modalityWorklistRequested())
            .contains(modalityWorklistRequested)
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofModalityWorklistRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofModalityWorklistRequested(
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

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
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

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofPatientStudyEnrichmentRequested(patientStudyEnrichmentRequested)

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested())
            .contains(patientStudyEnrichmentRequested)
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofPatientStudyEnrichmentRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofPatientStudyEnrichmentRequested(
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

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
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

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofClinicalContextEnrichmentRequested(
                clinicalContextEnrichmentRequested
            )

        assertThat(unwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unwrapWebhookEvent.clinicalContextEnrichmentRequested())
            .contains(clinicalContextEnrichmentRequested)
    }

    @Test
    fun ofClinicalContextEnrichmentRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofClinicalContextEnrichmentRequested(
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
