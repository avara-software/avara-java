// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.JsonValue
import com.avara.models.Severity
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.WeightUnit
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyUpdateParamsTest {

    @Test
    fun create() {
        StudyUpdateParams.builder()
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .clinicalHistory("clinicalHistory")
            .clinicalIndication("Follow-up of previously noted lesion")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .externalPatientId("externalPatientId")
            .metadata(
                StudyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .modality("MRI")
            .addPriorReport(
                PriorReport.builder()
                    .reportText("IMPRESSION: No acute cardiopulmonary process.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Chest without contrast")
                    .build()
            )
            .reportMetadata(
                StudyUpdateParams.ReportMetadata.builder()
                    .age("age")
                    .dateOfBirth("7321-69-10")
                    .facilityName("facilityName")
                    .height(
                        StudyUpdateParams.ReportMetadata.Height.builder()
                            .unit(HeightUnit.CM)
                            .value(170.0)
                            .build()
                    )
                    .mrn("mrn")
                    .patientName("Jane M. Doe")
                    .procedure("procedure")
                    .referringPhysicianName("referringPhysicianName")
                    .sex(Sex.FEMALE)
                    .studyDate("7321-69-10")
                    .studyTime("studyTime")
                    .weight(
                        StudyUpdateParams.ReportMetadata.Weight.builder()
                            .unit(WeightUnit.KG)
                            .value(68.0)
                            .build()
                    )
                    .build()
            )
            .severity(Severity.HIGH)
            .studyDescription("Brain MRI with and without Contrast")
            .addTechnologistNote("x")
            .technologistTechnique("technologistTechnique")
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
                .clinicalHistory("clinicalHistory")
                .clinicalIndication("Follow-up of previously noted lesion")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .externalPatientId("externalPatientId")
                .metadata(
                    StudyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .modality("MRI")
                .addPriorReport(
                    PriorReport.builder()
                        .reportText("IMPRESSION: No acute cardiopulmonary process.")
                        .externalStudyId("EXT-2024-001")
                        .modality("CT")
                        .studyDate("2024-01-15")
                        .studyDescription("CT Chest without contrast")
                        .build()
                )
                .reportMetadata(
                    StudyUpdateParams.ReportMetadata.builder()
                        .age("age")
                        .dateOfBirth("7321-69-10")
                        .facilityName("facilityName")
                        .height(
                            StudyUpdateParams.ReportMetadata.Height.builder()
                                .unit(HeightUnit.CM)
                                .value(170.0)
                                .build()
                        )
                        .mrn("mrn")
                        .patientName("Jane M. Doe")
                        .procedure("procedure")
                        .referringPhysicianName("referringPhysicianName")
                        .sex(Sex.FEMALE)
                        .studyDate("7321-69-10")
                        .studyTime("studyTime")
                        .weight(
                            StudyUpdateParams.ReportMetadata.Weight.builder()
                                .unit(WeightUnit.KG)
                                .value(68.0)
                                .build()
                        )
                        .build()
                )
                .severity(Severity.HIGH)
                .studyDescription("Brain MRI with and without Contrast")
                .addTechnologistNote("x")
                .technologistTechnique("technologistTechnique")
                .build()

        val body = params._body()

        assertThat(body.assignedTo()).contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(body.clinicalHistory()).contains("clinicalHistory")
        assertThat(body.clinicalIndication()).contains("Follow-up of previously noted lesion")
        assertThat(body.expressCustomerId()).contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(body.externalPatientId()).contains("externalPatientId")
        assertThat(body.metadata())
            .contains(
                StudyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.modality()).contains("MRI")
        assertThat(body.priorReports().getOrNull())
            .containsExactly(
                PriorReport.builder()
                    .reportText("IMPRESSION: No acute cardiopulmonary process.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Chest without contrast")
                    .build()
            )
        assertThat(body.reportMetadata())
            .contains(
                StudyUpdateParams.ReportMetadata.builder()
                    .age("age")
                    .dateOfBirth("7321-69-10")
                    .facilityName("facilityName")
                    .height(
                        StudyUpdateParams.ReportMetadata.Height.builder()
                            .unit(HeightUnit.CM)
                            .value(170.0)
                            .build()
                    )
                    .mrn("mrn")
                    .patientName("Jane M. Doe")
                    .procedure("procedure")
                    .referringPhysicianName("referringPhysicianName")
                    .sex(Sex.FEMALE)
                    .studyDate("7321-69-10")
                    .studyTime("studyTime")
                    .weight(
                        StudyUpdateParams.ReportMetadata.Weight.builder()
                            .unit(WeightUnit.KG)
                            .value(68.0)
                            .build()
                    )
                    .build()
            )
        assertThat(body.severity()).contains(Severity.HIGH)
        assertThat(body.studyDescription()).contains("Brain MRI with and without Contrast")
        assertThat(body.technologistNotes().getOrNull()).containsExactly("x")
        assertThat(body.technologistTechnique()).contains("technologistTechnique")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StudyUpdateParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()

        val body = params._body()
    }
}
