// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalContextEnrichmentDocumentUrlTest {

    @Test
    fun create() {
        val clinicalContextEnrichmentDocumentUrl =
            ClinicalContextEnrichmentDocumentUrl.builder()
                .url("https://ehr.example.com/docs/note.pdf")
                .fileName("clinical-note.pdf")
                .build()

        assertThat(clinicalContextEnrichmentDocumentUrl.url())
            .isEqualTo("https://ehr.example.com/docs/note.pdf")
        assertThat(clinicalContextEnrichmentDocumentUrl.fileName()).contains("clinical-note.pdf")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalContextEnrichmentDocumentUrl =
            ClinicalContextEnrichmentDocumentUrl.builder()
                .url("https://ehr.example.com/docs/note.pdf")
                .fileName("clinical-note.pdf")
                .build()

        val roundtrippedClinicalContextEnrichmentDocumentUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalContextEnrichmentDocumentUrl),
                jacksonTypeRef<ClinicalContextEnrichmentDocumentUrl>(),
            )

        assertThat(roundtrippedClinicalContextEnrichmentDocumentUrl)
            .isEqualTo(clinicalContextEnrichmentDocumentUrl)
    }
}
