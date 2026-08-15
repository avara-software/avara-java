// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

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
import com.avara.core.prepare
import com.avara.models.autoscribe.ephemeralsessions.EphemeralSessionCreateParams
import com.avara.models.autoscribe.ephemeralsessions.EphemeralSessionCreateResponse
import java.util.function.Consumer

class EphemeralSessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EphemeralSessionService {

    private val withRawResponse: EphemeralSessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EphemeralSessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemeralSessionService =
        EphemeralSessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EphemeralSessionCreateParams,
        requestOptions: RequestOptions,
    ): EphemeralSessionCreateResponse =
        // post /v1/autoScribe/ephemeral-sessions
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EphemeralSessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EphemeralSessionService.WithRawResponse =
            EphemeralSessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EphemeralSessionCreateResponse> =
            jsonHandler<EphemeralSessionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EphemeralSessionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EphemeralSessionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "ephemeral-sessions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
