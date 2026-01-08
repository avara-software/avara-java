// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.blocking.viewer

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
import com.avara.api.core.prepare
import com.avara.api.models.viewer.studies.StudyCancelParams
import com.avara.api.models.viewer.studies.StudyCancelResponse
import com.avara.api.models.viewer.studies.StudyCreateParams
import com.avara.api.models.viewer.studies.StudyCreateResponse
import com.avara.api.models.viewer.studies.StudyListPage
import com.avara.api.models.viewer.studies.StudyListPageResponse
import com.avara.api.models.viewer.studies.StudyListParams
import com.avara.api.models.viewer.studies.StudyRerouteUrlParams
import com.avara.api.models.viewer.studies.StudyRerouteUrlResponse
import com.avara.api.models.viewer.studies.StudyRetrieveByUidParams
import com.avara.api.models.viewer.studies.StudyRetrieveByUidResponse
import com.avara.api.models.viewer.studies.StudyRetrieveParams
import com.avara.api.models.viewer.studies.StudyRetrieveResponse
import com.avara.api.models.viewer.studies.StudyUncancelParams
import com.avara.api.models.viewer.studies.StudyUncancelResponse
import com.avara.api.models.viewer.studies.StudyUpdateParams
import com.avara.api.models.viewer.studies.StudyUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StudyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StudyService {

    private val withRawResponse: StudyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StudyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyService =
        StudyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: StudyCreateParams,
        requestOptions: RequestOptions,
    ): StudyCreateResponse =
        // post /v1/viewer/studies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: StudyRetrieveParams,
        requestOptions: RequestOptions,
    ): StudyRetrieveResponse =
        // get /v1/viewer/studies/{studyId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: StudyUpdateParams,
        requestOptions: RequestOptions,
    ): StudyUpdateResponse =
        // patch /v1/viewer/studies/{studyId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: StudyListParams, requestOptions: RequestOptions): StudyListPage =
        // get /v1/viewer/studies
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: StudyCancelParams,
        requestOptions: RequestOptions,
    ): StudyCancelResponse =
        // post /v1/viewer/studies/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun rerouteUrl(
        params: StudyRerouteUrlParams,
        requestOptions: RequestOptions,
    ): StudyRerouteUrlResponse =
        // post /v1/viewer/studies/reroute-url
        withRawResponse().rerouteUrl(params, requestOptions).parse()

    override fun retrieveByUid(
        params: StudyRetrieveByUidParams,
        requestOptions: RequestOptions,
    ): StudyRetrieveByUidResponse =
        // get /v1/viewer/studies/by-uid/{studyInstanceUid}
        withRawResponse().retrieveByUid(params, requestOptions).parse()

    override fun uncancel(
        params: StudyUncancelParams,
        requestOptions: RequestOptions,
    ): StudyUncancelResponse =
        // post /v1/viewer/studies/uncancel
        withRawResponse().uncancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StudyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StudyService.WithRawResponse =
            StudyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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
                    .addPathSegments("v1", "viewer", "studies")
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
                    .addPathSegments("v1", "viewer", "studies", params._pathParam(0))
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
                    .addPathSegments("v1", "viewer", "studies", params._pathParam(0))
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
                    .addPathSegments("v1", "viewer", "studies")
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
                    .addPathSegments("v1", "viewer", "studies", "cancel")
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
                    .addPathSegments("v1", "viewer", "studies", "reroute-url")
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
                    .addPathSegments("v1", "viewer", "studies", "by-uid", params._pathParam(0))
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
                    .addPathSegments("v1", "viewer", "studies", "uncancel")
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
    }
}
