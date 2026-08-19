// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.express

import com.avarasoftware.core.AutoPager
import com.avarasoftware.core.Page
import com.avarasoftware.core.checkRequired
import com.avarasoftware.services.blocking.ExpressService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExpressService.list */
class ExpressListPage
private constructor(
    private val service: ExpressService,
    private val params: ExpressListParams,
    private val response: ExpressListPageResponse,
) : Page<ExpressListResponse> {

    /**
     * Delegates to [ExpressListPageResponse], but gracefully handles missing data.
     *
     * @see ExpressListPageResponse.expressCustomers
     */
    fun expressCustomers(): List<ExpressListResponse> =
        response._expressCustomers().getOptional("expressCustomers").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExpressListPageResponse], but gracefully handles missing data.
     *
     * @see ExpressListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [ExpressListPageResponse], but gracefully handles missing data.
     *
     * @see ExpressListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("hasMore")

    override fun items(): List<ExpressListResponse> = expressCustomers()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && cursor().isPresent

    fun nextPageParams(): ExpressListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ExpressListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExpressListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExpressListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExpressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExpressListPage].
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

    /** A builder for [ExpressListPage]. */
    class Builder internal constructor() {

        private var service: ExpressService? = null
        private var params: ExpressListParams? = null
        private var response: ExpressListPageResponse? = null

        @JvmSynthetic
        internal fun from(expressListPage: ExpressListPage) = apply {
            service = expressListPage.service
            params = expressListPage.params
            response = expressListPage.response
        }

        fun service(service: ExpressService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExpressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExpressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExpressListPage].
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
        fun build(): ExpressListPage =
            ExpressListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpressListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExpressListPage{service=$service, params=$params, response=$response}"
}
