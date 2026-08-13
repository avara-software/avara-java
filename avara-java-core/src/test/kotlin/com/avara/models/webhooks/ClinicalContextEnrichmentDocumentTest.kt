// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalContextEnrichmentDocumentTest {

    @Test
    fun create() {
        val clinicalContextEnrichmentDocument =
            ClinicalContextEnrichmentDocument.builder()
                .addContent("Patient presents with chest pain.")
                .fileName("order-notes.txt")
                .build()

        assertThat(clinicalContextEnrichmentDocument.content())
            .containsExactly("Patient presents with chest pain.")
        assertThat(clinicalContextEnrichmentDocument.fileName()).isEqualTo("order-notes.txt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalContextEnrichmentDocument =
            ClinicalContextEnrichmentDocument.builder()
                .addContent("Patient presents with chest pain.")
                .fileName("order-notes.txt")
                .build()

        val roundtrippedClinicalContextEnrichmentDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalContextEnrichmentDocument),
                jacksonTypeRef<ClinicalContextEnrichmentDocument>(),
            )

        assertThat(roundtrippedClinicalContextEnrichmentDocument)
            .isEqualTo(clinicalContextEnrichmentDocument)
    }
}
