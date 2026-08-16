// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

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

/** Paginated list of external reports without text or file URLs */
class ReportListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val reports: JsonField<List<ReportListResponse>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reports")
        @ExcludeMissing
        reports: JsonField<List<ReportListResponse>> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(hasMore, reports, cursor, mutableMapOf())

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reports(): List<ReportListResponse> = reports.getRequired("reports")

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
     * Returns the raw JSON value of [reports].
     *
     * Unlike [reports], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reports")
    @ExcludeMissing
    fun _reports(): JsonField<List<ReportListResponse>> = reports

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
         * Returns a mutable builder for constructing an instance of [ReportListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .reports()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListPageResponse]. */
    class Builder internal constructor() {

        private var hasMore: JsonField<Boolean>? = null
        private var reports: JsonField<MutableList<ReportListResponse>>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportListPageResponse: ReportListPageResponse) = apply {
            hasMore = reportListPageResponse.hasMore
            reports = reportListPageResponse.reports.map { it.toMutableList() }
            cursor = reportListPageResponse.cursor
            additionalProperties = reportListPageResponse.additionalProperties.toMutableMap()
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun reports(reports: List<ReportListResponse>) = reports(JsonField.of(reports))

        /**
         * Sets [Builder.reports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reports] with a well-typed `List<ReportListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reports(reports: JsonField<List<ReportListResponse>>) = apply {
            this.reports = reports.map { it.toMutableList() }
        }

        /**
         * Adds a single [ReportListResponse] to [reports].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReport(report: ReportListResponse) = apply {
            reports =
                (reports ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reports", it).add(report)
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
         * Returns an immutable instance of [ReportListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .reports()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportListPageResponse =
            ReportListPageResponse(
                checkRequired("hasMore", hasMore),
                checkRequired("reports", reports).map { it.toImmutable() },
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
    fun validate(): ReportListPageResponse = apply {
        if (validated) {
            return@apply
        }

        hasMore()
        reports().forEach { it.validate() }
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
            (reports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListPageResponse &&
            hasMore == other.hasMore &&
            reports == other.reports &&
            cursor == other.cursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hasMore, reports, cursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportListPageResponse{hasMore=$hasMore, reports=$reports, cursor=$cursor, additionalProperties=$additionalProperties}"
}
