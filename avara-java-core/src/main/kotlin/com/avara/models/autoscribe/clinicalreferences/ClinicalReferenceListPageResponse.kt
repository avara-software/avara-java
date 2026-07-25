// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

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

/** Paginated list of clinical references */
class ClinicalReferenceListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clinicalReferences: JsonField<List<ClinicalReference>>,
    private val hasMore: JsonField<Boolean>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clinicalReferences")
        @ExcludeMissing
        clinicalReferences: JsonField<List<ClinicalReference>> = JsonMissing.of(),
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(clinicalReferences, hasMore, cursor, mutableMapOf())

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicalReferences(): List<ClinicalReference> =
        clinicalReferences.getRequired("clinicalReferences")

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
     * Returns the raw JSON value of [clinicalReferences].
     *
     * Unlike [clinicalReferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("clinicalReferences")
    @ExcludeMissing
    fun _clinicalReferences(): JsonField<List<ClinicalReference>> = clinicalReferences

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
         * Returns a mutable builder for constructing an instance of
         * [ClinicalReferenceListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .clinicalReferences()
         * .hasMore()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalReferenceListPageResponse]. */
    class Builder internal constructor() {

        private var clinicalReferences: JsonField<MutableList<ClinicalReference>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clinicalReferenceListPageResponse: ClinicalReferenceListPageResponse) =
            apply {
                clinicalReferences =
                    clinicalReferenceListPageResponse.clinicalReferences.map { it.toMutableList() }
                hasMore = clinicalReferenceListPageResponse.hasMore
                cursor = clinicalReferenceListPageResponse.cursor
                additionalProperties =
                    clinicalReferenceListPageResponse.additionalProperties.toMutableMap()
            }

        fun clinicalReferences(clinicalReferences: List<ClinicalReference>) =
            clinicalReferences(JsonField.of(clinicalReferences))

        /**
         * Sets [Builder.clinicalReferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicalReferences] with a well-typed
         * `List<ClinicalReference>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun clinicalReferences(clinicalReferences: JsonField<List<ClinicalReference>>) = apply {
            this.clinicalReferences = clinicalReferences.map { it.toMutableList() }
        }

        /**
         * Adds a single [ClinicalReference] to [clinicalReferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClinicalReference(clinicalReference: ClinicalReference) = apply {
            clinicalReferences =
                (clinicalReferences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clinicalReferences", it).add(clinicalReference)
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
         * Returns an immutable instance of [ClinicalReferenceListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clinicalReferences()
         * .hasMore()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClinicalReferenceListPageResponse =
            ClinicalReferenceListPageResponse(
                checkRequired("clinicalReferences", clinicalReferences).map { it.toImmutable() },
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
    fun validate(): ClinicalReferenceListPageResponse = apply {
        if (validated) {
            return@apply
        }

        clinicalReferences().forEach { it.validate() }
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
        (clinicalReferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasMore.asKnown().isPresent) 1 else 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalReferenceListPageResponse &&
            clinicalReferences == other.clinicalReferences &&
            hasMore == other.hasMore &&
            cursor == other.cursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(clinicalReferences, hasMore, cursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClinicalReferenceListPageResponse{clinicalReferences=$clinicalReferences, hasMore=$hasMore, cursor=$cursor, additionalProperties=$additionalProperties}"
}
