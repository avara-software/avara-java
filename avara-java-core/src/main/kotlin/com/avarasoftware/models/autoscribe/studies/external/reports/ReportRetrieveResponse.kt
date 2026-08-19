// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies.external.reports

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkRequired
import com.avarasoftware.errors.AvaraInvalidDataException
import com.avarasoftware.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** External report snapshot including text and/or a presigned file URL */
class ReportRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val externalReportId: JsonField<String>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val presignedUrl: JsonField<String>,
    private val readerName: JsonField<String>,
    private val reportText: JsonField<String>,
    private val signedAt: JsonField<String>,
    private val snapshotMetadata: JsonField<StudyReportMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("externalReportId")
        @ExcludeMissing
        externalReportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presignedUrl")
        @ExcludeMissing
        presignedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("readerName")
        @ExcludeMissing
        readerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reportText")
        @ExcludeMissing
        reportText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signedAt") @ExcludeMissing signedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("snapshotMetadata")
        @ExcludeMissing
        snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
    ) : this(
        createdAt,
        externalReportId,
        studyId,
        studyInstanceUid,
        presignedUrl,
        readerName,
        reportText,
        signedAt,
        snapshotMetadata,
        mutableMapOf(),
    )

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalReportId(): String = externalReportId.getRequired("externalReportId")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyId(): String = studyId.getRequired("studyId")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

    /**
     * Short-lived download URL for the attached PDF or image. Not used for AI tooling; the reader
     * can still access it.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presignedUrl(): Optional<String> = presignedUrl.getOptional("presignedUrl")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readerName(): Optional<String> = readerName.getOptional("readerName")

    /**
     * When this study is used as a prior, report AI tools leverage this text directly.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportText(): Optional<String> = reportText.getOptional("reportText")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedAt(): Optional<String> = signedAt.getOptional("signedAt")

    /**
     * Patient demographics and scan information for report generation
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotMetadata(): Optional<StudyReportMetadata> =
        snapshotMetadata.getOptional("snapshotMetadata")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [presignedUrl].
     *
     * Unlike [presignedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("presignedUrl")
    @ExcludeMissing
    fun _presignedUrl(): JsonField<String> = presignedUrl

    /**
     * Returns the raw JSON value of [readerName].
     *
     * Unlike [readerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readerName") @ExcludeMissing fun _readerName(): JsonField<String> = readerName

    /**
     * Returns the raw JSON value of [reportText].
     *
     * Unlike [reportText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportText") @ExcludeMissing fun _reportText(): JsonField<String> = reportText

    /**
     * Returns the raw JSON value of [signedAt].
     *
     * Unlike [signedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signedAt") @ExcludeMissing fun _signedAt(): JsonField<String> = signedAt

    /**
     * Returns the raw JSON value of [snapshotMetadata].
     *
     * Unlike [snapshotMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("snapshotMetadata")
    @ExcludeMissing
    fun _snapshotMetadata(): JsonField<StudyReportMetadata> = snapshotMetadata

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
         * Returns a mutable builder for constructing an instance of [ReportRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .externalReportId()
         * .studyId()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportRetrieveResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var externalReportId: JsonField<String>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var presignedUrl: JsonField<String> = JsonMissing.of()
        private var readerName: JsonField<String> = JsonMissing.of()
        private var reportText: JsonField<String> = JsonMissing.of()
        private var signedAt: JsonField<String> = JsonMissing.of()
        private var snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportRetrieveResponse: ReportRetrieveResponse) = apply {
            createdAt = reportRetrieveResponse.createdAt
            externalReportId = reportRetrieveResponse.externalReportId
            studyId = reportRetrieveResponse.studyId
            studyInstanceUid = reportRetrieveResponse.studyInstanceUid
            presignedUrl = reportRetrieveResponse.presignedUrl
            readerName = reportRetrieveResponse.readerName
            reportText = reportRetrieveResponse.reportText
            signedAt = reportRetrieveResponse.signedAt
            snapshotMetadata = reportRetrieveResponse.snapshotMetadata
            additionalProperties = reportRetrieveResponse.additionalProperties.toMutableMap()
        }

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

        fun studyId(studyId: String) = studyId(JsonField.of(studyId))

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun studyId(studyId: JsonField<String>) = apply { this.studyId = studyId }

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
         * Short-lived download URL for the attached PDF or image. Not used for AI tooling; the
         * reader can still access it.
         */
        fun presignedUrl(presignedUrl: String?) = presignedUrl(JsonField.ofNullable(presignedUrl))

        /** Alias for calling [Builder.presignedUrl] with `presignedUrl.orElse(null)`. */
        fun presignedUrl(presignedUrl: Optional<String>) = presignedUrl(presignedUrl.getOrNull())

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

        fun readerName(readerName: String?) = readerName(JsonField.ofNullable(readerName))

        /** Alias for calling [Builder.readerName] with `readerName.orElse(null)`. */
        fun readerName(readerName: Optional<String>) = readerName(readerName.getOrNull())

        /**
         * Sets [Builder.readerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readerName(readerName: JsonField<String>) = apply { this.readerName = readerName }

        /** When this study is used as a prior, report AI tools leverage this text directly. */
        fun reportText(reportText: String?) = reportText(JsonField.ofNullable(reportText))

        /** Alias for calling [Builder.reportText] with `reportText.orElse(null)`. */
        fun reportText(reportText: Optional<String>) = reportText(reportText.getOrNull())

        /**
         * Sets [Builder.reportText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reportText(reportText: JsonField<String>) = apply { this.reportText = reportText }

        fun signedAt(signedAt: String?) = signedAt(JsonField.ofNullable(signedAt))

        /** Alias for calling [Builder.signedAt] with `signedAt.orElse(null)`. */
        fun signedAt(signedAt: Optional<String>) = signedAt(signedAt.getOrNull())

        /**
         * Sets [Builder.signedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signedAt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signedAt(signedAt: JsonField<String>) = apply { this.signedAt = signedAt }

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
         * Returns an immutable instance of [ReportRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .externalReportId()
         * .studyId()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportRetrieveResponse =
            ReportRetrieveResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("externalReportId", externalReportId),
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                presignedUrl,
                readerName,
                reportText,
                signedAt,
                snapshotMetadata,
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
    fun validate(): ReportRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        externalReportId()
        studyId()
        studyInstanceUid()
        presignedUrl()
        readerName()
        reportText()
        signedAt()
        snapshotMetadata().ifPresent { it.validate() }
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
            (if (externalReportId.asKnown().isPresent) 1 else 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
            (if (presignedUrl.asKnown().isPresent) 1 else 0) +
            (if (readerName.asKnown().isPresent) 1 else 0) +
            (if (reportText.asKnown().isPresent) 1 else 0) +
            (if (signedAt.asKnown().isPresent) 1 else 0) +
            (snapshotMetadata.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportRetrieveResponse &&
            createdAt == other.createdAt &&
            externalReportId == other.externalReportId &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            presignedUrl == other.presignedUrl &&
            readerName == other.readerName &&
            reportText == other.reportText &&
            signedAt == other.signedAt &&
            snapshotMetadata == other.snapshotMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            externalReportId,
            studyId,
            studyInstanceUid,
            presignedUrl,
            readerName,
            reportText,
            signedAt,
            snapshotMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportRetrieveResponse{createdAt=$createdAt, externalReportId=$externalReportId, studyId=$studyId, studyInstanceUid=$studyInstanceUid, presignedUrl=$presignedUrl, readerName=$readerName, reportText=$reportText, signedAt=$signedAt, snapshotMetadata=$snapshotMetadata, additionalProperties=$additionalProperties}"
}
