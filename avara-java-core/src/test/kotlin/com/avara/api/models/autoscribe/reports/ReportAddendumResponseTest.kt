// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.reports

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportAddendumResponseTest {

    @Test
    fun create() {
        val reportAddendumResponse =
            ReportAddendumResponse.builder().success(true).message("message").build()

        assertThat(reportAddendumResponse.success()).isEqualTo(true)
        assertThat(reportAddendumResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportAddendumResponse =
            ReportAddendumResponse.builder().success(true).message("message").build()

        val roundtrippedReportAddendumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportAddendumResponse),
                jacksonTypeRef<ReportAddendumResponse>(),
            )

        assertThat(roundtrippedReportAddendumResponse).isEqualTo(reportAddendumResponse)
    }
}
