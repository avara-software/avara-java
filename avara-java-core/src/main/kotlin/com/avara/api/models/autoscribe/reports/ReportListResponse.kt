// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.reports

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

/** Response containing a list of reports for a study */
class ReportListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reports: JsonField<List<Report>>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reports")
        @ExcludeMissing
        reports: JsonField<List<Report>> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
    ) : this(reports, studyId, studyInstanceUid, mutableMapOf())

    /**
     * Array of report objects with full details
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reports(): List<Report> = reports.getRequired("reports")

    /**
     * Study ID the reports belong to. Format: stu_{32-hex-chars}
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
     * Returns the raw JSON value of [reports].
     *
     * Unlike [reports], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reports") @ExcludeMissing fun _reports(): JsonField<List<Report>> = reports

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

        /**
         * Returns a mutable builder for constructing an instance of [ReportListResponse].
         *
         * The following fields are required:
         * ```java
         * .reports()
         * .studyId()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListResponse]. */
    class Builder internal constructor() {

        private var reports: JsonField<MutableList<Report>>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportListResponse: ReportListResponse) = apply {
            reports = reportListResponse.reports.map { it.toMutableList() }
            studyId = reportListResponse.studyId
            studyInstanceUid = reportListResponse.studyInstanceUid
            additionalProperties = reportListResponse.additionalProperties.toMutableMap()
        }

        /** Array of report objects with full details */
        fun reports(reports: List<Report>) = reports(JsonField.of(reports))

        /**
         * Sets [Builder.reports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reports] with a well-typed `List<Report>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reports(reports: JsonField<List<Report>>) = apply {
            this.reports = reports.map { it.toMutableList() }
        }

        /**
         * Adds a single [Report] to [reports].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReport(report: Report) = apply {
            reports =
                (reports ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reports", it).add(report)
                }
        }

        /** Study ID the reports belong to. Format: stu_{32-hex-chars} */
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
         * Returns an immutable instance of [ReportListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .reports()
         * .studyId()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportListResponse =
            ReportListResponse(
                checkRequired("reports", reports).map { it.toImmutable() },
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReportListResponse = apply {
        if (validated) {
            return@apply
        }

        reports().forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (reports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

    /** A radiology report in the AutoScribe system */
    class Report
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val isAddendum: JsonField<Boolean>,
        private val reportId: JsonField<String>,
        private val signedAt: JsonField<OffsetDateTime>,
        private val snapshotMetadata: JsonField<StudyReportMetadata>,
        private val status: JsonField<Status>,
        private val studyId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val reportPlainText: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("isAddendum")
            @ExcludeMissing
            isAddendum: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reportId")
            @ExcludeMissing
            reportId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signedAt")
            @ExcludeMissing
            signedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("snapshotMetadata")
            @ExcludeMissing
            snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reportPlainText")
            @ExcludeMissing
            reportPlainText: JsonField<String> = JsonMissing.of(),
        ) : this(
            createdAt,
            isAddendum,
            reportId,
            signedAt,
            snapshotMetadata,
            status,
            studyId,
            updatedAt,
            userId,
            reportPlainText,
            mutableMapOf(),
        )

        /**
         * Timestamp when the report was created
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Whether this report is an addendum to a previous report
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isAddendum(): Boolean = isAddendum.getRequired("isAddendum")

        /**
         * Unique report identifier. Format: rep_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reportId(): String = reportId.getRequired("reportId")

        /**
         * Timestamp when the report was signed, null if not yet signed
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signedAt(): Optional<OffsetDateTime> = signedAt.getOptional("signedAt")

        /**
         * Patient demographics and scan information for report generation
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun snapshotMetadata(): StudyReportMetadata =
            snapshotMetadata.getRequired("snapshotMetadata")

        /**
         * Report status: 'in_progress' or 'completed'
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Study ID this report belongs to. Format: stu_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyId(): String = studyId.getRequired("studyId")

        /**
         * Timestamp when the report was last updated
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * User ID of the radiologist who created/signed this report. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("userId")

        /**
         * Plain text content of the report
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportPlainText(): Optional<String> = reportPlainText.getOptional("reportPlainText")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [isAddendum].
         *
         * Unlike [isAddendum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isAddendum")
        @ExcludeMissing
        fun _isAddendum(): JsonField<Boolean> = isAddendum

        /**
         * Returns the raw JSON value of [reportId].
         *
         * Unlike [reportId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reportId") @ExcludeMissing fun _reportId(): JsonField<String> = reportId

        /**
         * Returns the raw JSON value of [signedAt].
         *
         * Unlike [signedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signedAt")
        @ExcludeMissing
        fun _signedAt(): JsonField<OffsetDateTime> = signedAt

        /**
         * Returns the raw JSON value of [snapshotMetadata].
         *
         * Unlike [snapshotMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("snapshotMetadata")
        @ExcludeMissing
        fun _snapshotMetadata(): JsonField<StudyReportMetadata> = snapshotMetadata

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [studyId].
         *
         * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("studyId") @ExcludeMissing fun _studyId(): JsonField<String> = studyId

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
         * Returns the raw JSON value of [reportPlainText].
         *
         * Unlike [reportPlainText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reportPlainText")
        @ExcludeMissing
        fun _reportPlainText(): JsonField<String> = reportPlainText

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
             * Returns a mutable builder for constructing an instance of [Report].
             *
             * The following fields are required:
             * ```java
             * .createdAt()
             * .isAddendum()
             * .reportId()
             * .signedAt()
             * .snapshotMetadata()
             * .status()
             * .studyId()
             * .updatedAt()
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Report]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var isAddendum: JsonField<Boolean>? = null
            private var reportId: JsonField<String>? = null
            private var signedAt: JsonField<OffsetDateTime>? = null
            private var snapshotMetadata: JsonField<StudyReportMetadata>? = null
            private var status: JsonField<Status>? = null
            private var studyId: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var userId: JsonField<String>? = null
            private var reportPlainText: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(report: Report) = apply {
                createdAt = report.createdAt
                isAddendum = report.isAddendum
                reportId = report.reportId
                signedAt = report.signedAt
                snapshotMetadata = report.snapshotMetadata
                status = report.status
                studyId = report.studyId
                updatedAt = report.updatedAt
                userId = report.userId
                reportPlainText = report.reportPlainText
                additionalProperties = report.additionalProperties.toMutableMap()
            }

            /** Timestamp when the report was created */
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Whether this report is an addendum to a previous report */
            fun isAddendum(isAddendum: Boolean) = isAddendum(JsonField.of(isAddendum))

            /**
             * Sets [Builder.isAddendum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isAddendum] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isAddendum(isAddendum: JsonField<Boolean>) = apply { this.isAddendum = isAddendum }

            /** Unique report identifier. Format: rep_{32-hex-chars} */
            fun reportId(reportId: String) = reportId(JsonField.of(reportId))

            /**
             * Sets [Builder.reportId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportId(reportId: JsonField<String>) = apply { this.reportId = reportId }

            /** Timestamp when the report was signed, null if not yet signed */
            fun signedAt(signedAt: OffsetDateTime?) = signedAt(JsonField.ofNullable(signedAt))

            /** Alias for calling [Builder.signedAt] with `signedAt.orElse(null)`. */
            fun signedAt(signedAt: Optional<OffsetDateTime>) = signedAt(signedAt.getOrNull())

            /**
             * Sets [Builder.signedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signedAt(signedAt: JsonField<OffsetDateTime>) = apply { this.signedAt = signedAt }

            /** Patient demographics and scan information for report generation */
            fun snapshotMetadata(snapshotMetadata: StudyReportMetadata) =
                snapshotMetadata(JsonField.of(snapshotMetadata))

            /**
             * Sets [Builder.snapshotMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshotMetadata] with a well-typed
             * [StudyReportMetadata] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun snapshotMetadata(snapshotMetadata: JsonField<StudyReportMetadata>) = apply {
                this.snapshotMetadata = snapshotMetadata
            }

            /** Report status: 'in_progress' or 'completed' */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Study ID this report belongs to. Format: stu_{32-hex-chars} */
            fun studyId(studyId: String) = studyId(JsonField.of(studyId))

            /**
             * Sets [Builder.studyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyId(studyId: JsonField<String>) = apply { this.studyId = studyId }

            /** Timestamp when the report was last updated */
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * User ID of the radiologist who created/signed this report. Format: usr_{32-hex-chars}
             */
            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            /** Plain text content of the report */
            fun reportPlainText(reportPlainText: String) =
                reportPlainText(JsonField.of(reportPlainText))

            /**
             * Sets [Builder.reportPlainText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportPlainText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportPlainText(reportPlainText: JsonField<String>) = apply {
                this.reportPlainText = reportPlainText
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
             * Returns an immutable instance of [Report].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .createdAt()
             * .isAddendum()
             * .reportId()
             * .signedAt()
             * .snapshotMetadata()
             * .status()
             * .studyId()
             * .updatedAt()
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Report =
                Report(
                    checkRequired("createdAt", createdAt),
                    checkRequired("isAddendum", isAddendum),
                    checkRequired("reportId", reportId),
                    checkRequired("signedAt", signedAt),
                    checkRequired("snapshotMetadata", snapshotMetadata),
                    checkRequired("status", status),
                    checkRequired("studyId", studyId),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("userId", userId),
                    reportPlainText,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Report = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            isAddendum()
            reportId()
            signedAt()
            snapshotMetadata().validate()
            status().validate()
            studyId()
            updatedAt()
            userId()
            reportPlainText()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (isAddendum.asKnown().isPresent) 1 else 0) +
                (if (reportId.asKnown().isPresent) 1 else 0) +
                (if (signedAt.asKnown().isPresent) 1 else 0) +
                (snapshotMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (if (reportPlainText.asKnown().isPresent) 1 else 0)

        /** Report status: 'in_progress' or 'completed' */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val IN_PROGRESS = of("in_progress")

                @JvmField val COMPLETED = of("completed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                IN_PROGRESS,
                COMPLETED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN_PROGRESS,
                COMPLETED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
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
                    IN_PROGRESS -> Value.IN_PROGRESS
                    COMPLETED -> Value.COMPLETED
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
                    IN_PROGRESS -> Known.IN_PROGRESS
                    COMPLETED -> Known.COMPLETED
                    else -> throw AvaraInvalidDataException("Unknown Status: $value")
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

            return other is Report &&
                createdAt == other.createdAt &&
                isAddendum == other.isAddendum &&
                reportId == other.reportId &&
                signedAt == other.signedAt &&
                snapshotMetadata == other.snapshotMetadata &&
                status == other.status &&
                studyId == other.studyId &&
                updatedAt == other.updatedAt &&
                userId == other.userId &&
                reportPlainText == other.reportPlainText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                isAddendum,
                reportId,
                signedAt,
                snapshotMetadata,
                status,
                studyId,
                updatedAt,
                userId,
                reportPlainText,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Report{createdAt=$createdAt, isAddendum=$isAddendum, reportId=$reportId, signedAt=$signedAt, snapshotMetadata=$snapshotMetadata, status=$status, studyId=$studyId, updatedAt=$updatedAt, userId=$userId, reportPlainText=$reportPlainText, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListResponse &&
            reports == other.reports &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(reports, studyId, studyInstanceUid, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportListResponse{reports=$reports, studyId=$studyId, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
}
