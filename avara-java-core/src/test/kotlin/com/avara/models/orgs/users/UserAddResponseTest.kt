// File generated from our OpenAPI spec by Stainless.

package com.avara.models.orgs.users

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddResponseTest {

    @Test
    fun create() {
        val userAddResponse =
            UserAddResponse.builder()
                .success(true)
                .message("Operation completed successfully")
                .build()

        assertThat(userAddResponse.success()).isEqualTo(true)
        assertThat(userAddResponse.message()).contains("Operation completed successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userAddResponse =
            UserAddResponse.builder()
                .success(true)
                .message("Operation completed successfully")
                .build()

        val roundtrippedUserAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userAddResponse),
                jacksonTypeRef<UserAddResponse>(),
            )

        assertThat(roundtrippedUserAddResponse).isEqualTo(userAddResponse)
    }
}
