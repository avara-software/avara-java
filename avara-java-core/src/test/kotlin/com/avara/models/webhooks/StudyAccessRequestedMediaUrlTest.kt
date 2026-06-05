// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedMediaUrlTest {

    @Test
    fun create() {
        val studyAccessRequestedMediaUrl =
            StudyAccessRequestedMediaUrl.builder()
                .mimeType("application/pdf")
                .url("https://storage.example.com/media/report.pdf?token=abc123")
                .fileName("clinical-report.pdf")
                .build()

        assertThat(studyAccessRequestedMediaUrl.mimeType()).isEqualTo("application/pdf")
        assertThat(studyAccessRequestedMediaUrl.url())
            .isEqualTo("https://storage.example.com/media/report.pdf?token=abc123")
        assertThat(studyAccessRequestedMediaUrl.fileName()).contains("clinical-report.pdf")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedMediaUrl =
            StudyAccessRequestedMediaUrl.builder()
                .mimeType("application/pdf")
                .url("https://storage.example.com/media/report.pdf?token=abc123")
                .fileName("clinical-report.pdf")
                .build()

        val roundtrippedStudyAccessRequestedMediaUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedMediaUrl),
                jacksonTypeRef<StudyAccessRequestedMediaUrl>(),
            )

        assertThat(roundtrippedStudyAccessRequestedMediaUrl).isEqualTo(studyAccessRequestedMediaUrl)
    }
}
