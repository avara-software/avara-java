// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.core.ClientOptions
import com.avara.services.blocking.autoscribe.ClinicalReferenceService
import com.avara.services.blocking.autoscribe.ReportService
import com.avara.services.blocking.autoscribe.StudyService
import com.avara.services.blocking.autoscribe.UserService
import java.util.function.Consumer

interface AutoScribeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoScribeService

    fun clinicalReferences(): ClinicalReferenceService

    fun studies(): StudyService

    fun users(): UserService

    fun reports(): ReportService

    /** A view of [AutoScribeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoScribeService.WithRawResponse

        fun clinicalReferences(): ClinicalReferenceService.WithRawResponse

        fun studies(): StudyService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun reports(): ReportService.WithRawResponse
    }
}
