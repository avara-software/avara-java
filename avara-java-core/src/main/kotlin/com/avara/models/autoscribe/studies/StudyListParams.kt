// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.Params
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.core.toImmutable
import com.avara.models.Severity
import com.avara.models.autoscribe.StudyReportStatus
import com.avara.models.autoscribe.StudyType
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a paginated list of studies with optional filtering by assignment, severity,
 * description, cancellation status, and report status. Returns up to 100 studies per request.
 */
class StudyListParams
private constructor(
    private val assignedTo: String?,
    private val cursor: String?,
    private val expressCustomerId: String?,
    private val isCancelled: Boolean?,
    private val limit: Double?,
    private val severity: Severity?,
    private val studyDescription: String?,
    private val studyReportStatus: List<StudyReportStatus>?,
    private val studyType: StudyType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by assigned user ID (null = explicitly unassigned). Format: usr_<32-hex-chars> */
    fun assignedTo(): Optional<String> = Optional.ofNullable(assignedTo)

    /** Base64 encoded cursor from previous response */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Filter by Express customer ID (null = studies with no customer). Format: cus_{32-hex-chars}
     */
    fun expressCustomerId(): Optional<String> = Optional.ofNullable(expressCustomerId)

    /** Filter by cancellation status */
    fun isCancelled(): Optional<Boolean> = Optional.ofNullable(isCancelled)

    /** Number of results to return (1-100) */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /** Filter by study severity */
    fun severity(): Optional<Severity> = Optional.ofNullable(severity)

    /** Filter by study description (contains match) */
    fun studyDescription(): Optional<String> = Optional.ofNullable(studyDescription)

    /** Filter by report status(es) */
    fun studyReportStatus(): Optional<List<StudyReportStatus>> =
        Optional.ofNullable(studyReportStatus)

    /** Filter by study kind. Omit to return both 'standard' and 'external' studies. */
    fun studyType(): Optional<StudyType> = Optional.ofNullable(studyType)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StudyListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StudyListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyListParams]. */
    class Builder internal constructor() {

        private var assignedTo: String? = null
        private var cursor: String? = null
        private var expressCustomerId: String? = null
        private var isCancelled: Boolean? = null
        private var limit: Double? = null
        private var severity: Severity? = null
        private var studyDescription: String? = null
        private var studyReportStatus: MutableList<StudyReportStatus>? = null
        private var studyType: StudyType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(studyListParams: StudyListParams) = apply {
            assignedTo = studyListParams.assignedTo
            cursor = studyListParams.cursor
            expressCustomerId = studyListParams.expressCustomerId
            isCancelled = studyListParams.isCancelled
            limit = studyListParams.limit
            severity = studyListParams.severity
            studyDescription = studyListParams.studyDescription
            studyReportStatus = studyListParams.studyReportStatus?.toMutableList()
            studyType = studyListParams.studyType
            additionalHeaders = studyListParams.additionalHeaders.toBuilder()
            additionalQueryParams = studyListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by assigned user ID (null = explicitly unassigned). Format: usr_<32-hex-chars> */
        fun assignedTo(assignedTo: String?) = apply { this.assignedTo = assignedTo }

        /** Alias for calling [Builder.assignedTo] with `assignedTo.orElse(null)`. */
        fun assignedTo(assignedTo: Optional<String>) = assignedTo(assignedTo.getOrNull())

        /** Base64 encoded cursor from previous response */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Filter by Express customer ID (null = studies with no customer). Format:
         * cus_{32-hex-chars}
         */
        fun expressCustomerId(expressCustomerId: String?) = apply {
            this.expressCustomerId = expressCustomerId
        }

        /** Alias for calling [Builder.expressCustomerId] with `expressCustomerId.orElse(null)`. */
        fun expressCustomerId(expressCustomerId: Optional<String>) =
            expressCustomerId(expressCustomerId.getOrNull())

        /** Filter by cancellation status */
        fun isCancelled(isCancelled: Boolean?) = apply { this.isCancelled = isCancelled }

        /**
         * Alias for [Builder.isCancelled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isCancelled(isCancelled: Boolean) = isCancelled(isCancelled as Boolean?)

        /** Alias for calling [Builder.isCancelled] with `isCancelled.orElse(null)`. */
        fun isCancelled(isCancelled: Optional<Boolean>) = isCancelled(isCancelled.getOrNull())

        /** Number of results to return (1-100) */
        fun limit(limit: Double?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Double) = limit(limit as Double?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Double>) = limit(limit.getOrNull())

        /** Filter by study severity */
        fun severity(severity: Severity?) = apply { this.severity = severity }

        /** Alias for calling [Builder.severity] with `severity.orElse(null)`. */
        fun severity(severity: Optional<Severity>) = severity(severity.getOrNull())

        /** Filter by study description (contains match) */
        fun studyDescription(studyDescription: String?) = apply {
            this.studyDescription = studyDescription
        }

        /** Alias for calling [Builder.studyDescription] with `studyDescription.orElse(null)`. */
        fun studyDescription(studyDescription: Optional<String>) =
            studyDescription(studyDescription.getOrNull())

        /** Filter by report status(es) */
        fun studyReportStatus(studyReportStatus: List<StudyReportStatus>?) = apply {
            this.studyReportStatus = studyReportStatus?.toMutableList()
        }

        /** Alias for calling [Builder.studyReportStatus] with `studyReportStatus.orElse(null)`. */
        fun studyReportStatus(studyReportStatus: Optional<List<StudyReportStatus>>) =
            studyReportStatus(studyReportStatus.getOrNull())

        /**
         * Adds a single [StudyReportStatus] to [Builder.studyReportStatus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStudyReportStatus(studyReportStatus: StudyReportStatus) = apply {
            this.studyReportStatus =
                (this.studyReportStatus ?: mutableListOf()).apply { add(studyReportStatus) }
        }

        /** Filter by study kind. Omit to return both 'standard' and 'external' studies. */
        fun studyType(studyType: StudyType?) = apply { this.studyType = studyType }

        /** Alias for calling [Builder.studyType] with `studyType.orElse(null)`. */
        fun studyType(studyType: Optional<StudyType>) = studyType(studyType.getOrNull())

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
         * Returns an immutable instance of [StudyListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StudyListParams =
            StudyListParams(
                assignedTo,
                cursor,
                expressCustomerId,
                isCancelled,
                limit,
                severity,
                studyDescription,
                studyReportStatus?.toImmutable(),
                studyType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                assignedTo?.let { put("assignedTo", it) }
                cursor?.let { put("cursor", it) }
                expressCustomerId?.let { put("expressCustomerId", it) }
                isCancelled?.let { put("isCancelled", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                severity?.let { put("severity", it.toString()) }
                studyDescription?.let { put("studyDescription", it) }
                studyReportStatus?.let {
                    put("studyReportStatus", it.joinToString(",") { it.toString() })
                }
                studyType?.let { put("studyType", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyListParams &&
            assignedTo == other.assignedTo &&
            cursor == other.cursor &&
            expressCustomerId == other.expressCustomerId &&
            isCancelled == other.isCancelled &&
            limit == other.limit &&
            severity == other.severity &&
            studyDescription == other.studyDescription &&
            studyReportStatus == other.studyReportStatus &&
            studyType == other.studyType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            assignedTo,
            cursor,
            expressCustomerId,
            isCancelled,
            limit,
            severity,
            studyDescription,
            studyReportStatus,
            studyType,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "StudyListParams{assignedTo=$assignedTo, cursor=$cursor, expressCustomerId=$expressCustomerId, isCancelled=$isCancelled, limit=$limit, severity=$severity, studyDescription=$studyDescription, studyReportStatus=$studyReportStatus, studyType=$studyType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
