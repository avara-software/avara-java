// File generated from our OpenAPI spec by Stainless.

package com.avara.models.orgs

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An organization entity that groups users and studies */
class OrgRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val isActive: JsonField<Boolean>,
    private val orgId: JsonField<String>,
    private val orgName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userCount: JsonField<Long>,
    private val createdByApiKeyId: JsonField<String>,
    private val createdByUserId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("orgId") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orgName") @ExcludeMissing orgName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("userCount") @ExcludeMissing userCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdByApiKeyId")
        @ExcludeMissing
        createdByApiKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdByUserId")
        @ExcludeMissing
        createdByUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        createdAt,
        isActive,
        orgId,
        orgName,
        updatedAt,
        userCount,
        createdByApiKeyId,
        createdByUserId,
        metadata,
        mutableMapOf(),
    )

    /**
     * Timestamp when the organization was created
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Whether the organization is currently active
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("isActive")

    /**
     * Unique organization identifier. Format: org_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orgId(): String = orgId.getRequired("orgId")

    /**
     * Name of the organization
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orgName(): String = orgName.getRequired("orgName")

    /**
     * Timestamp when the organization was last updated
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Number of users currently in this organization
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userCount(): Long = userCount.getRequired("userCount")

    /**
     * UUID of the API key used to create this organization, for audit tracking
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByApiKeyId(): Optional<String> = createdByApiKeyId.getOptional("createdByApiKeyId")

    /**
     * User ID who created this organization via dashboard, null if created via API key
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUserId(): Optional<String> = createdByUserId.getOptional("createdByUserId")

    /**
     * Custom key-value metadata for the organization. Maximum 50 pairs, keys up to 100 chars,
     * values up to 1000 chars
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orgId") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /**
     * Returns the raw JSON value of [orgName].
     *
     * Unlike [orgName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orgName") @ExcludeMissing fun _orgName(): JsonField<String> = orgName

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userCount].
     *
     * Unlike [userCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userCount") @ExcludeMissing fun _userCount(): JsonField<Long> = userCount

    /**
     * Returns the raw JSON value of [createdByApiKeyId].
     *
     * Unlike [createdByApiKeyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("createdByApiKeyId")
    @ExcludeMissing
    fun _createdByApiKeyId(): JsonField<String> = createdByApiKeyId

    /**
     * Returns the raw JSON value of [createdByUserId].
     *
     * Unlike [createdByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByUserId")
    @ExcludeMissing
    fun _createdByUserId(): JsonField<String> = createdByUserId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of [OrgRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .isActive()
         * .orgId()
         * .orgName()
         * .updatedAt()
         * .userCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrgRetrieveResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isActive: JsonField<Boolean>? = null
        private var orgId: JsonField<String>? = null
        private var orgName: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var userCount: JsonField<Long>? = null
        private var createdByApiKeyId: JsonField<String> = JsonMissing.of()
        private var createdByUserId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orgRetrieveResponse: OrgRetrieveResponse) = apply {
            createdAt = orgRetrieveResponse.createdAt
            isActive = orgRetrieveResponse.isActive
            orgId = orgRetrieveResponse.orgId
            orgName = orgRetrieveResponse.orgName
            updatedAt = orgRetrieveResponse.updatedAt
            userCount = orgRetrieveResponse.userCount
            createdByApiKeyId = orgRetrieveResponse.createdByApiKeyId
            createdByUserId = orgRetrieveResponse.createdByUserId
            metadata = orgRetrieveResponse.metadata
            additionalProperties = orgRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp when the organization was created */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the organization is currently active */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Unique organization identifier. Format: org_{32-hex-chars} */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /** Name of the organization */
        fun orgName(orgName: String) = orgName(JsonField.of(orgName))

        /**
         * Sets [Builder.orgName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgName(orgName: JsonField<String>) = apply { this.orgName = orgName }

        /** Timestamp when the organization was last updated */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Number of users currently in this organization */
        fun userCount(userCount: Long) = userCount(JsonField.of(userCount))

        /**
         * Sets [Builder.userCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userCount(userCount: JsonField<Long>) = apply { this.userCount = userCount }

        /** UUID of the API key used to create this organization, for audit tracking */
        fun createdByApiKeyId(createdByApiKeyId: String) =
            createdByApiKeyId(JsonField.of(createdByApiKeyId))

        /**
         * Sets [Builder.createdByApiKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByApiKeyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdByApiKeyId(createdByApiKeyId: JsonField<String>) = apply {
            this.createdByApiKeyId = createdByApiKeyId
        }

        /** User ID who created this organization via dashboard, null if created via API key */
        fun createdByUserId(createdByUserId: String) =
            createdByUserId(JsonField.of(createdByUserId))

        /**
         * Sets [Builder.createdByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByUserId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdByUserId(createdByUserId: JsonField<String>) = apply {
            this.createdByUserId = createdByUserId
        }

        /**
         * Custom key-value metadata for the organization. Maximum 50 pairs, keys up to 100 chars,
         * values up to 1000 chars
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
         * Returns an immutable instance of [OrgRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .isActive()
         * .orgId()
         * .orgName()
         * .updatedAt()
         * .userCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrgRetrieveResponse =
            OrgRetrieveResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("isActive", isActive),
                checkRequired("orgId", orgId),
                checkRequired("orgName", orgName),
                checkRequired("updatedAt", updatedAt),
                checkRequired("userCount", userCount),
                createdByApiKeyId,
                createdByUserId,
                metadata,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrgRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        isActive()
        orgId()
        orgName()
        updatedAt()
        userCount()
        createdByApiKeyId()
        createdByUserId()
        metadata().ifPresent { it.validate() }
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (orgId.asKnown().isPresent) 1 else 0) +
            (if (orgName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userCount.asKnown().isPresent) 1 else 0) +
            (if (createdByApiKeyId.asKnown().isPresent) 1 else 0) +
            (if (createdByUserId.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Custom key-value metadata for the organization. Maximum 50 pairs, keys up to 100 chars,
     * values up to 1000 chars
     */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgRetrieveResponse &&
            createdAt == other.createdAt &&
            isActive == other.isActive &&
            orgId == other.orgId &&
            orgName == other.orgName &&
            updatedAt == other.updatedAt &&
            userCount == other.userCount &&
            createdByApiKeyId == other.createdByApiKeyId &&
            createdByUserId == other.createdByUserId &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            isActive,
            orgId,
            orgName,
            updatedAt,
            userCount,
            createdByApiKeyId,
            createdByUserId,
            metadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrgRetrieveResponse{createdAt=$createdAt, isActive=$isActive, orgId=$orgId, orgName=$orgName, updatedAt=$updatedAt, userCount=$userCount, createdByApiKeyId=$createdByApiKeyId, createdByUserId=$createdByUserId, metadata=$metadata, additionalProperties=$additionalProperties}"
}
