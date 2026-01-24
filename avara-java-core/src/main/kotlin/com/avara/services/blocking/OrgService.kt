// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.core.ClientOptions
import com.avara.services.blocking.orgs.UserService
import java.util.function.Consumer

interface OrgService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService

    fun users(): UserService

    /** A view of [OrgService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
