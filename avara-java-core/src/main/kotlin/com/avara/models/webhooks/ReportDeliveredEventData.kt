// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

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
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Event payload containing report and study information */
class ReportDeliveredEventData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val presignedUrl: JsonField<String>,
    private val reportId: JsonField<String>,
    private val studyId: JsonField<String>,
    private val plainText: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("presignedUrl")
        @ExcludeMissing
        presignedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reportId") @ExcludeMissing reportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plainText") @ExcludeMissing plainText: JsonField<String> = JsonMissing.of(),
    ) : this(presignedUrl, reportId, studyId, plainText, mutableMapOf())

    /**
     * Presigned URL for PDF download. Time-limited, typically valid for 1 hour.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun presignedUrl(): String = presignedUrl.getRequired("presignedUrl")

    /**
     * Avara report ID. Format: rep_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportId(): String = reportId.getRequired("reportId")

    /**
     * Avara study ID. Format: stu_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyId(): String = studyId.getRequired("studyId")

    /**
     * Report plain text content (optional). Contains the full report text.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plainText(): Optional<String> = plainText.getOptional("plainText")

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
     * Returns the raw JSON value of [studyId].
     *
     * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("studyId") @ExcludeMissing fun _studyId(): JsonField<String> = studyId

    /**
     * Returns the raw JSON value of [plainText].
     *
     * Unlike [plainText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plainText") @ExcludeMissing fun _plainText(): JsonField<String> = plainText

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
         * Returns a mutable builder for constructing an instance of [ReportDeliveredEventData].
         *
         * The following fields are required:
         * ```java
         * .presignedUrl()
         * .reportId()
         * .studyId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportDeliveredEventData]. */
    class Builder internal constructor() {

        private var presignedUrl: JsonField<String>? = null
        private var reportId: JsonField<String>? = null
        private var studyId: JsonField<String>? = null
        private var plainText: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportDeliveredEventData: ReportDeliveredEventData) = apply {
            presignedUrl = reportDeliveredEventData.presignedUrl
            reportId = reportDeliveredEventData.reportId
            studyId = reportDeliveredEventData.studyId
            plainText = reportDeliveredEventData.plainText
            additionalProperties = reportDeliveredEventData.additionalProperties.toMutableMap()
        }

        /** Presigned URL for PDF download. Time-limited, typically valid for 1 hour. */
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

        /** Avara report ID. Format: rep_{32-hex-chars} */
        fun reportId(reportId: String) = reportId(JsonField.of(reportId))

        /**
         * Sets [Builder.reportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reportId(reportId: JsonField<String>) = apply { this.reportId = reportId }

        /** Avara study ID. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String) = studyId(JsonField.of(studyId))

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun studyId(studyId: JsonField<String>) = apply { this.studyId = studyId }

        /** Report plain text content (optional). Contains the full report text. */
        fun plainText(plainText: String) = plainText(JsonField.of(plainText))

        /**
         * Sets [Builder.plainText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plainText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun plainText(plainText: JsonField<String>) = apply { this.plainText = plainText }

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
         * Returns an immutable instance of [ReportDeliveredEventData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .presignedUrl()
         * .reportId()
         * .studyId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportDeliveredEventData =
            ReportDeliveredEventData(
                checkRequired("presignedUrl", presignedUrl),
                checkRequired("reportId", reportId),
                checkRequired("studyId", studyId),
                plainText,
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
    fun validate(): ReportDeliveredEventData = apply {
        if (validated) {
            return@apply
        }

        presignedUrl()
        reportId()
        studyId()
        plainText()
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
        (if (presignedUrl.asKnown().isPresent) 1 else 0) +
            (if (reportId.asKnown().isPresent) 1 else 0) +
            (if (studyId.asKnown().isPresent) 1 else 0) +
            (if (plainText.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportDeliveredEventData &&
            presignedUrl == other.presignedUrl &&
            reportId == other.reportId &&
            studyId == other.studyId &&
            plainText == other.plainText &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(presignedUrl, reportId, studyId, plainText, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportDeliveredEventData{presignedUrl=$presignedUrl, reportId=$reportId, studyId=$studyId, plainText=$plainText, additionalProperties=$additionalProperties}"
}
