// File generated from our OpenAPI spec by Stainless.

package com.avara.models.express

import com.avara.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressListParamsTest {

    @Test
    fun create() {
        ExpressListParams.builder().cursor("eyJvZmZzZXQiOjIwfQ==").limit(20.0).build()
    }

    @Test
    fun queryParams() {
        val params = ExpressListParams.builder().cursor("eyJvZmZzZXQiOjIwfQ==").limit(20.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "eyJvZmZzZXQiOjIwfQ==")
                    .put("limit", "20.0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExpressListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
