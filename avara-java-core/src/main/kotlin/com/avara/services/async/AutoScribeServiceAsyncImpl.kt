// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async

import com.avara.core.ClientOptions
import com.avara.services.async.autoscribe.ClinicalReferenceServiceAsync
import com.avara.services.async.autoscribe.ClinicalReferenceServiceAsyncImpl
import com.avara.services.async.autoscribe.EphemeralSessionServiceAsync
import com.avara.services.async.autoscribe.EphemeralSessionServiceAsyncImpl
import com.avara.services.async.autoscribe.ReportServiceAsync
import com.avara.services.async.autoscribe.ReportServiceAsyncImpl
import com.avara.services.async.autoscribe.StudyServiceAsync
import com.avara.services.async.autoscribe.StudyServiceAsyncImpl
import com.avara.services.async.autoscribe.UserServiceAsync
import com.avara.services.async.autoscribe.UserServiceAsyncImpl
import java.util.function.Consumer

class AutoScribeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutoScribeServiceAsync {

    private val withRawResponse: AutoScribeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val clinicalReferences: ClinicalReferenceServiceAsync by lazy {
        ClinicalReferenceServiceAsyncImpl(clientOptions)
    }

    private val ephemeralSessions: EphemeralSessionServiceAsync by lazy {
        EphemeralSessionServiceAsyncImpl(clientOptions)
    }

    private val studies: StudyServiceAsync by lazy { StudyServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val reports: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AutoScribeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutoScribeServiceAsync =
        AutoScribeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun clinicalReferences(): ClinicalReferenceServiceAsync = clinicalReferences

    override fun ephemeralSessions(): EphemeralSessionServiceAsync = ephemeralSessions

    override fun studies(): StudyServiceAsync = studies

    override fun users(): UserServiceAsync = users

    override fun reports(): ReportServiceAsync = reports

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoScribeServiceAsync.WithRawResponse {

        private val clinicalReferences: ClinicalReferenceServiceAsync.WithRawResponse by lazy {
            ClinicalReferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemeralSessions: EphemeralSessionServiceAsync.WithRawResponse by lazy {
            EphemeralSessionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val studies: StudyServiceAsync.WithRawResponse by lazy {
            StudyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoScribeServiceAsync.WithRawResponse =
            AutoScribeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun clinicalReferences(): ClinicalReferenceServiceAsync.WithRawResponse =
            clinicalReferences

        override fun ephemeralSessions(): EphemeralSessionServiceAsync.WithRawResponse =
            ephemeralSessions

        override fun studies(): StudyServiceAsync.WithRawResponse = studies

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun reports(): ReportServiceAsync.WithRawResponse = reports
    }
}
