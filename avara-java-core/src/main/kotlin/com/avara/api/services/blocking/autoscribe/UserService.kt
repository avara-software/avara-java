// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.blocking.autoscribe

import com.avara.api.core.ClientOptions
import com.avara.api.core.RequestOptions
import com.avara.api.core.http.HttpResponseFor
import com.avara.api.models.autoscribe.users.UserInviteParams
import com.avara.api.models.autoscribe.users.UserInviteResponse
import com.avara.api.models.autoscribe.users.UserListPage
import com.avara.api.models.autoscribe.users.UserListParams
import com.avara.api.models.autoscribe.users.UserReactivateParams
import com.avara.api.models.autoscribe.users.UserReactivateResponse
import com.avara.api.models.autoscribe.users.UserRetrieveParams
import com.avara.api.models.autoscribe.users.UserRetrieveResponse
import com.avara.api.models.autoscribe.users.UserRevokeAccessParams
import com.avara.api.models.autoscribe.users.UserRevokeAccessResponse
import com.avara.api.models.autoscribe.users.UserUpdateParams
import com.avara.api.models.autoscribe.users.UserUpdateResponse
import com.avara.api.services.blocking.autoscribe.users.InvitationService
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

    fun invitations(): InvitationService

    /**
     * Retrieves a single user by their unique user ID. Returns the complete user object with all
     * profile information, permissions, AutoScribe-specific settings, and status.
     */
    fun retrieve(userId: String): UserRetrieveResponse = retrieve(userId, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): UserRetrieveResponse = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): UserRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /**
     * Updates a user's profile information, permissions, and AutoScribe-specific settings. All
     * fields are optional - only provided fields will be updated. Email cannot be changed via API.
     * NPI number is required if enabling report creation capability.
     */
    fun update(userId: String): UserUpdateResponse = update(userId, UserUpdateParams.none())

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserUpdateResponse = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
    ): UserUpdateResponse = update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserUpdateResponse

    /** @see update */
    fun update(params: UserUpdateParams): UserUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(userId: String, requestOptions: RequestOptions): UserUpdateResponse =
        update(userId, UserUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of users with optional filtering by access level, email, name,
     * invitation source, and report creation capability. Returns up to 100 users per request.
     */
    fun list(): UserListPage = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserListPage

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): UserListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserListPage =
        list(UserListParams.none(), requestOptions)

    /**
     * Creates a new user in the AutoScribe system and sends them an invitation email. The user will
     * have the specified permissions including report creation and study management capabilities.
     * NPI number is required for users who can create reports.
     */
    fun invite(params: UserInviteParams): UserInviteResponse = invite(params, RequestOptions.none())

    /** @see invite */
    fun invite(
        params: UserInviteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInviteResponse

    /**
     * Restores access for a previously deactivated user. The user will regain their original
     * permissions including report creation and study management capabilities.
     */
    fun reactivate(params: UserReactivateParams): UserReactivateResponse =
        reactivate(params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        params: UserReactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserReactivateResponse

    /**
     * Deactivates a user's access to the system. The user will no longer be able to log in, create
     * reports, or access studies. User data is preserved and can be reactivated later.
     */
    fun revokeAccess(params: UserRevokeAccessParams): UserRevokeAccessResponse =
        revokeAccess(params, RequestOptions.none())

    /** @see revokeAccess */
    fun revokeAccess(
        params: UserRevokeAccessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRevokeAccessResponse

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        fun invitations(): InvitationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/users/{userId}`, but is otherwise the
         * same as [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userId: String): HttpResponseFor<UserRetrieveResponse> =
            retrieve(userId, UserRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): HttpResponseFor<UserRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: UserRetrieveParams): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/autoScribe/users/{userId}`, but is otherwise
         * the same as [UserService.update].
         */
        @MustBeClosed
        fun update(userId: String): HttpResponseFor<UserUpdateResponse> =
            update(userId, UserUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserUpdateResponse> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
        ): HttpResponseFor<UserUpdateResponse> = update(userId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: UserUpdateParams): HttpResponseFor<UserUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserUpdateResponse> =
            update(userId, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/users`, but is otherwise the same as
         * [UserService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<UserListPage> = list(UserListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: UserListParams = UserListParams.none()): HttpResponseFor<UserListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserListPage> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/users`, but is otherwise the same as
         * [UserService.invite].
         */
        @MustBeClosed
        fun invite(params: UserInviteParams): HttpResponseFor<UserInviteResponse> =
            invite(params, RequestOptions.none())

        /** @see invite */
        @MustBeClosed
        fun invite(
            params: UserInviteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInviteResponse>

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/users/reactivate`, but is otherwise
         * the same as [UserService.reactivate].
         */
        @MustBeClosed
        fun reactivate(params: UserReactivateParams): HttpResponseFor<UserReactivateResponse> =
            reactivate(params, RequestOptions.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            params: UserReactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserReactivateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/users/revoke-access`, but is
         * otherwise the same as [UserService.revokeAccess].
         */
        @MustBeClosed
        fun revokeAccess(
            params: UserRevokeAccessParams
        ): HttpResponseFor<UserRevokeAccessResponse> = revokeAccess(params, RequestOptions.none())

        /** @see revokeAccess */
        @MustBeClosed
        fun revokeAccess(
            params: UserRevokeAccessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRevokeAccessResponse>
    }
}
