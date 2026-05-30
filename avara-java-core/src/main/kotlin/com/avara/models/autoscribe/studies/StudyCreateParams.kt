// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.Enum
import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.Params
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new study in the AutoScribe system with DICOM metadata and report generation
 * information. The study can include patient demographics, scan details, clinical context
 * (indication, history, technologist technique/notes), an imaging modality, an external patient
 * identifier for linking studies, and external prior reports for comparison context.
 */
class StudyCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Patient demographics and scan information for report generation
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportMetadata(): StudyReportMetadata = body.reportMetadata()

    /**
     * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun severity(): Severity = body.severity()

    /**
     * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyDescription(): String = body.studyDescription()

    /**
     * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
     * '1.2.840.10008.5.1.4.1.1.2')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = body.studyInstanceUid()

    /**
     * User ID to assign the study to. Format: usr_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<String> = body.assignedTo()

    /**
     * Relevant clinical history for the patient/study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalHistory(): Optional<String> = body.clinicalHistory()

    /**
     * Clinical indication for the study (reason the study was ordered)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalIndication(): Optional<String> = body.clinicalIndication()

    /**
     * Express customer ID for the study. Format: cus_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomerId(): Optional<String> = body.expressCustomerId()

    /**
     * Integrator-provided stable patient identifier used to link studies for the same patient
     * across the AutoScribe system
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPatientId(): Optional<String> = body.externalPatientId()

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Imaging modality for the study (free text, e.g., 'CT', 'MRI', 'X-Ray')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modality(): Optional<String> = body.modality()

    /**
     * External prior reports (metadata + full report text) to provide longitudinal/comparison
     * context for this study. Maximum 50 items
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorReports(): Optional<List<PriorReport>> = body.priorReports()

    /**
     * Technologist notes for the study. Maximum 50 items, each up to 1000 characters
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistNotes(): Optional<List<String>> = body.technologistNotes()

    /**
     * Imaging technique description provided by the technologist
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistTechnique(): Optional<String> = body.technologistTechnique()

    /**
     * Returns the raw JSON value of [reportMetadata].
     *
     * Unlike [reportMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportMetadata(): JsonField<StudyReportMetadata> = body._reportMetadata()

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
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _studyInstanceUid(): JsonField<String> = body._studyInstanceUid()

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

        /**
         * Returns a mutable builder for constructing an instance of [StudyCreateParams].
         *
         * The following fields are required:
         * ```java
         * .reportMetadata()
         * .severity()
         * .studyDescription()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(studyCreateParams: StudyCreateParams) = apply {
            body = studyCreateParams.body.toBuilder()
            additionalHeaders = studyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = studyCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [reportMetadata]
         * - [severity]
         * - [studyDescription]
         * - [studyInstanceUid]
         * - [assignedTo]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Patient demographics and scan information for report generation */
        fun reportMetadata(reportMetadata: StudyReportMetadata) = apply {
            body.reportMetadata(reportMetadata)
        }

        /**
         * Sets [Builder.reportMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportMetadata] with a well-typed [StudyReportMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reportMetadata(reportMetadata: JsonField<StudyReportMetadata>) = apply {
            body.reportMetadata(reportMetadata)
        }

        /**
         * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for
         * immediate attention
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
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         */
        fun studyInstanceUid(studyInstanceUid: String) = apply {
            body.studyInstanceUid(studyInstanceUid)
        }

        /**
         * Sets [Builder.studyInstanceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyInstanceUid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
            body.studyInstanceUid(studyInstanceUid)
        }

        /** User ID to assign the study to. Format: usr_{32-hex-chars} */
        fun assignedTo(assignedTo: String) = apply { body.assignedTo(assignedTo) }

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedTo(assignedTo: JsonField<String>) = apply { body.assignedTo(assignedTo) }

        /** Relevant clinical history for the patient/study */
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

        /** Clinical indication for the study (reason the study was ordered) */
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

        /** Express customer ID for the study. Format: cus_{32-hex-chars} */
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
         * Integrator-provided stable patient identifier used to link studies for the same patient
         * across the AutoScribe system
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

        /**
         * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values
         * up to 1000 chars
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Imaging modality for the study (free text, e.g., 'CT', 'MRI', 'X-Ray') */
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
         * External prior reports (metadata + full report text) to provide longitudinal/comparison
         * context for this study. Maximum 50 items
         */
        fun priorReports(priorReports: List<PriorReport>) = apply {
            body.priorReports(priorReports)
        }

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

        /** Technologist notes for the study. Maximum 50 items, each up to 1000 characters */
        fun technologistNotes(technologistNotes: List<String>) = apply {
            body.technologistNotes(technologistNotes)
        }

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

        /** Imaging technique description provided by the technologist */
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
         * Returns an immutable instance of [StudyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .reportMetadata()
         * .severity()
         * .studyDescription()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyCreateParams =
            StudyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for creating a study in AutoScribe */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reportMetadata: JsonField<StudyReportMetadata>,
        private val severity: JsonField<Severity>,
        private val studyDescription: JsonField<String>,
        private val studyInstanceUid: JsonField<String>,
        private val assignedTo: JsonField<String>,
        private val clinicalHistory: JsonField<String>,
        private val clinicalIndication: JsonField<String>,
        private val expressCustomerId: JsonField<String>,
        private val externalPatientId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val modality: JsonField<String>,
        private val priorReports: JsonField<List<PriorReport>>,
        private val technologistNotes: JsonField<List<String>>,
        private val technologistTechnique: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reportMetadata")
            @ExcludeMissing
            reportMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("studyDescription")
            @ExcludeMissing
            studyDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            studyInstanceUid: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("technologistNotes")
            @ExcludeMissing
            technologistNotes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("technologistTechnique")
            @ExcludeMissing
            technologistTechnique: JsonField<String> = JsonMissing.of(),
        ) : this(
            reportMetadata,
            severity,
            studyDescription,
            studyInstanceUid,
            assignedTo,
            clinicalHistory,
            clinicalIndication,
            expressCustomerId,
            externalPatientId,
            metadata,
            modality,
            priorReports,
            technologistNotes,
            technologistTechnique,
            mutableMapOf(),
        )

        /**
         * Patient demographics and scan information for report generation
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reportMetadata(): StudyReportMetadata = reportMetadata.getRequired("reportMetadata")

        /**
         * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for
         * immediate attention
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun severity(): Severity = severity.getRequired("severity")

        /**
         * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyDescription(): String = studyDescription.getRequired("studyDescription")

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

        /**
         * User ID to assign the study to. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignedTo(): Optional<String> = assignedTo.getOptional("assignedTo")

        /**
         * Relevant clinical history for the patient/study
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clinicalHistory(): Optional<String> = clinicalHistory.getOptional("clinicalHistory")

        /**
         * Clinical indication for the study (reason the study was ordered)
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clinicalIndication(): Optional<String> =
            clinicalIndication.getOptional("clinicalIndication")

        /**
         * Express customer ID for the study. Format: cus_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expressCustomerId(): Optional<String> =
            expressCustomerId.getOptional("expressCustomerId")

        /**
         * Integrator-provided stable patient identifier used to link studies for the same patient
         * across the AutoScribe system
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPatientId(): Optional<String> =
            externalPatientId.getOptional("externalPatientId")

        /**
         * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values
         * up to 1000 chars
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Imaging modality for the study (free text, e.g., 'CT', 'MRI', 'X-Ray')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modality(): Optional<String> = modality.getOptional("modality")

        /**
         * External prior reports (metadata + full report text) to provide longitudinal/comparison
         * context for this study. Maximum 50 items
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priorReports(): Optional<List<PriorReport>> = priorReports.getOptional("priorReports")

        /**
         * Technologist notes for the study. Maximum 50 items, each up to 1000 characters
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun technologistNotes(): Optional<List<String>> =
            technologistNotes.getOptional("technologistNotes")

        /**
         * Imaging technique description provided by the technologist
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun technologistTechnique(): Optional<String> =
            technologistTechnique.getOptional("technologistTechnique")

        /**
         * Returns the raw JSON value of [reportMetadata].
         *
         * Unlike [reportMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [studyInstanceUid].
         *
         * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .reportMetadata()
             * .severity()
             * .studyDescription()
             * .studyInstanceUid()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var reportMetadata: JsonField<StudyReportMetadata>? = null
            private var severity: JsonField<Severity>? = null
            private var studyDescription: JsonField<String>? = null
            private var studyInstanceUid: JsonField<String>? = null
            private var assignedTo: JsonField<String> = JsonMissing.of()
            private var clinicalHistory: JsonField<String> = JsonMissing.of()
            private var clinicalIndication: JsonField<String> = JsonMissing.of()
            private var expressCustomerId: JsonField<String> = JsonMissing.of()
            private var externalPatientId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modality: JsonField<String> = JsonMissing.of()
            private var priorReports: JsonField<MutableList<PriorReport>>? = null
            private var technologistNotes: JsonField<MutableList<String>>? = null
            private var technologistTechnique: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                reportMetadata = body.reportMetadata
                severity = body.severity
                studyDescription = body.studyDescription
                studyInstanceUid = body.studyInstanceUid
                assignedTo = body.assignedTo
                clinicalHistory = body.clinicalHistory
                clinicalIndication = body.clinicalIndication
                expressCustomerId = body.expressCustomerId
                externalPatientId = body.externalPatientId
                metadata = body.metadata
                modality = body.modality
                priorReports = body.priorReports.map { it.toMutableList() }
                technologistNotes = body.technologistNotes.map { it.toMutableList() }
                technologistTechnique = body.technologistTechnique
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Patient demographics and scan information for report generation */
            fun reportMetadata(reportMetadata: StudyReportMetadata) =
                reportMetadata(JsonField.of(reportMetadata))

            /**
             * Sets [Builder.reportMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportMetadata] with a well-typed
             * [StudyReportMetadata] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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

            /** User ID to assign the study to. Format: usr_{32-hex-chars} */
            fun assignedTo(assignedTo: String) = assignedTo(JsonField.of(assignedTo))

            /**
             * Sets [Builder.assignedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

            /** Relevant clinical history for the patient/study */
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

            /** Clinical indication for the study (reason the study was ordered) */
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

            /** Express customer ID for the study. Format: cus_{32-hex-chars} */
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
             * patient across the AutoScribe system
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

            /**
             * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars,
             * values up to 1000 chars
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Imaging modality for the study (free text, e.g., 'CT', 'MRI', 'X-Ray') */
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
             * External prior reports (metadata + full report text) to provide
             * longitudinal/comparison context for this study. Maximum 50 items
             */
            fun priorReports(priorReports: List<PriorReport>) =
                priorReports(JsonField.of(priorReports))

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

            /** Technologist notes for the study. Maximum 50 items, each up to 1000 characters */
            fun technologistNotes(technologistNotes: List<String>) =
                technologistNotes(JsonField.of(technologistNotes))

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

            /** Imaging technique description provided by the technologist */
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
             *
             * The following fields are required:
             * ```java
             * .reportMetadata()
             * .severity()
             * .studyDescription()
             * .studyInstanceUid()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("reportMetadata", reportMetadata),
                    checkRequired("severity", severity),
                    checkRequired("studyDescription", studyDescription),
                    checkRequired("studyInstanceUid", studyInstanceUid),
                    assignedTo,
                    clinicalHistory,
                    clinicalIndication,
                    expressCustomerId,
                    externalPatientId,
                    metadata,
                    modality,
                    (priorReports ?: JsonMissing.of()).map { it.toImmutable() },
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

            reportMetadata().validate()
            severity().validate()
            studyDescription()
            studyInstanceUid()
            assignedTo()
            clinicalHistory()
            clinicalIndication()
            expressCustomerId()
            externalPatientId()
            metadata().ifPresent { it.validate() }
            modality()
            priorReports().ifPresent { it.forEach { it.validate() } }
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
            (reportMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyDescription.asKnown().isPresent) 1 else 0) +
                (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
                (if (assignedTo.asKnown().isPresent) 1 else 0) +
                (if (clinicalHistory.asKnown().isPresent) 1 else 0) +
                (if (clinicalIndication.asKnown().isPresent) 1 else 0) +
                (if (expressCustomerId.asKnown().isPresent) 1 else 0) +
                (if (externalPatientId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (modality.asKnown().isPresent) 1 else 0) +
                (priorReports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (technologistNotes.asKnown().getOrNull()?.size ?: 0) +
                (if (technologistTechnique.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                reportMetadata == other.reportMetadata &&
                severity == other.severity &&
                studyDescription == other.studyDescription &&
                studyInstanceUid == other.studyInstanceUid &&
                assignedTo == other.assignedTo &&
                clinicalHistory == other.clinicalHistory &&
                clinicalIndication == other.clinicalIndication &&
                expressCustomerId == other.expressCustomerId &&
                externalPatientId == other.externalPatientId &&
                metadata == other.metadata &&
                modality == other.modality &&
                priorReports == other.priorReports &&
                technologistNotes == other.technologistNotes &&
                technologistTechnique == other.technologistTechnique &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                reportMetadata,
                severity,
                studyDescription,
                studyInstanceUid,
                assignedTo,
                clinicalHistory,
                clinicalIndication,
                expressCustomerId,
                externalPatientId,
                metadata,
                modality,
                priorReports,
                technologistNotes,
                technologistTechnique,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, studyInstanceUid=$studyInstanceUid, assignedTo=$assignedTo, clinicalHistory=$clinicalHistory, clinicalIndication=$clinicalIndication, expressCustomerId=$expressCustomerId, externalPatientId=$externalPatientId, metadata=$metadata, modality=$modality, priorReports=$priorReports, technologistNotes=$technologistNotes, technologistTechnique=$technologistTechnique, additionalProperties=$additionalProperties}"
    }

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

    /** External prior report metadata and text stored on a study */
    class PriorReport
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reportText: JsonField<String>,
        private val externalStudyId: JsonField<String>,
        private val modality: JsonField<String>,
        private val studyDate: JsonField<String>,
        private val studyDescription: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reportText")
            @ExcludeMissing
            reportText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externalStudyId")
            @ExcludeMissing
            externalStudyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modality")
            @ExcludeMissing
            modality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyDate")
            @ExcludeMissing
            studyDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyDescription")
            @ExcludeMissing
            studyDescription: JsonField<String> = JsonMissing.of(),
        ) : this(reportText, externalStudyId, modality, studyDate, studyDescription, mutableMapOf())

        /**
         * Full prior report text
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reportText(): String = reportText.getRequired("reportText")

        /**
         * Integrator's external study identifier
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalStudyId(): Optional<String> = externalStudyId.getOptional("externalStudyId")

        /**
         * Imaging modality for the prior study
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modality(): Optional<String> = modality.getOptional("modality")

        /**
         * Prior study date (YYYY-MM-DD)
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyDate(): Optional<String> = studyDate.getOptional("studyDate")

        /**
         * Description of the prior study
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyDescription(): Optional<String> = studyDescription.getOptional("studyDescription")

        /**
         * Returns the raw JSON value of [reportText].
         *
         * Unlike [reportText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reportText")
        @ExcludeMissing
        fun _reportText(): JsonField<String> = reportText

        /**
         * Returns the raw JSON value of [externalStudyId].
         *
         * Unlike [externalStudyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("externalStudyId")
        @ExcludeMissing
        fun _externalStudyId(): JsonField<String> = externalStudyId

        /**
         * Returns the raw JSON value of [modality].
         *
         * Unlike [modality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modality") @ExcludeMissing fun _modality(): JsonField<String> = modality

        /**
         * Returns the raw JSON value of [studyDate].
         *
         * Unlike [studyDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("studyDate") @ExcludeMissing fun _studyDate(): JsonField<String> = studyDate

        /**
         * Returns the raw JSON value of [studyDescription].
         *
         * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("studyDescription")
        @ExcludeMissing
        fun _studyDescription(): JsonField<String> = studyDescription

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
             * Returns a mutable builder for constructing an instance of [PriorReport].
             *
             * The following fields are required:
             * ```java
             * .reportText()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PriorReport]. */
        class Builder internal constructor() {

            private var reportText: JsonField<String>? = null
            private var externalStudyId: JsonField<String> = JsonMissing.of()
            private var modality: JsonField<String> = JsonMissing.of()
            private var studyDate: JsonField<String> = JsonMissing.of()
            private var studyDescription: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priorReport: PriorReport) = apply {
                reportText = priorReport.reportText
                externalStudyId = priorReport.externalStudyId
                modality = priorReport.modality
                studyDate = priorReport.studyDate
                studyDescription = priorReport.studyDescription
                additionalProperties = priorReport.additionalProperties.toMutableMap()
            }

            /** Full prior report text */
            fun reportText(reportText: String) = reportText(JsonField.of(reportText))

            /**
             * Sets [Builder.reportText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportText(reportText: JsonField<String>) = apply { this.reportText = reportText }

            /** Integrator's external study identifier */
            fun externalStudyId(externalStudyId: String) =
                externalStudyId(JsonField.of(externalStudyId))

            /**
             * Sets [Builder.externalStudyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalStudyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalStudyId(externalStudyId: JsonField<String>) = apply {
                this.externalStudyId = externalStudyId
            }

            /** Imaging modality for the prior study */
            fun modality(modality: String) = modality(JsonField.of(modality))

            /**
             * Sets [Builder.modality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modality(modality: JsonField<String>) = apply { this.modality = modality }

            /** Prior study date (YYYY-MM-DD) */
            fun studyDate(studyDate: String) = studyDate(JsonField.of(studyDate))

            /**
             * Sets [Builder.studyDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyDate(studyDate: JsonField<String>) = apply { this.studyDate = studyDate }

            /** Description of the prior study */
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
             * Returns an immutable instance of [PriorReport].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reportText()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PriorReport =
                PriorReport(
                    checkRequired("reportText", reportText),
                    externalStudyId,
                    modality,
                    studyDate,
                    studyDescription,
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
        fun validate(): PriorReport = apply {
            if (validated) {
                return@apply
            }

            reportText()
            externalStudyId()
            modality()
            studyDate()
            studyDescription()
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
            (if (reportText.asKnown().isPresent) 1 else 0) +
                (if (externalStudyId.asKnown().isPresent) 1 else 0) +
                (if (modality.asKnown().isPresent) 1 else 0) +
                (if (studyDate.asKnown().isPresent) 1 else 0) +
                (if (studyDescription.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PriorReport &&
                reportText == other.reportText &&
                externalStudyId == other.externalStudyId &&
                modality == other.modality &&
                studyDate == other.studyDate &&
                studyDescription == other.studyDescription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                reportText,
                externalStudyId,
                modality,
                studyDate,
                studyDescription,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriorReport{reportText=$reportText, externalStudyId=$externalStudyId, modality=$modality, studyDate=$studyDate, studyDescription=$studyDescription, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StudyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
