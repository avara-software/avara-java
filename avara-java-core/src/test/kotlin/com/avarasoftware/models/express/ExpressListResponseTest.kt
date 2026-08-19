// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.express

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressListResponseTest {

    @Test
    fun create() {
        val expressListResponse =
            ExpressListResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center - Radiology Department")
                .isActive(true)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    ExpressListResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        assertThat(expressListResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(expressListResponse.expressCustomerId())
            .isEqualTo("cus_1234567890abcdef1234567890abcdef")
        assertThat(expressListResponse.expressCustomerName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(expressListResponse.isActive()).isEqualTo(true)
        assertThat(expressListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(expressListResponse.userCount()).isEqualTo(15L)
        assertThat(expressListResponse.createdByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(expressListResponse.createdByUserId())
            .contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(expressListResponse.metadata())
            .contains(
                ExpressListResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expressListResponse =
            ExpressListResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center - Radiology Department")
                .isActive(true)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    ExpressListResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val roundtrippedExpressListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expressListResponse),
                jacksonTypeRef<ExpressListResponse>(),
            )

        assertThat(roundtrippedExpressListResponse).isEqualTo(expressListResponse)
    }
}
