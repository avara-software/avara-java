// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.jsonMapper
import com.avara.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListResponseTest {

    @Test
    fun create() {
        val reportListResponse =
            ReportListResponse.builder()
                .addReport(
                    ReportListResponse.Report.builder()
                        .createdAt(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
                        .isAddendum(false)
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .signedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                        .snapshotMetadata(
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
                        .status(ReportListResponse.Report.Status.COMPLETED)
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .updatedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .reportPlainText(
                            "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
                        )
                        .build()
                )
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        assertThat(reportListResponse.reports())
            .containsExactly(
                ReportListResponse.Report.builder()
                    .createdAt(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
                    .isAddendum(false)
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .signedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                    .snapshotMetadata(
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
                    .status(ReportListResponse.Report.Status.COMPLETED)
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .updatedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .reportPlainText(
                        "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
                    )
                    .build()
            )
        assertThat(reportListResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(reportListResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportListResponse =
            ReportListResponse.builder()
                .addReport(
                    ReportListResponse.Report.builder()
                        .createdAt(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
                        .isAddendum(false)
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .signedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                        .snapshotMetadata(
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
                        .status(ReportListResponse.Report.Status.COMPLETED)
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .updatedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .reportPlainText(
                            "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
                        )
                        .build()
                )
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val roundtrippedReportListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportListResponse),
                jacksonTypeRef<ReportListResponse>(),
            )

        assertThat(roundtrippedReportListResponse).isEqualTo(reportListResponse)
    }
}
