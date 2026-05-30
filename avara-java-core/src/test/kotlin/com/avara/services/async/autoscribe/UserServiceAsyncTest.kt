// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.models.AssignableUserLevel
import com.avara.models.ClinicRole
import com.avara.models.autoscribe.users.UserInviteParams
import com.avara.models.autoscribe.users.UserReactivateParams
import com.avara.models.autoscribe.users.UserRevokeAccessParams
import com.avara.models.autoscribe.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.autoScribe().users()

        val userFuture = userServiceAsync.retrieve("usr_1234567890abcdef1234567890abcdef")

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.autoScribe().users()

        val userFuture =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .canCreateReports(true)
                    .canManageStudies(true)
                    .clinicRole(ClinicRole.RADIOLOGIST)
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson-Smith")
                    .level(AssignableUserLevel.ADMIN)
                    .middleName("x")
                    .npiNumber("1234567893")
                    .phoneNumber("5551234567")
                    .suffix1("x")
                    .suffix2("x")
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.autoScribe().users()

        val pageFuture = userServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invite() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.autoScribe().users()

        val responseFuture =
            userServiceAsync.invite(
                UserInviteParams.builder()
                    .canCreateReports(true)
                    .canManageStudies(true)
                    .clinicRole(ClinicRole.RADIOLOGIST)
                    .email("dr.johnson@hospital.org")
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson")
                    .level(AssignableUserLevel.MEMBER)
                    .middleName("Marie")
                    .npiNumber("1234567893")
                    .phoneNumber("5551234567")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reactivate() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.autoScribe().users()

        val responseFuture =
            userServiceAsync.reactivate(
                UserReactivateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revokeAccess() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.autoScribe().users()

        val responseFuture =
            userServiceAsync.revokeAccess(
                UserRevokeAccessParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
