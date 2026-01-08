// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async.viewer

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
import com.avara.api.models.viewer.users.UserInviteParams
import com.avara.api.models.viewer.users.UserInviteResponse
import com.avara.api.models.viewer.users.UserListPageAsync
import com.avara.api.models.viewer.users.UserListPageResponse
import com.avara.api.models.viewer.users.UserListParams
import com.avara.api.models.viewer.users.UserReactivateParams
import com.avara.api.models.viewer.users.UserReactivateResponse
import com.avara.api.models.viewer.users.UserRetrieveParams
import com.avara.api.models.viewer.users.UserRetrieveResponse
import com.avara.api.models.viewer.users.UserRevokeAccessParams
import com.avara.api.models.viewer.users.UserRevokeAccessResponse
import com.avara.api.models.viewer.users.UserUpdateParams
import com.avara.api.models.viewer.users.UserUpdateResponse
import com.avara.api.services.async.viewer.users.InvitationServiceAsync
import com.avara.api.services.async.viewer.users.InvitationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invitations: InvitationServiceAsync by lazy {
        InvitationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invitations(): InvitationServiceAsync = invitations

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRetrieveResponse> =
        // get /v1/viewer/users/{userId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserUpdateResponse> =
        // patch /v1/viewer/users/{userId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UserListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserListPageAsync> =
        // get /v1/viewer/users
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun invite(
        params: UserInviteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserInviteResponse> =
        // post /v1/viewer/users
        withRawResponse().invite(params, requestOptions).thenApply { it.parse() }

    override fun reactivate(
        params: UserReactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserReactivateResponse> =
        // post /v1/viewer/users/reactivate
        withRawResponse().reactivate(params, requestOptions).thenApply { it.parse() }

    override fun revokeAccess(
        params: UserRevokeAccessParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRevokeAccessResponse> =
        // post /v1/viewer/users/revoke-access
        withRawResponse().revokeAccess(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val invitations: InvitationServiceAsync.WithRawResponse by lazy {
            InvitationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invitations(): InvitationServiceAsync.WithRawResponse = invitations

        private val retrieveHandler: Handler<UserRetrieveResponse> =
            jsonHandler<UserRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", params._pathParam(0))
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

        private val updateHandler: Handler<UserUpdateResponse> =
            jsonHandler<UserUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", params._pathParam(0))
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

        private val listHandler: Handler<UserListPageResponse> =
            jsonHandler<UserListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users")
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
                                UserListPageAsync.builder()
                                    .service(UserServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val inviteHandler: Handler<UserInviteResponse> =
            jsonHandler<UserInviteResponse>(clientOptions.jsonMapper)

        override fun invite(
            params: UserInviteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserInviteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { inviteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reactivateHandler: Handler<UserReactivateResponse> =
            jsonHandler<UserReactivateResponse>(clientOptions.jsonMapper)

        override fun reactivate(
            params: UserReactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserReactivateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "reactivate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val revokeAccessHandler: Handler<UserRevokeAccessResponse> =
            jsonHandler<UserRevokeAccessResponse>(clientOptions.jsonMapper)

        override fun revokeAccess(
            params: UserRevokeAccessParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRevokeAccessResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "revoke-access")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { revokeAccessHandler.handle(it) }
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
