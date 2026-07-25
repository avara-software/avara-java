// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalReferenceRetrieveByExternalReferenceIdParamsTest {

    @Test
    fun create() {
        ClinicalReferenceRetrieveByExternalReferenceIdParams.builder()
            .externalReferenceId("FAC-001")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ClinicalReferenceRetrieveByExternalReferenceIdParams.builder()
                .externalReferenceId("FAC-001")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("FAC-001")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
