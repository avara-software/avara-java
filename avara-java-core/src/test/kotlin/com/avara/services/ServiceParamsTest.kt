// File generated from our OpenAPI spec by Stainless.

package com.avara.services

import com.avara.client.AvaraClient
import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.core.JsonValue
import com.avara.models.viewer.studies.StudyCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: AvaraClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            AvaraOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val studyService = client.viewer().studies()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        studyService.create(
            StudyCreateParams.builder()
                .severity(StudyCreateParams.Severity.HIGH)
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
