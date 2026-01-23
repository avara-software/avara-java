// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer

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
import com.avara.models.viewer.users.UserInviteParams
import com.avara.models.viewer.users.UserInviteResponse
import com.avara.models.viewer.users.UserListPage
import com.avara.models.viewer.users.UserListPageResponse
import com.avara.models.viewer.users.UserListParams
import com.avara.models.viewer.users.UserReactivateParams
import com.avara.models.viewer.users.UserReactivateResponse
import com.avara.models.viewer.users.UserRetrieveParams
import com.avara.models.viewer.users.UserRetrieveResponse
import com.avara.models.viewer.users.UserRevokeAccessParams
import com.avara.models.viewer.users.UserRevokeAccessResponse
import com.avara.models.viewer.users.UserUpdateParams
import com.avara.models.viewer.users.UserUpdateResponse
import com.avara.services.blocking.viewer.users.InvitationService
import com.avara.services.blocking.viewer.users.InvitationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invitations: InvitationService by lazy { InvitationServiceImpl(clientOptions) }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invitations(): InvitationService = invitations

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): UserRetrieveResponse =
        // get /v1/viewer/users/{userId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): UserUpdateResponse =
        // patch /v1/viewer/users/{userId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: UserListParams, requestOptions: RequestOptions): UserListPage =
        // get /v1/viewer/users
        withRawResponse().list(params, requestOptions).parse()

    override fun invite(
        params: UserInviteParams,
        requestOptions: RequestOptions,
    ): UserInviteResponse =
        // post /v1/viewer/users
        withRawResponse().invite(params, requestOptions).parse()

    override fun reactivate(
        params: UserReactivateParams,
        requestOptions: RequestOptions,
    ): UserReactivateResponse =
        // post /v1/viewer/users/reactivate
        withRawResponse().reactivate(params, requestOptions).parse()

    override fun revokeAccess(
        params: UserRevokeAccessParams,
        requestOptions: RequestOptions,
    ): UserRevokeAccessResponse =
        // post /v1/viewer/users/revoke-access
        withRawResponse().revokeAccess(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val invitations: InvitationService.WithRawResponse by lazy {
            InvitationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invitations(): InvitationService.WithRawResponse = invitations

        private val retrieveHandler: Handler<UserRetrieveResponse> =
            jsonHandler<UserRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", params._pathParam(0))
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

        private val updateHandler: Handler<UserUpdateResponse> =
            jsonHandler<UserUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserUpdateResponse> {
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

        private val listHandler: Handler<UserListPageResponse> =
            jsonHandler<UserListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users")
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
                        UserListPage.builder()
                            .service(UserServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val inviteHandler: Handler<UserInviteResponse> =
            jsonHandler<UserInviteResponse>(clientOptions.jsonMapper)

        override fun invite(
            params: UserInviteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserInviteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { inviteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reactivateHandler: Handler<UserReactivateResponse> =
            jsonHandler<UserReactivateResponse>(clientOptions.jsonMapper)

        override fun reactivate(
            params: UserReactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserReactivateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "reactivate")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val revokeAccessHandler: Handler<UserRevokeAccessResponse> =
            jsonHandler<UserRevokeAccessResponse>(clientOptions.jsonMapper)

        override fun revokeAccess(
            params: UserRevokeAccessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRevokeAccessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "viewer", "users", "revoke-access")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
