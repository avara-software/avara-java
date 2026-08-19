// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async.autoscribe.users

import com.avarasoftware.client.okhttp.AvaraOkHttpClientAsync
import com.avarasoftware.models.AssignableUserLevel
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.autoscribe.users.invitations.InvitationRevokeParams
import com.avarasoftware.models.autoscribe.users.invitations.InvitationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvitationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.autoScribe().users().invitations()

        val invitationFuture =
            invitationServiceAsync.retrieve("inv_1234567890abcdef1234567890abcdef")

        val invitation = invitationFuture.get()
        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.autoScribe().users().invitations()

        val invitationFuture =
            invitationServiceAsync.update(
                InvitationUpdateParams.builder()
                    .invitationId("inv_1234567890abcdef1234567890abcdef")
                    .canCreateReports(true)
                    .canManageStudies(true)
                    .clinicRole(ClinicRole.RADIOLOGIST)
                    .firstName("Michael")
                    .hasDashboardAccess(true)
                    .lastName("Chen")
                    .level(AssignableUserLevel.MEMBER)
                    .middleName("x")
                    .npiNumber("1234567893")
                    .phoneNumber("5551234567")
                    .suffix1("x")
                    .suffix2("x")
                    .build()
            )

        val invitation = invitationFuture.get()
        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.autoScribe().users().invitations()

        val pageFuture = invitationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invitationServiceAsync = client.autoScribe().users().invitations()

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
