// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.users.invitations

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationUpdateResponseTest {

    @Test
    fun create() {
        val invitationUpdateResponse =
            InvitationUpdateResponse.builder()
                .canManageStudies(true)
                .clinicId("550e8400-e29b-41d4-a716-446655440000")
                .clinicRole(InvitationUpdateResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .email("dr.chen@hospital.org")
                .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                .firstName("Michael")
                .hasDashboardAccess(true)
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .invitedSource(InvitationUpdateResponse.InvitedSource.API)
                .inviterId("usr_1234567890abcdef1234567890abcdef")
                .lastName("Chen")
                .level(InvitationUpdateResponse.Level.MEMBER)
                .status(InvitationUpdateResponse.Status.SENT)
                .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .userId("usr_1234567890abcdef1234567890abcdef")
                .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .middleName("David")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2(null)
                .build()

        assertThat(invitationUpdateResponse.canManageStudies()).isEqualTo(true)
        assertThat(invitationUpdateResponse.clinicId())
            .isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(invitationUpdateResponse.clinicRole())
            .isEqualTo(InvitationUpdateResponse.ClinicRole.RADIOLOGIST)
        assertThat(invitationUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
        assertThat(invitationUpdateResponse.email()).isEqualTo("dr.chen@hospital.org")
        assertThat(invitationUpdateResponse.expiry())
            .contains(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
        assertThat(invitationUpdateResponse.firstName()).isEqualTo("Michael")
        assertThat(invitationUpdateResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(invitationUpdateResponse.invitationId())
            .isEqualTo("inv_1234567890abcdef1234567890abcdef")
        assertThat(invitationUpdateResponse.invitedSource())
            .isEqualTo(InvitationUpdateResponse.InvitedSource.API)
        assertThat(invitationUpdateResponse.inviterId())
            .isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(invitationUpdateResponse.lastName()).isEqualTo("Chen")
        assertThat(invitationUpdateResponse.level())
            .isEqualTo(InvitationUpdateResponse.Level.MEMBER)
        assertThat(invitationUpdateResponse.status())
            .isEqualTo(InvitationUpdateResponse.Status.SENT)
        assertThat(invitationUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
        assertThat(invitationUpdateResponse.userId())
            .isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(invitationUpdateResponse.invitedByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(invitationUpdateResponse.middleName()).contains("David")
        assertThat(invitationUpdateResponse.phoneNumber()).contains("5551234567")
        assertThat(invitationUpdateResponse.suffix1()).contains("MD")
        assertThat(invitationUpdateResponse.suffix2()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationUpdateResponse =
            InvitationUpdateResponse.builder()
                .canManageStudies(true)
                .clinicId("550e8400-e29b-41d4-a716-446655440000")
                .clinicRole(InvitationUpdateResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .email("dr.chen@hospital.org")
                .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                .firstName("Michael")
                .hasDashboardAccess(true)
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .invitedSource(InvitationUpdateResponse.InvitedSource.API)
                .inviterId("usr_1234567890abcdef1234567890abcdef")
                .lastName("Chen")
                .level(InvitationUpdateResponse.Level.MEMBER)
                .status(InvitationUpdateResponse.Status.SENT)
                .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .userId("usr_1234567890abcdef1234567890abcdef")
                .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .middleName("David")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2(null)
                .build()

        val roundtrippedInvitationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationUpdateResponse),
                jacksonTypeRef<InvitationUpdateResponse>(),
            )

        assertThat(roundtrippedInvitationUpdateResponse).isEqualTo(invitationUpdateResponse)
    }
}
