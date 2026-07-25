// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.ExpressCustomerReference
import com.avara.models.autoscribe.ClinicalReferenceType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A canonical clinical reference value for study workflow pickers and normalization */
class ClinicalReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clinicalReferenceId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isActive: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val type: JsonField<ClinicalReferenceType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val expressCustomer: JsonField<ExpressCustomerReference>,
    private val externalReferenceId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clinicalReferenceId")
        @ExcludeMissing
        clinicalReferenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<ClinicalReferenceType> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expressCustomer")
        @ExcludeMissing
        expressCustomer: JsonField<ExpressCustomerReference> = JsonMissing.of(),
        @JsonProperty("externalReferenceId")
        @ExcludeMissing
        externalReferenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        clinicalReferenceId,
        createdAt,
        isActive,
        name,
        type,
        updatedAt,
        expressCustomer,
        externalReferenceId,
        metadata,
        mutableMapOf(),
    )

    /**
     * Unique clinical reference identifier. Format: ref_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicalReferenceId(): String = clinicalReferenceId.getRequired("clinicalReferenceId")

    /**
     * Timestamp when the clinical reference was created
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Whether this reference is active and available for pickers
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("isActive")

    /**
     * Canonical display name for this reference value
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Category of canonical clinical reference value used for study workflow pickers and
     * normalization.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): ClinicalReferenceType = type.getRequired("type")

    /**
     * Timestamp when the clinical reference was last updated
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * A reference to an Express customer with basic identifying information
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomer(): Optional<ExpressCustomerReference> =
        expressCustomer.getOptional("expressCustomer")

    /**
     * Integrator-provided stable identifier for mapping inbound data
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalReferenceId(): Optional<String> =
        externalReferenceId.getOptional("externalReferenceId")

    /**
     * Optional key-value metadata. Maximum 50 pairs
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Returns the raw JSON value of [clinicalReferenceId].
     *
     * Unlike [clinicalReferenceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("clinicalReferenceId")
    @ExcludeMissing
    fun _clinicalReferenceId(): JsonField<String> = clinicalReferenceId

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ClinicalReferenceType> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [expressCustomer].
     *
     * Unlike [expressCustomer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expressCustomer")
    @ExcludeMissing
    fun _expressCustomer(): JsonField<ExpressCustomerReference> = expressCustomer

    /**
     * Returns the raw JSON value of [externalReferenceId].
     *
     * Unlike [externalReferenceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalReferenceId")
    @ExcludeMissing
    fun _externalReferenceId(): JsonField<String> = externalReferenceId

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
         * Returns a mutable builder for constructing an instance of [ClinicalReference].
         *
         * The following fields are required:
         * ```java
         * .clinicalReferenceId()
         * .createdAt()
         * .isActive()
         * .name()
         * .type()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalReference]. */
    class Builder internal constructor() {

        private var clinicalReferenceId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isActive: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<ClinicalReferenceType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var expressCustomer: JsonField<ExpressCustomerReference> = JsonMissing.of()
        private var externalReferenceId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clinicalReference: ClinicalReference) = apply {
            clinicalReferenceId = clinicalReference.clinicalReferenceId
            createdAt = clinicalReference.createdAt
            isActive = clinicalReference.isActive
            name = clinicalReference.name
            type = clinicalReference.type
            updatedAt = clinicalReference.updatedAt
            expressCustomer = clinicalReference.expressCustomer
            externalReferenceId = clinicalReference.externalReferenceId
            metadata = clinicalReference.metadata
            additionalProperties = clinicalReference.additionalProperties.toMutableMap()
        }

        /** Unique clinical reference identifier. Format: ref_{32-hex-chars} */
        fun clinicalReferenceId(clinicalReferenceId: String) =
            clinicalReferenceId(JsonField.of(clinicalReferenceId))

        /**
         * Sets [Builder.clinicalReferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicalReferenceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clinicalReferenceId(clinicalReferenceId: JsonField<String>) = apply {
            this.clinicalReferenceId = clinicalReferenceId
        }

        /** Timestamp when the clinical reference was created */
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

        /** Whether this reference is active and available for pickers */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Canonical display name for this reference value */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Category of canonical clinical reference value used for study workflow pickers and
         * normalization.
         */
        fun type(type: ClinicalReferenceType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [ClinicalReferenceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<ClinicalReferenceType>) = apply { this.type = type }

        /** Timestamp when the clinical reference was last updated */
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

        /** A reference to an Express customer with basic identifying information */
        fun expressCustomer(expressCustomer: ExpressCustomerReference?) =
            expressCustomer(JsonField.ofNullable(expressCustomer))

        /** Alias for calling [Builder.expressCustomer] with `expressCustomer.orElse(null)`. */
        fun expressCustomer(expressCustomer: Optional<ExpressCustomerReference>) =
            expressCustomer(expressCustomer.getOrNull())

        /**
         * Sets [Builder.expressCustomer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomer] with a well-typed
         * [ExpressCustomerReference] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun expressCustomer(expressCustomer: JsonField<ExpressCustomerReference>) = apply {
            this.expressCustomer = expressCustomer
        }

        /** Integrator-provided stable identifier for mapping inbound data */
        fun externalReferenceId(externalReferenceId: String?) =
            externalReferenceId(JsonField.ofNullable(externalReferenceId))

        /**
         * Alias for calling [Builder.externalReferenceId] with `externalReferenceId.orElse(null)`.
         */
        fun externalReferenceId(externalReferenceId: Optional<String>) =
            externalReferenceId(externalReferenceId.getOrNull())

        /**
         * Sets [Builder.externalReferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalReferenceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalReferenceId(externalReferenceId: JsonField<String>) = apply {
            this.externalReferenceId = externalReferenceId
        }

        /** Optional key-value metadata. Maximum 50 pairs */
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
         * Returns an immutable instance of [ClinicalReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clinicalReferenceId()
         * .createdAt()
         * .isActive()
         * .name()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClinicalReference =
            ClinicalReference(
                checkRequired("clinicalReferenceId", clinicalReferenceId),
                checkRequired("createdAt", createdAt),
                checkRequired("isActive", isActive),
                checkRequired("name", name),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                expressCustomer,
                externalReferenceId,
                metadata,
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
    fun validate(): ClinicalReference = apply {
        if (validated) {
            return@apply
        }

        clinicalReferenceId()
        createdAt()
        isActive()
        name()
        type().validate()
        updatedAt()
        expressCustomer().ifPresent { it.validate() }
        externalReferenceId()
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
        (if (clinicalReferenceId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (expressCustomer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalReferenceId.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0)

    /** Optional key-value metadata. Maximum 50 pairs */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is ClinicalReference &&
            clinicalReferenceId == other.clinicalReferenceId &&
            createdAt == other.createdAt &&
            isActive == other.isActive &&
            name == other.name &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            expressCustomer == other.expressCustomer &&
            externalReferenceId == other.externalReferenceId &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clinicalReferenceId,
            createdAt,
            isActive,
            name,
            type,
            updatedAt,
            expressCustomer,
            externalReferenceId,
            metadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClinicalReference{clinicalReferenceId=$clinicalReferenceId, createdAt=$createdAt, isActive=$isActive, name=$name, type=$type, updatedAt=$updatedAt, expressCustomer=$expressCustomer, externalReferenceId=$externalReferenceId, metadata=$metadata, additionalProperties=$additionalProperties}"
}
