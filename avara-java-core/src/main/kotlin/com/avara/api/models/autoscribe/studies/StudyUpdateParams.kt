// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.studies

import com.avara.api.core.Enum
import com.avara.api.core.ExcludeMissing
import com.avara.api.core.JsonField
import com.avara.api.core.JsonMissing
import com.avara.api.core.JsonValue
import com.avara.api.core.Params
import com.avara.api.core.checkKnown
import com.avara.api.core.checkRequired
import com.avara.api.core.http.Headers
import com.avara.api.core.http.QueryParams
import com.avara.api.core.toImmutable
import com.avara.api.errors.AvaraInvalidDataException
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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Organization ID for the study, or null to remove. Format: org_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgId(): Optional<String> = body.orgId()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorReportTexts(): Optional<List<String>> = body.priorReportTexts()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorStudyIds(): Optional<List<String>> = body.priorStudyIds()

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportMetadata(): Optional<ReportMetadata> = body.reportMetadata()

    /**
     * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention
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
     * Returns the raw JSON value of [assignedTo].
     *
     * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignedTo(): JsonField<String> = body._assignedTo()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orgId(): JsonField<String> = body._orgId()

    /**
     * Returns the raw JSON value of [priorReportTexts].
     *
     * Unlike [priorReportTexts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _priorReportTexts(): JsonField<List<String>> = body._priorReportTexts()

    /**
     * Returns the raw JSON value of [priorStudyIds].
     *
     * Unlike [priorStudyIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priorStudyIds(): JsonField<List<String>> = body._priorStudyIds()

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
         * - [metadata]
         * - [orgId]
         * - [priorReportTexts]
         * - [priorStudyIds]
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

        /** Organization ID for the study, or null to remove. Format: org_{32-hex-chars} */
        fun orgId(orgId: String) = apply { body.orgId(orgId) }

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { body.orgId(orgId) }

        fun priorReportTexts(priorReportTexts: List<String>?) = apply {
            body.priorReportTexts(priorReportTexts)
        }

        /** Alias for calling [Builder.priorReportTexts] with `priorReportTexts.orElse(null)`. */
        fun priorReportTexts(priorReportTexts: Optional<List<String>>) =
            priorReportTexts(priorReportTexts.getOrNull())

        /**
         * Sets [Builder.priorReportTexts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorReportTexts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priorReportTexts(priorReportTexts: JsonField<List<String>>) = apply {
            body.priorReportTexts(priorReportTexts)
        }

        /**
         * Adds a single [String] to [priorReportTexts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorReportText(priorReportText: String) = apply {
            body.addPriorReportText(priorReportText)
        }

        fun priorStudyIds(priorStudyIds: List<String>?) = apply {
            body.priorStudyIds(priorStudyIds)
        }

        /** Alias for calling [Builder.priorStudyIds] with `priorStudyIds.orElse(null)`. */
        fun priorStudyIds(priorStudyIds: Optional<List<String>>) =
            priorStudyIds(priorStudyIds.getOrNull())

        /**
         * Sets [Builder.priorStudyIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorStudyIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun priorStudyIds(priorStudyIds: JsonField<List<String>>) = apply {
            body.priorStudyIds(priorStudyIds)
        }

        /**
         * Adds a single [String] to [priorStudyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorStudyId(priorStudyId: String) = apply { body.addPriorStudyId(priorStudyId) }

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
        private val metadata: JsonField<Metadata>,
        private val orgId: JsonField<String>,
        private val priorReportTexts: JsonField<List<String>>,
        private val priorStudyIds: JsonField<List<String>>,
        private val reportMetadata: JsonField<ReportMetadata>,
        private val severity: JsonField<Severity>,
        private val studyDescription: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assignedTo")
            @ExcludeMissing
            assignedTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("orgId") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priorReportTexts")
            @ExcludeMissing
            priorReportTexts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("priorStudyIds")
            @ExcludeMissing
            priorStudyIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("reportMetadata")
            @ExcludeMissing
            reportMetadata: JsonField<ReportMetadata> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("studyDescription")
            @ExcludeMissing
            studyDescription: JsonField<String> = JsonMissing.of(),
        ) : this(
            assignedTo,
            metadata,
            orgId,
            priorReportTexts,
            priorStudyIds,
            reportMetadata,
            severity,
            studyDescription,
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
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Organization ID for the study, or null to remove. Format: org_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun orgId(): Optional<String> = orgId.getOptional("orgId")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priorReportTexts(): Optional<List<String>> =
            priorReportTexts.getOptional("priorReportTexts")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priorStudyIds(): Optional<List<String>> = priorStudyIds.getOptional("priorStudyIds")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportMetadata(): Optional<ReportMetadata> =
            reportMetadata.getOptional("reportMetadata")

        /**
         * Priority level of the study. 'normal' for routine, 'high' for urgent, 'stat' for
         * immediate attention
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
         * Returns the raw JSON value of [assignedTo].
         *
         * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignedTo")
        @ExcludeMissing
        fun _assignedTo(): JsonField<String> = assignedTo

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [orgId].
         *
         * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orgId") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

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
         * Unlike [priorStudyIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("priorStudyIds")
        @ExcludeMissing
        fun _priorStudyIds(): JsonField<List<String>> = priorStudyIds

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
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var orgId: JsonField<String> = JsonMissing.of()
            private var priorReportTexts: JsonField<MutableList<String>>? = null
            private var priorStudyIds: JsonField<MutableList<String>>? = null
            private var reportMetadata: JsonField<ReportMetadata> = JsonMissing.of()
            private var severity: JsonField<Severity> = JsonMissing.of()
            private var studyDescription: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assignedTo = body.assignedTo
                metadata = body.metadata
                orgId = body.orgId
                priorReportTexts = body.priorReportTexts.map { it.toMutableList() }
                priorStudyIds = body.priorStudyIds.map { it.toMutableList() }
                reportMetadata = body.reportMetadata
                severity = body.severity
                studyDescription = body.studyDescription
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

            /** Organization ID for the study, or null to remove. Format: org_{32-hex-chars} */
            fun orgId(orgId: String) = orgId(JsonField.of(orgId))

            /**
             * Sets [Builder.orgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            fun priorReportTexts(priorReportTexts: List<String>?) =
                priorReportTexts(JsonField.ofNullable(priorReportTexts))

            /**
             * Alias for calling [Builder.priorReportTexts] with `priorReportTexts.orElse(null)`.
             */
            fun priorReportTexts(priorReportTexts: Optional<List<String>>) =
                priorReportTexts(priorReportTexts.getOrNull())

            /**
             * Sets [Builder.priorReportTexts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priorReportTexts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun priorStudyIds(priorStudyIds: List<String>?) =
                priorStudyIds(JsonField.ofNullable(priorStudyIds))

            /** Alias for calling [Builder.priorStudyIds] with `priorStudyIds.orElse(null)`. */
            fun priorStudyIds(priorStudyIds: Optional<List<String>>) =
                priorStudyIds(priorStudyIds.getOrNull())

            /**
             * Sets [Builder.priorStudyIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priorStudyIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
                    metadata,
                    orgId,
                    (priorReportTexts ?: JsonMissing.of()).map { it.toImmutable() },
                    (priorStudyIds ?: JsonMissing.of()).map { it.toImmutable() },
                    reportMetadata,
                    severity,
                    studyDescription,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            assignedTo()
            metadata().ifPresent { it.validate() }
            orgId()
            priorReportTexts()
            priorStudyIds()
            reportMetadata().ifPresent { it.validate() }
            severity().ifPresent { it.validate() }
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
            (if (assignedTo.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (orgId.asKnown().isPresent) 1 else 0) +
                (priorReportTexts.asKnown().getOrNull()?.size ?: 0) +
                (priorStudyIds.asKnown().getOrNull()?.size ?: 0) +
                (reportMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyDescription.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assignedTo == other.assignedTo &&
                metadata == other.metadata &&
                orgId == other.orgId &&
                priorReportTexts == other.priorReportTexts &&
                priorStudyIds == other.priorStudyIds &&
                reportMetadata == other.reportMetadata &&
                severity == other.severity &&
                studyDescription == other.studyDescription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assignedTo,
                metadata,
                orgId,
                priorReportTexts,
                priorStudyIds,
                reportMetadata,
                severity,
                studyDescription,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assignedTo=$assignedTo, metadata=$metadata, orgId=$orgId, priorReportTexts=$priorReportTexts, priorStudyIds=$priorStudyIds, reportMetadata=$reportMetadata, severity=$severity, studyDescription=$studyDescription, additionalProperties=$additionalProperties}"
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
        private val referringPhysicianName: JsonField<String>,
        private val scanDate: JsonField<String>,
        private val scanTime: JsonField<String>,
        private val scanType: JsonField<String>,
        private val sex: JsonField<Sex>,
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
            @JsonProperty("referringPhysicianName")
            @ExcludeMissing
            referringPhysicianName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scanDate")
            @ExcludeMissing
            scanDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scanTime")
            @ExcludeMissing
            scanTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scanType")
            @ExcludeMissing
            scanType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sex") @ExcludeMissing sex: JsonField<Sex> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Weight> = JsonMissing.of(),
        ) : this(
            age,
            dateOfBirth,
            facilityName,
            height,
            mrn,
            patientName,
            referringPhysicianName,
            scanDate,
            scanTime,
            scanType,
            sex,
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
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun referringPhysicianName(): Optional<String> =
            referringPhysicianName.getOptional("referringPhysicianName")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scanDate(): Optional<String> = scanDate.getOptional("scanDate")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scanTime(): Optional<String> = scanTime.getOptional("scanTime")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scanType(): Optional<String> = scanType.getOptional("scanType")

        /**
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sex(): Optional<Sex> = sex.getOptional("sex")

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
         * Returns the raw JSON value of [referringPhysicianName].
         *
         * Unlike [referringPhysicianName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("referringPhysicianName")
        @ExcludeMissing
        fun _referringPhysicianName(): JsonField<String> = referringPhysicianName

        /**
         * Returns the raw JSON value of [scanDate].
         *
         * Unlike [scanDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scanDate") @ExcludeMissing fun _scanDate(): JsonField<String> = scanDate

        /**
         * Returns the raw JSON value of [scanTime].
         *
         * Unlike [scanTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scanTime") @ExcludeMissing fun _scanTime(): JsonField<String> = scanTime

        /**
         * Returns the raw JSON value of [scanType].
         *
         * Unlike [scanType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scanType") @ExcludeMissing fun _scanType(): JsonField<String> = scanType

        /**
         * Returns the raw JSON value of [sex].
         *
         * Unlike [sex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sex") @ExcludeMissing fun _sex(): JsonField<Sex> = sex

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
            private var referringPhysicianName: JsonField<String> = JsonMissing.of()
            private var scanDate: JsonField<String> = JsonMissing.of()
            private var scanTime: JsonField<String> = JsonMissing.of()
            private var scanType: JsonField<String> = JsonMissing.of()
            private var sex: JsonField<Sex> = JsonMissing.of()
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
                referringPhysicianName = reportMetadata.referringPhysicianName
                scanDate = reportMetadata.scanDate
                scanTime = reportMetadata.scanTime
                scanType = reportMetadata.scanType
                sex = reportMetadata.sex
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

            fun scanDate(scanDate: String?) = scanDate(JsonField.ofNullable(scanDate))

            /** Alias for calling [Builder.scanDate] with `scanDate.orElse(null)`. */
            fun scanDate(scanDate: Optional<String>) = scanDate(scanDate.getOrNull())

            /**
             * Sets [Builder.scanDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scanDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scanDate(scanDate: JsonField<String>) = apply { this.scanDate = scanDate }

            fun scanTime(scanTime: String?) = scanTime(JsonField.ofNullable(scanTime))

            /** Alias for calling [Builder.scanTime] with `scanTime.orElse(null)`. */
            fun scanTime(scanTime: Optional<String>) = scanTime(scanTime.getOrNull())

            /**
             * Sets [Builder.scanTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scanTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scanTime(scanTime: JsonField<String>) = apply { this.scanTime = scanTime }

            fun scanType(scanType: String?) = scanType(JsonField.ofNullable(scanType))

            /** Alias for calling [Builder.scanType] with `scanType.orElse(null)`. */
            fun scanType(scanType: Optional<String>) = scanType(scanType.getOrNull())

            /**
             * Sets [Builder.scanType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scanType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scanType(scanType: JsonField<String>) = apply { this.scanType = scanType }

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
                    referringPhysicianName,
                    scanDate,
                    scanTime,
                    scanType,
                    sex,
                    weight,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

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
            referringPhysicianName()
            scanDate()
            scanTime()
            scanType()
            sex().ifPresent { it.validate() }
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
                (if (referringPhysicianName.asKnown().isPresent) 1 else 0) +
                (if (scanDate.asKnown().isPresent) 1 else 0) +
                (if (scanTime.asKnown().isPresent) 1 else 0) +
                (if (scanType.asKnown().isPresent) 1 else 0) +
                (sex.asKnown().getOrNull()?.validity() ?: 0) +
                (weight.asKnown().getOrNull()?.validity() ?: 0)

        class Height
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

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
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(height: Height) = apply {
                    unit = height.unit
                    value = height.value
                    additionalProperties = height.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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

            class Unit @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IN = of("in")

                    @JvmField val CM = of("cm")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    IN,
                    CM,
                }

                /**
                 * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Unit] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IN,
                    CM,
                    /**
                     * An enum member indicating that [Unit] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IN -> Value.IN
                        CM -> Value.CM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws AvaraInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        IN -> Known.IN
                        CM -> Known.CM
                        else -> throw AvaraInvalidDataException("Unknown Unit: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws AvaraInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        AvaraInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Unit = apply {
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

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

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

        class Sex @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MALE = of("male")

                @JvmField val FEMALE = of("female")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = Sex(JsonField.of(value))
            }

            /** An enum containing [Sex]'s known values. */
            enum class Known {
                MALE,
                FEMALE,
                OTHER,
            }

            /**
             * An enum containing [Sex]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Sex] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MALE,
                FEMALE,
                OTHER,
                /** An enum member indicating that [Sex] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MALE -> Value.MALE
                    FEMALE -> Value.FEMALE
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws AvaraInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MALE -> Known.MALE
                    FEMALE -> Known.FEMALE
                    OTHER -> Known.OTHER
                    else -> throw AvaraInvalidDataException("Unknown Sex: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws AvaraInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    AvaraInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Sex = apply {
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

                return other is Sex && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Weight
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val unit: JsonField<Unit>,
            private val value: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("unit") @ExcludeMissing unit: JsonField<Unit> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            ) : this(unit, value, mutableMapOf())

            /**
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unit(): Unit = unit.getRequired("unit")

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
            @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

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

                private var unit: JsonField<Unit>? = null
                private var value: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(weight: Weight) = apply {
                    unit = weight.unit
                    value = weight.value
                    additionalProperties = weight.additionalProperties.toMutableMap()
                }

                fun unit(unit: Unit) = unit(JsonField.of(unit))

                /**
                 * Sets [Builder.unit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unit] with a well-typed [Unit] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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

            class Unit @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LBS = of("lbs")

                    @JvmField val KG = of("kg")

                    @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                }

                /** An enum containing [Unit]'s known values. */
                enum class Known {
                    LBS,
                    KG,
                }

                /**
                 * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Unit] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LBS,
                    KG,
                    /**
                     * An enum member indicating that [Unit] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LBS -> Value.LBS
                        KG -> Value.KG
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws AvaraInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        LBS -> Known.LBS
                        KG -> Known.KG
                        else -> throw AvaraInvalidDataException("Unknown Unit: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws AvaraInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        AvaraInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Unit = apply {
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

                    return other is Unit && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

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
                referringPhysicianName == other.referringPhysicianName &&
                scanDate == other.scanDate &&
                scanTime == other.scanTime &&
                scanType == other.scanType &&
                sex == other.sex &&
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
                referringPhysicianName,
                scanDate,
                scanTime,
                scanType,
                sex,
                weight,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReportMetadata{age=$age, dateOfBirth=$dateOfBirth, facilityName=$facilityName, height=$height, mrn=$mrn, patientName=$patientName, referringPhysicianName=$referringPhysicianName, scanDate=$scanDate, scanTime=$scanTime, scanType=$scanType, sex=$sex, weight=$weight, additionalProperties=$additionalProperties}"
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
