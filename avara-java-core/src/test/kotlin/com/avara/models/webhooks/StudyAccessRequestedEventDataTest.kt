// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedEventDataTest {

    @Test
    fun create() {
        val studyAccessRequestedEventData =
            StudyAccessRequestedEventData.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .build()

        assertThat(studyAccessRequestedEventData.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyAccessRequestedEventData.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedEventData =
            StudyAccessRequestedEventData.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                .build()

        val roundtrippedStudyAccessRequestedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedEventData),
                jacksonTypeRef<StudyAccessRequestedEventData>(),
            )

        assertThat(roundtrippedStudyAccessRequestedEventData)
            .isEqualTo(studyAccessRequestedEventData)
    }
}
