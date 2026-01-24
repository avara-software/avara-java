// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.TestServerExtension
import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.core.JsonValue
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.studies.StudyCancelParams
import com.avara.models.autoscribe.studies.StudyCreateParams
import com.avara.models.autoscribe.studies.StudyRerouteUrlParams
import com.avara.models.autoscribe.studies.StudyUncancelParams
import com.avara.models.autoscribe.studies.StudyUpdateParams
import com.avara.models.autoscribe.studies.StudyViewerOnlyRerouteUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StudyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val studyFuture =
            studyServiceAsync.create(
                StudyCreateParams.builder()
                    .reportMetadata(
                        StudyReportMetadata.builder()
                            .age("38 years")
                            .dateOfBirth("1985-07-20")
                            .facilityName("City Medical Center")
                            .height(
                                StudyReportMetadata.Height.builder()
                                    .unit(StudyReportMetadata.Height.Unit.CM)
                                    .value(165.0)
                                    .build()
                            )
                            .mrn("MRN-2024-001234")
                            .patientName("Jane Doe")
                            .referringPhysicianName("Dr. Michael Chen")
                            .scanDate("2024-03-15")
                            .scanTime("14:30")
                            .scanType("MRI Brain with Contrast")
                            .sex(StudyReportMetadata.Sex.FEMALE)
                            .weight(
                                StudyReportMetadata.Weight.builder()
                                    .unit(StudyReportMetadata.Weight.Unit.KG)
                                    .value(62.0)
                                    .build()
                            )
                            .build()
                    )
                    .severity(StudyCreateParams.Severity.NORMAL)
                    .studyDescription("Brain MRI with Contrast")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .assignedTo("usr_1234567890abcdef1234567890abcdef")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .metadata(
                        StudyCreateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("priority", JsonValue.from("routine"))
                            .build()
                    )
                    .addPriorReportText("x")
                    .addPriorStudyId("string")
                    .build()
            )

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val studyFuture = studyServiceAsync.retrieve("stu_1234567890abcdef1234567890abcdef")

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val studyFuture =
            studyServiceAsync.update(
                StudyUpdateParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .assignedTo("usr_1234567890abcdef1234567890abcdef")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .metadata(
                        StudyUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addPriorReportText("x")
                    .addPriorStudyId("string")
                    .reportMetadata(
                        StudyUpdateParams.ReportMetadata.builder()
                            .age("age")
                            .dateOfBirth("7321-69-10")
                            .facilityName("facilityName")
                            .height(
                                StudyUpdateParams.ReportMetadata.Height.builder()
                                    .unit(StudyUpdateParams.ReportMetadata.Height.Unit.CM)
                                    .value(170.0)
                                    .build()
                            )
                            .mrn("mrn")
                            .patientName("Jane M. Doe")
                            .referringPhysicianName("referringPhysicianName")
                            .scanDate("7321-69-10")
                            .scanTime("scanTime")
                            .scanType("scanType")
                            .sex(StudyUpdateParams.ReportMetadata.Sex.FEMALE)
                            .weight(
                                StudyUpdateParams.ReportMetadata.Weight.builder()
                                    .unit(StudyUpdateParams.ReportMetadata.Weight.Unit.KG)
                                    .value(68.0)
                                    .build()
                            )
                            .build()
                    )
                    .severity(StudyUpdateParams.Severity.HIGH)
                    .studyDescription("Brain MRI with and without Contrast")
                    .build()
            )

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val pageFuture = studyServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val responseFuture =
            studyServiceAsync.cancel(
                StudyCancelParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun rerouteUrl() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val responseFuture =
            studyServiceAsync.rerouteUrl(
                StudyRerouteUrlParams.builder()
                    .assignedToUserId("usr_1234567890abcdef1234567890abcdef")
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveByUid() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val responseFuture = studyServiceAsync.retrieveByUid("1.2.840.10008.5.1.4.1.1.2")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uncancel() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val responseFuture =
            studyServiceAsync.uncancel(
                StudyUncancelParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun viewerOnlyRerouteUrl() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val studyServiceAsync = client.autoScribe().studies()

        val responseFuture =
            studyServiceAsync.viewerOnlyRerouteUrl(
                StudyViewerOnlyRerouteUrlParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
