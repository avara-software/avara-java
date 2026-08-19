// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.services.blocking.viewer.EphemeralSessionService
import com.avarasoftware.services.blocking.viewer.StudyService
import com.avarasoftware.services.blocking.viewer.UserService
import java.util.function.Consumer

interface ViewerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewerService

    fun ephemeralSessions(): EphemeralSessionService

    fun studies(): StudyService

    fun users(): UserService

    /** A view of [ViewerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewerService.WithRawResponse

        fun ephemeralSessions(): EphemeralSessionService.WithRawResponse

        fun studies(): StudyService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
