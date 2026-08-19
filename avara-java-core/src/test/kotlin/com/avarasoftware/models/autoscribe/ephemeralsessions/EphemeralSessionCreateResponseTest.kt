// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.ephemeralsessions

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemeralSessionCreateResponseTest {

    @Test
    fun create() {
        val ephemeralSessionCreateResponse =
            EphemeralSessionCreateResponse.builder()
                .url("https://autoscribe.avarasoftware.com/token/landing?token=abc123")
                .build()

        assertThat(ephemeralSessionCreateResponse.url())
            .isEqualTo("https://autoscribe.avarasoftware.com/token/landing?token=abc123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemeralSessionCreateResponse =
            EphemeralSessionCreateResponse.builder()
                .url("https://autoscribe.avarasoftware.com/token/landing?token=abc123")
                .build()

        val roundtrippedEphemeralSessionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemeralSessionCreateResponse),
                jacksonTypeRef<EphemeralSessionCreateResponse>(),
            )

        assertThat(roundtrippedEphemeralSessionCreateResponse)
            .isEqualTo(ephemeralSessionCreateResponse)
    }
}
