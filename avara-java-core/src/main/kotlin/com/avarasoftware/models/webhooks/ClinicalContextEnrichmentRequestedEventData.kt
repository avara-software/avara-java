// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkRequired
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Event payload for soft clinical context enrichment when AutoScribe needs EHR context for a study
 */
class ClinicalContextEnrichmentRequestedEventData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clinicId: JsonField<String>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val externalPatientId: JsonField<String>,
    private val mrn: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clinicId") @ExcludeMissing clinicId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalPatientId")
        @ExcludeMissing
        externalPatientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mrn") @ExcludeMissing mrn: JsonField<String> = JsonMissing.of(),
    ) : this(clinicId, studyId, studyInstanceUid, externalPatientId, mrn, mutableMapOf())

    /**
     * Clinic UUID
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicId(): String = clinicId.getRequired("clinicId")

    /**
     * Raw study UUID v4 (not branded stu_…)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyId(): String = studyId.getRequired("studyId")

    /**
     * DICOM Study Instance UID
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

    /**
     * External patient identifier when available
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPatientId(): Optional<String> = externalPatientId.getOptional("externalPatientId")

    /**
     * Medical record number when available
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mrn(): Optional<String> = mrn.getOptional("mrn")

    /**
     * Returns the raw JSON value of [clinicId].
     *
     * Unlike [clinicId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clinicId") @ExcludeMissing fun _clinicId(): JsonField<String> = clinicId

    /**
     * Returns the raw JSON value of [studyId].
     *
     * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studyId") @ExcludeMissing fun _studyId(): JsonField<String> = studyId

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
     * Returns the raw JSON value of [externalPatientId].
     *
     * Unlike [externalPatientId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalPatientId")
    @ExcludeMissing
    fun _externalPatientId(): JsonField<String> = externalPatientId

    /**
     * Returns the raw JSON value of [mrn].
     *
     * Unlike [mrn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mrn") @ExcludeMissing fun _mrn(): JsonField<String> = mrn

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
         * [ClinicalContextEnrichmentRequestedEventData].
         *
         * The following fields are required:
         * ```java
         * .clinicId()
         * .studyId()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalContextEnrichmentRequestedEventData]. */
    class Builder internal constructor() {

        private var clinicId: JsonField<String>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var externalPatientId: JsonField<String> = JsonMissing.of()
        private var mrn: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            clinicalContextEnrichmentRequestedEventData: ClinicalContextEnrichmentRequestedEventData
        ) = apply {
            clinicId = clinicalContextEnrichmentRequestedEventData.clinicId
            studyId = clinicalContextEnrichmentRequestedEventData.studyId
            studyInstanceUid = clinicalContextEnrichmentRequestedEventData.studyInstanceUid
            externalPatientId = clinicalContextEnrichmentRequestedEventData.externalPatientId
            mrn = clinicalContextEnrichmentRequestedEventData.mrn
            additionalProperties =
                clinicalContextEnrichmentRequestedEventData.additionalProperties.toMutableMap()
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

        /** Raw study UUID v4 (not branded stu_…) */
        fun studyId(studyId: String) = studyId(JsonField.of(studyId))

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun studyId(studyId: JsonField<String>) = apply { this.studyId = studyId }

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

        /** External patient identifier when available */
        fun externalPatientId(externalPatientId: String) =
            externalPatientId(JsonField.of(externalPatientId))

        /**
         * Sets [Builder.externalPatientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPatientId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalPatientId(externalPatientId: JsonField<String>) = apply {
            this.externalPatientId = externalPatientId
        }

        /** Medical record number when available */
        fun mrn(mrn: String) = mrn(JsonField.of(mrn))

        /**
         * Sets [Builder.mrn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mrn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mrn(mrn: JsonField<String>) = apply { this.mrn = mrn }

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
         * Returns an immutable instance of [ClinicalContextEnrichmentRequestedEventData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clinicId()
         * .studyId()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClinicalContextEnrichmentRequestedEventData =
            ClinicalContextEnrichmentRequestedEventData(
                checkRequired("clinicId", clinicId),
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                externalPatientId,
                mrn,
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
    fun validate(): ClinicalContextEnrichmentRequestedEventData = apply {
        if (validated) {
            return@apply
        }

        clinicId()
        studyId()
        studyInstanceUid()
        externalPatientId()
        mrn()
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
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
            (if (externalPatientId.asKnown().isPresent) 1 else 0) +
            (if (mrn.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalContextEnrichmentRequestedEventData &&
            clinicId == other.clinicId &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            externalPatientId == other.externalPatientId &&
            mrn == other.mrn &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clinicId,
            studyId,
            studyInstanceUid,
            externalPatientId,
            mrn,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClinicalContextEnrichmentRequestedEventData{clinicId=$clinicId, studyId=$studyId, studyInstanceUid=$studyInstanceUid, externalPatientId=$externalPatientId, mrn=$mrn, additionalProperties=$additionalProperties}"
}
