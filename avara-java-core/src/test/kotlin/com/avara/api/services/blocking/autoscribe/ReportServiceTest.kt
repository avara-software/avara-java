// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.blocking.autoscribe

import com.avara.api.TestServerExtension
import com.avara.api.client.okhttp.AvaraOkHttpClient
import com.avara.api.models.autoscribe.reports.ReportListParams
import com.avara.api.models.autoscribe.reports.ReportPdfParams
import com.avara.api.models.autoscribe.reports.ReportTextParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun addendum() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.autoScribe().reports()

        val response = reportService.addendum("rep_1234567890abcdef1234567890abcdef")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelAddendum() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reportService = client.autoScribe().reports()

        val response = reportService.cancelAddendum("rep_1234567890abcdef1234567890abcdef")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pdf() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun text() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
