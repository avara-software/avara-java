// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.viewer

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.core.JsonValue
import com.avara.models.Severity
import com.avara.models.viewer.StudyViewerStatus
import com.avara.models.viewer.studies.StudyCancelParams
import com.avara.models.viewer.studies.StudyCreateParams
import com.avara.models.viewer.studies.StudyRerouteUrlParams
import com.avara.models.viewer.studies.StudyUncancelParams
import com.avara.models.viewer.studies.StudyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StudyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.viewer().studies()

        val studyFuture =
            studyServiceAsync.create(
                StudyCreateParams.builder()
                    .severity(Severity.HIGH)
                    .studyDescription("CT Chest/Abdomen/Pelvis")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .assignedTo("usr_1234567890abcdef1234567890abcdef")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .metadata(
                        StudyCreateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("priority", JsonValue.from("urgent"))
                            .build()
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
        val studyServiceAsync = client.viewer().studies()

        val studyFuture = studyServiceAsync.retrieve("stu_1234567890abcdef1234567890abcdef")

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.viewer().studies()

        val studyFuture =
            studyServiceAsync.update(
                StudyUpdateParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .assignedTo("usr_1234567890abcdef1234567890abcdef")
                    .metadata(
                        StudyUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .severity(Severity.STAT)
                    .studyDescription("CT Chest/Abdomen/Pelvis with Contrast")
                    .studyViewerStatus(StudyViewerStatus.COMPLETE)
                    .build()
            )

        val study = studyFuture.get()
        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.viewer().studies()

        val pageFuture = studyServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.viewer().studies()

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
        val studyServiceAsync = client.viewer().studies()

        val responseFuture =
            studyServiceAsync.rerouteUrl(
                StudyRerouteUrlParams.builder()
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
        val studyServiceAsync = client.viewer().studies()

        val responseFuture = studyServiceAsync.retrieveByUid("1.2.840.10008.5.1.4.1.1.2")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uncancel() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val studyServiceAsync = client.viewer().studies()

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
}
