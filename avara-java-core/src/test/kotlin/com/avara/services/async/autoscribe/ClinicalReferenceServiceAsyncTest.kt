// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.client.okhttp.AvaraOkHttpClientAsync
import com.avara.core.JsonValue
import com.avara.models.autoscribe.ClinicalReferenceType
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceCreateParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClinicalReferenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clinicalReferenceServiceAsync = client.autoScribe().clinicalReferences()

        val clinicalReferenceFuture =
            clinicalReferenceServiceAsync.create(
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

        val clinicalReference = clinicalReferenceFuture.get()
        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clinicalReferenceServiceAsync = client.autoScribe().clinicalReferences()

        val clinicalReferenceFuture =
            clinicalReferenceServiceAsync.retrieve("ref_1234567890abcdef1234567890abcdef")

        val clinicalReference = clinicalReferenceFuture.get()
        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clinicalReferenceServiceAsync = client.autoScribe().clinicalReferences()

        val clinicalReferenceFuture =
            clinicalReferenceServiceAsync.update(
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

        val clinicalReference = clinicalReferenceFuture.get()
        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clinicalReferenceServiceAsync = client.autoScribe().clinicalReferences()

        val pageFuture = clinicalReferenceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clinicalReferenceServiceAsync = client.autoScribe().clinicalReferences()

        val clinicalReferenceFuture =
            clinicalReferenceServiceAsync.delete("ref_1234567890abcdef1234567890abcdef")

        val clinicalReference = clinicalReferenceFuture.get()
        clinicalReference.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByExternalReferenceId() {
        val client = AvaraOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clinicalReferenceServiceAsync = client.autoScribe().clinicalReferences()

        val clinicalReferenceFuture =
            clinicalReferenceServiceAsync.retrieveByExternalReferenceId("FAC-001")

        val clinicalReference = clinicalReferenceFuture.get()
        clinicalReference.validate()
    }
}
