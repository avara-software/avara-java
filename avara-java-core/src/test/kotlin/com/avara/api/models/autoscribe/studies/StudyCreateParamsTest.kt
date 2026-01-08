// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.studies

import com.avara.api.core.JsonValue
import com.avara.api.models.autoscribe.StudyReportMetadata
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyCreateParamsTest {

    @Test
    fun create() {
        StudyCreateParams.builder()
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
            .severity(StudyCreateParams.Severity.NORMAL)
            .studyDescription("Brain MRI with Contrast")
            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .metadata(
                StudyCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
            .orgId("org_1234567890abcdef1234567890abcdef")
            .addPriorReportText("x")
            .addPriorStudyId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            StudyCreateParams.builder()
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
                .severity(StudyCreateParams.Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    StudyCreateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .orgId("org_1234567890abcdef1234567890abcdef")
                .addPriorReportText("x")
                .addPriorStudyId("string")
                .build()

        val body = params._body()

        assertThat(body.reportMetadata())
            .isEqualTo(
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
        assertThat(body.severity()).isEqualTo(StudyCreateParams.Severity.NORMAL)
        assertThat(body.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(body.assignedTo()).contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(body.metadata())
            .contains(
                StudyCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(body.orgId()).contains("org_1234567890abcdef1234567890abcdef")
        assertThat(body.priorReportTexts().getOrNull()).containsExactly("x")
        assertThat(body.priorStudyIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StudyCreateParams.builder()
                .reportMetadata(StudyReportMetadata.builder().build())
                .severity(StudyCreateParams.Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val body = params._body()

        assertThat(body.reportMetadata()).isEqualTo(StudyReportMetadata.builder().build())
        assertThat(body.severity()).isEqualTo(StudyCreateParams.Severity.NORMAL)
        assertThat(body.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }
}
