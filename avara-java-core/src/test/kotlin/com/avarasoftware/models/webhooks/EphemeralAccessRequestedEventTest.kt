// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EphemeralAccessRequestedEventTest {

    @Test
    fun create() {
        val ephemeralAccessRequestedEvent =
            EphemeralAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    EphemeralAccessRequestedEventData.builder()
                        .retrievalId("order-12345")
                        .options(
                            EphemeralAccessRequestedEventData.Options.builder()
                                .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(ephemeralAccessRequestedEvent.id())
            .isEqualTo("whe_1234567890abcdef1234567890abcdef")
        assertThat(ephemeralAccessRequestedEvent.data())
            .isEqualTo(
                EphemeralAccessRequestedEventData.builder()
                    .retrievalId("order-12345")
                    .options(
                        EphemeralAccessRequestedEventData.Options.builder()
                            .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ephemeralAccessRequestedEvent =
            EphemeralAccessRequestedEvent.builder()
                .id("whe_1234567890abcdef1234567890abcdef")
                .data(
                    EphemeralAccessRequestedEventData.builder()
                        .retrievalId("order-12345")
                        .options(
                            EphemeralAccessRequestedEventData.Options.builder()
                                .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedEphemeralAccessRequestedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ephemeralAccessRequestedEvent),
                jacksonTypeRef<EphemeralAccessRequestedEvent>(),
            )

        assertThat(roundtrippedEphemeralAccessRequestedEvent)
            .isEqualTo(ephemeralAccessRequestedEvent)
    }
}
