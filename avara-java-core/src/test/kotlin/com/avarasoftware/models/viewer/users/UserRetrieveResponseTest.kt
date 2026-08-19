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

internal class UserRetrieveResponseTest {

    @Test
    fun create() {
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
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

        assertThat(userRetrieveResponse.canManageStudies()).isEqualTo(true)
        assertThat(userRetrieveResponse.clinicRole()).isEqualTo(ClinicRole.RADIOLOGIST)
        assertThat(userRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T10:00:00Z"))
        assertThat(userRetrieveResponse.email()).isEqualTo("dr.johnson@hospital.org")
        assertThat(userRetrieveResponse.firstName()).isEqualTo("Sarah")
        assertThat(userRetrieveResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(userRetrieveResponse.invitedSource()).isEqualTo(InvitedSource.API)
        assertThat(userRetrieveResponse.lastLoginAt())
            .contains(OffsetDateTime.parse("2024-03-15T09:00:00Z"))
        assertThat(userRetrieveResponse.lastName()).isEqualTo("Johnson")
        assertThat(userRetrieveResponse.level()).isEqualTo(UserLevel.MEMBER)
        assertThat(userRetrieveResponse.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userRetrieveResponse.middleName()).contains("Marie")
        assertThat(userRetrieveResponse.phoneNumber()).contains("5551234567")
        assertThat(userRetrieveResponse.suffix1()).contains("MD")
        assertThat(userRetrieveResponse.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRetrieveResponse =
            UserRetrieveResponse.builder()
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

        val roundtrippedUserRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRetrieveResponse),
                jacksonTypeRef<UserRetrieveResponse>(),
            )

        assertThat(roundtrippedUserRetrieveResponse).isEqualTo(userRetrieveResponse)
    }
}
