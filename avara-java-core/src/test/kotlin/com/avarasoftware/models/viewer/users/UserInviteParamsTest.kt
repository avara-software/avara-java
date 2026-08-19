// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.viewer.users

import com.avarasoftware.models.AssignableUserLevel
import com.avarasoftware.models.ClinicRole
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserInviteParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.canManageStudies()).isEqualTo(true)
        assertThat(body.clinicRole()).isEqualTo(ClinicRole.RADIOLOGIST)
        assertThat(body.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(body.firstName()).isEqualTo("Sarah")
        assertThat(body.hasDashboardAccess()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("Johnson")
        assertThat(body.level()).isEqualTo(AssignableUserLevel.MEMBER)
        assertThat(body.middleName()).contains("Marie")
        assertThat(body.phoneNumber()).contains("5551234567")
        assertThat(body.suffix1()).contains("MD")
        assertThat(body.suffix2()).contains("FACR")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserInviteParams.builder()
                .canManageStudies(true)
                .clinicRole(ClinicRole.RADIOLOGIST)
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .lastName("Johnson")
                .level(AssignableUserLevel.MEMBER)
                .build()

        val body = params._body()

        assertThat(body.canManageStudies()).isEqualTo(true)
        assertThat(body.clinicRole()).isEqualTo(ClinicRole.RADIOLOGIST)
        assertThat(body.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(body.firstName()).isEqualTo("Sarah")
        assertThat(body.hasDashboardAccess()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("Johnson")
        assertThat(body.level()).isEqualTo(AssignableUserLevel.MEMBER)
    }
}
