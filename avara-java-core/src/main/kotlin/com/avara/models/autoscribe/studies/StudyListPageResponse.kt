// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

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

/** Paginated list of AutoScribe studies */
class StudyListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val studies: JsonField<List<StudyListResponse>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("studies")
        @ExcludeMissing
        studies: JsonField<List<StudyListResponse>> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(hasMore, studies, cursor, mutableMapOf())

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studies(): List<StudyListResponse> = studies.getRequired("studies")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = cursor.getOptional("cursor")

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMore") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [studies].
     *
     * Unlike [studies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studies")
    @ExcludeMissing
    fun _studies(): JsonField<List<StudyListResponse>> = studies

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
         * Returns a mutable builder for constructing an instance of [StudyListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .studies()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyListPageResponse]. */
    class Builder internal constructor() {

        private var hasMore: JsonField<Boolean>? = null
        private var studies: JsonField<MutableList<StudyListResponse>>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyListPageResponse: StudyListPageResponse) = apply {
            hasMore = studyListPageResponse.hasMore
            studies = studyListPageResponse.studies.map { it.toMutableList() }
            cursor = studyListPageResponse.cursor
            additionalProperties = studyListPageResponse.additionalProperties.toMutableMap()
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun studies(studies: List<StudyListResponse>) = studies(JsonField.of(studies))

        /**
         * Sets [Builder.studies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studies] with a well-typed `List<StudyListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun studies(studies: JsonField<List<StudyListResponse>>) = apply {
            this.studies = studies.map { it.toMutableList() }
        }

        /**
         * Adds a single [StudyListResponse] to [studies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStudy(study: StudyListResponse) = apply {
            studies =
                (studies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("studies", it).add(study)
                }
        }

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
         * Returns an immutable instance of [StudyListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .studies()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyListPageResponse =
            StudyListPageResponse(
                checkRequired("hasMore", hasMore),
                checkRequired("studies", studies).map { it.toImmutable() },
                cursor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StudyListPageResponse = apply {
        if (validated) {
            return@apply
        }

        hasMore()
        studies().forEach { it.validate() }
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
        (if (hasMore.asKnown().isPresent) 1 else 0) +
            (studies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyListPageResponse &&
            hasMore == other.hasMore &&
            studies == other.studies &&
            cursor == other.cursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hasMore, studies, cursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyListPageResponse{hasMore=$hasMore, studies=$studies, cursor=$cursor, additionalProperties=$additionalProperties}"
}
