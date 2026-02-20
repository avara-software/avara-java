// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer.users

import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.models.viewer.users.invitations.InvitationRevokeParams
import com.avara.models.viewer.users.invitations.InvitationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvitationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.viewer().users().invitations()

        val invitation = invitationService.retrieve("inv_1234567890abcdef1234567890abcdef")

        invitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.viewer().users().invitations()

        val invitation =
            invitationService.update(
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

        invitation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.viewer().users().invitations()

        val page = invitationService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun revoke() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.viewer().users().invitations()

        val response =
            invitationService.revoke(
                InvitationRevokeParams.builder()
                    .invitationId("inv_1234567890abcdef1234567890abcdef")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .build()
            )

        response.validate()
    }
}
