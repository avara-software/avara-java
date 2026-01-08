// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.studies

import com.avara.api.core.JsonValue
import com.avara.api.core.jsonMapper
import com.avara.api.models.ApiKeyReference
import com.avara.api.models.OrgReference
import com.avara.api.models.UserReference
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyListResponseTest {

    @Test
    fun create() {
        val studyListResponse =
            StudyListResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(StudyListResponse.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyListResponse.StudyViewerStatus.INCOMPLETE)
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
                .metadata(
                    StudyListResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("urgent"))
                        .build()
                )
                .org(
                    OrgReference.builder()
                        .orgId("org_1234567890abcdef1234567890abcdef")
                        .orgName("City Medical Center")
                        .build()
                )
                .build()

        assertThat(studyListResponse.cancelledAt()).isEmpty
        assertThat(studyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(studyListResponse.isCancelled()).isEqualTo(false)
        assertThat(studyListResponse.severity()).isEqualTo(StudyListResponse.Severity.HIGH)
        assertThat(studyListResponse.studyDescription()).isEqualTo("CT Chest/Abdomen/Pelvis")
        assertThat(studyListResponse.studyId()).isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyListResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(studyListResponse.studyViewerStatus())
            .isEqualTo(StudyListResponse.StudyViewerStatus.INCOMPLETE)
        assertThat(studyListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(studyListResponse.assignedTo())
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
        assertThat(studyListResponse.createdByApiKey())
            .contains(
                ApiKeyReference.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(studyListResponse.createdByUser())
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
        assertThat(studyListResponse.metadata())
            .contains(
                StudyListResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("urgent"))
                    .build()
            )
        assertThat(studyListResponse.org())
            .contains(
                OrgReference.builder()
                    .orgId("org_1234567890abcdef1234567890abcdef")
                    .orgName("City Medical Center")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyListResponse =
            StudyListResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(StudyListResponse.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyListResponse.StudyViewerStatus.INCOMPLETE)
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
                .metadata(
                    StudyListResponse.Metadata.builder()
                        .putAdditionalProperty("department", JsonValue.from("radiology"))
                        .putAdditionalProperty("priority", JsonValue.from("urgent"))
                        .build()
                )
                .org(
                    OrgReference.builder()
                        .orgId("org_1234567890abcdef1234567890abcdef")
                        .orgName("City Medical Center")
                        .build()
                )
                .build()

        val roundtrippedStudyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyListResponse),
                jacksonTypeRef<StudyListResponse>(),
            )

        assertThat(roundtrippedStudyListResponse).isEqualTo(studyListResponse)
    }
}
