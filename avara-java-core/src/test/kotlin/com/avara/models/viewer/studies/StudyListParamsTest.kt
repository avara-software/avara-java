// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import com.avara.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyListParamsTest {

    @Test
    fun create() {
        StudyListParams.builder()
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .cursor("eyJvZmZzZXQiOjIwfQ==")
            .isCancelled(false)
            .limit(20.0)
            .severity(StudyListParams.Severity.NORMAL)
            .studyDescription("CT Head")
            .studyViewerStatus(StudyListParams.StudyViewerStatus.COMPLETE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StudyListParams.builder()
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .cursor("eyJvZmZzZXQiOjIwfQ==")
                .isCancelled(false)
                .limit(20.0)
                .severity(StudyListParams.Severity.NORMAL)
                .studyDescription("CT Head")
                .studyViewerStatus(StudyListParams.StudyViewerStatus.COMPLETE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("assignedTo", "usr_1234567890abcdef1234567890abcdef")
                    .put("cursor", "eyJvZmZzZXQiOjIwfQ==")
                    .put("isCancelled", "false")
                    .put("limit", "20.0")
                    .put("severity", "normal")
                    .put("studyDescription", "CT Head")
                    .put("studyViewerStatus", "complete")
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
