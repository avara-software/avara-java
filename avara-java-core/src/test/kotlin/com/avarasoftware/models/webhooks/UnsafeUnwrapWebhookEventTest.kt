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

internal class UnsafeUnwrapWebhookEventTest {

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

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofEphemeralAccessRequested(ephemeralAccessRequested)

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested())
            .contains(ephemeralAccessRequested)
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofEphemeralAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofEphemeralAccessRequested(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofStudyAccessRequested(studyAccessRequested)

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).contains(studyAccessRequested)
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofStudyAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofStudyAccessRequested(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofReportDelivered(reportDelivered)

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).contains(reportDelivered)
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofReportDeliveredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofReportDelivered(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSecondaryCaptureAccessRequested(
                secondaryCaptureAccessRequested
            )

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested())
            .contains(secondaryCaptureAccessRequested)
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofSecondaryCaptureAccessRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSecondaryCaptureAccessRequested(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofModalityWorklistRequested(modalityWorklistRequested)

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested())
            .contains(modalityWorklistRequested)
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofModalityWorklistRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofModalityWorklistRequested(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPatientStudyEnrichmentRequested(
                patientStudyEnrichmentRequested
            )

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested())
            .contains(patientStudyEnrichmentRequested)
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested()).isEmpty
    }

    @Test
    fun ofPatientStudyEnrichmentRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPatientStudyEnrichmentRequested(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofClinicalContextEnrichmentRequested(
                clinicalContextEnrichmentRequested
            )

        assertThat(unsafeUnwrapWebhookEvent.ephemeralAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.studyAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.reportDelivered()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.secondaryCaptureAccessRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.modalityWorklistRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.patientStudyEnrichmentRequested()).isEmpty
        assertThat(unsafeUnwrapWebhookEvent.clinicalContextEnrichmentRequested())
            .contains(clinicalContextEnrichmentRequested)
    }

    @Test
    fun ofClinicalContextEnrichmentRequestedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofClinicalContextEnrichmentRequested(
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

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
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
        val unsafeUnwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

        val e = assertThrows<AvaraInvalidDataException> { unsafeUnwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
