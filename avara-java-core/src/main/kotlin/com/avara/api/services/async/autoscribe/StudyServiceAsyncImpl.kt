// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async.autoscribe

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
import com.avara.api.models.autoscribe.studies.StudyCancelParams
import com.avara.api.models.autoscribe.studies.StudyCancelResponse
import com.avara.api.models.autoscribe.studies.StudyCreateParams
import com.avara.api.models.autoscribe.studies.StudyCreateResponse
import com.avara.api.models.autoscribe.studies.StudyListPageAsync
import com.avara.api.models.autoscribe.studies.StudyListPageResponse
import com.avara.api.models.autoscribe.studies.StudyListParams
import com.avara.api.models.autoscribe.studies.StudyRerouteUrlParams
import com.avara.api.models.autoscribe.studies.StudyRerouteUrlResponse
import com.avara.api.models.autoscribe.studies.StudyRetrieveByUidParams
import com.avara.api.models.autoscribe.studies.StudyRetrieveByUidResponse
import com.avara.api.models.autoscribe.studies.StudyRetrieveParams
import com.avara.api.models.autoscribe.studies.StudyRetrieveResponse
import com.avara.api.models.autoscribe.studies.StudyUncancelParams
import com.avara.api.models.autoscribe.studies.StudyUncancelResponse
import com.avara.api.models.autoscribe.studies.StudyUpdateParams
import com.avara.api.models.autoscribe.studies.StudyUpdateResponse
import com.avara.api.models.autoscribe.studies.StudyViewerOnlyRerouteUrlParams
import com.avara.api.models.autoscribe.studies.StudyViewerOnlyRerouteUrlResponse
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
        // post /v1/autoScribe/studies
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: StudyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRetrieveResponse> =
        // get /v1/autoScribe/studies/{studyId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: StudyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyUpdateResponse> =
        // patch /v1/autoScribe/studies/{studyId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: StudyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyListPageAsync> =
        // get /v1/autoScribe/studies
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: StudyCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyCancelResponse> =
        // post /v1/autoScribe/studies/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun rerouteUrl(
        params: StudyRerouteUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRerouteUrlResponse> =
        // post /v1/autoScribe/studies/reroute-url
        withRawResponse().rerouteUrl(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByUid(
        params: StudyRetrieveByUidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRetrieveByUidResponse> =
        // get /v1/autoScribe/studies/by-uid/{studyInstanceUid}
        withRawResponse().retrieveByUid(params, requestOptions).thenApply { it.parse() }

    override fun uncancel(
        params: StudyUncancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyUncancelResponse> =
        // post /v1/autoScribe/studies/uncancel
        withRawResponse().uncancel(params, requestOptions).thenApply { it.parse() }

    override fun viewerOnlyRerouteUrl(
        params: StudyViewerOnlyRerouteUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyViewerOnlyRerouteUrlResponse> =
        // post /v1/autoScribe/studies/viewer-only-reroute-url
        withRawResponse().viewerOnlyRerouteUrl(params, requestOptions).thenApply { it.parse() }

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
                    .addPathSegments("v1", "autoScribe", "studies")
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
                    .addPathSegments("v1", "autoScribe", "studies", params._pathParam(0))
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
                    .addPathSegments("v1", "autoScribe", "studies", params._pathParam(0))
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
                    .addPathSegments("v1", "autoScribe", "studies")
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
                    .addPathSegments("v1", "autoScribe", "studies", "cancel")
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
                    .addPathSegments("v1", "autoScribe", "studies", "reroute-url")
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
                    .addPathSegments("v1", "autoScribe", "studies", "by-uid", params._pathParam(0))
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
                    .addPathSegments("v1", "autoScribe", "studies", "uncancel")
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

        private val viewerOnlyRerouteUrlHandler: Handler<StudyViewerOnlyRerouteUrlResponse> =
            jsonHandler<StudyViewerOnlyRerouteUrlResponse>(clientOptions.jsonMapper)

        override fun viewerOnlyRerouteUrl(
            params: StudyViewerOnlyRerouteUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyViewerOnlyRerouteUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "viewer-only-reroute-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { viewerOnlyRerouteUrlHandler.handle(it) }
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
