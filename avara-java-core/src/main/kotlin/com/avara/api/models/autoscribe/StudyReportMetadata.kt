// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe

import com.avara.api.core.Enum
import com.avara.api.core.ExcludeMissing
import com.avara.api.core.JsonField
import com.avara.api.core.JsonMissing
import com.avara.api.core.JsonValue
import com.avara.api.core.checkRequired
import com.avara.api.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Patient demographics and scan information for report generation */
class StudyReportMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val age: JsonField<String>,
    private val dateOfBirth: JsonField<String>,
    private val facilityName: JsonField<String>,
    private val height: JsonField<Height>,
    private val mrn: JsonField<String>,
    private val patientName: JsonField<String>,
    private val referringPhysicianName: JsonField<String>,
    private val scanDate: JsonField<String>,
    private val scanTime: JsonField<String>,
    private val scanType: JsonField<String>,
    private val sex: JsonField<Sex>,
    private val weight: JsonField<Weight>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("age") @ExcludeMissing age: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateOfBirth")
        @ExcludeMissing
        dateOfBirth: JsonField<String> = JsonMissing.of(),
        @JsonProperty("facilityName")
        @ExcludeMissing
        facilityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Height> = JsonMissing.of(),
        @JsonProperty("mrn") @ExcludeMissing mrn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("patientName")
        @ExcludeMissing
        patientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referringPhysicianName")
        @ExcludeMissing
        referringPhysicianName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scanDate") @ExcludeMissing scanDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scanTime") @ExcludeMissing scanTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scanType") @ExcludeMissing scanType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sex") @ExcludeMissing sex: JsonField<Sex> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Weight> = JsonMissing.of(),
    ) : this(
        age,
        dateOfBirth,
        facilityName,
        height,
        mrn,
        patientName,
        referringPhysicianName,
        scanDate,
        scanTime,
        scanType,
        sex,
        weight,
        mutableMapOf(),
    )

    /**
     * Patient's age at time of scan (e.g., '34.5 years', '2 months')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun age(): Optional<String> = age.getOptional("age")

    /**
     * Patient's date of birth. Format: YYYY-MM-DD (e.g., '1990-05-20')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfBirth(): Optional<String> = dateOfBirth.getOptional("dateOfBirth")

    /**
     * Name of the medical facility where the scan was performed
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun facilityName(): Optional<String> = facilityName.getOptional("facilityName")

    /**
     * Patient's height with unit (e.g., {value: 70, unit: 'inches'} or {value: 178, unit: 'cm'})
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Height> = height.getOptional("height")

    /**
     * Medical Record Number - unique patient identifier
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mrn(): Optional<String> = mrn.getOptional("mrn")

    /**
     * Full name of the patient
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patientName(): Optional<String> = patientName.getOptional("patientName")

    /**
     * Name of the physician who referred the patient for this scan
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referringPhysicianName(): Optional<String> =
        referringPhysicianName.getOptional("referringPhysicianName")

    /**
     * Date the scan was performed. Format: YYYY-MM-DD (e.g., '2024-01-15')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scanDate(): Optional<String> = scanDate.getOptional("scanDate")

    /**
     * Time the scan was performed. Format: HH:MM (e.g., '14:30')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scanTime(): Optional<String> = scanTime.getOptional("scanTime")

    /**
     * Type of scan or imaging modality (e.g., 'MRI', 'CT', 'X-Ray', 'Ultrasound')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scanType(): Optional<String> = scanType.getOptional("scanType")

    /**
     * Patient's biological sex. Options: 'male', 'female', 'other'
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sex(): Optional<Sex> = sex.getOptional("sex")

    /**
     * Patient's weight with unit (e.g., {value: 150, unit: 'lbs'} or {value: 68, unit: 'kg'})
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weight(): Optional<Weight> = weight.getOptional("weight")

    /**
     * Returns the raw JSON value of [age].
     *
     * Unlike [age], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("age") @ExcludeMissing fun _age(): JsonField<String> = age

    /**
     * Returns the raw JSON value of [dateOfBirth].
     *
     * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateOfBirth") @ExcludeMissing fun _dateOfBirth(): JsonField<String> = dateOfBirth

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
     * Returns the raw JSON value of [referringPhysicianName].
     *
     * Unlike [referringPhysicianName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("referringPhysicianName")
    @ExcludeMissing
    fun _referringPhysicianName(): JsonField<String> = referringPhysicianName

    /**
     * Returns the raw JSON value of [scanDate].
     *
     * Unlike [scanDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanDate") @ExcludeMissing fun _scanDate(): JsonField<String> = scanDate

    /**
     * Returns the raw JSON value of [scanTime].
     *
     * Unlike [scanTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanTime") @ExcludeMissing fun _scanTime(): JsonField<String> = scanTime

    /**
     * Returns the raw JSON value of [scanType].
     *
     * Unlike [scanType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanType") @ExcludeMissing fun _scanType(): JsonField<String> = scanType

    /**
     * Returns the raw JSON value of [sex].
     *
     * Unlike [sex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sex") @ExcludeMissing fun _sex(): JsonField<Sex> = sex

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

        /** Returns a mutable builder for constructing an instance of [StudyReportMetadata]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyReportMetadata]. */
    class Builder internal constructor() {

        private var age: JsonField<String> = JsonMissing.of()
        private var dateOfBirth: JsonField<String> = JsonMissing.of()
        private var facilityName: JsonField<String> = JsonMissing.of()
        private var height: JsonField<Height> = JsonMissing.of()
        private var mrn: JsonField<String> = JsonMissing.of()
        private var patientName: JsonField<String> = JsonMissing.of()
        private var referringPhysicianName: JsonField<String> = JsonMissing.of()
        private var scanDate: JsonField<String> = JsonMissing.of()
        private var scanTime: JsonField<String> = JsonMissing.of()
        private var scanType: JsonField<String> = JsonMissing.of()
        private var sex: JsonField<Sex> = JsonMissing.of()
        private var weight: JsonField<Weight> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyReportMetadata: StudyReportMetadata) = apply {
            age = studyReportMetadata.age
            dateOfBirth = studyReportMetadata.dateOfBirth
            facilityName = studyReportMetadata.facilityName
            height = studyReportMetadata.height
            mrn = studyReportMetadata.mrn
            patientName = studyReportMetadata.patientName
            referringPhysicianName = studyReportMetadata.referringPhysicianName
            scanDate = studyReportMetadata.scanDate
            scanTime = studyReportMetadata.scanTime
            scanType = studyReportMetadata.scanType
            sex = studyReportMetadata.sex
            weight = studyReportMetadata.weight
            additionalProperties = studyReportMetadata.additionalProperties.toMutableMap()
        }

        /** Patient's age at time of scan (e.g., '34.5 years', '2 months') */
        fun age(age: String) = age(JsonField.of(age))

        /**
         * Sets [Builder.age] to an arbitrary JSON value.
         *
         * You should usually call [Builder.age] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun age(age: JsonField<String>) = apply { this.age = age }

        /** Patient's date of birth. Format: YYYY-MM-DD (e.g., '1990-05-20') */
        fun dateOfBirth(dateOfBirth: String) = dateOfBirth(JsonField.of(dateOfBirth))

        /**
         * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfBirth] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateOfBirth(dateOfBirth: JsonField<String>) = apply { this.dateOfBirth = dateOfBirth }

        /** Name of the medical facility where the scan was performed */
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

        /**
         * Patient's height with unit (e.g., {value: 70, unit: 'inches'} or {value: 178, unit:
         * 'cm'})
         */
        fun height(height: Height) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Height] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Height>) = apply { this.height = height }

        /** Medical Record Number - unique patient identifier */
        fun mrn(mrn: String) = mrn(JsonField.of(mrn))

        /**
         * Sets [Builder.mrn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mrn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mrn(mrn: JsonField<String>) = apply { this.mrn = mrn }

        /** Full name of the patient */
        fun patientName(patientName: String) = patientName(JsonField.of(patientName))

        /**
         * Sets [Builder.patientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patientName(patientName: JsonField<String>) = apply { this.patientName = patientName }

        /** Name of the physician who referred the patient for this scan */
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

        /** Date the scan was performed. Format: YYYY-MM-DD (e.g., '2024-01-15') */
        fun scanDate(scanDate: String) = scanDate(JsonField.of(scanDate))

        /**
         * Sets [Builder.scanDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanDate(scanDate: JsonField<String>) = apply { this.scanDate = scanDate }

        /** Time the scan was performed. Format: HH:MM (e.g., '14:30') */
        fun scanTime(scanTime: String) = scanTime(JsonField.of(scanTime))

        /**
         * Sets [Builder.scanTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanTime(scanTime: JsonField<String>) = apply { this.scanTime = scanTime }

        /** Type of scan or imaging modality (e.g., 'MRI', 'CT', 'X-Ray', 'Ultrasound') */
        fun scanType(scanType: String) = scanType(JsonField.of(scanType))

        /**
         * Sets [Builder.scanType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanType(scanType: JsonField<String>) = apply { this.scanType = scanType }

        /** Patient's biological sex. Options: 'male', 'female', 'other' */
        fun sex(sex: Sex) = sex(JsonField.of(sex))

        /**
         * Sets [Builder.sex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sex] with a well-typed [Sex] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sex(sex: JsonField<Sex>) = apply { this.sex = sex }

        /**
         * Patient's weight with unit (e.g., {value: 150, unit: 'lbs'} or {value: 68, unit: 'kg'})
         */
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
         * Returns an immutable instance of [StudyReportMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StudyReportMetadata =
            StudyReportMetadata(
                age,
                dateOfBirth,
                facilityName,
                height,
                mrn,
                patientName,
                referringPhysicianName,
                scanDate,
                scanTime,
                scanType,
                sex,
                weight,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StudyReportMetadata = apply {
        if (validated) {
            return@apply
        }

        age()
        dateOfBirth()
        facilityName()
        height().ifPresent { it.validate() }
        mrn()
        patientName()
        referringPhysicianName()
        scanDate()
        scanTime()
        scanType()
        sex().ifPresent { it.validate() }
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
        (if (age.asKnown().isPresent) 1 else 0) +
            (if (dateOfBirth.asKnown().isPresent) 1 else 0) +
            (if (facilityName.asKnown().isPresent) 1 else 0) +
            (height.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mrn.asKnown().isPresent) 1 else 0) +
            (if (patientName.asKnown().isPresent) 1 else 0) +
            (if (referringPhysicianName.asKnown().isPresent) 1 else 0) +
            (if (scanDate.asKnown().isPresent) 1 else 0) +
            (if (scanTime.asKnown().isPresent) 1 else 0) +
            (if (scanType.asKnown().isPresent) 1 else 0) +
            (sex.asKnown().getOrNull()?.validity() ?: 0) +
            (weight.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Patient's height with unit (e.g., {value: 70, unit: 'inches'} or {value: 178, unit: 'cm'})
     */
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

    /** Patient's biological sex. Options: 'male', 'female', 'other' */
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

    /** Patient's weight with unit (e.g., {value: 150, unit: 'lbs'} or {value: 68, unit: 'kg'}) */
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

        return other is StudyReportMetadata &&
            age == other.age &&
            dateOfBirth == other.dateOfBirth &&
            facilityName == other.facilityName &&
            height == other.height &&
            mrn == other.mrn &&
            patientName == other.patientName &&
            referringPhysicianName == other.referringPhysicianName &&
            scanDate == other.scanDate &&
            scanTime == other.scanTime &&
            scanType == other.scanType &&
            sex == other.sex &&
            weight == other.weight &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            age,
            dateOfBirth,
            facilityName,
            height,
            mrn,
            patientName,
            referringPhysicianName,
            scanDate,
            scanTime,
            scanType,
            sex,
            weight,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyReportMetadata{age=$age, dateOfBirth=$dateOfBirth, facilityName=$facilityName, height=$height, mrn=$mrn, patientName=$patientName, referringPhysicianName=$referringPhysicianName, scanDate=$scanDate, scanTime=$scanTime, scanType=$scanType, sex=$sex, weight=$weight, additionalProperties=$additionalProperties}"
}
