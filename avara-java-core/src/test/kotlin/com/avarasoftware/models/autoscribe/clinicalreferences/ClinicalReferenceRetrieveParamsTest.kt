// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.clinicalreferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalReferenceRetrieveParamsTest {

    @Test
    fun create() {
        ClinicalReferenceRetrieveParams.builder()
            .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ClinicalReferenceRetrieveParams.builder()
                .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ref_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
