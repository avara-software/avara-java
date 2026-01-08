// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async.viewer.users

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
import com.avara.api.core.prepareAsync
import com.avara.api.models.viewer.users.invitations.InvitationListPageAsync
import com.avara.api.models.viewer.users.invitations.InvitationListPageResponse
import com.avara.api.models.viewer.users.invitations.InvitationListParams
import com.avara.api.models.viewer.users.invitations.InvitationRetrieveParams
import com.avara.api.models.viewer.users.invitations.InvitationRetrieveResponse
import com.avara.api.models.viewer.users.invitations.InvitationRevokeParams
import com.avara.api.models.viewer.users.invitations.InvitationRevokeResponse
import com.avara.api.models.viewer.users.invitations.InvitationUpdateParams
import com.avara.api.models.viewer.users.invitations.InvitationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvitationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvitationServiceAsync {

    private val withRawResponse: InvitationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvitationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationServiceAsync =
        InvitationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InvitationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationRetrieveResponse> =
        // get /v1/viewer/users/invitations/{invitationId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InvitationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationUpdateResponse> =
        // patch /v1/viewer/users/invitations/{invitationId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InvitationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationListPageAsync> =
        // get /v1/viewer/users/invitations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun revoke(
        params: InvitationRevokeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationRevokeResponse> =
        // post /v1/viewer/users/invitations/revoke
        withRawResponse().revoke(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvitationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitationServiceAsync.WithRawResponse =
            InvitationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InvitationRetrieveResponse> =
            jsonHandler<InvitationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InvitationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invitationId", params.invitationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<InvitationUpdateResponse> =
            jsonHandler<InvitationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: InvitationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<InvitationListPageResponse> =
            jsonHandler<InvitationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvitationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations")
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
                            .let {
                                InvitationListPageAsync.builder()
                                    .service(InvitationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val revokeHandler: Handler<InvitationRevokeResponse> =
            jsonHandler<InvitationRevokeResponse>(clientOptions.jsonMapper)

        override fun revoke(
            params: InvitationRevokeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationRevokeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "invitations", "revoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
