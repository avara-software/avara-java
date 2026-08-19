// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.users.invitations

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkRequired
import com.avarasoftware.errors.AvaraInvalidDataException
import com.avarasoftware.models.ClinicRole
import com.avarasoftware.models.InvitationStatus
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

/** A pending user invitation in the AutoScribe system */
class InvitationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val canCreateReports: JsonField<Boolean>,
    private val canManageStudies: JsonField<Boolean>,
    private val clinicId: JsonField<String>,
    private val clinicRole: JsonField<ClinicRole>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val expiry: JsonField<OffsetDateTime>,
    private val firstName: JsonField<String>,
    private val hasDashboardAccess: JsonField<Boolean>,
    private val invitationId: JsonField<String>,
    private val invitedSource: JsonField<InvitedSource>,
    private val inviterId: JsonField<String>,
    private val lastName: JsonField<String>,
    private val level: JsonField<UserLevel>,
    private val status: JsonField<InvitationStatus>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val invitedByApiKeyId: JsonField<String>,
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
        @JsonProperty("clinicId") @ExcludeMissing clinicId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clinicRole")
        @ExcludeMissing
        clinicRole: JsonField<ClinicRole> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiry")
        @ExcludeMissing
        expiry: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hasDashboardAccess")
        @ExcludeMissing
        hasDashboardAccess: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("invitationId")
        @ExcludeMissing
        invitationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invitedSource")
        @ExcludeMissing
        invitedSource: JsonField<InvitedSource> = JsonMissing.of(),
        @JsonProperty("inviterId") @ExcludeMissing inviterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("level") @ExcludeMissing level: JsonField<UserLevel> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<InvitationStatus> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invitedByApiKeyId")
        @ExcludeMissing
        invitedByApiKeyId: JsonField<String> = JsonMissing.of(),
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
        clinicId,
        clinicRole,
        createdAt,
        email,
        expiry,
        firstName,
        hasDashboardAccess,
        invitationId,
        invitedSource,
        inviterId,
        lastName,
        level,
        status,
        updatedAt,
        userId,
        invitedByApiKeyId,
        middleName,
        npiNumber,
        phoneNumber,
        suffix1,
        suffix2,
        mutableMapOf(),
    )

    /**
     * Whether the invited user can generate and sign radiology reports. Requires NPI number
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canCreateReports(): Boolean = canCreateReports.getRequired("canCreateReports")

    /**
     * Whether the invited user will have permission to create, update, and manage studies
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canManageStudies(): Boolean = canManageStudies.getRequired("canManageStudies")

    /**
     * UUID of the clinic this invitation belongs to
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicId(): String = clinicId.getRequired("clinicId")

    /**
     * A user's clinical or organizational role within the clinic.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clinicRole(): ClinicRole = clinicRole.getRequired("clinicRole")

    /**
     * Timestamp when the invitation was created
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Email address the invitation was sent to
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * When the invitation expires, null if no expiration
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiry(): Optional<OffsetDateTime> = expiry.getOptional("expiry")

    /**
     * Invited user's first name
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("firstName")

    /**
     * Whether the invited user will have dashboard access
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasDashboardAccess(): Boolean = hasDashboardAccess.getRequired("hasDashboardAccess")

    /**
     * Unique invitation identifier. Format: inv_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitationId(): String = invitationId.getRequired("invitationId")

    /**
     * How a user/invitation was created - via the dashboard UI ('dashboard') or the API ('api').
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitedSource(): InvitedSource = invitedSource.getRequired("invitedSource")

    /**
     * User ID of the person who sent the invitation. Format: usr_{32-hex-chars}. Null if invited
     * via API
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inviterId(): String = inviterId.getRequired("inviterId")

    /**
     * Invited user's last name
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
     * Lifecycle status of an invitation: 'sent', 'accepted', 'rejected', or 'revoked'.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): InvitationStatus = status.getRequired("status")

    /**
     * Timestamp when the invitation was last updated
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Pre-generated user ID for this invitation. Format: usr_{32-hex-chars}. This ID is assigned at
     * invitation creation and will become the user's permanent ID upon acceptance
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    /**
     * UUID of the API key used to send this invitation. Null if sent via dashboard
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invitedByApiKeyId(): Optional<String> = invitedByApiKeyId.getOptional("invitedByApiKeyId")

    /**
     * Invited user's middle name (optional)
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
     * Invited user's phone number (optional)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phoneNumber")

    /**
     * Name suffix (e.g., 'Jr.', 'MD') - optional
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suffix1(): Optional<String> = suffix1.getOptional("suffix1")

    /**
     * Additional name suffix - optional
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
     * Returns the raw JSON value of [clinicId].
     *
     * Unlike [clinicId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clinicId") @ExcludeMissing fun _clinicId(): JsonField<String> = clinicId

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
     * Returns the raw JSON value of [expiry].
     *
     * Unlike [expiry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry") @ExcludeMissing fun _expiry(): JsonField<OffsetDateTime> = expiry

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
     * Returns the raw JSON value of [invitationId].
     *
     * Unlike [invitationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invitationId")
    @ExcludeMissing
    fun _invitationId(): JsonField<String> = invitationId

    /**
     * Returns the raw JSON value of [invitedSource].
     *
     * Unlike [invitedSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invitedSource")
    @ExcludeMissing
    fun _invitedSource(): JsonField<InvitedSource> = invitedSource

    /**
     * Returns the raw JSON value of [inviterId].
     *
     * Unlike [inviterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inviterId") @ExcludeMissing fun _inviterId(): JsonField<String> = inviterId

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<InvitationStatus> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [invitedByApiKeyId].
     *
     * Unlike [invitedByApiKeyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invitedByApiKeyId")
    @ExcludeMissing
    fun _invitedByApiKeyId(): JsonField<String> = invitedByApiKeyId

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
         * Returns a mutable builder for constructing an instance of [InvitationListResponse].
         *
         * The following fields are required:
         * ```java
         * .canCreateReports()
         * .canManageStudies()
         * .clinicId()
         * .clinicRole()
         * .createdAt()
         * .email()
         * .expiry()
         * .firstName()
         * .hasDashboardAccess()
         * .invitationId()
         * .invitedSource()
         * .inviterId()
         * .lastName()
         * .level()
         * .status()
         * .updatedAt()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationListResponse]. */
    class Builder internal constructor() {

        private var canCreateReports: JsonField<Boolean>? = null
        private var canManageStudies: JsonField<Boolean>? = null
        private var clinicId: JsonField<String>? = null
        private var clinicRole: JsonField<ClinicRole>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var email: JsonField<String>? = null
        private var expiry: JsonField<OffsetDateTime>? = null
        private var firstName: JsonField<String>? = null
        private var hasDashboardAccess: JsonField<Boolean>? = null
        private var invitationId: JsonField<String>? = null
        private var invitedSource: JsonField<InvitedSource>? = null
        private var inviterId: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var level: JsonField<UserLevel>? = null
        private var status: JsonField<InvitationStatus>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var invitedByApiKeyId: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var npiNumber: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var suffix1: JsonField<String> = JsonMissing.of()
        private var suffix2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitationListResponse: InvitationListResponse) = apply {
            canCreateReports = invitationListResponse.canCreateReports
            canManageStudies = invitationListResponse.canManageStudies
            clinicId = invitationListResponse.clinicId
            clinicRole = invitationListResponse.clinicRole
            createdAt = invitationListResponse.createdAt
            email = invitationListResponse.email
            expiry = invitationListResponse.expiry
            firstName = invitationListResponse.firstName
            hasDashboardAccess = invitationListResponse.hasDashboardAccess
            invitationId = invitationListResponse.invitationId
            invitedSource = invitationListResponse.invitedSource
            inviterId = invitationListResponse.inviterId
            lastName = invitationListResponse.lastName
            level = invitationListResponse.level
            status = invitationListResponse.status
            updatedAt = invitationListResponse.updatedAt
            userId = invitationListResponse.userId
            invitedByApiKeyId = invitationListResponse.invitedByApiKeyId
            middleName = invitationListResponse.middleName
            npiNumber = invitationListResponse.npiNumber
            phoneNumber = invitationListResponse.phoneNumber
            suffix1 = invitationListResponse.suffix1
            suffix2 = invitationListResponse.suffix2
            additionalProperties = invitationListResponse.additionalProperties.toMutableMap()
        }

        /** Whether the invited user can generate and sign radiology reports. Requires NPI number */
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

        /** Whether the invited user will have permission to create, update, and manage studies */
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

        /** UUID of the clinic this invitation belongs to */
        fun clinicId(clinicId: String) = clinicId(JsonField.of(clinicId))

        /**
         * Sets [Builder.clinicId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clinicId(clinicId: JsonField<String>) = apply { this.clinicId = clinicId }

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

        /** Timestamp when the invitation was created */
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

        /** Email address the invitation was sent to */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** When the invitation expires, null if no expiration */
        fun expiry(expiry: OffsetDateTime?) = expiry(JsonField.ofNullable(expiry))

        /** Alias for calling [Builder.expiry] with `expiry.orElse(null)`. */
        fun expiry(expiry: Optional<OffsetDateTime>) = expiry(expiry.getOrNull())

        /**
         * Sets [Builder.expiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiry] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiry(expiry: JsonField<OffsetDateTime>) = apply { this.expiry = expiry }

        /** Invited user's first name */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** Whether the invited user will have dashboard access */
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

        /** Unique invitation identifier. Format: inv_{32-hex-chars} */
        fun invitationId(invitationId: String) = invitationId(JsonField.of(invitationId))

        /**
         * Sets [Builder.invitationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invitationId(invitationId: JsonField<String>) = apply {
            this.invitationId = invitationId
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

        /**
         * User ID of the person who sent the invitation. Format: usr_{32-hex-chars}. Null if
         * invited via API
         */
        fun inviterId(inviterId: String) = inviterId(JsonField.of(inviterId))

        /**
         * Sets [Builder.inviterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inviterId(inviterId: JsonField<String>) = apply { this.inviterId = inviterId }

        /** Invited user's last name */
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

        /** Lifecycle status of an invitation: 'sent', 'accepted', 'rejected', or 'revoked'. */
        fun status(status: InvitationStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [InvitationStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<InvitationStatus>) = apply { this.status = status }

        /** Timestamp when the invitation was last updated */
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

        /**
         * Pre-generated user ID for this invitation. Format: usr_{32-hex-chars}. This ID is
         * assigned at invitation creation and will become the user's permanent ID upon acceptance
         */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** UUID of the API key used to send this invitation. Null if sent via dashboard */
        fun invitedByApiKeyId(invitedByApiKeyId: String) =
            invitedByApiKeyId(JsonField.of(invitedByApiKeyId))

        /**
         * Sets [Builder.invitedByApiKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitedByApiKeyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invitedByApiKeyId(invitedByApiKeyId: JsonField<String>) = apply {
            this.invitedByApiKeyId = invitedByApiKeyId
        }

        /** Invited user's middle name (optional) */
        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /** Alias for calling [Builder.middleName] with `middleName.orElse(null)`. */
        fun middleName(middleName: Optional<String>) = middleName(middleName.getOrNull())

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

        /** Invited user's phone number (optional) */
        fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /** Name suffix (e.g., 'Jr.', 'MD') - optional */
        fun suffix1(suffix1: String?) = suffix1(JsonField.ofNullable(suffix1))

        /** Alias for calling [Builder.suffix1] with `suffix1.orElse(null)`. */
        fun suffix1(suffix1: Optional<String>) = suffix1(suffix1.getOrNull())

        /**
         * Sets [Builder.suffix1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffix1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

        /** Additional name suffix - optional */
        fun suffix2(suffix2: String?) = suffix2(JsonField.ofNullable(suffix2))

        /** Alias for calling [Builder.suffix2] with `suffix2.orElse(null)`. */
        fun suffix2(suffix2: Optional<String>) = suffix2(suffix2.getOrNull())

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
         * Returns an immutable instance of [InvitationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canCreateReports()
         * .canManageStudies()
         * .clinicId()
         * .clinicRole()
         * .createdAt()
         * .email()
         * .expiry()
         * .firstName()
         * .hasDashboardAccess()
         * .invitationId()
         * .invitedSource()
         * .inviterId()
         * .lastName()
         * .level()
         * .status()
         * .updatedAt()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvitationListResponse =
            InvitationListResponse(
                checkRequired("canCreateReports", canCreateReports),
                checkRequired("canManageStudies", canManageStudies),
                checkRequired("clinicId", clinicId),
                checkRequired("clinicRole", clinicRole),
                checkRequired("createdAt", createdAt),
                checkRequired("email", email),
                checkRequired("expiry", expiry),
                checkRequired("firstName", firstName),
                checkRequired("hasDashboardAccess", hasDashboardAccess),
                checkRequired("invitationId", invitationId),
                checkRequired("invitedSource", invitedSource),
                checkRequired("inviterId", inviterId),
                checkRequired("lastName", lastName),
                checkRequired("level", level),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                checkRequired("userId", userId),
                invitedByApiKeyId,
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
    fun validate(): InvitationListResponse = apply {
        if (validated) {
            return@apply
        }

        canCreateReports()
        canManageStudies()
        clinicId()
        clinicRole().validate()
        createdAt()
        email()
        expiry()
        firstName()
        hasDashboardAccess()
        invitationId()
        invitedSource().validate()
        inviterId()
        lastName()
        level().validate()
        status().validate()
        updatedAt()
        userId()
        invitedByApiKeyId()
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
            (if (clinicId.asKnown().isPresent) 1 else 0) +
            (clinicRole.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (expiry.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (hasDashboardAccess.asKnown().isPresent) 1 else 0) +
            (if (invitationId.asKnown().isPresent) 1 else 0) +
            (invitedSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (inviterId.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (level.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (invitedByApiKeyId.asKnown().isPresent) 1 else 0) +
            (if (middleName.asKnown().isPresent) 1 else 0) +
            (if (npiNumber.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (suffix1.asKnown().isPresent) 1 else 0) +
            (if (suffix2.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationListResponse &&
            canCreateReports == other.canCreateReports &&
            canManageStudies == other.canManageStudies &&
            clinicId == other.clinicId &&
            clinicRole == other.clinicRole &&
            createdAt == other.createdAt &&
            email == other.email &&
            expiry == other.expiry &&
            firstName == other.firstName &&
            hasDashboardAccess == other.hasDashboardAccess &&
            invitationId == other.invitationId &&
            invitedSource == other.invitedSource &&
            inviterId == other.inviterId &&
            lastName == other.lastName &&
            level == other.level &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            invitedByApiKeyId == other.invitedByApiKeyId &&
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
            clinicId,
            clinicRole,
            createdAt,
            email,
            expiry,
            firstName,
            hasDashboardAccess,
            invitationId,
            invitedSource,
            inviterId,
            lastName,
            level,
            status,
            updatedAt,
            userId,
            invitedByApiKeyId,
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
        "InvitationListResponse{canCreateReports=$canCreateReports, canManageStudies=$canManageStudies, clinicId=$clinicId, clinicRole=$clinicRole, createdAt=$createdAt, email=$email, expiry=$expiry, firstName=$firstName, hasDashboardAccess=$hasDashboardAccess, invitationId=$invitationId, invitedSource=$invitedSource, inviterId=$inviterId, lastName=$lastName, level=$level, status=$status, updatedAt=$updatedAt, userId=$userId, invitedByApiKeyId=$invitedByApiKeyId, middleName=$middleName, npiNumber=$npiNumber, phoneNumber=$phoneNumber, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
}
