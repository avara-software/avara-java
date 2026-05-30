// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.autoscribe.ReportStatus
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A report ID paired with its current status */
class ReportIdWithStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reportId: JsonField<String>,
    private val status: JsonField<ReportStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reportId") @ExcludeMissing reportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<ReportStatus> = JsonMissing.of(),
    ) : this(reportId, status, mutableMapOf())

    /**
     * Unique report identifier. Format: rep_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportId(): String = reportId.getRequired("reportId")

    /**
     * Status of an individual report. 'in_progress' = actively being dictated, 'completed' =
     * signed.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): ReportStatus = status.getRequired("status")

    /**
     * Returns the raw JSON value of [reportId].
     *
     * Unlike [reportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reportId") @ExcludeMissing fun _reportId(): JsonField<String> = reportId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<ReportStatus> = status

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
         * Returns a mutable builder for constructing an instance of [ReportIdWithStatus].
         *
         * The following fields are required:
         * ```java
         * .reportId()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportIdWithStatus]. */
    class Builder internal constructor() {

        private var reportId: JsonField<String>? = null
        private var status: JsonField<ReportStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reportIdWithStatus: ReportIdWithStatus) = apply {
            reportId = reportIdWithStatus.reportId
            status = reportIdWithStatus.status
            additionalProperties = reportIdWithStatus.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ReportIdWithStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .reportId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportIdWithStatus =
            ReportIdWithStatus(
                checkRequired("reportId", reportId),
                checkRequired("status", status),
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
    fun validate(): ReportIdWithStatus = apply {
        if (validated) {
            return@apply
        }

        reportId()
        status().validate()
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
        (if (reportId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportIdWithStatus &&
            reportId == other.reportId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(reportId, status, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReportIdWithStatus{reportId=$reportId, status=$status, additionalProperties=$additionalProperties}"
}
