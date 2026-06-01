// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.autoscribe.ReportStatus
import com.avara.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A radiology report in the AutoScribe system */
class Report
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val isAddendum: JsonField<Boolean>,
    private val isCritical: JsonField<Boolean>,
    private val reportId: JsonField<String>,
    private val signedAt: JsonField<OffsetDateTime>,
    private val snapshotMetadata: JsonField<StudyReportMetadata>,
    private val status: JsonField<ReportStatus>,
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
        @JsonProperty("isCritical")
        @ExcludeMissing
        isCritical: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reportId") @ExcludeMissing reportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signedAt")
        @ExcludeMissing
        signedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("snapshotMetadata")
        @ExcludeMissing
        snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<ReportStatus> = JsonMissing.of(),
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
        isCritical,
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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isAddendum(): Boolean = isAddendum.getRequired("isAddendum")

    /**
     * Whether the report was marked critical at sign-off. null when the report is not yet
     * completed; true/false once completed.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isCritical(): Optional<Boolean> = isCritical.getOptional("isCritical")

    /**
     * Unique report identifier. Format: rep_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun snapshotMetadata(): StudyReportMetadata = snapshotMetadata.getRequired("snapshotMetadata")

    /**
     * Status of an individual report. 'in_progress' = actively being dictated, 'completed' =
     * signed.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): ReportStatus = status.getRequired("status")

    /**
     * Study ID this report belongs to. Format: stu_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
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
    @JsonProperty("isAddendum") @ExcludeMissing fun _isAddendum(): JsonField<Boolean> = isAddendum

    /**
     * Returns the raw JSON value of [isCritical].
     *
     * Unlike [isCritical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCritical") @ExcludeMissing fun _isCritical(): JsonField<Boolean> = isCritical

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
    @JsonProperty("signedAt") @ExcludeMissing fun _signedAt(): JsonField<OffsetDateTime> = signedAt

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<ReportStatus> = status

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
     * Unlike [reportPlainText], this method doesn't throw if the JSON field has an unexpected type.
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
         * .isCritical()
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
        private var isCritical: JsonField<Boolean>? = null
        private var reportId: JsonField<String>? = null
        private var signedAt: JsonField<OffsetDateTime>? = null
        private var snapshotMetadata: JsonField<StudyReportMetadata>? = null
        private var status: JsonField<ReportStatus>? = null
        private var studyId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var reportPlainText: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(report: Report) = apply {
            createdAt = report.createdAt
            isAddendum = report.isAddendum
            isCritical = report.isCritical
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether this report is an addendum to a previous report */
        fun isAddendum(isAddendum: Boolean) = isAddendum(JsonField.of(isAddendum))

        /**
         * Sets [Builder.isAddendum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isAddendum] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isAddendum(isAddendum: JsonField<Boolean>) = apply { this.isAddendum = isAddendum }

        /**
         * Whether the report was marked critical at sign-off. null when the report is not yet
         * completed; true/false once completed.
         */
        fun isCritical(isCritical: Boolean?) = isCritical(JsonField.ofNullable(isCritical))

        /**
         * Alias for [Builder.isCritical].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isCritical(isCritical: Boolean) = isCritical(isCritical as Boolean?)

        /** Alias for calling [Builder.isCritical] with `isCritical.orElse(null)`. */
        fun isCritical(isCritical: Optional<Boolean>) = isCritical(isCritical.getOrNull())

        /**
         * Sets [Builder.isCritical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCritical] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCritical(isCritical: JsonField<Boolean>) = apply { this.isCritical = isCritical }

        /** Unique report identifier. Format: rep_{32-hex-chars} */
        fun reportId(reportId: String) = reportId(JsonField.of(reportId))

        /**
         * Sets [Builder.reportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * [StudyReportMetadata] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun snapshotMetadata(snapshotMetadata: JsonField<StudyReportMetadata>) = apply {
            this.snapshotMetadata = snapshotMetadata
        }

        /**
         * Status of an individual report. 'in_progress' = actively being dictated, 'completed' =
         * signed.
         */
        fun status(status: ReportStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [ReportStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<ReportStatus>) = apply { this.status = status }

        /** Study ID this report belongs to. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String) = studyId(JsonField.of(studyId))

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** User ID of the radiologist who created/signed this report. Format: usr_{32-hex-chars} */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * .isCritical()
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
                checkRequired("isCritical", isCritical),
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws AvaraInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): Report = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        isAddendum()
        isCritical()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (isAddendum.asKnown().isPresent) 1 else 0) +
            (if (isCritical.asKnown().isPresent) 1 else 0) +
            (if (reportId.asKnown().isPresent) 1 else 0) +
            (if (signedAt.asKnown().isPresent) 1 else 0) +
            (snapshotMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (reportPlainText.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Report &&
            createdAt == other.createdAt &&
            isAddendum == other.isAddendum &&
            isCritical == other.isCritical &&
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
            isCritical,
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
        "Report{createdAt=$createdAt, isAddendum=$isAddendum, isCritical=$isCritical, reportId=$reportId, signedAt=$signedAt, snapshotMetadata=$snapshotMetadata, status=$status, studyId=$studyId, updatedAt=$updatedAt, userId=$userId, reportPlainText=$reportPlainText, additionalProperties=$additionalProperties}"
}
