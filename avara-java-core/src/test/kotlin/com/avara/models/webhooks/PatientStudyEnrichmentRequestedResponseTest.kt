// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PatientStudyEnrichmentRequestedResponseTest {

    @Test
    fun create() {
        val patientStudyEnrichmentRequestedResponse =
            PatientStudyEnrichmentRequestedResponse.builder()
                .dateOfBirth("1985-01-01")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .externalPatientId("EHR-999")
                .facilityName("South Tampa Imaging")
                .height(
                    PatientStudyEnrichmentRequestedResponse.Height.builder()
                        .unit(PatientStudyEnrichmentRequestedResponse.Height.Unit.CM)
                        .value(170.0)
                        .build()
                )
                .mrn("MRN-12345")
                .patientName("John Doe")
                .procedure("CT Chest with contrast")
                .referringPhysicianName("Dr. Smith")
                .severity(PatientStudyEnrichmentRequestedResponse.Severity.NORMAL)
                .sex(PatientStudyEnrichmentRequestedResponse.Sex.MALE)
                .studyDate("2026-08-13")
                .studyDescription("CT Chest with contrast")
                .studyTime("09:30")
                .weight(
                    PatientStudyEnrichmentRequestedResponse.Weight.builder()
                        .unit(PatientStudyEnrichmentRequestedResponse.Weight.Unit.KG)
                        .value(68.0)
                        .build()
                )
                .build()

        assertThat(patientStudyEnrichmentRequestedResponse.dateOfBirth()).contains("1985-01-01")
        assertThat(patientStudyEnrichmentRequestedResponse.expressCustomerId())
            .contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(patientStudyEnrichmentRequestedResponse.externalPatientId()).contains("EHR-999")
        assertThat(patientStudyEnrichmentRequestedResponse.facilityName())
            .contains("South Tampa Imaging")
        assertThat(patientStudyEnrichmentRequestedResponse.height())
            .contains(
                PatientStudyEnrichmentRequestedResponse.Height.builder()
                    .unit(PatientStudyEnrichmentRequestedResponse.Height.Unit.CM)
                    .value(170.0)
                    .build()
            )
        assertThat(patientStudyEnrichmentRequestedResponse.mrn()).contains("MRN-12345")
        assertThat(patientStudyEnrichmentRequestedResponse.patientName()).contains("John Doe")
        assertThat(patientStudyEnrichmentRequestedResponse.procedure())
            .contains("CT Chest with contrast")
        assertThat(patientStudyEnrichmentRequestedResponse.referringPhysicianName())
            .contains("Dr. Smith")
        assertThat(patientStudyEnrichmentRequestedResponse.severity())
            .contains(PatientStudyEnrichmentRequestedResponse.Severity.NORMAL)
        assertThat(patientStudyEnrichmentRequestedResponse.sex())
            .contains(PatientStudyEnrichmentRequestedResponse.Sex.MALE)
        assertThat(patientStudyEnrichmentRequestedResponse.studyDate()).contains("2026-08-13")
        assertThat(patientStudyEnrichmentRequestedResponse.studyDescription())
            .contains("CT Chest with contrast")
        assertThat(patientStudyEnrichmentRequestedResponse.studyTime()).contains("09:30")
        assertThat(patientStudyEnrichmentRequestedResponse.weight())
            .contains(
                PatientStudyEnrichmentRequestedResponse.Weight.builder()
                    .unit(PatientStudyEnrichmentRequestedResponse.Weight.Unit.KG)
                    .value(68.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val patientStudyEnrichmentRequestedResponse =
            PatientStudyEnrichmentRequestedResponse.builder()
                .dateOfBirth("1985-01-01")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .externalPatientId("EHR-999")
                .facilityName("South Tampa Imaging")
                .height(
                    PatientStudyEnrichmentRequestedResponse.Height.builder()
                        .unit(PatientStudyEnrichmentRequestedResponse.Height.Unit.CM)
                        .value(170.0)
                        .build()
                )
                .mrn("MRN-12345")
                .patientName("John Doe")
                .procedure("CT Chest with contrast")
                .referringPhysicianName("Dr. Smith")
                .severity(PatientStudyEnrichmentRequestedResponse.Severity.NORMAL)
                .sex(PatientStudyEnrichmentRequestedResponse.Sex.MALE)
                .studyDate("2026-08-13")
                .studyDescription("CT Chest with contrast")
                .studyTime("09:30")
                .weight(
                    PatientStudyEnrichmentRequestedResponse.Weight.builder()
                        .unit(PatientStudyEnrichmentRequestedResponse.Weight.Unit.KG)
                        .value(68.0)
                        .build()
                )
                .build()

        val roundtrippedPatientStudyEnrichmentRequestedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(patientStudyEnrichmentRequestedResponse),
                jacksonTypeRef<PatientStudyEnrichmentRequestedResponse>(),
            )

        assertThat(roundtrippedPatientStudyEnrichmentRequestedResponse)
            .isEqualTo(patientStudyEnrichmentRequestedResponse)
    }
}
