// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.orgs

import com.avara.TestServerExtension
import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.models.orgs.users.UserAddParams
import com.avara.models.orgs.users.UserRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.orgs().users()

        val response =
            userService.add(
                UserAddParams.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.orgs().users()

        val user =
            userService.remove(
                UserRemoveParams.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        user.validate()
    }
}
