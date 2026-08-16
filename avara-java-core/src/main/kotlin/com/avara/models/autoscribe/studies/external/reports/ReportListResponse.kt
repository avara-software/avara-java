// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies.external.reports

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ReportListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val externalReportId: JsonField<String>,
    private val hasReportText: JsonField<Boolean>,
    private val reportPdfPresent: JsonField<Boolean>,
    private val studyId: JsonField<String>,
    private val studyInstanceUid: JsonField<String>,
    private val readerName: JsonField<String>,
    private val signedAt: JsonField<String>,
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
        @JsonProperty("hasReportText")
        @ExcludeMissing
        hasReportText: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reportPdfPresent")
        @ExcludeMissing
        reportPdfPresent: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        studyInstanceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("readerName")
        @ExcludeMissing
        readerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signedAt") @ExcludeMissing signedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        createdAt,
        externalReportId,
        hasReportText,
        reportPdfPresent,
        studyId,
        studyInstanceUid,
        readerName,
        signedAt,
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
    fun hasReportText(): Boolean = hasReportText.getRequired("hasReportText")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportPdfPresent(): Boolean = reportPdfPresent.getRequired("reportPdfPresent")

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
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readerName(): Optional<String> = readerName.getOptional("readerName")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signedAt(): Optional<String> = signedAt.getOptional("signedAt")

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
     * Returns the raw JSON value of [hasReportText].
     *
     * Unlike [hasReportText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasReportText")
    @ExcludeMissing
    fun _hasReportText(): JsonField<Boolean> = hasReportText

    /**
     * Returns the raw JSON value of [reportPdfPresent].
     *
     * Unlike [reportPdfPresent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reportPdfPresent")
    @ExcludeMissing
    fun _reportPdfPresent(): JsonField<Boolean> = reportPdfPresent

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
     * Returns the raw JSON value of [readerName].
     *
     * Unlike [readerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readerName") @ExcludeMissing fun _readerName(): JsonField<String> = readerName

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
         * Returns a mutable builder for constructing an instance of [ReportListResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .externalReportId()
         * .hasReportText()
         * .reportPdfPresent()
         * .studyId()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var externalReportId: JsonField<String>? = null
        private var hasReportText: JsonField<Boolean>? = null
        private var reportPdfPresent: JsonField<Boolean>? = null
        private var studyId: JsonField<String>? = null
        private var studyInstanceUid: JsonField<String>? = null
        private var readerName: JsonField<String> = JsonMissing.of()
        private var signedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportListResponse: ReportListResponse) = apply {
            createdAt = reportListResponse.createdAt
            externalReportId = reportListResponse.externalReportId
            hasReportText = reportListResponse.hasReportText
            reportPdfPresent = reportListResponse.reportPdfPresent
            studyId = reportListResponse.studyId
            studyInstanceUid = reportListResponse.studyInstanceUid
            readerName = reportListResponse.readerName
            signedAt = reportListResponse.signedAt
            additionalProperties = reportListResponse.additionalProperties.toMutableMap()
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

        fun hasReportText(hasReportText: Boolean) = hasReportText(JsonField.of(hasReportText))

        /**
         * Sets [Builder.hasReportText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasReportText] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasReportText(hasReportText: JsonField<Boolean>) = apply {
            this.hasReportText = hasReportText
        }

        fun reportPdfPresent(reportPdfPresent: Boolean) =
            reportPdfPresent(JsonField.of(reportPdfPresent))

        /**
         * Sets [Builder.reportPdfPresent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportPdfPresent] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportPdfPresent(reportPdfPresent: JsonField<Boolean>) = apply {
            this.reportPdfPresent = reportPdfPresent
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
         * .createdAt()
         * .externalReportId()
         * .hasReportText()
         * .reportPdfPresent()
         * .studyId()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportListResponse =
            ReportListResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("externalReportId", externalReportId),
                checkRequired("hasReportText", hasReportText),
                checkRequired("reportPdfPresent", reportPdfPresent),
                checkRequired("studyId", studyId),
                checkRequired("studyInstanceUid", studyInstanceUid),
                readerName,
                signedAt,
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
    fun validate(): ReportListResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        externalReportId()
        hasReportText()
        reportPdfPresent()
        studyId()
        studyInstanceUid()
        readerName()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (externalReportId.asKnown().isPresent) 1 else 0) +
            (if (hasReportText.asKnown().isPresent) 1 else 0) +
            (if (reportPdfPresent.asKnown().isPresent) 1 else 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
            (if (readerName.asKnown().isPresent) 1 else 0) +
            (if (signedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListResponse &&
            createdAt == other.createdAt &&
            externalReportId == other.externalReportId &&
            hasReportText == other.hasReportText &&
            reportPdfPresent == other.reportPdfPresent &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            readerName == other.readerName &&
            signedAt == other.signedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            externalReportId,
            hasReportText,
            reportPdfPresent,
            studyId,
            studyInstanceUid,
            readerName,
            signedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportListResponse{createdAt=$createdAt, externalReportId=$externalReportId, hasReportText=$hasReportText, reportPdfPresent=$reportPdfPresent, studyId=$studyId, studyInstanceUid=$studyInstanceUid, readerName=$readerName, signedAt=$signedAt, additionalProperties=$additionalProperties}"
}
