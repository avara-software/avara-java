// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe.studies

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
import com.avarasoftware.models.autoscribe.studies.external.ExternalCreateParams
import com.avarasoftware.models.autoscribe.studies.external.ExternalCreateResponse
import com.avarasoftware.models.autoscribe.studies.external.ExternalDeleteParams
import com.avarasoftware.models.autoscribe.studies.external.ExternalDeleteResponse
import com.avarasoftware.services.blocking.autoscribe.studies.external.ReportService
import com.avarasoftware.services.blocking.autoscribe.studies.external.ReportServiceImpl
import java.util.function.Consumer

class ExternalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalService {

    private val withRawResponse: ExternalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): ExternalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalService =
        ExternalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun reports(): ReportService = reports

    override fun create(
        params: ExternalCreateParams,
        requestOptions: RequestOptions,
    ): ExternalCreateResponse =
        // post /v1/autoScribe/studies/external
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: ExternalDeleteParams,
        requestOptions: RequestOptions,
    ): ExternalDeleteResponse =
        // post /v1/autoScribe/studies/external/delete
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalService.WithRawResponse =
            ExternalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun reports(): ReportService.WithRawResponse = reports

        private val createHandler: Handler<ExternalCreateResponse> =
            jsonHandler<ExternalCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "external")
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

        private val deleteHandler: Handler<ExternalDeleteResponse> =
            jsonHandler<ExternalDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExternalDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "studies", "external", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
    }
}
