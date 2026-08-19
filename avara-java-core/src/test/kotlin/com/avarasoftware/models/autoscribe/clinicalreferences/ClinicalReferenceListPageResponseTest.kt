// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.clinicalreferences

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.ExpressCustomerReference
import com.avarasoftware.models.autoscribe.ClinicalReferenceType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClinicalReferenceListPageResponseTest {

    @Test
    fun create() {
        val clinicalReferenceListPageResponse =
            ClinicalReferenceListPageResponse.builder()
                .addClinicalReference(
                    ClinicalReference.builder()
                        .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                        .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                        .isActive(true)
                        .name("City Medical Center")
                        .type(ClinicalReferenceType.FACILITY)
                        .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                        .expressCustomer(
                            ExpressCustomerReference.builder()
                                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                                .expressCustomerName("City Medical Center")
                                .build()
                        )
                        .externalReferenceId("FAC-001")
                        .metadata(
                            ClinicalReference.Metadata.builder()
                                .putAdditionalProperty("region", JsonValue.from("northeast"))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .cursor("cursor")
                .build()

        assertThat(clinicalReferenceListPageResponse.clinicalReferences())
            .containsExactly(
                ClinicalReference.builder()
                    .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                    .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                    .isActive(true)
                    .name("City Medical Center")
                    .type(ClinicalReferenceType.FACILITY)
                    .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                    .expressCustomer(
                        ExpressCustomerReference.builder()
                            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                            .expressCustomerName("City Medical Center")
                            .build()
                    )
                    .externalReferenceId("FAC-001")
                    .metadata(
                        ClinicalReference.Metadata.builder()
                            .putAdditionalProperty("region", JsonValue.from("northeast"))
                            .build()
                    )
                    .build()
            )
        assertThat(clinicalReferenceListPageResponse.hasMore()).isEqualTo(true)
        assertThat(clinicalReferenceListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalReferenceListPageResponse =
            ClinicalReferenceListPageResponse.builder()
                .addClinicalReference(
                    ClinicalReference.builder()
                        .clinicalReferenceId("ref_1234567890abcdef1234567890abcdef")
                        .createdAt(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
                        .isActive(true)
                        .name("City Medical Center")
                        .type(ClinicalReferenceType.FACILITY)
                        .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                        .expressCustomer(
                            ExpressCustomerReference.builder()
                                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                                .expressCustomerName("City Medical Center")
                                .build()
                        )
                        .externalReferenceId("FAC-001")
                        .metadata(
                            ClinicalReference.Metadata.builder()
                                .putAdditionalProperty("region", JsonValue.from("northeast"))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .cursor("cursor")
                .build()

        val roundtrippedClinicalReferenceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalReferenceListPageResponse),
                jacksonTypeRef<ClinicalReferenceListPageResponse>(),
            )

        assertThat(roundtrippedClinicalReferenceListPageResponse)
            .isEqualTo(clinicalReferenceListPageResponse)
    }
}
