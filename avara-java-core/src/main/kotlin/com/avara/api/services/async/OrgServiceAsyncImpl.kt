// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async

import com.avara.api.core.ClientOptions
import com.avara.api.core.RequestOptions
import com.avara.api.core.checkRequired
import com.avara.api.core.handlers.errorBodyHandler
import com.avara.api.core.handlers.errorHandler
import com.avara.api.core.handlers.jsonHandler
import com.avara.api.core.http.HttpMethod
import com.avara.api.core.http.HttpRequest
import com.avara.api.core.http.HttpResponse
import com.avara.api.core.http.HttpResponse.Handler
import com.avara.api.core.http.HttpResponseFor
import com.avara.api.core.http.json
import com.avara.api.core.http.parseable
import com.avara.api.core.prepareAsync
import com.avara.api.models.orgs.OrgCreateParams
import com.avara.api.models.orgs.OrgCreateResponse
import com.avara.api.models.orgs.OrgDeactivateParams
import com.avara.api.models.orgs.OrgDeactivateResponse
import com.avara.api.models.orgs.OrgListPageAsync
import com.avara.api.models.orgs.OrgListPageResponse
import com.avara.api.models.orgs.OrgListParams
import com.avara.api.models.orgs.OrgReactivateParams
import com.avara.api.models.orgs.OrgReactivateResponse
import com.avara.api.models.orgs.OrgRetrieveParams
import com.avara.api.models.orgs.OrgRetrieveResponse
import com.avara.api.models.orgs.OrgUpdateParams
import com.avara.api.models.orgs.OrgUpdateResponse
import com.avara.api.services.async.orgs.UserServiceAsync
import com.avara.api.services.async.orgs.UserServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrgServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrgServiceAsync {

    private val withRawResponse: OrgServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrgServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync =
        OrgServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserServiceAsync = users

    override fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgCreateResponse> =
        // post /v1/orgs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: OrgRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgRetrieveResponse> =
        // get /v1/orgs/{orgId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: OrgUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgUpdateResponse> =
        // patch /v1/orgs/{orgId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OrgListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgListPageAsync> =
        // get /v1/orgs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: OrgDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgDeactivateResponse> =
        // post /v1/orgs/{orgId}/deactivate
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun reactivate(
        params: OrgReactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgReactivateResponse> =
        // post /v1/orgs/{orgId}/reactivate
        withRawResponse().reactivate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgServiceAsync.WithRawResponse =
            OrgServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserServiceAsync.WithRawResponse = users

        private val createHandler: Handler<OrgCreateResponse> =
            jsonHandler<OrgCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs")
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

        private val retrieveHandler: Handler<OrgRetrieveResponse> =
            jsonHandler<OrgRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OrgRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0))
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

        private val updateHandler: Handler<OrgUpdateResponse> =
            jsonHandler<OrgUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OrgUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0))
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

        private val listHandler: Handler<OrgListPageResponse> =
            jsonHandler<OrgListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OrgListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs")
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
                                OrgListPageAsync.builder()
                                    .service(OrgServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deactivateHandler: Handler<OrgDeactivateResponse> =
            jsonHandler<OrgDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: OrgDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0), "deactivate")
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

        private val reactivateHandler: Handler<OrgReactivateResponse> =
            jsonHandler<OrgReactivateResponse>(clientOptions.jsonMapper)

        override fun reactivate(
            params: OrgReactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgReactivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0), "reactivate")
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
