// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.users.invitations

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationListPageResponseTest {

    @Test
    fun create() {
        val invitationListPageResponse =
            InvitationListPageResponse.builder()
                .hasMore(true)
                .addInvitation(
                    InvitationListResponse.builder()
                        .canManageStudies(true)
                        .clinicId("550e8400-e29b-41d4-a716-446655440000")
                        .clinicRole(InvitationListResponse.ClinicRole.RADIOLOGIST)
                        .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                        .email("dr.chen@hospital.org")
                        .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                        .firstName("Michael")
                        .hasDashboardAccess(true)
                        .invitationId("inv_1234567890abcdef1234567890abcdef")
                        .invitedSource(InvitationListResponse.InvitedSource.API)
                        .inviterId("usr_1234567890abcdef1234567890abcdef")
                        .lastName("Chen")
                        .level(InvitationListResponse.Level.MEMBER)
                        .status(InvitationListResponse.Status.SENT)
                        .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .middleName("David")
                        .phoneNumber("5551234567")
                        .suffix1("MD")
                        .suffix2(null)
                        .build()
                )
                .cursor("cursor")
                .build()

        assertThat(invitationListPageResponse.hasMore()).isEqualTo(true)
        assertThat(invitationListPageResponse.invitations())
            .containsExactly(
                InvitationListResponse.builder()
                    .canManageStudies(true)
                    .clinicId("550e8400-e29b-41d4-a716-446655440000")
                    .clinicRole(InvitationListResponse.ClinicRole.RADIOLOGIST)
                    .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                    .email("dr.chen@hospital.org")
                    .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                    .firstName("Michael")
                    .hasDashboardAccess(true)
                    .invitationId("inv_1234567890abcdef1234567890abcdef")
                    .invitedSource(InvitationListResponse.InvitedSource.API)
                    .inviterId("usr_1234567890abcdef1234567890abcdef")
                    .lastName("Chen")
                    .level(InvitationListResponse.Level.MEMBER)
                    .status(InvitationListResponse.Status.SENT)
                    .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .middleName("David")
                    .phoneNumber("5551234567")
                    .suffix1("MD")
                    .suffix2(null)
                    .build()
            )
        assertThat(invitationListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationListPageResponse =
            InvitationListPageResponse.builder()
                .hasMore(true)
                .addInvitation(
                    InvitationListResponse.builder()
                        .canManageStudies(true)
                        .clinicId("550e8400-e29b-41d4-a716-446655440000")
                        .clinicRole(InvitationListResponse.ClinicRole.RADIOLOGIST)
                        .createdAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                        .email("dr.chen@hospital.org")
                        .expiry(OffsetDateTime.parse("2024-04-15T00:00:00Z"))
                        .firstName("Michael")
                        .hasDashboardAccess(true)
                        .invitationId("inv_1234567890abcdef1234567890abcdef")
                        .invitedSource(InvitationListResponse.InvitedSource.API)
                        .inviterId("usr_1234567890abcdef1234567890abcdef")
                        .lastName("Chen")
                        .level(InvitationListResponse.Level.MEMBER)
                        .status(InvitationListResponse.Status.SENT)
                        .updatedAt(OffsetDateTime.parse("2024-03-15T10:00:00Z"))
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .invitedByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .middleName("David")
                        .phoneNumber("5551234567")
                        .suffix1("MD")
                        .suffix2(null)
                        .build()
                )
                .cursor("cursor")
                .build()

        val roundtrippedInvitationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationListPageResponse),
                jacksonTypeRef<InvitationListPageResponse>(),
            )

        assertThat(roundtrippedInvitationListPageResponse).isEqualTo(invitationListPageResponse)
    }
}
