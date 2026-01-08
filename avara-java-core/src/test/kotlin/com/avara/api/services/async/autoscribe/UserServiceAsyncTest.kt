// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async.autoscribe

import com.avara.api.TestServerExtension
import com.avara.api.client.okhttp.AvaraOkHttpClientAsync
import com.avara.api.models.autoscribe.users.UserInviteParams
import com.avara.api.models.autoscribe.users.UserReactivateParams
import com.avara.api.models.autoscribe.users.UserRevokeAccessParams
import com.avara.api.models.autoscribe.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.autoScribe().users()

        val userFuture = userServiceAsync.retrieve("usr_1234567890abcdef1234567890abcdef")

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.autoScribe().users()

        val userFuture =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .canCreateReports(true)
                    .canManageStudies(true)
                    .clinicRole(UserUpdateParams.ClinicRole.RADIOLOGIST)
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson-Smith")
                    .level(UserUpdateParams.Level.ADMIN)
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.autoScribe().users()

        val pageFuture = userServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun invite() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.autoScribe().users()

        val responseFuture =
            userServiceAsync.invite(
                UserInviteParams.builder()
                    .canCreateReports(true)
                    .canManageStudies(true)
                    .clinicRole(UserInviteParams.ClinicRole.RADIOLOGIST)
                    .email("dr.johnson@hospital.org")
                    .firstName("Sarah")
                    .hasDashboardAccess(true)
                    .lastName("Johnson")
                    .level(UserInviteParams.Level.MEMBER)
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

    @Disabled("Prism tests are disabled")
    @Test
    fun reactivate() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun revokeAccess() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
