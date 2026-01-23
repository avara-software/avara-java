// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.users.invitations

import com.avara.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationListParamsTest {

    @Test
    fun create() {
        InvitationListParams.builder()
            .cursor("eyJvZmZzZXQiOjIwfQ==")
            .endDate("2024-12-31")
            .expired(InvitationListParams.Expired.NOT_EXPIRED)
            .limit(20.0)
            .startDate("2024-01-01")
            .addStatus(InvitationListParams.Status.SENT)
            .userId("usr_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InvitationListParams.builder()
                .cursor("eyJvZmZzZXQiOjIwfQ==")
                .endDate("2024-12-31")
                .expired(InvitationListParams.Expired.NOT_EXPIRED)
                .limit(20.0)
                .startDate("2024-01-01")
                .addStatus(InvitationListParams.Status.SENT)
                .userId("usr_1234567890abcdef1234567890abcdef")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "eyJvZmZzZXQiOjIwfQ==")
                    .put("endDate", "2024-12-31")
                    .put("expired", "not-expired")
                    .put("limit", "20.0")
                    .put("startDate", "2024-01-01")
                    .put("status", listOf("sent").joinToString(","))
                    .put("userId", "usr_1234567890abcdef1234567890abcdef")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvitationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
