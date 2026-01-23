// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.users

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserInviteResponseTest {

    @Test
    fun create() {
        val userInviteResponse =
            UserInviteResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicRole(UserInviteResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(UserInviteResponse.InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserInviteResponse.Level.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .npiNumber("1234567893")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        assertThat(userInviteResponse.canCreateReports()).isEqualTo(true)
        assertThat(userInviteResponse.canManageStudies()).isEqualTo(true)
        assertThat(userInviteResponse.clinicRole())
            .isEqualTo(UserInviteResponse.ClinicRole.RADIOLOGIST)
        assertThat(userInviteResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
        assertThat(userInviteResponse.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(userInviteResponse.firstName()).isEqualTo("Sarah")
        assertThat(userInviteResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(userInviteResponse.invitedSource())
            .isEqualTo(UserInviteResponse.InvitedSource.API)
        assertThat(userInviteResponse.lastLoginAt())
            .contains(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
        assertThat(userInviteResponse.lastName()).isEqualTo("Johnson")
        assertThat(userInviteResponse.level()).isEqualTo(UserInviteResponse.Level.MEMBER)
        assertThat(userInviteResponse.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userInviteResponse.middleName()).contains("Marie")
        assertThat(userInviteResponse.npiNumber()).contains("1234567893")
        assertThat(userInviteResponse.phoneNumber()).contains("5551234567")
        assertThat(userInviteResponse.suffix1()).contains("MD")
        assertThat(userInviteResponse.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userInviteResponse =
            UserInviteResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicRole(UserInviteResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(UserInviteResponse.InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserInviteResponse.Level.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .npiNumber("1234567893")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        val roundtrippedUserInviteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userInviteResponse),
                jacksonTypeRef<UserInviteResponse>(),
            )

        assertThat(roundtrippedUserInviteResponse).isEqualTo(userInviteResponse)
    }
}
