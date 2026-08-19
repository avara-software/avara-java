// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async.viewer.users

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.viewer.users.invitations.InvitationListPageAsync
import com.avarasoftware.models.viewer.users.invitations.InvitationListParams
import com.avarasoftware.models.viewer.users.invitations.InvitationRetrieveParams
import com.avarasoftware.models.viewer.users.invitations.InvitationRetrieveResponse
import com.avarasoftware.models.viewer.users.invitations.InvitationRevokeParams
import com.avarasoftware.models.viewer.users.invitations.InvitationRevokeResponse
import com.avarasoftware.models.viewer.users.invitations.InvitationUpdateParams
import com.avarasoftware.models.viewer.users.invitations.InvitationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvitationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationServiceAsync

    /**
     * Retrieves a single invitation by its unique invitation ID. Returns the complete invitation
     * details including status, expiration, and associated user information.
     */
    fun retrieve(invitationId: String): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(invitationId, InvitationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
    ): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(invitationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: InvitationRetrieveParams): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationRetrieveResponse> =
        retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

    /**
     * Updates a pending invitation's user details and permissions before it is accepted. Only valid
     * for invitations that have not expired or been processed.
     */
    fun update(invitationId: String): CompletableFuture<InvitationUpdateResponse> =
        update(invitationId, InvitationUpdateParams.none())

    /** @see update */
    fun update(
        invitationId: String,
        params: InvitationUpdateParams = InvitationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationUpdateResponse> =
        update(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see update */
    fun update(
        invitationId: String,
        params: InvitationUpdateParams = InvitationUpdateParams.none(),
    ): CompletableFuture<InvitationUpdateResponse> =
        update(invitationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvitationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationUpdateResponse>

    /** @see update */
    fun update(params: InvitationUpdateParams): CompletableFuture<InvitationUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        invitationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationUpdateResponse> =
        update(invitationId, InvitationUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of user invitations with optional filtering by status, expiration,
     * date range, and user ID. Returns up to 100 invitations per request.
     */
    fun list(): CompletableFuture<InvitationListPageAsync> = list(InvitationListParams.none())

    /** @see list */
    fun list(
        params: InvitationListParams = InvitationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationListPageAsync>

    /** @see list */
    fun list(
        params: InvitationListParams = InvitationListParams.none()
    ): CompletableFuture<InvitationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvitationListPageAsync> =
        list(InvitationListParams.none(), requestOptions)

    /**
     * Revokes a pending invitation, preventing it from being accepted. Can revoke by invitation ID,
     * user ID, or both. Useful for cancelling invitations sent in error.
     */
    fun revoke(): CompletableFuture<InvitationRevokeResponse> =
        revoke(InvitationRevokeParams.none())

    /** @see revoke */
    fun revoke(
        params: InvitationRevokeParams = InvitationRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationRevokeResponse>

    /** @see revoke */
    fun revoke(
        params: InvitationRevokeParams = InvitationRevokeParams.none()
    ): CompletableFuture<InvitationRevokeResponse> = revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(requestOptions: RequestOptions): CompletableFuture<InvitationRevokeResponse> =
        revoke(InvitationRevokeParams.none(), requestOptions)

    /**
     * A view of [InvitationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/viewer/users/invitations/{invitationId}`, but is
         * otherwise the same as [InvitationServiceAsync.retrieve].
         */
        fun retrieve(
            invitationId: String
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(invitationId, InvitationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(invitationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InvitationRetrieveParams
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            invitationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationRetrieveResponse>> =
            retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/viewer/users/invitations/{invitationId}`, but
         * is otherwise the same as [InvitationServiceAsync.update].
         */
        fun update(
            invitationId: String
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>> =
            update(invitationId, InvitationUpdateParams.none())

        /** @see update */
        fun update(
            invitationId: String,
            params: InvitationUpdateParams = InvitationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>> =
            update(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see update */
        fun update(
            invitationId: String,
            params: InvitationUpdateParams = InvitationUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>> =
            update(invitationId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InvitationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>>

        /** @see update */
        fun update(
            params: InvitationUpdateParams
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            invitationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationUpdateResponse>> =
            update(invitationId, InvitationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/viewer/users/invitations`, but is otherwise the
         * same as [InvitationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> =
            list(InvitationListParams.none())

        /** @see list */
        fun list(
            params: InvitationListParams = InvitationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>>

        /** @see list */
        fun list(
            params: InvitationListParams = InvitationListParams.none()
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvitationListPageAsync>> =
            list(InvitationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/viewer/users/invitations/revoke`, but is
         * otherwise the same as [InvitationServiceAsync.revoke].
         */
        fun revoke(): CompletableFuture<HttpResponseFor<InvitationRevokeResponse>> =
            revoke(InvitationRevokeParams.none())

        /** @see revoke */
        fun revoke(
            params: InvitationRevokeParams = InvitationRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationRevokeResponse>>

        /** @see revoke */
        fun revoke(
            params: InvitationRevokeParams = InvitationRevokeParams.none()
        ): CompletableFuture<HttpResponseFor<InvitationRevokeResponse>> =
            revoke(params, RequestOptions.none())

        /** @see revoke */
        fun revoke(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvitationRevokeResponse>> =
            revoke(InvitationRevokeParams.none(), requestOptions)
    }
}
