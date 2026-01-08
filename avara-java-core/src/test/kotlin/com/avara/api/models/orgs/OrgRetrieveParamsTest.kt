// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgRetrieveParamsTest {

    @Test
    fun create() {
        OrgRetrieveParams.builder().orgId("org_1234567890abcdef1234567890abcdef").build()
    }

    @Test
    fun pathParams() {
        val params =
            OrgRetrieveParams.builder().orgId("org_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("org_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
