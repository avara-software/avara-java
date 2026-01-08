// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.studies

import com.avara.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyUpdateParamsTest {

    @Test
    fun create() {
        StudyUpdateParams.builder()
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .metadata(
                StudyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .orgId("org_1234567890abcdef1234567890abcdef")
            .addPriorReportText("x")
            .addPriorStudyId("string")
            .reportMetadata(
                StudyUpdateParams.ReportMetadata.builder()
                    .age("age")
                    .dateOfBirth("7321-69-10")
                    .facilityName("facilityName")
                    .height(
                        StudyUpdateParams.ReportMetadata.Height.builder()
                            .unit(StudyUpdateParams.ReportMetadata.Height.Unit.CM)
                            .value(170.0)
                            .build()
                    )
                    .mrn("mrn")
                    .patientName("Jane M. Doe")
                    .referringPhysicianName("referringPhysicianName")
                    .scanDate("7321-69-10")
                    .scanTime("scanTime")
                    .scanType("scanType")
                    .sex(StudyUpdateParams.ReportMetadata.Sex.FEMALE)
                    .weight(
                        StudyUpdateParams.ReportMetadata.Weight.builder()
                            .unit(StudyUpdateParams.ReportMetadata.Weight.Unit.KG)
                            .value(68.0)
                            .build()
                    )
                    .build()
            )
            .severity(StudyUpdateParams.Severity.HIGH)
            .studyDescription("Brain MRI with and without Contrast")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StudyUpdateParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StudyUpdateParams.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    StudyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .orgId("org_1234567890abcdef1234567890abcdef")
                .addPriorReportText("x")
                .addPriorStudyId("string")
                .reportMetadata(
                    StudyUpdateParams.ReportMetadata.builder()
                        .age("age")
                        .dateOfBirth("7321-69-10")
                        .facilityName("facilityName")
                        .height(
                            StudyUpdateParams.ReportMetadata.Height.builder()
                                .unit(StudyUpdateParams.ReportMetadata.Height.Unit.CM)
                                .value(170.0)
                                .build()
                        )
                        .mrn("mrn")
                        .patientName("Jane M. Doe")
                        .referringPhysicianName("referringPhysicianName")
                        .scanDate("7321-69-10")
                        .scanTime("scanTime")
                        .scanType("scanType")
                        .sex(StudyUpdateParams.ReportMetadata.Sex.FEMALE)
                        .weight(
                            StudyUpdateParams.ReportMetadata.Weight.builder()
                                .unit(StudyUpdateParams.ReportMetadata.Weight.Unit.KG)
                                .value(68.0)
                                .build()
                        )
                        .build()
                )
                .severity(StudyUpdateParams.Severity.HIGH)
                .studyDescription("Brain MRI with and without Contrast")
                .build()

        val body = params._body()

        assertThat(body.assignedTo()).contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(body.metadata())
            .contains(
                StudyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.orgId()).contains("org_1234567890abcdef1234567890abcdef")
        assertThat(body.priorReportTexts().getOrNull()).containsExactly("x")
        assertThat(body.priorStudyIds().getOrNull()).containsExactly("string")
        assertThat(body.reportMetadata())
            .contains(
                StudyUpdateParams.ReportMetadata.builder()
                    .age("age")
                    .dateOfBirth("7321-69-10")
                    .facilityName("facilityName")
                    .height(
                        StudyUpdateParams.ReportMetadata.Height.builder()
                            .unit(StudyUpdateParams.ReportMetadata.Height.Unit.CM)
                            .value(170.0)
                            .build()
                    )
                    .mrn("mrn")
                    .patientName("Jane M. Doe")
                    .referringPhysicianName("referringPhysicianName")
                    .scanDate("7321-69-10")
                    .scanTime("scanTime")
                    .scanType("scanType")
                    .sex(StudyUpdateParams.ReportMetadata.Sex.FEMALE)
                    .weight(
                        StudyUpdateParams.ReportMetadata.Weight.builder()
                            .unit(StudyUpdateParams.ReportMetadata.Weight.Unit.KG)
                            .value(68.0)
                            .build()
                    )
                    .build()
            )
        assertThat(body.severity()).contains(StudyUpdateParams.Severity.HIGH)
        assertThat(body.studyDescription()).contains("Brain MRI with and without Contrast")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StudyUpdateParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()

        val body = params._body()
    }
}
