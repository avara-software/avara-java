// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe.studies.external

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.models.autoscribe.studies.external.reports.ReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().studies().external().reports()

        val reportFuture =
            reportServiceAsync.create(
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

        val report = reportFuture.get()
        report.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().studies().external().reports()

        val reportFuture = reportServiceAsync.retrieve("ext_1234567890abcdef1234567890abcdef")

        val report = reportFuture.get()
        report.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().studies().external().reports()

        val pageFuture = reportServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
