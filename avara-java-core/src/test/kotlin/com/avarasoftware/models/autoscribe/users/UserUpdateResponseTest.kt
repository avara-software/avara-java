// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.users

import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.InvitedSource
import com.avarasoftware.models.UserLevel
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateResponseTest {

    @Test
    fun create() {
        val userUpdateResponse =
            UserUpdateResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicRole(ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserLevel.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .npiNumber("1234567893")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        assertThat(userUpdateResponse.canCreateReports()).isEqualTo(true)
        assertThat(userUpdateResponse.canManageStudies()).isEqualTo(true)
        assertThat(userUpdateResponse.clinicRole()).isEqualTo(ClinicRole.RADIOLOGIST)
        assertThat(userUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
        assertThat(userUpdateResponse.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(userUpdateResponse.firstName()).isEqualTo("Sarah")
        assertThat(userUpdateResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(userUpdateResponse.invitedSource()).isEqualTo(InvitedSource.API)
        assertThat(userUpdateResponse.lastLoginAt())
            .contains(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
        assertThat(userUpdateResponse.lastName()).isEqualTo("Johnson")
        assertThat(userUpdateResponse.level()).isEqualTo(UserLevel.MEMBER)
        assertThat(userUpdateResponse.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userUpdateResponse.middleName()).contains("Marie")
        assertThat(userUpdateResponse.npiNumber()).contains("1234567893")
        assertThat(userUpdateResponse.phoneNumber()).contains("5551234567")
        assertThat(userUpdateResponse.suffix1()).contains("MD")
        assertThat(userUpdateResponse.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userUpdateResponse =
            UserUpdateResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicRole(ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserLevel.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .npiNumber("1234567893")
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
