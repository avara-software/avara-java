// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async

import com.avara.api.core.ClientOptions
import com.avara.api.services.async.autoscribe.ReportServiceAsync
import com.avara.api.services.async.autoscribe.StudyServiceAsync
import com.avara.api.services.async.autoscribe.UserServiceAsync
import java.util.function.Consumer

interface AutoScribeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoScribeServiceAsync

    fun studies(): StudyServiceAsync

    fun users(): UserServiceAsync

    fun reports(): ReportServiceAsync

    /**
     * A view of [AutoScribeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoScribeServiceAsync.WithRawResponse

        fun studies(): StudyServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse
    }
}
