// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.viewer.users

import com.avara.TestServerExtension
import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.models.viewer.users.invitations.InvitationRevokeParams
import com.avara.models.viewer.users.invitations.InvitationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvitationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invitationServiceAsync = client.viewer().users().invitations()

        val invitationFuture =
            invitationServiceAsync.retrieve("inv_1234567890abcdef1234567890abcdef")

        val invitation = invitationFuture.get()
        invitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invitationServiceAsync = client.viewer().users().invitations()

        val invitationFuture =
            invitationServiceAsync.update(
                InvitationUpdateParams.builder()
                    .invitationId("inv_1234567890abcdef1234567890abcdef")
                    .canManageStudies(true)
                    .clinicRole(InvitationUpdateParams.ClinicRole.RADIOLOGIST)
                    .firstName("Michael")
                    .hasDashboardAccess(true)
                    .lastName("Chen")
                    .level(InvitationUpdateParams.Level.ADMIN)
                    .middleName("x")
                    .phoneNumber("5551234567")
                    .suffix1("x")
                    .suffix2("x")
                    .build()
            )

        val invitation = invitationFuture.get()
        invitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invitationServiceAsync = client.viewer().users().invitations()

        val pageFuture = invitationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun revoke() {
        val client =
            AvaraOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invitationServiceAsync = client.viewer().users().invitations()

        val responseFuture =
            invitationServiceAsync.revoke(
                InvitationRevokeParams.builder()
                    .invitationId("inv_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
