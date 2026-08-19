// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.viewer.users

import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.InvitedSource
import com.avarasoftware.models.UserLevel
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListResponseTest {

    @Test
    fun create() {
        val userListResponse =
            UserListResponse.builder()
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
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        assertThat(userListResponse.canManageStudies()).isEqualTo(true)
        assertThat(userListResponse.clinicRole()).isEqualTo(ClinicRole.RADIOLOGIST)
        assertThat(userListResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
        assertThat(userListResponse.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(userListResponse.firstName()).isEqualTo("Sarah")
        assertThat(userListResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(userListResponse.invitedSource()).isEqualTo(InvitedSource.API)
        assertThat(userListResponse.lastLoginAt())
            .contains(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
        assertThat(userListResponse.lastName()).isEqualTo("Johnson")
        assertThat(userListResponse.level()).isEqualTo(UserLevel.MEMBER)
        assertThat(userListResponse.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userListResponse.middleName()).contains("Marie")
        assertThat(userListResponse.phoneNumber()).contains("5551234567")
        assertThat(userListResponse.suffix1()).contains("MD")
        assertThat(userListResponse.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListResponse =
            UserListResponse.builder()
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
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        val roundtrippedUserListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListResponse),
                jacksonTypeRef<UserListResponse>(),
            )

        assertThat(roundtrippedUserListResponse).isEqualTo(userListResponse)
    }
}
