// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

import com.avara.core.http.QueryParams
import com.avara.models.autoscribe.ClinicalReferenceType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalReferenceListParamsTest {

    @Test
    fun create() {
        ClinicalReferenceListParams.builder()
            .cursor("eyJjcmVhdGVkQXQiOiIyMDI0LTAxLTE1VDA5OjAwOjAwWiJ9")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .isActive(true)
            .limit(20.0)
            .type(ClinicalReferenceType.FACILITY)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ClinicalReferenceListParams.builder()
                .cursor("eyJjcmVhdGVkQXQiOiIyMDI0LTAxLTE1VDA5OjAwOjAwWiJ9")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .isActive(true)
                .limit(20.0)
                .type(ClinicalReferenceType.FACILITY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "eyJjcmVhdGVkQXQiOiIyMDI0LTAxLTE1VDA5OjAwOjAwWiJ9")
                    .put("expressCustomerId", "cus_1234567890abcdef1234567890abcdef")
                    .put("isActive", "true")
                    .put("limit", "20.0")
                    .put("type", "facility")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ClinicalReferenceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
