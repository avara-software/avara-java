// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.reports

import com.avarasoftware.core.Params
import com.avarasoftware.core.http.Headers
import com.avarasoftware.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves the text content of a report. Can fetch a single report by report ID, or all reports
 * for a study by study ID/DICOM UID. Returns plain text report content.
 */
class ReportTextParams
private constructor(
    private val reportId: String?,
    private val studyId: String?,
    private val studyInstanceUid: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique report identifier. Format: rep_{32-hex-chars} */
    fun reportId(): Optional<String> = Optional.ofNullable(reportId)

    /** Unique study identifier. Format: stu_{32-hex-chars} */
    fun studyId(): Optional<String> = Optional.ofNullable(studyId)

    /**
     * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
     * '1.2.840.10008.5.1.4.1.1.2')
     */
    fun studyInstanceUid(): Optional<String> = Optional.ofNullable(studyInstanceUid)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReportTextParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ReportTextParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportTextParams]. */
    class Builder internal constructor() {

        private var reportId: String? = null
        private var studyId: String? = null
        private var studyInstanceUid: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reportTextParams: ReportTextParams) = apply {
            reportId = reportTextParams.reportId
            studyId = reportTextParams.studyId
            studyInstanceUid = reportTextParams.studyInstanceUid
            additionalHeaders = reportTextParams.additionalHeaders.toBuilder()
            additionalQueryParams = reportTextParams.additionalQueryParams.toBuilder()
        }

        /** Unique report identifier. Format: rep_{32-hex-chars} */
        fun reportId(reportId: String?) = apply { this.reportId = reportId }

        /** Alias for calling [Builder.reportId] with `reportId.orElse(null)`. */
        fun reportId(reportId: Optional<String>) = reportId(reportId.getOrNull())

        /** Unique study identifier. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String?) = apply { this.studyId = studyId }

        /** Alias for calling [Builder.studyId] with `studyId.orElse(null)`. */
        fun studyId(studyId: Optional<String>) = studyId(studyId.getOrNull())

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         */
        fun studyInstanceUid(studyInstanceUid: String?) = apply {
            this.studyInstanceUid = studyInstanceUid
        }

        /** Alias for calling [Builder.studyInstanceUid] with `studyInstanceUid.orElse(null)`. */
        fun studyInstanceUid(studyInstanceUid: Optional<String>) =
            studyInstanceUid(studyInstanceUid.getOrNull())

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
         * Returns an immutable instance of [ReportTextParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportTextParams =
            ReportTextParams(
                reportId,
                studyId,
                studyInstanceUid,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                reportId?.let { put("reportId", it) }
                studyId?.let { put("studyId", it) }
                studyInstanceUid?.let { put("studyInstanceUid", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportTextParams &&
            reportId == other.reportId &&
            studyId == other.studyId &&
            studyInstanceUid == other.studyInstanceUid &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(reportId, studyId, studyInstanceUid, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReportTextParams{reportId=$reportId, studyId=$studyId, studyInstanceUid=$studyInstanceUid, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
