// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.reports

import com.avara.core.BaseDeserializer
import com.avara.core.BaseSerializer
import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.allMaxBy
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.getOrThrow
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.autoscribe.StudyReportMetadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing a single report with its plain text */
@JsonDeserialize(using = ReportTextResponse.Deserializer::class)
@JsonSerialize(using = ReportTextResponse.Serializer::class)
class ReportTextResponse
private constructor(
    private val single: SingleReportTextResponse? = null,
    private val listReports: ListReportsTextResponse? = null,
    private val _json: JsonValue? = null,
) {

    /** Response containing a single report with its plain text */
    fun single(): Optional<SingleReportTextResponse> = Optional.ofNullable(single)

    /** Response containing a list of reports with their plain text */
    fun listReports(): Optional<ListReportsTextResponse> = Optional.ofNullable(listReports)

    fun isSingle(): Boolean = single != null

    fun isListReports(): Boolean = listReports != null

    /** Response containing a single report with its plain text */
    fun asSingle(): SingleReportTextResponse = single.getOrThrow("single")

    /** Response containing a list of reports with their plain text */
    fun asListReports(): ListReportsTextResponse = listReports.getOrThrow("listReports")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            single != null -> visitor.visitSingle(single)
            listReports != null -> visitor.visitListReports(listReports)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ReportTextResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSingle(single: SingleReportTextResponse) {
                    single.validate()
                }

                override fun visitListReports(listReports: ListReportsTextResponse) {
                    listReports.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitSingle(single: SingleReportTextResponse) = single.validity()

                override fun visitListReports(listReports: ListReportsTextResponse) =
                    listReports.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportTextResponse &&
            single == other.single &&
            listReports == other.listReports
    }

    override fun hashCode(): Int = Objects.hash(single, listReports)

    override fun toString(): String =
        when {
            single != null -> "ReportTextResponse{single=$single}"
            listReports != null -> "ReportTextResponse{listReports=$listReports}"
            _json != null -> "ReportTextResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ReportTextResponse")
        }

    companion object {

        /** Response containing a single report with its plain text */
        @JvmStatic
        fun ofSingle(single: SingleReportTextResponse) = ReportTextResponse(single = single)

        /** Response containing a list of reports with their plain text */
        @JvmStatic
        fun ofListReports(listReports: ListReportsTextResponse) =
            ReportTextResponse(listReports = listReports)
    }

    /**
     * An interface that defines how to map each variant of [ReportTextResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Response containing a single report with its plain text */
        fun visitSingle(single: SingleReportTextResponse): T

        /** Response containing a list of reports with their plain text */
        fun visitListReports(listReports: ListReportsTextResponse): T

        /**
         * Maps an unknown variant of [ReportTextResponse] to a value of type [T].
         *
         * An instance of [ReportTextResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws AvaraInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw AvaraInvalidDataException("Unknown ReportTextResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ReportTextResponse>(ReportTextResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ReportTextResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SingleReportTextResponse>())?.let {
                            ReportTextResponse(single = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ListReportsTextResponse>())?.let {
                            ReportTextResponse(listReports = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ReportTextResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ReportTextResponse>(ReportTextResponse::class) {

        override fun serialize(
            value: ReportTextResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.single != null -> generator.writeObject(value.single)
                value.listReports != null -> generator.writeObject(value.listReports)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ReportTextResponse")
            }
        }
    }

    /** Response containing a single report with its plain text */
    class SingleReportTextResponse
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reportId: JsonField<String>,
        private val snapshotMetadata: JsonField<StudyReportMetadata>,
        private val studyId: JsonField<String>,
        private val studyInstanceUid: JsonField<String>,
        private val plainText: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reportId")
            @ExcludeMissing
            reportId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("snapshotMetadata")
            @ExcludeMissing
            snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
            @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            studyInstanceUid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plainText")
            @ExcludeMissing
            plainText: JsonField<String> = JsonMissing.of(),
        ) : this(reportId, snapshotMetadata, studyId, studyInstanceUid, plainText, mutableMapOf())

        /**
         * Unique report identifier. Format: rep_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reportId(): String = reportId.getRequired("reportId")

        /**
         * Patient demographics and scan information for report generation
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun snapshotMetadata(): StudyReportMetadata =
            snapshotMetadata.getRequired("snapshotMetadata")

        /**
         * Study ID this report belongs to. Format: stu_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyId(): String = studyId.getRequired("studyId")

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

        /**
         * Plain text content of the report
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun plainText(): Optional<String> = plainText.getOptional("plainText")

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
             * Returns a mutable builder for constructing an instance of [SingleReportTextResponse].
             *
             * The following fields are required:
             * ```java
             * .reportId()
             * .snapshotMetadata()
             * .studyId()
             * .studyInstanceUid()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SingleReportTextResponse]. */
        class Builder internal constructor() {

            private var reportId: JsonField<String>? = null
            private var snapshotMetadata: JsonField<StudyReportMetadata>? = null
            private var studyId: JsonField<String>? = null
            private var studyInstanceUid: JsonField<String>? = null
            private var plainText: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(singleReportTextResponse: SingleReportTextResponse) = apply {
                reportId = singleReportTextResponse.reportId
                snapshotMetadata = singleReportTextResponse.snapshotMetadata
                studyId = singleReportTextResponse.studyId
                studyInstanceUid = singleReportTextResponse.studyInstanceUid
                plainText = singleReportTextResponse.plainText
                additionalProperties = singleReportTextResponse.additionalProperties.toMutableMap()
            }

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

            /** Plain text content of the report */
            fun plainText(plainText: String) = plainText(JsonField.of(plainText))

            /**
             * Sets [Builder.plainText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plainText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [SingleReportTextResponse].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reportId()
             * .snapshotMetadata()
             * .studyId()
             * .studyInstanceUid()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SingleReportTextResponse =
                SingleReportTextResponse(
                    checkRequired("reportId", reportId),
                    checkRequired("snapshotMetadata", snapshotMetadata),
                    checkRequired("studyId", studyId),
                    checkRequired("studyInstanceUid", studyInstanceUid),
                    plainText,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SingleReportTextResponse = apply {
            if (validated) {
                return@apply
            }

            reportId()
            snapshotMetadata().validate()
            studyId()
            studyInstanceUid()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (reportId.asKnown().isPresent) 1 else 0) +
                (snapshotMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyId.asKnown().isPresent) 1 else 0) +
                (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
                (if (plainText.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SingleReportTextResponse &&
                reportId == other.reportId &&
                snapshotMetadata == other.snapshotMetadata &&
                studyId == other.studyId &&
                studyInstanceUid == other.studyInstanceUid &&
                plainText == other.plainText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                reportId,
                snapshotMetadata,
                studyId,
                studyInstanceUid,
                plainText,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SingleReportTextResponse{reportId=$reportId, snapshotMetadata=$snapshotMetadata, studyId=$studyId, studyInstanceUid=$studyInstanceUid, plainText=$plainText, additionalProperties=$additionalProperties}"
    }

    /** Response containing a list of reports with their plain text */
    class ListReportsTextResponse
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
         * Array of report text items
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reports(): List<Report> = reports.getRequired("reports")

        /**
         * Study ID the reports belong to. Format: stu_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyId(): String = studyId.getRequired("studyId")

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
             * Returns a mutable builder for constructing an instance of [ListReportsTextResponse].
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

        /** A builder for [ListReportsTextResponse]. */
        class Builder internal constructor() {

            private var reports: JsonField<MutableList<Report>>? = null
            private var studyId: JsonField<String>? = null
            private var studyInstanceUid: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(listReportsTextResponse: ListReportsTextResponse) = apply {
                reports = listReportsTextResponse.reports.map { it.toMutableList() }
                studyId = listReportsTextResponse.studyId
                studyInstanceUid = listReportsTextResponse.studyInstanceUid
                additionalProperties = listReportsTextResponse.additionalProperties.toMutableMap()
            }

            /** Array of report text items */
            fun reports(reports: List<Report>) = reports(JsonField.of(reports))

            /**
             * Sets [Builder.reports] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reports] with a well-typed `List<Report>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [ListReportsTextResponse].
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
            fun build(): ListReportsTextResponse =
                ListReportsTextResponse(
                    checkRequired("reports", reports).map { it.toImmutable() },
                    checkRequired("studyId", studyId),
                    checkRequired("studyInstanceUid", studyInstanceUid),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ListReportsTextResponse = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (reports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (studyId.asKnown().isPresent) 1 else 0) +
                (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

        /** A report with its plain text content */
        class Report
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reportId: JsonField<String>,
            private val snapshotMetadata: JsonField<StudyReportMetadata>,
            private val studyId: JsonField<String>,
            private val studyInstanceUid: JsonField<String>,
            private val plainText: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reportId")
                @ExcludeMissing
                reportId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("snapshotMetadata")
                @ExcludeMissing
                snapshotMetadata: JsonField<StudyReportMetadata> = JsonMissing.of(),
                @JsonProperty("studyId")
                @ExcludeMissing
                studyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("studyInstanceUid")
                @ExcludeMissing
                studyInstanceUid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plainText")
                @ExcludeMissing
                plainText: JsonField<String> = JsonMissing.of(),
            ) : this(
                reportId,
                snapshotMetadata,
                studyId,
                studyInstanceUid,
                plainText,
                mutableMapOf(),
            )

            /**
             * Unique report identifier. Format: rep_{32-hex-chars}
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reportId(): String = reportId.getRequired("reportId")

            /**
             * Patient demographics and scan information for report generation
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun snapshotMetadata(): StudyReportMetadata =
                snapshotMetadata.getRequired("snapshotMetadata")

            /**
             * Study ID this report belongs to. Format: stu_{32-hex-chars}
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun studyId(): String = studyId.getRequired("studyId")

            /**
             * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
             * '1.2.840.10008.5.1.4.1.1.2')
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

            /**
             * Plain text content of the report
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun plainText(): Optional<String> = plainText.getOptional("plainText")

            /**
             * Returns the raw JSON value of [reportId].
             *
             * Unlike [reportId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reportId") @ExcludeMissing fun _reportId(): JsonField<String> = reportId

            /**
             * Returns the raw JSON value of [snapshotMetadata].
             *
             * Unlike [snapshotMetadata], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

            /**
             * Returns the raw JSON value of [plainText].
             *
             * Unlike [plainText], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("plainText")
            @ExcludeMissing
            fun _plainText(): JsonField<String> = plainText

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
                 * .reportId()
                 * .snapshotMetadata()
                 * .studyId()
                 * .studyInstanceUid()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Report]. */
            class Builder internal constructor() {

                private var reportId: JsonField<String>? = null
                private var snapshotMetadata: JsonField<StudyReportMetadata>? = null
                private var studyId: JsonField<String>? = null
                private var studyInstanceUid: JsonField<String>? = null
                private var plainText: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(report: Report) = apply {
                    reportId = report.reportId
                    snapshotMetadata = report.snapshotMetadata
                    studyId = report.studyId
                    studyInstanceUid = report.studyInstanceUid
                    plainText = report.plainText
                    additionalProperties = report.additionalProperties.toMutableMap()
                }

                /** Unique report identifier. Format: rep_{32-hex-chars} */
                fun reportId(reportId: String) = reportId(JsonField.of(reportId))

                /**
                 * Sets [Builder.reportId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reportId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reportId(reportId: JsonField<String>) = apply { this.reportId = reportId }

                /** Patient demographics and scan information for report generation */
                fun snapshotMetadata(snapshotMetadata: StudyReportMetadata) =
                    snapshotMetadata(JsonField.of(snapshotMetadata))

                /**
                 * Sets [Builder.snapshotMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.snapshotMetadata] with a well-typed
                 * [StudyReportMetadata] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun snapshotMetadata(snapshotMetadata: JsonField<StudyReportMetadata>) = apply {
                    this.snapshotMetadata = snapshotMetadata
                }

                /** Study ID this report belongs to. Format: stu_{32-hex-chars} */
                fun studyId(studyId: String) = studyId(JsonField.of(studyId))

                /**
                 * Sets [Builder.studyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.studyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.studyInstanceUid] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
                    this.studyInstanceUid = studyInstanceUid
                }

                /** Plain text content of the report */
                fun plainText(plainText: String) = plainText(JsonField.of(plainText))

                /**
                 * Sets [Builder.plainText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plainText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun plainText(plainText: JsonField<String>) = apply { this.plainText = plainText }

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
                 * Returns an immutable instance of [Report].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .reportId()
                 * .snapshotMetadata()
                 * .studyId()
                 * .studyInstanceUid()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Report =
                    Report(
                        checkRequired("reportId", reportId),
                        checkRequired("snapshotMetadata", snapshotMetadata),
                        checkRequired("studyId", studyId),
                        checkRequired("studyInstanceUid", studyInstanceUid),
                        plainText,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Report = apply {
                if (validated) {
                    return@apply
                }

                reportId()
                snapshotMetadata().validate()
                studyId()
                studyInstanceUid()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (reportId.asKnown().isPresent) 1 else 0) +
                    (snapshotMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (studyId.asKnown().isPresent) 1 else 0) +
                    (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
                    (if (plainText.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Report &&
                    reportId == other.reportId &&
                    snapshotMetadata == other.snapshotMetadata &&
                    studyId == other.studyId &&
                    studyInstanceUid == other.studyInstanceUid &&
                    plainText == other.plainText &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    reportId,
                    snapshotMetadata,
                    studyId,
                    studyInstanceUid,
                    plainText,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Report{reportId=$reportId, snapshotMetadata=$snapshotMetadata, studyId=$studyId, studyInstanceUid=$studyInstanceUid, plainText=$plainText, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ListReportsTextResponse &&
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
            "ListReportsTextResponse{reports=$reports, studyId=$studyId, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
    }
}
