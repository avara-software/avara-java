// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer.users

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
import com.avara.models.viewer.users.invitations.InvitationListPage
import com.avara.models.viewer.users.invitations.InvitationListPageResponse
import com.avara.models.viewer.users.invitations.InvitationListParams
import com.avara.models.viewer.users.invitations.InvitationRetrieveParams
import com.avara.models.viewer.users.invitations.InvitationRetrieveResponse
import com.avara.models.viewer.users.invitations.InvitationRevokeParams
import com.avara.models.viewer.users.invitations.InvitationRevokeResponse
import com.avara.models.viewer.users.invitations.InvitationUpdateParams
import com.avara.models.viewer.users.invitations.InvitationUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvitationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvitationService {

    private val withRawResponse: InvitationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvitationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationService =
        InvitationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InvitationRetrieveParams,
        requestOptions: RequestOptions,
    ): InvitationRetrieveResponse =
        // get /v1/viewer/users/invitations/{invitationId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InvitationUpdateParams,
        requestOptions: RequestOptions,
    ): InvitationUpdateResponse =
        // patch /v1/viewer/users/invitations/{invitationId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: InvitationListParams,
        requestOptions: RequestOptions,
    ): InvitationListPage =
        // get /v1/viewer/users/invitations
        withRawResponse().list(params, requestOptions).parse()

    override fun revoke(
        params: InvitationRevokeParams,
        requestOptions: RequestOptions,
    ): InvitationRevokeResponse =
        // post /v1/viewer/users/invitations/revoke
        withRawResponse().revoke(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvitationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitationService.WithRawResponse =
            InvitationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InvitationRetrieveResponse> =
            jsonHandler<InvitationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InvitationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invitationId", params.invitationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations", params._pathParam(0))
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

        private val updateHandler: Handler<InvitationUpdateResponse> =
            jsonHandler<InvitationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: InvitationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invitationId", params.invitationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations", params._pathParam(0))
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

        private val listHandler: Handler<InvitationListPageResponse> =
            jsonHandler<InvitationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvitationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations")
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
                        InvitationListPage.builder()
                            .service(InvitationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val revokeHandler: Handler<InvitationRevokeResponse> =
            jsonHandler<InvitationRevokeResponse>(clientOptions.jsonMapper)

        override fun revoke(
            params: InvitationRevokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationRevokeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations", "revoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { revokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
