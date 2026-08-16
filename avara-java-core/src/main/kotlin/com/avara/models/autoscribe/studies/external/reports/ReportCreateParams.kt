// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.Params
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Attach or fill missing report fields on an existing external study. Text and file are write-once.
 * readerName and signedAt overwrite when provided.
 */
class ReportCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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
     * Unique study identifier. Format: stu_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyId(): Optional<String> = body.studyId()

    /**
     * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
     * '1.2.840.10008.5.1.4.1.1.2')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyInstanceUid(): Optional<String> = body.studyInstanceUid()

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

    /**
     * Returns the raw JSON value of [studyId].
     *
     * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _studyId(): JsonField<String> = body._studyId()

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _studyInstanceUid(): JsonField<String> = body._studyInstanceUid()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReportCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ReportCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reportCreateParams: ReportCreateParams) = apply {
            body = reportCreateParams.body.toBuilder()
            additionalHeaders = reportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = reportCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [readerName]
         * - [reportFileName]
         * - [reportFileUrl]
         * - [reportText]
         * - [signedAt]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        /** Unique study identifier. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String) = apply { body.studyId(studyId) }

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun studyId(studyId: JsonField<String>) = apply { body.studyId(studyId) }

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
         * Returns an immutable instance of [ReportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportCreateParams =
            ReportCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Attach or fill missing report fields on an existing external study. Text and file are
     * write-once. readerName and signedAt overwrite when provided.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val readerName: JsonField<String>,
        private val reportFileName: JsonField<String>,
        private val reportFileUrl: JsonField<String>,
        private val reportText: JsonField<String>,
        private val signedAt: JsonField<String>,
        private val studyId: JsonField<String>,
        private val studyInstanceUid: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
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
            @JsonProperty("signedAt")
            @ExcludeMissing
            signedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            studyInstanceUid: JsonField<String> = JsonMissing.of(),
        ) : this(
            readerName,
            reportFileName,
            reportFileUrl,
            reportText,
            signedAt,
            studyId,
            studyInstanceUid,
            mutableMapOf(),
        )

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
         * Unique study identifier. Format: stu_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyId(): Optional<String> = studyId.getOptional("studyId")

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyInstanceUid(): Optional<String> = studyInstanceUid.getOptional("studyInstanceUid")

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

            private var readerName: JsonField<String> = JsonMissing.of()
            private var reportFileName: JsonField<String> = JsonMissing.of()
            private var reportFileUrl: JsonField<String> = JsonMissing.of()
            private var reportText: JsonField<String> = JsonMissing.of()
            private var signedAt: JsonField<String> = JsonMissing.of()
            private var studyId: JsonField<String> = JsonMissing.of()
            private var studyInstanceUid: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                readerName = body.readerName
                reportFileName = body.reportFileName
                reportFileUrl = body.reportFileUrl
                reportText = body.reportText
                signedAt = body.signedAt
                studyId = body.studyId
                studyInstanceUid = body.studyInstanceUid
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** Unique study identifier. Format: stu_{32-hex-chars} */
            fun studyId(studyId: String) = studyId(JsonField.of(studyId))

            /**
             * Sets [Builder.studyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    readerName,
                    reportFileName,
                    reportFileUrl,
                    reportText,
                    signedAt,
                    studyId,
                    studyInstanceUid,
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

            readerName()
            reportFileName()
            reportFileUrl()
            reportText()
            signedAt()
            studyId()
            studyInstanceUid()
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
            (if (readerName.asKnown().isPresent) 1 else 0) +
                (if (reportFileName.asKnown().isPresent) 1 else 0) +
                (if (reportFileUrl.asKnown().isPresent) 1 else 0) +
                (if (reportText.asKnown().isPresent) 1 else 0) +
                (if (signedAt.asKnown().isPresent) 1 else 0) +
                (if (studyId.asKnown().isPresent) 1 else 0) +
                (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                readerName == other.readerName &&
                reportFileName == other.reportFileName &&
                reportFileUrl == other.reportFileUrl &&
                reportText == other.reportText &&
                signedAt == other.signedAt &&
                studyId == other.studyId &&
                studyInstanceUid == other.studyInstanceUid &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                readerName,
                reportFileName,
                reportFileUrl,
                reportText,
                signedAt,
                studyId,
                studyInstanceUid,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{readerName=$readerName, reportFileName=$reportFileName, reportFileUrl=$reportFileUrl, reportText=$reportText, signedAt=$signedAt, studyId=$studyId, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
