// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.Enum
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
import kotlin.jvm.optionals.getOrNull

/**
 * Soft enrichment response. No authorized field — return any subset of fields (including {}). Avara
 * merges per-field with DICOM light metadata then defaults.
 */
class PatientStudyEnrichmentRequestedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dateOfBirth: JsonField<String>,
    private val externalPatientId: JsonField<String>,
    private val facilityName: JsonField<String>,
    private val height: JsonField<Height>,
    private val mrn: JsonField<String>,
    private val patientName: JsonField<String>,
    private val procedure: JsonField<String>,
    private val referringPhysicianName: JsonField<String>,
    private val severity: JsonField<Severity>,
    private val sex: JsonField<Sex>,
    private val studyDate: JsonField<String>,
    private val studyDescription: JsonField<String>,
    private val studyTime: JsonField<String>,
    private val weight: JsonField<Weight>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dateOfBirth")
        @ExcludeMissing
        dateOfBirth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalPatientId")
        @ExcludeMissing
        externalPatientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("facilityName")
        @ExcludeMissing
        facilityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Height> = JsonMissing.of(),
        @JsonProperty("mrn") @ExcludeMissing mrn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("patientName")
        @ExcludeMissing
        patientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("procedure") @ExcludeMissing procedure: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referringPhysicianName")
        @ExcludeMissing
        referringPhysicianName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<Severity> = JsonMissing.of(),
        @JsonProperty("sex") @ExcludeMissing sex: JsonField<Sex> = JsonMissing.of(),
        @JsonProperty("studyDate") @ExcludeMissing studyDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyDescription")
        @ExcludeMissing
        studyDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyTime") @ExcludeMissing studyTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Weight> = JsonMissing.of(),
    ) : this(
        dateOfBirth,
        externalPatientId,
        facilityName,
        height,
        mrn,
        patientName,
        procedure,
        referringPhysicianName,
        severity,
        sex,
        studyDate,
        studyDescription,
        studyTime,
        weight,
        mutableMapOf(),
    )

    /**
     * YYYY-MM-DD
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfBirth(): Optional<String> = dateOfBirth.getOptional("dateOfBirth")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPatientId(): Optional<String> = externalPatientId.getOptional("externalPatientId")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun facilityName(): Optional<String> = facilityName.getOptional("facilityName")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Height> = height.getOptional("height")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mrn(): Optional<String> = mrn.getOptional("mrn")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patientName(): Optional<String> = patientName.getOptional("patientName")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun procedure(): Optional<String> = procedure.getOptional("procedure")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referringPhysicianName(): Optional<String> =
        referringPhysicianName.getOptional("referringPhysicianName")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severity(): Optional<Severity> = severity.getOptional("severity")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sex(): Optional<Sex> = sex.getOptional("sex")

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
     * HH:MM or HH:MM:SS[.fff]; Avara may truncate to HH:MM
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyTime(): Optional<String> = studyTime.getOptional("studyTime")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weight(): Optional<Weight> = weight.getOptional("weight")

    /**
     * Returns the raw JSON value of [dateOfBirth].
     *
     * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateOfBirth") @ExcludeMissing fun _dateOfBirth(): JsonField<String> = dateOfBirth

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
     * Returns the raw JSON value of [facilityName].
     *
     * Unlike [facilityName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("facilityName")
    @ExcludeMissing
    fun _facilityName(): JsonField<String> = facilityName

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Height> = height

    /**
     * Returns the raw JSON value of [mrn].
     *
     * Unlike [mrn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mrn") @ExcludeMissing fun _mrn(): JsonField<String> = mrn

    /**
     * Returns the raw JSON value of [patientName].
     *
     * Unlike [patientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("patientName") @ExcludeMissing fun _patientName(): JsonField<String> = patientName

    /**
     * Returns the raw JSON value of [procedure].
     *
     * Unlike [procedure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("procedure") @ExcludeMissing fun _procedure(): JsonField<String> = procedure

    /**
     * Returns the raw JSON value of [referringPhysicianName].
     *
     * Unlike [referringPhysicianName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("referringPhysicianName")
    @ExcludeMissing
    fun _referringPhysicianName(): JsonField<String> = referringPhysicianName

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

    /**
     * Returns the raw JSON value of [sex].
     *
     * Unlike [sex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sex") @ExcludeMissing fun _sex(): JsonField<Sex> = sex

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

    /**
     * Returns the raw JSON value of [studyTime].
     *
     * Unlike [studyTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studyTime") @ExcludeMissing fun _studyTime(): JsonField<String> = studyTime

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Weight> = weight

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
         * [PatientStudyEnrichmentRequestedResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PatientStudyEnrichmentRequestedResponse]. */
    class Builder internal constructor() {

        private var dateOfBirth: JsonField<String> = JsonMissing.of()
        private var externalPatientId: JsonField<String> = JsonMissing.of()
        private var facilityName: JsonField<String> = JsonMissing.of()
        private var height: JsonField<Height> = JsonMissing.of()
        private var mrn: JsonField<String> = JsonMissing.of()
        private var patientName: JsonField<String> = JsonMissing.of()
        private var procedure: JsonField<String> = JsonMissing.of()
        private var referringPhysicianName: JsonField<String> = JsonMissing.of()
        private var severity: JsonField<Severity> = JsonMissing.of()
        private var sex: JsonField<Sex> = JsonMissing.of()
        private var studyDate: JsonField<String> = JsonMissing.of()
        private var studyDescription: JsonField<String> = JsonMissing.of()
        private var studyTime: JsonField<String> = JsonMissing.of()
        private var weight: JsonField<Weight> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            patientStudyEnrichmentRequestedResponse: PatientStudyEnrichmentRequestedResponse
        ) = apply {
            dateOfBirth = patientStudyEnrichmentRequestedResponse.dateOfBirth
            externalPatientId = patientStudyEnrichmentRequestedResponse.externalPatientId
            facilityName = patientStudyEnrichmentRequestedResponse.facilityName
            height = patientStudyEnrichmentRequestedResponse.height
            mrn = patientStudyEnrichmentRequestedResponse.mrn
            patientName = patientStudyEnrichmentRequestedResponse.patientName
            procedure = patientStudyEnrichmentRequestedResponse.procedure
            referringPhysicianName = patientStudyEnrichmentRequestedResponse.referringPhysicianName
            severity = patientStudyEnrichmentRequestedResponse.severity
            sex = patientStudyEnrichmentRequestedResponse.sex
            studyDate = patientStudyEnrichmentRequestedResponse.studyDate
            studyDescription = patientStudyEnrichmentRequestedResponse.studyDescription
            studyTime = patientStudyEnrichmentRequestedResponse.studyTime
            weight = patientStudyEnrichmentRequestedResponse.weight
            additionalProperties =
                patientStudyEnrichmentRequestedResponse.additionalProperties.toMutableMap()
        }

        /** YYYY-MM-DD */
        fun dateOfBirth(dateOfBirth: String) = dateOfBirth(JsonField.of(dateOfBirth))

        /**
         * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfBirth] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateOfBirth(dateOfBirth: JsonField<String>) = apply { this.dateOfBirth = dateOfBirth }

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

        fun facilityName(facilityName: String) = facilityName(JsonField.of(facilityName))

        /**
         * Sets [Builder.facilityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.facilityName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun facilityName(facilityName: JsonField<String>) = apply {
            this.facilityName = facilityName
        }

        fun height(height: Height) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Height] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Height>) = apply { this.height = height }

        fun mrn(mrn: String) = mrn(JsonField.of(mrn))

        /**
         * Sets [Builder.mrn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mrn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mrn(mrn: JsonField<String>) = apply { this.mrn = mrn }

        fun patientName(patientName: String) = patientName(JsonField.of(patientName))

        /**
         * Sets [Builder.patientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientName(patientName: JsonField<String>) = apply { this.patientName = patientName }

        fun procedure(procedure: String) = procedure(JsonField.of(procedure))

        /**
         * Sets [Builder.procedure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.procedure] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun procedure(procedure: JsonField<String>) = apply { this.procedure = procedure }

        fun referringPhysicianName(referringPhysicianName: String) =
            referringPhysicianName(JsonField.of(referringPhysicianName))

        /**
         * Sets [Builder.referringPhysicianName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referringPhysicianName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referringPhysicianName(referringPhysicianName: JsonField<String>) = apply {
            this.referringPhysicianName = referringPhysicianName
        }

        fun severity(severity: Severity) = severity(JsonField.of(severity))

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

        fun sex(sex: Sex) = sex(JsonField.of(sex))

        /**
         * Sets [Builder.sex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sex] with a well-typed [Sex] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sex(sex: JsonField<Sex>) = apply { this.sex = sex }

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

        /** HH:MM or HH:MM:SS[.fff]; Avara may truncate to HH:MM */
        fun studyTime(studyTime: String) = studyTime(JsonField.of(studyTime))

        /**
         * Sets [Builder.studyTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun studyTime(studyTime: JsonField<String>) = apply { this.studyTime = studyTime }

        fun weight(weight: Weight) = weight(JsonField.of(weight))

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Weight] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Weight>) = apply { this.weight = weight }

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
         * Returns an immutable instance of [PatientStudyEnrichmentRequestedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PatientStudyEnrichmentRequestedResponse =
            PatientStudyEnrichmentRequestedResponse(
                dateOfBirth,
                externalPatientId,
                facilityName,
                height,
                mrn,
                patientName,
                procedure,
                referringPhysicianName,
                severity,
                sex,
                studyDate,
                studyDescription,
                studyTime,
                weight,
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
    fun validate(): PatientStudyEnrichmentRequestedResponse = apply {
        if (validated) {
            return@apply
        }

        dateOfBirth()
        externalPatientId()
        facilityName()
        height().ifPresent { it.validate() }
        mrn()
        patientName()
        procedure()
        referringPhysicianName()
        severity().ifPresent { it.validate() }
        sex().ifPresent { it.validate() }
        studyDate()
        studyDescription()
        studyTime()
        weight().ifPresent { it.validate() }
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
        (if (dateOfBirth.asKnown().isPresent) 1 else 0) +
            (if (externalPatientId.asKnown().isPresent) 1 else 0) +
            (if (facilityName.asKnown().isPresent) 1 else 0) +
            (height.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mrn.asKnown().isPresent) 1 else 0) +
            (if (patientName.asKnown().isPresent) 1 else 0) +
            (if (procedure.asKnown().isPresent) 1 else 0) +
            (if (referringPhysicianName.asKnown().isPresent) 1 else 0) +
            (severity.asKnown().getOrNull()?.validity() ?: 0) +
            (sex.asKnown().getOrNull()?.validity() ?: 0) +
            (if (studyDate.asKnown().isPresent) 1 else 0) +
            (if (studyDescription.asKnown().isPresent) 1 else 0) +
            (if (studyTime.asKnown().isPresent) 1 else 0) +
            (weight.asKnown().getOrNull()?.validity() ?: 0)

    class Height
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val unit: JsonField<Unit>,
        private val value: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        ) : this(unit, value, mutableMapOf())

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unit(): Unit = unit.getRequired("unit")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
             * Returns a mutable builder for constructing an instance of [Height].
             *
             * The following fields are required:
             * ```java
             * .unit()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Height]. */
        class Builder internal constructor() {

            private var unit: JsonField<Unit>? = null
            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(height: Height) = apply {
                unit = height.unit
                value = height.value
                additionalProperties = height.additionalProperties.toMutableMap()
            }

            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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
             * Returns an immutable instance of [Height].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .unit()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Height =
                Height(
                    checkRequired("unit", unit),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Height = apply {
            if (validated) {
                return@apply
            }

            unit().validate()
            value()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (unit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IN = of("in")

                @JvmField val CM = of("cm")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                IN,
                CM,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN,
                CM,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IN -> Value.IN
                    CM -> Value.CM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws AvaraInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IN -> Known.IN
                    CM -> Known.CM
                    else -> throw AvaraInvalidDataException("Unknown Unit: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws AvaraInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    AvaraInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws AvaraInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Unit = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Height &&
                unit == other.unit &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Height{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
    }

    class Severity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NORMAL = of("normal")

            @JvmField val HIGH = of("high")

            @JvmField val STAT = of("stat")

            @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
        }

        /** An enum containing [Severity]'s known values. */
        enum class Known {
            NORMAL,
            HIGH,
            STAT,
        }

        /**
         * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Severity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            HIGH,
            STAT,
            /** An enum member indicating that [Severity] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NORMAL -> Value.NORMAL
                HIGH -> Value.HIGH
                STAT -> Value.STAT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AvaraInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                NORMAL -> Known.NORMAL
                HIGH -> Known.HIGH
                STAT -> Known.STAT
                else -> throw AvaraInvalidDataException("Unknown Severity: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AvaraInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { AvaraInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Severity = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Severity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Sex @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MALE = of("male")

            @JvmField val FEMALE = of("female")

            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = Sex(JsonField.of(value))
        }

        /** An enum containing [Sex]'s known values. */
        enum class Known {
            MALE,
            FEMALE,
            OTHER,
        }

        /**
         * An enum containing [Sex]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sex] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MALE,
            FEMALE,
            OTHER,
            /** An enum member indicating that [Sex] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MALE -> Value.MALE
                FEMALE -> Value.FEMALE
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AvaraInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                MALE -> Known.MALE
                FEMALE -> Known.FEMALE
                OTHER -> Known.OTHER
                else -> throw AvaraInvalidDataException("Unknown Sex: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AvaraInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { AvaraInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Sex = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sex && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Weight
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val unit: JsonField<Unit>,
        private val value: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
        ) : this(unit, value, mutableMapOf())

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unit(): Unit = unit.getRequired("unit")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
             * Returns a mutable builder for constructing an instance of [Weight].
             *
             * The following fields are required:
             * ```java
             * .unit()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Weight]. */
        class Builder internal constructor() {

            private var unit: JsonField<Unit>? = null
            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(weight: Weight) = apply {
                unit = weight.unit
                value = weight.value
                additionalProperties = weight.additionalProperties.toMutableMap()
            }

            fun unit(unit: Unit) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [Unit] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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
             * Returns an immutable instance of [Weight].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .unit()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Weight =
                Weight(
                    checkRequired("unit", unit),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Weight = apply {
            if (validated) {
                return@apply
            }

            unit().validate()
            value()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (unit.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class Unit @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LBS = of("lbs")

                @JvmField val KG = of("kg")

                @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
            }

            /** An enum containing [Unit]'s known values. */
            enum class Known {
                LBS,
                KG,
            }

            /**
             * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Unit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LBS,
                KG,
                /** An enum member indicating that [Unit] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LBS -> Value.LBS
                    KG -> Value.KG
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws AvaraInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LBS -> Known.LBS
                    KG -> Known.KG
                    else -> throw AvaraInvalidDataException("Unknown Unit: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws AvaraInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    AvaraInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws AvaraInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Unit = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Unit && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Weight &&
                unit == other.unit &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Weight{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatientStudyEnrichmentRequestedResponse &&
            dateOfBirth == other.dateOfBirth &&
            externalPatientId == other.externalPatientId &&
            facilityName == other.facilityName &&
            height == other.height &&
            mrn == other.mrn &&
            patientName == other.patientName &&
            procedure == other.procedure &&
            referringPhysicianName == other.referringPhysicianName &&
            severity == other.severity &&
            sex == other.sex &&
            studyDate == other.studyDate &&
            studyDescription == other.studyDescription &&
            studyTime == other.studyTime &&
            weight == other.weight &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dateOfBirth,
            externalPatientId,
            facilityName,
            height,
            mrn,
            patientName,
            procedure,
            referringPhysicianName,
            severity,
            sex,
            studyDate,
            studyDescription,
            studyTime,
            weight,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PatientStudyEnrichmentRequestedResponse{dateOfBirth=$dateOfBirth, externalPatientId=$externalPatientId, facilityName=$facilityName, height=$height, mrn=$mrn, patientName=$patientName, procedure=$procedure, referringPhysicianName=$referringPhysicianName, severity=$severity, sex=$sex, studyDate=$studyDate, studyDescription=$studyDescription, studyTime=$studyTime, weight=$weight, additionalProperties=$additionalProperties}"
}
