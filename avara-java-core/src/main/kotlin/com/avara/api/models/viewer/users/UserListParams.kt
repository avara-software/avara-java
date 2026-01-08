// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.users

import com.avara.api.core.Enum
import com.avara.api.core.JsonField
import com.avara.api.core.Params
import com.avara.api.core.http.Headers
import com.avara.api.core.http.QueryParams
import com.avara.api.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a paginated list of users with optional filtering by access level, email, name, and
 * invitation source. Returns up to 100 users per request.
 */
class UserListParams
private constructor(
    private val cursor: String?,
    private val email: String?,
    private val firstName: String?,
    private val invitedSource: InvitedSource?,
    private val lastName: String?,
    private val level: Level?,
    private val limit: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Base64 encoded cursor from previous response */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter by exact email match */
    fun email(): Optional<String> = Optional.ofNullable(email)

    /** Filter by first name (contains match) */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    /** Filter by invitation source */
    fun invitedSource(): Optional<InvitedSource> = Optional.ofNullable(invitedSource)

    /** Filter by last name (contains match) */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    /** Filter by user level */
    fun level(): Optional<Level> = Optional.ofNullable(level)

    /** Number of results to return (1-100) */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UserListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UserListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var email: String? = null
        private var firstName: String? = null
        private var invitedSource: InvitedSource? = null
        private var lastName: String? = null
        private var level: Level? = null
        private var limit: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userListParams: UserListParams) = apply {
            cursor = userListParams.cursor
            email = userListParams.email
            firstName = userListParams.firstName
            invitedSource = userListParams.invitedSource
            lastName = userListParams.lastName
            level = userListParams.level
            limit = userListParams.limit
            additionalHeaders = userListParams.additionalHeaders.toBuilder()
            additionalQueryParams = userListParams.additionalQueryParams.toBuilder()
        }

        /** Base64 encoded cursor from previous response */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter by exact email match */
        fun email(email: String?) = apply { this.email = email }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /** Filter by first name (contains match) */
        fun firstName(firstName: String?) = apply { this.firstName = firstName }

        /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
        fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

        /** Filter by invitation source */
        fun invitedSource(invitedSource: InvitedSource?) = apply {
            this.invitedSource = invitedSource
        }

        /** Alias for calling [Builder.invitedSource] with `invitedSource.orElse(null)`. */
        fun invitedSource(invitedSource: Optional<InvitedSource>) =
            invitedSource(invitedSource.getOrNull())

        /** Filter by last name (contains match) */
        fun lastName(lastName: String?) = apply { this.lastName = lastName }

        /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
        fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

        /** Filter by user level */
        fun level(level: Level?) = apply { this.level = level }

        /** Alias for calling [Builder.level] with `level.orElse(null)`. */
        fun level(level: Optional<Level>) = level(level.getOrNull())

        /** Number of results to return (1-100) */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Double>) = limit(limit.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UserListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserListParams =
            UserListParams(
                cursor,
                email,
                firstName,
                invitedSource,
                lastName,
                level,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                email?.let { put("email", it) }
                firstName?.let { put("firstName", it) }
                invitedSource?.let { put("invitedSource", it.toString()) }
                lastName?.let { put("lastName", it) }
                level?.let { put("level", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by invitation source */
    class InvitedSource @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DASHBOARD = of("dashboard")

            @JvmField val API = of("api")

            @JvmStatic fun of(value: String) = InvitedSource(JsonField.of(value))
        }

        /** An enum containing [InvitedSource]'s known values. */
        enum class Known {
            DASHBOARD,
            API,
        }

        /**
         * An enum containing [InvitedSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InvitedSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DASHBOARD,
            API,
            /**
             * An enum member indicating that [InvitedSource] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DASHBOARD -> Value.DASHBOARD
                API -> Value.API
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AvaraInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                DASHBOARD -> Known.DASHBOARD
                API -> Known.API
                else -> throw AvaraInvalidDataException("Unknown InvitedSource: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AvaraInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { AvaraInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): InvitedSource = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvitedSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by user level */
    class Level @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OWNER = of("owner")

            @JvmField val ADMIN = of("admin")

            @JvmField val MEMBER = of("member")

            @JvmStatic fun of(value: String) = Level(JsonField.of(value))
        }

        /** An enum containing [Level]'s known values. */
        enum class Known {
            OWNER,
            ADMIN,
            MEMBER,
        }

        /**
         * An enum containing [Level]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Level] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OWNER,
            ADMIN,
            MEMBER,
            /** An enum member indicating that [Level] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OWNER -> Value.OWNER
                ADMIN -> Value.ADMIN
                MEMBER -> Value.MEMBER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AvaraInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                OWNER -> Known.OWNER
                ADMIN -> Known.ADMIN
                MEMBER -> Known.MEMBER
                else -> throw AvaraInvalidDataException("Unknown Level: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AvaraInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { AvaraInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Level = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Level && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserListParams &&
            cursor == other.cursor &&
            email == other.email &&
            firstName == other.firstName &&
            invitedSource == other.invitedSource &&
            lastName == other.lastName &&
            level == other.level &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            email,
            firstName,
            invitedSource,
            lastName,
            level,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UserListParams{cursor=$cursor, email=$email, firstName=$firstName, invitedSource=$invitedSource, lastName=$lastName, level=$level, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
