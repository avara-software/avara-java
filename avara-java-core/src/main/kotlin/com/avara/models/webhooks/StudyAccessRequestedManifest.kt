// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Optional sidecar for this one study (one object, not an array). Not required — omit if you do not
 * have it. Recommended when you can provide it, especially for very large studies. Enables
 * progressive loading of legacy multi-SOP DICOM so readers can scroll before every file is parsed.
 * Include only this study. Series you cannot describe can be left out. Invalid or incomplete values
 * are ignored; URLs still load.
 */
class StudyAccessRequestedManifest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val series: JsonField<List<StudyAccessRequestedManifestSeries>>,
    private val studyInstanceUid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<StudyAccessRequestedManifestSeries>> = JsonMissing.of(),
        @JsonProperty("studyInstanceUID")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
    ) : this(series, studyInstanceUid, mutableMapOf())

    /**
     * Planable series in this study. At least one must survive validation.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<StudyAccessRequestedManifestSeries> = series.getRequired("series")

    /**
     * DICOM Study Instance UID for this study. Non-empty string. Must match the study being
     * requested.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUID")

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series")
    @ExcludeMissing
    fun _series(): JsonField<List<StudyAccessRequestedManifestSeries>> = series

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyInstanceUID")
    @ExcludeMissing
    fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

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
         * Returns a mutable builder for constructing an instance of [StudyAccessRequestedManifest].
         *
         * The following fields are required:
         * ```java
         * .series()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyAccessRequestedManifest]. */
    class Builder internal constructor() {

        private var series: JsonField<MutableList<StudyAccessRequestedManifestSeries>>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyAccessRequestedManifest: StudyAccessRequestedManifest) = apply {
            series = studyAccessRequestedManifest.series.map { it.toMutableList() }
            studyInstanceUid = studyAccessRequestedManifest.studyInstanceUid
            additionalProperties = studyAccessRequestedManifest.additionalProperties.toMutableMap()
        }

        /** Planable series in this study. At least one must survive validation. */
        fun series(series: List<StudyAccessRequestedManifestSeries>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed
         * `List<StudyAccessRequestedManifestSeries>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun series(series: JsonField<List<StudyAccessRequestedManifestSeries>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [StudyAccessRequestedManifestSeries] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: StudyAccessRequestedManifestSeries) = apply {
            this.series =
                (this.series ?: JsonField.of(mutableListOf())).also {
                    checkKnown("series", it).add(series)
                }
        }

        /**
         * DICOM Study Instance UID for this study. Non-empty string. Must match the study being
         * requested.
         */
        fun studyInstanceUid(studyInstanceUid: String) =
            studyInstanceUid(JsonField.of(studyInstanceUid))

        /**
         * Sets [Builder.studyInstanceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyInstanceUid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
            this.studyInstanceUid = studyInstanceUid
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
         * Returns an immutable instance of [StudyAccessRequestedManifest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .series()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyAccessRequestedManifest =
            StudyAccessRequestedManifest(
                checkRequired("series", series).map { it.toImmutable() },
                checkRequired("studyInstanceUid", studyInstanceUid),
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
    fun validate(): StudyAccessRequestedManifest = apply {
        if (validated) {
            return@apply
        }

        series().forEach { it.validate() }
        studyInstanceUid()
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
        (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyAccessRequestedManifest &&
            series == other.series &&
            studyInstanceUid == other.studyInstanceUid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(series, studyInstanceUid, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyAccessRequestedManifest{series=$series, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
}
