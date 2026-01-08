// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.users

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListResponseTest {

    @Test
    fun create() {
        val userListResponse =
            UserListResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicRole(UserListResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(UserListResponse.InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserListResponse.Level.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .npiNumber("1234567893")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        assertThat(userListResponse.canCreateReports()).isEqualTo(true)
        assertThat(userListResponse.canManageStudies()).isEqualTo(true)
        assertThat(userListResponse.clinicRole()).isEqualTo(UserListResponse.ClinicRole.RADIOLOGIST)
        assertThat(userListResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
        assertThat(userListResponse.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(userListResponse.firstName()).isEqualTo("Sarah")
        assertThat(userListResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(userListResponse.invitedSource()).isEqualTo(UserListResponse.InvitedSource.API)
        assertThat(userListResponse.lastLoginAt())
            .contains(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
        assertThat(userListResponse.lastName()).isEqualTo("Johnson")
        assertThat(userListResponse.level()).isEqualTo(UserListResponse.Level.MEMBER)
        assertThat(userListResponse.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userListResponse.middleName()).contains("Marie")
        assertThat(userListResponse.npiNumber()).contains("1234567893")
        assertThat(userListResponse.phoneNumber()).contains("5551234567")
        assertThat(userListResponse.suffix1()).contains("MD")
        assertThat(userListResponse.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListResponse =
            UserListResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicRole(UserListResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
                .email("dr.johnson@hospital.org")
                .firstName("Sarah")
                .hasDashboardAccess(true)
                .invitedSource(UserListResponse.InvitedSource.API)
                .lastLoginAt(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
                .lastName("Johnson")
                .level(UserListResponse.Level.MEMBER)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .middleName("Marie")
                .npiNumber("1234567893")
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
