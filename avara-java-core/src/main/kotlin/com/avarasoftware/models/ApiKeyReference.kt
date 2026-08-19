// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models

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
import java.util.Optional

/** A reference to an API key with basic identifying information */
class ApiKeyReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKeyId: JsonField<String>,
    private val description: JsonField<String>,
    private val isClinicalContextEnrichmentEnabled: JsonField<Boolean>,
    private val isViewerEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("apiKeyId") @ExcludeMissing apiKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isClinicalContextEnrichmentEnabled")
        @ExcludeMissing
        isClinicalContextEnrichmentEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isViewerEnabled")
        @ExcludeMissing
        isViewerEnabled: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        apiKeyId,
        description,
        isClinicalContextEnrichmentEnabled,
        isViewerEnabled,
        mutableMapOf(),
    )

    /**
     * Unique API key identifier (UUIDv4 format)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiKeyId(): String = apiKeyId.getRequired("apiKeyId")

    /**
     * Human-readable description of the API key
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Whether this API key has a clinical-context enrichment webhook configured
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isClinicalContextEnrichmentEnabled(): Optional<Boolean> =
        isClinicalContextEnrichmentEnabled.getOptional("isClinicalContextEnrichmentEnabled")

    /**
     * Whether this API key has access to the Viewer product
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isViewerEnabled(): Optional<Boolean> = isViewerEnabled.getOptional("isViewerEnabled")

    /**
     * Returns the raw JSON value of [apiKeyId].
     *
     * Unlike [apiKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apiKeyId") @ExcludeMissing fun _apiKeyId(): JsonField<String> = apiKeyId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [isClinicalContextEnrichmentEnabled].
     *
     * Unlike [isClinicalContextEnrichmentEnabled], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("isClinicalContextEnrichmentEnabled")
    @ExcludeMissing
    fun _isClinicalContextEnrichmentEnabled(): JsonField<Boolean> =
        isClinicalContextEnrichmentEnabled

    /**
     * Returns the raw JSON value of [isViewerEnabled].
     *
     * Unlike [isViewerEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isViewerEnabled")
    @ExcludeMissing
    fun _isViewerEnabled(): JsonField<Boolean> = isViewerEnabled

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
         * Returns a mutable builder for constructing an instance of [ApiKeyReference].
         *
         * The following fields are required:
         * ```java
         * .apiKeyId()
         * .description()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyReference]. */
    class Builder internal constructor() {

        private var apiKeyId: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var isClinicalContextEnrichmentEnabled: JsonField<Boolean> = JsonMissing.of()
        private var isViewerEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyReference: ApiKeyReference) = apply {
            apiKeyId = apiKeyReference.apiKeyId
            description = apiKeyReference.description
            isClinicalContextEnrichmentEnabled = apiKeyReference.isClinicalContextEnrichmentEnabled
            isViewerEnabled = apiKeyReference.isViewerEnabled
            additionalProperties = apiKeyReference.additionalProperties.toMutableMap()
        }

        /** Unique API key identifier (UUIDv4 format) */
        fun apiKeyId(apiKeyId: String) = apiKeyId(JsonField.of(apiKeyId))

        /**
         * Sets [Builder.apiKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKeyId(apiKeyId: JsonField<String>) = apply { this.apiKeyId = apiKeyId }

        /** Human-readable description of the API key */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Whether this API key has a clinical-context enrichment webhook configured */
        fun isClinicalContextEnrichmentEnabled(isClinicalContextEnrichmentEnabled: Boolean) =
            isClinicalContextEnrichmentEnabled(JsonField.of(isClinicalContextEnrichmentEnabled))

        /**
         * Sets [Builder.isClinicalContextEnrichmentEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isClinicalContextEnrichmentEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun isClinicalContextEnrichmentEnabled(
            isClinicalContextEnrichmentEnabled: JsonField<Boolean>
        ) = apply { this.isClinicalContextEnrichmentEnabled = isClinicalContextEnrichmentEnabled }

        /** Whether this API key has access to the Viewer product */
        fun isViewerEnabled(isViewerEnabled: Boolean) =
            isViewerEnabled(JsonField.of(isViewerEnabled))

        /**
         * Sets [Builder.isViewerEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isViewerEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isViewerEnabled(isViewerEnabled: JsonField<Boolean>) = apply {
            this.isViewerEnabled = isViewerEnabled
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
         * Returns an immutable instance of [ApiKeyReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiKeyId()
         * .description()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKeyReference =
            ApiKeyReference(
                checkRequired("apiKeyId", apiKeyId),
                checkRequired("description", description),
                isClinicalContextEnrichmentEnabled,
                isViewerEnabled,
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
    fun validate(): ApiKeyReference = apply {
        if (validated) {
            return@apply
        }

        apiKeyId()
        description()
        isClinicalContextEnrichmentEnabled()
        isViewerEnabled()
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
        (if (apiKeyId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (isClinicalContextEnrichmentEnabled.asKnown().isPresent) 1 else 0) +
            (if (isViewerEnabled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyReference &&
            apiKeyId == other.apiKeyId &&
            description == other.description &&
            isClinicalContextEnrichmentEnabled == other.isClinicalContextEnrichmentEnabled &&
            isViewerEnabled == other.isViewerEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKeyId,
            description,
            isClinicalContextEnrichmentEnabled,
            isViewerEnabled,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKeyReference{apiKeyId=$apiKeyId, description=$description, isClinicalContextEnrichmentEnabled=$isClinicalContextEnrichmentEnabled, isViewerEnabled=$isViewerEnabled, additionalProperties=$additionalProperties}"
}
