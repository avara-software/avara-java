// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedResponseTest {

    @Test
    fun create() {
        val studyAccessRequestedResponse =
            StudyAccessRequestedResponse.builder()
                .authorized(true)
                .addUrl("https://storage.example.com/dicom/image1.dcm?token=abc123")
                .addUrl("https://storage.example.com/dicom/image2.dcm?token=def456")
                .error("Study not found in PACS")
                .addMediaUrl(
                    StudyAccessRequestedMediaUrl.builder()
                        .mimeType("application/pdf")
                        .url("https://storage.example.com/media/report.pdf?token=ghi789")
                        .fileName("clinical-report.pdf")
                        .build()
                )
                .build()

        assertThat(studyAccessRequestedResponse.authorized()).isEqualTo(true)
        assertThat(studyAccessRequestedResponse.urls())
            .containsExactly(
                "https://storage.example.com/dicom/image1.dcm?token=abc123",
                "https://storage.example.com/dicom/image2.dcm?token=def456",
            )
        assertThat(studyAccessRequestedResponse.error()).contains("Study not found in PACS")
        assertThat(studyAccessRequestedResponse.mediaUrls().getOrNull())
            .containsExactly(
                StudyAccessRequestedMediaUrl.builder()
                    .mimeType("application/pdf")
                    .url("https://storage.example.com/media/report.pdf?token=ghi789")
                    .fileName("clinical-report.pdf")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedResponse =
            StudyAccessRequestedResponse.builder()
                .authorized(true)
                .addUrl("https://storage.example.com/dicom/image1.dcm?token=abc123")
                .addUrl("https://storage.example.com/dicom/image2.dcm?token=def456")
                .error("Study not found in PACS")
                .addMediaUrl(
                    StudyAccessRequestedMediaUrl.builder()
                        .mimeType("application/pdf")
                        .url("https://storage.example.com/media/report.pdf?token=ghi789")
                        .fileName("clinical-report.pdf")
                        .build()
                )
                .build()

        val roundtrippedStudyAccessRequestedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedResponse),
                jacksonTypeRef<StudyAccessRequestedResponse>(),
            )

        assertThat(roundtrippedStudyAccessRequestedResponse).isEqualTo(studyAccessRequestedResponse)
    }
}
