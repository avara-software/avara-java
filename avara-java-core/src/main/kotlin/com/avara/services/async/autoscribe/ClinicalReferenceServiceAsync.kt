// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.clinicalreferences.ClinicalReference
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceCreateParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceDeleteParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceListPageAsync
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceListParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceRetrieveByExternalReferenceIdParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceRetrieveParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ClinicalReferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClinicalReferenceServiceAsync

    /**
     * Creates a canonical clinical reference value for study workflow pickers and normalization.
     */
    fun create(params: ClinicalReferenceCreateParams): CompletableFuture<ClinicalReference> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ClinicalReferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference>

    /** Retrieves a single clinical reference by its unique identifier. */
    fun retrieve(clinicalReferenceId: String): CompletableFuture<ClinicalReference> =
        retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        clinicalReferenceId: String,
        params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference> =
        retrieve(
            params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        clinicalReferenceId: String,
        params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
    ): CompletableFuture<ClinicalReference> =
        retrieve(clinicalReferenceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ClinicalReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference>

    /** @see retrieve */
    fun retrieve(params: ClinicalReferenceRetrieveParams): CompletableFuture<ClinicalReference> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        clinicalReferenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClinicalReference> =
        retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none(), requestOptions)

    /** Updates name, metadata, and Express customer assignment. Type is immutable after create. */
    fun update(clinicalReferenceId: String): CompletableFuture<ClinicalReference> =
        update(clinicalReferenceId, ClinicalReferenceUpdateParams.none())

    /** @see update */
    fun update(
        clinicalReferenceId: String,
        params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference> =
        update(params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(), requestOptions)

    /** @see update */
    fun update(
        clinicalReferenceId: String,
        params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
    ): CompletableFuture<ClinicalReference> =
        update(clinicalReferenceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ClinicalReferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference>

    /** @see update */
    fun update(params: ClinicalReferenceUpdateParams): CompletableFuture<ClinicalReference> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        clinicalReferenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClinicalReference> =
        update(clinicalReferenceId, ClinicalReferenceUpdateParams.none(), requestOptions)

    /** Lists clinical references with cursor-based pagination and optional filters. */
    fun list(): CompletableFuture<ClinicalReferenceListPageAsync> =
        list(ClinicalReferenceListParams.none())

    /** @see list */
    fun list(
        params: ClinicalReferenceListParams = ClinicalReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReferenceListPageAsync>

    /** @see list */
    fun list(
        params: ClinicalReferenceListParams = ClinicalReferenceListParams.none()
    ): CompletableFuture<ClinicalReferenceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ClinicalReferenceListPageAsync> =
        list(ClinicalReferenceListParams.none(), requestOptions)

    /**
     * Soft-deletes a clinical reference by setting isActive to false and suffixing the name to free
     * the unique constraint.
     */
    fun delete(clinicalReferenceId: String): CompletableFuture<ClinicalReference> =
        delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none())

    /** @see delete */
    fun delete(
        clinicalReferenceId: String,
        params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference> =
        delete(params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        clinicalReferenceId: String,
        params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
    ): CompletableFuture<ClinicalReference> =
        delete(clinicalReferenceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ClinicalReferenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference>

    /** @see delete */
    fun delete(params: ClinicalReferenceDeleteParams): CompletableFuture<ClinicalReference> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        clinicalReferenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClinicalReference> =
        delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none(), requestOptions)

    /**
     * Retrieves a single clinical reference by its integrator-provided external reference
     * identifier.
     */
    fun retrieveByExternalReferenceId(
        externalReferenceId: String
    ): CompletableFuture<ClinicalReference> =
        retrieveByExternalReferenceId(
            externalReferenceId,
            ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
        )

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        externalReferenceId: String,
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
            ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference> =
        retrieveByExternalReferenceId(
            params.toBuilder().externalReferenceId(externalReferenceId).build(),
            requestOptions,
        )

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        externalReferenceId: String,
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
            ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
    ): CompletableFuture<ClinicalReference> =
        retrieveByExternalReferenceId(externalReferenceId, params, RequestOptions.none())

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClinicalReference>

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams
    ): CompletableFuture<ClinicalReference> =
        retrieveByExternalReferenceId(params, RequestOptions.none())

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        externalReferenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClinicalReference> =
        retrieveByExternalReferenceId(
            externalReferenceId,
            ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [ClinicalReferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): ClinicalReferenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/clinicalReferences`, but is
         * otherwise the same as [ClinicalReferenceServiceAsync.create].
         */
        fun create(
            params: ClinicalReferenceCreateParams
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ClinicalReferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/autoScribe/clinicalReferences/{clinicalReferenceId}`, but is otherwise the same as
         * [ClinicalReferenceServiceAsync.retrieve].
         */
        fun retrieve(
            clinicalReferenceId: String
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            clinicalReferenceId: String,
            params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieve(
                params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            clinicalReferenceId: String,
            params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieve(clinicalReferenceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ClinicalReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>>

        /** @see retrieve */
        fun retrieve(
            params: ClinicalReferenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            clinicalReferenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/autoScribe/clinicalReferences/{clinicalReferenceId}`, but is otherwise the same as
         * [ClinicalReferenceServiceAsync.update].
         */
        fun update(
            clinicalReferenceId: String
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            update(clinicalReferenceId, ClinicalReferenceUpdateParams.none())

        /** @see update */
        fun update(
            clinicalReferenceId: String,
            params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            update(
                params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            clinicalReferenceId: String,
            params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            update(clinicalReferenceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ClinicalReferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>>

        /** @see update */
        fun update(
            params: ClinicalReferenceUpdateParams
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            clinicalReferenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            update(clinicalReferenceId, ClinicalReferenceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/clinicalReferences`, but is otherwise
         * the same as [ClinicalReferenceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ClinicalReferenceListPageAsync>> =
            list(ClinicalReferenceListParams.none())

        /** @see list */
        fun list(
            params: ClinicalReferenceListParams = ClinicalReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReferenceListPageAsync>>

        /** @see list */
        fun list(
            params: ClinicalReferenceListParams = ClinicalReferenceListParams.none()
        ): CompletableFuture<HttpResponseFor<ClinicalReferenceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClinicalReferenceListPageAsync>> =
            list(ClinicalReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/autoScribe/clinicalReferences/{clinicalReferenceId}/delete`, but is otherwise the
         * same as [ClinicalReferenceServiceAsync.delete].
         */
        fun delete(
            clinicalReferenceId: String
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none())

        /** @see delete */
        fun delete(
            clinicalReferenceId: String,
            params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            delete(
                params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            clinicalReferenceId: String,
            params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            delete(clinicalReferenceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ClinicalReferenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>>

        /** @see delete */
        fun delete(
            params: ClinicalReferenceDeleteParams
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            clinicalReferenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/autoScribe/clinicalReferences/byExternalReferenceId/{externalReferenceId}`, but is
         * otherwise the same as [ClinicalReferenceServiceAsync.retrieveByExternalReferenceId].
         */
        fun retrieveByExternalReferenceId(
            externalReferenceId: String
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieveByExternalReferenceId(
                externalReferenceId,
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
            )

        /** @see retrieveByExternalReferenceId */
        fun retrieveByExternalReferenceId(
            externalReferenceId: String,
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieveByExternalReferenceId(
                params.toBuilder().externalReferenceId(externalReferenceId).build(),
                requestOptions,
            )

        /** @see retrieveByExternalReferenceId */
        fun retrieveByExternalReferenceId(
            externalReferenceId: String,
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieveByExternalReferenceId(externalReferenceId, params, RequestOptions.none())

        /** @see retrieveByExternalReferenceId */
        fun retrieveByExternalReferenceId(
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClinicalReference>>

        /** @see retrieveByExternalReferenceId */
        fun retrieveByExternalReferenceId(
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieveByExternalReferenceId(params, RequestOptions.none())

        /** @see retrieveByExternalReferenceId */
        fun retrieveByExternalReferenceId(
            externalReferenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClinicalReference>> =
            retrieveByExternalReferenceId(
                externalReferenceId,
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
                requestOptions,
            )
    }
}
