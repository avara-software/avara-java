// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async

import com.avara.api.core.ClientOptions
import com.avara.api.services.async.viewer.StudyServiceAsync
import com.avara.api.services.async.viewer.UserServiceAsync
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

        fun studies(): StudyServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse
    }
}
