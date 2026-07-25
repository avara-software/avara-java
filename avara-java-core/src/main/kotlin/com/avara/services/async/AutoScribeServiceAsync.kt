// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async

import com.avara.core.ClientOptions
import com.avara.services.async.autoscribe.ClinicalReferenceServiceAsync
import com.avara.services.async.autoscribe.ReportServiceAsync
import com.avara.services.async.autoscribe.StudyServiceAsync
import com.avara.services.async.autoscribe.UserServiceAsync
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

    fun clinicalReferences(): ClinicalReferenceServiceAsync

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

        fun clinicalReferences(): ClinicalReferenceServiceAsync.WithRawResponse

        fun studies(): StudyServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse
    }
}
