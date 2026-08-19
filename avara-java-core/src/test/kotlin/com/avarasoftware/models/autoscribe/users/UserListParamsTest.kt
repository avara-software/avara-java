// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.users

import com.avarasoftware.core.http.QueryParams
import com.avarasoftware.models.InvitedSource
import com.avarasoftware.models.UserLevel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListParamsTest {

    @Test
    fun create() {
        UserListParams.builder()
            .canCreateReports(true)
            .cursor("eyJvZmZzZXQiOjIwfQ==")
            .email("user@example.com")
            .firstName("John")
            .invitedSource(InvitedSource.API)
            .lastName("Doe")
            .level(UserLevel.MEMBER)
            .limit(20.0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UserListParams.builder()
                .canCreateReports(true)
                .cursor("eyJvZmZzZXQiOjIwfQ==")
                .email("user@example.com")
                .firstName("John")
                .invitedSource(InvitedSource.API)
                .lastName("Doe")
                .level(UserLevel.MEMBER)
                .limit(20.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("canCreateReports", "true")
                    .put("cursor", "eyJvZmZzZXQiOjIwfQ==")
                    .put("email", "user@example.com")
                    .put("firstName", "John")
                    .put("invitedSource", "api")
                    .put("lastName", "Doe")
                    .put("level", "member")
                    .put("limit", "20.0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
