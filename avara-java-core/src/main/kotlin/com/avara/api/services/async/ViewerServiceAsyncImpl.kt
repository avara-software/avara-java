// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async

import com.avara.api.core.ClientOptions
import com.avara.api.services.async.viewer.StudyServiceAsync
import com.avara.api.services.async.viewer.StudyServiceAsyncImpl
import com.avara.api.services.async.viewer.UserServiceAsync
import com.avara.api.services.async.viewer.UserServiceAsyncImpl
import java.util.function.Consumer

class ViewerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ViewerServiceAsync {

    private val withRawResponse: ViewerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val studies: StudyServiceAsync by lazy { StudyServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ViewerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewerServiceAsync =
        ViewerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun studies(): StudyServiceAsync = studies

    override fun users(): UserServiceAsync = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ViewerServiceAsync.WithRawResponse {

        private val studies: StudyServiceAsync.WithRawResponse by lazy {
            StudyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ViewerServiceAsync.WithRawResponse =
            ViewerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun studies(): StudyServiceAsync.WithRawResponse = studies

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
