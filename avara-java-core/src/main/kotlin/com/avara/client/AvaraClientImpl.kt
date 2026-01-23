// File generated from our OpenAPI spec by Stainless.

package com.avara.client

import com.avara.core.ClientOptions
import com.avara.core.getPackageVersion
import com.avara.services.blocking.AutoScribeService
import com.avara.services.blocking.AutoScribeServiceImpl
import com.avara.services.blocking.OrgService
import com.avara.services.blocking.OrgServiceImpl
import com.avara.services.blocking.ViewerService
import com.avara.services.blocking.ViewerServiceImpl
import com.avara.services.blocking.WebhookService
import com.avara.services.blocking.WebhookServiceImpl
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

    private val orgs: OrgService by lazy { OrgServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): AvaraClientAsync = async

    override fun withRawResponse(): AvaraClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClient =
        AvaraClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoScribe(): AutoScribeService = autoScribe

    override fun viewer(): ViewerService = viewer

    override fun orgs(): OrgService = orgs

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

        private val orgs: OrgService.WithRawResponse by lazy {
            OrgServiceImpl.WithRawResponseImpl(clientOptions)
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

        override fun orgs(): OrgService.WithRawResponse = orgs

        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
