// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe.studies

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
import com.avara.models.autoscribe.studies.external.ExternalCreateParams
import com.avara.models.autoscribe.studies.external.ExternalCreateResponse
import com.avara.models.autoscribe.studies.external.ExternalDeleteParams
import com.avara.models.autoscribe.studies.external.ExternalDeleteResponse
import com.avara.services.async.autoscribe.studies.external.ReportServiceAsync
import com.avara.services.async.autoscribe.studies.external.ReportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ExternalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalServiceAsync {

    private val withRawResponse: ExternalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reports: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ExternalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalServiceAsync =
        ExternalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun reports(): ReportServiceAsync = reports

    override fun create(
        params: ExternalCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalCreateResponse> =
        // post /v1/autoScribe/studies/external
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExternalDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalDeleteResponse> =
        // post /v1/autoScribe/studies/external/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val reports: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalServiceAsync.WithRawResponse =
            ExternalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun reports(): ReportServiceAsync.WithRawResponse = reports

        private val createHandler: Handler<ExternalCreateResponse> =
            jsonHandler<ExternalCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "external")
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

        private val deleteHandler: Handler<ExternalDeleteResponse> =
            jsonHandler<ExternalDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExternalDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "external", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
