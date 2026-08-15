// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * One SOP in the optional study manifest. Identity is required. Image geometry (rows, columns,
 * bitsAllocated, photometricInterpretation, samplesPerPixel) is required to preallocate a volume;
 * rescale and float flags are optional.
 */
class StudyAccessRequestedManifestSop
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sopClassUid: JsonField<String>,
    private val sopInstanceUid: JsonField<String>,
    private val bitsAllocated: JsonField<Double>,
    private val bitsStored: JsonField<Double>,
    private val columns: JsonField<Double>,
    private val highBit: JsonField<Double>,
    private val instanceNumber: JsonField<Double>,
    private val isDoubleFloatPixelData: JsonField<Boolean>,
    private val isFloatPixelData: JsonField<Boolean>,
    private val numberOfFrames: JsonField<Double>,
    private val photometricInterpretation: JsonField<String>,
    private val pixelRepresentation: JsonField<Double>,
    private val rescaleIntercept: JsonField<Double>,
    private val rescaleSlope: JsonField<Double>,
    private val rows: JsonField<Double>,
    private val samplesPerPixel: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sopClassUID")
        @ExcludeMissing
        sopClassUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sopInstanceUID")
        @ExcludeMissing
        sopInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bitsAllocated")
        @ExcludeMissing
        bitsAllocated: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bitsStored")
        @ExcludeMissing
        bitsStored: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("columns") @ExcludeMissing columns: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("highBit") @ExcludeMissing highBit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("instanceNumber")
        @ExcludeMissing
        instanceNumber: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("isDoubleFloatPixelData")
        @ExcludeMissing
        isDoubleFloatPixelData: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isFloatPixelData")
        @ExcludeMissing
        isFloatPixelData: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("numberOfFrames")
        @ExcludeMissing
        numberOfFrames: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("photometricInterpretation")
        @ExcludeMissing
        photometricInterpretation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pixelRepresentation")
        @ExcludeMissing
        pixelRepresentation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rescaleIntercept")
        @ExcludeMissing
        rescaleIntercept: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rescaleSlope")
        @ExcludeMissing
        rescaleSlope: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rows") @ExcludeMissing rows: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("samplesPerPixel")
        @ExcludeMissing
        samplesPerPixel: JsonField<Double> = JsonMissing.of(),
    ) : this(
        sopClassUid,
        sopInstanceUid,
        bitsAllocated,
        bitsStored,
        columns,
        highBit,
        instanceNumber,
        isDoubleFloatPixelData,
        isFloatPixelData,
        numberOfFrames,
        photometricInterpretation,
        pixelRepresentation,
        rescaleIntercept,
        rescaleSlope,
        rows,
        samplesPerPixel,
        mutableMapOf(),
    )

    /**
     * DICOM SOP Class UID (e.g. Legacy CT Image Storage)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sopClassUid(): String = sopClassUid.getRequired("sopClassUID")

    /**
     * DICOM SOP Instance UID
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sopInstanceUid(): String = sopInstanceUid.getRequired("sopInstanceUID")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bitsAllocated(): Optional<Double> = bitsAllocated.getOptional("bitsAllocated")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bitsStored(): Optional<Double> = bitsStored.getOptional("bitsStored")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columns(): Optional<Double> = columns.getOptional("columns")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun highBit(): Optional<Double> = highBit.getOptional("highBit")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instanceNumber(): Optional<Double> = instanceNumber.getOptional("instanceNumber")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDoubleFloatPixelData(): Optional<Boolean> =
        isDoubleFloatPixelData.getOptional("isDoubleFloatPixelData")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isFloatPixelData(): Optional<Boolean> = isFloatPixelData.getOptional("isFloatPixelData")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberOfFrames(): Optional<Double> = numberOfFrames.getOptional("numberOfFrames")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun photometricInterpretation(): Optional<String> =
        photometricInterpretation.getOptional("photometricInterpretation")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pixelRepresentation(): Optional<Double> =
        pixelRepresentation.getOptional("pixelRepresentation")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rescaleIntercept(): Optional<Double> = rescaleIntercept.getOptional("rescaleIntercept")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rescaleSlope(): Optional<Double> = rescaleSlope.getOptional("rescaleSlope")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rows(): Optional<Double> = rows.getOptional("rows")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun samplesPerPixel(): Optional<Double> = samplesPerPixel.getOptional("samplesPerPixel")

    /**
     * Returns the raw JSON value of [sopClassUid].
     *
     * Unlike [sopClassUid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sopClassUID") @ExcludeMissing fun _sopClassUid(): JsonField<String> = sopClassUid

    /**
     * Returns the raw JSON value of [sopInstanceUid].
     *
     * Unlike [sopInstanceUid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sopInstanceUID")
    @ExcludeMissing
    fun _sopInstanceUid(): JsonField<String> = sopInstanceUid

    /**
     * Returns the raw JSON value of [bitsAllocated].
     *
     * Unlike [bitsAllocated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bitsAllocated")
    @ExcludeMissing
    fun _bitsAllocated(): JsonField<Double> = bitsAllocated

    /**
     * Returns the raw JSON value of [bitsStored].
     *
     * Unlike [bitsStored], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bitsStored") @ExcludeMissing fun _bitsStored(): JsonField<Double> = bitsStored

    /**
     * Returns the raw JSON value of [columns].
     *
     * Unlike [columns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("columns") @ExcludeMissing fun _columns(): JsonField<Double> = columns

    /**
     * Returns the raw JSON value of [highBit].
     *
     * Unlike [highBit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("highBit") @ExcludeMissing fun _highBit(): JsonField<Double> = highBit

    /**
     * Returns the raw JSON value of [instanceNumber].
     *
     * Unlike [instanceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instanceNumber")
    @ExcludeMissing
    fun _instanceNumber(): JsonField<Double> = instanceNumber

    /**
     * Returns the raw JSON value of [isDoubleFloatPixelData].
     *
     * Unlike [isDoubleFloatPixelData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("isDoubleFloatPixelData")
    @ExcludeMissing
    fun _isDoubleFloatPixelData(): JsonField<Boolean> = isDoubleFloatPixelData

    /**
     * Returns the raw JSON value of [isFloatPixelData].
     *
     * Unlike [isFloatPixelData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isFloatPixelData")
    @ExcludeMissing
    fun _isFloatPixelData(): JsonField<Boolean> = isFloatPixelData

    /**
     * Returns the raw JSON value of [numberOfFrames].
     *
     * Unlike [numberOfFrames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numberOfFrames")
    @ExcludeMissing
    fun _numberOfFrames(): JsonField<Double> = numberOfFrames

    /**
     * Returns the raw JSON value of [photometricInterpretation].
     *
     * Unlike [photometricInterpretation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("photometricInterpretation")
    @ExcludeMissing
    fun _photometricInterpretation(): JsonField<String> = photometricInterpretation

    /**
     * Returns the raw JSON value of [pixelRepresentation].
     *
     * Unlike [pixelRepresentation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pixelRepresentation")
    @ExcludeMissing
    fun _pixelRepresentation(): JsonField<Double> = pixelRepresentation

    /**
     * Returns the raw JSON value of [rescaleIntercept].
     *
     * Unlike [rescaleIntercept], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rescaleIntercept")
    @ExcludeMissing
    fun _rescaleIntercept(): JsonField<Double> = rescaleIntercept

    /**
     * Returns the raw JSON value of [rescaleSlope].
     *
     * Unlike [rescaleSlope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rescaleSlope")
    @ExcludeMissing
    fun _rescaleSlope(): JsonField<Double> = rescaleSlope

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<Double> = rows

    /**
     * Returns the raw JSON value of [samplesPerPixel].
     *
     * Unlike [samplesPerPixel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("samplesPerPixel")
    @ExcludeMissing
    fun _samplesPerPixel(): JsonField<Double> = samplesPerPixel

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StudyAccessRequestedManifestSop].
         *
         * The following fields are required:
         * ```java
         * .sopClassUid()
         * .sopInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyAccessRequestedManifestSop]. */
    class Builder internal constructor() {

        private var sopClassUid: JsonField<String>? = null
        private var sopInstanceUid: JsonField<String>? = null
        private var bitsAllocated: JsonField<Double> = JsonMissing.of()
        private var bitsStored: JsonField<Double> = JsonMissing.of()
        private var columns: JsonField<Double> = JsonMissing.of()
        private var highBit: JsonField<Double> = JsonMissing.of()
        private var instanceNumber: JsonField<Double> = JsonMissing.of()
        private var isDoubleFloatPixelData: JsonField<Boolean> = JsonMissing.of()
        private var isFloatPixelData: JsonField<Boolean> = JsonMissing.of()
        private var numberOfFrames: JsonField<Double> = JsonMissing.of()
        private var photometricInterpretation: JsonField<String> = JsonMissing.of()
        private var pixelRepresentation: JsonField<Double> = JsonMissing.of()
        private var rescaleIntercept: JsonField<Double> = JsonMissing.of()
        private var rescaleSlope: JsonField<Double> = JsonMissing.of()
        private var rows: JsonField<Double> = JsonMissing.of()
        private var samplesPerPixel: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyAccessRequestedManifestSop: StudyAccessRequestedManifestSop) =
            apply {
                sopClassUid = studyAccessRequestedManifestSop.sopClassUid
                sopInstanceUid = studyAccessRequestedManifestSop.sopInstanceUid
                bitsAllocated = studyAccessRequestedManifestSop.bitsAllocated
                bitsStored = studyAccessRequestedManifestSop.bitsStored
                columns = studyAccessRequestedManifestSop.columns
                highBit = studyAccessRequestedManifestSop.highBit
                instanceNumber = studyAccessRequestedManifestSop.instanceNumber
                isDoubleFloatPixelData = studyAccessRequestedManifestSop.isDoubleFloatPixelData
                isFloatPixelData = studyAccessRequestedManifestSop.isFloatPixelData
                numberOfFrames = studyAccessRequestedManifestSop.numberOfFrames
                photometricInterpretation =
                    studyAccessRequestedManifestSop.photometricInterpretation
                pixelRepresentation = studyAccessRequestedManifestSop.pixelRepresentation
                rescaleIntercept = studyAccessRequestedManifestSop.rescaleIntercept
                rescaleSlope = studyAccessRequestedManifestSop.rescaleSlope
                rows = studyAccessRequestedManifestSop.rows
                samplesPerPixel = studyAccessRequestedManifestSop.samplesPerPixel
                additionalProperties =
                    studyAccessRequestedManifestSop.additionalProperties.toMutableMap()
            }

        /** DICOM SOP Class UID (e.g. Legacy CT Image Storage) */
        fun sopClassUid(sopClassUid: String) = sopClassUid(JsonField.of(sopClassUid))

        /**
         * Sets [Builder.sopClassUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sopClassUid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sopClassUid(sopClassUid: JsonField<String>) = apply { this.sopClassUid = sopClassUid }

        /** DICOM SOP Instance UID */
        fun sopInstanceUid(sopInstanceUid: String) = sopInstanceUid(JsonField.of(sopInstanceUid))

        /**
         * Sets [Builder.sopInstanceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sopInstanceUid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sopInstanceUid(sopInstanceUid: JsonField<String>) = apply {
            this.sopInstanceUid = sopInstanceUid
        }

        fun bitsAllocated(bitsAllocated: Double) = bitsAllocated(JsonField.of(bitsAllocated))

        /**
         * Sets [Builder.bitsAllocated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bitsAllocated] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bitsAllocated(bitsAllocated: JsonField<Double>) = apply {
            this.bitsAllocated = bitsAllocated
        }

        fun bitsStored(bitsStored: Double) = bitsStored(JsonField.of(bitsStored))

        /**
         * Sets [Builder.bitsStored] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bitsStored] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bitsStored(bitsStored: JsonField<Double>) = apply { this.bitsStored = bitsStored }

        fun columns(columns: Double) = columns(JsonField.of(columns))

        /**
         * Sets [Builder.columns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columns] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun columns(columns: JsonField<Double>) = apply { this.columns = columns }

        fun highBit(highBit: Double) = highBit(JsonField.of(highBit))

        /**
         * Sets [Builder.highBit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highBit] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun highBit(highBit: JsonField<Double>) = apply { this.highBit = highBit }

        fun instanceNumber(instanceNumber: Double) = instanceNumber(JsonField.of(instanceNumber))

        /**
         * Sets [Builder.instanceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceNumber] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instanceNumber(instanceNumber: JsonField<Double>) = apply {
            this.instanceNumber = instanceNumber
        }

        fun isDoubleFloatPixelData(isDoubleFloatPixelData: Boolean) =
            isDoubleFloatPixelData(JsonField.of(isDoubleFloatPixelData))

        /**
         * Sets [Builder.isDoubleFloatPixelData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDoubleFloatPixelData] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun isDoubleFloatPixelData(isDoubleFloatPixelData: JsonField<Boolean>) = apply {
            this.isDoubleFloatPixelData = isDoubleFloatPixelData
        }

        fun isFloatPixelData(isFloatPixelData: Boolean) =
            isFloatPixelData(JsonField.of(isFloatPixelData))

        /**
         * Sets [Builder.isFloatPixelData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isFloatPixelData] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isFloatPixelData(isFloatPixelData: JsonField<Boolean>) = apply {
            this.isFloatPixelData = isFloatPixelData
        }

        fun numberOfFrames(numberOfFrames: Double) = numberOfFrames(JsonField.of(numberOfFrames))

        /**
         * Sets [Builder.numberOfFrames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberOfFrames] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numberOfFrames(numberOfFrames: JsonField<Double>) = apply {
            this.numberOfFrames = numberOfFrames
        }

        fun photometricInterpretation(photometricInterpretation: String) =
            photometricInterpretation(JsonField.of(photometricInterpretation))

        /**
         * Sets [Builder.photometricInterpretation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photometricInterpretation] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun photometricInterpretation(photometricInterpretation: JsonField<String>) = apply {
            this.photometricInterpretation = photometricInterpretation
        }

        fun pixelRepresentation(pixelRepresentation: Double) =
            pixelRepresentation(JsonField.of(pixelRepresentation))

        /**
         * Sets [Builder.pixelRepresentation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelRepresentation] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pixelRepresentation(pixelRepresentation: JsonField<Double>) = apply {
            this.pixelRepresentation = pixelRepresentation
        }

        fun rescaleIntercept(rescaleIntercept: Double) =
            rescaleIntercept(JsonField.of(rescaleIntercept))

        /**
         * Sets [Builder.rescaleIntercept] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rescaleIntercept] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rescaleIntercept(rescaleIntercept: JsonField<Double>) = apply {
            this.rescaleIntercept = rescaleIntercept
        }

        fun rescaleSlope(rescaleSlope: Double) = rescaleSlope(JsonField.of(rescaleSlope))

        /**
         * Sets [Builder.rescaleSlope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rescaleSlope] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rescaleSlope(rescaleSlope: JsonField<Double>) = apply {
            this.rescaleSlope = rescaleSlope
        }

        fun rows(rows: Double) = rows(JsonField.of(rows))

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rows(rows: JsonField<Double>) = apply { this.rows = rows }

        fun samplesPerPixel(samplesPerPixel: Double) =
            samplesPerPixel(JsonField.of(samplesPerPixel))

        /**
         * Sets [Builder.samplesPerPixel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplesPerPixel] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun samplesPerPixel(samplesPerPixel: JsonField<Double>) = apply {
            this.samplesPerPixel = samplesPerPixel
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [StudyAccessRequestedManifestSop].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sopClassUid()
         * .sopInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyAccessRequestedManifestSop =
            StudyAccessRequestedManifestSop(
                checkRequired("sopClassUid", sopClassUid),
                checkRequired("sopInstanceUid", sopInstanceUid),
                bitsAllocated,
                bitsStored,
                columns,
                highBit,
                instanceNumber,
                isDoubleFloatPixelData,
                isFloatPixelData,
                numberOfFrames,
                photometricInterpretation,
                pixelRepresentation,
                rescaleIntercept,
                rescaleSlope,
                rows,
                samplesPerPixel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws AvaraInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): StudyAccessRequestedManifestSop = apply {
        if (validated) {
            return@apply
        }

        sopClassUid()
        sopInstanceUid()
        bitsAllocated()
        bitsStored()
        columns()
        highBit()
        instanceNumber()
        isDoubleFloatPixelData()
        isFloatPixelData()
        numberOfFrames()
        photometricInterpretation()
        pixelRepresentation()
        rescaleIntercept()
        rescaleSlope()
        rows()
        samplesPerPixel()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: AvaraInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (sopClassUid.asKnown().isPresent) 1 else 0) +
            (if (sopInstanceUid.asKnown().isPresent) 1 else 0) +
            (if (bitsAllocated.asKnown().isPresent) 1 else 0) +
            (if (bitsStored.asKnown().isPresent) 1 else 0) +
            (if (columns.asKnown().isPresent) 1 else 0) +
            (if (highBit.asKnown().isPresent) 1 else 0) +
            (if (instanceNumber.asKnown().isPresent) 1 else 0) +
            (if (isDoubleFloatPixelData.asKnown().isPresent) 1 else 0) +
            (if (isFloatPixelData.asKnown().isPresent) 1 else 0) +
            (if (numberOfFrames.asKnown().isPresent) 1 else 0) +
            (if (photometricInterpretation.asKnown().isPresent) 1 else 0) +
            (if (pixelRepresentation.asKnown().isPresent) 1 else 0) +
            (if (rescaleIntercept.asKnown().isPresent) 1 else 0) +
            (if (rescaleSlope.asKnown().isPresent) 1 else 0) +
            (if (rows.asKnown().isPresent) 1 else 0) +
            (if (samplesPerPixel.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyAccessRequestedManifestSop &&
            sopClassUid == other.sopClassUid &&
            sopInstanceUid == other.sopInstanceUid &&
            bitsAllocated == other.bitsAllocated &&
            bitsStored == other.bitsStored &&
            columns == other.columns &&
            highBit == other.highBit &&
            instanceNumber == other.instanceNumber &&
            isDoubleFloatPixelData == other.isDoubleFloatPixelData &&
            isFloatPixelData == other.isFloatPixelData &&
            numberOfFrames == other.numberOfFrames &&
            photometricInterpretation == other.photometricInterpretation &&
            pixelRepresentation == other.pixelRepresentation &&
            rescaleIntercept == other.rescaleIntercept &&
            rescaleSlope == other.rescaleSlope &&
            rows == other.rows &&
            samplesPerPixel == other.samplesPerPixel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            sopClassUid,
            sopInstanceUid,
            bitsAllocated,
            bitsStored,
            columns,
            highBit,
            instanceNumber,
            isDoubleFloatPixelData,
            isFloatPixelData,
            numberOfFrames,
            photometricInterpretation,
            pixelRepresentation,
            rescaleIntercept,
            rescaleSlope,
            rows,
            samplesPerPixel,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyAccessRequestedManifestSop{sopClassUid=$sopClassUid, sopInstanceUid=$sopInstanceUid, bitsAllocated=$bitsAllocated, bitsStored=$bitsStored, columns=$columns, highBit=$highBit, instanceNumber=$instanceNumber, isDoubleFloatPixelData=$isDoubleFloatPixelData, isFloatPixelData=$isFloatPixelData, numberOfFrames=$numberOfFrames, photometricInterpretation=$photometricInterpretation, pixelRepresentation=$pixelRepresentation, rescaleIntercept=$rescaleIntercept, rescaleSlope=$rescaleSlope, rows=$rows, samplesPerPixel=$samplesPerPixel, additionalProperties=$additionalProperties}"
}
