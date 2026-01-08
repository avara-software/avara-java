// File generated from our OpenAPI spec by Stainless.

package com.avara.api.models.orgs

import com.avara.api.core.AutoPager
import com.avara.api.core.Page
import com.avara.api.core.checkRequired
import com.avara.api.services.blocking.OrgService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see OrgService.list */
class OrgListPage
private constructor(
    private val service: OrgService,
    private val params: OrgListParams,
    private val response: OrgListPageResponse,
) : Page<OrgListResponse> {

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

    override fun nextPage(): OrgListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OrgListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OrgListParams = params

    /** The response that this page was parsed from. */
    fun response(): OrgListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrgListPage].
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

    /** A builder for [OrgListPage]. */
    class Builder internal constructor() {

        private var service: OrgService? = null
        private var params: OrgListParams? = null
        private var response: OrgListPageResponse? = null

        @JvmSynthetic
        internal fun from(orgListPage: OrgListPage) = apply {
            service = orgListPage.service
            params = orgListPage.params
            response = orgListPage.response
        }

        fun service(service: OrgService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OrgListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OrgListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OrgListPage].
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
        fun build(): OrgListPage =
            OrgListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "OrgListPage{service=$service, params=$params, response=$response}"
}
