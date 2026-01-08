// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.webhooks

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedEventTest {

    @Test
    fun create() {
        val studyAccessRequestedEvent =
            StudyAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    StudyAccessRequestedEvent.Data.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .build()
                )
                .build()

        assertThat(studyAccessRequestedEvent.id()).isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(studyAccessRequestedEvent.data())
            .isEqualTo(
                StudyAccessRequestedEvent.Data.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedEvent =
            StudyAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    StudyAccessRequestedEvent.Data.builder()
                        .studyId("stu_1234567890abcdef1234567890abcdef")
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .build()
                )
                .build()

        val roundtrippedStudyAccessRequestedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedEvent),
                jacksonTypeRef<StudyAccessRequestedEvent>(),
            )

        assertThat(roundtrippedStudyAccessRequestedEvent).isEqualTo(studyAccessRequestedEvent)
    }
}
