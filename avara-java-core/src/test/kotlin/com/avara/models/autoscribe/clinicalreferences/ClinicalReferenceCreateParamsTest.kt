// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

import com.avara.core.JsonValue
import com.avara.models.autoscribe.ClinicalReferenceType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalReferenceCreateParamsTest {

    @Test
    fun create() {
        ClinicalReferenceCreateParams.builder()
            .name("City Medical Center")
            .type(ClinicalReferenceType.FACILITY)
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .externalReferenceId("FAC-001")
            .metadata(
                ClinicalReferenceCreateParams.Metadata.builder()
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ClinicalReferenceCreateParams.builder()
                .name("City Medical Center")
                .type(ClinicalReferenceType.FACILITY)
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .externalReferenceId("FAC-001")
                .metadata(
                    ClinicalReferenceCreateParams.Metadata.builder()
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("City Medical Center")
        assertThat(body.type()).isEqualTo(ClinicalReferenceType.FACILITY)
        assertThat(body.expressCustomerId()).contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(body.externalReferenceId()).contains("FAC-001")
        assertThat(body.metadata())
            .contains(
                ClinicalReferenceCreateParams.Metadata.builder()
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ClinicalReferenceCreateParams.builder()
                .name("City Medical Center")
                .type(ClinicalReferenceType.FACILITY)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("City Medical Center")
        assertThat(body.type()).isEqualTo(ClinicalReferenceType.FACILITY)
    }
}
