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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response expected by Avara for modality worklist webhook. authorized:false surfaces as worklist
 * failure; authorized:true with empty items means no scheduled exams.
 */
class ModalityWorklistRequestedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorized: JsonField<Boolean>,
    private val items: JsonField<List<ModalityWorklistItem>>,
    private val error: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorized")
        @ExcludeMissing
        authorized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<ModalityWorklistItem>> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
    ) : this(authorized, items, error, mutableMapOf())

    /**
     * Whether the worklist query is authorized
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorized(): Boolean = authorized.getRequired("authorized")

    /**
     * Worklist items for the requested date window
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<ModalityWorklistItem> = items.getRequired("items")

    /**
     * Error message if authorization failed
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Returns the raw JSON value of [authorized].
     *
     * Unlike [authorized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items")
    @ExcludeMissing
    fun _items(): JsonField<List<ModalityWorklistItem>> = items

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
         * [ModalityWorklistRequestedResponse].
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModalityWorklistRequestedResponse]. */
    class Builder internal constructor() {

        private var authorized: JsonField<Boolean>? = null
        private var items: JsonField<MutableList<ModalityWorklistItem>>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modalityWorklistRequestedResponse: ModalityWorklistRequestedResponse) =
            apply {
                authorized = modalityWorklistRequestedResponse.authorized
                items = modalityWorklistRequestedResponse.items.map { it.toMutableList() }
                error = modalityWorklistRequestedResponse.error
                additionalProperties =
                    modalityWorklistRequestedResponse.additionalProperties.toMutableMap()
            }

        /** Whether the worklist query is authorized */
        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * Sets [Builder.authorized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        /** Worklist items for the requested date window */
        fun items(items: List<ModalityWorklistItem>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<ModalityWorklistItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun items(items: JsonField<List<ModalityWorklistItem>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [ModalityWorklistItem] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: ModalityWorklistItem) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Error message if authorization failed */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

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
         * Returns an immutable instance of [ModalityWorklistRequestedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModalityWorklistRequestedResponse =
            ModalityWorklistRequestedResponse(
                checkRequired("authorized", authorized),
                checkRequired("items", items).map { it.toImmutable() },
                error,
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
    fun validate(): ModalityWorklistRequestedResponse = apply {
        if (validated) {
            return@apply
        }

        authorized()
        items().forEach { it.validate() }
        error()
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
        (if (authorized.asKnown().isPresent) 1 else 0) +
            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (error.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModalityWorklistRequestedResponse &&
            authorized == other.authorized &&
            items == other.items &&
            error == other.error &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authorized, items, error, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModalityWorklistRequestedResponse{authorized=$authorized, items=$items, error=$error, additionalProperties=$additionalProperties}"
}
