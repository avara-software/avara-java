// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemeralAccessRequestedEventDataTest {

    @Test
    fun create() {
        val ephemeralAccessRequestedEventData =
            EphemeralAccessRequestedEventData.builder()
                .retrievalId("order-12345")
                .options(
                    EphemeralAccessRequestedEventData.Options.builder()
                        .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(ephemeralAccessRequestedEventData.retrievalId()).isEqualTo("order-12345")
        assertThat(ephemeralAccessRequestedEventData.options())
            .contains(
                EphemeralAccessRequestedEventData.Options.builder()
                    .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemeralAccessRequestedEventData =
            EphemeralAccessRequestedEventData.builder()
                .retrievalId("order-12345")
                .options(
                    EphemeralAccessRequestedEventData.Options.builder()
                        .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedEphemeralAccessRequestedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemeralAccessRequestedEventData),
                jacksonTypeRef<EphemeralAccessRequestedEventData>(),
            )

        assertThat(roundtrippedEphemeralAccessRequestedEventData)
            .isEqualTo(ephemeralAccessRequestedEventData)
    }
}
