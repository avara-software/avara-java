// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedManifestSeriesTest {

    @Test
    fun create() {
        val studyAccessRequestedManifestSeries =
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
                        .rescaleIntercept(-1024.0)
                        .rescaleSlope(1.0)
                        .rows(512.0)
                        .samplesPerPixel(1.0)
                        .build()
                )
                .build()

        assertThat(studyAccessRequestedManifestSeries.modality()).isEqualTo("CT")
        assertThat(studyAccessRequestedManifestSeries.seriesDescription()).isEqualTo("AXIAL CT")
        assertThat(studyAccessRequestedManifestSeries.seriesInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1.3.1")
        assertThat(studyAccessRequestedManifestSeries.seriesNumber())
            .isEqualTo(StudyAccessRequestedManifestSeries.SeriesNumber.ofNumber(1.0))
        assertThat(studyAccessRequestedManifestSeries.sops())
            .containsExactly(
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
                    .rescaleIntercept(-1024.0)
                    .rescaleSlope(1.0)
                    .rows(512.0)
                    .samplesPerPixel(1.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedManifestSeries =
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
                        .rescaleIntercept(-1024.0)
                        .rescaleSlope(1.0)
                        .rows(512.0)
                        .samplesPerPixel(1.0)
                        .build()
                )
                .build()

        val roundtrippedStudyAccessRequestedManifestSeries =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedManifestSeries),
                jacksonTypeRef<StudyAccessRequestedManifestSeries>(),
            )

        assertThat(roundtrippedStudyAccessRequestedManifestSeries)
            .isEqualTo(studyAccessRequestedManifestSeries)
    }
}
