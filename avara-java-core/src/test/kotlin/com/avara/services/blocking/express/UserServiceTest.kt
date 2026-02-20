// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.express

import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.models.express.users.UserAddParams
import com.avara.models.express.users.UserRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.express().users()

        val response =
            userService.add(
                UserAddParams.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.express().users()

        val user =
            userService.remove(
                UserRemoveParams.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        user.validate()
    }
}
