// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async.express

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
import com.avarasoftware.core.prepareAsync
import com.avarasoftware.models.express.users.UserAddParams
import com.avarasoftware.models.express.users.UserAddResponse
import com.avarasoftware.models.express.users.UserRemoveParams
import com.avarasoftware.models.express.users.UserRemoveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun add(
        params: UserAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserAddResponse> =
        // post /v1/express/{expressCustomerId}/users
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun remove(
        params: UserRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRemoveResponse> =
        // delete /v1/express/{expressCustomerId}/users
        withRawResponse().remove(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addHandler: Handler<UserAddResponse> =
            jsonHandler<UserAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: UserAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserAddResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0), "users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeHandler: Handler<UserRemoveResponse> =
            jsonHandler<UserRemoveResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: UserRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("expressCustomerId", params.expressCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "express", params._pathParam(0), "users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { removeHandler.handle(it) }
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
