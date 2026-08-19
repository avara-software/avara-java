// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies.external.reports

import com.avarasoftware.core.AutoPagerAsync
import com.avarasoftware.core.PageAsync
import com.avarasoftware.core.checkRequired
import com.avarasoftware.services.async.autoscribe.studies.external.ReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ReportServiceAsync.list */
class ReportListPageAsync
private constructor(
    private val service: ReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReportListParams,
    private val response: ReportListPageResponse,
) : PageAsync<ReportListResponse> {

    /**
     * Delegates to [ReportListPageResponse], but gracefully handles missing data.
     *
     * @see ReportListPageResponse.reports
     */
    fun reports(): List<ReportListResponse> =
        response._reports().getOptional("reports").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportListPageResponse], but gracefully handles missing data.
     *
     * @see ReportListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [ReportListPageResponse], but gracefully handles missing data.
     *
     * @see ReportListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("hasMore")

    override fun items(): List<ReportListResponse> = reports()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && cursor().isPresent

    fun nextPageParams(): ReportListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ReportListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ReportListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReportListParams? = null
        private var response: ReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(reportListPageAsync: ReportListPageAsync) = apply {
            service = reportListPageAsync.service
            streamHandlerExecutor = reportListPageAsync.streamHandlerExecutor
            params = reportListPageAsync.params
            response = reportListPageAsync.response
        }

        fun service(service: ReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReportListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportListPageAsync =
            ReportListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
