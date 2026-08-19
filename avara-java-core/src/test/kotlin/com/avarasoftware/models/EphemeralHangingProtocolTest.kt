// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemeralHangingProtocolTest {

    @Test
    fun create() {
        val ephemeralHangingProtocol =
            EphemeralHangingProtocol.builder()
                .layout(ViewerLayout.TWO_BY_TWO)
                .viewportAssignments(listOf("Axial T1", "Axial T2", null, "Sagittal T2"))
                .build()

        assertThat(ephemeralHangingProtocol.layout()).isEqualTo(ViewerLayout.TWO_BY_TWO)
        assertThat(ephemeralHangingProtocol.viewportAssignments())
            .containsExactly("Axial T1", "Axial T2", null, "Sagittal T2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemeralHangingProtocol =
            EphemeralHangingProtocol.builder()
                .layout(ViewerLayout.TWO_BY_TWO)
                .viewportAssignments(listOf("Axial T1", "Axial T2", null, "Sagittal T2"))
                .build()

        val roundtrippedEphemeralHangingProtocol =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemeralHangingProtocol),
                jacksonTypeRef<EphemeralHangingProtocol>(),
            )

        assertThat(roundtrippedEphemeralHangingProtocol).isEqualTo(ephemeralHangingProtocol)
    }
}
