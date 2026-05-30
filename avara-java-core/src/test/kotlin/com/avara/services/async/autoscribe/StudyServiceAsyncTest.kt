// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.core.JsonValue
import com.avara.models.Severity
import com.avara.models.autoscribe.HeightUnit
import com.avara.models.autoscribe.Sex
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.WeightUnit
import com.avara.models.autoscribe.studies.PriorReport
import com.avara.models.autoscribe.studies.StudyCancelParams
import com.avara.models.autoscribe.studies.StudyCreateParams
import com.avara.models.autoscribe.studies.StudyRerouteUrlParams
import com.avara.models.autoscribe.studies.StudyUncancelParams
import com.avara.models.autoscribe.studies.StudyUpdateParams
import com.avara.models.autoscribe.studies.StudyViewerOnlyRerouteUrlParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StudyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
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
                                    .unit(HeightUnit.CM)
                                    .value(165.0)
                                    .build()
                            )
                            .mrn("MRN-2024-001234")
                            .patientName("Jane Doe")
                            .procedure("MRI Brain with Contrast")
                            .referringPhysicianName("Dr. Michael Chen")
                            .sex(Sex.FEMALE)
                            .studyDate("2024-03-15")
                            .studyTime("14:30")
                            .weight(
                                StudyReportMetadata.Weight.builder()
                                    .unit(WeightUnit.KG)
                                    .value(62.0)
                                    .build()
                            )
                            .build()
                    )
                    .severity(Severity.NORMAL)
                    .studyDescription("Brain MRI with Contrast")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .assignedTo("usr_1234567890abcdef1234567890abcdef")
                    .clinicalHistory("Hypertension; prior migraine history")
                    .clinicalIndication("Persistent headaches, rule out intracranial mass")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .externalPatientId("PAT-2024-7731")
                    .metadata(
                        StudyCreateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("priority", JsonValue.from("routine"))
                            .build()
                    )
                    .modality("MRI")
                    .addPriorReport(
                        PriorReport.builder()
                            .reportText("IMPRESSION: No acute intracranial abnormality.")
                            .externalStudyId("EXT-2024-001")
                            .modality("CT")
                            .studyDate("2024-01-15")
                            .studyDescription("CT Head without contrast")
                            .build()
                    )
                    .addTechnologistNote("Patient tolerated contrast well")
                    .addTechnologistNote("Slight motion on initial sequence, repeated")
                    .technologistTechnique(
                        "Multiplanar multisequence MRI of the brain with and without IV contrast"
                    )
                    .build()
            )

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.autoScribe().studies()

        val studyFuture = studyServiceAsync.retrieve("stu_1234567890abcdef1234567890abcdef")

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.autoScribe().studies()

        val studyFuture =
            studyServiceAsync.update(
                StudyUpdateParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .assignedTo("usr_1234567890abcdef1234567890abcdef")
                    .clinicalHistory("clinicalHistory")
                    .clinicalIndication("Follow-up of previously noted lesion")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .externalPatientId("externalPatientId")
                    .metadata(
                        StudyUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .modality("MRI")
                    .addPriorReport(
                        PriorReport.builder()
                            .reportText("IMPRESSION: No acute cardiopulmonary process.")
                            .externalStudyId("EXT-2024-001")
                            .modality("CT")
                            .studyDate("2024-01-15")
                            .studyDescription("CT Chest without contrast")
                            .build()
                    )
                    .reportMetadata(
                        StudyUpdateParams.ReportMetadata.builder()
                            .age("age")
                            .dateOfBirth("7321-69-10")
                            .facilityName("facilityName")
                            .height(
                                StudyUpdateParams.ReportMetadata.Height.builder()
                                    .unit(HeightUnit.CM)
                                    .value(170.0)
                                    .build()
                            )
                            .mrn("mrn")
                            .patientName("Jane M. Doe")
                            .procedure("procedure")
                            .referringPhysicianName("referringPhysicianName")
                            .sex(Sex.FEMALE)
                            .studyDate("7321-69-10")
                            .studyTime("studyTime")
                            .weight(
                                StudyUpdateParams.ReportMetadata.Weight.builder()
                                    .unit(WeightUnit.KG)
                                    .value(68.0)
                                    .build()
                            )
                            .build()
                    )
                    .severity(Severity.HIGH)
                    .studyDescription("Brain MRI with and without Contrast")
                    .addTechnologistNote("x")
                    .technologistTechnique("technologistTechnique")
                    .build()
            )

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.autoScribe().studies()

        val pageFuture = studyServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerouteUrl() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByUid() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.autoScribe().studies()

        val responseFuture = studyServiceAsync.retrieveByUid("1.2.840.10008.5.1.4.1.1.2")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uncancel() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun viewerOnlyRerouteUrl() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
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
