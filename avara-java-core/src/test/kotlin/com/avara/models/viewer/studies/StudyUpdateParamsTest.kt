// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import com.avara.core.JsonValue
import com.avara.models.Severity
import com.avara.models.viewer.StudyViewerStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyUpdateParamsTest {

    @Test
    fun create() {
        StudyUpdateParams.builder()
            .studyId("stu_1234567890abcdef1234567890abcdef")
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .metadata(
                StudyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .severity(Severity.STAT)
            .studyDescription("CT Chest/Abdomen/Pelvis with Contrast")
            .studyViewerStatus(StudyViewerStatus.COMPLETE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StudyUpdateParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()

        assertThat(params._pathParam(0)).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StudyUpdateParams.builder()
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .metadata(
                    StudyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .severity(Severity.STAT)
                .studyDescription("CT Chest/Abdomen/Pelvis with Contrast")
                .studyViewerStatus(StudyViewerStatus.COMPLETE)
                .build()

        val body = params._body()

        assertThat(body.assignedTo()).contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(body.metadata())
            .contains(
                StudyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.severity()).contains(Severity.STAT)
        assertThat(body.studyDescription()).contains("CT Chest/Abdomen/Pelvis with Contrast")
        assertThat(body.studyViewerStatus()).contains(StudyViewerStatus.COMPLETE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StudyUpdateParams.builder().studyId("stu_1234567890abcdef1234567890abcdef").build()

        val body = params._body()
    }
}
