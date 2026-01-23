// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyUpdateResponseTest {

    @Test
    fun create() {
        val studyUpdateResponse =
            StudyUpdateResponse.builder()
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
                                .unit(StudyReportMetadata.Height.Unit.CM)
                                .value(165.0)
                                .build()
                        )
                        .mrn("MRN-2024-001234")
                        .patientName("Jane Doe")
                        .referringPhysicianName("Dr. Michael Chen")
                        .scanDate("2024-03-15")
                        .scanTime("14:30")
                        .scanType("MRI Brain with Contrast")
                        .sex(StudyReportMetadata.Sex.FEMALE)
                        .weight(
                            StudyReportMetadata.Weight.builder()
                                .unit(StudyReportMetadata.Weight.Unit.KG)
                                .value(62.0)
                                .build()
                        )
                        .build()
                )
                .severity(StudyUpdateResponse.Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyReportStatus(StudyUpdateResponse.StudyReportStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    StudyUpdateResponse.AssignedTo.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .createdByApiKey(
                    StudyUpdateResponse.CreatedByApiKey.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    StudyUpdateResponse.CreatedByUser.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .metadata(
                    StudyUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .org(
                    StudyUpdateResponse.Org.builder()
                        .orgId("org_1234567890abcdef1234567890abcdef")
                        .orgName("City Medical Center")
                        .build()
                )
                .addPriorReportText("Previous imaging shows stable findings.")
                .addPriorStudyId("stu_abcdef1234567890abcdef1234567890")
                .addReportId(
                    ReportIdWithStatus.builder()
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .status(ReportIdWithStatus.Status.IN_PROGRESS)
                        .build()
                )
                .build()

        assertThat(studyUpdateResponse.cancelledAt()).isEmpty
        assertThat(studyUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(studyUpdateResponse.isCancelled()).isEqualTo(false)
        assertThat(studyUpdateResponse.reportMetadata())
            .isEqualTo(
                StudyReportMetadata.builder()
                    .age("38 years")
                    .dateOfBirth("1985-07-20")
                    .facilityName("City Medical Center")
                    .height(
                        StudyReportMetadata.Height.builder()
                            .unit(StudyReportMetadata.Height.Unit.CM)
                            .value(165.0)
                            .build()
                    )
                    .mrn("MRN-2024-001234")
                    .patientName("Jane Doe")
                    .referringPhysicianName("Dr. Michael Chen")
                    .scanDate("2024-03-15")
                    .scanTime("14:30")
                    .scanType("MRI Brain with Contrast")
                    .sex(StudyReportMetadata.Sex.FEMALE)
                    .weight(
                        StudyReportMetadata.Weight.builder()
                            .unit(StudyReportMetadata.Weight.Unit.KG)
                            .value(62.0)
                            .build()
                    )
                    .build()
            )
        assertThat(studyUpdateResponse.severity()).isEqualTo(StudyUpdateResponse.Severity.NORMAL)
        assertThat(studyUpdateResponse.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(studyUpdateResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyUpdateResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(studyUpdateResponse.studyReportStatus())
            .isEqualTo(StudyUpdateResponse.StudyReportStatus.IN_PROGRESS)
        assertThat(studyUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(studyUpdateResponse.assignedTo())
            .contains(
                StudyUpdateResponse.AssignedTo.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyUpdateResponse.createdByApiKey())
            .contains(
                StudyUpdateResponse.CreatedByApiKey.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(studyUpdateResponse.createdByUser())
            .contains(
                StudyUpdateResponse.CreatedByUser.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyUpdateResponse.metadata())
            .contains(
                StudyUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(studyUpdateResponse.org())
            .contains(
                StudyUpdateResponse.Org.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .orgName("City Medical Center")
                    .build()
            )
        assertThat(studyUpdateResponse.priorReportTexts().getOrNull())
            .containsExactly("Previous imaging shows stable findings.")
        assertThat(studyUpdateResponse.priorStudyIds().getOrNull())
            .containsExactly("stu_abcdef1234567890abcdef1234567890")
        assertThat(studyUpdateResponse.reportIds().getOrNull())
            .containsExactly(
                ReportIdWithStatus.builder()
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .status(ReportIdWithStatus.Status.IN_PROGRESS)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyUpdateResponse =
            StudyUpdateResponse.builder()
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
                                .unit(StudyReportMetadata.Height.Unit.CM)
                                .value(165.0)
                                .build()
                        )
                        .mrn("MRN-2024-001234")
                        .patientName("Jane Doe")
                        .referringPhysicianName("Dr. Michael Chen")
                        .scanDate("2024-03-15")
                        .scanTime("14:30")
                        .scanType("MRI Brain with Contrast")
                        .sex(StudyReportMetadata.Sex.FEMALE)
                        .weight(
                            StudyReportMetadata.Weight.builder()
                                .unit(StudyReportMetadata.Weight.Unit.KG)
                                .value(62.0)
                                .build()
                        )
                        .build()
                )
                .severity(StudyUpdateResponse.Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyReportStatus(StudyUpdateResponse.StudyReportStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    StudyUpdateResponse.AssignedTo.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .createdByApiKey(
                    StudyUpdateResponse.CreatedByApiKey.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    StudyUpdateResponse.CreatedByUser.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .metadata(
                    StudyUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .org(
                    StudyUpdateResponse.Org.builder()
                        .orgId("org_1234567890abcdef1234567890abcdef")
                        .orgName("City Medical Center")
                        .build()
                )
                .addPriorReportText("Previous imaging shows stable findings.")
                .addPriorStudyId("stu_abcdef1234567890abcdef1234567890")
                .addReportId(
                    ReportIdWithStatus.builder()
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .status(ReportIdWithStatus.Status.IN_PROGRESS)
                        .build()
                )
                .build()

        val roundtrippedStudyUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyUpdateResponse),
                jacksonTypeRef<StudyUpdateResponse>(),
            )

        assertThat(roundtrippedStudyUpdateResponse).isEqualTo(studyUpdateResponse)
    }
}
