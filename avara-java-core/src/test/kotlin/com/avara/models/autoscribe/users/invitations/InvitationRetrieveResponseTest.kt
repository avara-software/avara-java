// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.users.invitations

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationRetrieveResponseTest {

    @Test
    fun create() {
        val invitationRetrieveResponse =
            InvitationRetrieveResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicId("550e8400-e29b-41d4-a716-446655440000")
                .clinicRole(InvitationRetrieveResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .email("dr.chen@hospital.org")
                .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                .firstName("Michael")
                .hasDashboardAccess(true)
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .invitedSource(InvitationRetrieveResponse.InvitedSource.API)
                .inviterId("usr_1234567890abcdef1234567890abcdef")
                .lastName("Chen")
                .level(InvitationRetrieveResponse.Level.MEMBER)
                .status(InvitationRetrieveResponse.Status.SENT)
                .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .userId("usr_1234567890abcdef1234567890abcdef")
                .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .middleName("David")
                .npiNumber("1234567893")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2(null)
                .build()

        assertThat(invitationRetrieveResponse.canCreateReports()).isEqualTo(true)
        assertThat(invitationRetrieveResponse.canManageStudies()).isEqualTo(true)
        assertThat(invitationRetrieveResponse.clinicId())
            .isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(invitationRetrieveResponse.clinicRole())
            .isEqualTo(InvitationRetrieveResponse.ClinicRole.RADIOLOGIST)
        assertThat(invitationRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
        assertThat(invitationRetrieveResponse.email()).isEqualTo("dr.chen@hospital.org")
        assertThat(invitationRetrieveResponse.expiry())
            .contains(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
        assertThat(invitationRetrieveResponse.firstName()).isEqualTo("Michael")
        assertThat(invitationRetrieveResponse.hasDashboardAccess()).isEqualTo(true)
        assertThat(invitationRetrieveResponse.invitationId())
            .isEqualTo("inv_1234567890abcdef1234567890abcdef")
        assertThat(invitationRetrieveResponse.invitedSource())
            .isEqualTo(InvitationRetrieveResponse.InvitedSource.API)
        assertThat(invitationRetrieveResponse.inviterId())
            .isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(invitationRetrieveResponse.lastName()).isEqualTo("Chen")
        assertThat(invitationRetrieveResponse.level())
            .isEqualTo(InvitationRetrieveResponse.Level.MEMBER)
        assertThat(invitationRetrieveResponse.status())
            .isEqualTo(InvitationRetrieveResponse.Status.SENT)
        assertThat(invitationRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
        assertThat(invitationRetrieveResponse.userId())
            .isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(invitationRetrieveResponse.invitedByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(invitationRetrieveResponse.middleName()).contains("David")
        assertThat(invitationRetrieveResponse.npiNumber()).contains("1234567893")
        assertThat(invitationRetrieveResponse.phoneNumber()).contains("5551234567")
        assertThat(invitationRetrieveResponse.suffix1()).contains("MD")
        assertThat(invitationRetrieveResponse.suffix2()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationRetrieveResponse =
            InvitationRetrieveResponse.builder()
                .canCreateReports(true)
                .canManageStudies(true)
                .clinicId("550e8400-e29b-41d4-a716-446655440000")
                .clinicRole(InvitationRetrieveResponse.ClinicRole.RADIOLOGIST)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .email("dr.chen@hospital.org")
                .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                .firstName("Michael")
                .hasDashboardAccess(true)
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .invitedSource(InvitationRetrieveResponse.InvitedSource.API)
                .inviterId("usr_1234567890abcdef1234567890abcdef")
                .lastName("Chen")
                .level(InvitationRetrieveResponse.Level.MEMBER)
                .status(InvitationRetrieveResponse.Status.SENT)
                .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                .userId("usr_1234567890abcdef1234567890abcdef")
                .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .middleName("David")
                .npiNumber("1234567893")
                .phoneNumber("5551234567")
                .suffix1("MD")
                .suffix2(null)
                .build()

        val roundtrippedInvitationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationRetrieveResponse),
                jacksonTypeRef<InvitationRetrieveResponse>(),
            )

        assertThat(roundtrippedInvitationRetrieveResponse).isEqualTo(invitationRetrieveResponse)
    }
}
