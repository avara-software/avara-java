// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies.external

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalDeleteResponseTest {

    @Test
    fun create() {
        val externalDeleteResponse =
            ExternalDeleteResponse.builder().success(true).message("message").build()

        assertThat(externalDeleteResponse.success()).isEqualTo(true)
        assertThat(externalDeleteResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalDeleteResponse =
            ExternalDeleteResponse.builder().success(true).message("message").build()

        val roundtrippedExternalDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalDeleteResponse),
                jacksonTypeRef<ExternalDeleteResponse>(),
            )

        assertThat(roundtrippedExternalDeleteResponse).isEqualTo(externalDeleteResponse)
    }
}
