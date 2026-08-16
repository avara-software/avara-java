// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer

import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.core.JsonValue
import com.avara.models.EphemeralHangingProtocol
import com.avara.models.ViewerLayout
import com.avara.models.viewer.ephemeralsessions.EphemeralSessionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EphemeralSessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val ephemeralSessionService = client.viewer().ephemeralSessions()

        val ephemeralSession =
            ephemeralSessionService.create(
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

        ephemeralSession.validate()
    }
}
