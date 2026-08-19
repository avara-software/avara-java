// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyViewerOnlyRerouteUrlParamsTest {

    @Test
    fun create() {
        StudyViewerOnlyRerouteUrlParams.builder()
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
            .userId("usr_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun body() {
        val params =
            StudyViewerOnlyRerouteUrlParams.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .userId("usr_1234567890abcdef1234567890abcdef")
                .build()

        val body = params._body()

        assertThat(body.studyId()).contains("stu_1234567890abcdef1234567890abcdef")
        assertThat(body.studyInstanceUid())
            .contains("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(body.userId()).contains("usr_1234567890abcdef1234567890abcdef")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = StudyViewerOnlyRerouteUrlParams.builder().build()

        val body = params._body()
    }
}
