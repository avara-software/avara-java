// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.Params
import com.avara.core.checkRequired
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.Severity
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
 * Creates an archive (external) AutoScribe study. Clinical context fields are not accepted. If no
 * report fields are sent, no report row is created. Study create is all-or-nothing, including file
 * ingest.
 */
class ExternalCreateParams
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
     * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention.
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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomerId(): Optional<String> = body.expressCustomerId()

    /**
     * Strongly recommended if you want to leverage priors functionality for future reads for this
     * patient.
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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modality(): Optional<String> = body.modality()

    /**
     * Optional original reader / author name. Shown as-is. May be set on study create or a later
     * report create; a later create overwrites it when provided.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readerName(): Optional<String> = body.readerName()

    /**
     * File name including extension. Required when reportFileUrl is provided. Supported types: PDF,
     * PNG, JPG, GIF, WEBP.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportFileName(): Optional<String> = body.reportFileName()

    /**
     * HTTPS download URL for a PDF or image (PNG, JPG, GIF, WEBP). Not used for AI tooling; the
     * reader can still access it. Avara fetches this URL server-side. If omitted, you can add it
     * later. Once set, it cannot be edited; delete the study to remake it. Whitelist
     * https://api.avarasoftware.com on the file host if the fetch is origin-restricted.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportFileUrl(): Optional<String> = body.reportFileUrl()

    /**
     * When this study is used as a prior, report AI tools leverage this text directly. If omitted,
     * you can add it later via POST /studies/external/reports. Once set, it cannot be edited;
     * delete the study to remake it.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportText(): Optional<String> = body.reportText()

    /**
     * Optional original sign-off timestamp or label. Shown as-is with no format validation. May be
     * set on study create or a later report create; a later create overwrites it when provided.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedAt(): Optional<String> = body.signedAt()

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
     * Returns the raw JSON value of [readerName].
     *
     * Unlike [readerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readerName(): JsonField<String> = body._readerName()

    /**
     * Returns the raw JSON value of [reportFileName].
     *
     * Unlike [reportFileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportFileName(): JsonField<String> = body._reportFileName()

    /**
     * Returns the raw JSON value of [reportFileUrl].
     *
     * Unlike [reportFileUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportFileUrl(): JsonField<String> = body._reportFileUrl()

    /**
     * Returns the raw JSON value of [reportText].
     *
     * Unlike [reportText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reportText(): JsonField<String> = body._reportText()

    /**
     * Returns the raw JSON value of [signedAt].
     *
     * Unlike [signedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signedAt(): JsonField<String> = body._signedAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalCreateParams].
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

    /** A builder for [ExternalCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalCreateParams: ExternalCreateParams) = apply {
            body = externalCreateParams.body.toBuilder()
            additionalHeaders = externalCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalCreateParams.additionalQueryParams.toBuilder()
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
         * - [expressCustomerId]
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
         * Strongly recommended if you want to leverage priors functionality for future reads for
         * this patient.
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
         * Optional original reader / author name. Shown as-is. May be set on study create or a
         * later report create; a later create overwrites it when provided.
         */
        fun readerName(readerName: String) = apply { body.readerName(readerName) }

        /**
         * Sets [Builder.readerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readerName(readerName: JsonField<String>) = apply { body.readerName(readerName) }

        /**
         * File name including extension. Required when reportFileUrl is provided. Supported types:
         * PDF, PNG, JPG, GIF, WEBP.
         */
        fun reportFileName(reportFileName: String) = apply { body.reportFileName(reportFileName) }

        /**
         * Sets [Builder.reportFileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportFileName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportFileName(reportFileName: JsonField<String>) = apply {
            body.reportFileName(reportFileName)
        }

        /**
         * HTTPS download URL for a PDF or image (PNG, JPG, GIF, WEBP). Not used for AI tooling; the
         * reader can still access it. Avara fetches this URL server-side. If omitted, you can add
         * it later. Once set, it cannot be edited; delete the study to remake it. Whitelist
         * https://api.avarasoftware.com on the file host if the fetch is origin-restricted.
         */
        fun reportFileUrl(reportFileUrl: String) = apply { body.reportFileUrl(reportFileUrl) }

        /**
         * Sets [Builder.reportFileUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportFileUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportFileUrl(reportFileUrl: JsonField<String>) = apply {
            body.reportFileUrl(reportFileUrl)
        }

        /**
         * When this study is used as a prior, report AI tools leverage this text directly. If
         * omitted, you can add it later via POST /studies/external/reports. Once set, it cannot be
         * edited; delete the study to remake it.
         */
        fun reportText(reportText: String) = apply { body.reportText(reportText) }

        /**
         * Sets [Builder.reportText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportText(reportText: JsonField<String>) = apply { body.reportText(reportText) }

        /**
         * Optional original sign-off timestamp or label. Shown as-is with no format validation. May
         * be set on study create or a later report create; a later create overwrites it when
         * provided.
         */
        fun signedAt(signedAt: String) = apply { body.signedAt(signedAt) }

        /**
         * Sets [Builder.signedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedAt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signedAt(signedAt: JsonField<String>) = apply { body.signedAt(signedAt) }

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
         * Returns an immutable instance of [ExternalCreateParams].
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
        fun build(): ExternalCreateParams =
            ExternalCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Create an external (archive) AutoScribe study. Clinical context fields are not accepted. If
     * no report fields are sent, no report row is created.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reportMetadata: JsonField<StudyReportMetadata>,
        private val severity: JsonField<Severity>,
        private val studyDescription: JsonField<String>,
        private val studyInstanceUid: JsonField<String>,
        private val expressCustomerId: JsonField<String>,
        private val externalPatientId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val modality: JsonField<String>,
        private val readerName: JsonField<String>,
        private val reportFileName: JsonField<String>,
        private val reportFileUrl: JsonField<String>,
        private val reportText: JsonField<String>,
        private val signedAt: JsonField<String>,
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
            @JsonProperty("readerName")
            @ExcludeMissing
            readerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reportFileName")
            @ExcludeMissing
            reportFileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reportFileUrl")
            @ExcludeMissing
            reportFileUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reportText")
            @ExcludeMissing
            reportText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signedAt") @ExcludeMissing signedAt: JsonField<String> = JsonMissing.of(),
        ) : this(
            reportMetadata,
            severity,
            studyDescription,
            studyInstanceUid,
            expressCustomerId,
            externalPatientId,
            metadata,
            modality,
            readerName,
            reportFileName,
            reportFileUrl,
            reportText,
            signedAt,
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
         * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
         * attention.
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
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expressCustomerId(): Optional<String> =
            expressCustomerId.getOptional("expressCustomerId")

        /**
         * Strongly recommended if you want to leverage priors functionality for future reads for
         * this patient.
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
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modality(): Optional<String> = modality.getOptional("modality")

        /**
         * Optional original reader / author name. Shown as-is. May be set on study create or a
         * later report create; a later create overwrites it when provided.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun readerName(): Optional<String> = readerName.getOptional("readerName")

        /**
         * File name including extension. Required when reportFileUrl is provided. Supported types:
         * PDF, PNG, JPG, GIF, WEBP.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportFileName(): Optional<String> = reportFileName.getOptional("reportFileName")

        /**
         * HTTPS download URL for a PDF or image (PNG, JPG, GIF, WEBP). Not used for AI tooling; the
         * reader can still access it. Avara fetches this URL server-side. If omitted, you can add
         * it later. Once set, it cannot be edited; delete the study to remake it. Whitelist
         * https://api.avarasoftware.com on the file host if the fetch is origin-restricted.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportFileUrl(): Optional<String> = reportFileUrl.getOptional("reportFileUrl")

        /**
         * When this study is used as a prior, report AI tools leverage this text directly. If
         * omitted, you can add it later via POST /studies/external/reports. Once set, it cannot be
         * edited; delete the study to remake it.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportText(): Optional<String> = reportText.getOptional("reportText")

        /**
         * Optional original sign-off timestamp or label. Shown as-is with no format validation. May
         * be set on study create or a later report create; a later create overwrites it when
         * provided.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signedAt(): Optional<String> = signedAt.getOptional("signedAt")

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
         * Returns the raw JSON value of [readerName].
         *
         * Unlike [readerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("readerName")
        @ExcludeMissing
        fun _readerName(): JsonField<String> = readerName

        /**
         * Returns the raw JSON value of [reportFileName].
         *
         * Unlike [reportFileName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reportFileName")
        @ExcludeMissing
        fun _reportFileName(): JsonField<String> = reportFileName

        /**
         * Returns the raw JSON value of [reportFileUrl].
         *
         * Unlike [reportFileUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reportFileUrl")
        @ExcludeMissing
        fun _reportFileUrl(): JsonField<String> = reportFileUrl

        /**
         * Returns the raw JSON value of [reportText].
         *
         * Unlike [reportText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reportText")
        @ExcludeMissing
        fun _reportText(): JsonField<String> = reportText

        /**
         * Returns the raw JSON value of [signedAt].
         *
         * Unlike [signedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signedAt") @ExcludeMissing fun _signedAt(): JsonField<String> = signedAt

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
            private var expressCustomerId: JsonField<String> = JsonMissing.of()
            private var externalPatientId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modality: JsonField<String> = JsonMissing.of()
            private var readerName: JsonField<String> = JsonMissing.of()
            private var reportFileName: JsonField<String> = JsonMissing.of()
            private var reportFileUrl: JsonField<String> = JsonMissing.of()
            private var reportText: JsonField<String> = JsonMissing.of()
            private var signedAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                reportMetadata = body.reportMetadata
                severity = body.severity
                studyDescription = body.studyDescription
                studyInstanceUid = body.studyInstanceUid
                expressCustomerId = body.expressCustomerId
                externalPatientId = body.externalPatientId
                metadata = body.metadata
                modality = body.modality
                readerName = body.readerName
                reportFileName = body.reportFileName
                reportFileUrl = body.reportFileUrl
                reportText = body.reportText
                signedAt = body.signedAt
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
             * Strongly recommended if you want to leverage priors functionality for future reads
             * for this patient.
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
             * Optional original reader / author name. Shown as-is. May be set on study create or a
             * later report create; a later create overwrites it when provided.
             */
            fun readerName(readerName: String) = readerName(JsonField.of(readerName))

            /**
             * Sets [Builder.readerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readerName(readerName: JsonField<String>) = apply { this.readerName = readerName }

            /**
             * File name including extension. Required when reportFileUrl is provided. Supported
             * types: PDF, PNG, JPG, GIF, WEBP.
             */
            fun reportFileName(reportFileName: String) =
                reportFileName(JsonField.of(reportFileName))

            /**
             * Sets [Builder.reportFileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportFileName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportFileName(reportFileName: JsonField<String>) = apply {
                this.reportFileName = reportFileName
            }

            /**
             * HTTPS download URL for a PDF or image (PNG, JPG, GIF, WEBP). Not used for AI tooling;
             * the reader can still access it. Avara fetches this URL server-side. If omitted, you
             * can add it later. Once set, it cannot be edited; delete the study to remake it.
             * Whitelist https://api.avarasoftware.com on the file host if the fetch is
             * origin-restricted.
             */
            fun reportFileUrl(reportFileUrl: String) = reportFileUrl(JsonField.of(reportFileUrl))

            /**
             * Sets [Builder.reportFileUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportFileUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportFileUrl(reportFileUrl: JsonField<String>) = apply {
                this.reportFileUrl = reportFileUrl
            }

            /**
             * When this study is used as a prior, report AI tools leverage this text directly. If
             * omitted, you can add it later via POST /studies/external/reports. Once set, it cannot
             * be edited; delete the study to remake it.
             */
            fun reportText(reportText: String) = reportText(JsonField.of(reportText))

            /**
             * Sets [Builder.reportText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportText(reportText: JsonField<String>) = apply { this.reportText = reportText }

            /**
             * Optional original sign-off timestamp or label. Shown as-is with no format validation.
             * May be set on study create or a later report create; a later create overwrites it
             * when provided.
             */
            fun signedAt(signedAt: String) = signedAt(JsonField.of(signedAt))

            /**
             * Sets [Builder.signedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signedAt(signedAt: JsonField<String>) = apply { this.signedAt = signedAt }

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
                    expressCustomerId,
                    externalPatientId,
                    metadata,
                    modality,
                    readerName,
                    reportFileName,
                    reportFileUrl,
                    reportText,
                    signedAt,
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
            expressCustomerId()
            externalPatientId()
            metadata().ifPresent { it.validate() }
            modality()
            readerName()
            reportFileName()
            reportFileUrl()
            reportText()
            signedAt()
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
                (if (expressCustomerId.asKnown().isPresent) 1 else 0) +
                (if (externalPatientId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (modality.asKnown().isPresent) 1 else 0) +
                (if (readerName.asKnown().isPresent) 1 else 0) +
                (if (reportFileName.asKnown().isPresent) 1 else 0) +
                (if (reportFileUrl.asKnown().isPresent) 1 else 0) +
                (if (reportText.asKnown().isPresent) 1 else 0) +
                (if (signedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                reportMetadata == other.reportMetadata &&
                severity == other.severity &&
                studyDescription == other.studyDescription &&
                studyInstanceUid == other.studyInstanceUid &&
                expressCustomerId == other.expressCustomerId &&
                externalPatientId == other.externalPatientId &&
                metadata == other.metadata &&
                modality == other.modality &&
                readerName == other.readerName &&
                reportFileName == other.reportFileName &&
                reportFileUrl == other.reportFileUrl &&
                reportText == other.reportText &&
                signedAt == other.signedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                reportMetadata,
                severity,
                studyDescription,
                studyInstanceUid,
                expressCustomerId,
                externalPatientId,
                metadata,
                modality,
                readerName,
                reportFileName,
                reportFileUrl,
                reportText,
                signedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, studyInstanceUid=$studyInstanceUid, expressCustomerId=$expressCustomerId, externalPatientId=$externalPatientId, metadata=$metadata, modality=$modality, readerName=$readerName, reportFileName=$reportFileName, reportFileUrl=$reportFileUrl, reportText=$reportText, signedAt=$signedAt, additionalProperties=$additionalProperties}"
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

        return other is ExternalCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
