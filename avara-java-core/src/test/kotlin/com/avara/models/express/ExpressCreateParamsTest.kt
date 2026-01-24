// File generated from our OpenAPI spec by Stainless.

package com.avara.models.express

import com.avara.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressCreateParamsTest {

    @Test
    fun create() {
        ExpressCreateParams.builder()
            .expressCustomerName("City Medical Center - Radiology Department")
            .metadata(
                ExpressCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExpressCreateParams.builder()
                .expressCustomerName("City Medical Center - Radiology Department")
                .metadata(
                    ExpressCreateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.expressCustomerName())
            .isEqualTo("City Medical Center - Radiology Department")
        assertThat(body.metadata())
            .contains(
                ExpressCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExpressCreateParams.builder()
                .expressCustomerName("City Medical Center - Radiology Department")
                .build()

        val body = params._body()

        assertThat(body.expressCustomerName())
            .isEqualTo("City Medical Center - Radiology Department")
    }
}
