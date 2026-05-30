// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.WeightUnit
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ReportTextResponseTest {

    @Test
    fun ofSingle() {
        val single =
            ReportTextResponse.SingleReportTextResponse.builder()
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

        val reportTextResponse = ReportTextResponse.ofSingle(single)

        assertThat(reportTextResponse.single()).contains(single)
        assertThat(reportTextResponse.listReports()).isEmpty
    }

    @Test
    fun ofSingleRoundtrip() {
        val jsonMapper = jsonMapper()
        val reportTextResponse =
            ReportTextResponse.ofSingle(
                ReportTextResponse.SingleReportTextResponse.builder()
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
            )

        val roundtrippedReportTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportTextResponse),
                jacksonTypeRef<ReportTextResponse>(),
            )

        assertThat(roundtrippedReportTextResponse).isEqualTo(reportTextResponse)
    }

    @Test
    fun ofListReports() {
        val listReports =
            ReportTextResponse.ListReportsTextResponse.builder()
                .addReport(
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
                )
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val reportTextResponse = ReportTextResponse.ofListReports(listReports)

        assertThat(reportTextResponse.single()).isEmpty
        assertThat(reportTextResponse.listReports()).contains(listReports)
    }

    @Test
    fun ofListReportsRoundtrip() {
        val jsonMapper = jsonMapper()
        val reportTextResponse =
            ReportTextResponse.ofListReports(
                ReportTextResponse.ListReportsTextResponse.builder()
                    .addReport(
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
                    )
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val roundtrippedReportTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportTextResponse),
                jacksonTypeRef<ReportTextResponse>(),
            )

        assertThat(roundtrippedReportTextResponse).isEqualTo(reportTextResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val reportTextResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ReportTextResponse>())

        val e = assertThrows<AvaraInvalidDataException> { reportTextResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
