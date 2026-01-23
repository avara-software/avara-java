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

internal class StudyCreateResponseTest {

    @Test
    fun create() {
        val studyCreateResponse =
            StudyCreateResponse.builder()
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
                .severity(StudyCreateResponse.Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyReportStatus(StudyCreateResponse.StudyReportStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    StudyCreateResponse.AssignedTo.builder()
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
                    StudyCreateResponse.CreatedByApiKey.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    StudyCreateResponse.CreatedByUser.builder()
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
                    StudyCreateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .org(
                    StudyCreateResponse.Org.builder()
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

        assertThat(studyCreateResponse.cancelledAt()).isEmpty
        assertThat(studyCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(studyCreateResponse.isCancelled()).isEqualTo(false)
        assertThat(studyCreateResponse.reportMetadata())
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
        assertThat(studyCreateResponse.severity()).isEqualTo(StudyCreateResponse.Severity.NORMAL)
        assertThat(studyCreateResponse.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(studyCreateResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyCreateResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(studyCreateResponse.studyReportStatus())
            .isEqualTo(StudyCreateResponse.StudyReportStatus.IN_PROGRESS)
        assertThat(studyCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(studyCreateResponse.assignedTo())
            .contains(
                StudyCreateResponse.AssignedTo.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyCreateResponse.createdByApiKey())
            .contains(
                StudyCreateResponse.CreatedByApiKey.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(studyCreateResponse.createdByUser())
            .contains(
                StudyCreateResponse.CreatedByUser.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyCreateResponse.metadata())
            .contains(
                StudyCreateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(studyCreateResponse.org())
            .contains(
                StudyCreateResponse.Org.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .orgName("City Medical Center")
                    .build()
            )
        assertThat(studyCreateResponse.priorReportTexts().getOrNull())
            .containsExactly("Previous imaging shows stable findings.")
        assertThat(studyCreateResponse.priorStudyIds().getOrNull())
            .containsExactly("stu_abcdef1234567890abcdef1234567890")
        assertThat(studyCreateResponse.reportIds().getOrNull())
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
        val studyCreateResponse =
            StudyCreateResponse.builder()
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
                .severity(StudyCreateResponse.Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyReportStatus(StudyCreateResponse.StudyReportStatus.IN_PROGRESS)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    StudyCreateResponse.AssignedTo.builder()
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
                    StudyCreateResponse.CreatedByApiKey.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    StudyCreateResponse.CreatedByUser.builder()
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
                    StudyCreateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .org(
                    StudyCreateResponse.Org.builder()
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

        val roundtrippedStudyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyCreateResponse),
                jacksonTypeRef<StudyCreateResponse>(),
            )

        assertThat(roundtrippedStudyCreateResponse).isEqualTo(studyCreateResponse)
    }
}
