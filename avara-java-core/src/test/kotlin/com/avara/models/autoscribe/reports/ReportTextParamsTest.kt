// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportTextParamsTest {

    @Test
    fun create() {
        ReportTextParams.builder()
            .reportId("rep_1234567890abcdef1234567890abcdef")
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportTextParams.builder()
                .reportId("rep_1234567890abcdef1234567890abcdef")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.10008.5.1.4.1.1.2")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("reportId", "rep_1234567890abcdef1234567890abcdef")
                    .put("studyId", "stu_1234567890abcdef1234567890abcdef")
                    .put("studyInstanceUid", "1.2.840.10008.5.1.4.1.1.2")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportTextParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
