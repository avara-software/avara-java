// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.autoscribe.studies

import com.avara.api.core.AutoPager
import com.avara.api.core.Page
import com.avara.api.core.checkRequired
import com.avara.api.services.blocking.autoscribe.StudyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see StudyService.list */
class StudyListPage
private constructor(
    private val service: StudyService,
    private val params: StudyListParams,
    private val response: StudyListPageResponse,
) : Page<StudyListResponse> {

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

    override fun nextPage(): StudyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StudyListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StudyListParams = params

    /** The response that this page was parsed from. */
    fun response(): StudyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StudyListPage].
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

    /** A builder for [StudyListPage]. */
    class Builder internal constructor() {

        private var service: StudyService? = null
        private var params: StudyListParams? = null
        private var response: StudyListPageResponse? = null

        @JvmSynthetic
        internal fun from(studyListPage: StudyListPage) = apply {
            service = studyListPage.service
            params = studyListPage.params
            response = studyListPage.response
        }

        fun service(service: StudyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StudyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: StudyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [StudyListPage].
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
        fun build(): StudyListPage =
            StudyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "StudyListPage{service=$service, params=$params, response=$response}"
}
