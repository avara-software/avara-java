// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import com.avara.api.core.AutoPagerAsync
import com.avara.api.core.PageAsync
import com.avara.api.core.checkRequired
import com.avara.api.services.async.OrgServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see OrgServiceAsync.list */
class OrgListPageAsync
private constructor(
    private val service: OrgServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OrgListParams,
    private val response: OrgListPageResponse,
) : PageAsync<OrgListResponse> {

    /**
     * Delegates to [OrgListPageResponse], but gracefully handles missing data.
     *
     * @see OrgListPageResponse.organizations
     */
    fun organizations(): List<OrgListResponse> =
        response._organizations().getOptional("organizations").getOrNull() ?: emptyList()

    /**
     * Delegates to [OrgListPageResponse], but gracefully handles missing data.
     *
     * @see OrgListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [OrgListPageResponse], but gracefully handles missing data.
     *
     * @see OrgListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("hasMore")

    override fun items(): List<OrgListResponse> = organizations()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && cursor().isPresent

    fun nextPageParams(): OrgListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<OrgListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OrgListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OrgListParams = params

    /** The response that this page was parsed from. */
    fun response(): OrgListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrgListPageAsync].
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

    /** A builder for [OrgListPageAsync]. */
    class Builder internal constructor() {

        private var service: OrgServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OrgListParams? = null
        private var response: OrgListPageResponse? = null

        @JvmSynthetic
        internal fun from(orgListPageAsync: OrgListPageAsync) = apply {
            service = orgListPageAsync.service
            streamHandlerExecutor = orgListPageAsync.streamHandlerExecutor
            params = orgListPageAsync.params
            response = orgListPageAsync.response
        }

        fun service(service: OrgServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OrgListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OrgListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OrgListPageAsync].
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
        fun build(): OrgListPageAsync =
            OrgListPageAsync(
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

        return other is OrgListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OrgListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
