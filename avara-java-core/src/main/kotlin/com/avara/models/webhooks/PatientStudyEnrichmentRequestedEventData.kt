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

/** Event payload for soft patient/study enrichment after Avara PACS seeds a study */
class PatientStudyEnrichmentRequestedEventData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clinicId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val accessionNumber: JsonField<String>,
    private val patientId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clinicId") @ExcludeMissing clinicId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accessionNumber")
        @ExcludeMissing
        accessionNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("patientId") @ExcludeMissing patientId: JsonField<String> = JsonMissing.of(),
    ) : this(clinicId, studyInstanceUid, accessionNumber, patientId, mutableMapOf())

    /**
     * Clinic UUID
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicId(): String = clinicId.getRequired("clinicId")

    /**
     * DICOM Study Instance UID
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

    /**
     * Accession number from DICOM when available
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessionNumber(): Optional<String> = accessionNumber.getOptional("accessionNumber")

    /**
     * Patient ID from DICOM when available
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patientId(): Optional<String> = patientId.getOptional("patientId")

    /**
     * Returns the raw JSON value of [clinicId].
     *
     * Unlike [clinicId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clinicId") @ExcludeMissing fun _clinicId(): JsonField<String> = clinicId

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyInstanceUid")
    @ExcludeMissing
    fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

    /**
     * Returns the raw JSON value of [accessionNumber].
     *
     * Unlike [accessionNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessionNumber")
    @ExcludeMissing
    fun _accessionNumber(): JsonField<String> = accessionNumber

    /**
     * Returns the raw JSON value of [patientId].
     *
     * Unlike [patientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("patientId") @ExcludeMissing fun _patientId(): JsonField<String> = patientId

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
         * [PatientStudyEnrichmentRequestedEventData].
         *
         * The following fields are required:
         * ```java
         * .clinicId()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PatientStudyEnrichmentRequestedEventData]. */
    class Builder internal constructor() {

        private var clinicId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var accessionNumber: JsonField<String> = JsonMissing.of()
        private var patientId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            patientStudyEnrichmentRequestedEventData: PatientStudyEnrichmentRequestedEventData
        ) = apply {
            clinicId = patientStudyEnrichmentRequestedEventData.clinicId
            studyInstanceUid = patientStudyEnrichmentRequestedEventData.studyInstanceUid
            accessionNumber = patientStudyEnrichmentRequestedEventData.accessionNumber
            patientId = patientStudyEnrichmentRequestedEventData.patientId
            additionalProperties =
                patientStudyEnrichmentRequestedEventData.additionalProperties.toMutableMap()
        }

        /** Clinic UUID */
        fun clinicId(clinicId: String) = clinicId(JsonField.of(clinicId))

        /**
         * Sets [Builder.clinicId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clinicId(clinicId: JsonField<String>) = apply { this.clinicId = clinicId }

        /** DICOM Study Instance UID */
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

        /** Accession number from DICOM when available */
        fun accessionNumber(accessionNumber: String) =
            accessionNumber(JsonField.of(accessionNumber))

        /**
         * Sets [Builder.accessionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessionNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessionNumber(accessionNumber: JsonField<String>) = apply {
            this.accessionNumber = accessionNumber
        }

        /** Patient ID from DICOM when available */
        fun patientId(patientId: String) = patientId(JsonField.of(patientId))

        /**
         * Sets [Builder.patientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientId(patientId: JsonField<String>) = apply { this.patientId = patientId }

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
         * Returns an immutable instance of [PatientStudyEnrichmentRequestedEventData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clinicId()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PatientStudyEnrichmentRequestedEventData =
            PatientStudyEnrichmentRequestedEventData(
                checkRequired("clinicId", clinicId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                accessionNumber,
                patientId,
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
    fun validate(): PatientStudyEnrichmentRequestedEventData = apply {
        if (validated) {
            return@apply
        }

        clinicId()
        studyInstanceUid()
        accessionNumber()
        patientId()
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
        (if (clinicId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
            (if (accessionNumber.asKnown().isPresent) 1 else 0) +
            (if (patientId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatientStudyEnrichmentRequestedEventData &&
            clinicId == other.clinicId &&
            studyInstanceUid == other.studyInstanceUid &&
            accessionNumber == other.accessionNumber &&
            patientId == other.patientId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(clinicId, studyInstanceUid, accessionNumber, patientId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PatientStudyEnrichmentRequestedEventData{clinicId=$clinicId, studyInstanceUid=$studyInstanceUid, accessionNumber=$accessionNumber, patientId=$patientId, additionalProperties=$additionalProperties}"
}
