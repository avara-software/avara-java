// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportAddendumParamsTest {

    @Test
    fun create() {
        ReportAddendumParams.builder().reportId("rep_1234567890abcdef1234567890abcdef").build()
    }

    @Test
    fun pathParams() {
        val params =
            ReportAddendumParams.builder().reportId("rep_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("rep_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
