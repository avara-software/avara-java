// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer.users

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.viewer.users.invitations.InvitationListPage
import com.avara.models.viewer.users.invitations.InvitationListParams
import com.avara.models.viewer.users.invitations.InvitationRetrieveParams
import com.avara.models.viewer.users.invitations.InvitationRetrieveResponse
import com.avara.models.viewer.users.invitations.InvitationRevokeParams
import com.avara.models.viewer.users.invitations.InvitationRevokeResponse
import com.avara.models.viewer.users.invitations.InvitationUpdateParams
import com.avara.models.viewer.users.invitations.InvitationUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InvitationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationService

    /**
     * Retrieves a single invitation by its unique invitation ID. Returns the complete invitation
     * details including status, expiration, and associated user information.
     */
    fun retrieve(invitationId: String): InvitationRetrieveResponse =
        retrieve(invitationId, InvitationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationRetrieveResponse =
        retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        invitationId: String,
        params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
    ): InvitationRetrieveResponse = retrieve(invitationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: InvitationRetrieveParams): InvitationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(invitationId: String, requestOptions: RequestOptions): InvitationRetrieveResponse =
        retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

    /**
     * Updates a pending invitation's user details and permissions before it is accepted. Only valid
     * for invitations that have not expired or been processed.
     */
    fun update(invitationId: String): InvitationUpdateResponse =
        update(invitationId, InvitationUpdateParams.none())

    /** @see update */
    fun update(
        invitationId: String,
        params: InvitationUpdateParams = InvitationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationUpdateResponse =
        update(params.toBuilder().invitationId(invitationId).build(), requestOptions)

    /** @see update */
    fun update(
        invitationId: String,
        params: InvitationUpdateParams = InvitationUpdateParams.none(),
    ): InvitationUpdateResponse = update(invitationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvitationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationUpdateResponse

    /** @see update */
    fun update(params: InvitationUpdateParams): InvitationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(invitationId: String, requestOptions: RequestOptions): InvitationUpdateResponse =
        update(invitationId, InvitationUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of user invitations with optional filtering by status, expiration,
     * date range, and user ID. Returns up to 100 invitations per request.
     */
    fun list(): InvitationListPage = list(InvitationListParams.none())

    /** @see list */
    fun list(
        params: InvitationListParams = InvitationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationListPage

    /** @see list */
    fun list(params: InvitationListParams = InvitationListParams.none()): InvitationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InvitationListPage =
        list(InvitationListParams.none(), requestOptions)

    /**
     * Revokes a pending invitation, preventing it from being accepted. Can revoke by invitation ID,
     * user ID, or both. Useful for cancelling invitations sent in error.
     */
    fun revoke(): InvitationRevokeResponse = revoke(InvitationRevokeParams.none())

    /** @see revoke */
    fun revoke(
        params: InvitationRevokeParams = InvitationRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationRevokeResponse

    /** @see revoke */
    fun revoke(
        params: InvitationRevokeParams = InvitationRevokeParams.none()
    ): InvitationRevokeResponse = revoke(params, RequestOptions.none())

    /** @see revoke */
    fun revoke(requestOptions: RequestOptions): InvitationRevokeResponse =
        revoke(InvitationRevokeParams.none(), requestOptions)

    /** A view of [InvitationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/viewer/users/invitations/{invitationId}`, but is
         * otherwise the same as [InvitationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(invitationId: String): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(invitationId, InvitationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invitationId: String,
            params: InvitationRetrieveParams = InvitationRetrieveParams.none(),
        ): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(invitationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InvitationRetrieveParams
        ): HttpResponseFor<InvitationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            invitationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationRetrieveResponse> =
            retrieve(invitationId, InvitationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/viewer/users/invitations/{invitationId}`, but
         * is otherwise the same as [InvitationService.update].
         */
        @MustBeClosed
        fun update(invitationId: String): HttpResponseFor<InvitationUpdateResponse> =
            update(invitationId, InvitationUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            invitationId: String,
            params: InvitationUpdateParams = InvitationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationUpdateResponse> =
            update(params.toBuilder().invitationId(invitationId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            invitationId: String,
            params: InvitationUpdateParams = InvitationUpdateParams.none(),
        ): HttpResponseFor<InvitationUpdateResponse> =
            update(invitationId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InvitationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: InvitationUpdateParams): HttpResponseFor<InvitationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            invitationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitationUpdateResponse> =
            update(invitationId, InvitationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/viewer/users/invitations`, but is otherwise the
         * same as [InvitationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InvitationListPage> = list(InvitationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvitationListParams = InvitationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvitationListParams = InvitationListParams.none()
        ): HttpResponseFor<InvitationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvitationListPage> =
            list(InvitationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/viewer/users/invitations/revoke`, but is
         * otherwise the same as [InvitationService.revoke].
         */
        @MustBeClosed
        fun revoke(): HttpResponseFor<InvitationRevokeResponse> =
            revoke(InvitationRevokeParams.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: InvitationRevokeParams = InvitationRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationRevokeResponse>

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: InvitationRevokeParams = InvitationRevokeParams.none()
        ): HttpResponseFor<InvitationRevokeResponse> = revoke(params, RequestOptions.none())

        /** @see revoke */
        @MustBeClosed
        fun revoke(requestOptions: RequestOptions): HttpResponseFor<InvitationRevokeResponse> =
            revoke(InvitationRevokeParams.none(), requestOptions)
    }
}
