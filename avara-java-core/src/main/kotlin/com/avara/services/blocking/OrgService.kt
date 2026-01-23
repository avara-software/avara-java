// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.orgs.OrgCreateParams
import com.avara.models.orgs.OrgCreateResponse
import com.avara.models.orgs.OrgDeactivateParams
import com.avara.models.orgs.OrgDeactivateResponse
import com.avara.models.orgs.OrgListPage
import com.avara.models.orgs.OrgListParams
import com.avara.models.orgs.OrgReactivateParams
import com.avara.models.orgs.OrgReactivateResponse
import com.avara.models.orgs.OrgRetrieveParams
import com.avara.models.orgs.OrgRetrieveResponse
import com.avara.models.orgs.OrgUpdateParams
import com.avara.models.orgs.OrgUpdateResponse
import com.avara.services.blocking.orgs.UserService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface OrgService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService

    fun users(): UserService

    /**
     * Creates a new organization with a unique identifier and name. Organizations can be used to
     * group and manage users, studies, and access permissions across the Avara platform.
     */
    fun create(params: OrgCreateParams): OrgCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgCreateResponse

    /**
     * Retrieves a single organization by its unique organization ID. Returns the complete
     * organization object with name, status, and timestamps.
     */
    fun retrieve(orgId: String): OrgRetrieveResponse = retrieve(orgId, OrgRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orgId: String,
        params: OrgRetrieveParams = OrgRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgRetrieveResponse = retrieve(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orgId: String,
        params: OrgRetrieveParams = OrgRetrieveParams.none(),
    ): OrgRetrieveResponse = retrieve(orgId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OrgRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OrgRetrieveParams): OrgRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(orgId: String, requestOptions: RequestOptions): OrgRetrieveResponse =
        retrieve(orgId, OrgRetrieveParams.none(), requestOptions)

    /**
     * Updates an organization's properties such as name or other metadata. All fields are
     * optional - only provided fields will be updated.
     */
    fun update(orgId: String): OrgUpdateResponse = update(orgId, OrgUpdateParams.none())

    /** @see update */
    fun update(
        orgId: String,
        params: OrgUpdateParams = OrgUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgUpdateResponse = update(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see update */
    fun update(orgId: String, params: OrgUpdateParams = OrgUpdateParams.none()): OrgUpdateResponse =
        update(orgId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrgUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgUpdateResponse

    /** @see update */
    fun update(params: OrgUpdateParams): OrgUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(orgId: String, requestOptions: RequestOptions): OrgUpdateResponse =
        update(orgId, OrgUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of organizations with optional filtering by name. Returns up to
     * 100 organizations per request.
     */
    fun list(): OrgListPage = list(OrgListParams.none())

    /** @see list */
    fun list(
        params: OrgListParams = OrgListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgListPage

    /** @see list */
    fun list(params: OrgListParams = OrgListParams.none()): OrgListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OrgListPage =
        list(OrgListParams.none(), requestOptions)

    /**
     * Deactivates an organization, preventing it from being used for new studies or user
     * assignments. Existing data is preserved and the organization can be reactivated later.
     */
    fun deactivate(orgId: String): OrgDeactivateResponse =
        deactivate(orgId, OrgDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        orgId: String,
        params: OrgDeactivateParams = OrgDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgDeactivateResponse = deactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        orgId: String,
        params: OrgDeactivateParams = OrgDeactivateParams.none(),
    ): OrgDeactivateResponse = deactivate(orgId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: OrgDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgDeactivateResponse

    /** @see deactivate */
    fun deactivate(params: OrgDeactivateParams): OrgDeactivateResponse =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(orgId: String, requestOptions: RequestOptions): OrgDeactivateResponse =
        deactivate(orgId, OrgDeactivateParams.none(), requestOptions)

    /**
     * Restores a deactivated organization to active status, allowing it to be used for new studies
     * and user assignments again.
     */
    fun reactivate(orgId: String): OrgReactivateResponse =
        reactivate(orgId, OrgReactivateParams.none())

    /** @see reactivate */
    fun reactivate(
        orgId: String,
        params: OrgReactivateParams = OrgReactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgReactivateResponse = reactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see reactivate */
    fun reactivate(
        orgId: String,
        params: OrgReactivateParams = OrgReactivateParams.none(),
    ): OrgReactivateResponse = reactivate(orgId, params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        params: OrgReactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrgReactivateResponse

    /** @see reactivate */
    fun reactivate(params: OrgReactivateParams): OrgReactivateResponse =
        reactivate(params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(orgId: String, requestOptions: RequestOptions): OrgReactivateResponse =
        reactivate(orgId, OrgReactivateParams.none(), requestOptions)

    /** A view of [OrgService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService.WithRawResponse

        fun users(): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/orgs`, but is otherwise the same as
         * [OrgService.create].
         */
        @MustBeClosed
        fun create(params: OrgCreateParams): HttpResponseFor<OrgCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/orgs/{orgId}`, but is otherwise the same as
         * [OrgService.retrieve].
         */
        @MustBeClosed
        fun retrieve(orgId: String): HttpResponseFor<OrgRetrieveResponse> =
            retrieve(orgId, OrgRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orgId: String,
            params: OrgRetrieveParams = OrgRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgRetrieveResponse> =
            retrieve(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orgId: String,
            params: OrgRetrieveParams = OrgRetrieveParams.none(),
        ): HttpResponseFor<OrgRetrieveResponse> = retrieve(orgId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OrgRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OrgRetrieveParams): HttpResponseFor<OrgRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orgId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgRetrieveResponse> =
            retrieve(orgId, OrgRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/orgs/{orgId}`, but is otherwise the same as
         * [OrgService.update].
         */
        @MustBeClosed
        fun update(orgId: String): HttpResponseFor<OrgUpdateResponse> =
            update(orgId, OrgUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            orgId: String,
            params: OrgUpdateParams = OrgUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgUpdateResponse> =
            update(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            orgId: String,
            params: OrgUpdateParams = OrgUpdateParams.none(),
        ): HttpResponseFor<OrgUpdateResponse> = update(orgId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OrgUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: OrgUpdateParams): HttpResponseFor<OrgUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            orgId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgUpdateResponse> =
            update(orgId, OrgUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/orgs`, but is otherwise the same as
         * [OrgService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<OrgListPage> = list(OrgListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrgListParams = OrgListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OrgListParams = OrgListParams.none()): HttpResponseFor<OrgListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrgListPage> =
            list(OrgListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/orgs/{orgId}/deactivate`, but is otherwise the
         * same as [OrgService.deactivate].
         */
        @MustBeClosed
        fun deactivate(orgId: String): HttpResponseFor<OrgDeactivateResponse> =
            deactivate(orgId, OrgDeactivateParams.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            orgId: String,
            params: OrgDeactivateParams = OrgDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgDeactivateResponse> =
            deactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            orgId: String,
            params: OrgDeactivateParams = OrgDeactivateParams.none(),
        ): HttpResponseFor<OrgDeactivateResponse> = deactivate(orgId, params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: OrgDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(params: OrgDeactivateParams): HttpResponseFor<OrgDeactivateResponse> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            orgId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgDeactivateResponse> =
            deactivate(orgId, OrgDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/orgs/{orgId}/reactivate`, but is otherwise the
         * same as [OrgService.reactivate].
         */
        @MustBeClosed
        fun reactivate(orgId: String): HttpResponseFor<OrgReactivateResponse> =
            reactivate(orgId, OrgReactivateParams.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            orgId: String,
            params: OrgReactivateParams = OrgReactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgReactivateResponse> =
            reactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            orgId: String,
            params: OrgReactivateParams = OrgReactivateParams.none(),
        ): HttpResponseFor<OrgReactivateResponse> = reactivate(orgId, params, RequestOptions.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            params: OrgReactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrgReactivateResponse>

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(params: OrgReactivateParams): HttpResponseFor<OrgReactivateResponse> =
            reactivate(params, RequestOptions.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            orgId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrgReactivateResponse> =
            reactivate(orgId, OrgReactivateParams.none(), requestOptions)
    }
}
