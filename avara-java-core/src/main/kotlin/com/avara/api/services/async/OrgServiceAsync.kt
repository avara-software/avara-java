// File generated from our OpenAPI spec by Stainless.

package com.avara.api.services.async

import com.avara.api.core.ClientOptions
import com.avara.api.core.RequestOptions
import com.avara.api.core.http.HttpResponseFor
import com.avara.api.models.orgs.OrgCreateParams
import com.avara.api.models.orgs.OrgCreateResponse
import com.avara.api.models.orgs.OrgDeactivateParams
import com.avara.api.models.orgs.OrgDeactivateResponse
import com.avara.api.models.orgs.OrgListPageAsync
import com.avara.api.models.orgs.OrgListParams
import com.avara.api.models.orgs.OrgReactivateParams
import com.avara.api.models.orgs.OrgReactivateResponse
import com.avara.api.models.orgs.OrgRetrieveParams
import com.avara.api.models.orgs.OrgRetrieveResponse
import com.avara.api.models.orgs.OrgUpdateParams
import com.avara.api.models.orgs.OrgUpdateResponse
import com.avara.api.services.async.orgs.UserServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrgServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync

    fun users(): UserServiceAsync

    /**
     * Creates a new organization with a unique identifier and name. Organizations can be used to
     * group and manage users, studies, and access permissions across the Avara platform.
     */
    fun create(params: OrgCreateParams): CompletableFuture<OrgCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgCreateResponse>

    /**
     * Retrieves a single organization by its unique organization ID. Returns the complete
     * organization object with name, status, and timestamps.
     */
    fun retrieve(orgId: String): CompletableFuture<OrgRetrieveResponse> =
        retrieve(orgId, OrgRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orgId: String,
        params: OrgRetrieveParams = OrgRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgRetrieveResponse> =
        retrieve(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orgId: String,
        params: OrgRetrieveParams = OrgRetrieveParams.none(),
    ): CompletableFuture<OrgRetrieveResponse> = retrieve(orgId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OrgRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: OrgRetrieveParams): CompletableFuture<OrgRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        orgId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgRetrieveResponse> =
        retrieve(orgId, OrgRetrieveParams.none(), requestOptions)

    /**
     * Updates an organization's properties such as name or other metadata. All fields are
     * optional - only provided fields will be updated.
     */
    fun update(orgId: String): CompletableFuture<OrgUpdateResponse> =
        update(orgId, OrgUpdateParams.none())

    /** @see update */
    fun update(
        orgId: String,
        params: OrgUpdateParams = OrgUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgUpdateResponse> =
        update(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see update */
    fun update(
        orgId: String,
        params: OrgUpdateParams = OrgUpdateParams.none(),
    ): CompletableFuture<OrgUpdateResponse> = update(orgId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OrgUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgUpdateResponse>

    /** @see update */
    fun update(params: OrgUpdateParams): CompletableFuture<OrgUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        orgId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgUpdateResponse> = update(orgId, OrgUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of organizations with optional filtering by name. Returns up to
     * 100 organizations per request.
     */
    fun list(): CompletableFuture<OrgListPageAsync> = list(OrgListParams.none())

    /** @see list */
    fun list(
        params: OrgListParams = OrgListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgListPageAsync>

    /** @see list */
    fun list(params: OrgListParams = OrgListParams.none()): CompletableFuture<OrgListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrgListPageAsync> =
        list(OrgListParams.none(), requestOptions)

    /**
     * Deactivates an organization, preventing it from being used for new studies or user
     * assignments. Existing data is preserved and the organization can be reactivated later.
     */
    fun deactivate(orgId: String): CompletableFuture<OrgDeactivateResponse> =
        deactivate(orgId, OrgDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        orgId: String,
        params: OrgDeactivateParams = OrgDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgDeactivateResponse> =
        deactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        orgId: String,
        params: OrgDeactivateParams = OrgDeactivateParams.none(),
    ): CompletableFuture<OrgDeactivateResponse> = deactivate(orgId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: OrgDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgDeactivateResponse>

    /** @see deactivate */
    fun deactivate(params: OrgDeactivateParams): CompletableFuture<OrgDeactivateResponse> =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        orgId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgDeactivateResponse> =
        deactivate(orgId, OrgDeactivateParams.none(), requestOptions)

    /**
     * Restores a deactivated organization to active status, allowing it to be used for new studies
     * and user assignments again.
     */
    fun reactivate(orgId: String): CompletableFuture<OrgReactivateResponse> =
        reactivate(orgId, OrgReactivateParams.none())

    /** @see reactivate */
    fun reactivate(
        orgId: String,
        params: OrgReactivateParams = OrgReactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgReactivateResponse> =
        reactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

    /** @see reactivate */
    fun reactivate(
        orgId: String,
        params: OrgReactivateParams = OrgReactivateParams.none(),
    ): CompletableFuture<OrgReactivateResponse> = reactivate(orgId, params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        params: OrgReactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrgReactivateResponse>

    /** @see reactivate */
    fun reactivate(params: OrgReactivateParams): CompletableFuture<OrgReactivateResponse> =
        reactivate(params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        orgId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrgReactivateResponse> =
        reactivate(orgId, OrgReactivateParams.none(), requestOptions)

    /** A view of [OrgServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/orgs`, but is otherwise the same as
         * [OrgServiceAsync.create].
         */
        fun create(params: OrgCreateParams): CompletableFuture<HttpResponseFor<OrgCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/orgs/{orgId}`, but is otherwise the same as
         * [OrgServiceAsync.retrieve].
         */
        fun retrieve(orgId: String): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>> =
            retrieve(orgId, OrgRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            orgId: String,
            params: OrgRetrieveParams = OrgRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>> =
            retrieve(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            orgId: String,
            params: OrgRetrieveParams = OrgRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>> =
            retrieve(orgId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OrgRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OrgRetrieveParams
        ): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            orgId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgRetrieveResponse>> =
            retrieve(orgId, OrgRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/orgs/{orgId}`, but is otherwise the same as
         * [OrgServiceAsync.update].
         */
        fun update(orgId: String): CompletableFuture<HttpResponseFor<OrgUpdateResponse>> =
            update(orgId, OrgUpdateParams.none())

        /** @see update */
        fun update(
            orgId: String,
            params: OrgUpdateParams = OrgUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgUpdateResponse>> =
            update(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see update */
        fun update(
            orgId: String,
            params: OrgUpdateParams = OrgUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<OrgUpdateResponse>> =
            update(orgId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OrgUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgUpdateResponse>>

        /** @see update */
        fun update(params: OrgUpdateParams): CompletableFuture<HttpResponseFor<OrgUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            orgId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgUpdateResponse>> =
            update(orgId, OrgUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/orgs`, but is otherwise the same as
         * [OrgServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrgListPageAsync>> =
            list(OrgListParams.none())

        /** @see list */
        fun list(
            params: OrgListParams = OrgListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgListPageAsync>>

        /** @see list */
        fun list(
            params: OrgListParams = OrgListParams.none()
        ): CompletableFuture<HttpResponseFor<OrgListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrgListPageAsync>> =
            list(OrgListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/orgs/{orgId}/deactivate`, but is otherwise the
         * same as [OrgServiceAsync.deactivate].
         */
        fun deactivate(orgId: String): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>> =
            deactivate(orgId, OrgDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            orgId: String,
            params: OrgDeactivateParams = OrgDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>> =
            deactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see deactivate */
        fun deactivate(
            orgId: String,
            params: OrgDeactivateParams = OrgDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>> =
            deactivate(orgId, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: OrgDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: OrgDeactivateParams
        ): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            orgId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgDeactivateResponse>> =
            deactivate(orgId, OrgDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/orgs/{orgId}/reactivate`, but is otherwise the
         * same as [OrgServiceAsync.reactivate].
         */
        fun reactivate(orgId: String): CompletableFuture<HttpResponseFor<OrgReactivateResponse>> =
            reactivate(orgId, OrgReactivateParams.none())

        /** @see reactivate */
        fun reactivate(
            orgId: String,
            params: OrgReactivateParams = OrgReactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgReactivateResponse>> =
            reactivate(params.toBuilder().orgId(orgId).build(), requestOptions)

        /** @see reactivate */
        fun reactivate(
            orgId: String,
            params: OrgReactivateParams = OrgReactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<OrgReactivateResponse>> =
            reactivate(orgId, params, RequestOptions.none())

        /** @see reactivate */
        fun reactivate(
            params: OrgReactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrgReactivateResponse>>

        /** @see reactivate */
        fun reactivate(
            params: OrgReactivateParams
        ): CompletableFuture<HttpResponseFor<OrgReactivateResponse>> =
            reactivate(params, RequestOptions.none())

        /** @see reactivate */
        fun reactivate(
            orgId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrgReactivateResponse>> =
            reactivate(orgId, OrgReactivateParams.none(), requestOptions)
    }
}
