// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.users

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.Params
import com.avara.core.checkRequired
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
 * Creates a new user in the AutoScribe system and sends them an invitation email. The user will
 * have the specified permissions including report creation and study management capabilities. NPI
 * number is required for users who can create reports.
 */
class UserInviteParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canCreateReports(): Boolean = body.canCreateReports()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canManageStudies(): Boolean = body.canManageStudies()

    /**
     * A user's clinical or organizational role within the clinic.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicRole(): ClinicRole = body.clinicRole()

    /**
     * User's email address for login and notifications
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = body.email()

    /**
     * User's first name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = body.firstName()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasDashboardAccess(): Boolean = body.hasDashboardAccess()

    /**
     * User's last name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = body.lastName()

    /**
     * User access level assignable via the API. 'admin' can manage users/settings, 'member' has
     * standard access. 'owner' is dashboard-only and cannot be assigned via the API.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun level(): AssignableUserLevel = body.level()

    /**
     * User's middle name (optional)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = body.middleName()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun npiNumber(): Optional<String> = body.npiNumber()

    /**
     * User's phone number (10-15 digits, optional)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = body.phoneNumber()

    /**
     * Name suffix (e.g., 'Jr.', 'Sr.', 'III') - optional
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix1(): Optional<String> = body.suffix1()

    /**
     * Additional name suffix (optional)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix2(): Optional<String> = body.suffix2()

    /**
     * Returns the raw JSON value of [canCreateReports].
     *
     * Unlike [canCreateReports], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _canCreateReports(): JsonField<Boolean> = body._canCreateReports()

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
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

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
     * Returns the raw JSON value of [npiNumber].
     *
     * Unlike [npiNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _npiNumber(): JsonField<String> = body._npiNumber()

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

        /**
         * Returns a mutable builder for constructing an instance of [UserInviteParams].
         *
         * The following fields are required:
         * ```java
         * .canCreateReports()
         * .canManageStudies()
         * .clinicRole()
         * .email()
         * .firstName()
         * .hasDashboardAccess()
         * .lastName()
         * .level()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserInviteParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userInviteParams: UserInviteParams) = apply {
            body = userInviteParams.body.toBuilder()
            additionalHeaders = userInviteParams.additionalHeaders.toBuilder()
            additionalQueryParams = userInviteParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [canCreateReports]
         * - [canManageStudies]
         * - [clinicRole]
         * - [email]
         * - [firstName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun canCreateReports(canCreateReports: Boolean) = apply {
            body.canCreateReports(canCreateReports)
        }

        /**
         * Sets [Builder.canCreateReports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canCreateReports] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canCreateReports(canCreateReports: JsonField<Boolean>) = apply {
            body.canCreateReports(canCreateReports)
        }

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
        fun clinicRole(clinicRole: ClinicRole) = apply { body.clinicRole(clinicRole) }

        /**
         * Sets [Builder.clinicRole] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicRole] with a well-typed [ClinicRole] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clinicRole(clinicRole: JsonField<ClinicRole>) = apply { body.clinicRole(clinicRole) }

        /** User's email address for login and notifications */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** User's first name */
        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

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

        /** User's last name */
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

        /** User's middle name (optional) */
        fun middleName(middleName: String) = apply { body.middleName(middleName) }

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { body.middleName(middleName) }

        fun npiNumber(npiNumber: String) = apply { body.npiNumber(npiNumber) }

        /**
         * Sets [Builder.npiNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.npiNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun npiNumber(npiNumber: JsonField<String>) = apply { body.npiNumber(npiNumber) }

        /** User's phone number (10-15 digits, optional) */
        fun phoneNumber(phoneNumber: String) = apply { body.phoneNumber(phoneNumber) }

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { body.phoneNumber(phoneNumber) }

        /** Name suffix (e.g., 'Jr.', 'Sr.', 'III') - optional */
        fun suffix1(suffix1: String) = apply { body.suffix1(suffix1) }

        /**
         * Sets [Builder.suffix1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix1(suffix1: JsonField<String>) = apply { body.suffix1(suffix1) }

        /** Additional name suffix (optional) */
        fun suffix2(suffix2: String) = apply { body.suffix2(suffix2) }

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
         * Returns an immutable instance of [UserInviteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canCreateReports()
         * .canManageStudies()
         * .clinicRole()
         * .email()
         * .firstName()
         * .hasDashboardAccess()
         * .lastName()
         * .level()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserInviteParams =
            UserInviteParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for inviting a user to AutoScribe */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val canCreateReports: JsonField<Boolean>,
        private val canManageStudies: JsonField<Boolean>,
        private val clinicRole: JsonField<ClinicRole>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val hasDashboardAccess: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val level: JsonField<AssignableUserLevel>,
        private val middleName: JsonField<String>,
        private val npiNumber: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val suffix1: JsonField<String>,
        private val suffix2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("canCreateReports")
            @ExcludeMissing
            canCreateReports: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("canManageStudies")
            @ExcludeMissing
            canManageStudies: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("clinicRole")
            @ExcludeMissing
            clinicRole: JsonField<ClinicRole> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("npiNumber")
            @ExcludeMissing
            npiNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
        ) : this(
            canCreateReports,
            canManageStudies,
            clinicRole,
            email,
            firstName,
            hasDashboardAccess,
            lastName,
            level,
            middleName,
            npiNumber,
            phoneNumber,
            suffix1,
            suffix2,
            mutableMapOf(),
        )

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canCreateReports(): Boolean = canCreateReports.getRequired("canCreateReports")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canManageStudies(): Boolean = canManageStudies.getRequired("canManageStudies")

        /**
         * A user's clinical or organizational role within the clinic.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clinicRole(): ClinicRole = clinicRole.getRequired("clinicRole")

        /**
         * User's email address for login and notifications
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * User's first name
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("firstName")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasDashboardAccess(): Boolean = hasDashboardAccess.getRequired("hasDashboardAccess")

        /**
         * User's last name
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("lastName")

        /**
         * User access level assignable via the API. 'admin' can manage users/settings, 'member' has
         * standard access. 'owner' is dashboard-only and cannot be assigned via the API.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun level(): AssignableUserLevel = level.getRequired("level")

        /**
         * User's middle name (optional)
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun middleName(): Optional<String> = middleName.getOptional("middleName")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun npiNumber(): Optional<String> = npiNumber.getOptional("npiNumber")

        /**
         * User's phone number (10-15 digits, optional)
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phoneNumber")

        /**
         * Name suffix (e.g., 'Jr.', 'Sr.', 'III') - optional
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix1(): Optional<String> = suffix1.getOptional("suffix1")

        /**
         * Additional name suffix (optional)
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suffix2(): Optional<String> = suffix2.getOptional("suffix2")

        /**
         * Returns the raw JSON value of [canCreateReports].
         *
         * Unlike [canCreateReports], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("canCreateReports")
        @ExcludeMissing
        fun _canCreateReports(): JsonField<Boolean> = canCreateReports

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
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
         * Returns the raw JSON value of [npiNumber].
         *
         * Unlike [npiNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("npiNumber") @ExcludeMissing fun _npiNumber(): JsonField<String> = npiNumber

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .canCreateReports()
             * .canManageStudies()
             * .clinicRole()
             * .email()
             * .firstName()
             * .hasDashboardAccess()
             * .lastName()
             * .level()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var canCreateReports: JsonField<Boolean>? = null
            private var canManageStudies: JsonField<Boolean>? = null
            private var clinicRole: JsonField<ClinicRole>? = null
            private var email: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var hasDashboardAccess: JsonField<Boolean>? = null
            private var lastName: JsonField<String>? = null
            private var level: JsonField<AssignableUserLevel>? = null
            private var middleName: JsonField<String> = JsonMissing.of()
            private var npiNumber: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var suffix1: JsonField<String> = JsonMissing.of()
            private var suffix2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                canCreateReports = body.canCreateReports
                canManageStudies = body.canManageStudies
                clinicRole = body.clinicRole
                email = body.email
                firstName = body.firstName
                hasDashboardAccess = body.hasDashboardAccess
                lastName = body.lastName
                level = body.level
                middleName = body.middleName
                npiNumber = body.npiNumber
                phoneNumber = body.phoneNumber
                suffix1 = body.suffix1
                suffix2 = body.suffix2
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun canCreateReports(canCreateReports: Boolean) =
                canCreateReports(JsonField.of(canCreateReports))

            /**
             * Sets [Builder.canCreateReports] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canCreateReports] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canCreateReports(canCreateReports: JsonField<Boolean>) = apply {
                this.canCreateReports = canCreateReports
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
            fun clinicRole(clinicRole: ClinicRole) = clinicRole(JsonField.of(clinicRole))

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

            /** User's email address for login and notifications */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** User's first name */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

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

            /** User's last name */
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

            /** User's middle name (optional) */
            fun middleName(middleName: String) = middleName(JsonField.of(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun npiNumber(npiNumber: String) = npiNumber(JsonField.of(npiNumber))

            /**
             * Sets [Builder.npiNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.npiNumber] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun npiNumber(npiNumber: JsonField<String>) = apply { this.npiNumber = npiNumber }

            /** User's phone number (10-15 digits, optional) */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

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

            /** Name suffix (e.g., 'Jr.', 'Sr.', 'III') - optional */
            fun suffix1(suffix1: String) = suffix1(JsonField.of(suffix1))

            /**
             * Sets [Builder.suffix1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

            /** Additional name suffix (optional) */
            fun suffix2(suffix2: String) = suffix2(JsonField.of(suffix2))

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
             *
             * The following fields are required:
             * ```java
             * .canCreateReports()
             * .canManageStudies()
             * .clinicRole()
             * .email()
             * .firstName()
             * .hasDashboardAccess()
             * .lastName()
             * .level()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("canCreateReports", canCreateReports),
                    checkRequired("canManageStudies", canManageStudies),
                    checkRequired("clinicRole", clinicRole),
                    checkRequired("email", email),
                    checkRequired("firstName", firstName),
                    checkRequired("hasDashboardAccess", hasDashboardAccess),
                    checkRequired("lastName", lastName),
                    checkRequired("level", level),
                    middleName,
                    npiNumber,
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

            canCreateReports()
            canManageStudies()
            clinicRole().validate()
            email()
            firstName()
            hasDashboardAccess()
            lastName()
            level().validate()
            middleName()
            npiNumber()
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
            (if (canCreateReports.asKnown().isPresent) 1 else 0) +
                (if (canManageStudies.asKnown().isPresent) 1 else 0) +
                (clinicRole.asKnown().getOrNull()?.validity() ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (hasDashboardAccess.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (level.asKnown().getOrNull()?.validity() ?: 0) +
                (if (middleName.asKnown().isPresent) 1 else 0) +
                (if (npiNumber.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (suffix1.asKnown().isPresent) 1 else 0) +
                (if (suffix2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                canCreateReports == other.canCreateReports &&
                canManageStudies == other.canManageStudies &&
                clinicRole == other.clinicRole &&
                email == other.email &&
                firstName == other.firstName &&
                hasDashboardAccess == other.hasDashboardAccess &&
                lastName == other.lastName &&
                level == other.level &&
                middleName == other.middleName &&
                npiNumber == other.npiNumber &&
                phoneNumber == other.phoneNumber &&
                suffix1 == other.suffix1 &&
                suffix2 == other.suffix2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                canCreateReports,
                canManageStudies,
                clinicRole,
                email,
                firstName,
                hasDashboardAccess,
                lastName,
                level,
                middleName,
                npiNumber,
                phoneNumber,
                suffix1,
                suffix2,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{canCreateReports=$canCreateReports, canManageStudies=$canManageStudies, clinicRole=$clinicRole, email=$email, firstName=$firstName, hasDashboardAccess=$hasDashboardAccess, lastName=$lastName, level=$level, middleName=$middleName, npiNumber=$npiNumber, phoneNumber=$phoneNumber, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserInviteParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserInviteParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
