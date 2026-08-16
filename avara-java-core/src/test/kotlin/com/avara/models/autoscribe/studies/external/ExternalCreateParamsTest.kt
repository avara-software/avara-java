// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external

import com.avara.core.JsonValue
import com.avara.models.Severity
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.WeightUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalCreateParamsTest {

    @Test
    fun create() {
        ExternalCreateParams.builder()
            .reportMetadata(
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
                    .procedure("CT Chest")
                    .referringPhysicianName("Dr. Michael Chen")
                    .sex(Sex.FEMALE)
                    .studyDate("2024-01-15")
                    .studyTime("14:30")
                    .weight(
                        StudyReportMetadata.Weight.builder().unit(WeightUnit.KG).value(62.0).build()
                    )
                    .build()
            )
            .severity(Severity.NORMAL)
            .studyDescription("CT Chest without contrast")
            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .externalPatientId("PAT-2024-7731")
            .metadata(
                ExternalCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
            .modality("modality")
            .readerName("x")
            .reportFileName("x")
            .reportFileUrl("https://example.com")
            .reportText("IMPRESSION: No acute cardiopulmonary process.")
            .signedAt("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            ExternalCreateParams.builder()
                .reportMetadata(
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
                        .procedure("CT Chest")
                        .referringPhysicianName("Dr. Michael Chen")
                        .sex(Sex.FEMALE)
                        .studyDate("2024-01-15")
                        .studyTime("14:30")
                        .weight(
                            StudyReportMetadata.Weight.builder()
                                .unit(WeightUnit.KG)
                                .value(62.0)
                                .build()
                        )
                        .build()
                )
                .severity(Severity.NORMAL)
                .studyDescription("CT Chest without contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .externalPatientId("PAT-2024-7731")
                .metadata(
                    ExternalCreateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .modality("modality")
                .readerName("x")
                .reportFileName("x")
                .reportFileUrl("https://example.com")
                .reportText("IMPRESSION: No acute cardiopulmonary process.")
                .signedAt("x")
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
                            .unit(HeightUnit.CM)
                            .value(165.0)
                            .build()
                    )
                    .mrn("MRN-2024-001234")
                    .patientName("Jane Doe")
                    .procedure("CT Chest")
                    .referringPhysicianName("Dr. Michael Chen")
                    .sex(Sex.FEMALE)
                    .studyDate("2024-01-15")
                    .studyTime("14:30")
                    .weight(
                        StudyReportMetadata.Weight.builder().unit(WeightUnit.KG).value(62.0).build()
                    )
                    .build()
            )
        assertThat(body.severity()).isEqualTo(Severity.NORMAL)
        assertThat(body.studyDescription()).isEqualTo("CT Chest without contrast")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(body.expressCustomerId()).contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(body.externalPatientId()).contains("PAT-2024-7731")
        assertThat(body.metadata())
            .contains(
                ExternalCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(body.modality()).contains("modality")
        assertThat(body.readerName()).contains("x")
        assertThat(body.reportFileName()).contains("x")
        assertThat(body.reportFileUrl()).contains("https://example.com")
        assertThat(body.reportText()).contains("IMPRESSION: No acute cardiopulmonary process.")
        assertThat(body.signedAt()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalCreateParams.builder()
                .reportMetadata(StudyReportMetadata.builder().build())
                .severity(Severity.NORMAL)
                .studyDescription("CT Chest without contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val body = params._body()

        assertThat(body.reportMetadata()).isEqualTo(StudyReportMetadata.builder().build())
        assertThat(body.severity()).isEqualTo(Severity.NORMAL)
        assertThat(body.studyDescription()).isEqualTo("CT Chest without contrast")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }
}
