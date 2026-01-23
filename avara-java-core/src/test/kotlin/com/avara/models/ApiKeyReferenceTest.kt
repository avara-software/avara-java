// File generated from our OpenAPI spec by Stainless.

package com.avara.models

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyReferenceTest {

    @Test
    fun create() {
        val apiKeyReference =
            ApiKeyReference.builder()
                .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .description("Production API Key")
                .isViewerEnabled(true)
                .build()

        assertThat(apiKeyReference.apiKeyId()).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(apiKeyReference.description()).isEqualTo("Production API Key")
        assertThat(apiKeyReference.isViewerEnabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyReference =
            ApiKeyReference.builder()
                .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                .description("Production API Key")
                .isViewerEnabled(true)
                .build()

        val roundtrippedApiKeyReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyReference),
                jacksonTypeRef<ApiKeyReference>(),
            )

        assertThat(roundtrippedApiKeyReference).isEqualTo(apiKeyReference)
    }
}
