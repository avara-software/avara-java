// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs.users

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRemoveResponseTest {

    @Test
    fun create() {
        val userRemoveResponse =
            UserRemoveResponse.builder()
                .success(true)
                .message("Operation completed successfully")
                .build()

        assertThat(userRemoveResponse.success()).isEqualTo(true)
        assertThat(userRemoveResponse.message()).contains("Operation completed successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRemoveResponse =
            UserRemoveResponse.builder()
                .success(true)
                .message("Operation completed successfully")
                .build()

        val roundtrippedUserRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRemoveResponse),
                jacksonTypeRef<UserRemoveResponse>(),
            )

        assertThat(roundtrippedUserRemoveResponse).isEqualTo(userRemoveResponse)
    }
}
