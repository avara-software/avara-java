// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async

import com.avara.api.TestServerExtension
import com.avara.api.client.okhttp.AvaraOkHttpClientAsync
import com.avara.api.core.JsonValue
import com.avara.api.models.orgs.OrgCreateParams
import com.avara.api.models.orgs.OrgUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgServiceAsync = client.orgs()

        val orgFuture =
            orgServiceAsync.create(
                OrgCreateParams.builder()
                    .orgName("City Medical Center - Radiology Department")
                    .metadata(
                        OrgCreateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("region", JsonValue.from("northeast"))
                            .build()
                    )
                    .build()
            )

        val org = orgFuture.get()
        org.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgServiceAsync = client.orgs()

        val orgFuture = orgServiceAsync.retrieve("org_1234567890abcdef1234567890abcdef")

        val org = orgFuture.get()
        org.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgServiceAsync = client.orgs()

        val orgFuture =
            orgServiceAsync.update(
                OrgUpdateParams.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .metadata(
                        OrgUpdateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("region", JsonValue.from("northeast"))
                            .putAdditionalProperty("wing", JsonValue.from("Building A"))
                            .build()
                    )
                    .orgName("City Medical Center - Radiology & Imaging")
                    .build()
            )

        val org = orgFuture.get()
        org.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgServiceAsync = client.orgs()

        val pageFuture = orgServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deactivate() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgServiceAsync = client.orgs()

        val responseFuture = orgServiceAsync.deactivate("org_1234567890abcdef1234567890abcdef")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun reactivate() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgServiceAsync = client.orgs()

        val responseFuture = orgServiceAsync.reactivate("org_1234567890abcdef1234567890abcdef")

        val response = responseFuture.get()
        response.validate()
    }
}
