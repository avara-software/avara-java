// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking

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
import com.avarasoftware.models.express.ExpressCreateParams
import com.avarasoftware.models.express.ExpressCreateResponse
import com.avarasoftware.models.express.ExpressDeactivateParams
import com.avarasoftware.models.express.ExpressDeactivateResponse
import com.avarasoftware.models.express.ExpressListPage
import com.avarasoftware.models.express.ExpressListPageResponse
import com.avarasoftware.models.express.ExpressListParams
import com.avarasoftware.models.express.ExpressReactivateParams
import com.avarasoftware.models.express.ExpressReactivateResponse
import com.avarasoftware.models.express.ExpressRetrieveParams
import com.avarasoftware.models.express.ExpressRetrieveResponse
import com.avarasoftware.models.express.ExpressUpdateParams
import com.avarasoftware.models.express.ExpressUpdateResponse
import com.avarasoftware.services.blocking.express.UserService
import com.avarasoftware.services.blocking.express.UserServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExpressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExpressService {

    private val withRawResponse: ExpressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): ExpressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpressService =
        ExpressServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserService = users

    override fun create(
        params: ExpressCreateParams,
        requestOptions: RequestOptions,
    ): ExpressCreateResponse =
        // post /v1/express
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExpressRetrieveParams,
        requestOptions: RequestOptions,
    ): ExpressRetrieveResponse =
        // get /v1/express/{expressCustomerId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExpressUpdateParams,
        requestOptions: RequestOptions,
    ): ExpressUpdateResponse =
        // patch /v1/express/{expressCustomerId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ExpressListParams, requestOptions: RequestOptions): ExpressListPage =
        // get /v1/express
        withRawResponse().list(params, requestOptions).parse()

    override fun deactivate(
        params: ExpressDeactivateParams,
        requestOptions: RequestOptions,
    ): ExpressDeactivateResponse =
        // post /v1/express/{expressCustomerId}/deactivate
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun reactivate(
        params: ExpressReactivateParams,
        requestOptions: RequestOptions,
    ): ExpressReactivateResponse =
        // post /v1/express/{expressCustomerId}/reactivate
        withRawResponse().reactivate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExpressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExpressService.WithRawResponse =
            ExpressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserService.WithRawResponse = users

        private val createHandler: Handler<ExpressCreateResponse> =
            jsonHandler<ExpressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExpressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express")
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

        private val retrieveHandler: Handler<ExpressRetrieveResponse> =
            jsonHandler<ExpressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExpressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0))
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

        private val updateHandler: Handler<ExpressUpdateResponse> =
            jsonHandler<ExpressUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExpressUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0))
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

        private val listHandler: Handler<ExpressListPageResponse> =
            jsonHandler<ExpressListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExpressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express")
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
                        ExpressListPage.builder()
                            .service(ExpressServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deactivateHandler: Handler<ExpressDeactivateResponse> =
            jsonHandler<ExpressDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: ExpressDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressDeactivateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0), "deactivate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deactivateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reactivateHandler: Handler<ExpressReactivateResponse> =
            jsonHandler<ExpressReactivateResponse>(clientOptions.jsonMapper)

        override fun reactivate(
            params: ExpressReactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressReactivateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0), "reactivate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
