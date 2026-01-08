// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.blocking

import com.avara.api.TestServerExtension
import com.avara.api.client.okhttp.AvaraOkHttpClient
import com.avara.api.core.JsonValue
import com.avara.api.models.orgs.OrgCreateParams
import com.avara.api.models.orgs.OrgUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgService = client.orgs()

        val org =
            orgService.create(
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

        org.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgService = client.orgs()

        val org = orgService.retrieve("org_1234567890abcdef1234567890abcdef")

        org.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgService = client.orgs()

        val org =
            orgService.update(
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

        org.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgService = client.orgs()

        val page = orgService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deactivate() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgService = client.orgs()

        val response = orgService.deactivate("org_1234567890abcdef1234567890abcdef")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun reactivate() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgService = client.orgs()

        val response = orgService.reactivate("org_1234567890abcdef1234567890abcdef")

        response.validate()
    }
}
