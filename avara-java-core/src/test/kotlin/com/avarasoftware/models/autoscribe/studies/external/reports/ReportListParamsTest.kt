// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies.external.reports

import com.avarasoftware.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListParamsTest {

    @Test
    fun create() {
        ReportListParams.builder()
            .cursor("cursor")
            .limit(20.0)
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportListParams.builder()
                .cursor("cursor")
                .limit(20.0)
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "20.0")
                    .put("studyId", "stu_1234567890abcdef1234567890abcdef")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
