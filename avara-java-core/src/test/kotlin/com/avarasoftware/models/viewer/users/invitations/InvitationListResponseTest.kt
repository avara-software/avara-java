// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.viewer.users.invitations

import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.InvitationStatus
import com.avarasoftware.models.InvitedSource
import com.avarasoftware.models.UserLevel
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationListResponseTest {

    @Test
    fun create() {
        val invitationListResponse =
            InvitationListResponse.builder()
                .canManageStudies(true)
                .clinicId("550e8400-e29b-41d4-a716-446655440000")
                .clinicRole(ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .email("dr.chen@hospital.org")
                .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                .firstName("Michael")
                .hasDashboardAccess(true)
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .invitedSource(InvitedSource.API)
                .inviterId("usr_1234567890abcdef1234567890abcdef")
                .lastName("Chen")
                .level(UserLevel.MEMBER)
                .status(InvitationStatus.SENT)
                .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .userId("usr_1234567890abcdef1234567890abcdef")
                .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .middleName("David")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2(null)
                .build()

        assertThat(invitationListResponse.canManageStudies()).isEqualTo(true)
        assertThat(invitationListResponse.clinicId())
            .isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(invitationListResponse.clinicRole()).isEqualTo(ClinicRole.RADIOLOGIST)
        assertThat(invitationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
        assertThat(invitationListResponse.email()).isEqualTo("dr.chen@hospital.org")
        assertThat(invitationListResponse.expiry())
            .contains(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
        assertThat(invitationListResponse.firstName()).isEqualTo("Michael")
        assertThat(invitationListResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(invitationListResponse.invitationId())
            .isEqualTo("inv_1234567890abcdef1234567890abcdef")
        assertThat(invitationListResponse.invitedSource()).isEqualTo(InvitedSource.API)
        assertThat(invitationListResponse.inviterId())
            .isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(invitationListResponse.lastName()).isEqualTo("Chen")
        assertThat(invitationListResponse.level()).isEqualTo(UserLevel.MEMBER)
        assertThat(invitationListResponse.status()).isEqualTo(InvitationStatus.SENT)
        assertThat(invitationListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
        assertThat(invitationListResponse.userId())
            .isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(invitationListResponse.invitedByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(invitationListResponse.middleName()).contains("David")
        assertThat(invitationListResponse.phoneNumber()).contains("5551234567")
        assertThat(invitationListResponse.suffix1()).contains("MD")
        assertThat(invitationListResponse.suffix2()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationListResponse =
            InvitationListResponse.builder()
                .canManageStudies(true)
                .clinicId("550e8400-e29b-41d4-a716-446655440000")
                .clinicRole(ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .email("dr.chen@hospital.org")
                .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                .firstName("Michael")
                .hasDashboardAccess(true)
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .invitedSource(InvitedSource.API)
                .inviterId("usr_1234567890abcdef1234567890abcdef")
                .lastName("Chen")
                .level(UserLevel.MEMBER)
                .status(InvitationStatus.SENT)
                .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .userId("usr_1234567890abcdef1234567890abcdef")
                .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .middleName("David")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2(null)
                .build()

        val roundtrippedInvitationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationListResponse),
                jacksonTypeRef<InvitationListResponse>(),
            )

        assertThat(roundtrippedInvitationListResponse).isEqualTo(invitationListResponse)
    }
}
