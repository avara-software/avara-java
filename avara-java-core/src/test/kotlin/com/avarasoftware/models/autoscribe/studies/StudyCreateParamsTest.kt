// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies

import com.avarasoftware.core.JsonValue
import com.avarasoftware.models.Severity
import com.avarasoftware.models.autoscribe.HeightUnit
import com.avarasoftware.models.autoscribe.Sex
import com.avarasoftware.models.autoscribe.StudyReportMetadata
import com.avarasoftware.models.autoscribe.WeightUnit
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
            .severity(Severity.NORMAL)
            .studyDescription("Brain MRI with Contrast")
            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .clinicalHistory("Hypertension; prior migraine history")
            .clinicalIndication("Persistent headaches, rule out intracranial mass")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .externalPatientId("PAT-2024-7731")
            .metadata(
                StudyCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
            .modality("MRI")
            .addPriorReport(
                PriorReport.builder()
                    .reportText("IMPRESSION: No acute intracranial abnormality.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Head without contrast")
                    .build()
            )
            .addTechnologistNote("Patient tolerated contrast well")
            .addTechnologistNote("Slight motion on initial sequence, repeated")
            .technologistTechnique(
                "Multiplanar multisequence MRI of the brain with and without IV contrast"
            )
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
                .severity(Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .clinicalHistory("Hypertension; prior migraine history")
                .clinicalIndication("Persistent headaches, rule out intracranial mass")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .externalPatientId("PAT-2024-7731")
                .metadata(
                    StudyCreateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("routine"))
                        .build()
                )
                .modality("MRI")
                .addPriorReport(
                    PriorReport.builder()
                        .reportText("IMPRESSION: No acute intracranial abnormality.")
                        .externalStudyId("EXT-2024-001")
                        .modality("CT")
                        .studyDate("2024-01-15")
                        .studyDescription("CT Head without contrast")
                        .build()
                )
                .addTechnologistNote("Patient tolerated contrast well")
                .addTechnologistNote("Slight motion on initial sequence, repeated")
                .technologistTechnique(
                    "Multiplanar multisequence MRI of the brain with and without IV contrast"
                )
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
        assertThat(body.severity()).isEqualTo(Severity.NORMAL)
        assertThat(body.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(body.assignedTo()).contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(body.clinicalHistory()).contains("Hypertension; prior migraine history")
        assertThat(body.clinicalIndication())
            .contains("Persistent headaches, rule out intracranial mass")
        assertThat(body.expressCustomerId()).contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(body.externalPatientId()).contains("PAT-2024-7731")
        assertThat(body.metadata())
            .contains(
                StudyCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("routine"))
                    .build()
            )
        assertThat(body.modality()).contains("MRI")
        assertThat(body.priorReports().getOrNull())
            .containsExactly(
                PriorReport.builder()
                    .reportText("IMPRESSION: No acute intracranial abnormality.")
                    .externalStudyId("EXT-2024-001")
                    .modality("CT")
                    .studyDate("2024-01-15")
                    .studyDescription("CT Head without contrast")
                    .build()
            )
        assertThat(body.technologistNotes().getOrNull())
            .containsExactly(
                "Patient tolerated contrast well",
                "Slight motion on initial sequence, repeated",
            )
        assertThat(body.technologistTechnique())
            .contains("Multiplanar multisequence MRI of the brain with and without IV contrast")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StudyCreateParams.builder()
                .reportMetadata(StudyReportMetadata.builder().build())
                .severity(Severity.NORMAL)
                .studyDescription("Brain MRI with Contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val body = params._body()

        assertThat(body.reportMetadata()).isEqualTo(StudyReportMetadata.builder().build())
        assertThat(body.severity()).isEqualTo(Severity.NORMAL)
        assertThat(body.studyDescription()).isEqualTo("Brain MRI with Contrast")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }
}
