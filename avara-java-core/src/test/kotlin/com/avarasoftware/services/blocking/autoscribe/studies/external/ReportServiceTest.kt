// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe.studies.external

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.models.autoscribe.studies.external.reports.ReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().studies().external().reports()

        val report =
            reportService.create(
                ReportCreateParams.builder()
                    .readerName("x")
                    .reportFileName("x")
                    .reportFileUrl("https://example.com")
                    .reportText("x")
                    .signedAt("x")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        report.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().studies().external().reports()

        val report = reportService.retrieve("ext_1234567890abcdef1234567890abcdef")

        report.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().studies().external().reports()

        val page = reportService.list()

        page.response().validate()
    }
}
