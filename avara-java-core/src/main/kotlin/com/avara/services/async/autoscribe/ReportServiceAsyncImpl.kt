// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

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
import com.avara.models.autoscribe.reports.ReportAddendumParams
import com.avara.models.autoscribe.reports.ReportAddendumResponse
import com.avara.models.autoscribe.reports.ReportCancelAddendumParams
import com.avara.models.autoscribe.reports.ReportCancelAddendumResponse
import com.avara.models.autoscribe.reports.ReportListParams
import com.avara.models.autoscribe.reports.ReportListResponse
import com.avara.models.autoscribe.reports.ReportPdfParams
import com.avara.models.autoscribe.reports.ReportPdfResponse
import com.avara.models.autoscribe.reports.ReportTextParams
import com.avara.models.autoscribe.reports.ReportTextResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportServiceAsync {

    private val withRawResponse: ReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync =
        ReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ReportListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportListResponse> =
        // get /v1/autoScribe/reports
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun addendum(
        params: ReportAddendumParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportAddendumResponse> =
        // post /v1/autoScribe/reports/{reportId}/addendum
        withRawResponse().addendum(params, requestOptions).thenApply { it.parse() }

    override fun cancelAddendum(
        params: ReportCancelAddendumParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportCancelAddendumResponse> =
        // post /v1/autoScribe/reports/{reportId}/cancel-addendum
        withRawResponse().cancelAddendum(params, requestOptions).thenApply { it.parse() }

    override fun pdf(
        params: ReportPdfParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportPdfResponse> =
        // get /v1/autoScribe/reports/pdf
        withRawResponse().pdf(params, requestOptions).thenApply { it.parse() }

    override fun text(
        params: ReportTextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportTextResponse> =
        // get /v1/autoScribe/reports/text
        withRawResponse().text(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse =
            ReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ReportListResponse> =
            jsonHandler<ReportListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReportListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "reports")
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
                    }
                }
        }

        private val addendumHandler: Handler<ReportAddendumResponse> =
            jsonHandler<ReportAddendumResponse>(clientOptions.jsonMapper)

        override fun addendum(
            params: ReportAddendumParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportAddendumResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addendumHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelAddendumHandler: Handler<ReportCancelAddendumResponse> =
            jsonHandler<ReportCancelAddendumResponse>(clientOptions.jsonMapper)

        override fun cancelAddendum(
            params: ReportCancelAddendumParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelAddendumHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val pdfHandler: Handler<ReportPdfResponse> =
            jsonHandler<ReportPdfResponse>(clientOptions.jsonMapper)

        override fun pdf(
            params: ReportPdfParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportPdfResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "reports", "pdf")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { pdfHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val textHandler: Handler<ReportTextResponse> =
            jsonHandler<ReportTextResponse>(clientOptions.jsonMapper)

        override fun text(
            params: ReportTextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportTextResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "autoScribe", "reports", "text")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
