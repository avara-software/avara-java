// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.users.invitations

import com.avara.core.Params
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.core.toImmutable
import com.avara.models.InvitationExpiredFilter
import com.avara.models.InvitationStatus
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a paginated list of user invitations with optional filtering by status, expiration,
 * date range, and user ID. Returns up to 100 invitations per request.
 */
class InvitationListParams
private constructor(
    private val cursor: String?,
    private val endDate: String?,
    private val expired: InvitationExpiredFilter?,
    private val limit: Double?,
    private val startDate: String?,
    private val status: List<InvitationStatus>?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Base64 encoded cursor from previous response */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter invitations created on or before this date (YYYY-MM-DD) */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** Filter by expiration status */
    fun expired(): Optional<InvitationExpiredFilter> = Optional.ofNullable(expired)

    /** Number of results to return (1-100) */
    fun limit(): Optional<Double> = Optional.ofNullable(limit)

    /** Filter invitations created on or after this date (YYYY-MM-DD) */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Filter by invitation status(es) */
    fun status(): Optional<List<InvitationStatus>> = Optional.ofNullable(status)

    /** Filter by user ID. Format: usr_{32-hex-chars} */
    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InvitationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvitationListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var endDate: String? = null
        private var expired: InvitationExpiredFilter? = null
        private var limit: Double? = null
        private var startDate: String? = null
        private var status: MutableList<InvitationStatus>? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invitationListParams: InvitationListParams) = apply {
            cursor = invitationListParams.cursor
            endDate = invitationListParams.endDate
            expired = invitationListParams.expired
            limit = invitationListParams.limit
            startDate = invitationListParams.startDate
            status = invitationListParams.status?.toMutableList()
            userId = invitationListParams.userId
            additionalHeaders = invitationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = invitationListParams.additionalQueryParams.toBuilder()
        }

        /** Base64 encoded cursor from previous response */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter invitations created on or before this date (YYYY-MM-DD) */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** Filter by expiration status */
        fun expired(expired: InvitationExpiredFilter?) = apply { this.expired = expired }

        /** Alias for calling [Builder.expired] with `expired.orElse(null)`. */
        fun expired(expired: Optional<InvitationExpiredFilter>) = expired(expired.getOrNull())

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

        /** Filter invitations created on or after this date (YYYY-MM-DD) */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** Filter by invitation status(es) */
        fun status(status: List<InvitationStatus>?) = apply {
            this.status = status?.toMutableList()
        }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<InvitationStatus>>) = status(status.getOrNull())

        /**
         * Adds a single [InvitationStatus] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: InvitationStatus) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        /** Filter by user ID. Format: usr_{32-hex-chars} */
        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

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
         * Returns an immutable instance of [InvitationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvitationListParams =
            InvitationListParams(
                cursor,
                endDate,
                expired,
                limit,
                startDate,
                status?.toImmutable(),
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                endDate?.let { put("endDate", it) }
                expired?.let { put("expired", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                startDate?.let { put("startDate", it) }
                status?.let { put("status", it.joinToString(",") { it.toString() }) }
                userId?.let { put("userId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationListParams &&
            cursor == other.cursor &&
            endDate == other.endDate &&
            expired == other.expired &&
            limit == other.limit &&
            startDate == other.startDate &&
            status == other.status &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            endDate,
            expired,
            limit,
            startDate,
            status,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvitationListParams{cursor=$cursor, endDate=$endDate, expired=$expired, limit=$limit, startDate=$startDate, status=$status, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
