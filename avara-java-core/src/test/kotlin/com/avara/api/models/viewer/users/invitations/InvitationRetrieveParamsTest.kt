// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.users.invitations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationRetrieveParamsTest {

    @Test
    fun create() {
        InvitationRetrieveParams.builder()
            .invitationId("inv_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvitationRetrieveParams.builder()
                .invitationId("inv_1234567890abcdef1234567890abcdef")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inv_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
