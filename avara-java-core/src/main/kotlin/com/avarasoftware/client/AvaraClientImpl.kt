// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.client

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.getPackageVersion
import com.avarasoftware.services.blocking.AutoScribeService
import com.avarasoftware.services.blocking.AutoScribeServiceImpl
import com.avarasoftware.services.blocking.ExpressService
import com.avarasoftware.services.blocking.ExpressServiceImpl
import com.avarasoftware.services.blocking.ViewerService
import com.avarasoftware.services.blocking.ViewerServiceImpl
import com.avarasoftware.services.blocking.WebhookService
import com.avarasoftware.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class AvaraClientImpl(private val clientOptions: ClientOptions) : AvaraClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: AvaraClientAsync by lazy { AvaraClientAsyncImpl(clientOptions) }

    private val withRawResponse: AvaraClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoScribe: AutoScribeService by lazy {
        AutoScribeServiceImpl(clientOptionsWithUserAgent)
    }

    private val viewer: ViewerService by lazy { ViewerServiceImpl(clientOptionsWithUserAgent) }

    private val express: ExpressService by lazy { ExpressServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): AvaraClientAsync = async

    override fun withRawResponse(): AvaraClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClient =
        AvaraClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoScribe(): AutoScribeService = autoScribe

    override fun viewer(): ViewerService = viewer

    override fun express(): ExpressService = express

    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvaraClient.WithRawResponse {

        private val autoScribe: AutoScribeService.WithRawResponse by lazy {
            AutoScribeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val viewer: ViewerService.WithRawResponse by lazy {
            ViewerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val express: ExpressService.WithRawResponse by lazy {
            ExpressServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvaraClient.WithRawResponse =
            AvaraClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autoScribe(): AutoScribeService.WithRawResponse = autoScribe

        override fun viewer(): ViewerService.WithRawResponse = viewer

        override fun express(): ExpressService.WithRawResponse = express

        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
