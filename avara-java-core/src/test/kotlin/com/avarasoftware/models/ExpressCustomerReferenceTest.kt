// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpressCustomerReferenceTest {

    @Test
    fun create() {
        val expressCustomerReference =
            ExpressCustomerReference.builder()
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center")
                .build()

        assertThat(expressCustomerReference.expressCustomerId())
            .isEqualTo("cus_1234567890abcdef1234567890abcdef")
        assertThat(expressCustomerReference.expressCustomerName()).isEqualTo("City Medical Center")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expressCustomerReference =
            ExpressCustomerReference.builder()
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .expressCustomerName("City Medical Center")
                .build()

        val roundtrippedExpressCustomerReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expressCustomerReference),
                jacksonTypeRef<ExpressCustomerReference>(),
            )

        assertThat(roundtrippedExpressCustomerReference).isEqualTo(expressCustomerReference)
    }
}
