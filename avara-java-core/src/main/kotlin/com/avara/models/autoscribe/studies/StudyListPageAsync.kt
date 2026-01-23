// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.AutoPagerAsync
import com.avara.core.PageAsync
import com.avara.core.checkRequired
import com.avara.services.async.autoscribe.StudyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see StudyServiceAsync.list */
class StudyListPageAsync
private constructor(
    private val service: StudyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StudyListParams,
    private val response: StudyListPageResponse,
) : PageAsync<StudyListResponse> {

    /**
     * Delegates to [StudyListPageResponse], but gracefully handles missing data.
     *
     * @see StudyListPageResponse.studies
     */
    fun studies(): List<StudyListResponse> =
        response._studies().getOptional("studies").getOrNull() ?: emptyList()

    /**
     * Delegates to [StudyListPageResponse], but gracefully handles missing data.
     *
     * @see StudyListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [StudyListPageResponse], but gracefully handles missing data.
     *
     * @see StudyListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("hasMore")

    override fun items(): List<StudyListResponse> = studies()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && cursor().isPresent

    fun nextPageParams(): StudyListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<StudyListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StudyListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): StudyListParams = params

    /** The response that this page was parsed from. */
    fun response(): StudyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StudyListPageAsync].
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

    /** A builder for [StudyListPageAsync]. */
    class Builder internal constructor() {

        private var service: StudyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StudyListParams? = null
        private var response: StudyListPageResponse? = null

        @JvmSynthetic
        internal fun from(studyListPageAsync: StudyListPageAsync) = apply {
            service = studyListPageAsync.service
            streamHandlerExecutor = studyListPageAsync.streamHandlerExecutor
            params = studyListPageAsync.params
            response = studyListPageAsync.response
        }

        fun service(service: StudyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: StudyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: StudyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [StudyListPageAsync].
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
        fun build(): StudyListPageAsync =
            StudyListPageAsync(
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

        return other is StudyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "StudyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
