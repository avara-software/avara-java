// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecondaryCaptureAccessRequestedResponseTest {

    @Test
    fun create() {
        val secondaryCaptureAccessRequestedResponse =
            SecondaryCaptureAccessRequestedResponse.builder()
                .authorized(true)
                .addUploadUrl("https://storage.example.com/dicom/sc-object.dcm?token=put123")
                .contentCreatorName("Dr. Jane Smith")
                .error("Study not found in PACS")
                .build()

        assertThat(secondaryCaptureAccessRequestedResponse.authorized()).isEqualTo(true)
        assertThat(secondaryCaptureAccessRequestedResponse.uploadUrls())
            .containsExactly("https://storage.example.com/dicom/sc-object.dcm?token=put123")
        assertThat(secondaryCaptureAccessRequestedResponse.contentCreatorName())
            .contains("Dr. Jane Smith")
        assertThat(secondaryCaptureAccessRequestedResponse.error())
            .contains("Study not found in PACS")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secondaryCaptureAccessRequestedResponse =
            SecondaryCaptureAccessRequestedResponse.builder()
                .authorized(true)
                .addUploadUrl("https://storage.example.com/dicom/sc-object.dcm?token=put123")
                .contentCreatorName("Dr. Jane Smith")
                .error("Study not found in PACS")
                .build()

        val roundtrippedSecondaryCaptureAccessRequestedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secondaryCaptureAccessRequestedResponse),
                jacksonTypeRef<SecondaryCaptureAccessRequestedResponse>(),
            )

        assertThat(roundtrippedSecondaryCaptureAccessRequestedResponse)
            .isEqualTo(secondaryCaptureAccessRequestedResponse)
    }
}
