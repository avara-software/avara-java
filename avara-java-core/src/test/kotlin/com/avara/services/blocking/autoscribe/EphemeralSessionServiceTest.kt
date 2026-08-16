// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.core.JsonValue
import com.avara.models.EphemeralHangingProtocol
import com.avara.models.ViewerLayout
import com.avara.models.autoscribe.ephemeralsessions.EphemeralSessionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EphemeralSessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val ephemeralSessionService = client.autoScribe().ephemeralSessions()

        val ephemeralSession =
            ephemeralSessionService.create(
                EphemeralSessionCreateParams.builder()
                    .retrievalId("order-12345")
                    .hangingProtocol(
                        EphemeralHangingProtocol.builder()
                            .layout(ViewerLayout.TWO_BY_TWO)
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

        ephemeralSession.validate()
    }
}
