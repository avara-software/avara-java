// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.services.blocking.autoscribe.ClinicalReferenceService
import com.avarasoftware.services.blocking.autoscribe.ClinicalReferenceServiceImpl
import com.avarasoftware.services.blocking.autoscribe.EphemeralSessionService
import com.avarasoftware.services.blocking.autoscribe.EphemeralSessionServiceImpl
import com.avarasoftware.services.blocking.autoscribe.ReportService
import com.avarasoftware.services.blocking.autoscribe.ReportServiceImpl
import com.avarasoftware.services.blocking.autoscribe.StudyService
import com.avarasoftware.services.blocking.autoscribe.StudyServiceImpl
import com.avarasoftware.services.blocking.autoscribe.UserService
import com.avarasoftware.services.blocking.autoscribe.UserServiceImpl
import java.util.function.Consumer

class AutoScribeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoScribeService {

    private val withRawResponse: AutoScribeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val clinicalReferences: ClinicalReferenceService by lazy {
        ClinicalReferenceServiceImpl(clientOptions)
    }

    private val ephemeralSessions: EphemeralSessionService by lazy {
        EphemeralSessionServiceImpl(clientOptions)
    }

    private val studies: StudyService by lazy { StudyServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): AutoScribeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoScribeService =
        AutoScribeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun clinicalReferences(): ClinicalReferenceService = clinicalReferences

    override fun ephemeralSessions(): EphemeralSessionService = ephemeralSessions

    override fun studies(): StudyService = studies

    override fun users(): UserService = users

    override fun reports(): ReportService = reports

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoScribeService.WithRawResponse {

        private val clinicalReferences: ClinicalReferenceService.WithRawResponse by lazy {
            ClinicalReferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemeralSessions: EphemeralSessionService.WithRawResponse by lazy {
            EphemeralSessionServiceImpl.WithRawResponseImpl(clientOptions)
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

        override fun ephemeralSessions(): EphemeralSessionService.WithRawResponse =
            ephemeralSessions

        override fun studies(): StudyService.WithRawResponse = studies

        override fun users(): UserService.WithRawResponse = users

        override fun reports(): ReportService.WithRawResponse = reports
    }
}
