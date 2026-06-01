// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
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

/** A report with its PDF download URL */
class ReportPdfItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isCritical: JsonField<Boolean>,
    private val presignedUrl: JsonField<String>,
    private val reportId: JsonField<String>,
    private val snapshotMetadata: JsonField<StudyReportMetadata>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("isCritical")
        @ExcludeMissing
        isCritical: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("presignedUrl")
        @ExcludeMissing
        presignedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reportId") @ExcludeMissing reportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("snapshotMetadata")
        @ExcludeMissing
        snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
    ) : this(
        isCritical,
        presignedUrl,
        reportId,
        snapshotMetadata,
        studyId,
        studyInstanceUid,
        mutableMapOf(),
    )

    /**
     * Whether the report was marked critical at sign-out. null when the report is not yet
     * completed; true/false once completed.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isCritical(): Optional<Boolean> = isCritical.getOptional("isCritical")

    /**
     * Time-limited presigned URL to download the PDF (expires after 1 hour)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun presignedUrl(): String = presignedUrl.getRequired("presignedUrl")

    /**
     * Unique report identifier. Format: rep_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportId(): String = reportId.getRequired("reportId")

    /**
     * Patient demographics and scan information for report generation
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun snapshotMetadata(): StudyReportMetadata = snapshotMetadata.getRequired("snapshotMetadata")

    /**
     * Study ID this report belongs to. Format: stu_{32-hex-chars}
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
     * Returns the raw JSON value of [isCritical].
     *
     * Unlike [isCritical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isCritical") @ExcludeMissing fun _isCritical(): JsonField<Boolean> = isCritical

    /**
     * Returns the raw JSON value of [presignedUrl].
     *
     * Unlike [presignedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presignedUrl")
    @ExcludeMissing
    fun _presignedUrl(): JsonField<String> = presignedUrl

    /**
     * Returns the raw JSON value of [reportId].
     *
     * Unlike [reportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportId") @ExcludeMissing fun _reportId(): JsonField<String> = reportId

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
         * Returns a mutable builder for constructing an instance of [ReportPdfItem].
         *
         * The following fields are required:
         * ```java
         * .isCritical()
         * .presignedUrl()
         * .reportId()
         * .snapshotMetadata()
         * .studyId()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportPdfItem]. */
    class Builder internal constructor() {

        private var isCritical: JsonField<Boolean>? = null
        private var presignedUrl: JsonField<String>? = null
        private var reportId: JsonField<String>? = null
        private var snapshotMetadata: JsonField<StudyReportMetadata>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportPdfItem: ReportPdfItem) = apply {
            isCritical = reportPdfItem.isCritical
            presignedUrl = reportPdfItem.presignedUrl
            reportId = reportPdfItem.reportId
            snapshotMetadata = reportPdfItem.snapshotMetadata
            studyId = reportPdfItem.studyId
            studyInstanceUid = reportPdfItem.studyInstanceUid
            additionalProperties = reportPdfItem.additionalProperties.toMutableMap()
        }

        /**
         * Whether the report was marked critical at sign-out. null when the report is not yet
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

        /** Time-limited presigned URL to download the PDF (expires after 1 hour) */
        fun presignedUrl(presignedUrl: String) = presignedUrl(JsonField.of(presignedUrl))

        /**
         * Sets [Builder.presignedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presignedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun presignedUrl(presignedUrl: JsonField<String>) = apply {
            this.presignedUrl = presignedUrl
        }

        /** Unique report identifier. Format: rep_{32-hex-chars} */
        fun reportId(reportId: String) = reportId(JsonField.of(reportId))

        /**
         * Sets [Builder.reportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reportId(reportId: JsonField<String>) = apply { this.reportId = reportId }

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

        /** Study ID this report belongs to. Format: stu_{32-hex-chars} */
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
         * Returns an immutable instance of [ReportPdfItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isCritical()
         * .presignedUrl()
         * .reportId()
         * .snapshotMetadata()
         * .studyId()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportPdfItem =
            ReportPdfItem(
                checkRequired("isCritical", isCritical),
                checkRequired("presignedUrl", presignedUrl),
                checkRequired("reportId", reportId),
                checkRequired("snapshotMetadata", snapshotMetadata),
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
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
    fun validate(): ReportPdfItem = apply {
        if (validated) {
            return@apply
        }

        isCritical()
        presignedUrl()
        reportId()
        snapshotMetadata().validate()
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
        (if (isCritical.asKnown().isPresent) 1 else 0) +
            (if (presignedUrl.asKnown().isPresent) 1 else 0) +
            (if (reportId.asKnown().isPresent) 1 else 0) +
            (snapshotMetadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportPdfItem &&
            isCritical == other.isCritical &&
            presignedUrl == other.presignedUrl &&
            reportId == other.reportId &&
            snapshotMetadata == other.snapshotMetadata &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            isCritical,
            presignedUrl,
            reportId,
            snapshotMetadata,
            studyId,
            studyInstanceUid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportPdfItem{isCritical=$isCritical, presignedUrl=$presignedUrl, reportId=$reportId, snapshotMetadata=$snapshotMetadata, studyId=$studyId, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
}
