// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import com.avara.api.core.ExcludeMissing
import com.avara.api.core.JsonField
import com.avara.api.core.JsonMissing
import com.avara.api.core.JsonValue
import com.avara.api.core.checkKnown
import com.avara.api.core.checkRequired
import com.avara.api.core.toImmutable
import com.avara.api.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Paginated list of organizations */
class OrgListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val organizations: JsonField<List<OrgListResponse>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("organizations")
        @ExcludeMissing
        organizations: JsonField<List<OrgListResponse>> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(hasMore, organizations, cursor, mutableMapOf())

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizations(): List<OrgListResponse> = organizations.getRequired("organizations")

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
     * Returns the raw JSON value of [organizations].
     *
     * Unlike [organizations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organizations")
    @ExcludeMissing
    fun _organizations(): JsonField<List<OrgListResponse>> = organizations

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
         * Returns a mutable builder for constructing an instance of [OrgListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .organizations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrgListPageResponse]. */
    class Builder internal constructor() {

        private var hasMore: JsonField<Boolean>? = null
        private var organizations: JsonField<MutableList<OrgListResponse>>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orgListPageResponse: OrgListPageResponse) = apply {
            hasMore = orgListPageResponse.hasMore
            organizations = orgListPageResponse.organizations.map { it.toMutableList() }
            cursor = orgListPageResponse.cursor
            additionalProperties = orgListPageResponse.additionalProperties.toMutableMap()
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun organizations(organizations: List<OrgListResponse>) =
            organizations(JsonField.of(organizations))

        /**
         * Sets [Builder.organizations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizations] with a well-typed `List<OrgListResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun organizations(organizations: JsonField<List<OrgListResponse>>) = apply {
            this.organizations = organizations.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrgListResponse] to [organizations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrganization(organization: OrgListResponse) = apply {
            organizations =
                (organizations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("organizations", it).add(organization)
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
         * Returns an immutable instance of [OrgListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .organizations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrgListPageResponse =
            OrgListPageResponse(
                checkRequired("hasMore", hasMore),
                checkRequired("organizations", organizations).map { it.toImmutable() },
                cursor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrgListPageResponse = apply {
        if (validated) {
            return@apply
        }

        hasMore()
        organizations().forEach { it.validate() }
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
            (organizations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgListPageResponse &&
            hasMore == other.hasMore &&
            organizations == other.organizations &&
            cursor == other.cursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hasMore, organizations, cursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrgListPageResponse{hasMore=$hasMore, organizations=$organizations, cursor=$cursor, additionalProperties=$additionalProperties}"
}
