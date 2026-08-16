// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

import com.avara.core.jsonMapper
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.WeightUnit
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportRetrieveResponseTest {

    @Test
    fun create() {
        val reportRetrieveResponse =
            ReportRetrieveResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .presignedUrl("https://viewer.avarasoftware.com/study/stu_1234")
                .readerName("readerName")
                .reportText("reportText")
                .signedAt("signedAt")
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
                .build()

        assertThat(reportRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(reportRetrieveResponse.externalReportId())
            .isEqualTo("ext_1234567890abcdef1234567890abcdef")
        assertThat(reportRetrieveResponse.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(reportRetrieveResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(reportRetrieveResponse.presignedUrl())
            .contains("https://viewer.avarasoftware.com/study/stu_1234")
        assertThat(reportRetrieveResponse.readerName()).contains("readerName")
        assertThat(reportRetrieveResponse.reportText()).contains("reportText")
        assertThat(reportRetrieveResponse.signedAt()).contains("signedAt")
        assertThat(reportRetrieveResponse.snapshotMetadata())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportRetrieveResponse =
            ReportRetrieveResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalReportId("ext_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .presignedUrl("https://viewer.avarasoftware.com/study/stu_1234")
                .readerName("readerName")
                .reportText("reportText")
                .signedAt("signedAt")
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
                .build()

        val roundtrippedReportRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportRetrieveResponse),
                jacksonTypeRef<ReportRetrieveResponse>(),
            )

        assertThat(roundtrippedReportRetrieveResponse).isEqualTo(reportRetrieveResponse)
    }
}
