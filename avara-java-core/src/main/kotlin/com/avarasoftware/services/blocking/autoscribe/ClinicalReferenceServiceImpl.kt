// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.checkRequired
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
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReference
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceCreateParams
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceDeleteParams
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceListPage
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceListPageResponse
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceListParams
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceRetrieveByExternalReferenceIdParams
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceRetrieveParams
import com.avarasoftware.models.autoscribe.clinicalreferences.ClinicalReferenceUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ClinicalReferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClinicalReferenceService {

    private val withRawResponse: ClinicalReferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClinicalReferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClinicalReferenceService =
        ClinicalReferenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ClinicalReferenceCreateParams,
        requestOptions: RequestOptions,
    ): ClinicalReference =
        // post /v1/autoScribe/clinicalReferences
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ClinicalReferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): ClinicalReference =
        // get /v1/autoScribe/clinicalReferences/{clinicalReferenceId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ClinicalReferenceUpdateParams,
        requestOptions: RequestOptions,
    ): ClinicalReference =
        // patch /v1/autoScribe/clinicalReferences/{clinicalReferenceId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ClinicalReferenceListParams,
        requestOptions: RequestOptions,
    ): ClinicalReferenceListPage =
        // get /v1/autoScribe/clinicalReferences
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ClinicalReferenceDeleteParams,
        requestOptions: RequestOptions,
    ): ClinicalReference =
        // post /v1/autoScribe/clinicalReferences/{clinicalReferenceId}/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveByExternalReferenceId(
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams,
        requestOptions: RequestOptions,
    ): ClinicalReference =
        // get /v1/autoScribe/clinicalReferences/byExternalReferenceId/{externalReferenceId}
        withRawResponse().retrieveByExternalReferenceId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClinicalReferenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClinicalReferenceService.WithRawResponse =
            ClinicalReferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ClinicalReference> =
            jsonHandler<ClinicalReference>(clientOptions.jsonMapper)

        override fun create(
            params: ClinicalReferenceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "clinicalReferences")
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

        private val retrieveHandler: Handler<ClinicalReference> =
            jsonHandler<ClinicalReference>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ClinicalReferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("clinicalReferenceId", params.clinicalReferenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "clinicalReferences", params._pathParam(0))
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

        private val updateHandler: Handler<ClinicalReference> =
            jsonHandler<ClinicalReference>(clientOptions.jsonMapper)

        override fun update(
            params: ClinicalReferenceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("clinicalReferenceId", params.clinicalReferenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "clinicalReferences", params._pathParam(0))
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

        private val listHandler: Handler<ClinicalReferenceListPageResponse> =
            jsonHandler<ClinicalReferenceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ClinicalReferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReferenceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "clinicalReferences")
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
                        ClinicalReferenceListPage.builder()
                            .service(ClinicalReferenceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ClinicalReference> =
            jsonHandler<ClinicalReference>(clientOptions.jsonMapper)

        override fun delete(
            params: ClinicalReferenceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("clinicalReferenceId", params.clinicalReferenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "autoScribe",
                        "clinicalReferences",
                        params._pathParam(0),
                        "delete",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByExternalReferenceIdHandler: Handler<ClinicalReference> =
            jsonHandler<ClinicalReference>(clientOptions.jsonMapper)

        override fun retrieveByExternalReferenceId(
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalReferenceId", params.externalReferenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "autoScribe",
                        "clinicalReferences",
                        "byExternalReferenceId",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByExternalReferenceIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
