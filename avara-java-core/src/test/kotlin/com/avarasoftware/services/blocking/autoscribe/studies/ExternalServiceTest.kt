// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe.studies

import com.avarasoftware.client.okhttp.AvaraOkHttpClient
import com.avarasoftware.core.JsonValue
import com.avarasoftware.models.Severity
import com.avarasoftware.models.autoscribe.HeightUnit
import com.avarasoftware.models.autoscribe.Sex
import com.avarasoftware.models.autoscribe.StudyReportMetadata
import com.avarasoftware.models.autoscribe.WeightUnit
import com.avarasoftware.models.autoscribe.studies.external.ExternalCreateParams
import com.avarasoftware.models.autoscribe.studies.external.ExternalDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExternalServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val externalService = client.autoScribe().studies().external()

        val external =
            externalService.create(
                ExternalCreateParams.builder()
                    .reportMetadata(
                        StudyReportMetadata.builder()
                            .age("38 years")
                            .dateOfBirth("1985-07-20")
                            .facilityName("City Medical Center")
                            .height(
                                StudyReportMetadata.Height.builder()
                                    .unit(HeightUnit.CM)
                                    .value(165.0)
                                    .build()
                            )
                            .mrn("MRN-2024-001234")
                            .patientName("Jane Doe")
                            .procedure("CT Chest")
                            .referringPhysicianName("Dr. Michael Chen")
                            .sex(Sex.FEMALE)
                            .studyDate("2024-01-15")
                            .studyTime("14:30")
                            .weight(
                                StudyReportMetadata.Weight.builder()
                                    .unit(WeightUnit.KG)
                                    .value(62.0)
                                    .build()
                            )
                            .build()
                    )
                    .severity(Severity.NORMAL)
                    .studyDescription("CT Chest without contrast")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .expressCustomerId("cus_1234567890abcdef1234567890abcdef")
                    .externalPatientId("PAT-2024-7731")
                    .metadata(
                        ExternalCreateParams.Metadata.builder()
                            .putAdditionalProperty("department", JsonValue.from("radiology"))
                            .putAdditionalProperty("priority", JsonValue.from("routine"))
                            .build()
                    )
                    .modality("modality")
                    .readerName("x")
                    .reportFileName("x")
                    .reportFileUrl("https://example.com")
                    .reportText("IMPRESSION: No acute cardiopulmonary process.")
                    .signedAt("x")
                    .build()
            )

        external.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = AvaraOkHttpClient.builder().apiKey("My API Key").build()
        val externalService = client.autoScribe().studies().external()

        val external =
            externalService.delete(
                ExternalDeleteParams.builder()
                    .studyId("stu_1234567890abcdef1234567890abcdef")
                    .studyInstanceUid("1.2.840.113619.2.55.3.604688119.868.1234567890.123")
                    .build()
            )

        external.validate()
    }
}
