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
import kotlin.jvm.optionals.getOrNull

/**
 * Soft synchronous webhook sent after Avara PACS seeds a study so the partner can enrich
 * demographics and report headers. Failures / timeouts / invalid bodies are treated as empty
 * enrichment.
 */
class PatientStudyEnrichmentRequestedEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val data: JsonField<PatientStudyEnrichmentRequestedEventData>,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<PatientStudyEnrichmentRequestedEventData> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(id, data, type, mutableMapOf())

    /**
     * Unique webhook event ID. Format: whe_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Event payload for soft patient/study enrichment after Avara PACS seeds a study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): PatientStudyEnrichmentRequestedEventData = data.getRequired("data")

    /**
     * Event type identifier
     *
     * Expected to always return the following:
     * ```java
     * JsonValue.from("patient_study.enrichment_requested")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<PatientStudyEnrichmentRequestedEventData> = data

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
         * [PatientStudyEnrichmentRequestedEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PatientStudyEnrichmentRequestedEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<PatientStudyEnrichmentRequestedEventData>? = null
        private var type: JsonValue = JsonValue.from("patient_study.enrichment_requested")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            patientStudyEnrichmentRequestedEvent: PatientStudyEnrichmentRequestedEvent
        ) = apply {
            id = patientStudyEnrichmentRequestedEvent.id
            data = patientStudyEnrichmentRequestedEvent.data
            type = patientStudyEnrichmentRequestedEvent.type
            additionalProperties =
                patientStudyEnrichmentRequestedEvent.additionalProperties.toMutableMap()
        }

        /** Unique webhook event ID. Format: whe_{32-hex-chars} */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Event payload for soft patient/study enrichment after Avara PACS seeds a study */
        fun data(data: PatientStudyEnrichmentRequestedEventData) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed
         * [PatientStudyEnrichmentRequestedEventData] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<PatientStudyEnrichmentRequestedEventData>) = apply {
            this.data = data
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("patient_study.enrichment_requested")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [PatientStudyEnrichmentRequestedEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PatientStudyEnrichmentRequestedEvent =
            PatientStudyEnrichmentRequestedEvent(
                checkRequired("id", id),
                checkRequired("data", data),
                type,
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
    fun validate(): PatientStudyEnrichmentRequestedEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        data().validate()
        _type().let {
            if (it != JsonValue.from("patient_study.enrichment_requested")) {
                throw AvaraInvalidDataException("'type' is invalid, received $it")
            }
        }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            type.let { if (it == JsonValue.from("patient_study.enrichment_requested")) 1 else 0 }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PatientStudyEnrichmentRequestedEvent &&
            id == other.id &&
            data == other.data &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, data, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PatientStudyEnrichmentRequestedEvent{id=$id, data=$data, type=$type, additionalProperties=$additionalProperties}"
}
