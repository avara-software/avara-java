// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.viewer.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRevokeAccessParamsTest {

    @Test
    fun create() {
        UserRevokeAccessParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()
    }

    @Test
    fun body() {
        val params =
            UserRevokeAccessParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
    }
}
