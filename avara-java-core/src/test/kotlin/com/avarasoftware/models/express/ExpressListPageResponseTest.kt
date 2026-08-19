// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.express

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressListPageResponseTest {

    @Test
    fun create() {
        val expressListPageResponse =
            ExpressListPageResponse.builder()
                .addExpressCustomer(
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
                )
                .hasMore(true)
                .cursor("cursor")
                .build()

        assertThat(expressListPageResponse.expressCustomers())
            .containsExactly(
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
            )
        assertThat(expressListPageResponse.hasMore()).isEqualTo(true)
        assertThat(expressListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expressListPageResponse =
            ExpressListPageResponse.builder()
                .addExpressCustomer(
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
                )
                .hasMore(true)
                .cursor("cursor")
                .build()

        val roundtrippedExpressListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expressListPageResponse),
                jacksonTypeRef<ExpressListPageResponse>(),
            )

        assertThat(roundtrippedExpressListPageResponse).isEqualTo(expressListPageResponse)
    }
}
