// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.users

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRevokeAccessResponseTest {

    @Test
    fun create() {
        val userRevokeAccessResponse =
            UserRevokeAccessResponse.builder()
                .success(true)
                .message("User access revoked successfully")
                .build()

        assertThat(userRevokeAccessResponse.success()).isEqualTo(true)
        assertThat(userRevokeAccessResponse.message()).contains("User access revoked successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRevokeAccessResponse =
            UserRevokeAccessResponse.builder()
                .success(true)
                .message("User access revoked successfully")
                .build()

        val roundtrippedUserRevokeAccessResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRevokeAccessResponse),
                jacksonTypeRef<UserRevokeAccessResponse>(),
            )

        assertThat(roundtrippedUserRevokeAccessResponse).isEqualTo(userRevokeAccessResponse)
    }
}
