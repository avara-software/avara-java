// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRemoveParamsTest {

    @Test
    fun create() {
        UserRemoveParams.builder()
            .orgId("org_1234567890abcdef1234567890abcdef")
            .userId("usr_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserRemoveParams.builder()
                .orgId("org_1234567890abcdef1234567890abcdef")
                .userId("usr_1234567890abcdef1234567890abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("org_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserRemoveParams.builder()
                .orgId("org_1234567890abcdef1234567890abcdef")
                .userId("usr_1234567890abcdef1234567890abcdef")
                .build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
    }
}
