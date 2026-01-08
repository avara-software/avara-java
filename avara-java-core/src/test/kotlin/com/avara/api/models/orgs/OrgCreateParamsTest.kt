// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import com.avara.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgCreateParamsTest {

    @Test
    fun create() {
        OrgCreateParams.builder()
            .orgName("City Medical Center - Radiology Department")
            .metadata(
                OrgCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OrgCreateParams.builder()
                .orgName("City Medical Center - Radiology Department")
                .metadata(
                    OrgCreateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.orgName()).isEqualTo("City Medical Center - Radiology Department")
        assertThat(body.metadata())
            .contains(
                OrgCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrgCreateParams.builder().orgName("City Medical Center - Radiology Department").build()

        val body = params._body()

        assertThat(body.orgName()).isEqualTo("City Medical Center - Radiology Department")
    }
}
