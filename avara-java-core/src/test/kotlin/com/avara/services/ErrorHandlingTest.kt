// File generated from our OpenAPI spec by Stainless.

package com.avara.services

import com.avara.client.AvaraClient
import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.core.JsonValue
import com.avara.core.http.Headers
import com.avara.core.jsonMapper
import com.avara.errors.AvaraException
import com.avara.errors.BadRequestException
import com.avara.errors.InternalServerException
import com.avara.errors.NotFoundException
import com.avara.errors.PermissionDeniedException
import com.avara.errors.RateLimitException
import com.avara.errors.UnauthorizedException
import com.avara.errors.UnexpectedStatusCodeException
import com.avara.errors.UnprocessableEntityException
import com.avara.models.Severity
import com.avara.models.viewer.studies.StudyCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: AvaraClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            AvaraOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun studiesCreate400() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate400WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate401() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate401WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate403() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate403WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate404() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate404WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate422() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate422WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate429() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate429WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate500() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate500WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate999() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreate999WithRawResponse() {
        val studyService = client.viewer().studies().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun studiesCreateInvalidJsonBody() {
        val studyService = client.viewer().studies()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<AvaraException> {
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
