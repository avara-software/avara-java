// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedResponseTest {

    @Test
    fun create() {
        val studyAccessRequestedResponse =
            StudyAccessRequestedResponse.builder()
                .authorized(true)
                .addUrl("https://storage.example.com/dicom/image1.dcm?token=abc123")
                .addUrl("https://storage.example.com/dicom/image2.dcm?token=def456")
                .error("Study not found in PACS")
                .manifest(
                    StudyAccessRequestedManifest.builder()
                        .addSeries(
                            StudyAccessRequestedManifestSeries.builder()
                                .modality("CT")
                                .seriesDescription("AXIAL CT")
                                .seriesInstanceUid("1.2.840.113619.2.55.3.1.3.1")
                                .seriesNumber(1.0)
                                .addSop(
                                    StudyAccessRequestedManifestSop.builder()
                                        .sopClassUid("1.2.840.10008.5.1.4.1.1.2")
                                        .sopInstanceUid("1.2.840.113619.2.55.3.1.4.1")
                                        .bitsAllocated(16.0)
                                        .bitsStored(16.0)
                                        .columns(512.0)
                                        .highBit(15.0)
                                        .instanceNumber(1.0)
                                        .isDoubleFloatPixelData(true)
                                        .isFloatPixelData(true)
                                        .numberOfFrames(1.0)
                                        .photometricInterpretation("MONOCHROME2")
                                        .pixelRepresentation(0.0)
                                        .rescaleIntercept(0.0)
                                        .rescaleSlope(0.0)
                                        .rows(512.0)
                                        .samplesPerPixel(1.0)
                                        .build()
                                )
                                .build()
                        )
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .build()
                )
                .addMediaUrl(
                    StudyAccessRequestedMediaUrl.builder()
                        .mimeType("application/pdf")
                        .url("https://storage.example.com/media/report.pdf?token=ghi789")
                        .fileName("clinical-report.pdf")
                        .build()
                )
                .build()

        assertThat(studyAccessRequestedResponse.authorized()).isEqualTo(true)
        assertThat(studyAccessRequestedResponse.urls())
            .containsExactly(
                "https://storage.example.com/dicom/image1.dcm?token=abc123",
                "https://storage.example.com/dicom/image2.dcm?token=def456",
            )
        assertThat(studyAccessRequestedResponse.error()).contains("Study not found in PACS")
        assertThat(studyAccessRequestedResponse.manifest())
            .contains(
                StudyAccessRequestedManifest.builder()
                    .addSeries(
                        StudyAccessRequestedManifestSeries.builder()
                            .modality("CT")
                            .seriesDescription("AXIAL CT")
                            .seriesInstanceUid("1.2.840.113619.2.55.3.1.3.1")
                            .seriesNumber(1.0)
                            .addSop(
                                StudyAccessRequestedManifestSop.builder()
                                    .sopClassUid("1.2.840.10008.5.1.4.1.1.2")
                                    .sopInstanceUid("1.2.840.113619.2.55.3.1.4.1")
                                    .bitsAllocated(16.0)
                                    .bitsStored(16.0)
                                    .columns(512.0)
                                    .highBit(15.0)
                                    .instanceNumber(1.0)
                                    .isDoubleFloatPixelData(true)
                                    .isFloatPixelData(true)
                                    .numberOfFrames(1.0)
                                    .photometricInterpretation("MONOCHROME2")
                                    .pixelRepresentation(0.0)
                                    .rescaleIntercept(0.0)
                                    .rescaleSlope(0.0)
                                    .rows(512.0)
                                    .samplesPerPixel(1.0)
                                    .build()
                            )
                            .build()
                    )
                    .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                    .build()
            )
        assertThat(studyAccessRequestedResponse.mediaUrls().getOrNull())
            .containsExactly(
                StudyAccessRequestedMediaUrl.builder()
                    .mimeType("application/pdf")
                    .url("https://storage.example.com/media/report.pdf?token=ghi789")
                    .fileName("clinical-report.pdf")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedResponse =
            StudyAccessRequestedResponse.builder()
                .authorized(true)
                .addUrl("https://storage.example.com/dicom/image1.dcm?token=abc123")
                .addUrl("https://storage.example.com/dicom/image2.dcm?token=def456")
                .error("Study not found in PACS")
                .manifest(
                    StudyAccessRequestedManifest.builder()
                        .addSeries(
                            StudyAccessRequestedManifestSeries.builder()
                                .modality("CT")
                                .seriesDescription("AXIAL CT")
                                .seriesInstanceUid("1.2.840.113619.2.55.3.1.3.1")
                                .seriesNumber(1.0)
                                .addSop(
                                    StudyAccessRequestedManifestSop.builder()
                                        .sopClassUid("1.2.840.10008.5.1.4.1.1.2")
                                        .sopInstanceUid("1.2.840.113619.2.55.3.1.4.1")
                                        .bitsAllocated(16.0)
                                        .bitsStored(16.0)
                                        .columns(512.0)
                                        .highBit(15.0)
                                        .instanceNumber(1.0)
                                        .isDoubleFloatPixelData(true)
                                        .isFloatPixelData(true)
                                        .numberOfFrames(1.0)
                                        .photometricInterpretation("MONOCHROME2")
                                        .pixelRepresentation(0.0)
                                        .rescaleIntercept(0.0)
                                        .rescaleSlope(0.0)
                                        .rows(512.0)
                                        .samplesPerPixel(1.0)
                                        .build()
                                )
                                .build()
                        )
                        .studyInstanceUid("1.2.840.113619.2.55.3.1234567890")
                        .build()
                )
                .addMediaUrl(
                    StudyAccessRequestedMediaUrl.builder()
                        .mimeType("application/pdf")
                        .url("https://storage.example.com/media/report.pdf?token=ghi789")
                        .fileName("clinical-report.pdf")
                        .build()
                )
                .build()

        val roundtrippedStudyAccessRequestedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedResponse),
                jacksonTypeRef<StudyAccessRequestedResponse>(),
            )

        assertThat(roundtrippedStudyAccessRequestedResponse).isEqualTo(studyAccessRequestedResponse)
    }
}
