// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.Params
import com.avarasoftware.core.checkKnown
import com.avarasoftware.core.checkRequired
import com.avarasoftware.core.http.Headers
import com.avarasoftware.core.http.QueryParams
import com.avarasoftware.core.toImmutable
import com.avarasoftware.errors.AvaraInvalidDataException
import com.avarasoftware.models.Severity
import com.avarasoftware.models.autoscribe.HeightUnit
import com.avarasoftware.models.autoscribe.Sex
import com.avarasoftware.models.autoscribe.WeightUnit
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates a study's properties including description, severity, assignment, organization, metadata,
 * and report metadata. All fields are optional - only provided fields will be updated.
 */
class StudyUpdateParams
private constructor(
    private val studyId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique study identifier. Format: stu_{32-hex-chars} */
    fun studyId(): Optional<String> = Optional.ofNullable(studyId)

    /**
     * User ID to assign the study to, or null to unassign. Format: usr_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<String> = body.assignedTo()

    /**
     * Relevant clinical history for the patient/study. Null clears.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalHistory(): Optional<String> = body.clinicalHistory()

    /**
     * Clinical indication for the study. Null clears.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalIndication(): Optional<String> = body.clinicalIndication()

    /**
     * Express Customer ID for the study, or null to remove. Format: cus_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomerId(): Optional<String> = body.expressCustomerId()

    /**
     * Integrator-provided stable patient identifier used to link studies for the same patient. Null
     * clears.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPatientId(): Optional<String> = body.externalPatientId()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Imaging modality for the study (free text). Null clears.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modality(): Optional<String> = body.modality()

    /**
     * External prior reports (metadata + full report text) for comparison context. Null clears; an
     * array replaces the existing set. Maximum 50 items
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorReports(): Optional<List<PriorReport>> = body.priorReports()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportMetadata(): Optional<ReportMetadata> = body.reportMetadata()

    /**
     * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severity(): Optional<Severity> = body.severity()

    /**
     * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyDescription(): Optional<String> = body.studyDescription()

    /**
     * Technologist notes for the study. Null clears; an array replaces the existing set. Maximum 50
     * items, each up to 1000 characters
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistNotes(): Optional<List<String>> = body.technologistNotes()

    /**
     * Imaging technique description provided by the technologist. Null clears.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistTechnique(): Optional<String> = body.technologistTechnique()

    /**
     * Returns the raw JSON value of [assignedTo].
     *
     * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignedTo(): JsonField<String> = body._assignedTo()

    /**
     * Returns the raw JSON value of [clinicalHistory].
     *
     * Unlike [clinicalHistory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clinicalHistory(): JsonField<String> = body._clinicalHistory()

    /**
     * Returns the raw JSON value of [clinicalIndication].
     *
     * Unlike [clinicalIndication], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _clinicalIndication(): JsonField<String> = body._clinicalIndication()

    /**
     * Returns the raw JSON value of [expressCustomerId].
     *
     * Unlike [expressCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expressCustomerId(): JsonField<String> = body._expressCustomerId()

    /**
     * Returns the raw JSON value of [externalPatientId].
     *
     * Unlike [externalPatientId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalPatientId(): JsonField<String> = body._externalPatientId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [modality].
     *
     * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modality(): JsonField<String> = body._modality()

    /**
     * Returns the raw JSON value of [priorReports].
     *
     * Unlike [priorReports], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priorReports(): JsonField<List<PriorReport>> = body._priorReports()

    /**
     * Returns the raw JSON value of [reportMetadata].
     *
     * Unlike [reportMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportMetadata(): JsonField<ReportMetadata> = body._reportMetadata()

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _severity(): JsonField<Severity> = body._severity()

    /**
     * Returns the raw JSON value of [studyDescription].
     *
     * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _studyDescription(): JsonField<String> = body._studyDescription()

    /**
     * Returns the raw JSON value of [technologistNotes].
     *
     * Unlike [technologistNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _technologistNotes(): JsonField<List<String>> = body._technologistNotes()

    /**
     * Returns the raw JSON value of [technologistTechnique].
     *
     * Unlike [technologistTechnique], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _technologistTechnique(): JsonField<String> = body._technologistTechnique()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StudyUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StudyUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyUpdateParams]. */
    class Builder internal constructor() {

        private var studyId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(studyUpdateParams: StudyUpdateParams) = apply {
            studyId = studyUpdateParams.studyId
            body = studyUpdateParams.body.toBuilder()
            additionalHeaders = studyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = studyUpdateParams.additionalQueryParams.toBuilder()
        }

        /** Unique study identifier. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String?) = apply { this.studyId = studyId }

        /** Alias for calling [Builder.studyId] with `studyId.orElse(null)`. */
        fun studyId(studyId: Optional<String>) = studyId(studyId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [assignedTo]
         * - [clinicalHistory]
         * - [clinicalIndication]
         * - [expressCustomerId]
         * - [externalPatientId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** User ID to assign the study to, or null to unassign. Format: usr_{32-hex-chars} */
        fun assignedTo(assignedTo: String) = apply { body.assignedTo(assignedTo) }

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedTo(assignedTo: JsonField<String>) = apply { body.assignedTo(assignedTo) }

        /** Relevant clinical history for the patient/study. Null clears. */
        fun clinicalHistory(clinicalHistory: String?) = apply {
            body.clinicalHistory(clinicalHistory)
        }

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
            body.clinicalHistory(clinicalHistory)
        }

        /** Clinical indication for the study. Null clears. */
        fun clinicalIndication(clinicalIndication: String?) = apply {
            body.clinicalIndication(clinicalIndication)
        }

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
            body.clinicalIndication(clinicalIndication)
        }

        /** Express Customer ID for the study, or null to remove. Format: cus_{32-hex-chars} */
        fun expressCustomerId(expressCustomerId: String) = apply {
            body.expressCustomerId(expressCustomerId)
        }

        /**
         * Sets [Builder.expressCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expressCustomerId(expressCustomerId: JsonField<String>) = apply {
            body.expressCustomerId(expressCustomerId)
        }

        /**
         * Integrator-provided stable patient identifier used to link studies for the same patient.
         * Null clears.
         */
        fun externalPatientId(externalPatientId: String?) = apply {
            body.externalPatientId(externalPatientId)
        }

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
            body.externalPatientId(externalPatientId)
        }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Imaging modality for the study (free text). Null clears. */
        fun modality(modality: String?) = apply { body.modality(modality) }

        /** Alias for calling [Builder.modality] with `modality.orElse(null)`. */
        fun modality(modality: Optional<String>) = modality(modality.getOrNull())

        /**
         * Sets [Builder.modality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modality(modality: JsonField<String>) = apply { body.modality(modality) }

        /**
         * External prior reports (metadata + full report text) for comparison context. Null clears;
         * an array replaces the existing set. Maximum 50 items
         */
        fun priorReports(priorReports: List<PriorReport>?) = apply {
            body.priorReports(priorReports)
        }

        /** Alias for calling [Builder.priorReports] with `priorReports.orElse(null)`. */
        fun priorReports(priorReports: Optional<List<PriorReport>>) =
            priorReports(priorReports.getOrNull())

        /**
         * Sets [Builder.priorReports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorReports] with a well-typed `List<PriorReport>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priorReports(priorReports: JsonField<List<PriorReport>>) = apply {
            body.priorReports(priorReports)
        }

        /**
         * Adds a single [PriorReport] to [priorReports].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorReport(priorReport: PriorReport) = apply { body.addPriorReport(priorReport) }

        fun reportMetadata(reportMetadata: ReportMetadata) = apply {
            body.reportMetadata(reportMetadata)
        }

        /**
         * Sets [Builder.reportMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportMetadata] with a well-typed [ReportMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportMetadata(reportMetadata: JsonField<ReportMetadata>) = apply {
            body.reportMetadata(reportMetadata)
        }

        /**
         * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
         * attention.
         */
        fun severity(severity: Severity) = apply { body.severity(severity) }

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { body.severity(severity) }

        /** Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT') */
        fun studyDescription(studyDescription: String) = apply {
            body.studyDescription(studyDescription)
        }

        /**
         * Sets [Builder.studyDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyDescription(studyDescription: JsonField<String>) = apply {
            body.studyDescription(studyDescription)
        }

        /**
         * Technologist notes for the study. Null clears; an array replaces the existing set.
         * Maximum 50 items, each up to 1000 characters
         */
        fun technologistNotes(technologistNotes: List<String>?) = apply {
            body.technologistNotes(technologistNotes)
        }

        /** Alias for calling [Builder.technologistNotes] with `technologistNotes.orElse(null)`. */
        fun technologistNotes(technologistNotes: Optional<List<String>>) =
            technologistNotes(technologistNotes.getOrNull())

        /**
         * Sets [Builder.technologistNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technologistNotes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun technologistNotes(technologistNotes: JsonField<List<String>>) = apply {
            body.technologistNotes(technologistNotes)
        }

        /**
         * Adds a single [String] to [technologistNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTechnologistNote(technologistNote: String) = apply {
            body.addTechnologistNote(technologistNote)
        }

        /** Imaging technique description provided by the technologist. Null clears. */
        fun technologistTechnique(technologistTechnique: String?) = apply {
            body.technologistTechnique(technologistTechnique)
        }

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
            body.technologistTechnique(technologistTechnique)
        }

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
         * Returns an immutable instance of [StudyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StudyUpdateParams =
            StudyUpdateParams(
                studyId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> studyId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for updating a study in AutoScribe */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assignedTo: JsonField<String>,
        private val clinicalHistory: JsonField<String>,
        private val clinicalIndication: JsonField<String>,
        private val expressCustomerId: JsonField<String>,
        private val externalPatientId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val modality: JsonField<String>,
        private val priorReports: JsonField<List<PriorReport>>,
        private val reportMetadata: JsonField<ReportMetadata>,
        private val severity: JsonField<Severity>,
        private val studyDescription: JsonField<String>,
        private val technologistNotes: JsonField<List<String>>,
        private val technologistTechnique: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assignedTo")
            @ExcludeMissing
            assignedTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clinicalHistory")
            @ExcludeMissing
            clinicalHistory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("clinicalIndication")
            @ExcludeMissing
            clinicalIndication: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expressCustomerId")
            @ExcludeMissing
            expressCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalPatientId")
            @ExcludeMissing
            externalPatientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("modality")
            @ExcludeMissing
            modality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priorReports")
            @ExcludeMissing
            priorReports: JsonField<List<PriorReport>> = JsonMissing.of(),
            @JsonProperty("reportMetadata")
            @ExcludeMissing
            reportMetadata: JsonField<ReportMetadata> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("studyDescription")
            @ExcludeMissing
            studyDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("technologistNotes")
            @ExcludeMissing
            technologistNotes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("technologistTechnique")
            @ExcludeMissing
            technologistTechnique: JsonField<String> = JsonMissing.of(),
        ) : this(
            assignedTo,
            clinicalHistory,
            clinicalIndication,
            expressCustomerId,
            externalPatientId,
            metadata,
            modality,
            priorReports,
            reportMetadata,
            severity,
            studyDescription,
            technologistNotes,
            technologistTechnique,
            mutableMapOf(),
        )

        /**
         * User ID to assign the study to, or null to unassign. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignedTo(): Optional<String> = assignedTo.getOptional("assignedTo")

        /**
         * Relevant clinical history for the patient/study. Null clears.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clinicalHistory(): Optional<String> = clinicalHistory.getOptional("clinicalHistory")

        /**
         * Clinical indication for the study. Null clears.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clinicalIndication(): Optional<String> =
            clinicalIndication.getOptional("clinicalIndication")

        /**
         * Express Customer ID for the study, or null to remove. Format: cus_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expressCustomerId(): Optional<String> =
            expressCustomerId.getOptional("expressCustomerId")

        /**
         * Integrator-provided stable patient identifier used to link studies for the same patient.
         * Null clears.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPatientId(): Optional<String> =
            externalPatientId.getOptional("externalPatientId")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Imaging modality for the study (free text). Null clears.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modality(): Optional<String> = modality.getOptional("modality")

        /**
         * External prior reports (metadata + full report text) for comparison context. Null clears;
         * an array replaces the existing set. Maximum 50 items
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priorReports(): Optional<List<PriorReport>> = priorReports.getOptional("priorReports")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportMetadata(): Optional<ReportMetadata> =
            reportMetadata.getOptional("reportMetadata")

        /**
         * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
         * attention.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun severity(): Optional<Severity> = severity.getOptional("severity")

        /**
         * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyDescription(): Optional<String> = studyDescription.getOptional("studyDescription")

        /**
         * Technologist notes for the study. Null clears; an array replaces the existing set.
         * Maximum 50 items, each up to 1000 characters
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun technologistNotes(): Optional<List<String>> =
            technologistNotes.getOptional("technologistNotes")

        /**
         * Imaging technique description provided by the technologist. Null clears.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun technologistTechnique(): Optional<String> =
            technologistTechnique.getOptional("technologistTechnique")

        /**
         * Returns the raw JSON value of [assignedTo].
         *
         * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignedTo")
        @ExcludeMissing
        fun _assignedTo(): JsonField<String> = assignedTo

        /**
         * Returns the raw JSON value of [clinicalHistory].
         *
         * Unlike [clinicalHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("clinicalHistory")
        @ExcludeMissing
        fun _clinicalHistory(): JsonField<String> = clinicalHistory

        /**
         * Returns the raw JSON value of [clinicalIndication].
         *
         * Unlike [clinicalIndication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("clinicalIndication")
        @ExcludeMissing
        fun _clinicalIndication(): JsonField<String> = clinicalIndication

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
         * Unlike [priorReports], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("priorReports")
        @ExcludeMissing
        fun _priorReports(): JsonField<List<PriorReport>> = priorReports

        /**
         * Returns the raw JSON value of [reportMetadata].
         *
         * Unlike [reportMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reportMetadata")
        @ExcludeMissing
        fun _reportMetadata(): JsonField<ReportMetadata> = reportMetadata

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
         * Unlike [technologistTechnique], this method doesn't throw if the JSON field has an
         * unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var assignedTo: JsonField<String> = JsonMissing.of()
            private var clinicalHistory: JsonField<String> = JsonMissing.of()
            private var clinicalIndication: JsonField<String> = JsonMissing.of()
            private var expressCustomerId: JsonField<String> = JsonMissing.of()
            private var externalPatientId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modality: JsonField<String> = JsonMissing.of()
            private var priorReports: JsonField<MutableList<PriorReport>>? = null
            private var reportMetadata: JsonField<ReportMetadata> = JsonMissing.of()
            private var severity: JsonField<Severity> = JsonMissing.of()
            private var studyDescription: JsonField<String> = JsonMissing.of()
            private var technologistNotes: JsonField<MutableList<String>>? = null
            private var technologistTechnique: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assignedTo = body.assignedTo
                clinicalHistory = body.clinicalHistory
                clinicalIndication = body.clinicalIndication
                expressCustomerId = body.expressCustomerId
                externalPatientId = body.externalPatientId
                metadata = body.metadata
                modality = body.modality
                priorReports = body.priorReports.map { it.toMutableList() }
                reportMetadata = body.reportMetadata
                severity = body.severity
                studyDescription = body.studyDescription
                technologistNotes = body.technologistNotes.map { it.toMutableList() }
                technologistTechnique = body.technologistTechnique
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** User ID to assign the study to, or null to unassign. Format: usr_{32-hex-chars} */
            fun assignedTo(assignedTo: String) = assignedTo(JsonField.of(assignedTo))

            /**
             * Sets [Builder.assignedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

            /** Relevant clinical history for the patient/study. Null clears. */
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

            /** Clinical indication for the study. Null clears. */
            fun clinicalIndication(clinicalIndication: String?) =
                clinicalIndication(JsonField.ofNullable(clinicalIndication))

            /**
             * Alias for calling [Builder.clinicalIndication] with
             * `clinicalIndication.orElse(null)`.
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

            /** Express Customer ID for the study, or null to remove. Format: cus_{32-hex-chars} */
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

            /**
             * Integrator-provided stable patient identifier used to link studies for the same
             * patient. Null clears.
             */
            fun externalPatientId(externalPatientId: String?) =
                externalPatientId(JsonField.ofNullable(externalPatientId))

            /**
             * Alias for calling [Builder.externalPatientId] with `externalPatientId.orElse(null)`.
             */
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

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Imaging modality for the study (free text). Null clears. */
            fun modality(modality: String?) = modality(JsonField.ofNullable(modality))

            /** Alias for calling [Builder.modality] with `modality.orElse(null)`. */
            fun modality(modality: Optional<String>) = modality(modality.getOrNull())

            /**
             * Sets [Builder.modality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modality(modality: JsonField<String>) = apply { this.modality = modality }

            /**
             * External prior reports (metadata + full report text) for comparison context. Null
             * clears; an array replaces the existing set. Maximum 50 items
             */
            fun priorReports(priorReports: List<PriorReport>?) =
                priorReports(JsonField.ofNullable(priorReports))

            /** Alias for calling [Builder.priorReports] with `priorReports.orElse(null)`. */
            fun priorReports(priorReports: Optional<List<PriorReport>>) =
                priorReports(priorReports.getOrNull())

            /**
             * Sets [Builder.priorReports] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priorReports] with a well-typed `List<PriorReport>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun reportMetadata(reportMetadata: ReportMetadata) =
                reportMetadata(JsonField.of(reportMetadata))

            /**
             * Sets [Builder.reportMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportMetadata] with a well-typed [ReportMetadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reportMetadata(reportMetadata: JsonField<ReportMetadata>) = apply {
                this.reportMetadata = reportMetadata
            }

            /**
             * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for
             * immediate attention.
             */
            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Technologist notes for the study. Null clears; an array replaces the existing set.
             * Maximum 50 items, each up to 1000 characters
             */
            fun technologistNotes(technologistNotes: List<String>?) =
                technologistNotes(JsonField.ofNullable(technologistNotes))

            /**
             * Alias for calling [Builder.technologistNotes] with `technologistNotes.orElse(null)`.
             */
            fun technologistNotes(technologistNotes: Optional<List<String>>) =
                technologistNotes(technologistNotes.getOrNull())

            /**
             * Sets [Builder.technologistNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.technologistNotes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Imaging technique description provided by the technologist. Null clears. */
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
             * You should usually call [Builder.technologistTechnique] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    assignedTo,
                    clinicalHistory,
                    clinicalIndication,
                    expressCustomerId,
                    externalPatientId,
                    metadata,
                    modality,
                    (priorReports ?: JsonMissing.of()).map { it.toImmutable() },
                    reportMetadata,
                    severity,
                    studyDescription,
                    (technologistNotes ?: JsonMissing.of()).map { it.toImmutable() },
                    technologistTechnique,
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

            assignedTo()
            clinicalHistory()
            clinicalIndication()
            expressCustomerId()
            externalPatientId()
            metadata().ifPresent { it.validate() }
            modality()
            priorReports().ifPresent { it.forEach { it.validate() } }
            reportMetadata().ifPresent { it.validate() }
            severity().ifPresent { it.validate() }
            studyDescription()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (assignedTo.asKnown().isPresent) 1 else 0) +
                (if (clinicalHistory.asKnown().isPresent) 1 else 0) +
                (if (clinicalIndication.asKnown().isPresent) 1 else 0) +
                (if (expressCustomerId.asKnown().isPresent) 1 else 0) +
                (if (externalPatientId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (modality.asKnown().isPresent) 1 else 0) +
                (priorReports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (reportMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyDescription.asKnown().isPresent) 1 else 0) +
                (technologistNotes.asKnown().getOrNull()?.size ?: 0) +
                (if (technologistTechnique.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assignedTo == other.assignedTo &&
                clinicalHistory == other.clinicalHistory &&
                clinicalIndication == other.clinicalIndication &&
                expressCustomerId == other.expressCustomerId &&
                externalPatientId == other.externalPatientId &&
                metadata == other.metadata &&
                modality == other.modality &&
                priorReports == other.priorReports &&
                reportMetadata == other.reportMetadata &&
                severity == other.severity &&
                studyDescription == other.studyDescription &&
                technologistNotes == other.technologistNotes &&
                technologistTechnique == other.technologistTechnique &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assignedTo,
                clinicalHistory,
                clinicalIndication,
                expressCustomerId,
                externalPatientId,
                metadata,
                modality,
                priorReports,
                reportMetadata,
                severity,
                studyDescription,
                technologistNotes,
                technologistTechnique,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assignedTo=$assignedTo, clinicalHistory=$clinicalHistory, clinicalIndication=$clinicalIndication, expressCustomerId=$expressCustomerId, externalPatientId=$externalPatientId, metadata=$metadata, modality=$modality, priorReports=$priorReports, reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, technologistNotes=$technologistNotes, technologistTechnique=$technologistTechnique, additionalProperties=$additionalProperties}"
    }

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

    class ReportMetadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val age: JsonField<String>,
        private val dateOfBirth: JsonField<String>,
        private val facilityName: JsonField<String>,
        private val height: JsonField<Height>,
        private val mrn: JsonField<String>,
        private val patientName: JsonField<String>,
        private val procedure: JsonField<String>,
        private val referringPhysicianName: JsonField<String>,
        private val sex: JsonField<Sex>,
        private val studyDate: JsonField<String>,
        private val studyTime: JsonField<String>,
        private val weight: JsonField<Weight>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("age") @ExcludeMissing age: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateOfBirth")
            @ExcludeMissing
            dateOfBirth: JsonField<String> = JsonMissing.of(),
            @JsonProperty("facilityName")
            @ExcludeMissing
            facilityName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("height") @ExcludeMissing height: JsonField<Height> = JsonMissing.of(),
            @JsonProperty("mrn") @ExcludeMissing mrn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("patientName")
            @ExcludeMissing
            patientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("procedure")
            @ExcludeMissing
            procedure: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referringPhysicianName")
            @ExcludeMissing
            referringPhysicianName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sex") @ExcludeMissing sex: JsonField<Sex> = JsonMissing.of(),
            @JsonProperty("studyDate")
            @ExcludeMissing
            studyDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyTime")
            @ExcludeMissing
            studyTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Weight> = JsonMissing.of(),
        ) : this(
            age,
            dateOfBirth,
            facilityName,
            height,
            mrn,
            patientName,
            procedure,
            referringPhysicianName,
            sex,
            studyDate,
            studyTime,
            weight,
            mutableMapOf(),
        )

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun age(): Optional<String> = age.getOptional("age")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateOfBirth(): Optional<String> = dateOfBirth.getOptional("dateOfBirth")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun facilityName(): Optional<String> = facilityName.getOptional("facilityName")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun height(): Optional<Height> = height.getOptional("height")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mrn(): Optional<String> = mrn.getOptional("mrn")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun patientName(): Optional<String> = patientName.getOptional("patientName")

        /**
         * Procedure or study type. Nullable on PATCH. Maps to DB scan_type and
         * report_header.scan_type.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun procedure(): Optional<String> = procedure.getOptional("procedure")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referringPhysicianName(): Optional<String> =
            referringPhysicianName.getOptional("referringPhysicianName")

        /**
         * Patient's biological sex. Options: 'male', 'female', 'other'
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sex(): Optional<Sex> = sex.getOptional("sex")

        /**
         * Study date (YYYY-MM-DD). Nullable on PATCH. Maps to DB scan_date and
         * report_header.scan_date.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyDate(): Optional<String> = studyDate.getOptional("studyDate")

        /**
         * Study time (HH:MM). Nullable on PATCH. Maps to DB scan_time and report_header.scan_time.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyTime(): Optional<String> = studyTime.getOptional("studyTime")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weight(): Optional<Weight> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [age].
         *
         * Unlike [age], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("age") @ExcludeMissing fun _age(): JsonField<String> = age

        /**
         * Returns the raw JSON value of [dateOfBirth].
         *
         * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateOfBirth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<String> = dateOfBirth

        /**
         * Returns the raw JSON value of [facilityName].
         *
         * Unlike [facilityName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("facilityName")
        @ExcludeMissing
        fun _facilityName(): JsonField<String> = facilityName

        /**
         * Returns the raw JSON value of [height].
         *
         * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Height> = height

        /**
         * Returns the raw JSON value of [mrn].
         *
         * Unlike [mrn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mrn") @ExcludeMissing fun _mrn(): JsonField<String> = mrn

        /**
         * Returns the raw JSON value of [patientName].
         *
         * Unlike [patientName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("patientName")
        @ExcludeMissing
        fun _patientName(): JsonField<String> = patientName

        /**
         * Returns the raw JSON value of [procedure].
         *
         * Unlike [procedure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("procedure") @ExcludeMissing fun _procedure(): JsonField<String> = procedure

        /**
         * Returns the raw JSON value of [referringPhysicianName].
         *
         * Unlike [referringPhysicianName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referringPhysicianName")
        @ExcludeMissing
        fun _referringPhysicianName(): JsonField<String> = referringPhysicianName

        /**
         * Returns the raw JSON value of [sex].
         *
         * Unlike [sex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sex") @ExcludeMissing fun _sex(): JsonField<Sex> = sex

        /**
         * Returns the raw JSON value of [studyDate].
         *
         * Unlike [studyDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("studyDate") @ExcludeMissing fun _studyDate(): JsonField<String> = studyDate

        /**
         * Returns the raw JSON value of [studyTime].
         *
         * Unlike [studyTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("studyTime") @ExcludeMissing fun _studyTime(): JsonField<String> = studyTime

        /**
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Weight> = weight

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

            /** Returns a mutable builder for constructing an instance of [ReportMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReportMetadata]. */
        class Builder internal constructor() {

            private var age: JsonField<String> = JsonMissing.of()
            private var dateOfBirth: JsonField<String> = JsonMissing.of()
            private var facilityName: JsonField<String> = JsonMissing.of()
            private var height: JsonField<Height> = JsonMissing.of()
            private var mrn: JsonField<String> = JsonMissing.of()
            private var patientName: JsonField<String> = JsonMissing.of()
            private var procedure: JsonField<String> = JsonMissing.of()
            private var referringPhysicianName: JsonField<String> = JsonMissing.of()
            private var sex: JsonField<Sex> = JsonMissing.of()
            private var studyDate: JsonField<String> = JsonMissing.of()
            private var studyTime: JsonField<String> = JsonMissing.of()
            private var weight: JsonField<Weight> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reportMetadata: ReportMetadata) = apply {
                age = reportMetadata.age
                dateOfBirth = reportMetadata.dateOfBirth
                facilityName = reportMetadata.facilityName
                height = reportMetadata.height
                mrn = reportMetadata.mrn
                patientName = reportMetadata.patientName
                procedure = reportMetadata.procedure
                referringPhysicianName = reportMetadata.referringPhysicianName
                sex = reportMetadata.sex
                studyDate = reportMetadata.studyDate
                studyTime = reportMetadata.studyTime
                weight = reportMetadata.weight
                additionalProperties = reportMetadata.additionalProperties.toMutableMap()
            }

            fun age(age: String?) = age(JsonField.ofNullable(age))

            /** Alias for calling [Builder.age] with `age.orElse(null)`. */
            fun age(age: Optional<String>) = age(age.getOrNull())

            /**
             * Sets [Builder.age] to an arbitrary JSON value.
             *
             * You should usually call [Builder.age] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun age(age: JsonField<String>) = apply { this.age = age }

            fun dateOfBirth(dateOfBirth: String?) = dateOfBirth(JsonField.ofNullable(dateOfBirth))

            /** Alias for calling [Builder.dateOfBirth] with `dateOfBirth.orElse(null)`. */
            fun dateOfBirth(dateOfBirth: Optional<String>) = dateOfBirth(dateOfBirth.getOrNull())

            /**
             * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfBirth] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfBirth(dateOfBirth: JsonField<String>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            fun facilityName(facilityName: String?) =
                facilityName(JsonField.ofNullable(facilityName))

            /** Alias for calling [Builder.facilityName] with `facilityName.orElse(null)`. */
            fun facilityName(facilityName: Optional<String>) =
                facilityName(facilityName.getOrNull())

            /**
             * Sets [Builder.facilityName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facilityName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun facilityName(facilityName: JsonField<String>) = apply {
                this.facilityName = facilityName
            }

            fun height(height: Height?) = height(JsonField.ofNullable(height))

            /** Alias for calling [Builder.height] with `height.orElse(null)`. */
            fun height(height: Optional<Height>) = height(height.getOrNull())

            /**
             * Sets [Builder.height] to an arbitrary JSON value.
             *
             * You should usually call [Builder.height] with a well-typed [Height] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun height(height: JsonField<Height>) = apply { this.height = height }

            fun mrn(mrn: String?) = mrn(JsonField.ofNullable(mrn))

            /** Alias for calling [Builder.mrn] with `mrn.orElse(null)`. */
            fun mrn(mrn: Optional<String>) = mrn(mrn.getOrNull())

            /**
             * Sets [Builder.mrn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mrn] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mrn(mrn: JsonField<String>) = apply { this.mrn = mrn }

            fun patientName(patientName: String?) = patientName(JsonField.ofNullable(patientName))

            /** Alias for calling [Builder.patientName] with `patientName.orElse(null)`. */
            fun patientName(patientName: Optional<String>) = patientName(patientName.getOrNull())

            /**
             * Sets [Builder.patientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun patientName(patientName: JsonField<String>) = apply {
                this.patientName = patientName
            }

            /**
             * Procedure or study type. Nullable on PATCH. Maps to DB scan_type and
             * report_header.scan_type.
             */
            fun procedure(procedure: String?) = procedure(JsonField.ofNullable(procedure))

            /** Alias for calling [Builder.procedure] with `procedure.orElse(null)`. */
            fun procedure(procedure: Optional<String>) = procedure(procedure.getOrNull())

            /**
             * Sets [Builder.procedure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.procedure] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun procedure(procedure: JsonField<String>) = apply { this.procedure = procedure }

            fun referringPhysicianName(referringPhysicianName: String?) =
                referringPhysicianName(JsonField.ofNullable(referringPhysicianName))

            /**
             * Alias for calling [Builder.referringPhysicianName] with
             * `referringPhysicianName.orElse(null)`.
             */
            fun referringPhysicianName(referringPhysicianName: Optional<String>) =
                referringPhysicianName(referringPhysicianName.getOrNull())

            /**
             * Sets [Builder.referringPhysicianName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referringPhysicianName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referringPhysicianName(referringPhysicianName: JsonField<String>) = apply {
                this.referringPhysicianName = referringPhysicianName
            }

            /** Patient's biological sex. Options: 'male', 'female', 'other' */
            fun sex(sex: Sex?) = sex(JsonField.ofNullable(sex))

            /** Alias for calling [Builder.sex] with `sex.orElse(null)`. */
            fun sex(sex: Optional<Sex>) = sex(sex.getOrNull())

            /**
             * Sets [Builder.sex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sex] with a well-typed [Sex] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sex(sex: JsonField<Sex>) = apply { this.sex = sex }

            /**
             * Study date (YYYY-MM-DD). Nullable on PATCH. Maps to DB scan_date and
             * report_header.scan_date.
             */
            fun studyDate(studyDate: String?) = studyDate(JsonField.ofNullable(studyDate))

            /** Alias for calling [Builder.studyDate] with `studyDate.orElse(null)`. */
            fun studyDate(studyDate: Optional<String>) = studyDate(studyDate.getOrNull())

            /**
             * Sets [Builder.studyDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyDate(studyDate: JsonField<String>) = apply { this.studyDate = studyDate }

            /**
             * Study time (HH:MM). Nullable on PATCH. Maps to DB scan_time and
             * report_header.scan_time.
             */
            fun studyTime(studyTime: String?) = studyTime(JsonField.ofNullable(studyTime))

            /** Alias for calling [Builder.studyTime] with `studyTime.orElse(null)`. */
            fun studyTime(studyTime: Optional<String>) = studyTime(studyTime.getOrNull())

            /**
             * Sets [Builder.studyTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyTime(studyTime: JsonField<String>) = apply { this.studyTime = studyTime }

            fun weight(weight: Weight?) = weight(JsonField.ofNullable(weight))

            /** Alias for calling [Builder.weight] with `weight.orElse(null)`. */
            fun weight(weight: Optional<Weight>) = weight(weight.getOrNull())

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Weight] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun weight(weight: JsonField<Weight>) = apply { this.weight = weight }

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
             * Returns an immutable instance of [ReportMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ReportMetadata =
                ReportMetadata(
                    age,
                    dateOfBirth,
                    facilityName,
                    height,
                    mrn,
                    patientName,
                    procedure,
                    referringPhysicianName,
                    sex,
                    studyDate,
                    studyTime,
                    weight,
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
        fun validate(): ReportMetadata = apply {
            if (validated) {
                return@apply
            }

            age()
            dateOfBirth()
            facilityName()
            height().ifPresent { it.validate() }
            mrn()
            patientName()
            procedure()
            referringPhysicianName()
            sex().ifPresent { it.validate() }
            studyDate()
            studyTime()
            weight().ifPresent { it.validate() }
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
            (if (age.asKnown().isPresent) 1 else 0) +
                (if (dateOfBirth.asKnown().isPresent) 1 else 0) +
                (if (facilityName.asKnown().isPresent) 1 else 0) +
                (height.asKnown().getOrNull()?.validity() ?: 0) +
                (if (mrn.asKnown().isPresent) 1 else 0) +
                (if (patientName.asKnown().isPresent) 1 else 0) +
                (if (procedure.asKnown().isPresent) 1 else 0) +
                (if (referringPhysicianName.asKnown().isPresent) 1 else 0) +
                (sex.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyDate.asKnown().isPresent) 1 else 0) +
                (if (studyTime.asKnown().isPresent) 1 else 0) +
                (weight.asKnown().getOrNull()?.validity() ?: 0)

        class Height
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<HeightUnit>,
            private val value: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit")
                @ExcludeMissing
                unit: JsonField<HeightUnit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * Unit of measure for a height value. 'in' = inches, 'cm' = centimeters.
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): HeightUnit = unit.getRequired("unit")

            /**
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Double = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<HeightUnit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                 * Returns a mutable builder for constructing an instance of [Height].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Height]. */
            class Builder internal constructor() {

                private var unit: JsonField<HeightUnit>? = null
                private var value: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(height: Height) = apply {
                    unit = height.unit
                    value = height.value
                    additionalProperties = height.additionalProperties.toMutableMap()
                }

                /** Unit of measure for a height value. 'in' = inches, 'cm' = centimeters. */
                fun unit(unit: HeightUnit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [HeightUnit] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unit(unit: JsonField<HeightUnit>) = apply { this.unit = unit }

                fun value(value: Double) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Height].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Height =
                    Height(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws AvaraInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Height = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
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
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Height &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Height{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        class Weight
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<WeightUnit>,
            private val value: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit")
                @ExcludeMissing
                unit: JsonField<WeightUnit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * Unit of measure for a weight value. 'lbs' = pounds, 'kg' = kilograms.
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): WeightUnit = unit.getRequired("unit")

            /**
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Double = value.getRequired("value")

            /**
             * Returns the raw JSON value of [unit].
             *
             * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<WeightUnit> = unit

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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
                 * Returns a mutable builder for constructing an instance of [Weight].
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Weight]. */
            class Builder internal constructor() {

                private var unit: JsonField<WeightUnit>? = null
                private var value: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weight: Weight) = apply {
                    unit = weight.unit
                    value = weight.value
                    additionalProperties = weight.additionalProperties.toMutableMap()
                }

                /** Unit of measure for a weight value. 'lbs' = pounds, 'kg' = kilograms. */
                fun unit(unit: WeightUnit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [WeightUnit] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unit(unit: JsonField<WeightUnit>) = apply { this.unit = unit }

                fun value(value: Double) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Weight].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .unit()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Weight =
                    Weight(
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws AvaraInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Weight = apply {
                if (validated) {
                    return@apply
                }

                unit().validate()
                value()
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
                (unit.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Weight &&
                    unit == other.unit &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(unit, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Weight{unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReportMetadata &&
                age == other.age &&
                dateOfBirth == other.dateOfBirth &&
                facilityName == other.facilityName &&
                height == other.height &&
                mrn == other.mrn &&
                patientName == other.patientName &&
                procedure == other.procedure &&
                referringPhysicianName == other.referringPhysicianName &&
                sex == other.sex &&
                studyDate == other.studyDate &&
                studyTime == other.studyTime &&
                weight == other.weight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                age,
                dateOfBirth,
                facilityName,
                height,
                mrn,
                patientName,
                procedure,
                referringPhysicianName,
                sex,
                studyDate,
                studyTime,
                weight,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReportMetadata{age=$age, dateOfBirth=$dateOfBirth, facilityName=$facilityName, height=$height, mrn=$mrn, patientName=$patientName, procedure=$procedure, referringPhysicianName=$referringPhysicianName, sex=$sex, studyDate=$studyDate, studyTime=$studyTime, weight=$weight, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyUpdateParams &&
            studyId == other.studyId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(studyId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StudyUpdateParams{studyId=$studyId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
