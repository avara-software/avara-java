// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.users.invitations

import com.avara.core.Enum
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A pending user invitation in the Viewer system */
class InvitationRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
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
    private val level: JsonField<Level>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val invitedByApiKeyId: JsonField<String>,
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
        @JsonProperty("level") @ExcludeMissing level: JsonField<Level> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
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
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
    ) : this(
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
        phoneNumber,
        suffix1,
        suffix2,
        mutableMapOf(),
    )

    /**
     * Whether the invited user will have permission to manage studies
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
     * User's clinical or organizational role
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
     * How the user was invited - via dashboard UI or API
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
     * User access level
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun level(): Level = level.getRequired("level")

    /**
     * Invitation status
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

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
    @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Level> = level

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [InvitationRetrieveResponse].
         *
         * The following fields are required:
         * ```java
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

    /** A builder for [InvitationRetrieveResponse]. */
    class Builder internal constructor() {

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
        private var level: JsonField<Level>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var invitedByApiKeyId: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var suffix1: JsonField<String> = JsonMissing.of()
        private var suffix2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitationRetrieveResponse: InvitationRetrieveResponse) = apply {
            canManageStudies = invitationRetrieveResponse.canManageStudies
            clinicId = invitationRetrieveResponse.clinicId
            clinicRole = invitationRetrieveResponse.clinicRole
            createdAt = invitationRetrieveResponse.createdAt
            email = invitationRetrieveResponse.email
            expiry = invitationRetrieveResponse.expiry
            firstName = invitationRetrieveResponse.firstName
            hasDashboardAccess = invitationRetrieveResponse.hasDashboardAccess
            invitationId = invitationRetrieveResponse.invitationId
            invitedSource = invitationRetrieveResponse.invitedSource
            inviterId = invitationRetrieveResponse.inviterId
            lastName = invitationRetrieveResponse.lastName
            level = invitationRetrieveResponse.level
            status = invitationRetrieveResponse.status
            updatedAt = invitationRetrieveResponse.updatedAt
            userId = invitationRetrieveResponse.userId
            invitedByApiKeyId = invitationRetrieveResponse.invitedByApiKeyId
            middleName = invitationRetrieveResponse.middleName
            phoneNumber = invitationRetrieveResponse.phoneNumber
            suffix1 = invitationRetrieveResponse.suffix1
            suffix2 = invitationRetrieveResponse.suffix2
            additionalProperties = invitationRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Whether the invited user will have permission to manage studies */
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

        /** User's clinical or organizational role */
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

        /** How the user was invited - via dashboard UI or API */
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

        /** User access level */
        fun level(level: Level) = level(JsonField.of(level))

        /**
         * Sets [Builder.level] to an arbitrary JSON value.
         *
         * You should usually call [Builder.level] with a well-typed [Level] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun level(level: JsonField<Level>) = apply { this.level = level }

        /** Invitation status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [InvitationRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
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
        fun build(): InvitationRetrieveResponse =
            InvitationRetrieveResponse(
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
                phoneNumber,
                suffix1,
                suffix2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvitationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

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
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (if (suffix1.asKnown().isPresent) 1 else 0) +
            (if (suffix2.asKnown().isPresent) 1 else 0)

    /** User's clinical or organizational role */
    class ClinicRole @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RADIOLOGIST = of("Radiologist")

            @JvmField val CARDIOLOGIST = of("Cardiologist")

            @JvmField val NEUROLOGIST = of("Neurologist")

            @JvmField val UROLOGIST = of("Urologist")

            @JvmField val GYNECOLOGIST = of("Gynecologist")

            @JvmField val ENDOCRINOLOGIST = of("Endocrinologist")

            @JvmField val DOCTOR = of("Doctor")

            @JvmField val SURGEON = of("Surgeon")

            @JvmField val PHYSICIAN = of("Physician")

            @JvmField val PHYSICIAN_ASSISTANT = of("Physician Assistant")

            @JvmField val NURSE_PRACTITIONER = of("Nurse Practitioner")

            @JvmField val REGISTERED_NURSE = of("Registered Nurse")

            @JvmField val PATIENT_CARE_COORDINATOR = of("Patient Care Coordinator")

            @JvmField val FRONT_DESK_OPERATOR = of("Front Desk Operator")

            @JvmField val IMAGING_TECHNOLOGIST = of("Imaging Technologist")

            @JvmField val PACS_ADMINISTRATOR = of("PACS Administrator")

            @JvmField val SOFTWARE_ENGINEER = of("Software Engineer")

            @JvmField val REVENUE_CYCLE_MANAGER = of("Revenue Cycle Manager")

            @JvmField val ADMINISTRATIVE_DIRECTOR = of("Administrative Director")

            @JvmField val ADMINISTRATIVE_ASSISTANT = of("Administrative Assistant")

            @JvmField val OTHER = of("Other")

            @JvmStatic fun of(value: String) = ClinicRole(JsonField.of(value))
        }

        /** An enum containing [ClinicRole]'s known values. */
        enum class Known {
            RADIOLOGIST,
            CARDIOLOGIST,
            NEUROLOGIST,
            UROLOGIST,
            GYNECOLOGIST,
            ENDOCRINOLOGIST,
            DOCTOR,
            SURGEON,
            PHYSICIAN,
            PHYSICIAN_ASSISTANT,
            NURSE_PRACTITIONER,
            REGISTERED_NURSE,
            PATIENT_CARE_COORDINATOR,
            FRONT_DESK_OPERATOR,
            IMAGING_TECHNOLOGIST,
            PACS_ADMINISTRATOR,
            SOFTWARE_ENGINEER,
            REVENUE_CYCLE_MANAGER,
            ADMINISTRATIVE_DIRECTOR,
            ADMINISTRATIVE_ASSISTANT,
            OTHER,
        }

        /**
         * An enum containing [ClinicRole]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ClinicRole] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RADIOLOGIST,
            CARDIOLOGIST,
            NEUROLOGIST,
            UROLOGIST,
            GYNECOLOGIST,
            ENDOCRINOLOGIST,
            DOCTOR,
            SURGEON,
            PHYSICIAN,
            PHYSICIAN_ASSISTANT,
            NURSE_PRACTITIONER,
            REGISTERED_NURSE,
            PATIENT_CARE_COORDINATOR,
            FRONT_DESK_OPERATOR,
            IMAGING_TECHNOLOGIST,
            PACS_ADMINISTRATOR,
            SOFTWARE_ENGINEER,
            REVENUE_CYCLE_MANAGER,
            ADMINISTRATIVE_DIRECTOR,
            ADMINISTRATIVE_ASSISTANT,
            OTHER,
            /**
             * An enum member indicating that [ClinicRole] was instantiated with an unknown value.
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
                RADIOLOGIST -> Value.RADIOLOGIST
                CARDIOLOGIST -> Value.CARDIOLOGIST
                NEUROLOGIST -> Value.NEUROLOGIST
                UROLOGIST -> Value.UROLOGIST
                GYNECOLOGIST -> Value.GYNECOLOGIST
                ENDOCRINOLOGIST -> Value.ENDOCRINOLOGIST
                DOCTOR -> Value.DOCTOR
                SURGEON -> Value.SURGEON
                PHYSICIAN -> Value.PHYSICIAN
                PHYSICIAN_ASSISTANT -> Value.PHYSICIAN_ASSISTANT
                NURSE_PRACTITIONER -> Value.NURSE_PRACTITIONER
                REGISTERED_NURSE -> Value.REGISTERED_NURSE
                PATIENT_CARE_COORDINATOR -> Value.PATIENT_CARE_COORDINATOR
                FRONT_DESK_OPERATOR -> Value.FRONT_DESK_OPERATOR
                IMAGING_TECHNOLOGIST -> Value.IMAGING_TECHNOLOGIST
                PACS_ADMINISTRATOR -> Value.PACS_ADMINISTRATOR
                SOFTWARE_ENGINEER -> Value.SOFTWARE_ENGINEER
                REVENUE_CYCLE_MANAGER -> Value.REVENUE_CYCLE_MANAGER
                ADMINISTRATIVE_DIRECTOR -> Value.ADMINISTRATIVE_DIRECTOR
                ADMINISTRATIVE_ASSISTANT -> Value.ADMINISTRATIVE_ASSISTANT
                OTHER -> Value.OTHER
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
                RADIOLOGIST -> Known.RADIOLOGIST
                CARDIOLOGIST -> Known.CARDIOLOGIST
                NEUROLOGIST -> Known.NEUROLOGIST
                UROLOGIST -> Known.UROLOGIST
                GYNECOLOGIST -> Known.GYNECOLOGIST
                ENDOCRINOLOGIST -> Known.ENDOCRINOLOGIST
                DOCTOR -> Known.DOCTOR
                SURGEON -> Known.SURGEON
                PHYSICIAN -> Known.PHYSICIAN
                PHYSICIAN_ASSISTANT -> Known.PHYSICIAN_ASSISTANT
                NURSE_PRACTITIONER -> Known.NURSE_PRACTITIONER
                REGISTERED_NURSE -> Known.REGISTERED_NURSE
                PATIENT_CARE_COORDINATOR -> Known.PATIENT_CARE_COORDINATOR
                FRONT_DESK_OPERATOR -> Known.FRONT_DESK_OPERATOR
                IMAGING_TECHNOLOGIST -> Known.IMAGING_TECHNOLOGIST
                PACS_ADMINISTRATOR -> Known.PACS_ADMINISTRATOR
                SOFTWARE_ENGINEER -> Known.SOFTWARE_ENGINEER
                REVENUE_CYCLE_MANAGER -> Known.REVENUE_CYCLE_MANAGER
                ADMINISTRATIVE_DIRECTOR -> Known.ADMINISTRATIVE_DIRECTOR
                ADMINISTRATIVE_ASSISTANT -> Known.ADMINISTRATIVE_ASSISTANT
                OTHER -> Known.OTHER
                else -> throw AvaraInvalidDataException("Unknown ClinicRole: $value")
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

        fun validate(): ClinicRole = apply {
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

            return other is ClinicRole && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** How the user was invited - via dashboard UI or API */
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

    /** User access level */
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

    /** Invitation status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SENT = of("sent")

            @JvmField val ACCEPTED = of("accepted")

            @JvmField val REJECTED = of("rejected")

            @JvmField val REVOKED = of("revoked")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SENT,
            ACCEPTED,
            REJECTED,
            REVOKED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SENT,
            ACCEPTED,
            REJECTED,
            REVOKED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                SENT -> Value.SENT
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                REVOKED -> Value.REVOKED
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
                SENT -> Known.SENT
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                REVOKED -> Known.REVOKED
                else -> throw AvaraInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationRetrieveResponse &&
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
            phoneNumber == other.phoneNumber &&
            suffix1 == other.suffix1 &&
            suffix2 == other.suffix2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
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
            phoneNumber,
            suffix1,
            suffix2,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvitationRetrieveResponse{canManageStudies=$canManageStudies, clinicId=$clinicId, clinicRole=$clinicRole, createdAt=$createdAt, email=$email, expiry=$expiry, firstName=$firstName, hasDashboardAccess=$hasDashboardAccess, invitationId=$invitationId, invitedSource=$invitedSource, inviterId=$inviterId, lastName=$lastName, level=$level, status=$status, updatedAt=$updatedAt, userId=$userId, invitedByApiKeyId=$invitedByApiKeyId, middleName=$middleName, phoneNumber=$phoneNumber, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
}
