// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
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
