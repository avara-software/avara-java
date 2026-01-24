// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.checkRequired
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
import com.avara.models.express.ExpressCreateParams
import com.avara.models.express.ExpressCreateResponse
import com.avara.models.express.ExpressDeactivateParams
import com.avara.models.express.ExpressDeactivateResponse
import com.avara.models.express.ExpressListPageAsync
import com.avara.models.express.ExpressListPageResponse
import com.avara.models.express.ExpressListParams
import com.avara.models.express.ExpressReactivateParams
import com.avara.models.express.ExpressReactivateResponse
import com.avara.models.express.ExpressRetrieveParams
import com.avara.models.express.ExpressRetrieveResponse
import com.avara.models.express.ExpressUpdateParams
import com.avara.models.express.ExpressUpdateResponse
import com.avara.services.async.express.UserServiceAsync
import com.avara.services.async.express.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExpressServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExpressServiceAsync {

    private val withRawResponse: ExpressServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ExpressServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpressServiceAsync =
        ExpressServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserServiceAsync = users

    override fun create(
        params: ExpressCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressCreateResponse> =
        // post /v1/express
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExpressRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressRetrieveResponse> =
        // get /v1/express/{expressCustomerId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExpressUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressUpdateResponse> =
        // patch /v1/express/{expressCustomerId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExpressListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressListPageAsync> =
        // get /v1/express
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: ExpressDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressDeactivateResponse> =
        // post /v1/express/{expressCustomerId}/deactivate
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun reactivate(
        params: ExpressReactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressReactivateResponse> =
        // post /v1/express/{expressCustomerId}/reactivate
        withRawResponse().reactivate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExpressServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExpressServiceAsync.WithRawResponse =
            ExpressServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserServiceAsync.WithRawResponse = users

        private val createHandler: Handler<ExpressCreateResponse> =
            jsonHandler<ExpressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExpressCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express")
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

        private val retrieveHandler: Handler<ExpressRetrieveResponse> =
            jsonHandler<ExpressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExpressRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ExpressUpdateResponse> =
            jsonHandler<ExpressUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExpressUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ExpressListPageResponse> =
            jsonHandler<ExpressListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExpressListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ExpressListPageAsync.builder()
                                    .service(ExpressServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deactivateHandler: Handler<ExpressDeactivateResponse> =
            jsonHandler<ExpressDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: ExpressDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0), "deactivate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deactivateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reactivateHandler: Handler<ExpressReactivateResponse> =
            jsonHandler<ExpressReactivateResponse>(clientOptions.jsonMapper)

        override fun reactivate(
            params: ExpressReactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0), "reactivate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { reactivateHandler.handle(it) }
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
