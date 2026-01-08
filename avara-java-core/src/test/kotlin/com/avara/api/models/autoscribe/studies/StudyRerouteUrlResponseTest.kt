// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.studies

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyRerouteUrlResponseTest {

    @Test
    fun create() {
        val studyRerouteUrlResponse =
            StudyRerouteUrlResponse.builder()
                .url("https://autoscribe.avarasoftware.com/study/stu_1234?token=abc123")
                .build()

        assertThat(studyRerouteUrlResponse.url())
            .isEqualTo("https://autoscribe.avarasoftware.com/study/stu_1234?token=abc123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyRerouteUrlResponse =
            StudyRerouteUrlResponse.builder()
                .url("https://autoscribe.avarasoftware.com/study/stu_1234?token=abc123")
                .build()

        val roundtrippedStudyRerouteUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyRerouteUrlResponse),
                jacksonTypeRef<StudyRerouteUrlResponse>(),
            )

        assertThat(roundtrippedStudyRerouteUrlResponse).isEqualTo(studyRerouteUrlResponse)
    }
}
