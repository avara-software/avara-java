// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async

import com.avara.core.ClientOptions
import com.avara.services.async.viewer.EphemeralSessionServiceAsync
import com.avara.services.async.viewer.StudyServiceAsync
import com.avara.services.async.viewer.UserServiceAsync
import java.util.function.Consumer

interface ViewerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewerServiceAsync

    fun ephemeralSessions(): EphemeralSessionServiceAsync

    fun studies(): StudyServiceAsync

    fun users(): UserServiceAsync

    /**
     * A view of [ViewerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ViewerServiceAsync.WithRawResponse

        fun ephemeralSessions(): EphemeralSessionServiceAsync.WithRawResponse

        fun studies(): StudyServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse
    }
}
