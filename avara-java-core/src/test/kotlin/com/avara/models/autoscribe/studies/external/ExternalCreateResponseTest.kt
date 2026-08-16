// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external

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
import com.avara.models.autoscribe.StudyType
import com.avara.models.autoscribe.WeightUnit
import com.avara.models.autoscribe.studies.PriorReport
import com.avara.models.autoscribe.studies.ReportIdWithStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCreateResponseTest {

    @Test
    fun create() {
        val externalCreateResponse =
            ExternalCreateResponse.builder()
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
                    ExternalCreateResponse.Metadata.builder()
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

        assertThat(externalCreateResponse.cancelledAt()).isEmpty
        assertThat(externalCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(externalCreateResponse.isCancelled()).isEqualTo(false)
        assertThat(externalCreateResponse.reportMetadata())
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
        assertThat(externalCreateResponse.severity()).isEqualTo(Severity.NORMAL)
        assertThat(externalCreateResponse.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(externalCreateResponse.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(externalCreateResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(externalCreateResponse.studyReportStatus())
            .isEqualTo(StudyReportStatus.IN_PROGRESS)
        assertThat(externalCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(externalCreateResponse.assignedTo())
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
        assertThat(externalCreateResponse.clinicalHistory()).contains("clinicalHistory")
        assertThat(externalCreateResponse.clinicalIndication()).contains("clinicalIndication")
        assertThat(externalCreateResponse.createdByApiKey())
            .contains(
                ApiKeyReference.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isClinicalContextEnrichmentEnabled(true)
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(externalCreateResponse.createdByUser())
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
        assertThat(externalCreateResponse.expressCustomer())
            .contains(
                ExpressCustomerReference.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .expressCustomerName("City Medical Center")
                    .build()
            )
        assertThat(externalCreateResponse.externalPatientId()).contains("externalPatientId")
        assertThat(externalCreateResponse.externalReportId())
            .contains("ext_1234567890abcdef1234567890abcdef")
        assertThat(externalCreateResponse.isCritical()).contains(true)
        assertThat(externalCreateResponse.metadata())
            .contains(
                ExternalCreateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(externalCreateResponse.modality()).contains("modality")
        assertThat(externalCreateResponse.priorReports().getOrNull())
            .containsExactly(
                PriorReport.builder()
                    .reportText("IMPRESSION: No acute cardiopulmonary process.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Chest without contrast")
                    .build()
            )
        assertThat(externalCreateResponse.reportIds().getOrNull())
            .containsExactly(
                ReportIdWithStatus.builder()
                    .isCritical(null)
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .status(ReportStatus.IN_PROGRESS)
                    .build()
            )
        assertThat(externalCreateResponse.studyType()).contains(StudyType.STANDARD)
        assertThat(externalCreateResponse.technologistNotes().getOrNull()).containsExactly("x")
        assertThat(externalCreateResponse.technologistTechnique()).contains("technologistTechnique")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalCreateResponse =
            ExternalCreateResponse.builder()
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
                    ExternalCreateResponse.Metadata.builder()
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

        val roundtrippedExternalCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalCreateResponse),
                jacksonTypeRef<ExternalCreateResponse>(),
            )

        assertThat(roundtrippedExternalCreateResponse).isEqualTo(externalCreateResponse)
    }
}
