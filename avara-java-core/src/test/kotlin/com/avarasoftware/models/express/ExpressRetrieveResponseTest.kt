// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.express

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressRetrieveResponseTest {

    @Test
    fun create() {
        val expressRetrieveResponse =
            ExpressRetrieveResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center - Radiology Department")
                .isActive(true)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    ExpressRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        assertThat(expressRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(expressRetrieveResponse.expressCustomerId())
            .isEqualTo("cus_1234567890abcdef1234567890abcdef")
        assertThat(expressRetrieveResponse.expressCustomerName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(expressRetrieveResponse.isActive()).isEqualTo(true)
        assertThat(expressRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(expressRetrieveResponse.userCount()).isEqualTo(15L)
        assertThat(expressRetrieveResponse.createdByApiKeyId())
            .contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(expressRetrieveResponse.createdByUserId())
            .contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(expressRetrieveResponse.metadata())
            .contains(
                ExpressRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expressRetrieveResponse =
            ExpressRetrieveResponse.builder()
                .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center - Radiology Department")
                .isActive(true)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .userCount(15L)
                .createdByApiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .createdByUserId("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    ExpressRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val roundtrippedExpressRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expressRetrieveResponse),
                jacksonTypeRef<ExpressRetrieveResponse>(),
            )

        assertThat(roundtrippedExpressRetrieveResponse).isEqualTo(expressRetrieveResponse)
    }
}
