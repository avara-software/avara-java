// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.viewer

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
import com.avara.models.viewer.studies.StudyCancelParams
import com.avara.models.viewer.studies.StudyCancelResponse
import com.avara.models.viewer.studies.StudyCreateParams
import com.avara.models.viewer.studies.StudyCreateResponse
import com.avara.models.viewer.studies.StudyListPageAsync
import com.avara.models.viewer.studies.StudyListPageResponse
import com.avara.models.viewer.studies.StudyListParams
import com.avara.models.viewer.studies.StudyRerouteUrlParams
import com.avara.models.viewer.studies.StudyRerouteUrlResponse
import com.avara.models.viewer.studies.StudyRetrieveByUidParams
import com.avara.models.viewer.studies.StudyRetrieveByUidResponse
import com.avara.models.viewer.studies.StudyRetrieveParams
import com.avara.models.viewer.studies.StudyRetrieveResponse
import com.avara.models.viewer.studies.StudyUncancelParams
import com.avara.models.viewer.studies.StudyUncancelResponse
import com.avara.models.viewer.studies.StudyUpdateParams
import com.avara.models.viewer.studies.StudyUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StudyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StudyServiceAsync {

    private val withRawResponse: StudyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StudyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyServiceAsync =
        StudyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: StudyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyCreateResponse> =
        // post /v1/viewer/studies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: StudyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRetrieveResponse> =
        // get /v1/viewer/studies/{studyId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: StudyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyUpdateResponse> =
        // patch /v1/viewer/studies/{studyId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: StudyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyListPageAsync> =
        // get /v1/viewer/studies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: StudyCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyCancelResponse> =
        // post /v1/viewer/studies/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun rerouteUrl(
        params: StudyRerouteUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRerouteUrlResponse> =
        // post /v1/viewer/studies/reroute-url
        withRawResponse().rerouteUrl(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByUid(
        params: StudyRetrieveByUidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRetrieveByUidResponse> =
        // get /v1/viewer/studies/by-uid/{studyInstanceUid}
        withRawResponse().retrieveByUid(params, requestOptions).thenApply { it.parse() }

    override fun uncancel(
        params: StudyUncancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyUncancelResponse> =
        // post /v1/viewer/studies/uncancel
        withRawResponse().uncancel(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StudyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StudyServiceAsync.WithRawResponse =
            StudyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<StudyCreateResponse> =
            jsonHandler<StudyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: StudyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies")
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

        private val retrieveHandler: Handler<StudyRetrieveResponse> =
            jsonHandler<StudyRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StudyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("studyId", params.studyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies", params._pathParam(0))
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

        private val updateHandler: Handler<StudyUpdateResponse> =
            jsonHandler<StudyUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: StudyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("studyId", params.studyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies", params._pathParam(0))
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

        private val listHandler: Handler<StudyListPageResponse> =
            jsonHandler<StudyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: StudyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies")
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
                                StudyListPageAsync.builder()
                                    .service(StudyServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cancelHandler: Handler<StudyCancelResponse> =
            jsonHandler<StudyCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: StudyCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyCancelResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies", "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rerouteUrlHandler: Handler<StudyRerouteUrlResponse> =
            jsonHandler<StudyRerouteUrlResponse>(clientOptions.jsonMapper)

        override fun rerouteUrl(
            params: StudyRerouteUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyRerouteUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies", "reroute-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rerouteUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByUidHandler: Handler<StudyRetrieveByUidResponse> =
            jsonHandler<StudyRetrieveByUidResponse>(clientOptions.jsonMapper)

        override fun retrieveByUid(
            params: StudyRetrieveByUidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("studyInstanceUid", params.studyInstanceUid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies", "by-uid", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByUidHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uncancelHandler: Handler<StudyUncancelResponse> =
            jsonHandler<StudyUncancelResponse>(clientOptions.jsonMapper)

        override fun uncancel(
            params: StudyUncancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyUncancelResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "studies", "uncancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uncancelHandler.handle(it) }
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
