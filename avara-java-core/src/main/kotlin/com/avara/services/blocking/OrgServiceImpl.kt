// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

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
import com.avara.models.orgs.OrgCreateParams
import com.avara.models.orgs.OrgCreateResponse
import com.avara.models.orgs.OrgDeactivateParams
import com.avara.models.orgs.OrgDeactivateResponse
import com.avara.models.orgs.OrgListPage
import com.avara.models.orgs.OrgListPageResponse
import com.avara.models.orgs.OrgListParams
import com.avara.models.orgs.OrgReactivateParams
import com.avara.models.orgs.OrgReactivateResponse
import com.avara.models.orgs.OrgRetrieveParams
import com.avara.models.orgs.OrgRetrieveResponse
import com.avara.models.orgs.OrgUpdateParams
import com.avara.models.orgs.OrgUpdateResponse
import com.avara.services.blocking.orgs.UserService
import com.avara.services.blocking.orgs.UserServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OrgServiceImpl internal constructor(private val clientOptions: ClientOptions) : OrgService {

    private val withRawResponse: OrgService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): OrgService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService =
        OrgServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserService = users

    override fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions,
    ): OrgCreateResponse =
        // post /v1/orgs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: OrgRetrieveParams,
        requestOptions: RequestOptions,
    ): OrgRetrieveResponse =
        // get /v1/orgs/{orgId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OrgUpdateParams,
        requestOptions: RequestOptions,
    ): OrgUpdateResponse =
        // patch /v1/orgs/{orgId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: OrgListParams, requestOptions: RequestOptions): OrgListPage =
        // get /v1/orgs
        withRawResponse().list(params, requestOptions).parse()

    override fun deactivate(
        params: OrgDeactivateParams,
        requestOptions: RequestOptions,
    ): OrgDeactivateResponse =
        // post /v1/orgs/{orgId}/deactivate
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun reactivate(
        params: OrgReactivateParams,
        requestOptions: RequestOptions,
    ): OrgReactivateResponse =
        // post /v1/orgs/{orgId}/reactivate
        withRawResponse().reactivate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgService.WithRawResponse =
            OrgServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserService.WithRawResponse = users

        private val createHandler: Handler<OrgCreateResponse> =
            jsonHandler<OrgCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs")
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

        private val retrieveHandler: Handler<OrgRetrieveResponse> =
            jsonHandler<OrgRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OrgRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0))
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

        private val updateHandler: Handler<OrgUpdateResponse> =
            jsonHandler<OrgUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OrgUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0))
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

        private val listHandler: Handler<OrgListPageResponse> =
            jsonHandler<OrgListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OrgListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs")
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
                        OrgListPage.builder()
                            .service(OrgServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deactivateHandler: Handler<OrgDeactivateResponse> =
            jsonHandler<OrgDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: OrgDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgDeactivateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0), "deactivate")
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

        private val reactivateHandler: Handler<OrgReactivateResponse> =
            jsonHandler<OrgReactivateResponse>(clientOptions.jsonMapper)

        override fun reactivate(
            params: OrgReactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgReactivateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orgId", params.orgId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "orgs", params._pathParam(0), "reactivate")
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
