// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.core.JsonValue
import com.avara.models.express.ExpressCreateParams
import com.avara.models.express.ExpressUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExpressServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val expressServiceAsync = client.express()

        val expressFuture =
            expressServiceAsync.create(
                ExpressCreateParams.builder()
                    .expressCustomerName("City Medical Center - Radiology Department")
                    .metadata(
                        ExpressCreateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("region", JsonValue.from("northeast"))
                            .build()
                    )
                    .build()
            )

        val express = expressFuture.get()
        express.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val expressServiceAsync = client.express()

        val expressFuture = expressServiceAsync.retrieve("cus_1234567890abcdef1234567890abcdef")

        val express = expressFuture.get()
        express.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val expressServiceAsync = client.express()

        val expressFuture =
            expressServiceAsync.update(
                ExpressUpdateParams.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .expressCustomerName("City Medical Center - Radiology & Imaging")
                    .metadata(
                        ExpressUpdateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("region", JsonValue.from("northeast"))
                            .putAdditionalProperty("wing", JsonValue.from("Building A"))
                            .build()
                    )
                    .build()
            )

        val express = expressFuture.get()
        express.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val expressServiceAsync = client.express()

        val pageFuture = expressServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deactivate() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val expressServiceAsync = client.express()

        val responseFuture = expressServiceAsync.deactivate("cus_1234567890abcdef1234567890abcdef")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun reactivate() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val expressServiceAsync = client.express()

        val responseFuture = expressServiceAsync.reactivate("cus_1234567890abcdef1234567890abcdef")

        val response = responseFuture.get()
        response.validate()
    }
}
