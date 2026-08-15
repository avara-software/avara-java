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
 * One worklist item shaped for direct DICOM Dataset construction on the on-prem box. Field names
 * are PascalCase DICOM-style intentionally.
 */
class ModalityWorklistItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessionNumber: JsonField<String>,
    private val modality: JsonField<String>,
    private val patientBirthDate: JsonField<String>,
    private val patientId: JsonField<String>,
    private val patientName: JsonField<String>,
    private val patientSex: JsonField<String>,
    private val patientSize: JsonField<String>,
    private val patientWeight: JsonField<String>,
    private val protocolName: JsonField<String>,
    private val requestedProcedureDescription: JsonField<String>,
    private val scheduledProcedureStepSequence: JsonField<List<ModalityWorklistScheduledStep>>,
    private val studyDescription: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("AccessionNumber")
        @ExcludeMissing
        accessionNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("Modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("PatientBirthDate")
        @ExcludeMissing
        patientBirthDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("PatientID") @ExcludeMissing patientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("PatientName")
        @ExcludeMissing
        patientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("PatientSex")
        @ExcludeMissing
        patientSex: JsonField<String> = JsonMissing.of(),
        @JsonProperty("PatientSize")
        @ExcludeMissing
        patientSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("PatientWeight")
        @ExcludeMissing
        patientWeight: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ProtocolName")
        @ExcludeMissing
        protocolName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("RequestedProcedureDescription")
        @ExcludeMissing
        requestedProcedureDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ScheduledProcedureStepSequence")
        @ExcludeMissing
        scheduledProcedureStepSequence: JsonField<List<ModalityWorklistScheduledStep>> =
            JsonMissing.of(),
        @JsonProperty("StudyDescription")
        @ExcludeMissing
        studyDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("StudyInstanceUID")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
    ) : this(
        accessionNumber,
        modality,
        patientBirthDate,
        patientId,
        patientName,
        patientSex,
        patientSize,
        patientWeight,
        protocolName,
        requestedProcedureDescription,
        scheduledProcedureStepSequence,
        studyDescription,
        studyInstanceUid,
        mutableMapOf(),
    )

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessionNumber(): String = accessionNumber.getRequired("AccessionNumber")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modality(): String = modality.getRequired("Modality")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patientBirthDate(): String = patientBirthDate.getRequired("PatientBirthDate")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patientId(): String = patientId.getRequired("PatientID")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patientName(): String = patientName.getRequired("PatientName")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patientSex(): String = patientSex.getRequired("PatientSex")

    /**
     * Patient size; empty string allowed
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patientSize(): String = patientSize.getRequired("PatientSize")

    /**
     * Patient weight; empty string allowed
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patientWeight(): String = patientWeight.getRequired("PatientWeight")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun protocolName(): String = protocolName.getRequired("ProtocolName")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedProcedureDescription(): String =
        requestedProcedureDescription.getRequired("RequestedProcedureDescription")

    /**
     * Scheduled procedure steps for this worklist item. Most appointments/studies have a single
     * step; include additional steps only when the RIS schedules multiple.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduledProcedureStepSequence(): List<ModalityWorklistScheduledStep> =
        scheduledProcedureStepSequence.getRequired("ScheduledProcedureStepSequence")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyDescription(): String = studyDescription.getRequired("StudyDescription")

    /**
     * Required from partner RIS today; do not omit.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = studyInstanceUid.getRequired("StudyInstanceUID")

    /**
     * Returns the raw JSON value of [accessionNumber].
     *
     * Unlike [accessionNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("AccessionNumber")
    @ExcludeMissing
    fun _accessionNumber(): JsonField<String> = accessionNumber

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("Modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

    /**
     * Returns the raw JSON value of [patientBirthDate].
     *
     * Unlike [patientBirthDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("PatientBirthDate")
    @ExcludeMissing
    fun _patientBirthDate(): JsonField<String> = patientBirthDate

    /**
     * Returns the raw JSON value of [patientId].
     *
     * Unlike [patientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("PatientID") @ExcludeMissing fun _patientId(): JsonField<String> = patientId

    /**
     * Returns the raw JSON value of [patientName].
     *
     * Unlike [patientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("PatientName") @ExcludeMissing fun _patientName(): JsonField<String> = patientName

    /**
     * Returns the raw JSON value of [patientSex].
     *
     * Unlike [patientSex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("PatientSex") @ExcludeMissing fun _patientSex(): JsonField<String> = patientSex

    /**
     * Returns the raw JSON value of [patientSize].
     *
     * Unlike [patientSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("PatientSize") @ExcludeMissing fun _patientSize(): JsonField<String> = patientSize

    /**
     * Returns the raw JSON value of [patientWeight].
     *
     * Unlike [patientWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("PatientWeight")
    @ExcludeMissing
    fun _patientWeight(): JsonField<String> = patientWeight

    /**
     * Returns the raw JSON value of [protocolName].
     *
     * Unlike [protocolName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ProtocolName")
    @ExcludeMissing
    fun _protocolName(): JsonField<String> = protocolName

    /**
     * Returns the raw JSON value of [requestedProcedureDescription].
     *
     * Unlike [requestedProcedureDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("RequestedProcedureDescription")
    @ExcludeMissing
    fun _requestedProcedureDescription(): JsonField<String> = requestedProcedureDescription

    /**
     * Returns the raw JSON value of [scheduledProcedureStepSequence].
     *
     * Unlike [scheduledProcedureStepSequence], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ScheduledProcedureStepSequence")
    @ExcludeMissing
    fun _scheduledProcedureStepSequence(): JsonField<List<ModalityWorklistScheduledStep>> =
        scheduledProcedureStepSequence

    /**
     * Returns the raw JSON value of [studyDescription].
     *
     * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("StudyDescription")
    @ExcludeMissing
    fun _studyDescription(): JsonField<String> = studyDescription

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("StudyInstanceUID")
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
         * Returns a mutable builder for constructing an instance of [ModalityWorklistItem].
         *
         * The following fields are required:
         * ```java
         * .accessionNumber()
         * .modality()
         * .patientBirthDate()
         * .patientId()
         * .patientName()
         * .patientSex()
         * .patientSize()
         * .patientWeight()
         * .protocolName()
         * .requestedProcedureDescription()
         * .scheduledProcedureStepSequence()
         * .studyDescription()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModalityWorklistItem]. */
    class Builder internal constructor() {

        private var accessionNumber: JsonField<String>? = null
        private var modality: JsonField<String>? = null
        private var patientBirthDate: JsonField<String>? = null
        private var patientId: JsonField<String>? = null
        private var patientName: JsonField<String>? = null
        private var patientSex: JsonField<String>? = null
        private var patientSize: JsonField<String>? = null
        private var patientWeight: JsonField<String>? = null
        private var protocolName: JsonField<String>? = null
        private var requestedProcedureDescription: JsonField<String>? = null
        private var scheduledProcedureStepSequence:
            JsonField<MutableList<ModalityWorklistScheduledStep>>? =
            null
        private var studyDescription: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modalityWorklistItem: ModalityWorklistItem) = apply {
            accessionNumber = modalityWorklistItem.accessionNumber
            modality = modalityWorklistItem.modality
            patientBirthDate = modalityWorklistItem.patientBirthDate
            patientId = modalityWorklistItem.patientId
            patientName = modalityWorklistItem.patientName
            patientSex = modalityWorklistItem.patientSex
            patientSize = modalityWorklistItem.patientSize
            patientWeight = modalityWorklistItem.patientWeight
            protocolName = modalityWorklistItem.protocolName
            requestedProcedureDescription = modalityWorklistItem.requestedProcedureDescription
            scheduledProcedureStepSequence =
                modalityWorklistItem.scheduledProcedureStepSequence.map { it.toMutableList() }
            studyDescription = modalityWorklistItem.studyDescription
            studyInstanceUid = modalityWorklistItem.studyInstanceUid
            additionalProperties = modalityWorklistItem.additionalProperties.toMutableMap()
        }

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

        fun modality(modality: String) = modality(JsonField.of(modality))

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { this.modality = modality }

        fun patientBirthDate(patientBirthDate: String) =
            patientBirthDate(JsonField.of(patientBirthDate))

        /**
         * Sets [Builder.patientBirthDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientBirthDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patientBirthDate(patientBirthDate: JsonField<String>) = apply {
            this.patientBirthDate = patientBirthDate
        }

        fun patientId(patientId: String) = patientId(JsonField.of(patientId))

        /**
         * Sets [Builder.patientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientId(patientId: JsonField<String>) = apply { this.patientId = patientId }

        fun patientName(patientName: String) = patientName(JsonField.of(patientName))

        /**
         * Sets [Builder.patientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientName(patientName: JsonField<String>) = apply { this.patientName = patientName }

        fun patientSex(patientSex: String) = patientSex(JsonField.of(patientSex))

        /**
         * Sets [Builder.patientSex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientSex] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientSex(patientSex: JsonField<String>) = apply { this.patientSex = patientSex }

        /** Patient size; empty string allowed */
        fun patientSize(patientSize: String) = patientSize(JsonField.of(patientSize))

        /**
         * Sets [Builder.patientSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientSize(patientSize: JsonField<String>) = apply { this.patientSize = patientSize }

        /** Patient weight; empty string allowed */
        fun patientWeight(patientWeight: String) = patientWeight(JsonField.of(patientWeight))

        /**
         * Sets [Builder.patientWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientWeight] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientWeight(patientWeight: JsonField<String>) = apply {
            this.patientWeight = patientWeight
        }

        fun protocolName(protocolName: String) = protocolName(JsonField.of(protocolName))

        /**
         * Sets [Builder.protocolName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protocolName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun protocolName(protocolName: JsonField<String>) = apply {
            this.protocolName = protocolName
        }

        fun requestedProcedureDescription(requestedProcedureDescription: String) =
            requestedProcedureDescription(JsonField.of(requestedProcedureDescription))

        /**
         * Sets [Builder.requestedProcedureDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedProcedureDescription] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun requestedProcedureDescription(requestedProcedureDescription: JsonField<String>) =
            apply {
                this.requestedProcedureDescription = requestedProcedureDescription
            }

        /**
         * Scheduled procedure steps for this worklist item. Most appointments/studies have a single
         * step; include additional steps only when the RIS schedules multiple.
         */
        fun scheduledProcedureStepSequence(
            scheduledProcedureStepSequence: List<ModalityWorklistScheduledStep>
        ) = scheduledProcedureStepSequence(JsonField.of(scheduledProcedureStepSequence))

        /**
         * Sets [Builder.scheduledProcedureStepSequence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledProcedureStepSequence] with a well-typed
         * `List<ModalityWorklistScheduledStep>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun scheduledProcedureStepSequence(
            scheduledProcedureStepSequence: JsonField<List<ModalityWorklistScheduledStep>>
        ) = apply {
            this.scheduledProcedureStepSequence =
                scheduledProcedureStepSequence.map { it.toMutableList() }
        }

        /**
         * Adds a single [ModalityWorklistScheduledStep] to
         * [Builder.scheduledProcedureStepSequence].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScheduledProcedureStepSequence(
            scheduledProcedureStepSequence: ModalityWorklistScheduledStep
        ) = apply {
            this.scheduledProcedureStepSequence =
                (this.scheduledProcedureStepSequence ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scheduledProcedureStepSequence", it)
                        .add(scheduledProcedureStepSequence)
                }
        }

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

        /** Required from partner RIS today; do not omit. */
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
         * Returns an immutable instance of [ModalityWorklistItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessionNumber()
         * .modality()
         * .patientBirthDate()
         * .patientId()
         * .patientName()
         * .patientSex()
         * .patientSize()
         * .patientWeight()
         * .protocolName()
         * .requestedProcedureDescription()
         * .scheduledProcedureStepSequence()
         * .studyDescription()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModalityWorklistItem =
            ModalityWorklistItem(
                checkRequired("accessionNumber", accessionNumber),
                checkRequired("modality", modality),
                checkRequired("patientBirthDate", patientBirthDate),
                checkRequired("patientId", patientId),
                checkRequired("patientName", patientName),
                checkRequired("patientSex", patientSex),
                checkRequired("patientSize", patientSize),
                checkRequired("patientWeight", patientWeight),
                checkRequired("protocolName", protocolName),
                checkRequired("requestedProcedureDescription", requestedProcedureDescription),
                checkRequired("scheduledProcedureStepSequence", scheduledProcedureStepSequence)
                    .map { it.toImmutable() },
                checkRequired("studyDescription", studyDescription),
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
    fun validate(): ModalityWorklistItem = apply {
        if (validated) {
            return@apply
        }

        accessionNumber()
        modality()
        patientBirthDate()
        patientId()
        patientName()
        patientSex()
        patientSize()
        patientWeight()
        protocolName()
        requestedProcedureDescription()
        scheduledProcedureStepSequence().forEach { it.validate() }
        studyDescription()
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
        (if (accessionNumber.asKnown().isPresent) 1 else 0) +
            (if (modality.asKnown().isPresent) 1 else 0) +
            (if (patientBirthDate.asKnown().isPresent) 1 else 0) +
            (if (patientId.asKnown().isPresent) 1 else 0) +
            (if (patientName.asKnown().isPresent) 1 else 0) +
            (if (patientSex.asKnown().isPresent) 1 else 0) +
            (if (patientSize.asKnown().isPresent) 1 else 0) +
            (if (patientWeight.asKnown().isPresent) 1 else 0) +
            (if (protocolName.asKnown().isPresent) 1 else 0) +
            (if (requestedProcedureDescription.asKnown().isPresent) 1 else 0) +
            (scheduledProcedureStepSequence.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (if (studyDescription.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModalityWorklistItem &&
            accessionNumber == other.accessionNumber &&
            modality == other.modality &&
            patientBirthDate == other.patientBirthDate &&
            patientId == other.patientId &&
            patientName == other.patientName &&
            patientSex == other.patientSex &&
            patientSize == other.patientSize &&
            patientWeight == other.patientWeight &&
            protocolName == other.protocolName &&
            requestedProcedureDescription == other.requestedProcedureDescription &&
            scheduledProcedureStepSequence == other.scheduledProcedureStepSequence &&
            studyDescription == other.studyDescription &&
            studyInstanceUid == other.studyInstanceUid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accessionNumber,
            modality,
            patientBirthDate,
            patientId,
            patientName,
            patientSex,
            patientSize,
            patientWeight,
            protocolName,
            requestedProcedureDescription,
            scheduledProcedureStepSequence,
            studyDescription,
            studyInstanceUid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModalityWorklistItem{accessionNumber=$accessionNumber, modality=$modality, patientBirthDate=$patientBirthDate, patientId=$patientId, patientName=$patientName, patientSex=$patientSex, patientSize=$patientSize, patientWeight=$patientWeight, protocolName=$protocolName, requestedProcedureDescription=$requestedProcedureDescription, scheduledProcedureStepSequence=$scheduledProcedureStepSequence, studyDescription=$studyDescription, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
}
