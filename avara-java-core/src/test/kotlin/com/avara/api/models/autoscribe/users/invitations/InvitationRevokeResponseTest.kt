// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.users.invitations

import com.avara.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationRevokeResponseTest {

    @Test
    fun create() {
        val invitationRevokeResponse =
            InvitationRevokeResponse.builder().success(true).message("message").build()

        assertThat(invitationRevokeResponse.success()).isEqualTo(true)
        assertThat(invitationRevokeResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationRevokeResponse =
            InvitationRevokeResponse.builder().success(true).message("message").build()

        val roundtrippedInvitationRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationRevokeResponse),
                jacksonTypeRef<InvitationRevokeResponse>(),
            )

        assertThat(roundtrippedInvitationRevokeResponse).isEqualTo(invitationRevokeResponse)
    }
}
