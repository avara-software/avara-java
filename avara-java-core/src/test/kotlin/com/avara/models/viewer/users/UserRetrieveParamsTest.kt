// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveParamsTest {

    @Test
    fun create() {
        UserRetrieveParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()
    }

    @Test
    fun pathParams() {
        val params =
            UserRetrieveParams.builder().userId("usr_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
