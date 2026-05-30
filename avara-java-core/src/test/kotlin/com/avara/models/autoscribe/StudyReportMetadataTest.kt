// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyReportMetadataTest {

    @Test
    fun create() {
        val studyReportMetadata =
            StudyReportMetadata.builder()
                .age("38 years")
                .dateOfBirth("1985-07-20")
                .facilityName("City Medical Center")
                .height(
                    StudyReportMetadata.Height.builder().unit(HeightUnit.CM).value(165.0).build()
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

        assertThat(studyReportMetadata.age()).contains("38 years")
        assertThat(studyReportMetadata.dateOfBirth()).contains("1985-07-20")
        assertThat(studyReportMetadata.facilityName()).contains("City Medical Center")
        assertThat(studyReportMetadata.height())
            .contains(StudyReportMetadata.Height.builder().unit(HeightUnit.CM).value(165.0).build())
        assertThat(studyReportMetadata.mrn()).contains("MRN-2024-001234")
        assertThat(studyReportMetadata.patientName()).contains("Jane Doe")
        assertThat(studyReportMetadata.procedure()).contains("MRI Brain with Contrast")
        assertThat(studyReportMetadata.referringPhysicianName()).contains("Dr. Michael Chen")
        assertThat(studyReportMetadata.sex()).contains(Sex.FEMALE)
        assertThat(studyReportMetadata.studyDate()).contains("2024-03-15")
        assertThat(studyReportMetadata.studyTime()).contains("14:30")
        assertThat(studyReportMetadata.weight())
            .contains(StudyReportMetadata.Weight.builder().unit(WeightUnit.KG).value(62.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyReportMetadata =
            StudyReportMetadata.builder()
                .age("38 years")
                .dateOfBirth("1985-07-20")
                .facilityName("City Medical Center")
                .height(
                    StudyReportMetadata.Height.builder().unit(HeightUnit.CM).value(165.0).build()
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

        val roundtrippedStudyReportMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyReportMetadata),
                jacksonTypeRef<StudyReportMetadata>(),
            )

        assertThat(roundtrippedStudyReportMetadata).isEqualTo(studyReportMetadata)
    }
}
