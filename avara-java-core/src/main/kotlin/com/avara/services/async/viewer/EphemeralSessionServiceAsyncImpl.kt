// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.viewer

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.handlers.errorBodyHandler
import com.avara.core.handlers.errorHandler
import com.avara.core.handlers.jsonHandler
import com.avara.core.http.HttpMethod
import com.avara.core.http.HttpRequest
import com.avara.core.http.HttpResponse
import com.avara.core.http.HttpResponse.Handler
import com.avara.core.http.HttpResponseFor
import com.avara.core.http.json
import com.avara.core.http.parseable
import com.avara.core.prepareAsync
import com.avara.models.viewer.ephemeralsessions.EphemeralSessionCreateParams
import com.avara.models.viewer.ephemeralsessions.EphemeralSessionCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EphemeralSessionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EphemeralSessionServiceAsync {

    private val withRawResponse: EphemeralSessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EphemeralSessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EphemeralSessionServiceAsync =
        EphemeralSessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EphemeralSessionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EphemeralSessionCreateResponse> =
        // post /v1/viewer/ephemeral-sessions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EphemeralSessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemeralSessionServiceAsync.WithRawResponse =
            EphemeralSessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EphemeralSessionCreateResponse> =
            jsonHandler<EphemeralSessionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EphemeralSessionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EphemeralSessionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "ephemeral-sessions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
