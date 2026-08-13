// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModalityWorklistRequestedResponseTest {

    @Test
    fun create() {
        val modalityWorklistRequestedResponse =
            ModalityWorklistRequestedResponse.builder()
                .authorized(true)
                .addItem(
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
                )
                .error("Worklist not available for this AE title")
                .build()

        assertThat(modalityWorklistRequestedResponse.authorized()).isEqualTo(true)
        assertThat(modalityWorklistRequestedResponse.items())
            .containsExactly(
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
            )
        assertThat(modalityWorklistRequestedResponse.error())
            .contains("Worklist not available for this AE title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modalityWorklistRequestedResponse =
            ModalityWorklistRequestedResponse.builder()
                .authorized(true)
                .addItem(
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
                )
                .error("Worklist not available for this AE title")
                .build()

        val roundtrippedModalityWorklistRequestedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modalityWorklistRequestedResponse),
                jacksonTypeRef<ModalityWorklistRequestedResponse>(),
            )

        assertThat(roundtrippedModalityWorklistRequestedResponse)
            .isEqualTo(modalityWorklistRequestedResponse)
    }
}
