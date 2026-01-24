// File generated from our OpenAPI spec by Stainless.

package com.avara.models.express

import com.avara.core.AutoPagerAsync
import com.avara.core.PageAsync
import com.avara.core.checkRequired
import com.avara.services.async.ExpressServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExpressServiceAsync.list */
class ExpressListPageAsync
private constructor(
    private val service: ExpressServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExpressListParams,
    private val response: ExpressListPageResponse,
) : PageAsync<ExpressListResponse> {

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

    override fun nextPage(): CompletableFuture<ExpressListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExpressListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExpressListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExpressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExpressListPageAsync].
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

    /** A builder for [ExpressListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExpressServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExpressListParams? = null
        private var response: ExpressListPageResponse? = null

        @JvmSynthetic
        internal fun from(expressListPageAsync: ExpressListPageAsync) = apply {
            service = expressListPageAsync.service
            streamHandlerExecutor = expressListPageAsync.streamHandlerExecutor
            params = expressListPageAsync.params
            response = expressListPageAsync.response
        }

        fun service(service: ExpressServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExpressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExpressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExpressListPageAsync].
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
        fun build(): ExpressListPageAsync =
            ExpressListPageAsync(
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

        return other is ExpressListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExpressListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
