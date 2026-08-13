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

/** External prior report metadata and text for clinical context */
class ClinicalContextEnrichmentPriorReport
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reportText: JsonField<String>,
    private val externalStudyId: JsonField<String>,
    private val modality: JsonField<String>,
    private val studyDate: JsonField<String>,
    private val studyDescription: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reportText")
        @ExcludeMissing
        reportText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalStudyId")
        @ExcludeMissing
        externalStudyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyDate") @ExcludeMissing studyDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyDescription")
        @ExcludeMissing
        studyDescription: JsonField<String> = JsonMissing.of(),
    ) : this(reportText, externalStudyId, modality, studyDate, studyDescription, mutableMapOf())

    /**
     * Full prior report text
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportText(): String = reportText.getRequired("reportText")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalStudyId(): Optional<String> = externalStudyId.getOptional("externalStudyId")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modality(): Optional<String> = modality.getOptional("modality")

    /**
     * YYYY-MM-DD
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyDate(): Optional<String> = studyDate.getOptional("studyDate")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyDescription(): Optional<String> = studyDescription.getOptional("studyDescription")

    /**
     * Returns the raw JSON value of [reportText].
     *
     * Unlike [reportText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportText") @ExcludeMissing fun _reportText(): JsonField<String> = reportText

    /**
     * Returns the raw JSON value of [externalStudyId].
     *
     * Unlike [externalStudyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalStudyId")
    @ExcludeMissing
    fun _externalStudyId(): JsonField<String> = externalStudyId

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

    /**
     * Returns the raw JSON value of [studyDate].
     *
     * Unlike [studyDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studyDate") @ExcludeMissing fun _studyDate(): JsonField<String> = studyDate

    /**
     * Returns the raw JSON value of [studyDescription].
     *
     * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyDescription")
    @ExcludeMissing
    fun _studyDescription(): JsonField<String> = studyDescription

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
         * [ClinicalContextEnrichmentPriorReport].
         *
         * The following fields are required:
         * ```java
         * .reportText()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalContextEnrichmentPriorReport]. */
    class Builder internal constructor() {

        private var reportText: JsonField<String>? = null
        private var externalStudyId: JsonField<String> = JsonMissing.of()
        private var modality: JsonField<String> = JsonMissing.of()
        private var studyDate: JsonField<String> = JsonMissing.of()
        private var studyDescription: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            clinicalContextEnrichmentPriorReport: ClinicalContextEnrichmentPriorReport
        ) = apply {
            reportText = clinicalContextEnrichmentPriorReport.reportText
            externalStudyId = clinicalContextEnrichmentPriorReport.externalStudyId
            modality = clinicalContextEnrichmentPriorReport.modality
            studyDate = clinicalContextEnrichmentPriorReport.studyDate
            studyDescription = clinicalContextEnrichmentPriorReport.studyDescription
            additionalProperties =
                clinicalContextEnrichmentPriorReport.additionalProperties.toMutableMap()
        }

        /** Full prior report text */
        fun reportText(reportText: String) = reportText(JsonField.of(reportText))

        /**
         * Sets [Builder.reportText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportText(reportText: JsonField<String>) = apply { this.reportText = reportText }

        fun externalStudyId(externalStudyId: String) =
            externalStudyId(JsonField.of(externalStudyId))

        /**
         * Sets [Builder.externalStudyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalStudyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalStudyId(externalStudyId: JsonField<String>) = apply {
            this.externalStudyId = externalStudyId
        }

        fun modality(modality: String) = modality(JsonField.of(modality))

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { this.modality = modality }

        /** YYYY-MM-DD */
        fun studyDate(studyDate: String) = studyDate(JsonField.of(studyDate))

        /**
         * Sets [Builder.studyDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun studyDate(studyDate: JsonField<String>) = apply { this.studyDate = studyDate }

        fun studyDescription(studyDescription: String) =
            studyDescription(JsonField.of(studyDescription))

        /**
         * Sets [Builder.studyDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyDescription(studyDescription: JsonField<String>) = apply {
            this.studyDescription = studyDescription
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
         * Returns an immutable instance of [ClinicalContextEnrichmentPriorReport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .reportText()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClinicalContextEnrichmentPriorReport =
            ClinicalContextEnrichmentPriorReport(
                checkRequired("reportText", reportText),
                externalStudyId,
                modality,
                studyDate,
                studyDescription,
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
    fun validate(): ClinicalContextEnrichmentPriorReport = apply {
        if (validated) {
            return@apply
        }

        reportText()
        externalStudyId()
        modality()
        studyDate()
        studyDescription()
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
        (if (reportText.asKnown().isPresent) 1 else 0) +
            (if (externalStudyId.asKnown().isPresent) 1 else 0) +
            (if (modality.asKnown().isPresent) 1 else 0) +
            (if (studyDate.asKnown().isPresent) 1 else 0) +
            (if (studyDescription.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalContextEnrichmentPriorReport &&
            reportText == other.reportText &&
            externalStudyId == other.externalStudyId &&
            modality == other.modality &&
            studyDate == other.studyDate &&
            studyDescription == other.studyDescription &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            reportText,
            externalStudyId,
            modality,
            studyDate,
            studyDescription,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClinicalContextEnrichmentPriorReport{reportText=$reportText, externalStudyId=$externalStudyId, modality=$modality, studyDate=$studyDate, studyDescription=$studyDescription, additionalProperties=$additionalProperties}"
}
