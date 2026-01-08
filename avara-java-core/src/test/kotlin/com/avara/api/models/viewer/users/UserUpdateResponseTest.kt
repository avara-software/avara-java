// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.users

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateResponseTest {

    @Test
    fun create() {
        val userUpdateResponse =
            UserUpdateResponse.builder()
                .canManageStudies(true)
                .clinicRole(UserUpdateResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(UserUpdateResponse.InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserUpdateResponse.Level.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        assertThat(userUpdateResponse.canManageStudies()).isEqualTo(true)
        assertThat(userUpdateResponse.clinicRole())
            .isEqualTo(UserUpdateResponse.ClinicRole.RADIOLOGIST)
        assertThat(userUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
        assertThat(userUpdateResponse.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(userUpdateResponse.firstName()).isEqualTo("Sarah")
        assertThat(userUpdateResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(userUpdateResponse.invitedSource())
            .isEqualTo(UserUpdateResponse.InvitedSource.API)
        assertThat(userUpdateResponse.lastLoginAt())
            .contains(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
        assertThat(userUpdateResponse.lastName()).isEqualTo("Johnson")
        assertThat(userUpdateResponse.level()).isEqualTo(UserUpdateResponse.Level.MEMBER)
        assertThat(userUpdateResponse.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userUpdateResponse.middleName()).contains("Marie")
        assertThat(userUpdateResponse.phoneNumber()).contains("5551234567")
        assertThat(userUpdateResponse.suffix1()).contains("MD")
        assertThat(userUpdateResponse.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userUpdateResponse =
            UserUpdateResponse.builder()
                .canManageStudies(true)
                .clinicRole(UserUpdateResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(UserUpdateResponse.InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserUpdateResponse.Level.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        val roundtrippedUserUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userUpdateResponse),
                jacksonTypeRef<UserUpdateResponse>(),
            )

        assertThat(roundtrippedUserUpdateResponse).isEqualTo(userUpdateResponse)
    }
}
