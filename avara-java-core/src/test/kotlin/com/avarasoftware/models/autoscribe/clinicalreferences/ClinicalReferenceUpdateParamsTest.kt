// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.clinicalreferences

import com.avarasoftware.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalReferenceUpdateParamsTest {

    @Test
    fun create() {
        ClinicalReferenceUpdateParams.builder()
            .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .metadata(
                ClinicalReferenceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .putAdditionalProperty("wing", JsonValue.from("Building A"))
                    .build()
            )
            .name("City Medical Center - Main Campus")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ClinicalReferenceUpdateParams.builder()
                .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ref_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ClinicalReferenceUpdateParams.builder()
                .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .metadata(
                    ClinicalReferenceUpdateParams.Metadata.builder()
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .putAdditionalProperty("wing", JsonValue.from("Building A"))
                        .build()
                )
                .name("City Medical Center - Main Campus")
                .build()

        val body = params._body()

        assertThat(body.expressCustomerId()).contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(body.metadata())
            .contains(
                ClinicalReferenceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .putAdditionalProperty("wing", JsonValue.from("Building A"))
                    .build()
            )
        assertThat(body.name()).contains("City Medical Center - Main Campus")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ClinicalReferenceUpdateParams.builder()
                .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                .build()

        val body = params._body()
    }
}
