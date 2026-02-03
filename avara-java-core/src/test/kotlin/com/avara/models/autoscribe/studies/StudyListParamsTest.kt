// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyListParamsTest {

    @Test
    fun create() {
        StudyListParams.builder()
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .cursor("eyJvZmZzZXQiOjIwfQ==")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .isCancelled(false)
            .limit(20.0)
            .severity(StudyListParams.Severity.NORMAL)
            .studyDescription("CT Head")
            .addStudyReportStatus(StudyListParams.StudyReportStatus.COMPLETED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StudyListParams.builder()
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .cursor("eyJvZmZzZXQiOjIwfQ==")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .isCancelled(false)
                .limit(20.0)
                .severity(StudyListParams.Severity.NORMAL)
                .studyDescription("CT Head")
                .addStudyReportStatus(StudyListParams.StudyReportStatus.COMPLETED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("assignedTo", "usr_1234567890abcdef1234567890abcdef")
                    .put("cursor", "eyJvZmZzZXQiOjIwfQ==")
                    .put("expressCustomerId", "cus_1234567890abcdef1234567890abcdef")
                    .put("isCancelled", "false")
                    .put("limit", "20.0")
                    .put("severity", "normal")
                    .put("studyDescription", "CT Head")
                    .put("studyReportStatus", listOf("completed").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StudyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
