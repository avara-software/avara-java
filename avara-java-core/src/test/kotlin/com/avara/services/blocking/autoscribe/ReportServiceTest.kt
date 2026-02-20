// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.models.autoscribe.reports.ReportListParams
import com.avara.models.autoscribe.reports.ReportPdfParams
import com.avara.models.autoscribe.reports.ReportTextParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().reports()

        val reports =
            reportService.list(
                ReportListParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )

        reports.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addendum() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().reports()

        val response = reportService.addendum("rep_1234567890abcdef1234567890abcdef")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelAddendum() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().reports()

        val response = reportService.cancelAddendum("rep_1234567890abcdef1234567890abcdef")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pdf() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().reports()

        val response =
            reportService.pdf(
                ReportPdfParams.builder()
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun text() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val reportService = client.autoScribe().reports()

        val response =
            reportService.text(
                ReportTextParams.builder()
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )

        response.validate()
    }
}
