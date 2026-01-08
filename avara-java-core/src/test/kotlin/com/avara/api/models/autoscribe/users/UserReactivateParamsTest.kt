// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserReactivateParamsTest {

    @Test
    fun create() {
        UserReactivateParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()
    }

    @Test
    fun body() {
        val params =
            UserReactivateParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
    }
}
