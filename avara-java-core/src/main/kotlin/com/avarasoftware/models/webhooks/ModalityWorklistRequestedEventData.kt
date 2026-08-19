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

/** Event payload for a modality worklist (C-FIND MWL) request */
class ModalityWorklistRequestedEventData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callingAe: JsonField<String>,
    private val clinicId: JsonField<String>,
    private val dateEnd: JsonField<String>,
    private val dateStart: JsonField<String>,
    private val sourceIp: JsonField<String>,
    private val modality: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("callingAe") @ExcludeMissing callingAe: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clinicId") @ExcludeMissing clinicId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateEnd") @ExcludeMissing dateEnd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateStart") @ExcludeMissing dateStart: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceIp") @ExcludeMissing sourceIp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
    ) : this(callingAe, clinicId, dateEnd, dateStart, sourceIp, modality, mutableMapOf())

    /**
     * Calling AE title from the modality
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callingAe(): String = callingAe.getRequired("callingAe")

    /**
     * Clinic UUID that owns the modality / worklist query
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicId(): String = clinicId.getRequired("clinicId")

    /**
     * Inclusive worklist window end date (YYYY-MM-DD)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateEnd(): String = dateEnd.getRequired("dateEnd")

    /**
     * Inclusive worklist window start date (YYYY-MM-DD)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateStart(): String = dateStart.getRequired("dateStart")

    /**
     * Source IP observed by Avara for the modality request
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceIp(): String = sourceIp.getRequired("sourceIp")

    /**
     * Present when the modality C-FIND included a modality filter
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modality(): Optional<String> = modality.getOptional("modality")

    /**
     * Returns the raw JSON value of [callingAe].
     *
     * Unlike [callingAe], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callingAe") @ExcludeMissing fun _callingAe(): JsonField<String> = callingAe

    /**
     * Returns the raw JSON value of [clinicId].
     *
     * Unlike [clinicId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clinicId") @ExcludeMissing fun _clinicId(): JsonField<String> = clinicId

    /**
     * Returns the raw JSON value of [dateEnd].
     *
     * Unlike [dateEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateEnd") @ExcludeMissing fun _dateEnd(): JsonField<String> = dateEnd

    /**
     * Returns the raw JSON value of [dateStart].
     *
     * Unlike [dateStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateStart") @ExcludeMissing fun _dateStart(): JsonField<String> = dateStart

    /**
     * Returns the raw JSON value of [sourceIp].
     *
     * Unlike [sourceIp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceIp") @ExcludeMissing fun _sourceIp(): JsonField<String> = sourceIp

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

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
         * [ModalityWorklistRequestedEventData].
         *
         * The following fields are required:
         * ```java
         * .callingAe()
         * .clinicId()
         * .dateEnd()
         * .dateStart()
         * .sourceIp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModalityWorklistRequestedEventData]. */
    class Builder internal constructor() {

        private var callingAe: JsonField<String>? = null
        private var clinicId: JsonField<String>? = null
        private var dateEnd: JsonField<String>? = null
        private var dateStart: JsonField<String>? = null
        private var sourceIp: JsonField<String>? = null
        private var modality: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modalityWorklistRequestedEventData: ModalityWorklistRequestedEventData) =
            apply {
                callingAe = modalityWorklistRequestedEventData.callingAe
                clinicId = modalityWorklistRequestedEventData.clinicId
                dateEnd = modalityWorklistRequestedEventData.dateEnd
                dateStart = modalityWorklistRequestedEventData.dateStart
                sourceIp = modalityWorklistRequestedEventData.sourceIp
                modality = modalityWorklistRequestedEventData.modality
                additionalProperties =
                    modalityWorklistRequestedEventData.additionalProperties.toMutableMap()
            }

        /** Calling AE title from the modality */
        fun callingAe(callingAe: String) = callingAe(JsonField.of(callingAe))

        /**
         * Sets [Builder.callingAe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callingAe] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callingAe(callingAe: JsonField<String>) = apply { this.callingAe = callingAe }

        /** Clinic UUID that owns the modality / worklist query */
        fun clinicId(clinicId: String) = clinicId(JsonField.of(clinicId))

        /**
         * Sets [Builder.clinicId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clinicId(clinicId: JsonField<String>) = apply { this.clinicId = clinicId }

        /** Inclusive worklist window end date (YYYY-MM-DD) */
        fun dateEnd(dateEnd: String) = dateEnd(JsonField.of(dateEnd))

        /**
         * Sets [Builder.dateEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateEnd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dateEnd(dateEnd: JsonField<String>) = apply { this.dateEnd = dateEnd }

        /** Inclusive worklist window start date (YYYY-MM-DD) */
        fun dateStart(dateStart: String) = dateStart(JsonField.of(dateStart))

        /**
         * Sets [Builder.dateStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateStart] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateStart(dateStart: JsonField<String>) = apply { this.dateStart = dateStart }

        /** Source IP observed by Avara for the modality request */
        fun sourceIp(sourceIp: String) = sourceIp(JsonField.of(sourceIp))

        /**
         * Sets [Builder.sourceIp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceIp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceIp(sourceIp: JsonField<String>) = apply { this.sourceIp = sourceIp }

        /** Present when the modality C-FIND included a modality filter */
        fun modality(modality: String) = modality(JsonField.of(modality))

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { this.modality = modality }

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
         * Returns an immutable instance of [ModalityWorklistRequestedEventData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callingAe()
         * .clinicId()
         * .dateEnd()
         * .dateStart()
         * .sourceIp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModalityWorklistRequestedEventData =
            ModalityWorklistRequestedEventData(
                checkRequired("callingAe", callingAe),
                checkRequired("clinicId", clinicId),
                checkRequired("dateEnd", dateEnd),
                checkRequired("dateStart", dateStart),
                checkRequired("sourceIp", sourceIp),
                modality,
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
    fun validate(): ModalityWorklistRequestedEventData = apply {
        if (validated) {
            return@apply
        }

        callingAe()
        clinicId()
        dateEnd()
        dateStart()
        sourceIp()
        modality()
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
        (if (callingAe.asKnown().isPresent) 1 else 0) +
            (if (clinicId.asKnown().isPresent) 1 else 0) +
            (if (dateEnd.asKnown().isPresent) 1 else 0) +
            (if (dateStart.asKnown().isPresent) 1 else 0) +
            (if (sourceIp.asKnown().isPresent) 1 else 0) +
            (if (modality.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModalityWorklistRequestedEventData &&
            callingAe == other.callingAe &&
            clinicId == other.clinicId &&
            dateEnd == other.dateEnd &&
            dateStart == other.dateStart &&
            sourceIp == other.sourceIp &&
            modality == other.modality &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callingAe,
            clinicId,
            dateEnd,
            dateStart,
            sourceIp,
            modality,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModalityWorklistRequestedEventData{callingAe=$callingAe, clinicId=$clinicId, dateEnd=$dateEnd, dateStart=$dateStart, sourceIp=$sourceIp, modality=$modality, additionalProperties=$additionalProperties}"
}
