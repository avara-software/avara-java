// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyRerouteUrlParamsTest {

    @Test
    fun create() {
        StudyRerouteUrlParams.builder()
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
            .build()
    }

    @Test
    fun body() {
        val params =
            StudyRerouteUrlParams.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val body = params._body()

        assertThat(body.studyId()).contains("stu_1234567890abcdef1234567890abcdef")
        assertThat(body.studyInstanceUid())
            .contains("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = StudyRerouteUrlParams.builder().build()

        val body = params._body()
    }
}
