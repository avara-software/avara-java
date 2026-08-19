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

internal class ClinicalReferenceTest {

    @Test
    fun create() {
        val clinicalReference =
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

        assertThat(clinicalReference.clinicalReferenceId())
            .isEqualTo("ref_1234567890abcdef1234567890abcdef")
        assertThat(clinicalReference.createdAt())
            .contains(OffsetDateTime.parse("2024-01-15T09:00:00Z"))
        assertThat(clinicalReference.isActive()).isEqualTo(true)
        assertThat(clinicalReference.name()).isEqualTo("City Medical Center")
        assertThat(clinicalReference.type()).isEqualTo(ClinicalReferenceType.FACILITY)
        assertThat(clinicalReference.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(clinicalReference.expressCustomer())
            .contains(
                ExpressCustomerReference.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .expressCustomerName("City Medical Center")
                    .build()
            )
        assertThat(clinicalReference.externalReferenceId()).contains("FAC-001")
        assertThat(clinicalReference.metadata())
            .contains(
                ClinicalReference.Metadata.builder()
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clinicalReference =
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

        val roundtrippedClinicalReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clinicalReference),
                jacksonTypeRef<ClinicalReference>(),
            )

        assertThat(roundtrippedClinicalReference).isEqualTo(clinicalReference)
    }
}
