// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.orgs

import com.avara.TestServerExtension
import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.models.orgs.users.UserAddParams
import com.avara.models.orgs.users.UserRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun add() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.orgs().users()

        val responseFuture =
            userServiceAsync.add(
                UserAddParams.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.orgs().users()

        val userFuture =
            userServiceAsync.remove(
                UserRemoveParams.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }
}
