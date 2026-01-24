// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import com.avara.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyCreateParamsTest {

    @Test
    fun create() {
        StudyCreateParams.builder()
            .severity(StudyCreateParams.Severity.HIGH)
            .studyDescription("CT Chest/Abdomen/Pelvis")
            .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
            .assignedTo("usr_1234567890abcdef1234567890abcdef")
            .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
            .metadata(
                StudyCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("urgent"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            StudyCreateParams.builder()
                .severity(StudyCreateParams.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .assignedTo("usr_1234567890abcdef1234567890abcdef")
                .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                .metadata(
                    StudyCreateParams.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("urgent"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.severity()).isEqualTo(StudyCreateParams.Severity.HIGH)
        assertThat(body.studyDescription()).isEqualTo("CT Chest/Abdomen/Pelvis")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(body.assignedTo()).contains("usr_1234567890abcdef1234567890abcdef")
        assertThat(body.expressCustomerId()).contains("cus_1234567890abcdef1234567890abcdef")
        assertThat(body.metadata())
            .contains(
                StudyCreateParams.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("urgent"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StudyCreateParams.builder()
                .severity(StudyCreateParams.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .build()

        val body = params._body()

        assertThat(body.severity()).isEqualTo(StudyCreateParams.Severity.HIGH)
        assertThat(body.studyDescription()).isEqualTo("CT Chest/Abdomen/Pelvis")
        assertThat(body.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
    }
}
