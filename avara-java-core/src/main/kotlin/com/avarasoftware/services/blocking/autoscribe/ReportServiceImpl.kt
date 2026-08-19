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
import com.avarasoftware.models.autoscribe.reports.ReportAddendumParams
import com.avarasoftware.models.autoscribe.reports.ReportAddendumResponse
import com.avarasoftware.models.autoscribe.reports.ReportCancelAddendumParams
import com.avarasoftware.models.autoscribe.reports.ReportCancelAddendumResponse
import com.avarasoftware.models.autoscribe.reports.ReportListParams
import com.avarasoftware.models.autoscribe.reports.ReportListResponse
import com.avarasoftware.models.autoscribe.reports.ReportPdfParams
import com.avarasoftware.models.autoscribe.reports.ReportPdfResponse
import com.avarasoftware.models.autoscribe.reports.ReportTextParams
import com.avarasoftware.models.autoscribe.reports.ReportTextResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val withRawResponse: ReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService =
        ReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ReportListParams,
        requestOptions: RequestOptions,
    ): ReportListResponse =
        // get /v1/autoScribe/reports
        withRawResponse().list(params, requestOptions).parse()

    override fun addendum(
        params: ReportAddendumParams,
        requestOptions: RequestOptions,
    ): ReportAddendumResponse =
        // post /v1/autoScribe/reports/{reportId}/addendum
        withRawResponse().addendum(params, requestOptions).parse()

    override fun cancelAddendum(
        params: ReportCancelAddendumParams,
        requestOptions: RequestOptions,
    ): ReportCancelAddendumResponse =
        // post /v1/autoScribe/reports/{reportId}/cancel-addendum
        withRawResponse().cancelAddendum(params, requestOptions).parse()

    override fun pdf(params: ReportPdfParams, requestOptions: RequestOptions): ReportPdfResponse =
        // get /v1/autoScribe/reports/pdf
        withRawResponse().pdf(params, requestOptions).parse()

    override fun text(
        params: ReportTextParams,
        requestOptions: RequestOptions,
    ): ReportTextResponse =
        // get /v1/autoScribe/reports/text
        withRawResponse().text(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportService.WithRawResponse =
            ReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ReportListResponse> =
            jsonHandler<ReportListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "reports")
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
            }
        }

        private val addendumHandler: Handler<ReportAddendumResponse> =
            jsonHandler<ReportAddendumResponse>(clientOptions.jsonMapper)

        override fun addendum(
            params: ReportAddendumParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportAddendumResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "autoScribe",
                        "reports",
                        params._pathParam(0),
                        "addendum",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addendumHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelAddendumHandler: Handler<ReportCancelAddendumResponse> =
            jsonHandler<ReportCancelAddendumResponse>(clientOptions.jsonMapper)

        override fun cancelAddendum(
            params: ReportCancelAddendumParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCancelAddendumResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "autoScribe",
                        "reports",
                        params._pathParam(0),
                        "cancel-addendum",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelAddendumHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val pdfHandler: Handler<ReportPdfResponse> =
            jsonHandler<ReportPdfResponse>(clientOptions.jsonMapper)

        override fun pdf(
            params: ReportPdfParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportPdfResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "reports", "pdf")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { pdfHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val textHandler: Handler<ReportTextResponse> =
            jsonHandler<ReportTextResponse>(clientOptions.jsonMapper)

        override fun text(
            params: ReportTextParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportTextResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "reports", "text")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { textHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
