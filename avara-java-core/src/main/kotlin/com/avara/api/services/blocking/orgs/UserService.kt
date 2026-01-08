// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.blocking.orgs

import com.avara.api.core.ClientOptions
import com.avara.api.core.RequestOptions
import com.avara.api.core.http.HttpResponseFor
import com.avara.api.models.orgs.users.UserAddParams
import com.avara.api.models.orgs.users.UserAddResponse
import com.avara.api.models.orgs.users.UserRemoveParams
import com.avara.api.models.orgs.users.UserRemoveResponse
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
     * Associates an existing user with an organization, granting them access to
     * organization-specific resources and studies.
     */
    fun add(orgId: String, params: UserAddParams): UserAddResponse =
        add(orgId, params, RequestOptions.none())

    /** @see add */
    fun add(
        orgId: String,
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddResponse = add(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see add */
    fun add(params: UserAddParams): UserAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: UserAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddResponse

    /**
     * Removes a user's association with an organization, revoking their access to
     * organization-specific resources. The user account remains active but is no longer linked to
     * this organization.
     */
    fun remove(orgId: String, params: UserRemoveParams): UserRemoveResponse =
        remove(orgId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        orgId: String,
        params: UserRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRemoveResponse = remove(params.toBuilder().orgId(orgId).build(), requestOptions)

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
         * Returns a raw HTTP response for `post /v1/orgs/{orgId}/users`, but is otherwise the same
         * as [UserService.add].
         */
        @MustBeClosed
        fun add(orgId: String, params: UserAddParams): HttpResponseFor<UserAddResponse> =
            add(orgId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            orgId: String,
            params: UserAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddResponse> =
            add(params.toBuilder().orgId(orgId).build(), requestOptions)

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
         * Returns a raw HTTP response for `delete /v1/orgs/{orgId}/users`, but is otherwise the
         * same as [UserService.remove].
         */
        @MustBeClosed
        fun remove(orgId: String, params: UserRemoveParams): HttpResponseFor<UserRemoveResponse> =
            remove(orgId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            orgId: String,
            params: UserRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRemoveResponse> =
            remove(params.toBuilder().orgId(orgId).build(), requestOptions)

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
