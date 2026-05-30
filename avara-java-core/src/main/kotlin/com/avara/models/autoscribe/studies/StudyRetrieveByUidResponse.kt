// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.Severity
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.StudyReportStatus
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
class StudyRetrieveByUidResponse
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
    private val clinicalHistory: JsonField<String>,
    private val clinicalIndication: JsonField<String>,
    private val createdByApiKey: JsonField<CreatedByApiKey>,
    private val createdByUser: JsonField<CreatedByUser>,
    private val expressCustomer: JsonField<ExpressCustomer>,
    private val externalPatientId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val modality: JsonField<String>,
    private val priorReports: JsonField<List<PriorReport>>,
    private val reportIds: JsonField<List<ReportIdWithStatus>>,
    private val technologistNotes: JsonField<List<String>>,
    private val technologistTechnique: JsonField<String>,
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
        @JsonProperty("clinicalHistory")
        @ExcludeMissing
        clinicalHistory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clinicalIndication")
        @ExcludeMissing
        clinicalIndication: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdByApiKey")
        @ExcludeMissing
        createdByApiKey: JsonField<CreatedByApiKey> = JsonMissing.of(),
        @JsonProperty("createdByUser")
        @ExcludeMissing
        createdByUser: JsonField<CreatedByUser> = JsonMissing.of(),
        @JsonProperty("expressCustomer")
        @ExcludeMissing
        expressCustomer: JsonField<ExpressCustomer> = JsonMissing.of(),
        @JsonProperty("externalPatientId")
        @ExcludeMissing
        externalPatientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priorReports")
        @ExcludeMissing
        priorReports: JsonField<List<PriorReport>> = JsonMissing.of(),
        @JsonProperty("reportIds")
        @ExcludeMissing
        reportIds: JsonField<List<ReportIdWithStatus>> = JsonMissing.of(),
        @JsonProperty("technologistNotes")
        @ExcludeMissing
        technologistNotes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("technologistTechnique")
        @ExcludeMissing
        technologistTechnique: JsonField<String> = JsonMissing.of(),
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
        clinicalHistory,
        clinicalIndication,
        createdByApiKey,
        createdByUser,
        expressCustomer,
        externalPatientId,
        metadata,
        modality,
        priorReports,
        reportIds,
        technologistNotes,
        technologistTechnique,
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
     * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention.
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
     * AutoScribe report workflow status for a study. 'unassigned' = no radiologist assigned,
     * 'assigned' = assigned but not started, 'in_progress' = actively being dictated, 'completed' =
     * report signed, 'addendum_active' = addendum in progress.
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
     * Relevant clinical history for the study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalHistory(): Optional<String> = clinicalHistory.getOptional("clinicalHistory")

    /**
     * Clinical indication for the study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalIndication(): Optional<String> =
        clinicalIndication.getOptional("clinicalIndication")

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
     * Reference to the Express customer this study belongs to
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomer(): Optional<ExpressCustomer> =
        expressCustomer.getOptional("expressCustomer")

    /**
     * Integrator-provided stable patient identifier for linking studies
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPatientId(): Optional<String> = externalPatientId.getOptional("externalPatientId")

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * Imaging modality for the study (free text)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modality(): Optional<String> = modality.getOptional("modality")

    /**
     * External prior reports with metadata and text
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorReports(): Optional<List<PriorReport>> = priorReports.getOptional("priorReports")

    /**
     * Array of report IDs associated with this study, including addendums
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportIds(): Optional<List<ReportIdWithStatus>> = reportIds.getOptional("reportIds")

    /**
     * Technologist notes for the study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistNotes(): Optional<List<String>> =
        technologistNotes.getOptional("technologistNotes")

    /**
     * Imaging technique description
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistTechnique(): Optional<String> =
        technologistTechnique.getOptional("technologistTechnique")

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
     * Returns the raw JSON value of [clinicalHistory].
     *
     * Unlike [clinicalHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clinicalHistory")
    @ExcludeMissing
    fun _clinicalHistory(): JsonField<String> = clinicalHistory

    /**
     * Returns the raw JSON value of [clinicalIndication].
     *
     * Unlike [clinicalIndication], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("clinicalIndication")
    @ExcludeMissing
    fun _clinicalIndication(): JsonField<String> = clinicalIndication

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
     * Returns the raw JSON value of [expressCustomer].
     *
     * Unlike [expressCustomer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expressCustomer")
    @ExcludeMissing
    fun _expressCustomer(): JsonField<ExpressCustomer> = expressCustomer

    /**
     * Returns the raw JSON value of [externalPatientId].
     *
     * Unlike [externalPatientId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalPatientId")
    @ExcludeMissing
    fun _externalPatientId(): JsonField<String> = externalPatientId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

    /**
     * Returns the raw JSON value of [priorReports].
     *
     * Unlike [priorReports], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priorReports")
    @ExcludeMissing
    fun _priorReports(): JsonField<List<PriorReport>> = priorReports

    /**
     * Returns the raw JSON value of [reportIds].
     *
     * Unlike [reportIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportIds")
    @ExcludeMissing
    fun _reportIds(): JsonField<List<ReportIdWithStatus>> = reportIds

    /**
     * Returns the raw JSON value of [technologistNotes].
     *
     * Unlike [technologistNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("technologistNotes")
    @ExcludeMissing
    fun _technologistNotes(): JsonField<List<String>> = technologistNotes

    /**
     * Returns the raw JSON value of [technologistTechnique].
     *
     * Unlike [technologistTechnique], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("technologistTechnique")
    @ExcludeMissing
    fun _technologistTechnique(): JsonField<String> = technologistTechnique

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
         * Returns a mutable builder for constructing an instance of [StudyRetrieveByUidResponse].
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

    /** A builder for [StudyRetrieveByUidResponse]. */
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
        private var clinicalHistory: JsonField<String> = JsonMissing.of()
        private var clinicalIndication: JsonField<String> = JsonMissing.of()
        private var createdByApiKey: JsonField<CreatedByApiKey> = JsonMissing.of()
        private var createdByUser: JsonField<CreatedByUser> = JsonMissing.of()
        private var expressCustomer: JsonField<ExpressCustomer> = JsonMissing.of()
        private var externalPatientId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var modality: JsonField<String> = JsonMissing.of()
        private var priorReports: JsonField<MutableList<PriorReport>>? = null
        private var reportIds: JsonField<MutableList<ReportIdWithStatus>>? = null
        private var technologistNotes: JsonField<MutableList<String>>? = null
        private var technologistTechnique: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyRetrieveByUidResponse: StudyRetrieveByUidResponse) = apply {
            cancelledAt = studyRetrieveByUidResponse.cancelledAt
            createdAt = studyRetrieveByUidResponse.createdAt
            isCancelled = studyRetrieveByUidResponse.isCancelled
            reportMetadata = studyRetrieveByUidResponse.reportMetadata
            severity = studyRetrieveByUidResponse.severity
            studyDescription = studyRetrieveByUidResponse.studyDescription
            studyId = studyRetrieveByUidResponse.studyId
            studyInstanceUid = studyRetrieveByUidResponse.studyInstanceUid
            studyReportStatus = studyRetrieveByUidResponse.studyReportStatus
            updatedAt = studyRetrieveByUidResponse.updatedAt
            assignedTo = studyRetrieveByUidResponse.assignedTo
            clinicalHistory = studyRetrieveByUidResponse.clinicalHistory
            clinicalIndication = studyRetrieveByUidResponse.clinicalIndication
            createdByApiKey = studyRetrieveByUidResponse.createdByApiKey
            createdByUser = studyRetrieveByUidResponse.createdByUser
            expressCustomer = studyRetrieveByUidResponse.expressCustomer
            externalPatientId = studyRetrieveByUidResponse.externalPatientId
            metadata = studyRetrieveByUidResponse.metadata
            modality = studyRetrieveByUidResponse.modality
            priorReports = studyRetrieveByUidResponse.priorReports.map { it.toMutableList() }
            reportIds = studyRetrieveByUidResponse.reportIds.map { it.toMutableList() }
            technologistNotes =
                studyRetrieveByUidResponse.technologistNotes.map { it.toMutableList() }
            technologistTechnique = studyRetrieveByUidResponse.technologistTechnique
            additionalProperties = studyRetrieveByUidResponse.additionalProperties.toMutableMap()
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
         * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
         * attention.
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
         * AutoScribe report workflow status for a study. 'unassigned' = no radiologist assigned,
         * 'assigned' = assigned but not started, 'in_progress' = actively being dictated,
         * 'completed' = report signed, 'addendum_active' = addendum in progress.
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

        /** Relevant clinical history for the study */
        fun clinicalHistory(clinicalHistory: String?) =
            clinicalHistory(JsonField.ofNullable(clinicalHistory))

        /** Alias for calling [Builder.clinicalHistory] with `clinicalHistory.orElse(null)`. */
        fun clinicalHistory(clinicalHistory: Optional<String>) =
            clinicalHistory(clinicalHistory.getOrNull())

        /**
         * Sets [Builder.clinicalHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicalHistory] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clinicalHistory(clinicalHistory: JsonField<String>) = apply {
            this.clinicalHistory = clinicalHistory
        }

        /** Clinical indication for the study */
        fun clinicalIndication(clinicalIndication: String?) =
            clinicalIndication(JsonField.ofNullable(clinicalIndication))

        /**
         * Alias for calling [Builder.clinicalIndication] with `clinicalIndication.orElse(null)`.
         */
        fun clinicalIndication(clinicalIndication: Optional<String>) =
            clinicalIndication(clinicalIndication.getOrNull())

        /**
         * Sets [Builder.clinicalIndication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicalIndication] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clinicalIndication(clinicalIndication: JsonField<String>) = apply {
            this.clinicalIndication = clinicalIndication
        }

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

        /** Reference to the Express customer this study belongs to */
        fun expressCustomer(expressCustomer: ExpressCustomer?) =
            expressCustomer(JsonField.ofNullable(expressCustomer))

        /** Alias for calling [Builder.expressCustomer] with `expressCustomer.orElse(null)`. */
        fun expressCustomer(expressCustomer: Optional<ExpressCustomer>) =
            expressCustomer(expressCustomer.getOrNull())

        /**
         * Sets [Builder.expressCustomer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomer] with a well-typed [ExpressCustomer]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun expressCustomer(expressCustomer: JsonField<ExpressCustomer>) = apply {
            this.expressCustomer = expressCustomer
        }

        /** Integrator-provided stable patient identifier for linking studies */
        fun externalPatientId(externalPatientId: String?) =
            externalPatientId(JsonField.ofNullable(externalPatientId))

        /** Alias for calling [Builder.externalPatientId] with `externalPatientId.orElse(null)`. */
        fun externalPatientId(externalPatientId: Optional<String>) =
            externalPatientId(externalPatientId.getOrNull())

        /**
         * Sets [Builder.externalPatientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPatientId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalPatientId(externalPatientId: JsonField<String>) = apply {
            this.externalPatientId = externalPatientId
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

        /** Imaging modality for the study (free text) */
        fun modality(modality: String?) = modality(JsonField.ofNullable(modality))

        /** Alias for calling [Builder.modality] with `modality.orElse(null)`. */
        fun modality(modality: Optional<String>) = modality(modality.getOrNull())

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { this.modality = modality }

        /** External prior reports with metadata and text */
        fun priorReports(priorReports: List<PriorReport>) = priorReports(JsonField.of(priorReports))

        /**
         * Sets [Builder.priorReports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorReports] with a well-typed `List<PriorReport>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priorReports(priorReports: JsonField<List<PriorReport>>) = apply {
            this.priorReports = priorReports.map { it.toMutableList() }
        }

        /**
         * Adds a single [PriorReport] to [priorReports].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorReport(priorReport: PriorReport) = apply {
            priorReports =
                (priorReports ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priorReports", it).add(priorReport)
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

        /** Technologist notes for the study */
        fun technologistNotes(technologistNotes: List<String>) =
            technologistNotes(JsonField.of(technologistNotes))

        /**
         * Sets [Builder.technologistNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technologistNotes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun technologistNotes(technologistNotes: JsonField<List<String>>) = apply {
            this.technologistNotes = technologistNotes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [technologistNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTechnologistNote(technologistNote: String) = apply {
            technologistNotes =
                (technologistNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("technologistNotes", it).add(technologistNote)
                }
        }

        /** Imaging technique description */
        fun technologistTechnique(technologistTechnique: String?) =
            technologistTechnique(JsonField.ofNullable(technologistTechnique))

        /**
         * Alias for calling [Builder.technologistTechnique] with
         * `technologistTechnique.orElse(null)`.
         */
        fun technologistTechnique(technologistTechnique: Optional<String>) =
            technologistTechnique(technologistTechnique.getOrNull())

        /**
         * Sets [Builder.technologistTechnique] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technologistTechnique] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technologistTechnique(technologistTechnique: JsonField<String>) = apply {
            this.technologistTechnique = technologistTechnique
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
         * Returns an immutable instance of [StudyRetrieveByUidResponse].
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
        fun build(): StudyRetrieveByUidResponse =
            StudyRetrieveByUidResponse(
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
                clinicalHistory,
                clinicalIndication,
                createdByApiKey,
                createdByUser,
                expressCustomer,
                externalPatientId,
                metadata,
                modality,
                (priorReports ?: JsonMissing.of()).map { it.toImmutable() },
                (reportIds ?: JsonMissing.of()).map { it.toImmutable() },
                (technologistNotes ?: JsonMissing.of()).map { it.toImmutable() },
                technologistTechnique,
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
    fun validate(): StudyRetrieveByUidResponse = apply {
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
        clinicalHistory()
        clinicalIndication()
        createdByApiKey().ifPresent { it.validate() }
        createdByUser().ifPresent { it.validate() }
        expressCustomer().ifPresent { it.validate() }
        externalPatientId()
        metadata().ifPresent { it.validate() }
        modality()
        priorReports().ifPresent { it.forEach { it.validate() } }
        reportIds().ifPresent { it.forEach { it.validate() } }
        technologistNotes()
        technologistTechnique()
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
            (if (clinicalHistory.asKnown().isPresent) 1 else 0) +
            (if (clinicalIndication.asKnown().isPresent) 1 else 0) +
            (createdByApiKey.asKnown().getOrNull()?.validity() ?: 0) +
            (createdByUser.asKnown().getOrNull()?.validity() ?: 0) +
            (expressCustomer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalPatientId.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (modality.asKnown().isPresent) 1 else 0) +
            (priorReports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (reportIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (technologistNotes.asKnown().getOrNull()?.size ?: 0) +
            (if (technologistTechnique.asKnown().isPresent) 1 else 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** Reference to the Express customer this study belongs to */
    class ExpressCustomer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expressCustomerId: JsonField<String>,
        private val expressCustomerName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expressCustomerId")
            @ExcludeMissing
            expressCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expressCustomerName")
            @ExcludeMissing
            expressCustomerName: JsonField<String> = JsonMissing.of(),
        ) : this(expressCustomerId, expressCustomerName, mutableMapOf())

        /**
         * Unique Express customer identifier. Format: cus_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expressCustomerId(): String = expressCustomerId.getRequired("expressCustomerId")

        /**
         * Name of the Express customer
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expressCustomerName(): String = expressCustomerName.getRequired("expressCustomerName")

        /**
         * Returns the raw JSON value of [expressCustomerId].
         *
         * Unlike [expressCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expressCustomerId")
        @ExcludeMissing
        fun _expressCustomerId(): JsonField<String> = expressCustomerId

        /**
         * Returns the raw JSON value of [expressCustomerName].
         *
         * Unlike [expressCustomerName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("expressCustomerName")
        @ExcludeMissing
        fun _expressCustomerName(): JsonField<String> = expressCustomerName

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
             * Returns a mutable builder for constructing an instance of [ExpressCustomer].
             *
             * The following fields are required:
             * ```java
             * .expressCustomerId()
             * .expressCustomerName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExpressCustomer]. */
        class Builder internal constructor() {

            private var expressCustomerId: JsonField<String>? = null
            private var expressCustomerName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(expressCustomer: ExpressCustomer) = apply {
                expressCustomerId = expressCustomer.expressCustomerId
                expressCustomerName = expressCustomer.expressCustomerName
                additionalProperties = expressCustomer.additionalProperties.toMutableMap()
            }

            /** Unique Express customer identifier. Format: cus_{32-hex-chars} */
            fun expressCustomerId(expressCustomerId: String) =
                expressCustomerId(JsonField.of(expressCustomerId))

            /**
             * Sets [Builder.expressCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expressCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expressCustomerId(expressCustomerId: JsonField<String>) = apply {
                this.expressCustomerId = expressCustomerId
            }

            /** Name of the Express customer */
            fun expressCustomerName(expressCustomerName: String) =
                expressCustomerName(JsonField.of(expressCustomerName))

            /**
             * Sets [Builder.expressCustomerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expressCustomerName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun expressCustomerName(expressCustomerName: JsonField<String>) = apply {
                this.expressCustomerName = expressCustomerName
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
             * Returns an immutable instance of [ExpressCustomer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .expressCustomerId()
             * .expressCustomerName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExpressCustomer =
                ExpressCustomer(
                    checkRequired("expressCustomerId", expressCustomerId),
                    checkRequired("expressCustomerName", expressCustomerName),
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
        fun validate(): ExpressCustomer = apply {
            if (validated) {
                return@apply
            }

            expressCustomerId()
            expressCustomerName()
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
            (if (expressCustomerId.asKnown().isPresent) 1 else 0) +
                (if (expressCustomerName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExpressCustomer &&
                expressCustomerId == other.expressCustomerId &&
                expressCustomerName == other.expressCustomerName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expressCustomerId, expressCustomerName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpressCustomer{expressCustomerId=$expressCustomerId, expressCustomerName=$expressCustomerName, additionalProperties=$additionalProperties}"
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

        return other is StudyRetrieveByUidResponse &&
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
            clinicalHistory == other.clinicalHistory &&
            clinicalIndication == other.clinicalIndication &&
            createdByApiKey == other.createdByApiKey &&
            createdByUser == other.createdByUser &&
            expressCustomer == other.expressCustomer &&
            externalPatientId == other.externalPatientId &&
            metadata == other.metadata &&
            modality == other.modality &&
            priorReports == other.priorReports &&
            reportIds == other.reportIds &&
            technologistNotes == other.technologistNotes &&
            technologistTechnique == other.technologistTechnique &&
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
            clinicalHistory,
            clinicalIndication,
            createdByApiKey,
            createdByUser,
            expressCustomer,
            externalPatientId,
            metadata,
            modality,
            priorReports,
            reportIds,
            technologistNotes,
            technologistTechnique,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyRetrieveByUidResponse{cancelledAt=$cancelledAt, createdAt=$createdAt, isCancelled=$isCancelled, reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, studyId=$studyId, studyInstanceUid=$studyInstanceUid, studyReportStatus=$studyReportStatus, updatedAt=$updatedAt, assignedTo=$assignedTo, clinicalHistory=$clinicalHistory, clinicalIndication=$clinicalIndication, createdByApiKey=$createdByApiKey, createdByUser=$createdByUser, expressCustomer=$expressCustomer, externalPatientId=$externalPatientId, metadata=$metadata, modality=$modality, priorReports=$priorReports, reportIds=$reportIds, technologistNotes=$technologistNotes, technologistTechnique=$technologistTechnique, additionalProperties=$additionalProperties}"
}
