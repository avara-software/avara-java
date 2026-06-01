// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.jsonMapper
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.ReportStatus
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.WeightUnit
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportTest {

    @Test
    fun create() {
        val report =
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

        assertThat(report.createdAt()).contains(OffsetDateTime.parse("2024-03-15T14:30:00Z"))
        assertThat(report.isAddendum()).isEqualTo(false)
        assertThat(report.isCritical()).contains(false)
        assertThat(report.reportId()).isEqualTo("rep_1234567890abcdef1234567890abcdef")
        assertThat(report.signedAt()).contains(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
        assertThat(report.snapshotMetadata())
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
        assertThat(report.status()).isEqualTo(ReportStatus.COMPLETED)
        assertThat(report.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(report.updatedAt()).contains(OffsetDateTime.parse("2024-03-15T16:00:00Z"))
        assertThat(report.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(report.reportPlainText())
            .contains(
                "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val report =
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

        val roundtrippedReport =
            jsonMapper.readValue(jsonMapper.writeValueAsString(report), jacksonTypeRef<Report>())

        assertThat(roundtrippedReport).isEqualTo(report)
    }
}
