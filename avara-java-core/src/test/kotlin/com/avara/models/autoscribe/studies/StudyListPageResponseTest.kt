// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.models.ApiKeyReference
import com.avara.models.ExpressCustomerReference
import com.avara.models.Severity
import com.avara.models.UserReference
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.ReportStatus
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.StudyReportStatus
import com.avara.models.autoscribe.WeightUnit
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyListPageResponseTest {

    @Test
    fun create() {
        val studyListPageResponse =
            StudyListPageResponse.builder()
                .hasMore(true)
                .addStudy(
                    StudyListResponse.builder()
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
                        .metadata(
                            StudyListResponse.Metadata.builder()
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
                                .reportId("rep_1234567890abcdef1234567890abcdef")
                                .status(ReportStatus.IN_PROGRESS)
                                .build()
                        )
                        .addTechnologistNote("x")
                        .technologistTechnique("technologistTechnique")
                        .build()
                )
                .cursor("cursor")
                .build()

        assertThat(studyListPageResponse.hasMore()).isEqualTo(true)
        assertThat(studyListPageResponse.studies())
            .containsExactly(
                StudyListResponse.builder()
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
                    .metadata(
                        StudyListResponse.Metadata.builder()
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
                            .reportId("rep_1234567890abcdef1234567890abcdef")
                            .status(ReportStatus.IN_PROGRESS)
                            .build()
                    )
                    .addTechnologistNote("x")
                    .technologistTechnique("technologistTechnique")
                    .build()
            )
        assertThat(studyListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyListPageResponse =
            StudyListPageResponse.builder()
                .hasMore(true)
                .addStudy(
                    StudyListResponse.builder()
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
                        .metadata(
                            StudyListResponse.Metadata.builder()
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
                                .reportId("rep_1234567890abcdef1234567890abcdef")
                                .status(ReportStatus.IN_PROGRESS)
                                .build()
                        )
                        .addTechnologistNote("x")
                        .technologistTechnique("technologistTechnique")
                        .build()
                )
                .cursor("cursor")
                .build()

        val roundtrippedStudyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyListPageResponse),
                jacksonTypeRef<StudyListPageResponse>(),
            )

        assertThat(roundtrippedStudyListPageResponse).isEqualTo(studyListPageResponse)
    }
}
