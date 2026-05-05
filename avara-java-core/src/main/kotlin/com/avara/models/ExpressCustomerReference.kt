// File generated from our OpenAPI spec by Stainless.

package com.avara.models

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

/** A reference to an Express customer with basic identifying information */
class ExpressCustomerReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expressCustomerId: JsonField<String>,
    private val expressCustomerName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expressCustomerId")
        @ExcludeMissing
        expressCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expressCustomerName")
        @ExcludeMissing
        expressCustomerName: JsonField<String> = JsonMissing.of(),
    ) : this(expressCustomerId, expressCustomerName, mutableMapOf())

    /**
     * Unique Express customer identifier. Format: cus_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expressCustomerId(): String = expressCustomerId.getRequired("expressCustomerId")

    /**
     * Name of the Express customer
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expressCustomerName(): String = expressCustomerName.getRequired("expressCustomerName")

    /**
     * Returns the raw JSON value of [expressCustomerId].
     *
     * Unlike [expressCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expressCustomerId")
    @ExcludeMissing
    fun _expressCustomerId(): JsonField<String> = expressCustomerId

    /**
     * Returns the raw JSON value of [expressCustomerName].
     *
     * Unlike [expressCustomerName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expressCustomerName")
    @ExcludeMissing
    fun _expressCustomerName(): JsonField<String> = expressCustomerName

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
         * Returns a mutable builder for constructing an instance of [ExpressCustomerReference].
         *
         * The following fields are required:
         * ```java
         * .expressCustomerId()
         * .expressCustomerName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExpressCustomerReference]. */
    class Builder internal constructor() {

        private var expressCustomerId: JsonField<String>? = null
        private var expressCustomerName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(expressCustomerReference: ExpressCustomerReference) = apply {
            expressCustomerId = expressCustomerReference.expressCustomerId
            expressCustomerName = expressCustomerReference.expressCustomerName
            additionalProperties = expressCustomerReference.additionalProperties.toMutableMap()
        }

        /** Unique Express customer identifier. Format: cus_{32-hex-chars} */
        fun expressCustomerId(expressCustomerId: String) =
            expressCustomerId(JsonField.of(expressCustomerId))

        /**
         * Sets [Builder.expressCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expressCustomerId(expressCustomerId: JsonField<String>) = apply {
            this.expressCustomerId = expressCustomerId
        }

        /** Name of the Express customer */
        fun expressCustomerName(expressCustomerName: String) =
            expressCustomerName(JsonField.of(expressCustomerName))

        /**
         * Sets [Builder.expressCustomerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomerName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expressCustomerName(expressCustomerName: JsonField<String>) = apply {
            this.expressCustomerName = expressCustomerName
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
         * Returns an immutable instance of [ExpressCustomerReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expressCustomerId()
         * .expressCustomerName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExpressCustomerReference =
            ExpressCustomerReference(
                checkRequired("expressCustomerId", expressCustomerId),
                checkRequired("expressCustomerName", expressCustomerName),
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
    fun validate(): ExpressCustomerReference = apply {
        if (validated) {
            return@apply
        }

        expressCustomerId()
        expressCustomerName()
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
        (if (expressCustomerId.asKnown().isPresent) 1 else 0) +
            (if (expressCustomerName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpressCustomerReference &&
            expressCustomerId == other.expressCustomerId &&
            expressCustomerName == other.expressCustomerName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expressCustomerId, expressCustomerName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExpressCustomerReference{expressCustomerId=$expressCustomerId, expressCustomerName=$expressCustomerName, additionalProperties=$additionalProperties}"
}
