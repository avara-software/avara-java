// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import com.avara.api.core.JsonValue
import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgUpdateResponseTest {

    @Test
    fun create() {
        val orgUpdateResponse =
            OrgUpdateResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        assertThat(orgUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(orgUpdateResponse.isActive()).isEqualTo(true)
        assertThat(orgUpdateResponse.orgId()).isEqualTo("org_1234567890abcdef1234567890abcdef")
        assertThat(orgUpdateResponse.orgName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(orgUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(orgUpdateResponse.userCount()).isEqualTo(15L)
        assertThat(orgUpdateResponse.createdByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(orgUpdateResponse.createdByUserId())
            .contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(orgUpdateResponse.metadata())
            .contains(
                OrgUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgUpdateResponse =
            OrgUpdateResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .isActive(true)
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center - Radiology Department")
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val roundtrippedOrgUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgUpdateResponse),
                jacksonTypeRef<OrgUpdateResponse>(),
            )

        assertThat(roundtrippedOrgUpdateResponse).isEqualTo(orgUpdateResponse)
    }
}
