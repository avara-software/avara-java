// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.BaseDeserializer
import com.avara.core.BaseSerializer
import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.allMaxBy
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.getOrThrow
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One series in the optional study manifest. Secondary capture should be omitted. */
class StudyAccessRequestedManifestSeries
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val modality: JsonField<String>,
    private val seriesDescription: JsonField<String>,
    private val seriesInstanceUid: JsonField<String>,
    private val seriesNumber: JsonField<SeriesNumber>,
    private val sops: JsonField<List<StudyAccessRequestedManifestSop>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seriesDescription")
        @ExcludeMissing
        seriesDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seriesInstanceUID")
        @ExcludeMissing
        seriesInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seriesNumber")
        @ExcludeMissing
        seriesNumber: JsonField<SeriesNumber> = JsonMissing.of(),
        @JsonProperty("sops")
        @ExcludeMissing
        sops: JsonField<List<StudyAccessRequestedManifestSop>> = JsonMissing.of(),
    ) : this(modality, seriesDescription, seriesInstanceUid, seriesNumber, sops, mutableMapOf())

    /**
     * DICOM modality (e.g. CT, MR)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modality(): String = modality.getRequired("modality")

    /**
     * Series description shown in the viewer sidebar
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seriesDescription(): String = seriesDescription.getRequired("seriesDescription")

    /**
     * DICOM Series Instance UID
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seriesInstanceUid(): String = seriesInstanceUid.getRequired("seriesInstanceUID")

    /**
     * Series number (string or number)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seriesNumber(): SeriesNumber = seriesNumber.getRequired("seriesNumber")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sops(): List<StudyAccessRequestedManifestSop> = sops.getRequired("sops")

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

    /**
     * Returns the raw JSON value of [seriesDescription].
     *
     * Unlike [seriesDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seriesDescription")
    @ExcludeMissing
    fun _seriesDescription(): JsonField<String> = seriesDescription

    /**
     * Returns the raw JSON value of [seriesInstanceUid].
     *
     * Unlike [seriesInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("seriesInstanceUID")
    @ExcludeMissing
    fun _seriesInstanceUid(): JsonField<String> = seriesInstanceUid

    /**
     * Returns the raw JSON value of [seriesNumber].
     *
     * Unlike [seriesNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seriesNumber")
    @ExcludeMissing
    fun _seriesNumber(): JsonField<SeriesNumber> = seriesNumber

    /**
     * Returns the raw JSON value of [sops].
     *
     * Unlike [sops], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sops")
    @ExcludeMissing
    fun _sops(): JsonField<List<StudyAccessRequestedManifestSop>> = sops

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
         * [StudyAccessRequestedManifestSeries].
         *
         * The following fields are required:
         * ```java
         * .modality()
         * .seriesDescription()
         * .seriesInstanceUid()
         * .seriesNumber()
         * .sops()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyAccessRequestedManifestSeries]. */
    class Builder internal constructor() {

        private var modality: JsonField<String>? = null
        private var seriesDescription: JsonField<String>? = null
        private var seriesInstanceUid: JsonField<String>? = null
        private var seriesNumber: JsonField<SeriesNumber>? = null
        private var sops: JsonField<MutableList<StudyAccessRequestedManifestSop>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyAccessRequestedManifestSeries: StudyAccessRequestedManifestSeries) =
            apply {
                modality = studyAccessRequestedManifestSeries.modality
                seriesDescription = studyAccessRequestedManifestSeries.seriesDescription
                seriesInstanceUid = studyAccessRequestedManifestSeries.seriesInstanceUid
                seriesNumber = studyAccessRequestedManifestSeries.seriesNumber
                sops = studyAccessRequestedManifestSeries.sops.map { it.toMutableList() }
                additionalProperties =
                    studyAccessRequestedManifestSeries.additionalProperties.toMutableMap()
            }

        /** DICOM modality (e.g. CT, MR) */
        fun modality(modality: String) = modality(JsonField.of(modality))

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { this.modality = modality }

        /** Series description shown in the viewer sidebar */
        fun seriesDescription(seriesDescription: String) =
            seriesDescription(JsonField.of(seriesDescription))

        /**
         * Sets [Builder.seriesDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seriesDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seriesDescription(seriesDescription: JsonField<String>) = apply {
            this.seriesDescription = seriesDescription
        }

        /** DICOM Series Instance UID */
        fun seriesInstanceUid(seriesInstanceUid: String) =
            seriesInstanceUid(JsonField.of(seriesInstanceUid))

        /**
         * Sets [Builder.seriesInstanceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seriesInstanceUid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seriesInstanceUid(seriesInstanceUid: JsonField<String>) = apply {
            this.seriesInstanceUid = seriesInstanceUid
        }

        /** Series number (string or number) */
        fun seriesNumber(seriesNumber: SeriesNumber) = seriesNumber(JsonField.of(seriesNumber))

        /**
         * Sets [Builder.seriesNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seriesNumber] with a well-typed [SeriesNumber] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun seriesNumber(seriesNumber: JsonField<SeriesNumber>) = apply {
            this.seriesNumber = seriesNumber
        }

        /** Alias for calling [seriesNumber] with `SeriesNumber.ofString(string)`. */
        fun seriesNumber(string: String) = seriesNumber(SeriesNumber.ofString(string))

        /** Alias for calling [seriesNumber] with `SeriesNumber.ofNumber(number)`. */
        fun seriesNumber(number: Double) = seriesNumber(SeriesNumber.ofNumber(number))

        fun sops(sops: List<StudyAccessRequestedManifestSop>) = sops(JsonField.of(sops))

        /**
         * Sets [Builder.sops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sops] with a well-typed
         * `List<StudyAccessRequestedManifestSop>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun sops(sops: JsonField<List<StudyAccessRequestedManifestSop>>) = apply {
            this.sops = sops.map { it.toMutableList() }
        }

        /**
         * Adds a single [StudyAccessRequestedManifestSop] to [sops].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSop(sop: StudyAccessRequestedManifestSop) = apply {
            sops = (sops ?: JsonField.of(mutableListOf())).also { checkKnown("sops", it).add(sop) }
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
         * Returns an immutable instance of [StudyAccessRequestedManifestSeries].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .modality()
         * .seriesDescription()
         * .seriesInstanceUid()
         * .seriesNumber()
         * .sops()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyAccessRequestedManifestSeries =
            StudyAccessRequestedManifestSeries(
                checkRequired("modality", modality),
                checkRequired("seriesDescription", seriesDescription),
                checkRequired("seriesInstanceUid", seriesInstanceUid),
                checkRequired("seriesNumber", seriesNumber),
                checkRequired("sops", sops).map { it.toImmutable() },
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
    fun validate(): StudyAccessRequestedManifestSeries = apply {
        if (validated) {
            return@apply
        }

        modality()
        seriesDescription()
        seriesInstanceUid()
        seriesNumber().validate()
        sops().forEach { it.validate() }
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
            (if (seriesDescription.asKnown().isPresent) 1 else 0) +
            (if (seriesInstanceUid.asKnown().isPresent) 1 else 0) +
            (seriesNumber.asKnown().getOrNull()?.validity() ?: 0) +
            (sops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Series number (string or number) */
    @JsonDeserialize(using = SeriesNumber.Deserializer::class)
    @JsonSerialize(using = SeriesNumber.Serializer::class)
    class SeriesNumber
    private constructor(
        private val string: String? = null,
        private val number: Double? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun isString(): Boolean = string != null

        fun isNumber(): Boolean = number != null

        fun asString(): String = string.getOrThrow("string")

        fun asNumber(): Double = number.getOrThrow("number")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.avara.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = seriesNumber.accept(new SeriesNumber.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws AvaraInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
         *   the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                number != null -> visitor.visitNumber(number)
                else -> visitor.unknown(_json)
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
        fun validate(): SeriesNumber = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitNumber(number: Double) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitNumber(number: Double) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SeriesNumber && string == other.string && number == other.number
        }

        override fun hashCode(): Int = Objects.hash(string, number)

        override fun toString(): String =
            when {
                string != null -> "SeriesNumber{string=$string}"
                number != null -> "SeriesNumber{number=$number}"
                _json != null -> "SeriesNumber{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SeriesNumber")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = SeriesNumber(string = string)

            @JvmStatic fun ofNumber(number: Double) = SeriesNumber(number = number)
        }

        /**
         * An interface that defines how to map each variant of [SeriesNumber] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitNumber(number: Double): T

            /**
             * Maps an unknown variant of [SeriesNumber] to a value of type [T].
             *
             * An instance of [SeriesNumber] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws AvaraInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw AvaraInvalidDataException("Unknown SeriesNumber: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<SeriesNumber>(SeriesNumber::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SeriesNumber {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                SeriesNumber(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                SeriesNumber(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> SeriesNumber(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<SeriesNumber>(SeriesNumber::class) {

            override fun serialize(
                value: SeriesNumber,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.number != null -> generator.writeObject(value.number)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SeriesNumber")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyAccessRequestedManifestSeries &&
            modality == other.modality &&
            seriesDescription == other.seriesDescription &&
            seriesInstanceUid == other.seriesInstanceUid &&
            seriesNumber == other.seriesNumber &&
            sops == other.sops &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            modality,
            seriesDescription,
            seriesInstanceUid,
            seriesNumber,
            sops,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyAccessRequestedManifestSeries{modality=$modality, seriesDescription=$seriesDescription, seriesInstanceUid=$seriesInstanceUid, seriesNumber=$seriesNumber, sops=$sops, additionalProperties=$additionalProperties}"
}
