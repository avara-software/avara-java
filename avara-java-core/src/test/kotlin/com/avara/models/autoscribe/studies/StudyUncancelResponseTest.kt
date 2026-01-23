// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyUncancelResponseTest {

    @Test
    fun create() {
        val studyUncancelResponse =
            StudyUncancelResponse.builder().success(true).message("message").build()

        assertThat(studyUncancelResponse.success()).isEqualTo(true)
        assertThat(studyUncancelResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyUncancelResponse =
            StudyUncancelResponse.builder().success(true).message("message").build()

        val roundtrippedStudyUncancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyUncancelResponse),
                jacksonTypeRef<StudyUncancelResponse>(),
            )

        assertThat(roundtrippedStudyUncancelResponse).isEqualTo(studyUncancelResponse)
    }
}
