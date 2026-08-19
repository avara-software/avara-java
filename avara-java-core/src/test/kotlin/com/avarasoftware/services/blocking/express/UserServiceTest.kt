// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.express

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.models.express.users.UserAddParams
import com.avarasoftware.models.express.users.UserRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
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

    @Disabled("Mock server tests are disabled")
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
