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
import com.avara.models.ApiKeyReference
import com.avara.models.ExpressCustomerReference
import com.avara.models.Severity
import com.avara.models.UserReference
import com.avara.models.autoscribe.StudyReportMetadata
import com.avara.models.autoscribe.StudyReportStatus
import com.avara.models.autoscribe.StudyType
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
    private val assignedTo: JsonField<UserReference>,
    private val clinicalHistory: JsonField<String>,
    private val clinicalIndication: JsonField<String>,
    private val createdByApiKey: JsonField<ApiKeyReference>,
    private val createdByUser: JsonField<UserReference>,
    private val expressCustomer: JsonField<ExpressCustomerReference>,
    private val externalPatientId: JsonField<String>,
    private val externalReportId: JsonField<String>,
    private val isCritical: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val modality: JsonField<String>,
    private val priorReports: JsonField<List<PriorReport>>,
    private val reportIds: JsonField<List<ReportIdWithStatus>>,
    private val studyType: JsonField<StudyType>,
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
        assignedTo: JsonField<UserReference> = JsonMissing.of(),
        @JsonProperty("clinicalHistory")
        @ExcludeMissing
        clinicalHistory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clinicalIndication")
        @ExcludeMissing
        clinicalIndication: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdByApiKey")
        @ExcludeMissing
        createdByApiKey: JsonField<ApiKeyReference> = JsonMissing.of(),
        @JsonProperty("createdByUser")
        @ExcludeMissing
        createdByUser: JsonField<UserReference> = JsonMissing.of(),
        @JsonProperty("expressCustomer")
        @ExcludeMissing
        expressCustomer: JsonField<ExpressCustomerReference> = JsonMissing.of(),
        @JsonProperty("externalPatientId")
        @ExcludeMissing
        externalPatientId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalReportId")
        @ExcludeMissing
        externalReportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isCritical")
        @ExcludeMissing
        isCritical: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("modality") @ExcludeMissing modality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priorReports")
        @ExcludeMissing
        priorReports: JsonField<List<PriorReport>> = JsonMissing.of(),
        @JsonProperty("reportIds")
        @ExcludeMissing
        reportIds: JsonField<List<ReportIdWithStatus>> = JsonMissing.of(),
        @JsonProperty("studyType")
        @ExcludeMissing
        studyType: JsonField<StudyType> = JsonMissing.of(),
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
        externalReportId,
        isCritical,
        metadata,
        modality,
        priorReports,
        reportIds,
        studyType,
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
     * A reference to a user with basic identifying information
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<UserReference> = assignedTo.getOptional("assignedTo")

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
     * Integrator-provided stable patient identifier for linking studies
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPatientId(): Optional<String> = externalPatientId.getOptional("externalPatientId")

    /**
     * External report identifier when this study has an attached archive report. Format:
     * ext_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalReportId(): Optional<String> = externalReportId.getOptional("externalReportId")

    /**
     * Whether the primary report was marked as critical at sign-off
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isCritical(): Optional<Boolean> = isCritical.getOptional("isCritical")

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
     * Kind of study. 'standard' is a live AutoScribe reading-workflow study. 'external' is an
     * imported archive study.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyType(): Optional<StudyType> = studyType.getOptional("studyType")

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
    fun _assignedTo(): JsonField<UserReference> = assignedTo

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
     * Returns the raw JSON value of [externalPatientId].
     *
     * Unlike [externalPatientId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalPatientId")
    @ExcludeMissing
    fun _externalPatientId(): JsonField<String> = externalPatientId

    /**
     * Returns the raw JSON value of [externalReportId].
     *
     * Unlike [externalReportId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externalReportId")
    @ExcludeMissing
    fun _externalReportId(): JsonField<String> = externalReportId

    /**
     * Returns the raw JSON value of [isCritical].
     *
     * Unlike [isCritical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCritical") @ExcludeMissing fun _isCritical(): JsonField<Boolean> = isCritical

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
     * Returns the raw JSON value of [studyType].
     *
     * Unlike [studyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studyType") @ExcludeMissing fun _studyType(): JsonField<StudyType> = studyType

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
        private var assignedTo: JsonField<UserReference> = JsonMissing.of()
        private var clinicalHistory: JsonField<String> = JsonMissing.of()
        private var clinicalIndication: JsonField<String> = JsonMissing.of()
        private var createdByApiKey: JsonField<ApiKeyReference> = JsonMissing.of()
        private var createdByUser: JsonField<UserReference> = JsonMissing.of()
        private var expressCustomer: JsonField<ExpressCustomerReference> = JsonMissing.of()
        private var externalPatientId: JsonField<String> = JsonMissing.of()
        private var externalReportId: JsonField<String> = JsonMissing.of()
        private var isCritical: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var modality: JsonField<String> = JsonMissing.of()
        private var priorReports: JsonField<MutableList<PriorReport>>? = null
        private var reportIds: JsonField<MutableList<ReportIdWithStatus>>? = null
        private var studyType: JsonField<StudyType> = JsonMissing.of()
        private var technologistNotes: JsonField<MutableList<String>>? = null
        private var technologistTechnique: JsonField<String> = JsonMissing.of()
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
            clinicalHistory = studyUpdateResponse.clinicalHistory
            clinicalIndication = studyUpdateResponse.clinicalIndication
            createdByApiKey = studyUpdateResponse.createdByApiKey
            createdByUser = studyUpdateResponse.createdByUser
            expressCustomer = studyUpdateResponse.expressCustomer
            externalPatientId = studyUpdateResponse.externalPatientId
            externalReportId = studyUpdateResponse.externalReportId
            isCritical = studyUpdateResponse.isCritical
            metadata = studyUpdateResponse.metadata
            modality = studyUpdateResponse.modality
            priorReports = studyUpdateResponse.priorReports.map { it.toMutableList() }
            reportIds = studyUpdateResponse.reportIds.map { it.toMutableList() }
            studyType = studyUpdateResponse.studyType
            technologistNotes = studyUpdateResponse.technologistNotes.map { it.toMutableList() }
            technologistTechnique = studyUpdateResponse.technologistTechnique
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
         * External report identifier when this study has an attached archive report. Format:
         * ext_{32-hex-chars}
         */
        fun externalReportId(externalReportId: String) =
            externalReportId(JsonField.of(externalReportId))

        /**
         * Sets [Builder.externalReportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalReportId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalReportId(externalReportId: JsonField<String>) = apply {
            this.externalReportId = externalReportId
        }

        /** Whether the primary report was marked as critical at sign-off */
        fun isCritical(isCritical: Boolean) = isCritical(JsonField.of(isCritical))

        /**
         * Sets [Builder.isCritical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCritical] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCritical(isCritical: JsonField<Boolean>) = apply { this.isCritical = isCritical }

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

        /**
         * Kind of study. 'standard' is a live AutoScribe reading-workflow study. 'external' is an
         * imported archive study.
         */
        fun studyType(studyType: StudyType) = studyType(JsonField.of(studyType))

        /**
         * Sets [Builder.studyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyType] with a well-typed [StudyType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun studyType(studyType: JsonField<StudyType>) = apply { this.studyType = studyType }

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
                clinicalHistory,
                clinicalIndication,
                createdByApiKey,
                createdByUser,
                expressCustomer,
                externalPatientId,
                externalReportId,
                isCritical,
                metadata,
                modality,
                (priorReports ?: JsonMissing.of()).map { it.toImmutable() },
                (reportIds ?: JsonMissing.of()).map { it.toImmutable() },
                studyType,
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
        clinicalHistory()
        clinicalIndication()
        createdByApiKey().ifPresent { it.validate() }
        createdByUser().ifPresent { it.validate() }
        expressCustomer().ifPresent { it.validate() }
        externalPatientId()
        externalReportId()
        isCritical()
        metadata().ifPresent { it.validate() }
        modality()
        priorReports().ifPresent { it.forEach { it.validate() } }
        reportIds().ifPresent { it.forEach { it.validate() } }
        studyType().ifPresent { it.validate() }
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
            (if (externalReportId.asKnown().isPresent) 1 else 0) +
            (if (isCritical.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (modality.asKnown().isPresent) 1 else 0) +
            (priorReports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (reportIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (studyType.asKnown().getOrNull()?.validity() ?: 0) +
            (technologistNotes.asKnown().getOrNull()?.size ?: 0) +
            (if (technologistTechnique.asKnown().isPresent) 1 else 0)

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
            clinicalHistory == other.clinicalHistory &&
            clinicalIndication == other.clinicalIndication &&
            createdByApiKey == other.createdByApiKey &&
            createdByUser == other.createdByUser &&
            expressCustomer == other.expressCustomer &&
            externalPatientId == other.externalPatientId &&
            externalReportId == other.externalReportId &&
            isCritical == other.isCritical &&
            metadata == other.metadata &&
            modality == other.modality &&
            priorReports == other.priorReports &&
            reportIds == other.reportIds &&
            studyType == other.studyType &&
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
            externalReportId,
            isCritical,
            metadata,
            modality,
            priorReports,
            reportIds,
            studyType,
            technologistNotes,
            technologistTechnique,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyUpdateResponse{cancelledAt=$cancelledAt, createdAt=$createdAt, isCancelled=$isCancelled, reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, studyId=$studyId, studyInstanceUid=$studyInstanceUid, studyReportStatus=$studyReportStatus, updatedAt=$updatedAt, assignedTo=$assignedTo, clinicalHistory=$clinicalHistory, clinicalIndication=$clinicalIndication, createdByApiKey=$createdByApiKey, createdByUser=$createdByUser, expressCustomer=$expressCustomer, externalPatientId=$externalPatientId, externalReportId=$externalReportId, isCritical=$isCritical, metadata=$metadata, modality=$modality, priorReports=$priorReports, reportIds=$reportIds, studyType=$studyType, technologistNotes=$technologistNotes, technologistTechnique=$technologistTechnique, additionalProperties=$additionalProperties}"
}
