// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

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
import com.avara.core.prepare
import com.avara.models.autoscribe.studies.StudyCancelParams
import com.avara.models.autoscribe.studies.StudyCancelResponse
import com.avara.models.autoscribe.studies.StudyCreateParams
import com.avara.models.autoscribe.studies.StudyCreateResponse
import com.avara.models.autoscribe.studies.StudyListPage
import com.avara.models.autoscribe.studies.StudyListPageResponse
import com.avara.models.autoscribe.studies.StudyListParams
import com.avara.models.autoscribe.studies.StudyRerouteUrlParams
import com.avara.models.autoscribe.studies.StudyRerouteUrlResponse
import com.avara.models.autoscribe.studies.StudyRetrieveByUidParams
import com.avara.models.autoscribe.studies.StudyRetrieveByUidResponse
import com.avara.models.autoscribe.studies.StudyRetrieveParams
import com.avara.models.autoscribe.studies.StudyRetrieveResponse
import com.avara.models.autoscribe.studies.StudyUncancelParams
import com.avara.models.autoscribe.studies.StudyUncancelResponse
import com.avara.models.autoscribe.studies.StudyUpdateParams
import com.avara.models.autoscribe.studies.StudyUpdateResponse
import com.avara.models.autoscribe.studies.StudyViewerOnlyRerouteUrlParams
import com.avara.models.autoscribe.studies.StudyViewerOnlyRerouteUrlResponse
import com.avara.services.blocking.autoscribe.studies.ExternalService
import com.avara.services.blocking.autoscribe.studies.ExternalServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StudyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StudyService {

    private val withRawResponse: StudyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val external: ExternalService by lazy { ExternalServiceImpl(clientOptions) }

    override fun withRawResponse(): StudyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyService =
        StudyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun external(): ExternalService = external

    override fun create(
        params: StudyCreateParams,
        requestOptions: RequestOptions,
    ): StudyCreateResponse =
        // post /v1/autoScribe/studies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: StudyRetrieveParams,
        requestOptions: RequestOptions,
    ): StudyRetrieveResponse =
        // get /v1/autoScribe/studies/{studyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: StudyUpdateParams,
        requestOptions: RequestOptions,
    ): StudyUpdateResponse =
        // patch /v1/autoScribe/studies/{studyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: StudyListParams, requestOptions: RequestOptions): StudyListPage =
        // get /v1/autoScribe/studies
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: StudyCancelParams,
        requestOptions: RequestOptions,
    ): StudyCancelResponse =
        // post /v1/autoScribe/studies/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun rerouteUrl(
        params: StudyRerouteUrlParams,
        requestOptions: RequestOptions,
    ): StudyRerouteUrlResponse =
        // post /v1/autoScribe/studies/reroute-url
        withRawResponse().rerouteUrl(params, requestOptions).parse()

    override fun retrieveByUid(
        params: StudyRetrieveByUidParams,
        requestOptions: RequestOptions,
    ): StudyRetrieveByUidResponse =
        // get /v1/autoScribe/studies/by-uid/{studyInstanceUid}
        withRawResponse().retrieveByUid(params, requestOptions).parse()

    override fun uncancel(
        params: StudyUncancelParams,
        requestOptions: RequestOptions,
    ): StudyUncancelResponse =
        // post /v1/autoScribe/studies/uncancel
        withRawResponse().uncancel(params, requestOptions).parse()

    override fun viewerOnlyRerouteUrl(
        params: StudyViewerOnlyRerouteUrlParams,
        requestOptions: RequestOptions,
    ): StudyViewerOnlyRerouteUrlResponse =
        // post /v1/autoScribe/studies/viewer-only-reroute-url
        withRawResponse().viewerOnlyRerouteUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StudyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val external: ExternalService.WithRawResponse by lazy {
            ExternalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StudyService.WithRawResponse =
            StudyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun external(): ExternalService.WithRawResponse = external

        private val createHandler: Handler<StudyCreateResponse> =
            jsonHandler<StudyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: StudyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies")
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

        private val retrieveHandler: Handler<StudyRetrieveResponse> =
            jsonHandler<StudyRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StudyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("studyId", params.studyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<StudyUpdateResponse> =
            jsonHandler<StudyUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: StudyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<StudyListPageResponse> =
            jsonHandler<StudyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: StudyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        StudyListPage.builder()
                            .service(StudyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<StudyCancelResponse> =
            jsonHandler<StudyCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: StudyCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyCancelResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rerouteUrlHandler: Handler<StudyRerouteUrlResponse> =
            jsonHandler<StudyRerouteUrlResponse>(clientOptions.jsonMapper)

        override fun rerouteUrl(
            params: StudyRerouteUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyRerouteUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "reroute-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rerouteUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByUidHandler: Handler<StudyRetrieveByUidResponse> =
            jsonHandler<StudyRetrieveByUidResponse>(clientOptions.jsonMapper)

        override fun retrieveByUid(
            params: StudyRetrieveByUidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyRetrieveByUidResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("studyInstanceUid", params.studyInstanceUid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "by-uid", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByUidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uncancelHandler: Handler<StudyUncancelResponse> =
            jsonHandler<StudyUncancelResponse>(clientOptions.jsonMapper)

        override fun uncancel(
            params: StudyUncancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyUncancelResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "uncancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uncancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val viewerOnlyRerouteUrlHandler: Handler<StudyViewerOnlyRerouteUrlResponse> =
            jsonHandler<StudyViewerOnlyRerouteUrlResponse>(clientOptions.jsonMapper)

        override fun viewerOnlyRerouteUrl(
            params: StudyViewerOnlyRerouteUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyViewerOnlyRerouteUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "viewer-only-reroute-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
