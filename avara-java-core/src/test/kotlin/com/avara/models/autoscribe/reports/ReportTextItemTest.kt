// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.jsonMapper
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.WeightUnit
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportTextItemTest {

    @Test
    fun create() {
        val reportTextItem =
            ReportTextItem.builder()
                .reportId("rep_1234567890abcdef1234567890abcdef")
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
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .plainText(
                    "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
                )
                .build()

        assertThat(reportTextItem.reportId()).isEqualTo("rep_1234567890abcdef1234567890abcdef")
        assertThat(reportTextItem.snapshotMetadata())
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
        assertThat(reportTextItem.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(reportTextItem.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(reportTextItem.plainText())
            .contains(
                "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportTextItem =
            ReportTextItem.builder()
                .reportId("rep_1234567890abcdef1234567890abcdef")
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
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .plainText(
                    "FINDINGS: Normal brain MRI. No acute intracranial abnormality. IMPRESSION: Unremarkable brain MRI."
                )
                .build()

        val roundtrippedReportTextItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportTextItem),
                jacksonTypeRef<ReportTextItem>(),
            )

        assertThat(roundtrippedReportTextItem).isEqualTo(reportTextItem)
    }
}
