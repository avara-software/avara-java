// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.handlers.errorBodyHandler
import com.avarasoftware.core.handlers.errorHandler
import com.avarasoftware.core.handlers.jsonHandler
import com.avarasoftware.core.http.HttpMethod
import com.avarasoftware.core.http.HttpRequest
import com.avarasoftware.core.http.HttpResponse
import com.avarasoftware.core.http.HttpResponse.Handler
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.core.http.json
import com.avarasoftware.core.http.parseable
import com.avarasoftware.core.prepare
import com.avarasoftware.models.autoscribe.ephemeralsessions.EphemeralSessionCreateParams
import com.avarasoftware.models.autoscribe.ephemeralsessions.EphemeralSessionCreateResponse
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
