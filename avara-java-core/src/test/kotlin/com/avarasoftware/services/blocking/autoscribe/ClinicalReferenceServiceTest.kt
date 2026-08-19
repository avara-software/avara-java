// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.core.JsonValue
import com.avarasoftware.models.autoscribe.ClinicalReferenceType
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceCreateParams
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClinicalReferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val clinicalReferenceService = client.autoScribe().clinicalReferences()

        val clinicalReference =
            clinicalReferenceService.create(
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
            )

        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val clinicalReferenceService = client.autoScribe().clinicalReferences()

        val clinicalReference =
            clinicalReferenceService.retrieve("ref_1234567890abcdef1234567890abcdef")

        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val clinicalReferenceService = client.autoScribe().clinicalReferences()

        val clinicalReference =
            clinicalReferenceService.update(
                ClinicalReferenceUpdateParams.builder()
                    .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .metadata(
                        ClinicalReferenceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("region", JsonValue.from("northeast"))
                            .putAdditionalProperty("wing", JsonValue.from("Building A"))
                            .build()
                    )
                    .name("City Medical Center - Main Campus")
                    .build()
            )

        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val clinicalReferenceService = client.autoScribe().clinicalReferences()

        val page = clinicalReferenceService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val clinicalReferenceService = client.autoScribe().clinicalReferences()

        val clinicalReference =
            clinicalReferenceService.delete("ref_1234567890abcdef1234567890abcdef")

        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByExternalReferenceId() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val clinicalReferenceService = client.autoScribe().clinicalReferences()

        val clinicalReference = clinicalReferenceService.retrieveByExternalReferenceId("FAC-001")

        clinicalReference.validate()
    }
}
