// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async.autoscribe

import com.avarasoftware.client.okhttp.AvaraOkHttpClientAsync
import com.avarasoftware.models.autoscribe.reports.ReportListParams
import com.avarasoftware.models.autoscribe.reports.ReportPdfParams
import com.avarasoftware.models.autoscribe.reports.ReportTextParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().reports()

        val reportsFuture =
            reportServiceAsync.list(
                ReportListParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )

        val reports = reportsFuture.get()
        reports.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addendum() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().reports()

        val responseFuture = reportServiceAsync.addendum("rep_1234567890abcdef1234567890abcdef")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelAddendum() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().reports()

        val responseFuture =
            reportServiceAsync.cancelAddendum("rep_1234567890abcdef1234567890abcdef")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pdf() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().reports()

        val responseFuture =
            reportServiceAsync.pdf(
                ReportPdfParams.builder()
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun text() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reportServiceAsync = client.autoScribe().reports()

        val responseFuture =
            reportServiceAsync.text(
                ReportTextParams.builder()
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
