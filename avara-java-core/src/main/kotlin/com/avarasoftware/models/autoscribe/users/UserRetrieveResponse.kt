// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.users

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkRequired
import com.avarasoftware.errors.AvaraInvalidDataException
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.InvitedSource
import com.avarasoftware.models.UserLevel
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A user in the AutoScribe system with report creation permissions */
class UserRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val canCreateReports: JsonField<Boolean>,
    private val canManageStudies: JsonField<Boolean>,
    private val clinicRole: JsonField<ClinicRole>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val hasDashboardAccess: JsonField<Boolean>,
    private val invitedSource: JsonField<InvitedSource>,
    private val lastLoginAt: JsonField<OffsetDateTime>,
    private val lastName: JsonField<String>,
    private val level: JsonField<UserLevel>,
    private val userId: JsonField<String>,
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
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasDashboardAccess")
        @ExcludeMissing
        hasDashboardAccess: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("invitedSource")
        @ExcludeMissing
        invitedSource: JsonField<InvitedSource> = JsonMissing.of(),
        @JsonProperty("lastLoginAt")
        @ExcludeMissing
        lastLoginAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("level") @ExcludeMissing level: JsonField<UserLevel> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("middleName")
        @ExcludeMissing
        middleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("npiNumber") @ExcludeMissing npiNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
    ) : this(
        canCreateReports,
        canManageStudies,
        clinicRole,
        createdAt,
        email,
        firstName,
        hasDashboardAccess,
        invitedSource,
        lastLoginAt,
        lastName,
        level,
        userId,
        middleName,
        npiNumber,
        phoneNumber,
        suffix1,
        suffix2,
        mutableMapOf(),
    )

    /**
     * Whether the user can generate and sign radiology reports. Requires NPI number
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canCreateReports(): Boolean = canCreateReports.getRequired("canCreateReports")

    /**
     * Whether the user has permission to create, update, and manage studies
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canManageStudies(): Boolean = canManageStudies.getRequired("canManageStudies")

    /**
     * A user's clinical or organizational role within the clinic.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicRole(): ClinicRole = clinicRole.getRequired("clinicRole")

    /**
     * Timestamp when the user was created
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * User's email address for login and notifications
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * User's first name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("firstName")

    /**
     * Whether the user can access the dashboard interface. Required for admin users
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasDashboardAccess(): Boolean = hasDashboardAccess.getRequired("hasDashboardAccess")

    /**
     * How a user/invitation was created - via the dashboard UI ('dashboard') or the API ('api').
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitedSource(): InvitedSource = invitedSource.getRequired("invitedSource")

    /**
     * Timestamp of user's last login, null if never logged in
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastLoginAt(): Optional<OffsetDateTime> = lastLoginAt.getOptional("lastLoginAt")

    /**
     * User's last name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("lastName")

    /**
     * User access level. 'owner' has full control (dashboard-only, not assignable via API), 'admin'
     * can manage users/settings, 'member' has standard access.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun level(): UserLevel = level.getRequired("level")

    /**
     * Unique user identifier. Format: usr_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    /**
     * User's middle name (optional)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun middleName(): Optional<String> = middleName.getOptional("middleName")

    /**
     * National Provider Identifier - required for users who can create reports (10-digit number)
     *
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Unlike [hasDashboardAccess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hasDashboardAccess")
    @ExcludeMissing
    fun _hasDashboardAccess(): JsonField<Boolean> = hasDashboardAccess

    /**
     * Returns the raw JSON value of [invitedSource].
     *
     * Unlike [invitedSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invitedSource")
    @ExcludeMissing
    fun _invitedSource(): JsonField<InvitedSource> = invitedSource

    /**
     * Returns the raw JSON value of [lastLoginAt].
     *
     * Unlike [lastLoginAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastLoginAt")
    @ExcludeMissing
    fun _lastLoginAt(): JsonField<OffsetDateTime> = lastLoginAt

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
    @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<UserLevel> = level

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [middleName].
     *
     * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("middleName") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

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
    @JsonProperty("phoneNumber") @ExcludeMissing fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * Returns a mutable builder for constructing an instance of [UserRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .canCreateReports()
         * .canManageStudies()
         * .clinicRole()
         * .createdAt()
         * .email()
         * .firstName()
         * .hasDashboardAccess()
         * .invitedSource()
         * .lastLoginAt()
         * .lastName()
         * .level()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserRetrieveResponse]. */
    class Builder internal constructor() {

        private var canCreateReports: JsonField<Boolean>? = null
        private var canManageStudies: JsonField<Boolean>? = null
        private var clinicRole: JsonField<ClinicRole>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var hasDashboardAccess: JsonField<Boolean>? = null
        private var invitedSource: JsonField<InvitedSource>? = null
        private var lastLoginAt: JsonField<OffsetDateTime>? = null
        private var lastName: JsonField<String>? = null
        private var level: JsonField<UserLevel>? = null
        private var userId: JsonField<String>? = null
        private var middleName: JsonField<String> = JsonMissing.of()
        private var npiNumber: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var suffix1: JsonField<String> = JsonMissing.of()
        private var suffix2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userRetrieveResponse: UserRetrieveResponse) = apply {
            canCreateReports = userRetrieveResponse.canCreateReports
            canManageStudies = userRetrieveResponse.canManageStudies
            clinicRole = userRetrieveResponse.clinicRole
            createdAt = userRetrieveResponse.createdAt
            email = userRetrieveResponse.email
            firstName = userRetrieveResponse.firstName
            hasDashboardAccess = userRetrieveResponse.hasDashboardAccess
            invitedSource = userRetrieveResponse.invitedSource
            lastLoginAt = userRetrieveResponse.lastLoginAt
            lastName = userRetrieveResponse.lastName
            level = userRetrieveResponse.level
            userId = userRetrieveResponse.userId
            middleName = userRetrieveResponse.middleName
            npiNumber = userRetrieveResponse.npiNumber
            phoneNumber = userRetrieveResponse.phoneNumber
            suffix1 = userRetrieveResponse.suffix1
            suffix2 = userRetrieveResponse.suffix2
            additionalProperties = userRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Whether the user can generate and sign radiology reports. Requires NPI number */
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

        /** Whether the user has permission to create, update, and manage studies */
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
        fun clinicRole(clinicRole: JsonField<ClinicRole>) = apply { this.clinicRole = clinicRole }

        /** Timestamp when the user was created */
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

        /** User's email address for login and notifications */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

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

        /** Whether the user can access the dashboard interface. Required for admin users */
        fun hasDashboardAccess(hasDashboardAccess: Boolean) =
            hasDashboardAccess(JsonField.of(hasDashboardAccess))

        /**
         * Sets [Builder.hasDashboardAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasDashboardAccess] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasDashboardAccess(hasDashboardAccess: JsonField<Boolean>) = apply {
            this.hasDashboardAccess = hasDashboardAccess
        }

        /**
         * How a user/invitation was created - via the dashboard UI ('dashboard') or the API
         * ('api').
         */
        fun invitedSource(invitedSource: InvitedSource) = invitedSource(JsonField.of(invitedSource))

        /**
         * Sets [Builder.invitedSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitedSource] with a well-typed [InvitedSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invitedSource(invitedSource: JsonField<InvitedSource>) = apply {
            this.invitedSource = invitedSource
        }

        /** Timestamp of user's last login, null if never logged in */
        fun lastLoginAt(lastLoginAt: OffsetDateTime?) =
            lastLoginAt(JsonField.ofNullable(lastLoginAt))

        /** Alias for calling [Builder.lastLoginAt] with `lastLoginAt.orElse(null)`. */
        fun lastLoginAt(lastLoginAt: Optional<OffsetDateTime>) =
            lastLoginAt(lastLoginAt.getOrNull())

        /**
         * Sets [Builder.lastLoginAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastLoginAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastLoginAt(lastLoginAt: JsonField<OffsetDateTime>) = apply {
            this.lastLoginAt = lastLoginAt
        }

        /** User's last name */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * User access level. 'owner' has full control (dashboard-only, not assignable via API),
         * 'admin' can manage users/settings, 'member' has standard access.
         */
        fun level(level: UserLevel) = level(JsonField.of(level))

        /**
         * Sets [Builder.level] to an arbitrary JSON value.
         *
         * You should usually call [Builder.level] with a well-typed [UserLevel] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun level(level: JsonField<UserLevel>) = apply { this.level = level }

        /** Unique user identifier. Format: usr_{32-hex-chars} */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** User's middle name (optional) */
        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /**
         * Sets [Builder.middleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.middleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        /**
         * National Provider Identifier - required for users who can create reports (10-digit
         * number)
         */
        fun npiNumber(npiNumber: String) = npiNumber(JsonField.of(npiNumber))

        /**
         * Sets [Builder.npiNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.npiNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun npiNumber(npiNumber: JsonField<String>) = apply { this.npiNumber = npiNumber }

        /** User's phone number (10-15 digits, optional) */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Name suffix (e.g., 'Jr.', 'Sr.', 'III') - optional */
        fun suffix1(suffix1: String) = suffix1(JsonField.of(suffix1))

        /**
         * Sets [Builder.suffix1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

        /** Additional name suffix (optional) */
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
         * Returns an immutable instance of [UserRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canCreateReports()
         * .canManageStudies()
         * .clinicRole()
         * .createdAt()
         * .email()
         * .firstName()
         * .hasDashboardAccess()
         * .invitedSource()
         * .lastLoginAt()
         * .lastName()
         * .level()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserRetrieveResponse =
            UserRetrieveResponse(
                checkRequired("canCreateReports", canCreateReports),
                checkRequired("canManageStudies", canManageStudies),
                checkRequired("clinicRole", clinicRole),
                checkRequired("createdAt", createdAt),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("hasDashboardAccess", hasDashboardAccess),
                checkRequired("invitedSource", invitedSource),
                checkRequired("lastLoginAt", lastLoginAt),
                checkRequired("lastName", lastName),
                checkRequired("level", level),
                checkRequired("userId", userId),
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws AvaraInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): UserRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        canCreateReports()
        canManageStudies()
        clinicRole().validate()
        createdAt()
        email()
        firstName()
        hasDashboardAccess()
        invitedSource().validate()
        lastLoginAt()
        lastName()
        level().validate()
        userId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (canCreateReports.asKnown().isPresent) 1 else 0) +
            (if (canManageStudies.asKnown().isPresent) 1 else 0) +
            (clinicRole.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (hasDashboardAccess.asKnown().isPresent) 1 else 0) +
            (invitedSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lastLoginAt.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (level.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (middleName.asKnown().isPresent) 1 else 0) +
            (if (npiNumber.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (suffix1.asKnown().isPresent) 1 else 0) +
            (if (suffix2.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserRetrieveResponse &&
            canCreateReports == other.canCreateReports &&
            canManageStudies == other.canManageStudies &&
            clinicRole == other.clinicRole &&
            createdAt == other.createdAt &&
            email == other.email &&
            firstName == other.firstName &&
            hasDashboardAccess == other.hasDashboardAccess &&
            invitedSource == other.invitedSource &&
            lastLoginAt == other.lastLoginAt &&
            lastName == other.lastName &&
            level == other.level &&
            userId == other.userId &&
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
            createdAt,
            email,
            firstName,
            hasDashboardAccess,
            invitedSource,
            lastLoginAt,
            lastName,
            level,
            userId,
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
        "UserRetrieveResponse{canCreateReports=$canCreateReports, canManageStudies=$canManageStudies, clinicRole=$clinicRole, createdAt=$createdAt, email=$email, firstName=$firstName, hasDashboardAccess=$hasDashboardAccess, invitedSource=$invitedSource, lastLoginAt=$lastLoginAt, lastName=$lastName, level=$level, userId=$userId, middleName=$middleName, npiNumber=$npiNumber, phoneNumber=$phoneNumber, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
}
