// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.express

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkKnown
import com.avarasoftware.core.checkRequired
import com.avarasoftware.core.toImmutable
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Paginated list of Express customers */
class ExpressListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expressCustomers: JsonField<List<ExpressListResponse>>,
    private val hasMore: JsonField<Boolean>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expressCustomers")
        @ExcludeMissing
        expressCustomers: JsonField<List<ExpressListResponse>> = JsonMissing.of(),
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(expressCustomers, hasMore, cursor, mutableMapOf())

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expressCustomers(): List<ExpressListResponse> =
        expressCustomers.getRequired("expressCustomers")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = cursor.getOptional("cursor")

    /**
     * Returns the raw JSON value of [expressCustomers].
     *
     * Unlike [expressCustomers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expressCustomers")
    @ExcludeMissing
    fun _expressCustomers(): JsonField<List<ExpressListResponse>> = expressCustomers

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMore") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

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
         * Returns a mutable builder for constructing an instance of [ExpressListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .expressCustomers()
         * .hasMore()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExpressListPageResponse]. */
    class Builder internal constructor() {

        private var expressCustomers: JsonField<MutableList<ExpressListResponse>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(expressListPageResponse: ExpressListPageResponse) = apply {
            expressCustomers = expressListPageResponse.expressCustomers.map { it.toMutableList() }
            hasMore = expressListPageResponse.hasMore
            cursor = expressListPageResponse.cursor
            additionalProperties = expressListPageResponse.additionalProperties.toMutableMap()
        }

        fun expressCustomers(expressCustomers: List<ExpressListResponse>) =
            expressCustomers(JsonField.of(expressCustomers))

        /**
         * Sets [Builder.expressCustomers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomers] with a well-typed
         * `List<ExpressListResponse>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun expressCustomers(expressCustomers: JsonField<List<ExpressListResponse>>) = apply {
            this.expressCustomers = expressCustomers.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExpressListResponse] to [expressCustomers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExpressCustomer(expressCustomer: ExpressListResponse) = apply {
            expressCustomers =
                (expressCustomers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("expressCustomers", it).add(expressCustomer)
                }
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun cursor(cursor: String) = cursor(JsonField.of(cursor))

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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
         * Returns an immutable instance of [ExpressListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expressCustomers()
         * .hasMore()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExpressListPageResponse =
            ExpressListPageResponse(
                checkRequired("expressCustomers", expressCustomers).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                cursor,
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
    fun validate(): ExpressListPageResponse = apply {
        if (validated) {
            return@apply
        }

        expressCustomers().forEach { it.validate() }
        hasMore()
        cursor()
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
        (expressCustomers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasMore.asKnown().isPresent) 1 else 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpressListPageResponse &&
            expressCustomers == other.expressCustomers &&
            hasMore == other.hasMore &&
            cursor == other.cursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expressCustomers, hasMore, cursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExpressListPageResponse{expressCustomers=$expressCustomers, hasMore=$hasMore, cursor=$cursor, additionalProperties=$additionalProperties}"
}
