// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.viewer.users

import com.avara.api.core.AutoPagerAsync
import com.avara.api.core.PageAsync
import com.avara.api.core.checkRequired
import com.avara.api.services.async.viewer.UserServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see UserServiceAsync.list */
class UserListPageAsync
private constructor(
    private val service: UserServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UserListParams,
    private val response: UserListPageResponse,
) : PageAsync<UserListResponse> {

    /**
     * Delegates to [UserListPageResponse], but gracefully handles missing data.
     *
     * @see UserListPageResponse.users
     */
    fun users(): List<UserListResponse> =
        response._users().getOptional("users").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserListPageResponse], but gracefully handles missing data.
     *
     * @see UserListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [UserListPageResponse], but gracefully handles missing data.
     *
     * @see UserListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("hasMore")

    override fun items(): List<UserListResponse> = users()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && cursor().isPresent

    fun nextPageParams(): UserListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UserListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UserListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UserListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserListPageAsync].
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

    /** A builder for [UserListPageAsync]. */
    class Builder internal constructor() {

        private var service: UserServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UserListParams? = null
        private var response: UserListPageResponse? = null

        @JvmSynthetic
        internal fun from(userListPageAsync: UserListPageAsync) = apply {
            service = userListPageAsync.service
            streamHandlerExecutor = userListPageAsync.streamHandlerExecutor
            params = userListPageAsync.params
            response = userListPageAsync.response
        }

        fun service(service: UserServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UserListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserListPageAsync].
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
        fun build(): UserListPageAsync =
            UserListPageAsync(
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

        return other is UserListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UserListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
