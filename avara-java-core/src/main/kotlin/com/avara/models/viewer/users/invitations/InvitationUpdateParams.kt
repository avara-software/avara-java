// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.users.invitations

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.Params
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.AssignableUserLevel
import com.avara.models.ClinicRole
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates a pending invitation's user details and permissions before it is accepted. Only valid for
 * invitations that have not expired or been processed.
 */
class InvitationUpdateParams
private constructor(
    private val invitationId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique invitation identifier. Format: inv_{32-hex-chars} */
    fun invitationId(): Optional<String> = Optional.ofNullable(invitationId)

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun canManageStudies(): Optional<Boolean> = body.canManageStudies()

    /**
     * A user's clinical or organizational role within the clinic.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicRole(): Optional<ClinicRole> = body.clinicRole()

    /**
     * Invited user's first name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = body.firstName()

    /**
     * Whether the invited user will have dashboard access
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasDashboardAccess(): Optional<Boolean> = body.hasDashboardAccess()

    /**
     * Invited user's last name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = body.lastName()

    /**
     * User access level assignable via the API. 'admin' can manage users/settings, 'member' has
     * standard access. 'owner' is dashboard-only and cannot be assigned via the API.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun level(): Optional<AssignableUserLevel> = body.level()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = body.middleName()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = body.phoneNumber()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix1(): Optional<String> = body.suffix1()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix2(): Optional<String> = body.suffix2()

    /**
     * Returns the raw JSON value of [canManageStudies].
     *
     * Unlike [canManageStudies], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _canManageStudies(): JsonField<Boolean> = body._canManageStudies()

    /**
     * Returns the raw JSON value of [clinicRole].
     *
     * Unlike [clinicRole], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clinicRole(): JsonField<ClinicRole> = body._clinicRole()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [hasDashboardAccess].
     *
     * Unlike [hasDashboardAccess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _hasDashboardAccess(): JsonField<Boolean> = body._hasDashboardAccess()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [level].
     *
     * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _level(): JsonField<AssignableUserLevel> = body._level()

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _middleName(): JsonField<String> = body._middleName()

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumber(): JsonField<String> = body._phoneNumber()

    /**
     * Returns the raw JSON value of [suffix1].
     *
     * Unlike [suffix1], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _suffix1(): JsonField<String> = body._suffix1()

    /**
     * Returns the raw JSON value of [suffix2].
     *
     * Unlike [suffix2], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _suffix2(): JsonField<String> = body._suffix2()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InvitationUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvitationUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationUpdateParams]. */
    class Builder internal constructor() {

        private var invitationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invitationUpdateParams: InvitationUpdateParams) = apply {
            invitationId = invitationUpdateParams.invitationId
            body = invitationUpdateParams.body.toBuilder()
            additionalHeaders = invitationUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invitationUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Unique invitation identifier. Format: inv_{32-hex-chars} */
        fun invitationId(invitationId: String?) = apply { this.invitationId = invitationId }

        /** Alias for calling [Builder.invitationId] with `invitationId.orElse(null)`. */
        fun invitationId(invitationId: Optional<String>) = invitationId(invitationId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [canManageStudies]
         * - [clinicRole]
         * - [firstName]
         * - [hasDashboardAccess]
         * - [lastName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun canManageStudies(canManageStudies: Boolean) = apply {
            body.canManageStudies(canManageStudies)
        }

        /**
         * Sets [Builder.canManageStudies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canManageStudies] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canManageStudies(canManageStudies: JsonField<Boolean>) = apply {
            body.canManageStudies(canManageStudies)
        }

        /** A user's clinical or organizational role within the clinic. */
        fun clinicRole(clinicRole: ClinicRole?) = apply { body.clinicRole(clinicRole) }

        /** Alias for calling [Builder.clinicRole] with `clinicRole.orElse(null)`. */
        fun clinicRole(clinicRole: Optional<ClinicRole>) = clinicRole(clinicRole.getOrNull())

        /**
         * Sets [Builder.clinicRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicRole] with a well-typed [ClinicRole] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clinicRole(clinicRole: JsonField<ClinicRole>) = apply { body.clinicRole(clinicRole) }

        /** Invited user's first name */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        /** Whether the invited user will have dashboard access */
        fun hasDashboardAccess(hasDashboardAccess: Boolean) = apply {
            body.hasDashboardAccess(hasDashboardAccess)
        }

        /**
         * Sets [Builder.hasDashboardAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasDashboardAccess] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasDashboardAccess(hasDashboardAccess: JsonField<Boolean>) = apply {
            body.hasDashboardAccess(hasDashboardAccess)
        }

        /** Invited user's last name */
        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /**
         * User access level assignable via the API. 'admin' can manage users/settings, 'member' has
         * standard access. 'owner' is dashboard-only and cannot be assigned via the API.
         */
        fun level(level: AssignableUserLevel) = apply { body.level(level) }

        /**
         * Sets [Builder.level] to an arbitrary JSON value.
         *
         * You should usually call [Builder.level] with a well-typed [AssignableUserLevel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun level(level: JsonField<AssignableUserLevel>) = apply { body.level(level) }

        fun middleName(middleName: String?) = apply { body.middleName(middleName) }

        /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { body.middleName(middleName) }

        fun phoneNumber(phoneNumber: String?) = apply { body.phoneNumber(phoneNumber) }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

        fun suffix1(suffix1: String?) = apply { body.suffix1(suffix1) }

        /** Alias for calling [Builder.suffix1] with `suffix1.orElse(null)`. */
        fun suffix1(suffix1: Optional<String>) = suffix1(suffix1.getOrNull())

        /**
         * Sets [Builder.suffix1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix1(suffix1: JsonField<String>) = apply { body.suffix1(suffix1) }

        fun suffix2(suffix2: String?) = apply { body.suffix2(suffix2) }

        /** Alias for calling [Builder.suffix2] with `suffix2.orElse(null)`. */
        fun suffix2(suffix2: Optional<String>) = suffix2(suffix2.getOrNull())

        /**
         * Sets [Builder.suffix2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix2(suffix2: JsonField<String>) = apply { body.suffix2(suffix2) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [InvitationUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvitationUpdateParams =
            InvitationUpdateParams(
                invitationId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> invitationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for updating an invitation in Viewer */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val canManageStudies: JsonField<Boolean>,
        private val clinicRole: JsonField<ClinicRole>,
        private val firstName: JsonField<String>,
        private val hasDashboardAccess: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val level: JsonField<AssignableUserLevel>,
        private val middleName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val suffix1: JsonField<String>,
        private val suffix2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("canManageStudies")
            @ExcludeMissing
            canManageStudies: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("clinicRole")
            @ExcludeMissing
            clinicRole: JsonField<ClinicRole> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hasDashboardAccess")
            @ExcludeMissing
            hasDashboardAccess: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("level")
            @ExcludeMissing
            level: JsonField<AssignableUserLevel> = JsonMissing.of(),
            @JsonProperty("middleName")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
        ) : this(
            canManageStudies,
            clinicRole,
            firstName,
            hasDashboardAccess,
            lastName,
            level,
            middleName,
            phoneNumber,
            suffix1,
            suffix2,
            mutableMapOf(),
        )

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun canManageStudies(): Optional<Boolean> = canManageStudies.getOptional("canManageStudies")

        /**
         * A user's clinical or organizational role within the clinic.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clinicRole(): Optional<ClinicRole> = clinicRole.getOptional("clinicRole")

        /**
         * Invited user's first name
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("firstName")

        /**
         * Whether the invited user will have dashboard access
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasDashboardAccess(): Optional<Boolean> =
            hasDashboardAccess.getOptional("hasDashboardAccess")

        /**
         * Invited user's last name
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("lastName")

        /**
         * User access level assignable via the API. 'admin' can manage users/settings, 'member' has
         * standard access. 'owner' is dashboard-only and cannot be assigned via the API.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun level(): Optional<AssignableUserLevel> = level.getOptional("level")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun middleName(): Optional<String> = middleName.getOptional("middleName")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phoneNumber")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix1(): Optional<String> = suffix1.getOptional("suffix1")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix2(): Optional<String> = suffix2.getOptional("suffix2")

        /**
         * Returns the raw JSON value of [canManageStudies].
         *
         * Unlike [canManageStudies], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("canManageStudies")
        @ExcludeMissing
        fun _canManageStudies(): JsonField<Boolean> = canManageStudies

        /**
         * Returns the raw JSON value of [clinicRole].
         *
         * Unlike [clinicRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clinicRole")
        @ExcludeMissing
        fun _clinicRole(): JsonField<ClinicRole> = clinicRole

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [hasDashboardAccess].
         *
         * Unlike [hasDashboardAccess], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hasDashboardAccess")
        @ExcludeMissing
        fun _hasDashboardAccess(): JsonField<Boolean> = hasDashboardAccess

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [level].
         *
         * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<AssignableUserLevel> = level

        /**
         * Returns the raw JSON value of [middleName].
         *
         * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("middleName")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var canManageStudies: JsonField<Boolean> = JsonMissing.of()
            private var clinicRole: JsonField<ClinicRole> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var hasDashboardAccess: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var level: JsonField<AssignableUserLevel> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var suffix1: JsonField<String> = JsonMissing.of()
            private var suffix2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                canManageStudies = body.canManageStudies
                clinicRole = body.clinicRole
                firstName = body.firstName
                hasDashboardAccess = body.hasDashboardAccess
                lastName = body.lastName
                level = body.level
                middleName = body.middleName
                phoneNumber = body.phoneNumber
                suffix1 = body.suffix1
                suffix2 = body.suffix2
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun canManageStudies(canManageStudies: Boolean) =
                canManageStudies(JsonField.of(canManageStudies))

            /**
             * Sets [Builder.canManageStudies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canManageStudies] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canManageStudies(canManageStudies: JsonField<Boolean>) = apply {
                this.canManageStudies = canManageStudies
            }

            /** A user's clinical or organizational role within the clinic. */
            fun clinicRole(clinicRole: ClinicRole?) = clinicRole(JsonField.ofNullable(clinicRole))

            /** Alias for calling [Builder.clinicRole] with `clinicRole.orElse(null)`. */
            fun clinicRole(clinicRole: Optional<ClinicRole>) = clinicRole(clinicRole.getOrNull())

            /**
             * Sets [Builder.clinicRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clinicRole] with a well-typed [ClinicRole] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clinicRole(clinicRole: JsonField<ClinicRole>) = apply {
                this.clinicRole = clinicRole
            }

            /** Invited user's first name */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** Whether the invited user will have dashboard access */
            fun hasDashboardAccess(hasDashboardAccess: Boolean) =
                hasDashboardAccess(JsonField.of(hasDashboardAccess))

            /**
             * Sets [Builder.hasDashboardAccess] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasDashboardAccess] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun hasDashboardAccess(hasDashboardAccess: JsonField<Boolean>) = apply {
                this.hasDashboardAccess = hasDashboardAccess
            }

            /** Invited user's last name */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /**
             * User access level assignable via the API. 'admin' can manage users/settings, 'member'
             * has standard access. 'owner' is dashboard-only and cannot be assigned via the API.
             */
            fun level(level: AssignableUserLevel) = level(JsonField.of(level))

            /**
             * Sets [Builder.level] to an arbitrary JSON value.
             *
             * You should usually call [Builder.level] with a well-typed [AssignableUserLevel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun level(level: JsonField<AssignableUserLevel>) = apply { this.level = level }

            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            fun suffix1(suffix1: String?) = suffix1(JsonField.ofNullable(suffix1))

            /** Alias for calling [Builder.suffix1] with `suffix1.orElse(null)`. */
            fun suffix1(suffix1: Optional<String>) = suffix1(suffix1.getOrNull())

            /**
             * Sets [Builder.suffix1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

            fun suffix2(suffix2: String?) = suffix2(JsonField.ofNullable(suffix2))

            /** Alias for calling [Builder.suffix2] with `suffix2.orElse(null)`. */
            fun suffix2(suffix2: Optional<String>) = suffix2(suffix2.getOrNull())

            /**
             * Sets [Builder.suffix2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    canManageStudies,
                    clinicRole,
                    firstName,
                    hasDashboardAccess,
                    lastName,
                    level,
                    middleName,
                    phoneNumber,
                    suffix1,
                    suffix2,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            canManageStudies()
            clinicRole().ifPresent { it.validate() }
            firstName()
            hasDashboardAccess()
            lastName()
            level().ifPresent { it.validate() }
            middleName()
            phoneNumber()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (canManageStudies.asKnown().isPresent) 1 else 0) +
                (clinicRole.asKnown().getOrNull()?.validity() ?: 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (hasDashboardAccess.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (level.asKnown().getOrNull()?.validity() ?: 0) +
                (if (middleName.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (suffix1.asKnown().isPresent) 1 else 0) +
                (if (suffix2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                canManageStudies == other.canManageStudies &&
                clinicRole == other.clinicRole &&
                firstName == other.firstName &&
                hasDashboardAccess == other.hasDashboardAccess &&
                lastName == other.lastName &&
                level == other.level &&
                middleName == other.middleName &&
                phoneNumber == other.phoneNumber &&
                suffix1 == other.suffix1 &&
                suffix2 == other.suffix2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                canManageStudies,
                clinicRole,
                firstName,
                hasDashboardAccess,
                lastName,
                level,
                middleName,
                phoneNumber,
                suffix1,
                suffix2,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{canManageStudies=$canManageStudies, clinicRole=$clinicRole, firstName=$firstName, hasDashboardAccess=$hasDashboardAccess, lastName=$lastName, level=$level, middleName=$middleName, phoneNumber=$phoneNumber, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationUpdateParams &&
            invitationId == other.invitationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(invitationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvitationUpdateParams{invitationId=$invitationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
