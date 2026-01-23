// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyViewerOnlyRerouteUrlResponseTest {

    @Test
    fun create() {
        val studyViewerOnlyRerouteUrlResponse =
            StudyViewerOnlyRerouteUrlResponse.builder()
                .url("https://viewer.avarasoftware.com/study/stu_1234?token=abc123")
                .build()

        assertThat(studyViewerOnlyRerouteUrlResponse.url())
            .isEqualTo("https://viewer.avarasoftware.com/study/stu_1234?token=abc123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyViewerOnlyRerouteUrlResponse =
            StudyViewerOnlyRerouteUrlResponse.builder()
                .url("https://viewer.avarasoftware.com/study/stu_1234?token=abc123")
                .build()

        val roundtrippedStudyViewerOnlyRerouteUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyViewerOnlyRerouteUrlResponse),
                jacksonTypeRef<StudyViewerOnlyRerouteUrlResponse>(),
            )

        assertThat(roundtrippedStudyViewerOnlyRerouteUrlResponse)
            .isEqualTo(studyViewerOnlyRerouteUrlResponse)
    }
}
