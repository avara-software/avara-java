// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.reports

import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.autoscribe.HeightUnit
import com.avarasoftware.models.autoscribe.ReportStatus
import com.avarasoftware.models.autoscribe.Sex
import com.avarasoftware.models.autoscribe.StudyReportMetadata
import com.avarasoftware.models.autoscribe.WeightUnit
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
                    Report.builder()
                        .createdAt(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
                        .isAddendum(false)
                        .isCritical(false)
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .signedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                        .snapshotMetadata(
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
                        .status(ReportStatus.COMPLETED)
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
                Report.builder()
                    .createdAt(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
                    .isAddendum(false)
                    .isCritical(false)
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .signedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                    .snapshotMetadata(
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
                    .status(ReportStatus.COMPLETED)
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
                    Report.builder()
                        .createdAt(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
                        .isAddendum(false)
                        .isCritical(false)
                        .reportId("rep_1234567890abcdef1234567890abcdef")
                        .signedAt(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
                        .snapshotMetadata(
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
                        .status(ReportStatus.COMPLETED)
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
