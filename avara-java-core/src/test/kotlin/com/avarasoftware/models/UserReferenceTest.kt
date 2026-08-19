// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models

import com.avarasoftware.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserReferenceTest {

    @Test
    fun create() {
        val userReference =
            UserReference.builder()
                .email("dr.smith@radiology.com")
                .userId("usr_1234567890abcdef1234567890abcdef")
                .firstName("John")
                .lastName("Smith")
                .middleName("Robert")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        assertThat(userReference.email()).isEqualTo("dr.smith@radiology.com")
        assertThat(userReference.userId()).isEqualTo("usr_1234567890abcdef1234567890abcdef")
        assertThat(userReference.firstName()).contains("John")
        assertThat(userReference.lastName()).contains("Smith")
        assertThat(userReference.middleName()).contains("Robert")
        assertThat(userReference.suffix1()).contains("MD")
        assertThat(userReference.suffix2()).contains("FACR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userReference =
            UserReference.builder()
                .email("dr.smith@radiology.com")
                .userId("usr_1234567890abcdef1234567890abcdef")
                .firstName("John")
                .lastName("Smith")
                .middleName("Robert")
                .suffix1("MD")
                .suffix2("FACR")
                .build()

        val roundtrippedUserReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userReference),
                jacksonTypeRef<UserReference>(),
            )

        assertThat(roundtrippedUserReference).isEqualTo(userReference)
    }
}
