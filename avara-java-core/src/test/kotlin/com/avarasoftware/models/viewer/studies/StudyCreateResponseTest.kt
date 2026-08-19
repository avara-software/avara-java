// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.viewer.studies

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.jsonMapper
import com.avarasoftware.models.ApiKeyReference
import com.avarasoftware.models.ExpressCustomerReference
import com.avarasoftware.models.Severity
import com.avarasoftware.models.UserReference
import com.avarasoftware.models.viewer.StudyViewerStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyCreateResponseTest {

    @Test
    fun create() {
        val studyCreateResponse =
            StudyCreateResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyViewerStatus.INCOMPLETE)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .createdByApiKey(
                    ApiKeyReference.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isClinicalContextEnrichmentEnabled(true)
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .expressCustomer(
                    ExpressCustomerReference.builder()
                        .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                        .expressCustomerName("City Medical Center")
                        .build()
                )
                .metadata(
                    StudyCreateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("urgent"))
                        .build()
                )
                .build()

        assertThat(studyCreateResponse.cancelledAt()).isEmpty
        assertThat(studyCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(studyCreateResponse.isCancelled()).isEqualTo(false)
        assertThat(studyCreateResponse.severity()).isEqualTo(Severity.HIGH)
        assertThat(studyCreateResponse.studyDescription()).isEqualTo("CT Chest/Abdomen/Pelvis")
        assertThat(studyCreateResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyCreateResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(studyCreateResponse.studyViewerStatus()).isEqualTo(StudyViewerStatus.INCOMPLETE)
        assertThat(studyCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(studyCreateResponse.assignedTo())
            .contains(
                UserReference.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyCreateResponse.createdByApiKey())
            .contains(
                ApiKeyReference.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isClinicalContextEnrichmentEnabled(true)
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(studyCreateResponse.createdByUser())
            .contains(
                UserReference.builder()
                    .email("dr.smith@radiology.com")
                    .userId("usr_1234567890abcdef1234567890abcdef")
                    .firstName("John")
                    .lastName("Smith")
                    .middleName("Robert")
                    .suffix1("MD")
                    .suffix2("FACR")
                    .build()
            )
        assertThat(studyCreateResponse.expressCustomer())
            .contains(
                ExpressCustomerReference.builder()
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .expressCustomerName("City Medical Center")
                    .build()
            )
        assertThat(studyCreateResponse.metadata())
            .contains(
                StudyCreateResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("urgent"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyCreateResponse =
            StudyCreateResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyViewerStatus.INCOMPLETE)
                .updatedAt(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
                .assignedTo(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .createdByApiKey(
                    ApiKeyReference.builder()
                        .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                        .description("Production API Key")
                        .isClinicalContextEnrichmentEnabled(true)
                        .isViewerEnabled(true)
                        .build()
                )
                .createdByUser(
                    UserReference.builder()
                        .email("dr.smith@radiology.com")
                        .userId("usr_1234567890abcdef1234567890abcdef")
                        .firstName("John")
                        .lastName("Smith")
                        .middleName("Robert")
                        .suffix1("MD")
                        .suffix2("FACR")
                        .build()
                )
                .expressCustomer(
                    ExpressCustomerReference.builder()
                        .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                        .expressCustomerName("City Medical Center")
                        .build()
                )
                .metadata(
                    StudyCreateResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("urgent"))
                        .build()
                )
                .build()

        val roundtrippedStudyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyCreateResponse),
                jacksonTypeRef<StudyCreateResponse>(),
            )

        assertThat(roundtrippedStudyCreateResponse).isEqualTo(studyCreateResponse)
    }
}
