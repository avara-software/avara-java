// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.users.invitations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            InvitationUpdateParams.builder()
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inv_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.canManageStudies()).contains(true)
        assertThat(body.clinicRole()).contains(InvitationUpdateParams.ClinicRole.RADIOLOGIST)
        assertThat(body.firstName()).contains("Michael")
        assertThat(body.hasDashboardAccess()).contains(true)
        assertThat(body.lastName()).contains("Chen")
        assertThat(body.level()).contains(InvitationUpdateParams.Level.ADMIN)
        assertThat(body.middleName()).contains("x")
        assertThat(body.phoneNumber()).contains("5551234567")
        assertThat(body.suffix1()).contains("x")
        assertThat(body.suffix2()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvitationUpdateParams.builder()
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .build()

        val body = params._body()
    }
}
