// File generated from our OpenAPI spec by Stainless.

package com.avara.models.orgs

import com.avara.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgUpdateParamsTest {

    @Test
    fun create() {
        OrgUpdateParams.builder()
            .orgId("org_1234567890abcdef1234567890abcdef")
            .metadata(
                OrgUpdateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .putAdditionalProperty("wing", JsonValue.from("Building A"))
                    .build()
            )
            .orgName("City Medical Center - Radiology & Imaging")
            .build()
    }

    @Test
    fun pathParams() {
        val params = OrgUpdateParams.builder().orgId("org_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("org_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OrgUpdateParams.builder()
                .orgId("org_1234567890abcdef1234567890abcdef")
                .metadata(
                    OrgUpdateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("region", JsonValue.from("northeast"))
                        .putAdditionalProperty("wing", JsonValue.from("Building A"))
                        .build()
                )
                .orgName("City Medical Center - Radiology & Imaging")
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                OrgUpdateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("region", JsonValue.from("northeast"))
                    .putAdditionalProperty("wing", JsonValue.from("Building A"))
                    .build()
            )
        assertThat(body.orgName()).contains("City Medical Center - Radiology & Imaging")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OrgUpdateParams.builder().orgId("org_1234567890abcdef1234567890abcdef").build()

        val body = params._body()
    }
}
