// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.reports

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportCancelAddendumResponseTest {

    @Test
    fun create() {
        val reportCancelAddendumResponse =
            ReportCancelAddendumResponse.builder().success(true).message("message").build()

        assertThat(reportCancelAddendumResponse.success()).isEqualTo(true)
        assertThat(reportCancelAddendumResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportCancelAddendumResponse =
            ReportCancelAddendumResponse.builder().success(true).message("message").build()

        val roundtrippedReportCancelAddendumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportCancelAddendumResponse),
                jacksonTypeRef<ReportCancelAddendumResponse>(),
            )

        assertThat(roundtrippedReportCancelAddendumResponse).isEqualTo(reportCancelAddendumResponse)
    }
}
