// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.users

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserReactivateResponseTest {

    @Test
    fun create() {
        val userReactivateResponse =
            UserReactivateResponse.builder()
                .success(true)
                .message("User reactivated successfully")
                .build()

        assertThat(userReactivateResponse.success()).isEqualTo(true)
        assertThat(userReactivateResponse.message()).contains("User reactivated successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userReactivateResponse =
            UserReactivateResponse.builder()
                .success(true)
                .message("User reactivated successfully")
                .build()

        val roundtrippedUserReactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userReactivateResponse),
                jacksonTypeRef<UserReactivateResponse>(),
            )

        assertThat(roundtrippedUserReactivateResponse).isEqualTo(userReactivateResponse)
    }
}
