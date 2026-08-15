// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StudyAccessRequestedManifestSopTest {

    @Test
    fun create() {
        val studyAccessRequestedManifestSop =
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

        assertThat(studyAccessRequestedManifestSop.sopClassUid())
            .isEqualTo("1.2.840.10008.5.1.4.1.1.2")
        assertThat(studyAccessRequestedManifestSop.sopInstanceUid())
            .isEqualTo("1.2.840.113619.2.55.3.1.4.1")
        assertThat(studyAccessRequestedManifestSop.bitsAllocated()).contains(16.0)
        assertThat(studyAccessRequestedManifestSop.bitsStored()).contains(16.0)
        assertThat(studyAccessRequestedManifestSop.columns()).contains(512.0)
        assertThat(studyAccessRequestedManifestSop.highBit()).contains(15.0)
        assertThat(studyAccessRequestedManifestSop.instanceNumber()).contains(1.0)
        assertThat(studyAccessRequestedManifestSop.isDoubleFloatPixelData()).contains(true)
        assertThat(studyAccessRequestedManifestSop.isFloatPixelData()).contains(true)
        assertThat(studyAccessRequestedManifestSop.numberOfFrames()).contains(1.0)
        assertThat(studyAccessRequestedManifestSop.photometricInterpretation())
            .contains("MONOCHROME2")
        assertThat(studyAccessRequestedManifestSop.pixelRepresentation()).contains(0.0)
        assertThat(studyAccessRequestedManifestSop.rescaleIntercept()).contains(0.0)
        assertThat(studyAccessRequestedManifestSop.rescaleSlope()).contains(0.0)
        assertThat(studyAccessRequestedManifestSop.rows()).contains(512.0)
        assertThat(studyAccessRequestedManifestSop.samplesPerPixel()).contains(1.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val studyAccessRequestedManifestSop =
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

        val roundtrippedStudyAccessRequestedManifestSop =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(studyAccessRequestedManifestSop),
                jacksonTypeRef<StudyAccessRequestedManifestSop>(),
            )

        assertThat(roundtrippedStudyAccessRequestedManifestSop)
            .isEqualTo(studyAccessRequestedManifestSop)
    }
}
