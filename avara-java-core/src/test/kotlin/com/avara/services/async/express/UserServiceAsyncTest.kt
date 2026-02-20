// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.express

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.models.express.users.UserAddParams
import com.avara.models.express.users.UserRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.express().users()

        val responseFuture =
            userServiceAsync.add(
                UserAddParams.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.express().users()

        val userFuture =
            userServiceAsync.remove(
                UserRemoveParams.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }
}
