// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.ApiKeyReference
import com.avarasoftware.models.ExpressCustomerReference
import com.avarasoftware.models.Severity
import com.avarasoftware.models.UserReference
import com.avarasoftware.models.autoscribe.HeightUnit
import com.avarasoftware.models.autoscribe.ReportStatus
import com.avarasoftware.models.autoscribe.Sex
import com.avarasoftware.models.autoscribe.StudyReportMetadata
import com.avarasoftware.models.autoscribe.StudyReportStatus
import com.avarasoftware.models.autoscribe.StudyType
import com.avarasoftware.models.autoscribe.WeightUnit
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyRetrieveResponseTest {

    @Test
    fun create() {
        val studyRetrieveResponse =
            StudyRetrieveResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .reportMetadata(
                    StudyReportMetadata.builder()
                        .age("38 years")
                        .dateOfBirth("1985-07-20")
                        .facilityName("City Medical Center")
                        .height(
                            StudyReportMetadata.Height.builder()
                                .unit(HeightUnit.CM)
                                .value(165.0)
                                .build()
                        )
                        .mrn("MRN-2024-001234")
                        .patientName("Jane Doe")
                        .procedure("MRI Brain with Contrast")
                        .referringPhysicianName("Dr. Michael Chen")
                        .sex(Sex.FEMALE)
                        .studyDate("2024-03-15")
                        .studyTime("14:30")
                        .weight(
                            StudyReportMetadata.Weight.builder()
                                .unit(WeightUnit.KG)
                                .value(62.0)
                                .build()
                        )
                        .build()
                )
                .severity(Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyReportStatus(StudyReportStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .clinicalHistory("clinicalHistory")
                .clinicalIndication("clinicalIndication")
                .createdByApiKey(
                    ApiKeyReference.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isClinicalContextEnrichmentEnabled(true)
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .expressCustomer(
                    ExpressCustomerReference.builder()
                        .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                        .expressCustomerName("City Medical Center")
                        .build()
                )
                .externalPatientId("externalPatientId")
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .isCritical(true)
                .metadata(
                    StudyRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .modality("modality")
                .addPriorReport(
                    PriorReport.builder()
                        .reportText("IMPRESSION: No acute cardiopulmonary process.")
                        .externalStudyId("EXT-2024-001")
                        .modality("CT")
                        .studyDate("2024-01-15")
                        .studyDescription("CT Chest without contrast")
                        .build()
                )
                .addReportId(
                    ReportIdWithStatus.builder()
                        .isCritical(null)
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .status(ReportStatus.IN_PROGRESS)
                        .build()
                )
                .studyType(StudyType.STANDARD)
                .addTechnologistNote("x")
                .technologistTechnique("technologistTechnique")
                .build()

        assertThat(studyRetrieveResponse.cancelledAt()).isEmpty
        assertThat(studyRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(studyRetrieveResponse.isCancelled()).isEqualTo(false)
        assertThat(studyRetrieveResponse.reportMetadata())
            .isEqualTo(
                StudyReportMetadata.builder()
                    .age("38 years")
                    .dateOfBirth("1985-07-20")
                    .facilityName("City Medical Center")
                    .height(
                        StudyReportMetadata.Height.builder()
                            .unit(HeightUnit.CM)
                            .value(165.0)
                            .build()
                    )
                    .mrn("MRN-2024-001234")
                    .patientName("Jane Doe")
                    .procedure("MRI Brain with Contrast")
                    .referringPhysicianName("Dr. Michael Chen")
                    .sex(Sex.FEMALE)
                    .studyDate("2024-03-15")
                    .studyTime("14:30")
                    .weight(
                        StudyReportMetadata.Weight.builder().unit(WeightUnit.KG).value(62.0).build()
                    )
                    .build()
            )
        assertThat(studyRetrieveResponse.severity()).isEqualTo(Severity.NORMAL)
        assertThat(studyRetrieveResponse.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(studyRetrieveResponse.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyRetrieveResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(studyRetrieveResponse.studyReportStatus())
            .isEqualTo(StudyReportStatus.IN_PROGRESS)
        assertThat(studyRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(studyRetrieveResponse.assignedTo())
            .contains(
                UserReference.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyRetrieveResponse.clinicalHistory()).contains("clinicalHistory")
        assertThat(studyRetrieveResponse.clinicalIndication()).contains("clinicalIndication")
        assertThat(studyRetrieveResponse.createdByApiKey())
            .contains(
                ApiKeyReference.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isClinicalContextEnrichmentEnabled(true)
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(studyRetrieveResponse.createdByUser())
            .contains(
                UserReference.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyRetrieveResponse.expressCustomer())
            .contains(
                ExpressCustomerReference.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .expressCustomerName("City Medical Center")
                    .build()
            )
        assertThat(studyRetrieveResponse.externalPatientId()).contains("externalPatientId")
        assertThat(studyRetrieveResponse.externalReportId())
            .contains("ext_1234567890abcdef1234567890abcdef")
        assertThat(studyRetrieveResponse.isCritical()).contains(true)
        assertThat(studyRetrieveResponse.metadata())
            .contains(
                StudyRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(studyRetrieveResponse.modality()).contains("modality")
        assertThat(studyRetrieveResponse.priorReports().getOrNull())
            .containsExactly(
                PriorReport.builder()
                    .reportText("IMPRESSION: No acute cardiopulmonary process.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Chest without contrast")
                    .build()
            )
        assertThat(studyRetrieveResponse.reportIds().getOrNull())
            .containsExactly(
                ReportIdWithStatus.builder()
                    .isCritical(null)
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .status(ReportStatus.IN_PROGRESS)
                    .build()
            )
        assertThat(studyRetrieveResponse.studyType()).contains(StudyType.STANDARD)
        assertThat(studyRetrieveResponse.technologistNotes().getOrNull()).containsExactly("x")
        assertThat(studyRetrieveResponse.technologistTechnique()).contains("technologistTechnique")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyRetrieveResponse =
            StudyRetrieveResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .reportMetadata(
                    StudyReportMetadata.builder()
                        .age("38 years")
                        .dateOfBirth("1985-07-20")
                        .facilityName("City Medical Center")
                        .height(
                            StudyReportMetadata.Height.builder()
                                .unit(HeightUnit.CM)
                                .value(165.0)
                                .build()
                        )
                        .mrn("MRN-2024-001234")
                        .patientName("Jane Doe")
                        .procedure("MRI Brain with Contrast")
                        .referringPhysicianName("Dr. Michael Chen")
                        .sex(Sex.FEMALE)
                        .studyDate("2024-03-15")
                        .studyTime("14:30")
                        .weight(
                            StudyReportMetadata.Weight.builder()
                                .unit(WeightUnit.KG)
                                .value(62.0)
                                .build()
                        )
                        .build()
                )
                .severity(Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyReportStatus(StudyReportStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .clinicalHistory("clinicalHistory")
                .clinicalIndication("clinicalIndication")
                .createdByApiKey(
                    ApiKeyReference.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isClinicalContextEnrichmentEnabled(true)
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .expressCustomer(
                    ExpressCustomerReference.builder()
                        .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                        .expressCustomerName("City Medical Center")
                        .build()
                )
                .externalPatientId("externalPatientId")
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .isCritical(true)
                .metadata(
                    StudyRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .modality("modality")
                .addPriorReport(
                    PriorReport.builder()
                        .reportText("IMPRESSION: No acute cardiopulmonary process.")
                        .externalStudyId("EXT-2024-001")
                        .modality("CT")
                        .studyDate("2024-01-15")
                        .studyDescription("CT Chest without contrast")
                        .build()
                )
                .addReportId(
                    ReportIdWithStatus.builder()
                        .isCritical(null)
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .status(ReportStatus.IN_PROGRESS)
                        .build()
                )
                .studyType(StudyType.STANDARD)
                .addTechnologistNote("x")
                .technologistTechnique("technologistTechnique")
                .build()

        val roundtrippedStudyRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyRetrieveResponse),
                jacksonTypeRef<StudyRetrieveResponse>(),
            )

        assertThat(roundtrippedStudyRetrieveResponse).isEqualTo(studyRetrieveResponse)
    }
}
