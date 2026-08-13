// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModalityWorklistItemTest {

    @Test
    fun create() {
        val modalityWorklistItem =
            ModalityWorklistItem.builder()
                .accessionNumber("ACC-98765")
                .modality("CT")
                .patientBirthDate("19850101")
                .patientId("MRN-12345")
                .patientName("DOE^JOHN")
                .patientSex("M")
                .patientSize("1.75")
                .patientWeight("80")
                .protocolName("CHEST_WITH")
                .requestedProcedureDescription("CT Chest w/ contrast")
                .addScheduledProcedureStepSequence(
                    ModalityWorklistScheduledStep.builder()
                        .modality("CT")
                        .scheduledProcedureStepDescription("CT Chest with contrast")
                        .scheduledProcedureStepId("SPS-1001")
                        .scheduledProcedureStepStartDate("20260813")
                        .scheduledProcedureStepStartTime("090000")
                        .build()
                )
                .studyDescription("CT Chest with contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .build()

        assertThat(modalityWorklistItem.accessionNumber()).isEqualTo("ACC-98765")
        assertThat(modalityWorklistItem.modality()).isEqualTo("CT")
        assertThat(modalityWorklistItem.patientBirthDate()).isEqualTo("19850101")
        assertThat(modalityWorklistItem.patientId()).isEqualTo("MRN-12345")
        assertThat(modalityWorklistItem.patientName()).isEqualTo("DOE^JOHN")
        assertThat(modalityWorklistItem.patientSex()).isEqualTo("M")
        assertThat(modalityWorklistItem.patientSize()).isEqualTo("1.75")
        assertThat(modalityWorklistItem.patientWeight()).isEqualTo("80")
        assertThat(modalityWorklistItem.protocolName()).isEqualTo("CHEST_WITH")
        assertThat(modalityWorklistItem.requestedProcedureDescription())
            .isEqualTo("CT Chest w/ contrast")
        assertThat(modalityWorklistItem.scheduledProcedureStepSequence())
            .containsExactly(
                ModalityWorklistScheduledStep.builder()
                    .modality("CT")
                    .scheduledProcedureStepDescription("CT Chest with contrast")
                    .scheduledProcedureStepId("SPS-1001")
                    .scheduledProcedureStepStartDate("20260813")
                    .scheduledProcedureStepStartTime("090000")
                    .build()
            )
        assertThat(modalityWorklistItem.studyDescription()).isEqualTo("CT Chest with contrast")
        assertThat(modalityWorklistItem.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modalityWorklistItem =
            ModalityWorklistItem.builder()
                .accessionNumber("ACC-98765")
                .modality("CT")
                .patientBirthDate("19850101")
                .patientId("MRN-12345")
                .patientName("DOE^JOHN")
                .patientSex("M")
                .patientSize("1.75")
                .patientWeight("80")
                .protocolName("CHEST_WITH")
                .requestedProcedureDescription("CT Chest w/ contrast")
                .addScheduledProcedureStepSequence(
                    ModalityWorklistScheduledStep.builder()
                        .modality("CT")
                        .scheduledProcedureStepDescription("CT Chest with contrast")
                        .scheduledProcedureStepId("SPS-1001")
                        .scheduledProcedureStepStartDate("20260813")
                        .scheduledProcedureStepStartTime("090000")
                        .build()
                )
                .studyDescription("CT Chest with contrast")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .build()

        val roundtrippedModalityWorklistItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modalityWorklistItem),
                jacksonTypeRef<ModalityWorklistItem>(),
            )

        assertThat(roundtrippedModalityWorklistItem).isEqualTo(modalityWorklistItem)
    }
}
