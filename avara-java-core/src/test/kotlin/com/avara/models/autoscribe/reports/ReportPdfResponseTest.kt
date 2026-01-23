// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ReportPdfResponseTest {

    @Test
    fun ofSingle() {
        val single =
            ReportPdfResponse.SingleReportPdfResponse.builder()
                .presignedUrl("https://storage.avarasoftware.com/reports/rep_1234.pdf?token=abc123")
                .reportId("rep_1234567890abcdef1234567890abcdef")
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
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val reportPdfResponse = ReportPdfResponse.ofSingle(single)

        assertThat(reportPdfResponse.single()).contains(single)
        assertThat(reportPdfResponse.listReports()).isEmpty
    }

    @Test
    fun ofSingleRoundtrip() {
        val jsonMapper = jsonMapper()
        val reportPdfResponse =
            ReportPdfResponse.ofSingle(
                ReportPdfResponse.SingleReportPdfResponse.builder()
                    .presignedUrl(
                        "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=abc123"
                    )
                    .reportId("rep_1234567890abcdef1234567890abcdef")
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
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val roundtrippedReportPdfResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportPdfResponse),
                jacksonTypeRef<ReportPdfResponse>(),
            )

        assertThat(roundtrippedReportPdfResponse).isEqualTo(reportPdfResponse)
    }

    @Test
    fun ofListReports() {
        val listReports =
            ReportPdfResponse.ListReportsPdfResponse.builder()
                .addReport(
                    ReportPdfResponse.ListReportsPdfResponse.Report.builder()
                        .presignedUrl(
                            "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=abc123"
                        )
                        .reportId("rep_1234567890abcdef1234567890abcdef")
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
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                        .build()
                )
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val reportPdfResponse = ReportPdfResponse.ofListReports(listReports)

        assertThat(reportPdfResponse.single()).isEmpty
        assertThat(reportPdfResponse.listReports()).contains(listReports)
    }

    @Test
    fun ofListReportsRoundtrip() {
        val jsonMapper = jsonMapper()
        val reportPdfResponse =
            ReportPdfResponse.ofListReports(
                ReportPdfResponse.ListReportsPdfResponse.builder()
                    .addReport(
                        ReportPdfResponse.ListReportsPdfResponse.Report.builder()
                            .presignedUrl(
                                "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=abc123"
                            )
                            .reportId("rep_1234567890abcdef1234567890abcdef")
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
                            .studyId("stu_1234567890abcdef1234567890abcdef")
                            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                            .build()
                    )
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val roundtrippedReportPdfResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportPdfResponse),
                jacksonTypeRef<ReportPdfResponse>(),
            )

        assertThat(roundtrippedReportPdfResponse).isEqualTo(reportPdfResponse)
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
        val reportPdfResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ReportPdfResponse>())

        val e = assertThrows<AvaraInvalidDataException> { reportPdfResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
