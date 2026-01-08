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

internal class StudyRetrieveByUidResponseTest {

    @Test
    fun create() {
        val studyRetrieveByUidResponse =
            StudyRetrieveByUidResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(StudyRetrieveByUidResponse.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyRetrieveByUidResponse.StudyViewerStatus.INCOMPLETE)
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
                    StudyRetrieveByUidResponse.Metadata.builder()
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

        assertThat(studyRetrieveByUidResponse.cancelledAt()).isEmpty
        assertThat(studyRetrieveByUidResponse.createdAt())
            .contains(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
        assertThat(studyRetrieveByUidResponse.isCancelled()).isEqualTo(false)
        assertThat(studyRetrieveByUidResponse.severity())
            .isEqualTo(StudyRetrieveByUidResponse.Severity.HIGH)
        assertThat(studyRetrieveByUidResponse.studyDescription())
            .isEqualTo("CT Chest/Abdomen/Pelvis")
        assertThat(studyRetrieveByUidResponse.studyId())
            .isEqualTo("stu_1234567890abcdef1234567890abcdef")
        assertThat(studyRetrieveByUidResponse.studyInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
        assertThat(studyRetrieveByUidResponse.studyViewerStatus())
            .isEqualTo(StudyRetrieveByUidResponse.StudyViewerStatus.INCOMPLETE)
        assertThat(studyRetrieveByUidResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-03-15T14:20:00Z"))
        assertThat(studyRetrieveByUidResponse.assignedTo())
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
        assertThat(studyRetrieveByUidResponse.createdByApiKey())
            .contains(
                ApiKeyReference.builder()
                    .apiKeyId("550e8400-e29b-41d4-a716-446655440000")
                    .description("Production API Key")
                    .isViewerEnabled(true)
                    .build()
            )
        assertThat(studyRetrieveByUidResponse.createdByUser())
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
        assertThat(studyRetrieveByUidResponse.metadata())
            .contains(
                StudyRetrieveByUidResponse.Metadata.builder()
                    .putAdditionalProperty("department", JsonValue.from("radiology"))
                    .putAdditionalProperty("priority", JsonValue.from("urgent"))
                    .build()
            )
        assertThat(studyRetrieveByUidResponse.org())
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
        val studyRetrieveByUidResponse =
            StudyRetrieveByUidResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(StudyRetrieveByUidResponse.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyRetrieveByUidResponse.StudyViewerStatus.INCOMPLETE)
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
                    StudyRetrieveByUidResponse.Metadata.builder()
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

        val roundtrippedStudyRetrieveByUidResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyRetrieveByUidResponse),
                jacksonTypeRef<StudyRetrieveByUidResponse>(),
            )

        assertThat(roundtrippedStudyRetrieveByUidResponse).isEqualTo(studyRetrieveByUidResponse)
    }
}
