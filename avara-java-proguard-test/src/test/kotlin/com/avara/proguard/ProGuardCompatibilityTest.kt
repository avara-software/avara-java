// File generated from our OpenAPI spec by Stainless.

package com.avara.proguard

import com.avara.client.okhttp.AvaraOkHttpClient
import com.avara.core.JsonValue
import com.avara.core.jsonMapper
import com.avara.models.ApiKeyReference
import com.avara.models.UserReference
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.reports.ReportPdfResponse
import com.avara.models.viewer.studies.StudyCreateResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/avara-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.autoScribe()).isNotNull()
        assertThat(client.viewer()).isNotNull()
        assertThat(client.orgs()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun studyCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val studyCreateResponse =
            StudyCreateResponse.builder()
                .cancelledAt(null)
                .createdAt(OffsetDateTime.parse("2024-03-15T10:30:00Z"))
                .isCancelled(false)
                .severity(StudyCreateResponse.Severity.HIGH)
                .studyDescription("CT Chest/Abdomen/Pelvis")
                .studyId("stu_1234567890abcdef1234567890abcdef")
                .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                .studyViewerStatus(StudyCreateResponse.StudyViewerStatus.INCOMPLETE)
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
                .expressCustomer(
                    StudyCreateResponse.ExpressCustomer.builder()
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

    @Test
    fun reportPdfResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val reportPdfResponse =
            ReportPdfResponse.ofSingle(
                ReportPdfResponse.SingleReportPdfResponse.builder()
                    .presignedUrl(
                        "https://storage.avarasoftware.com/reports/rep_1234.pdf?token=abc123"
                    )
                    .reportId("rep_1234567890abcdef1234567890abcdef")
                    .snapshotMetadata(
                        StudyReportMetadata.builder()
                            .age("38 years")
                            .dateOfBirth("1985-07-20")
                            .facilityName("City Medical Center")
                            .height(
                                StudyReportMetadata.Height.builder()
                                    .unit(StudyReportMetadata.Height.Unit.CM)
                                    .value(165.0)
                                    .build()
                            )
                            .mrn("MRN-2024-001234")
                            .patientName("Jane Doe")
                            .referringPhysicianName("Dr. Michael Chen")
                            .scanDate("2024-03-15")
                            .scanTime("14:30")
                            .scanType("MRI Brain with Contrast")
                            .sex(StudyReportMetadata.Sex.FEMALE)
                            .weight(
                                StudyReportMetadata.Weight.builder()
                                    .unit(StudyReportMetadata.Weight.Unit.KG)
                                    .value(62.0)
                                    .build()
                            )
                            .build()
                    )
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        val roundtrippedReportPdfResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportPdfResponse),
                jacksonTypeRef<ReportPdfResponse>(),
            )

        assertThat(roundtrippedReportPdfResponse).isEqualTo(reportPdfResponse)
    }
}
