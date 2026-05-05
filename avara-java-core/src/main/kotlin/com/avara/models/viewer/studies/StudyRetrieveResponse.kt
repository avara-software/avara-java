// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.studies

import com.avara.core.Enum
import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.ApiKeyReference
import com.avara.models.ExpressCustomerReference
import com.avara.models.UserReference
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A study entity in the Viewer system with viewing status */
class StudyRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cancelledAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isCancelled: JsonField<Boolean>,
    private val severity: JsonField<Severity>,
    private val studyDescription: JsonField<String>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val studyViewerStatus: JsonField<StudyViewerStatus>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val assignedTo: JsonField<UserReference>,
    private val createdByApiKey: JsonField<ApiKeyReference>,
    private val createdByUser: JsonField<UserReference>,
    private val expressCustomer: JsonField<ExpressCustomerReference>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cancelledAt")
        @ExcludeMissing
        cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isCancelled")
        @ExcludeMissing
        isCancelled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<Severity> = JsonMissing.of(),
        @JsonProperty("studyDescription")
        @ExcludeMissing
        studyDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyViewerStatus")
        @ExcludeMissing
        studyViewerStatus: JsonField<StudyViewerStatus> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("assignedTo")
        @ExcludeMissing
        assignedTo: JsonField<UserReference> = JsonMissing.of(),
        @JsonProperty("createdByApiKey")
        @ExcludeMissing
        createdByApiKey: JsonField<ApiKeyReference> = JsonMissing.of(),
        @JsonProperty("createdByUser")
        @ExcludeMissing
        createdByUser: JsonField<UserReference> = JsonMissing.of(),
        @JsonProperty("expressCustomer")
        @ExcludeMissing
        expressCustomer: JsonField<ExpressCustomerReference> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        cancelledAt,
        createdAt,
        isCancelled,
        severity,
        studyDescription,
        studyId,
        studyInstanceUid,
        studyViewerStatus,
        updatedAt,
        assignedTo,
        createdByApiKey,
        createdByUser,
        expressCustomer,
        metadata,
        mutableMapOf(),
    )

    /**
     * Timestamp when the study was cancelled, null if not cancelled
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancelledAt(): Optional<OffsetDateTime> = cancelledAt.getOptional("cancelledAt")

    /**
     * Timestamp when the study was created
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Whether the study has been cancelled
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCancelled(): Boolean = isCancelled.getRequired("isCancelled")

    /**
     * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun severity(): Severity = severity.getRequired("severity")

    /**
     * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyDescription(): String = studyDescription.getRequired("studyDescription")

    /**
     * Unique study identifier. Format: stu_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyId(): String = studyId.getRequired("studyId")

    /**
     * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
     * '1.2.840.10008.5.1.4.1.1.2')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyViewerStatus(): StudyViewerStatus = studyViewerStatus.getRequired("studyViewerStatus")

    /**
     * Timestamp when the study was last updated
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * A reference to a user with basic identifying information
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<UserReference> = assignedTo.getOptional("assignedTo")

    /**
     * A reference to an API key with basic identifying information
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByApiKey(): Optional<ApiKeyReference> =
        createdByApiKey.getOptional("createdByApiKey")

    /**
     * A reference to a user with basic identifying information
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUser(): Optional<UserReference> = createdByUser.getOptional("createdByUser")

    /**
     * A reference to an Express customer with basic identifying information
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomer(): Optional<ExpressCustomerReference> =
        expressCustomer.getOptional("expressCustomer")

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Returns the raw JSON value of [cancelledAt].
     *
     * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelledAt")
    @ExcludeMissing
    fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [isCancelled].
     *
     * Unlike [isCancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCancelled")
    @ExcludeMissing
    fun _isCancelled(): JsonField<Boolean> = isCancelled

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

    /**
     * Returns the raw JSON value of [studyDescription].
     *
     * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyDescription")
    @ExcludeMissing
    fun _studyDescription(): JsonField<String> = studyDescription

    /**
     * Returns the raw JSON value of [studyId].
     *
     * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studyId") @ExcludeMissing fun _studyId(): JsonField<String> = studyId

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyInstanceUid")
    @ExcludeMissing
    fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

    /**
     * Returns the raw JSON value of [studyViewerStatus].
     *
     * Unlike [studyViewerStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyViewerStatus")
    @ExcludeMissing
    fun _studyViewerStatus(): JsonField<StudyViewerStatus> = studyViewerStatus

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [assignedTo].
     *
     * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assignedTo")
    @ExcludeMissing
    fun _assignedTo(): JsonField<UserReference> = assignedTo

    /**
     * Returns the raw JSON value of [createdByApiKey].
     *
     * Unlike [createdByApiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByApiKey")
    @ExcludeMissing
    fun _createdByApiKey(): JsonField<ApiKeyReference> = createdByApiKey

    /**
     * Returns the raw JSON value of [createdByUser].
     *
     * Unlike [createdByUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByUser")
    @ExcludeMissing
    fun _createdByUser(): JsonField<UserReference> = createdByUser

    /**
     * Returns the raw JSON value of [expressCustomer].
     *
     * Unlike [expressCustomer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expressCustomer")
    @ExcludeMissing
    fun _expressCustomer(): JsonField<ExpressCustomerReference> = expressCustomer

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
         * Returns a mutable builder for constructing an instance of [StudyRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .cancelledAt()
         * .createdAt()
         * .isCancelled()
         * .severity()
         * .studyDescription()
         * .studyId()
         * .studyInstanceUid()
         * .studyViewerStatus()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyRetrieveResponse]. */
    class Builder internal constructor() {

        private var cancelledAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isCancelled: JsonField<Boolean>? = null
        private var severity: JsonField<Severity>? = null
        private var studyDescription: JsonField<String>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var studyViewerStatus: JsonField<StudyViewerStatus>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var assignedTo: JsonField<UserReference> = JsonMissing.of()
        private var createdByApiKey: JsonField<ApiKeyReference> = JsonMissing.of()
        private var createdByUser: JsonField<UserReference> = JsonMissing.of()
        private var expressCustomer: JsonField<ExpressCustomerReference> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyRetrieveResponse: StudyRetrieveResponse) = apply {
            cancelledAt = studyRetrieveResponse.cancelledAt
            createdAt = studyRetrieveResponse.createdAt
            isCancelled = studyRetrieveResponse.isCancelled
            severity = studyRetrieveResponse.severity
            studyDescription = studyRetrieveResponse.studyDescription
            studyId = studyRetrieveResponse.studyId
            studyInstanceUid = studyRetrieveResponse.studyInstanceUid
            studyViewerStatus = studyRetrieveResponse.studyViewerStatus
            updatedAt = studyRetrieveResponse.updatedAt
            assignedTo = studyRetrieveResponse.assignedTo
            createdByApiKey = studyRetrieveResponse.createdByApiKey
            createdByUser = studyRetrieveResponse.createdByUser
            expressCustomer = studyRetrieveResponse.expressCustomer
            metadata = studyRetrieveResponse.metadata
            additionalProperties = studyRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp when the study was cancelled, null if not cancelled */
        fun cancelledAt(cancelledAt: OffsetDateTime?) =
            cancelledAt(JsonField.ofNullable(cancelledAt))

        /** Alias for calling [Builder.cancelledAt] with `cancelledAt.orElse(null)`. */
        fun cancelledAt(cancelledAt: Optional<OffsetDateTime>) =
            cancelledAt(cancelledAt.getOrNull())

        /**
         * Sets [Builder.cancelledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
            this.cancelledAt = cancelledAt
        }

        /** Timestamp when the study was created */
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

        /** Whether the study has been cancelled */
        fun isCancelled(isCancelled: Boolean) = isCancelled(JsonField.of(isCancelled))

        /**
         * Sets [Builder.isCancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCancelled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCancelled(isCancelled: JsonField<Boolean>) = apply { this.isCancelled = isCancelled }

        /**
         * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for
         * immediate attention
         */
        fun severity(severity: Severity) = severity(JsonField.of(severity))

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

        /** Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT') */
        fun studyDescription(studyDescription: String) =
            studyDescription(JsonField.of(studyDescription))

        /**
         * Sets [Builder.studyDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyDescription(studyDescription: JsonField<String>) = apply {
            this.studyDescription = studyDescription
        }

        /** Unique study identifier. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String) = studyId(JsonField.of(studyId))

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun studyId(studyId: JsonField<String>) = apply { this.studyId = studyId }

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         */
        fun studyInstanceUid(studyInstanceUid: String) =
            studyInstanceUid(JsonField.of(studyInstanceUid))

        /**
         * Sets [Builder.studyInstanceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyInstanceUid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
            this.studyInstanceUid = studyInstanceUid
        }

        fun studyViewerStatus(studyViewerStatus: StudyViewerStatus) =
            studyViewerStatus(JsonField.of(studyViewerStatus))

        /**
         * Sets [Builder.studyViewerStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyViewerStatus] with a well-typed [StudyViewerStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun studyViewerStatus(studyViewerStatus: JsonField<StudyViewerStatus>) = apply {
            this.studyViewerStatus = studyViewerStatus
        }

        /** Timestamp when the study was last updated */
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

        /** A reference to a user with basic identifying information */
        fun assignedTo(assignedTo: UserReference?) = assignedTo(JsonField.ofNullable(assignedTo))

        /** Alias for calling [Builder.assignedTo] with `assignedTo.orElse(null)`. */
        fun assignedTo(assignedTo: Optional<UserReference>) = assignedTo(assignedTo.getOrNull())

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [UserReference] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun assignedTo(assignedTo: JsonField<UserReference>) = apply {
            this.assignedTo = assignedTo
        }

        /** A reference to an API key with basic identifying information */
        fun createdByApiKey(createdByApiKey: ApiKeyReference?) =
            createdByApiKey(JsonField.ofNullable(createdByApiKey))

        /** Alias for calling [Builder.createdByApiKey] with `createdByApiKey.orElse(null)`. */
        fun createdByApiKey(createdByApiKey: Optional<ApiKeyReference>) =
            createdByApiKey(createdByApiKey.getOrNull())

        /**
         * Sets [Builder.createdByApiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByApiKey] with a well-typed [ApiKeyReference]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun createdByApiKey(createdByApiKey: JsonField<ApiKeyReference>) = apply {
            this.createdByApiKey = createdByApiKey
        }

        /** A reference to a user with basic identifying information */
        fun createdByUser(createdByUser: UserReference?) =
            createdByUser(JsonField.ofNullable(createdByUser))

        /** Alias for calling [Builder.createdByUser] with `createdByUser.orElse(null)`. */
        fun createdByUser(createdByUser: Optional<UserReference>) =
            createdByUser(createdByUser.getOrNull())

        /**
         * Sets [Builder.createdByUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByUser] with a well-typed [UserReference] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdByUser(createdByUser: JsonField<UserReference>) = apply {
            this.createdByUser = createdByUser
        }

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

        /**
         * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values
         * up to 1000 chars
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
         * Returns an immutable instance of [StudyRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cancelledAt()
         * .createdAt()
         * .isCancelled()
         * .severity()
         * .studyDescription()
         * .studyId()
         * .studyInstanceUid()
         * .studyViewerStatus()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyRetrieveResponse =
            StudyRetrieveResponse(
                checkRequired("cancelledAt", cancelledAt),
                checkRequired("createdAt", createdAt),
                checkRequired("isCancelled", isCancelled),
                checkRequired("severity", severity),
                checkRequired("studyDescription", studyDescription),
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                checkRequired("studyViewerStatus", studyViewerStatus),
                checkRequired("updatedAt", updatedAt),
                assignedTo,
                createdByApiKey,
                createdByUser,
                expressCustomer,
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
    fun validate(): StudyRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        cancelledAt()
        createdAt()
        isCancelled()
        severity().validate()
        studyDescription()
        studyId()
        studyInstanceUid()
        studyViewerStatus().validate()
        updatedAt()
        assignedTo().ifPresent { it.validate() }
        createdByApiKey().ifPresent { it.validate() }
        createdByUser().ifPresent { it.validate() }
        expressCustomer().ifPresent { it.validate() }
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
        (if (cancelledAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (isCancelled.asKnown().isPresent) 1 else 0) +
            (severity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (studyDescription.asKnown().isPresent) 1 else 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
            (studyViewerStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (assignedTo.asKnown().getOrNull()?.validity() ?: 0) +
            (createdByApiKey.asKnown().getOrNull()?.validity() ?: 0) +
            (createdByUser.asKnown().getOrNull()?.validity() ?: 0) +
            (expressCustomer.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention
     */
    class Severity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NORMAL = of("normal")

            @JvmField val HIGH = of("high")

            @JvmField val STAT = of("stat")

            @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
        }

        /** An enum containing [Severity]'s known values. */
        enum class Known {
            NORMAL,
            HIGH,
            STAT,
        }

        /**
         * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Severity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            HIGH,
            STAT,
            /** An enum member indicating that [Severity] was instantiated with an unknown value. */
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
                NORMAL -> Value.NORMAL
                HIGH -> Value.HIGH
                STAT -> Value.STAT
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
                NORMAL -> Known.NORMAL
                HIGH -> Known.HIGH
                STAT -> Known.STAT
                else -> throw AvaraInvalidDataException("Unknown Severity: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Severity = apply {
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

            return other is Severity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class StudyViewerStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INCOMPLETE = of("incomplete")

            @JvmField val COMPLETE = of("complete")

            @JvmStatic fun of(value: String) = StudyViewerStatus(JsonField.of(value))
        }

        /** An enum containing [StudyViewerStatus]'s known values. */
        enum class Known {
            INCOMPLETE,
            COMPLETE,
        }

        /**
         * An enum containing [StudyViewerStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StudyViewerStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMPLETE,
            COMPLETE,
            /**
             * An enum member indicating that [StudyViewerStatus] was instantiated with an unknown
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
                INCOMPLETE -> Value.INCOMPLETE
                COMPLETE -> Value.COMPLETE
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
                INCOMPLETE -> Known.INCOMPLETE
                COMPLETE -> Known.COMPLETE
                else -> throw AvaraInvalidDataException("Unknown StudyViewerStatus: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): StudyViewerStatus = apply {
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

            return other is StudyViewerStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
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

        return other is StudyRetrieveResponse &&
            cancelledAt == other.cancelledAt &&
            createdAt == other.createdAt &&
            isCancelled == other.isCancelled &&
            severity == other.severity &&
            studyDescription == other.studyDescription &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            studyViewerStatus == other.studyViewerStatus &&
            updatedAt == other.updatedAt &&
            assignedTo == other.assignedTo &&
            createdByApiKey == other.createdByApiKey &&
            createdByUser == other.createdByUser &&
            expressCustomer == other.expressCustomer &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cancelledAt,
            createdAt,
            isCancelled,
            severity,
            studyDescription,
            studyId,
            studyInstanceUid,
            studyViewerStatus,
            updatedAt,
            assignedTo,
            createdByApiKey,
            createdByUser,
            expressCustomer,
            metadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyRetrieveResponse{cancelledAt=$cancelledAt, createdAt=$createdAt, isCancelled=$isCancelled, severity=$severity, studyDescription=$studyDescription, studyId=$studyId, studyInstanceUid=$studyInstanceUid, studyViewerStatus=$studyViewerStatus, updatedAt=$updatedAt, assignedTo=$assignedTo, createdByApiKey=$createdByApiKey, createdByUser=$createdByUser, expressCustomer=$expressCustomer, metadata=$metadata, additionalProperties=$additionalProperties}"
}
