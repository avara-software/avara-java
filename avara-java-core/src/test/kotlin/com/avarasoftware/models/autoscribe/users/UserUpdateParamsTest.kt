// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.users

import com.avarasoftware.models.AssignableUserLevel
import com.avarasoftware.models.ClinicRole
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            UserUpdateParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.canCreateReports()).contains(true)
        assertThat(body.canManageStudies()).contains(true)
        assertThat(body.clinicRole()).contains(ClinicRole.RADIOLOGIST)
        assertThat(body.firstName()).contains("Sarah")
        assertThat(body.hasDashboardAccess()).contains(true)
        assertThat(body.lastName()).contains("Johnson-Smith")
        assertThat(body.level()).contains(AssignableUserLevel.ADMIN)
        assertThat(body.middleName()).contains("x")
        assertThat(body.npiNumber()).contains("1234567893")
        assertThat(body.phoneNumber()).contains("5551234567")
        assertThat(body.suffix1()).contains("x")
        assertThat(body.suffix2()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserUpdateParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()

        val body = params._body()
    }
}
