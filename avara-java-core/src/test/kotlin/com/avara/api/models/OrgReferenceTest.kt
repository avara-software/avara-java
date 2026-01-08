// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgReferenceTest {

    @Test
    fun create() {
        val orgReference =
            OrgReference.builder()
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center")
                .build()

        assertThat(orgReference.orgId()).isEqualTo("org_1234567890abcdef1234567890abcdef")
        assertThat(orgReference.orgName()).isEqualTo("City Medical Center")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgReference =
            OrgReference.builder()
                .orgId("org_1234567890abcdef1234567890abcdef")
                .orgName("City Medical Center")
                .build()

        val roundtrippedOrgReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgReference),
                jacksonTypeRef<OrgReference>(),
            )

        assertThat(roundtrippedOrgReference).isEqualTo(orgReference)
    }
}
