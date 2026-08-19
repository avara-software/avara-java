// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async.express

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.express.users.UserAddParams
import com.avarasoftware.models.express.users.UserAddResponse
import com.avarasoftware.models.express.users.UserRemoveParams
import com.avarasoftware.models.express.users.UserRemoveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /**
     * Associates an existing user with a customer, granting them access to customer-specific
     * resources and studies.
     */
    fun add(expressCustomerId: String, params: UserAddParams): CompletableFuture<UserAddResponse> =
        add(expressCustomerId, params, RequestOptions.none())

    /** @see add */
    fun add(
        expressCustomerId: String,
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddResponse> =
        add(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see add */
    fun add(params: UserAddParams): CompletableFuture<UserAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddResponse>

    /**
     * Removes a user's association with a customer, revoking their access to customer-specific
     * resources. The user account remains active but is no longer linked to this customer.
     */
    fun remove(
        expressCustomerId: String,
        params: UserRemoveParams,
    ): CompletableFuture<UserRemoveResponse> =
        remove(expressCustomerId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        expressCustomerId: String,
        params: UserRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRemoveResponse> =
        remove(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see remove */
    fun remove(params: UserRemoveParams): CompletableFuture<UserRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: UserRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRemoveResponse>

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/express/{expressCustomerId}/users`, but is
         * otherwise the same as [UserServiceAsync.add].
         */
        fun add(
            expressCustomerId: String,
            params: UserAddParams,
        ): CompletableFuture<HttpResponseFor<UserAddResponse>> =
            add(expressCustomerId, params, RequestOptions.none())

        /** @see add */
        fun add(
            expressCustomerId: String,
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddResponse>> =
            add(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

        /** @see add */
        fun add(params: UserAddParams): CompletableFuture<HttpResponseFor<UserAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/express/{expressCustomerId}/users`, but is
         * otherwise the same as [UserServiceAsync.remove].
         */
        fun remove(
            expressCustomerId: String,
            params: UserRemoveParams,
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>> =
            remove(expressCustomerId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            expressCustomerId: String,
            params: UserRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>> =
            remove(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

        /** @see remove */
        fun remove(
            params: UserRemoveParams
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: UserRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>>
    }
}
