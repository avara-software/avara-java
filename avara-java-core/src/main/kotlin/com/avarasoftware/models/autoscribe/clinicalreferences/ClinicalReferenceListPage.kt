// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.clinicalreferences

import com.avarasoftware.core.AutoPager
import com.avarasoftware.core.Page
import com.avarasoftware.core.checkRequired
import com.avarasoftware.services.blocking.autoscribe.ClinicalReferenceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ClinicalReferenceService.list */
class ClinicalReferenceListPage
private constructor(
    private val service: ClinicalReferenceService,
    private val params: ClinicalReferenceListParams,
    private val response: ClinicalReferenceListPageResponse,
) : Page<ClinicalReference> {

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

    override fun nextPage(): ClinicalReferenceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ClinicalReference> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ClinicalReferenceListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClinicalReferenceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClinicalReferenceListPage].
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

    /** A builder for [ClinicalReferenceListPage]. */
    class Builder internal constructor() {

        private var service: ClinicalReferenceService? = null
        private var params: ClinicalReferenceListParams? = null
        private var response: ClinicalReferenceListPageResponse? = null

        @JvmSynthetic
        internal fun from(clinicalReferenceListPage: ClinicalReferenceListPage) = apply {
            service = clinicalReferenceListPage.service
            params = clinicalReferenceListPage.params
            response = clinicalReferenceListPage.response
        }

        fun service(service: ClinicalReferenceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ClinicalReferenceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClinicalReferenceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ClinicalReferenceListPage].
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
        fun build(): ClinicalReferenceListPage =
            ClinicalReferenceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalReferenceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ClinicalReferenceListPage{service=$service, params=$params, response=$response}"
}
