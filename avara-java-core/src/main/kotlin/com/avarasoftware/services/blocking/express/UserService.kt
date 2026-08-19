// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.express

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.express.users.UserAddParams
import com.avarasoftware.models.express.users.UserAddResponse
import com.avarasoftware.models.express.users.UserRemoveParams
import com.avarasoftware.models.express.users.UserRemoveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /**
     * Associates an existing user with a customer, granting them access to customer-specific
     * resources and studies.
     */
    fun add(expressCustomerId: String, params: UserAddParams): UserAddResponse =
        add(expressCustomerId, params, RequestOptions.none())

    /** @see add */
    fun add(
        expressCustomerId: String,
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddResponse =
        add(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see add */
    fun add(params: UserAddParams): UserAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddResponse

    /**
     * Removes a user's association with a customer, revoking their access to customer-specific
     * resources. The user account remains active but is no longer linked to this customer.
     */
    fun remove(expressCustomerId: String, params: UserRemoveParams): UserRemoveResponse =
        remove(expressCustomerId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        expressCustomerId: String,
        params: UserRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRemoveResponse =
        remove(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see remove */
    fun remove(params: UserRemoveParams): UserRemoveResponse = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: UserRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRemoveResponse

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/express/{expressCustomerId}/users`, but is
         * otherwise the same as [UserService.add].
         */
        @MustBeClosed
        fun add(
            expressCustomerId: String,
            params: UserAddParams,
        ): HttpResponseFor<UserAddResponse> = add(expressCustomerId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            expressCustomerId: String,
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddResponse> =
            add(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: UserAddParams): HttpResponseFor<UserAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/express/{expressCustomerId}/users`, but is
         * otherwise the same as [UserService.remove].
         */
        @MustBeClosed
        fun remove(
            expressCustomerId: String,
            params: UserRemoveParams,
        ): HttpResponseFor<UserRemoveResponse> =
            remove(expressCustomerId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            expressCustomerId: String,
            params: UserRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRemoveResponse> =
            remove(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: UserRemoveParams): HttpResponseFor<UserRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: UserRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRemoveResponse>
    }
}
