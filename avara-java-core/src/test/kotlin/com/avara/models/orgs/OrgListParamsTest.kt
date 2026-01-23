// File generated from our OpenAPI spec by Stainless.

package com.avara.models.orgs

import com.avara.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgListParamsTest {

    @Test
    fun create() {
        OrgListParams.builder().cursor("eyJvZmZzZXQiOjIwfQ==").limit(20.0).build()
    }

    @Test
    fun queryParams() {
        val params = OrgListParams.builder().cursor("eyJvZmZzZXQiOjIwfQ==").limit(20.0).build()

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
        val params = OrgListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
