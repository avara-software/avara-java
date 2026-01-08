// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import com.avara.api.core.JsonValue
import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgListResponseTest {

    @Test
    fun create() {
        val orgListResponse =
            OrgListResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgListResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        assertThat(orgListResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(orgListResponse.isActive()).isEqualTo(true)
        assertThat(orgListResponse.orgId()).isEqualTo("org_1234567890abcdef1234567890abcdef")
        assertThat(orgListResponse.orgName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(orgListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(orgListResponse.userCount()).isEqualTo(15L)
        assertThat(orgListResponse.createdByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(orgListResponse.createdByUserId())
            .contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(orgListResponse.metadata())
            .contains(
                OrgListResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgListResponse =
            OrgListResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgListResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val roundtrippedOrgListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgListResponse),
                jacksonTypeRef<OrgListResponse>(),
            )

        assertThat(roundtrippedOrgListResponse).isEqualTo(orgListResponse)
    }
}
