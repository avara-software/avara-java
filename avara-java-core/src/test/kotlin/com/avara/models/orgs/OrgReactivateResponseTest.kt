// File generated from our OpenAPI spec by Stainless.

package com.avara.models.orgs

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgReactivateResponseTest {

    @Test
    fun create() {
        val orgReactivateResponse =
            OrgReactivateResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgReactivateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        assertThat(orgReactivateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(orgReactivateResponse.isActive()).isEqualTo(true)
        assertThat(orgReactivateResponse.orgId()).isEqualTo("org_1234567890abcdef1234567890abcdef")
        assertThat(orgReactivateResponse.orgName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(orgReactivateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(orgReactivateResponse.userCount()).isEqualTo(15L)
        assertThat(orgReactivateResponse.createdByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(orgReactivateResponse.createdByUserId())
            .contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(orgReactivateResponse.metadata())
            .contains(
                OrgReactivateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgReactivateResponse =
            OrgReactivateResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgReactivateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val roundtrippedOrgReactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgReactivateResponse),
                jacksonTypeRef<OrgReactivateResponse>(),
            )

        assertThat(roundtrippedOrgReactivateResponse).isEqualTo(orgReactivateResponse)
    }
}
