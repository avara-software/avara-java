// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.models.ApiKeyReference
import com.avara.models.OrgReference
import com.avara.models.UserReference
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyListPageResponseTest {

    @Test
    fun create() {
        val studyListPageResponse =
            StudyListPageResponse.builder()
                .hasMore(true)
                .addStudy(
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
                )
                .cursor("cursor")
                .build()

        assertThat(studyListPageResponse.hasMore()).isEqualTo(true)
        assertThat(studyListPageResponse.studies())
            .containsExactly(
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
            )
        assertThat(studyListPageResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyListPageResponse =
            StudyListPageResponse.builder()
                .hasMore(true)
                .addStudy(
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
                )
                .cursor("cursor")
                .build()

        val roundtrippedStudyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyListPageResponse),
                jacksonTypeRef<StudyListPageResponse>(),
            )

        assertThat(roundtrippedStudyListPageResponse).isEqualTo(studyListPageResponse)
    }
}
