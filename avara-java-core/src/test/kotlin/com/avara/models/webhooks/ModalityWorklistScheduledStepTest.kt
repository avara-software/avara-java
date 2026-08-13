// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModalityWorklistScheduledStepTest {

    @Test
    fun create() {
        val modalityWorklistScheduledStep =
            ModalityWorklistScheduledStep.builder()
                .modality("CT")
                .scheduledProcedureStepDescription("CT Chest with contrast")
                .scheduledProcedureStepId("SPS-1001")
                .scheduledProcedureStepStartDate("20260813")
                .scheduledProcedureStepStartTime("090000")
                .build()

        assertThat(modalityWorklistScheduledStep.modality()).isEqualTo("CT")
        assertThat(modalityWorklistScheduledStep.scheduledProcedureStepDescription())
            .isEqualTo("CT Chest with contrast")
        assertThat(modalityWorklistScheduledStep.scheduledProcedureStepId()).isEqualTo("SPS-1001")
        assertThat(modalityWorklistScheduledStep.scheduledProcedureStepStartDate())
            .isEqualTo("20260813")
        assertThat(modalityWorklistScheduledStep.scheduledProcedureStepStartTime())
            .isEqualTo("090000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modalityWorklistScheduledStep =
            ModalityWorklistScheduledStep.builder()
                .modality("CT")
                .scheduledProcedureStepDescription("CT Chest with contrast")
                .scheduledProcedureStepId("SPS-1001")
                .scheduledProcedureStepStartDate("20260813")
                .scheduledProcedureStepStartTime("090000")
                .build()

        val roundtrippedModalityWorklistScheduledStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modalityWorklistScheduledStep),
                jacksonTypeRef<ModalityWorklistScheduledStep>(),
            )

        assertThat(roundtrippedModalityWorklistScheduledStep)
            .isEqualTo(modalityWorklistScheduledStep)
    }
}
