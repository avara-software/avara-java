// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.models.autoscribe.StudyReportMetadata
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
                        .severity(StudyListResponse.Severity.NORMAL)
                        .studyDescription("Brain MRI with Contrast")
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                        .studyReportStatus(StudyListResponse.StudyReportStatus.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                        .assignedTo(
                            StudyListResponse.AssignedTo.builder()
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
                            StudyListResponse.CreatedByApiKey.builder()
                                .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                                .description("Production API Key")
                                .isViewerEnabled(true)
                                .build()
                        )
                        .createdByUser(
                            StudyListResponse.CreatedByUser.builder()
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
                            StudyListResponse.ExpressCustomer.builder()
                                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                                .expressCustomerName("City Medical Center")
                                .build()
                        )
                        .metadata(
                            StudyListResponse.Metadata.builder()
                                .putAdditionalProperty("department", JsonValue.from("radiology"))
                                .putAdditionalProperty("priority", JsonValue.from("routine"))
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
                    .severity(StudyListResponse.Severity.NORMAL)
                    .studyDescription("Brain MRI with Contrast")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .studyReportStatus(StudyListResponse.StudyReportStatus.IN_PROGRESS)
                    .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                    .assignedTo(
                        StudyListResponse.AssignedTo.builder()
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
                        StudyListResponse.CreatedByApiKey.builder()
                            .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                            .description("Production API Key")
                            .isViewerEnabled(true)
                            .build()
                    )
                    .createdByUser(
                        StudyListResponse.CreatedByUser.builder()
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
                        StudyListResponse.ExpressCustomer.builder()
                            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                            .expressCustomerName("City Medical Center")
                            .build()
                    )
                    .metadata(
                        StudyListResponse.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("priority", JsonValue.from("routine"))
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
                        .severity(StudyListResponse.Severity.NORMAL)
                        .studyDescription("Brain MRI with Contrast")
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                        .studyReportStatus(StudyListResponse.StudyReportStatus.IN_PROGRESS)
                        .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                        .assignedTo(
                            StudyListResponse.AssignedTo.builder()
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
                            StudyListResponse.CreatedByApiKey.builder()
                                .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                                .description("Production API Key")
                                .isViewerEnabled(true)
                                .build()
                        )
                        .createdByUser(
                            StudyListResponse.CreatedByUser.builder()
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
                            StudyListResponse.ExpressCustomer.builder()
                                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                                .expressCustomerName("City Medical Center")
                                .build()
                        )
                        .metadata(
                            StudyListResponse.Metadata.builder()
                                .putAdditionalProperty("department", JsonValue.from("radiology"))
                                .putAdditionalProperty("priority", JsonValue.from("routine"))
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
