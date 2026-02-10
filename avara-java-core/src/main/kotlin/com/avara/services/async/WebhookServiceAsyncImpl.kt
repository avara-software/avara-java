// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async

import com.avara.core.ClientOptions
import com.avara.core.UnwrapWebhookParams
import com.avara.models.webhooks.UnsafeUnwrapWebhookEvent
import com.avara.models.webhooks.UnwrapWebhookEvent
import com.avara.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unsafeUnwrap(body: String): UnsafeUnwrapWebhookEvent =
        WebhookServiceImpl(clientOptions).unsafeUnwrap(body)

    override fun unwrap(body: String): UnwrapWebhookEvent =
        WebhookServiceImpl(clientOptions).unwrap(body)

    override fun unwrap(unwrapParams: UnwrapWebhookParams): UnwrapWebhookEvent =
        WebhookServiceImpl(clientOptions).unwrap(unwrapParams)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
