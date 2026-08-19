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

/** Scheduled procedure step used to construct DICOM MWL datasets */
class ModalityWorklistScheduledStep
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val modality: JsonField<String>,
    private val scheduledProcedureStepDescription: JsonField<String>,
    private val scheduledProcedureStepId: JsonField<String>,
    private val scheduledProcedureStepStartDate: JsonField<String>,
    private val scheduledProcedureStepStartTime: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("Modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ScheduledProcedureStepDescription")
        @ExcludeMissing
        scheduledProcedureStepDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ScheduledProcedureStepID")
        @ExcludeMissing
        scheduledProcedureStepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ScheduledProcedureStepStartDate")
        @ExcludeMissing
        scheduledProcedureStepStartDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ScheduledProcedureStepStartTime")
        @ExcludeMissing
        scheduledProcedureStepStartTime: JsonField<String> = JsonMissing.of(),
    ) : this(
        modality,
        scheduledProcedureStepDescription,
        scheduledProcedureStepId,
        scheduledProcedureStepStartDate,
        scheduledProcedureStepStartTime,
        mutableMapOf(),
    )

    /**
     * Modality for this scheduled step
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modality(): String = modality.getRequired("Modality")

    /**
     * Human-readable description of the scheduled step
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledProcedureStepDescription(): String =
        scheduledProcedureStepDescription.getRequired("ScheduledProcedureStepDescription")

    /**
     * Scheduled procedure step identifier (DICOM SH, max 16)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledProcedureStepId(): String =
        scheduledProcedureStepId.getRequired("ScheduledProcedureStepID")

    /**
     * Scheduled start date (DICOM DA: YYYYMMDD)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledProcedureStepStartDate(): String =
        scheduledProcedureStepStartDate.getRequired("ScheduledProcedureStepStartDate")

    /**
     * Scheduled start time (DICOM TM: HHMMSS)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledProcedureStepStartTime(): String =
        scheduledProcedureStepStartTime.getRequired("ScheduledProcedureStepStartTime")

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

    /**
     * Returns the raw JSON value of [scheduledProcedureStepDescription].
     *
     * Unlike [scheduledProcedureStepDescription], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("ScheduledProcedureStepDescription")
    @ExcludeMissing
    fun _scheduledProcedureStepDescription(): JsonField<String> = scheduledProcedureStepDescription

    /**
     * Returns the raw JSON value of [scheduledProcedureStepId].
     *
     * Unlike [scheduledProcedureStepId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ScheduledProcedureStepID")
    @ExcludeMissing
    fun _scheduledProcedureStepId(): JsonField<String> = scheduledProcedureStepId

    /**
     * Returns the raw JSON value of [scheduledProcedureStepStartDate].
     *
     * Unlike [scheduledProcedureStepStartDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ScheduledProcedureStepStartDate")
    @ExcludeMissing
    fun _scheduledProcedureStepStartDate(): JsonField<String> = scheduledProcedureStepStartDate

    /**
     * Returns the raw JSON value of [scheduledProcedureStepStartTime].
     *
     * Unlike [scheduledProcedureStepStartTime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ScheduledProcedureStepStartTime")
    @ExcludeMissing
    fun _scheduledProcedureStepStartTime(): JsonField<String> = scheduledProcedureStepStartTime

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
         * [ModalityWorklistScheduledStep].
         *
         * The following fields are required:
         * ```java
         * .modality()
         * .scheduledProcedureStepDescription()
         * .scheduledProcedureStepId()
         * .scheduledProcedureStepStartDate()
         * .scheduledProcedureStepStartTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModalityWorklistScheduledStep]. */
    class Builder internal constructor() {

        private var modality: JsonField<String>? = null
        private var scheduledProcedureStepDescription: JsonField<String>? = null
        private var scheduledProcedureStepId: JsonField<String>? = null
        private var scheduledProcedureStepStartDate: JsonField<String>? = null
        private var scheduledProcedureStepStartTime: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modalityWorklistScheduledStep: ModalityWorklistScheduledStep) = apply {
            modality = modalityWorklistScheduledStep.modality
            scheduledProcedureStepDescription =
                modalityWorklistScheduledStep.scheduledProcedureStepDescription
            scheduledProcedureStepId = modalityWorklistScheduledStep.scheduledProcedureStepId
            scheduledProcedureStepStartDate =
                modalityWorklistScheduledStep.scheduledProcedureStepStartDate
            scheduledProcedureStepStartTime =
                modalityWorklistScheduledStep.scheduledProcedureStepStartTime
            additionalProperties = modalityWorklistScheduledStep.additionalProperties.toMutableMap()
        }

        /** Modality for this scheduled step */
        fun modality(modality: String) = modality(JsonField.of(modality))

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { this.modality = modality }

        /** Human-readable description of the scheduled step */
        fun scheduledProcedureStepDescription(scheduledProcedureStepDescription: String) =
            scheduledProcedureStepDescription(JsonField.of(scheduledProcedureStepDescription))

        /**
         * Sets [Builder.scheduledProcedureStepDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledProcedureStepDescription] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun scheduledProcedureStepDescription(
            scheduledProcedureStepDescription: JsonField<String>
        ) = apply { this.scheduledProcedureStepDescription = scheduledProcedureStepDescription }

        /** Scheduled procedure step identifier (DICOM SH, max 16) */
        fun scheduledProcedureStepId(scheduledProcedureStepId: String) =
            scheduledProcedureStepId(JsonField.of(scheduledProcedureStepId))

        /**
         * Sets [Builder.scheduledProcedureStepId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledProcedureStepId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scheduledProcedureStepId(scheduledProcedureStepId: JsonField<String>) = apply {
            this.scheduledProcedureStepId = scheduledProcedureStepId
        }

        /** Scheduled start date (DICOM DA: YYYYMMDD) */
        fun scheduledProcedureStepStartDate(scheduledProcedureStepStartDate: String) =
            scheduledProcedureStepStartDate(JsonField.of(scheduledProcedureStepStartDate))

        /**
         * Sets [Builder.scheduledProcedureStepStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledProcedureStepStartDate] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun scheduledProcedureStepStartDate(scheduledProcedureStepStartDate: JsonField<String>) =
            apply {
                this.scheduledProcedureStepStartDate = scheduledProcedureStepStartDate
            }

        /** Scheduled start time (DICOM TM: HHMMSS) */
        fun scheduledProcedureStepStartTime(scheduledProcedureStepStartTime: String) =
            scheduledProcedureStepStartTime(JsonField.of(scheduledProcedureStepStartTime))

        /**
         * Sets [Builder.scheduledProcedureStepStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledProcedureStepStartTime] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun scheduledProcedureStepStartTime(scheduledProcedureStepStartTime: JsonField<String>) =
            apply {
                this.scheduledProcedureStepStartTime = scheduledProcedureStepStartTime
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
         * Returns an immutable instance of [ModalityWorklistScheduledStep].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .modality()
         * .scheduledProcedureStepDescription()
         * .scheduledProcedureStepId()
         * .scheduledProcedureStepStartDate()
         * .scheduledProcedureStepStartTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModalityWorklistScheduledStep =
            ModalityWorklistScheduledStep(
                checkRequired("modality", modality),
                checkRequired(
                    "scheduledProcedureStepDescription",
                    scheduledProcedureStepDescription,
                ),
                checkRequired("scheduledProcedureStepId", scheduledProcedureStepId),
                checkRequired("scheduledProcedureStepStartDate", scheduledProcedureStepStartDate),
                checkRequired("scheduledProcedureStepStartTime", scheduledProcedureStepStartTime),
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
    fun validate(): ModalityWorklistScheduledStep = apply {
        if (validated) {
            return@apply
        }

        modality()
        scheduledProcedureStepDescription()
        scheduledProcedureStepId()
        scheduledProcedureStepStartDate()
        scheduledProcedureStepStartTime()
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
        (if (modality.asKnown().isPresent) 1 else 0) +
            (if (scheduledProcedureStepDescription.asKnown().isPresent) 1 else 0) +
            (if (scheduledProcedureStepId.asKnown().isPresent) 1 else 0) +
            (if (scheduledProcedureStepStartDate.asKnown().isPresent) 1 else 0) +
            (if (scheduledProcedureStepStartTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModalityWorklistScheduledStep &&
            modality == other.modality &&
            scheduledProcedureStepDescription == other.scheduledProcedureStepDescription &&
            scheduledProcedureStepId == other.scheduledProcedureStepId &&
            scheduledProcedureStepStartDate == other.scheduledProcedureStepStartDate &&
            scheduledProcedureStepStartTime == other.scheduledProcedureStepStartTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            modality,
            scheduledProcedureStepDescription,
            scheduledProcedureStepId,
            scheduledProcedureStepStartDate,
            scheduledProcedureStepStartTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModalityWorklistScheduledStep{modality=$modality, scheduledProcedureStepDescription=$scheduledProcedureStepDescription, scheduledProcedureStepId=$scheduledProcedureStepId, scheduledProcedureStepStartDate=$scheduledProcedureStepStartDate, scheduledProcedureStepStartTime=$scheduledProcedureStepStartTime, additionalProperties=$additionalProperties}"
}
