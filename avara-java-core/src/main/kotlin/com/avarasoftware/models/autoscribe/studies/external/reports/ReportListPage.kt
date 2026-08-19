// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies.external.reports

import com.avarasoftware.core.AutoPager
import com.avarasoftware.core.Page
import com.avarasoftware.core.checkRequired
import com.avarasoftware.services.blocking.autoscribe.studies.external.ReportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ReportService.list */
class ReportListPage
private constructor(
    private val service: ReportService,
    private val params: ReportListParams,
    private val response: ReportListPageResponse,
) : Page<ReportListResponse> {

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

    override fun nextPage(): ReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ReportListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListPage]. */
    class Builder internal constructor() {

        private var service: ReportService? = null
        private var params: ReportListParams? = null
        private var response: ReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(reportListPage: ReportListPage) = apply {
            service = reportListPage.service
            params = reportListPage.params
            response = reportListPage.response
        }

        fun service(service: ReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReportListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportListPage =
            ReportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ReportListPage{service=$service, params=$params, response=$response}"
}
