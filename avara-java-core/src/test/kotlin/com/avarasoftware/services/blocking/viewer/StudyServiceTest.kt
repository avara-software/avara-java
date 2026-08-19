// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.viewer

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.core.JsonValue
import com.avarasoftware.models.Severity
import com.avarasoftware.models.viewer.StudyViewerStatus
import com.avarasoftware.models.viewer.studies.StudyCancelParams
import com.avarasoftware.models.viewer.studies.StudyCreateParams
import com.avarasoftware.models.viewer.studies.StudyRerouteUrlParams
import com.avarasoftware.models.viewer.studies.StudyUncancelParams
import com.avarasoftware.models.viewer.studies.StudyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StudyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val study =
            studyService.create(
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

        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val study = studyService.retrieve("stu_1234567890abcdef1234567890abcdef")

        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val study =
            studyService.update(
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

        study.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val page = studyService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val response =
            studyService.cancel(
                StudyCancelParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerouteUrl() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val response =
            studyService.rerouteUrl(
                StudyRerouteUrlParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByUid() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val response = studyService.retrieveByUid("1.2.840.10008.5.1.4.1.1.2")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uncancel() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val studyService = client.viewer().studies()

        val response =
            studyService.uncancel(
                StudyUncancelParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        response.validate()
    }
}
