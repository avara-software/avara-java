// File generated from our OpenAPI spec by Stainless.

package com.avara.models.orgs

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgDeactivateResponseTest {

    @Test
    fun create() {
        val orgDeactivateResponse =
            OrgDeactivateResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgDeactivateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        assertThat(orgDeactivateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(orgDeactivateResponse.isActive()).isEqualTo(true)
        assertThat(orgDeactivateResponse.orgId()).isEqualTo("org_1234567890abcdef1234567890abcdef")
        assertThat(orgDeactivateResponse.orgName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(orgDeactivateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(orgDeactivateResponse.userCount()).isEqualTo(15L)
        assertThat(orgDeactivateResponse.createdByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(orgDeactivateResponse.createdByUserId())
            .contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(orgDeactivateResponse.metadata())
            .contains(
                OrgDeactivateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgDeactivateResponse =
            OrgDeactivateResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgDeactivateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val roundtrippedOrgDeactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgDeactivateResponse),
                jacksonTypeRef<OrgDeactivateResponse>(),
            )

        assertThat(roundtrippedOrgDeactivateResponse).isEqualTo(orgDeactivateResponse)
    }
}
