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

/** A reference to an organization with basic identifying information */
class OrgReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val orgId: JsonField<String>,
    private val orgName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("orgId") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orgName") @ExcludeMissing orgName: JsonField<String> = JsonMissing.of(),
    ) : this(orgId, orgName, mutableMapOf())

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
         * Returns a mutable builder for constructing an instance of [OrgReference].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .orgName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrgReference]. */
    class Builder internal constructor() {

        private var orgId: JsonField<String>? = null
        private var orgName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orgReference: OrgReference) = apply {
            orgId = orgReference.orgId
            orgName = orgReference.orgName
            additionalProperties = orgReference.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [OrgReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .orgName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrgReference =
            OrgReference(
                checkRequired("orgId", orgId),
                checkRequired("orgName", orgName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrgReference = apply {
        if (validated) {
            return@apply
        }

        orgId()
        orgName()
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
        (if (orgId.asKnown().isPresent) 1 else 0) + (if (orgName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgReference &&
            orgId == other.orgId &&
            orgName == other.orgName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(orgId, orgName, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrgReference{orgId=$orgId, orgName=$orgName, additionalProperties=$additionalProperties}"
}
