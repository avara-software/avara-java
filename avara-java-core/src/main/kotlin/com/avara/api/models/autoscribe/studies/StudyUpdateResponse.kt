// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.studies

import com.avara.api.core.Enum
import com.avara.api.core.ExcludeMissing
import com.avara.api.core.JsonField
import com.avara.api.core.JsonMissing
import com.avara.api.core.JsonValue
import com.avara.api.core.checkKnown
import com.avara.api.core.checkRequired
import com.avara.api.core.toImmutable
import com.avara.api.errors.AvaraInvalidDataException
import com.avara.api.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A study entity in the AutoScribe system with report workflow status */
class StudyUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cancelledAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isCancelled: JsonField<Boolean>,
    private val reportMetadata: JsonField<StudyReportMetadata>,
    private val severity: JsonField<Severity>,
    private val studyDescription: JsonField<String>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val studyReportStatus: JsonField<StudyReportStatus>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val assignedTo: JsonField<AssignedTo>,
    private val createdByApiKey: JsonField<CreatedByApiKey>,
    private val createdByUser: JsonField<CreatedByUser>,
    private val metadata: JsonField<Metadata>,
    private val org: JsonField<Org>,
    private val priorReportTexts: JsonField<List<String>>,
    private val priorStudyIds: JsonField<List<String>>,
    private val reportIds: JsonField<List<ReportIdWithStatus>>,
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
        @JsonProperty("reportMetadata")
        @ExcludeMissing
        reportMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<Severity> = JsonMissing.of(),
        @JsonProperty("studyDescription")
        @ExcludeMissing
        studyDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyReportStatus")
        @ExcludeMissing
        studyReportStatus: JsonField<StudyReportStatus> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("assignedTo")
        @ExcludeMissing
        assignedTo: JsonField<AssignedTo> = JsonMissing.of(),
        @JsonProperty("createdByApiKey")
        @ExcludeMissing
        createdByApiKey: JsonField<CreatedByApiKey> = JsonMissing.of(),
        @JsonProperty("createdByUser")
        @ExcludeMissing
        createdByUser: JsonField<CreatedByUser> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("org") @ExcludeMissing org: JsonField<Org> = JsonMissing.of(),
        @JsonProperty("priorReportTexts")
        @ExcludeMissing
        priorReportTexts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("priorStudyIds")
        @ExcludeMissing
        priorStudyIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("reportIds")
        @ExcludeMissing
        reportIds: JsonField<List<ReportIdWithStatus>> = JsonMissing.of(),
    ) : this(
        cancelledAt,
        createdAt,
        isCancelled,
        reportMetadata,
        severity,
        studyDescription,
        studyId,
        studyInstanceUid,
        studyReportStatus,
        updatedAt,
        assignedTo,
        createdByApiKey,
        createdByUser,
        metadata,
        org,
        priorReportTexts,
        priorStudyIds,
        reportIds,
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
     * Patient demographics and scan information for report generation
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportMetadata(): StudyReportMetadata = reportMetadata.getRequired("reportMetadata")

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
     * Report workflow status. 'unassigned' = no radiologist assigned, 'assigned' = assigned but not
     * started, 'in_progress' = actively being dictated, 'completed' = report signed,
     * 'addendum_active' = addendum in progress
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyReportStatus(): StudyReportStatus = studyReportStatus.getRequired("studyReportStatus")

    /**
     * Timestamp when the study was last updated
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Reference to the assigned radiologist, null if unassigned
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<AssignedTo> = assignedTo.getOptional("assignedTo")

    /**
     * Reference to the API key used to create this study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByApiKey(): Optional<CreatedByApiKey> =
        createdByApiKey.getOptional("createdByApiKey")

    /**
     * Reference to the user who created this study via dashboard
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUser(): Optional<CreatedByUser> = createdByUser.getOptional("createdByUser")

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Reference to the organization this study belongs to
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun org(): Optional<Org> = org.getOptional("org")

    /**
     * Array of prior report texts to provide clinical context
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorReportTexts(): Optional<List<String>> =
        priorReportTexts.getOptional("priorReportTexts")

    /**
     * Array of prior study IDs for comparison context (format: stu_{32-hex-chars})
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorStudyIds(): Optional<List<String>> = priorStudyIds.getOptional("priorStudyIds")

    /**
     * Array of report IDs associated with this study, including addendums
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportIds(): Optional<List<ReportIdWithStatus>> = reportIds.getOptional("reportIds")

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
     * Returns the raw JSON value of [reportMetadata].
     *
     * Unlike [reportMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportMetadata")
    @ExcludeMissing
    fun _reportMetadata(): JsonField<StudyReportMetadata> = reportMetadata

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
     * Returns the raw JSON value of [studyReportStatus].
     *
     * Unlike [studyReportStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("studyReportStatus")
    @ExcludeMissing
    fun _studyReportStatus(): JsonField<StudyReportStatus> = studyReportStatus

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
    fun _assignedTo(): JsonField<AssignedTo> = assignedTo

    /**
     * Returns the raw JSON value of [createdByApiKey].
     *
     * Unlike [createdByApiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByApiKey")
    @ExcludeMissing
    fun _createdByApiKey(): JsonField<CreatedByApiKey> = createdByApiKey

    /**
     * Returns the raw JSON value of [createdByUser].
     *
     * Unlike [createdByUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdByUser")
    @ExcludeMissing
    fun _createdByUser(): JsonField<CreatedByUser> = createdByUser

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [org].
     *
     * Unlike [org], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org") @ExcludeMissing fun _org(): JsonField<Org> = org

    /**
     * Returns the raw JSON value of [priorReportTexts].
     *
     * Unlike [priorReportTexts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("priorReportTexts")
    @ExcludeMissing
    fun _priorReportTexts(): JsonField<List<String>> = priorReportTexts

    /**
     * Returns the raw JSON value of [priorStudyIds].
     *
     * Unlike [priorStudyIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priorStudyIds")
    @ExcludeMissing
    fun _priorStudyIds(): JsonField<List<String>> = priorStudyIds

    /**
     * Returns the raw JSON value of [reportIds].
     *
     * Unlike [reportIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportIds")
    @ExcludeMissing
    fun _reportIds(): JsonField<List<ReportIdWithStatus>> = reportIds

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
         * Returns a mutable builder for constructing an instance of [StudyUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .cancelledAt()
         * .createdAt()
         * .isCancelled()
         * .reportMetadata()
         * .severity()
         * .studyDescription()
         * .studyId()
         * .studyInstanceUid()
         * .studyReportStatus()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyUpdateResponse]. */
    class Builder internal constructor() {

        private var cancelledAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isCancelled: JsonField<Boolean>? = null
        private var reportMetadata: JsonField<StudyReportMetadata>? = null
        private var severity: JsonField<Severity>? = null
        private var studyDescription: JsonField<String>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var studyReportStatus: JsonField<StudyReportStatus>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var assignedTo: JsonField<AssignedTo> = JsonMissing.of()
        private var createdByApiKey: JsonField<CreatedByApiKey> = JsonMissing.of()
        private var createdByUser: JsonField<CreatedByUser> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var org: JsonField<Org> = JsonMissing.of()
        private var priorReportTexts: JsonField<MutableList<String>>? = null
        private var priorStudyIds: JsonField<MutableList<String>>? = null
        private var reportIds: JsonField<MutableList<ReportIdWithStatus>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyUpdateResponse: StudyUpdateResponse) = apply {
            cancelledAt = studyUpdateResponse.cancelledAt
            createdAt = studyUpdateResponse.createdAt
            isCancelled = studyUpdateResponse.isCancelled
            reportMetadata = studyUpdateResponse.reportMetadata
            severity = studyUpdateResponse.severity
            studyDescription = studyUpdateResponse.studyDescription
            studyId = studyUpdateResponse.studyId
            studyInstanceUid = studyUpdateResponse.studyInstanceUid
            studyReportStatus = studyUpdateResponse.studyReportStatus
            updatedAt = studyUpdateResponse.updatedAt
            assignedTo = studyUpdateResponse.assignedTo
            createdByApiKey = studyUpdateResponse.createdByApiKey
            createdByUser = studyUpdateResponse.createdByUser
            metadata = studyUpdateResponse.metadata
            org = studyUpdateResponse.org
            priorReportTexts = studyUpdateResponse.priorReportTexts.map { it.toMutableList() }
            priorStudyIds = studyUpdateResponse.priorStudyIds.map { it.toMutableList() }
            reportIds = studyUpdateResponse.reportIds.map { it.toMutableList() }
            additionalProperties = studyUpdateResponse.additionalProperties.toMutableMap()
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

        /** Patient demographics and scan information for report generation */
        fun reportMetadata(reportMetadata: StudyReportMetadata) =
            reportMetadata(JsonField.of(reportMetadata))

        /**
         * Sets [Builder.reportMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportMetadata] with a well-typed [StudyReportMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reportMetadata(reportMetadata: JsonField<StudyReportMetadata>) = apply {
            this.reportMetadata = reportMetadata
        }

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

        /**
         * Report workflow status. 'unassigned' = no radiologist assigned, 'assigned' = assigned but
         * not started, 'in_progress' = actively being dictated, 'completed' = report signed,
         * 'addendum_active' = addendum in progress
         */
        fun studyReportStatus(studyReportStatus: StudyReportStatus) =
            studyReportStatus(JsonField.of(studyReportStatus))

        /**
         * Sets [Builder.studyReportStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyReportStatus] with a well-typed [StudyReportStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun studyReportStatus(studyReportStatus: JsonField<StudyReportStatus>) = apply {
            this.studyReportStatus = studyReportStatus
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

        /** Reference to the assigned radiologist, null if unassigned */
        fun assignedTo(assignedTo: AssignedTo?) = assignedTo(JsonField.ofNullable(assignedTo))

        /** Alias for calling [Builder.assignedTo] with `assignedTo.orElse(null)`. */
        fun assignedTo(assignedTo: Optional<AssignedTo>) = assignedTo(assignedTo.getOrNull())

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [AssignedTo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun assignedTo(assignedTo: JsonField<AssignedTo>) = apply { this.assignedTo = assignedTo }

        /** Reference to the API key used to create this study */
        fun createdByApiKey(createdByApiKey: CreatedByApiKey?) =
            createdByApiKey(JsonField.ofNullable(createdByApiKey))

        /** Alias for calling [Builder.createdByApiKey] with `createdByApiKey.orElse(null)`. */
        fun createdByApiKey(createdByApiKey: Optional<CreatedByApiKey>) =
            createdByApiKey(createdByApiKey.getOrNull())

        /**
         * Sets [Builder.createdByApiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByApiKey] with a well-typed [CreatedByApiKey]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun createdByApiKey(createdByApiKey: JsonField<CreatedByApiKey>) = apply {
            this.createdByApiKey = createdByApiKey
        }

        /** Reference to the user who created this study via dashboard */
        fun createdByUser(createdByUser: CreatedByUser?) =
            createdByUser(JsonField.ofNullable(createdByUser))

        /** Alias for calling [Builder.createdByUser] with `createdByUser.orElse(null)`. */
        fun createdByUser(createdByUser: Optional<CreatedByUser>) =
            createdByUser(createdByUser.getOrNull())

        /**
         * Sets [Builder.createdByUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByUser] with a well-typed [CreatedByUser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdByUser(createdByUser: JsonField<CreatedByUser>) = apply {
            this.createdByUser = createdByUser
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

        /** Reference to the organization this study belongs to */
        fun org(org: Org?) = org(JsonField.ofNullable(org))

        /** Alias for calling [Builder.org] with `org.orElse(null)`. */
        fun org(org: Optional<Org>) = org(org.getOrNull())

        /**
         * Sets [Builder.org] to an arbitrary JSON value.
         *
         * You should usually call [Builder.org] with a well-typed [Org] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun org(org: JsonField<Org>) = apply { this.org = org }

        /** Array of prior report texts to provide clinical context */
        fun priorReportTexts(priorReportTexts: List<String>) =
            priorReportTexts(JsonField.of(priorReportTexts))

        /**
         * Sets [Builder.priorReportTexts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorReportTexts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priorReportTexts(priorReportTexts: JsonField<List<String>>) = apply {
            this.priorReportTexts = priorReportTexts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [priorReportTexts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorReportText(priorReportText: String) = apply {
            priorReportTexts =
                (priorReportTexts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priorReportTexts", it).add(priorReportText)
                }
        }

        /** Array of prior study IDs for comparison context (format: stu_{32-hex-chars}) */
        fun priorStudyIds(priorStudyIds: List<String>) = priorStudyIds(JsonField.of(priorStudyIds))

        /**
         * Sets [Builder.priorStudyIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorStudyIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priorStudyIds(priorStudyIds: JsonField<List<String>>) = apply {
            this.priorStudyIds = priorStudyIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [priorStudyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorStudyId(priorStudyId: String) = apply {
            priorStudyIds =
                (priorStudyIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priorStudyIds", it).add(priorStudyId)
                }
        }

        /** Array of report IDs associated with this study, including addendums */
        fun reportIds(reportIds: List<ReportIdWithStatus>) = reportIds(JsonField.of(reportIds))

        /**
         * Sets [Builder.reportIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportIds] with a well-typed `List<ReportIdWithStatus>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reportIds(reportIds: JsonField<List<ReportIdWithStatus>>) = apply {
            this.reportIds = reportIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [ReportIdWithStatus] to [reportIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReportId(reportId: ReportIdWithStatus) = apply {
            reportIds =
                (reportIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reportIds", it).add(reportId)
                }
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
         * Returns an immutable instance of [StudyUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cancelledAt()
         * .createdAt()
         * .isCancelled()
         * .reportMetadata()
         * .severity()
         * .studyDescription()
         * .studyId()
         * .studyInstanceUid()
         * .studyReportStatus()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyUpdateResponse =
            StudyUpdateResponse(
                checkRequired("cancelledAt", cancelledAt),
                checkRequired("createdAt", createdAt),
                checkRequired("isCancelled", isCancelled),
                checkRequired("reportMetadata", reportMetadata),
                checkRequired("severity", severity),
                checkRequired("studyDescription", studyDescription),
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                checkRequired("studyReportStatus", studyReportStatus),
                checkRequired("updatedAt", updatedAt),
                assignedTo,
                createdByApiKey,
                createdByUser,
                metadata,
                org,
                (priorReportTexts ?: JsonMissing.of()).map { it.toImmutable() },
                (priorStudyIds ?: JsonMissing.of()).map { it.toImmutable() },
                (reportIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StudyUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        cancelledAt()
        createdAt()
        isCancelled()
        reportMetadata().validate()
        severity().validate()
        studyDescription()
        studyId()
        studyInstanceUid()
        studyReportStatus().validate()
        updatedAt()
        assignedTo().ifPresent { it.validate() }
        createdByApiKey().ifPresent { it.validate() }
        createdByUser().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        org().ifPresent { it.validate() }
        priorReportTexts()
        priorStudyIds()
        reportIds().ifPresent { it.forEach { it.validate() } }
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
            (reportMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (severity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (studyDescription.asKnown().isPresent) 1 else 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
            (studyReportStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (assignedTo.asKnown().getOrNull()?.validity() ?: 0) +
            (createdByApiKey.asKnown().getOrNull()?.validity() ?: 0) +
            (createdByUser.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (org.asKnown().getOrNull()?.validity() ?: 0) +
            (priorReportTexts.asKnown().getOrNull()?.size ?: 0) +
            (priorStudyIds.asKnown().getOrNull()?.size ?: 0) +
            (reportIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

    /**
     * Report workflow status. 'unassigned' = no radiologist assigned, 'assigned' = assigned but not
     * started, 'in_progress' = actively being dictated, 'completed' = report signed,
     * 'addendum_active' = addendum in progress
     */
    class StudyReportStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UNASSIGNED = of("unassigned")

            @JvmField val ASSIGNED = of("assigned")

            @JvmField val IN_PROGRESS = of("in_progress")

            @JvmField val COMPLETED = of("completed")

            @JvmField val ADDENDUM_ACTIVE = of("addendum_active")

            @JvmStatic fun of(value: String) = StudyReportStatus(JsonField.of(value))
        }

        /** An enum containing [StudyReportStatus]'s known values. */
        enum class Known {
            UNASSIGNED,
            ASSIGNED,
            IN_PROGRESS,
            COMPLETED,
            ADDENDUM_ACTIVE,
        }

        /**
         * An enum containing [StudyReportStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StudyReportStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNASSIGNED,
            ASSIGNED,
            IN_PROGRESS,
            COMPLETED,
            ADDENDUM_ACTIVE,
            /**
             * An enum member indicating that [StudyReportStatus] was instantiated with an unknown
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
                UNASSIGNED -> Value.UNASSIGNED
                ASSIGNED -> Value.ASSIGNED
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
                ADDENDUM_ACTIVE -> Value.ADDENDUM_ACTIVE
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
                UNASSIGNED -> Known.UNASSIGNED
                ASSIGNED -> Known.ASSIGNED
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                ADDENDUM_ACTIVE -> Known.ADDENDUM_ACTIVE
                else -> throw AvaraInvalidDataException("Unknown StudyReportStatus: $value")
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

        fun validate(): StudyReportStatus = apply {
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

            return other is StudyReportStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Reference to the assigned radiologist, null if unassigned */
    class AssignedTo
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
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("middleName")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
        ) : this(email, userId, firstName, lastName, middleName, suffix1, suffix2, mutableMapOf())

        /**
         * User's email address
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Unique user identifier. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
        @JsonProperty("middleName")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

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
             * Returns a mutable builder for constructing an instance of [AssignedTo].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AssignedTo]. */
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
            internal fun from(assignedTo: AssignedTo) = apply {
                email = assignedTo.email
                userId = assignedTo.userId
                firstName = assignedTo.firstName
                lastName = assignedTo.lastName
                middleName = assignedTo.middleName
                suffix1 = assignedTo.suffix1
                suffix2 = assignedTo.suffix2
                additionalProperties = assignedTo.additionalProperties.toMutableMap()
            }

            /** User's email address */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Unique user identifier. Format: usr_{32-hex-chars} */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

            /** User's middle name */
            fun middleName(middleName: String) = middleName(JsonField.of(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            /** Name suffix (e.g., 'MD', 'Jr.') */
            fun suffix1(suffix1: String) = suffix1(JsonField.of(suffix1))

            /**
             * Sets [Builder.suffix1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

            /** Additional name suffix */
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
             * Returns an immutable instance of [AssignedTo].
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
            fun build(): AssignedTo =
                AssignedTo(
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

        fun validate(): AssignedTo = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is AssignedTo &&
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
            "AssignedTo{email=$email, userId=$userId, firstName=$firstName, lastName=$lastName, middleName=$middleName, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
    }

    /** Reference to the API key used to create this study */
    class CreatedByApiKey
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiKeyId: JsonField<String>,
        private val description: JsonField<String>,
        private val isViewerEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("apiKeyId")
            @ExcludeMissing
            apiKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isViewerEnabled")
            @ExcludeMissing
            isViewerEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(apiKeyId, description, isViewerEnabled, mutableMapOf())

        /**
         * Unique API key identifier (UUIDv4 format)
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiKeyId(): String = apiKeyId.getRequired("apiKeyId")

        /**
         * Human-readable description of the API key
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * Whether this API key has access to the Viewer product
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isViewerEnabled(): Optional<Boolean> = isViewerEnabled.getOptional("isViewerEnabled")

        /**
         * Returns the raw JSON value of [apiKeyId].
         *
         * Unlike [apiKeyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apiKeyId") @ExcludeMissing fun _apiKeyId(): JsonField<String> = apiKeyId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [isViewerEnabled].
         *
         * Unlike [isViewerEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("isViewerEnabled")
        @ExcludeMissing
        fun _isViewerEnabled(): JsonField<Boolean> = isViewerEnabled

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
             * Returns a mutable builder for constructing an instance of [CreatedByApiKey].
             *
             * The following fields are required:
             * ```java
             * .apiKeyId()
             * .description()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedByApiKey]. */
        class Builder internal constructor() {

            private var apiKeyId: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var isViewerEnabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdByApiKey: CreatedByApiKey) = apply {
                apiKeyId = createdByApiKey.apiKeyId
                description = createdByApiKey.description
                isViewerEnabled = createdByApiKey.isViewerEnabled
                additionalProperties = createdByApiKey.additionalProperties.toMutableMap()
            }

            /** Unique API key identifier (UUIDv4 format) */
            fun apiKeyId(apiKeyId: String) = apiKeyId(JsonField.of(apiKeyId))

            /**
             * Sets [Builder.apiKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKeyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKeyId(apiKeyId: JsonField<String>) = apply { this.apiKeyId = apiKeyId }

            /** Human-readable description of the API key */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Whether this API key has access to the Viewer product */
            fun isViewerEnabled(isViewerEnabled: Boolean) =
                isViewerEnabled(JsonField.of(isViewerEnabled))

            /**
             * Sets [Builder.isViewerEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isViewerEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isViewerEnabled(isViewerEnabled: JsonField<Boolean>) = apply {
                this.isViewerEnabled = isViewerEnabled
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
             * Returns an immutable instance of [CreatedByApiKey].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .apiKeyId()
             * .description()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreatedByApiKey =
                CreatedByApiKey(
                    checkRequired("apiKeyId", apiKeyId),
                    checkRequired("description", description),
                    isViewerEnabled,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreatedByApiKey = apply {
            if (validated) {
                return@apply
            }

            apiKeyId()
            description()
            isViewerEnabled()
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
            (if (apiKeyId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (isViewerEnabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedByApiKey &&
                apiKeyId == other.apiKeyId &&
                description == other.description &&
                isViewerEnabled == other.isViewerEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiKeyId, description, isViewerEnabled, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedByApiKey{apiKeyId=$apiKeyId, description=$description, isViewerEnabled=$isViewerEnabled, additionalProperties=$additionalProperties}"
    }

    /** Reference to the user who created this study via dashboard */
    class CreatedByUser
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
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("middleName")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix1") @ExcludeMissing suffix1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suffix2") @ExcludeMissing suffix2: JsonField<String> = JsonMissing.of(),
        ) : this(email, userId, firstName, lastName, middleName, suffix1, suffix2, mutableMapOf())

        /**
         * User's email address
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * Unique user identifier. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
        @JsonProperty("middleName")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

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
             * Returns a mutable builder for constructing an instance of [CreatedByUser].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedByUser]. */
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
            internal fun from(createdByUser: CreatedByUser) = apply {
                email = createdByUser.email
                userId = createdByUser.userId
                firstName = createdByUser.firstName
                lastName = createdByUser.lastName
                middleName = createdByUser.middleName
                suffix1 = createdByUser.suffix1
                suffix2 = createdByUser.suffix2
                additionalProperties = createdByUser.additionalProperties.toMutableMap()
            }

            /** User's email address */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Unique user identifier. Format: usr_{32-hex-chars} */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

            /** User's middle name */
            fun middleName(middleName: String) = middleName(JsonField.of(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            /** Name suffix (e.g., 'MD', 'Jr.') */
            fun suffix1(suffix1: String) = suffix1(JsonField.of(suffix1))

            /**
             * Sets [Builder.suffix1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix1(suffix1: JsonField<String>) = apply { this.suffix1 = suffix1 }

            /** Additional name suffix */
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
             * Returns an immutable instance of [CreatedByUser].
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
            fun build(): CreatedByUser =
                CreatedByUser(
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

        fun validate(): CreatedByUser = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is CreatedByUser &&
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
            "CreatedByUser{email=$email, userId=$userId, firstName=$firstName, lastName=$lastName, middleName=$middleName, suffix1=$suffix1, suffix2=$suffix2, additionalProperties=$additionalProperties}"
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

    /** Reference to the organization this study belongs to */
    class Org
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
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orgId(): String = orgId.getRequired("orgId")

        /**
         * Name of the organization
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
             * Returns a mutable builder for constructing an instance of [Org].
             *
             * The following fields are required:
             * ```java
             * .orgId()
             * .orgName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Org]. */
        class Builder internal constructor() {

            private var orgId: JsonField<String>? = null
            private var orgName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(org: Org) = apply {
                orgId = org.orgId
                orgName = org.orgName
                additionalProperties = org.additionalProperties.toMutableMap()
            }

            /** Unique organization identifier. Format: org_{32-hex-chars} */
            fun orgId(orgId: String) = orgId(JsonField.of(orgId))

            /**
             * Sets [Builder.orgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            /** Name of the organization */
            fun orgName(orgName: String) = orgName(JsonField.of(orgName))

            /**
             * Sets [Builder.orgName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Org].
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
            fun build(): Org =
                Org(
                    checkRequired("orgId", orgId),
                    checkRequired("orgName", orgName),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Org = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Org &&
                orgId == other.orgId &&
                orgName == other.orgName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(orgId, orgName, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Org{orgId=$orgId, orgName=$orgName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyUpdateResponse &&
            cancelledAt == other.cancelledAt &&
            createdAt == other.createdAt &&
            isCancelled == other.isCancelled &&
            reportMetadata == other.reportMetadata &&
            severity == other.severity &&
            studyDescription == other.studyDescription &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            studyReportStatus == other.studyReportStatus &&
            updatedAt == other.updatedAt &&
            assignedTo == other.assignedTo &&
            createdByApiKey == other.createdByApiKey &&
            createdByUser == other.createdByUser &&
            metadata == other.metadata &&
            org == other.org &&
            priorReportTexts == other.priorReportTexts &&
            priorStudyIds == other.priorStudyIds &&
            reportIds == other.reportIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cancelledAt,
            createdAt,
            isCancelled,
            reportMetadata,
            severity,
            studyDescription,
            studyId,
            studyInstanceUid,
            studyReportStatus,
            updatedAt,
            assignedTo,
            createdByApiKey,
            createdByUser,
            metadata,
            org,
            priorReportTexts,
            priorStudyIds,
            reportIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyUpdateResponse{cancelledAt=$cancelledAt, createdAt=$createdAt, isCancelled=$isCancelled, reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, studyId=$studyId, studyInstanceUid=$studyInstanceUid, studyReportStatus=$studyReportStatus, updatedAt=$updatedAt, assignedTo=$assignedTo, createdByApiKey=$createdByApiKey, createdByUser=$createdByUser, metadata=$metadata, org=$org, priorReportTexts=$priorReportTexts, priorStudyIds=$priorStudyIds, reportIds=$reportIds, additionalProperties=$additionalProperties}"
}
