// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe.users

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.models.AssignableUserLevel
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.autoscribe.users.invitations.InvitationRevokeParams
import com.avarasoftware.models.autoscribe.users.invitations.InvitationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvitationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.autoScribe().users().invitations()

        val invitation = invitationService.retrieve("inv_1234567890abcdef1234567890abcdef")

        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.autoScribe().users().invitations()

        val invitation =
            invitationService.update(
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

        invitation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.autoScribe().users().invitations()

        val page = invitationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val invitationService = client.autoScribe().users().invitations()

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
