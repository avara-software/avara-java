// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.users.invitations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationRevokeParamsTest {

    @Test
    fun create() {
        InvitationRevokeParams.builder()
            .invitationId("inv_1234567890abcdef1234567890abcdef")
            .userId("usr_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun body() {
        val params =
            InvitationRevokeParams.builder()
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .userId("usr_1234567890abcdef1234567890abcdef")
                .build()

        val body = params._body()

        assertThat(body.invitationId()).contains("inv_1234567890abcdef1234567890abcdef")
        assertThat(body.userId()).contains("usr_1234567890abcdef1234567890abcdef")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvitationRevokeParams.builder().build()

        val body = params._body()
    }
}
