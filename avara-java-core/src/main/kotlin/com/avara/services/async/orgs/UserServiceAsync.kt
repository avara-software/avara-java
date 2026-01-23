// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.orgs

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.orgs.users.UserAddParams
import com.avara.models.orgs.users.UserAddResponse
import com.avara.models.orgs.users.UserRemoveParams
import com.avara.models.orgs.users.UserRemoveResponse
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
     * Associates an existing user with an organization, granting them access to
     * organization-specific resources and studies.
     */
    fun add(orgId: String, params: UserAddParams): CompletableFuture<UserAddResponse> =
        add(orgId, params, RequestOptions.none())

    /** @see add */
    fun add(
        orgId: String,
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddResponse> =
        add(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see add */
    fun add(params: UserAddParams): CompletableFuture<UserAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddResponse>

    /**
     * Removes a user's association with an organization, revoking their access to
     * organization-specific resources. The user account remains active but is no longer linked to
     * this organization.
     */
    fun remove(orgId: String, params: UserRemoveParams): CompletableFuture<UserRemoveResponse> =
        remove(orgId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        orgId: String,
        params: UserRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRemoveResponse> =
        remove(params.toBuilder().orgId(orgId).build(), requestOptions)

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
         * Returns a raw HTTP response for `post /v1/orgs/{orgId}/users`, but is otherwise the same
         * as [UserServiceAsync.add].
         */
        fun add(
            orgId: String,
            params: UserAddParams,
        ): CompletableFuture<HttpResponseFor<UserAddResponse>> =
            add(orgId, params, RequestOptions.none())

        /** @see add */
        fun add(
            orgId: String,
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddResponse>> =
            add(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see add */
        fun add(params: UserAddParams): CompletableFuture<HttpResponseFor<UserAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/orgs/{orgId}/users`, but is otherwise the
         * same as [UserServiceAsync.remove].
         */
        fun remove(
            orgId: String,
            params: UserRemoveParams,
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>> =
            remove(orgId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            orgId: String,
            params: UserRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRemoveResponse>> =
            remove(params.toBuilder().orgId(orgId).build(), requestOptions)

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
