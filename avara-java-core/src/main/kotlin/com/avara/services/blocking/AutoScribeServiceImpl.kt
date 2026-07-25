// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.core.ClientOptions
import com.avara.services.blocking.autoscribe.ClinicalReferenceService
import com.avara.services.blocking.autoscribe.ClinicalReferenceServiceImpl
import com.avara.services.blocking.autoscribe.ReportService
import com.avara.services.blocking.autoscribe.ReportServiceImpl
import com.avara.services.blocking.autoscribe.StudyService
import com.avara.services.blocking.autoscribe.StudyServiceImpl
import com.avara.services.blocking.autoscribe.UserService
import com.avara.services.blocking.autoscribe.UserServiceImpl
import java.util.function.Consumer

class AutoScribeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoScribeService {

    private val withRawResponse: AutoScribeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val clinicalReferences: ClinicalReferenceService by lazy {
        ClinicalReferenceServiceImpl(clientOptions)
    }

    private val studies: StudyService by lazy { StudyServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): AutoScribeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoScribeService =
        AutoScribeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun clinicalReferences(): ClinicalReferenceService = clinicalReferences

    override fun studies(): StudyService = studies

    override fun users(): UserService = users

    override fun reports(): ReportService = reports

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoScribeService.WithRawResponse {

        private val clinicalReferences: ClinicalReferenceService.WithRawResponse by lazy {
            ClinicalReferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val studies: StudyService.WithRawResponse by lazy {
            StudyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoScribeService.WithRawResponse =
            AutoScribeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun clinicalReferences(): ClinicalReferenceService.WithRawResponse =
            clinicalReferences

        override fun studies(): StudyService.WithRawResponse = studies

        override fun users(): UserService.WithRawResponse = users

        override fun reports(): ReportService.WithRawResponse = reports
    }
}
