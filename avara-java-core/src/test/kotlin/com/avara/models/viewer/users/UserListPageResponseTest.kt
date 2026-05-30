// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.users

import com.avara.core.jsonMapper
import com.avara.models.ClinicRole
import com.avara.models.InvitedSource
import com.avara.models.UserLevel
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListPageResponseTest {

    @Test
    fun create() {
        val userListPageResponse =
            UserListPageResponse.builder()
                .hasMore(true)
                .addUser(
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
                )
                .cursor("cursor")
                .build()

        assertThat(userListPageResponse.hasMore()).isEqualTo(true)
        assertThat(userListPageResponse.users())
            .containsExactly(
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
            )
        assertThat(userListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListPageResponse =
            UserListPageResponse.builder()
                .hasMore(true)
                .addUser(
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
                )
                .cursor("cursor")
                .build()

        val roundtrippedUserListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListPageResponse),
                jacksonTypeRef<UserListPageResponse>(),
            )

        assertThat(roundtrippedUserListPageResponse).isEqualTo(userListPageResponse)
    }
}
