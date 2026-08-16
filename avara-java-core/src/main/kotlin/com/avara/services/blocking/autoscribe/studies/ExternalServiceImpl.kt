// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe.studies

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
import com.avara.core.prepare
import com.avara.models.autoscribe.studies.external.ExternalCreateParams
import com.avara.models.autoscribe.studies.external.ExternalCreateResponse
import com.avara.models.autoscribe.studies.external.ExternalDeleteParams
import com.avara.models.autoscribe.studies.external.ExternalDeleteResponse
import com.avara.services.blocking.autoscribe.studies.external.ReportService
import com.avara.services.blocking.autoscribe.studies.external.ReportServiceImpl
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
