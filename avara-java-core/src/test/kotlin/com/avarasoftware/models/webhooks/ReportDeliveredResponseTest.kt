// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportDeliveredResponseTest {

    @Test
    fun create() {
        val reportDeliveredResponse = ReportDeliveredResponse.builder().success(true).build()

        assertThat(reportDeliveredResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportDeliveredResponse = ReportDeliveredResponse.builder().success(true).build()

        val roundtrippedReportDeliveredResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportDeliveredResponse),
                jacksonTypeRef<ReportDeliveredResponse>(),
            )

        assertThat(roundtrippedReportDeliveredResponse).isEqualTo(reportDeliveredResponse)
    }
}
