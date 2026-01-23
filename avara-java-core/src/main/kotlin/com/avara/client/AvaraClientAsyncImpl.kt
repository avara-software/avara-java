// File generated from our OpenAPI spec by Stainless.

package com.avara.client

import com.avara.core.ClientOptions
import com.avara.core.getPackageVersion
import com.avara.services.async.AutoScribeServiceAsync
import com.avara.services.async.AutoScribeServiceAsyncImpl
import com.avara.services.async.OrgServiceAsync
import com.avara.services.async.OrgServiceAsyncImpl
import com.avara.services.async.ViewerServiceAsync
import com.avara.services.async.ViewerServiceAsyncImpl
import com.avara.services.async.WebhookServiceAsync
import com.avara.services.async.WebhookServiceAsyncImpl
import java.util.function.Consumer

class AvaraClientAsyncImpl(private val clientOptions: ClientOptions) : AvaraClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: AvaraClient by lazy { AvaraClientImpl(clientOptions) }

    private val withRawResponse: AvaraClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoScribe: AutoScribeServiceAsync by lazy {
        AutoScribeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val viewer: ViewerServiceAsync by lazy {
        ViewerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orgs: OrgServiceAsync by lazy { OrgServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): AvaraClient = sync

    override fun withRawResponse(): AvaraClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvaraClientAsync =
        AvaraClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoScribe(): AutoScribeServiceAsync = autoScribe

    override fun viewer(): ViewerServiceAsync = viewer

    override fun orgs(): OrgServiceAsync = orgs

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvaraClientAsync.WithRawResponse {

        private val autoScribe: AutoScribeServiceAsync.WithRawResponse by lazy {
            AutoScribeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val viewer: ViewerServiceAsync.WithRawResponse by lazy {
            ViewerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orgs: OrgServiceAsync.WithRawResponse by lazy {
            OrgServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvaraClientAsync.WithRawResponse =
            AvaraClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autoScribe(): AutoScribeServiceAsync.WithRawResponse = autoScribe

        override fun viewer(): ViewerServiceAsync.WithRawResponse = viewer

        override fun orgs(): OrgServiceAsync.WithRawResponse = orgs

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
