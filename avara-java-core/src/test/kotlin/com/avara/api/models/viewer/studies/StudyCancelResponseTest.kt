// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.studies

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyCancelResponseTest {

    @Test
    fun create() {
        val studyCancelResponse =
            StudyCancelResponse.builder().success(true).message("message").build()

        assertThat(studyCancelResponse.success()).isEqualTo(true)
        assertThat(studyCancelResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyCancelResponse =
            StudyCancelResponse.builder().success(true).message("message").build()

        val roundtrippedStudyCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyCancelResponse),
                jacksonTypeRef<StudyCancelResponse>(),
            )

        assertThat(roundtrippedStudyCancelResponse).isEqualTo(studyCancelResponse)
    }
}
