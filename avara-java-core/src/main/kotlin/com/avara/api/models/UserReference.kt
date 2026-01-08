// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models

import com.avara.api.core.ExcludeMissing
import com.avara.api.core.JsonField
import com.avara.api.core.JsonMissing
import com.avara.api.core.JsonValue
import com.avara.api.core.checkRequired
import com.avara.api.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** A reference to a user with basic identifying information */
class UserReference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val email: JsonField<String>,
    private val userId: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val middleName: JsonField<String>,
    private val suffix1: JsonField<String>,
    private val suffix2: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("middleName")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
    ) : this(email, userId, firstName, lastName, middleName, suffix1, suffix2, mutableMapOf())

    /**
     * User's email address
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * Unique user identifier. Format: usr_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    /**
     * User's first name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * User's last name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * User's middle name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = middleName.getOptional("middleName")

    /**
     * Name suffix (e.g., 'MD', 'Jr.')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix1(): Optional<String> = suffix1.getOptional("suffix1")

    /**
     * Additional name suffix
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix2(): Optional<String> = suffix2.getOptional("suffix2")

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middleName") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

    /**
     * Returns the raw JSON value of [suffix1].
     *
     * Unlike [suffix1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffix1") @ExcludeMissing fun _suffix1(): JsonField<String> = suffix1

    /**
     * Returns the raw JSON value of [suffix2].
     *
     * Unlike [suffix2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffix2") @ExcludeMissing fun _suffix2(): JsonField<String> = suffix2

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
         * Returns a mutable builder for constructing an instance of [UserReference].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserReference]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var suffix1: JsonField<String> = JsonMissing.of()
        private var suffix2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userReference: UserReference) = apply {
            email = userReference.email
            userId = userReference.userId
            firstName = userReference.firstName
            lastName = userReference.lastName
            middleName = userReference.middleName
            suffix1 = userReference.suffix1
            suffix2 = userReference.suffix2
            additionalProperties = userReference.additionalProperties.toMutableMap()
        }

        /** User's email address */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Unique user identifier. Format: usr_{32-hex-chars} */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** User's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** User's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** User's middle name */
        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        /** Name suffix (e.g., 'MD', 'Jr.') */
        fun suffix1(suffix1: String) = suffix1(JsonField.of(suffix1))

        /**
         * Sets [Builder.suffix1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

        /** Additional name suffix */
        fun suffix2(suffix2: String) = suffix2(JsonField.of(suffix2))

        /**
         * Sets [Builder.suffix2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix2(suffix2: JsonField<String>) = apply { this.suffix2 = suffix2 }

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
         * Returns an immutable instance of [UserReference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserReference =
            UserReference(
                checkRequired("email", email),
                checkRequired("userId", userId),
                firstName,
                lastName,
                middleName,
                suffix1,
                suffix2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserReference = apply {
        if (validated) {
            return@apply
        }

        email()
        userId()
        firstName()
        lastName()
        middleName()
        suffix1()
        suffix2()
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
        (if (email.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (middleName.asKnown().isPresent) 1 else 0) +
            (if (suffix1.asKnown().isPresent) 1 else 0) +
            (if (suffix2.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserReference &&
            email == other.email &&
            userId == other.userId &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            middleName == other.middleName &&
            suffix1 == other.suffix1 &&
            suffix2 == other.suffix2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            email,
            userId,
            firstName,
            lastName,
            middleName,
            suffix1,
            suffix2,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserReference{email=$email, userId=$userId, firstName=$firstName, lastName=$lastName, middleName=$middleName, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
}
