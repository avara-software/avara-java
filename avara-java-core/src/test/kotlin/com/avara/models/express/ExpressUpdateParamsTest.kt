// File generated from our OpenAPI spec by Stainless.

package com.avara.models.express

import com.avara.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressUpdateParamsTest {

    @Test
    fun create() {
        ExpressUpdateParams.builder()
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .expressCustomerName("City Medical Center - Radiology & Imaging")
            .metadata(
                ExpressUpdateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .putAdditionalProperty("wing", JsonValue.from("Building A"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExpressUpdateParams.builder()
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("cus_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExpressUpdateParams.builder()
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center - Radiology & Imaging")
                .metadata(
                    ExpressUpdateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .putAdditionalProperty("wing", JsonValue.from("Building A"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.expressCustomerName()).contains("City Medical Center - Radiology & Imaging")
        assertThat(body.metadata())
            .contains(
                ExpressUpdateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .putAdditionalProperty("wing", JsonValue.from("Building A"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExpressUpdateParams.builder()
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .build()

        val body = params._body()
    }
}
