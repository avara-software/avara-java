// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyRetrieveByUidParamsTest {

    @Test
    fun create() {
        StudyRetrieveByUidParams.builder().studyInstanceUid("1.2.840.10008.5.1.4.1.1.2").build()
    }

    @Test
    fun pathParams() {
        val params =
            StudyRetrieveByUidParams.builder().studyInstanceUid("1.2.840.10008.5.1.4.1.1.2").build()

        assertThat(params._pathParam(0)).isEqualTo("1.2.840.10008.5.1.4.1.1.2")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
