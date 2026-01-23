// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe.users

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
import com.avara.models.autoscribe.users.invitations.InvitationListPageAsync
import com.avara.models.autoscribe.users.invitations.InvitationListPageResponse
import com.avara.models.autoscribe.users.invitations.InvitationListParams
import com.avara.models.autoscribe.users.invitations.InvitationRetrieveParams
import com.avara.models.autoscribe.users.invitations.InvitationRetrieveResponse
import com.avara.models.autoscribe.users.invitations.InvitationRevokeParams
import com.avara.models.autoscribe.users.invitations.InvitationRevokeResponse
import com.avara.models.autoscribe.users.invitations.InvitationUpdateParams
import com.avara.models.autoscribe.users.invitations.InvitationUpdateResponse
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
        // get /v1/autoScribe/users/invitations/{invitationId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InvitationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationUpdateResponse> =
        // patch /v1/autoScribe/users/invitations/{invitationId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InvitationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationListPageAsync> =
        // get /v1/autoScribe/users/invitations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun revoke(
        params: InvitationRevokeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationRevokeResponse> =
        // post /v1/autoScribe/users/invitations/revoke
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
                    .addPathSegments(
                        "v1",
                        "autoScribe",
                        "users",
                        "invitations",
                        params._pathParam(0),
                    )
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
                    .addPathSegments(
                        "v1",
                        "autoScribe",
                        "users",
                        "invitations",
                        params._pathParam(0),
                    )
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
                    .addPathSegments("v1", "autoScribe", "users", "invitations")
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
                    .addPathSegments("v1", "autoScribe", "users", "invitations", "revoke")
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
