// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.services.blocking.viewer.EphemeralSessionService
import com.avarasoftware.services.blocking.viewer.EphemeralSessionServiceImpl
import com.avarasoftware.services.blocking.viewer.StudyService
import com.avarasoftware.services.blocking.viewer.StudyServiceImpl
import com.avarasoftware.services.blocking.viewer.UserService
import com.avarasoftware.services.blocking.viewer.UserServiceImpl
import java.util.function.Consumer

class ViewerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ViewerService {

    private val withRawResponse: ViewerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ephemeralSessions: EphemeralSessionService by lazy {
        EphemeralSessionServiceImpl(clientOptions)
    }

    private val studies: StudyService by lazy { StudyServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): ViewerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewerService =
        ViewerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ephemeralSessions(): EphemeralSessionService = ephemeralSessions

    override fun studies(): StudyService = studies

    override fun users(): UserService = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ViewerService.WithRawResponse {

        private val ephemeralSessions: EphemeralSessionService.WithRawResponse by lazy {
            EphemeralSessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val studies: StudyService.WithRawResponse by lazy {
            StudyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ViewerService.WithRawResponse =
            ViewerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ephemeralSessions(): EphemeralSessionService.WithRawResponse =
            ephemeralSessions

        override fun studies(): StudyService.WithRawResponse = studies

        override fun users(): UserService.WithRawResponse = users
    }
}
