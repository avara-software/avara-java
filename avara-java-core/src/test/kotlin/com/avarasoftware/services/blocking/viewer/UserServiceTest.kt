// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.viewer

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.models.AssignableUserLevel
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.viewer.users.UserInviteParams
import com.avarasoftware.models.viewer.users.UserReactivateParams
import com.avarasoftware.models.viewer.users.UserRevokeAccessParams
import com.avarasoftware.models.viewer.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.viewer().users()

        val user = userService.retrieve("usr_1234567890abcdef1234567890abcdef")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.viewer().users()

        val user =
            userService.update(
                UserUpdateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .canManageStudies(true)
                    .clinicRole(ClinicRole.RADIOLOGIST)
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson-Smith")
                    .level(AssignableUserLevel.ADMIN)
                    .middleName("x")
                    .phoneNumber("5551234567")
                    .suffix1("x")
                    .suffix2("x")
                    .build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.viewer().users()

        val page = userService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invite() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.viewer().users()

        val response =
            userService.invite(
                UserInviteParams.builder()
                    .canManageStudies(true)
                    .clinicRole(ClinicRole.RADIOLOGIST)
                    .email("dr.johnson@hospital.org")
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson")
                    .level(AssignableUserLevel.MEMBER)
                    .middleName("Marie")
                    .phoneNumber("5551234567")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reactivate() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.viewer().users()

        val response =
            userService.reactivate(
                UserReactivateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revokeAccess() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
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
