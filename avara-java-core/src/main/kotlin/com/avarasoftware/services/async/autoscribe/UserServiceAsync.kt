// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async.autoscribe

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.autoscribe.users.UserInviteParams
import com.avarasoftware.models.autoscribe.users.UserInviteResponse
import com.avarasoftware.models.autoscribe.users.UserListPageAsync
import com.avarasoftware.models.autoscribe.users.UserListParams
import com.avarasoftware.models.autoscribe.users.UserReactivateParams
import com.avarasoftware.models.autoscribe.users.UserReactivateResponse
import com.avarasoftware.models.autoscribe.users.UserRetrieveParams
import com.avarasoftware.models.autoscribe.users.UserRetrieveResponse
import com.avarasoftware.models.autoscribe.users.UserRevokeAccessParams
import com.avarasoftware.models.autoscribe.users.UserRevokeAccessResponse
import com.avarasoftware.models.autoscribe.users.UserUpdateParams
import com.avarasoftware.models.autoscribe.users.UserUpdateResponse
import com.avarasoftware.services.async.autoscribe.users.InvitationServiceAsync
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

    fun invitations(): InvitationServiceAsync

    /**
     * Retrieves a single user by their unique user ID. Returns the complete user object with all
     * profile information, permissions, AutoScribe-specific settings, and status.
     */
    fun retrieve(userId: String): CompletableFuture<UserRetrieveResponse> =
        retrieve(userId, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveResponse> =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): CompletableFuture<UserRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): CompletableFuture<UserRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRetrieveResponse> =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /**
     * Updates a user's profile information, permissions, and AutoScribe-specific settings. All
     * fields are optional - only provided fields will be updated. Email cannot be changed via API.
     * NPI number is required if enabling report creation capability.
     */
    fun update(userId: String): CompletableFuture<UserUpdateResponse> =
        update(userId, UserUpdateParams.none())

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserUpdateResponse> =
        update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
    ): CompletableFuture<UserUpdateResponse> = update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserUpdateResponse>

    /** @see update */
    fun update(params: UserUpdateParams): CompletableFuture<UserUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserUpdateResponse> =
        update(userId, UserUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of users with optional filtering by access level, email, name,
     * invitation source, and report creation capability. Returns up to 100 users per request.
     */
    fun list(): CompletableFuture<UserListPageAsync> = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserListPageAsync>

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): CompletableFuture<UserListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserListPageAsync> =
        list(UserListParams.none(), requestOptions)

    /**
     * Creates a new user in the AutoScribe system and sends them an invitation email. The user will
     * have the specified permissions including report creation and study management capabilities.
     * NPI number is required for users who can create reports.
     */
    fun invite(params: UserInviteParams): CompletableFuture<UserInviteResponse> =
        invite(params, RequestOptions.none())

    /** @see invite */
    fun invite(
        params: UserInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserInviteResponse>

    /**
     * Restores access for a previously deactivated user. The user will regain their original
     * permissions including report creation and study management capabilities.
     */
    fun reactivate(params: UserReactivateParams): CompletableFuture<UserReactivateResponse> =
        reactivate(params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        params: UserReactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserReactivateResponse>

    /**
     * Deactivates a user's access to the system. The user will no longer be able to log in, create
     * reports, or access studies. User data is preserved and can be reactivated later.
     */
    fun revokeAccess(params: UserRevokeAccessParams): CompletableFuture<UserRevokeAccessResponse> =
        revokeAccess(params, RequestOptions.none())

    /** @see revokeAccess */
    fun revokeAccess(
        params: UserRevokeAccessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRevokeAccessResponse>

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        fun invitations(): InvitationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/users/{userId}`, but is otherwise the
         * same as [UserServiceAsync.retrieve].
         */
        fun retrieve(userId: String): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(userId, UserRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/autoScribe/users/{userId}`, but is otherwise
         * the same as [UserServiceAsync.update].
         */
        fun update(userId: String): CompletableFuture<HttpResponseFor<UserUpdateResponse>> =
            update(userId, UserUpdateParams.none())

        /** @see update */
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>> =
            update(userId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>>

        /** @see update */
        fun update(
            params: UserUpdateParams
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>> =
            update(userId, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/users`, but is otherwise the same as
         * [UserServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(UserListParams.none())

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>>

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none()
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/users`, but is otherwise the same as
         * [UserServiceAsync.invite].
         */
        fun invite(
            params: UserInviteParams
        ): CompletableFuture<HttpResponseFor<UserInviteResponse>> =
            invite(params, RequestOptions.none())

        /** @see invite */
        fun invite(
            params: UserInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserInviteResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/users/reactivate`, but is otherwise
         * the same as [UserServiceAsync.reactivate].
         */
        fun reactivate(
            params: UserReactivateParams
        ): CompletableFuture<HttpResponseFor<UserReactivateResponse>> =
            reactivate(params, RequestOptions.none())

        /** @see reactivate */
        fun reactivate(
            params: UserReactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserReactivateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/users/revoke-access`, but is
         * otherwise the same as [UserServiceAsync.revokeAccess].
         */
        fun revokeAccess(
            params: UserRevokeAccessParams
        ): CompletableFuture<HttpResponseFor<UserRevokeAccessResponse>> =
            revokeAccess(params, RequestOptions.none())

        /** @see revokeAccess */
        fun revokeAccess(
            params: UserRevokeAccessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRevokeAccessResponse>>
    }
}
