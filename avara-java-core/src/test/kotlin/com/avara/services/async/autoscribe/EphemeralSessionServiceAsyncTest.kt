// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.core.JsonValue
import com.avara.models.EphemeralHangingProtocol
import com.avara.models.ViewerLayout
import com.avara.models.autoscribe.ephemeralsessions.EphemeralSessionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EphemeralSessionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val ephemeralSessionServiceAsync = client.autoScribe().ephemeralSessions()

        val ephemeralSessionFuture =
            ephemeralSessionServiceAsync.create(
                EphemeralSessionCreateParams.builder()
                    .retrievalId("order-12345")
                    .hangingProtocol(
                        EphemeralHangingProtocol.builder()
                            .layout(ViewerLayout._2X2)
                            .viewportAssignments(
                                listOf("Axial T1", "Axial T2", null, "Sagittal T2")
                            )
                            .build()
                    )
                    .options(
                        EphemeralSessionCreateParams.Options.builder()
                            .putAdditionalProperty("studyInstanceUids", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val ephemeralSession = ephemeralSessionFuture.get()
        ephemeralSession.validate()
    }
}
