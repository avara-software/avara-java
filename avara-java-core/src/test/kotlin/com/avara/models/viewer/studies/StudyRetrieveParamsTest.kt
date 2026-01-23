// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyRetrieveParamsTest {

    @Test
    fun create() {
        StudyRetrieveParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()
    }

    @Test
    fun pathParams() {
        val params =
            StudyRetrieveParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
