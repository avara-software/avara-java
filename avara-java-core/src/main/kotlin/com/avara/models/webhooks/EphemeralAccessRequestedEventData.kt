// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.core.toImmutable
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
 * Event payload for an ephemeral viewer session. retrievalId is the customer handle from mint.
 * options is echoed verbatim when present; Avara does not read or edit it.
 */
class EphemeralAccessRequestedEventData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val retrievalId: JsonField<String>,
    private val options: JsonField<Options>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("retrievalId")
        @ExcludeMissing
        retrievalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
    ) : this(retrievalId, options, mutableMapOf())

    /**
     * Opaque customer handle for this view session. Not an Avara study ID.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retrievalId(): String = retrievalId.getRequired("retrievalId")

    /**
     * Optional JSON object echoed verbatim from mint. Avara does not read or edit it. Examples:
     * studyInstanceUids or internal ids for multi-study reads. Not for URLs or manifests.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<Options> = options.getOptional("options")

    /**
     * Returns the raw JSON value of [retrievalId].
     *
     * Unlike [retrievalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retrievalId") @ExcludeMissing fun _retrievalId(): JsonField<String> = retrievalId

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

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
         * [EphemeralAccessRequestedEventData].
         *
         * The following fields are required:
         * ```java
         * .retrievalId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemeralAccessRequestedEventData]. */
    class Builder internal constructor() {

        private var retrievalId: JsonField<String>? = null
        private var options: JsonField<Options> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ephemeralAccessRequestedEventData: EphemeralAccessRequestedEventData) =
            apply {
                retrievalId = ephemeralAccessRequestedEventData.retrievalId
                options = ephemeralAccessRequestedEventData.options
                additionalProperties =
                    ephemeralAccessRequestedEventData.additionalProperties.toMutableMap()
            }

        /** Opaque customer handle for this view session. Not an Avara study ID. */
        fun retrievalId(retrievalId: String) = retrievalId(JsonField.of(retrievalId))

        /**
         * Sets [Builder.retrievalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retrievalId(retrievalId: JsonField<String>) = apply { this.retrievalId = retrievalId }

        /**
         * Optional JSON object echoed verbatim from mint. Avara does not read or edit it. Examples:
         * studyInstanceUids or internal ids for multi-study reads. Not for URLs or manifests.
         */
        fun options(options: Options) = options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { this.options = options }

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
         * Returns an immutable instance of [EphemeralAccessRequestedEventData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .retrievalId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemeralAccessRequestedEventData =
            EphemeralAccessRequestedEventData(
                checkRequired("retrievalId", retrievalId),
                options,
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
    fun validate(): EphemeralAccessRequestedEventData = apply {
        if (validated) {
            return@apply
        }

        retrievalId()
        options().ifPresent { it.validate() }
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
        (if (retrievalId.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Optional JSON object echoed verbatim from mint. Avara does not read or edit it. Examples:
     * studyInstanceUids or internal ids for multi-study reads. Not for URLs or manifests.
     */
    class Options
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                additionalProperties = options.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options = Options(additionalProperties.toImmutable())
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
        fun validate(): Options = apply {
            if (validated) {
                return@apply
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Options{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemeralAccessRequestedEventData &&
            retrievalId == other.retrievalId &&
            options == other.options &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(retrievalId, options, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EphemeralAccessRequestedEventData{retrievalId=$retrievalId, options=$options, additionalProperties=$additionalProperties}"
}
