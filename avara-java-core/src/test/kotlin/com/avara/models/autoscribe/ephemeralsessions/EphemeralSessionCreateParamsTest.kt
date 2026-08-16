// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.ephemeralsessions

import com.avara.core.JsonValue
import com.avara.models.EphemeralHangingProtocol
import com.avara.models.ViewerLayout
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemeralSessionCreateParamsTest {

    @Test
    fun create() {
        EphemeralSessionCreateParams.builder()
            .retrievalId("order-12345")
            .hangingProtocol(
                EphemeralHangingProtocol.builder()
                    .layout(ViewerLayout.TWO_BY_TWO)
                    .viewportAssignments(listOf("Axial T1", "Axial T2", null, "Sagittal T2"))
                    .build()
            )
            .options(
                EphemeralSessionCreateParams.Options.builder()
                    .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EphemeralSessionCreateParams.builder()
                .retrievalId("order-12345")
                .hangingProtocol(
                    EphemeralHangingProtocol.builder()
                        .layout(ViewerLayout.TWO_BY_TWO)
                        .viewportAssignments(listOf("Axial T1", "Axial T2", null, "Sagittal T2"))
                        .build()
                )
                .options(
                    EphemeralSessionCreateParams.Options.builder()
                        .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.retrievalId()).isEqualTo("order-12345")
        assertThat(body.hangingProtocol())
            .contains(
                EphemeralHangingProtocol.builder()
                    .layout(ViewerLayout.TWO_BY_TWO)
                    .viewportAssignments(listOf("Axial T1", "Axial T2", null, "Sagittal T2"))
                    .build()
            )
        assertThat(body.options())
            .contains(
                EphemeralSessionCreateParams.Options.builder()
                    .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EphemeralSessionCreateParams.builder().retrievalId("order-12345").build()

        val body = params._body()

        assertThat(body.retrievalId()).isEqualTo("order-12345")
    }
}
