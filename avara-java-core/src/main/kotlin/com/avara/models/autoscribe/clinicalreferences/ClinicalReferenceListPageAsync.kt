// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

import com.avara.core.AutoPagerAsync
import com.avara.core.PageAsync
import com.avara.core.checkRequired
import com.avara.services.async.autoscribe.ClinicalReferenceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ClinicalReferenceServiceAsync.list */
class ClinicalReferenceListPageAsync
private constructor(
    private val service: ClinicalReferenceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ClinicalReferenceListParams,
    private val response: ClinicalReferenceListPageResponse,
) : PageAsync<ClinicalReference> {

    /**
     * Delegates to [ClinicalReferenceListPageResponse], but gracefully handles missing data.
     *
     * @see ClinicalReferenceListPageResponse.clinicalReferences
     */
    fun clinicalReferences(): List<ClinicalReference> =
        response._clinicalReferences().getOptional("clinicalReferences").getOrNull() ?: emptyList()

    /**
     * Delegates to [ClinicalReferenceListPageResponse], but gracefully handles missing data.
     *
     * @see ClinicalReferenceListPageResponse.cursor
     */
    fun cursor(): Optional<String> = response._cursor().getOptional("cursor")

    /**
     * Delegates to [ClinicalReferenceListPageResponse], but gracefully handles missing data.
     *
     * @see ClinicalReferenceListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("hasMore")

    override fun items(): List<ClinicalReference> = clinicalReferences()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && cursor().isPresent

    fun nextPageParams(): ClinicalReferenceListParams {
        val nextCursor =
            cursor().getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ClinicalReferenceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ClinicalReference> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ClinicalReferenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClinicalReferenceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ClinicalReferenceListPageAsync].
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

    /** A builder for [ClinicalReferenceListPageAsync]. */
    class Builder internal constructor() {

        private var service: ClinicalReferenceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ClinicalReferenceListParams? = null
        private var response: ClinicalReferenceListPageResponse? = null

        @JvmSynthetic
        internal fun from(clinicalReferenceListPageAsync: ClinicalReferenceListPageAsync) = apply {
            service = clinicalReferenceListPageAsync.service
            streamHandlerExecutor = clinicalReferenceListPageAsync.streamHandlerExecutor
            params = clinicalReferenceListPageAsync.params
            response = clinicalReferenceListPageAsync.response
        }

        fun service(service: ClinicalReferenceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ClinicalReferenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClinicalReferenceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ClinicalReferenceListPageAsync].
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
        fun build(): ClinicalReferenceListPageAsync =
            ClinicalReferenceListPageAsync(
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

        return other is ClinicalReferenceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ClinicalReferenceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
