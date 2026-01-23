// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer

import com.avara.TestServerExtension
import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.models.viewer.users.UserInviteParams
import com.avara.models.viewer.users.UserReactivateParams
import com.avara.models.viewer.users.UserRevokeAccessParams
import com.avara.models.viewer.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.viewer().users()

        val user = userService.retrieve("usr_1234567890abcdef1234567890abcdef")

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.viewer().users()

        val user =
            userService.update(
                UserUpdateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .canManageStudies(true)
                    .clinicRole(UserUpdateParams.ClinicRole.RADIOLOGIST)
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson-Smith")
                    .level(UserUpdateParams.Level.ADMIN)
                    .middleName("x")
                    .phoneNumber("5551234567")
                    .suffix1("x")
                    .suffix2("x")
                    .build()
            )

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.viewer().users()

        val page = userService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun invite() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.viewer().users()

        val response =
            userService.invite(
                UserInviteParams.builder()
                    .canManageStudies(true)
                    .clinicRole(UserInviteParams.ClinicRole.RADIOLOGIST)
                    .email("dr.johnson@hospital.org")
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson")
                    .level(UserInviteParams.Level.MEMBER)
                    .middleName("Marie")
                    .phoneNumber("5551234567")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )

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
        val userService = client.viewer().users()

        val response =
            userService.reactivate(
                UserReactivateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun revokeAccess() {
        val client =
            AvaraOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.viewer().users()

        val response =
            userService.revokeAccess(
                UserRevokeAccessParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        response.validate()
    }
}
