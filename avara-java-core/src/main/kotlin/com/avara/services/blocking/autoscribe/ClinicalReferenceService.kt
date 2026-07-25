// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.clinicalreferences.ClinicalReference
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceCreateParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceDeleteParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceListPage
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceListParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceRetrieveByExternalReferenceIdParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceRetrieveParams
import com.avara.models.autoscribe.clinicalreferences.ClinicalReferenceUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ClinicalReferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClinicalReferenceService

    /**
     * Creates a canonical clinical reference value for study workflow pickers and normalization.
     */
    fun create(params: ClinicalReferenceCreateParams): ClinicalReference =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ClinicalReferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference

    /** Retrieves a single clinical reference by its unique identifier. */
    fun retrieve(clinicalReferenceId: String): ClinicalReference =
        retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        clinicalReferenceId: String,
        params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference =
        retrieve(
            params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        clinicalReferenceId: String,
        params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
    ): ClinicalReference = retrieve(clinicalReferenceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ClinicalReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference

    /** @see retrieve */
    fun retrieve(params: ClinicalReferenceRetrieveParams): ClinicalReference =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(clinicalReferenceId: String, requestOptions: RequestOptions): ClinicalReference =
        retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none(), requestOptions)

    /** Updates name, metadata, and Express customer assignment. Type is immutable after create. */
    fun update(clinicalReferenceId: String): ClinicalReference =
        update(clinicalReferenceId, ClinicalReferenceUpdateParams.none())

    /** @see update */
    fun update(
        clinicalReferenceId: String,
        params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference =
        update(params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(), requestOptions)

    /** @see update */
    fun update(
        clinicalReferenceId: String,
        params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
    ): ClinicalReference = update(clinicalReferenceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ClinicalReferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference

    /** @see update */
    fun update(params: ClinicalReferenceUpdateParams): ClinicalReference =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(clinicalReferenceId: String, requestOptions: RequestOptions): ClinicalReference =
        update(clinicalReferenceId, ClinicalReferenceUpdateParams.none(), requestOptions)

    /** Lists clinical references with cursor-based pagination and optional filters. */
    fun list(): ClinicalReferenceListPage = list(ClinicalReferenceListParams.none())

    /** @see list */
    fun list(
        params: ClinicalReferenceListParams = ClinicalReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReferenceListPage

    /** @see list */
    fun list(
        params: ClinicalReferenceListParams = ClinicalReferenceListParams.none()
    ): ClinicalReferenceListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ClinicalReferenceListPage =
        list(ClinicalReferenceListParams.none(), requestOptions)

    /**
     * Soft-deletes a clinical reference by setting isActive to false and suffixing the name to free
     * the unique constraint.
     */
    fun delete(clinicalReferenceId: String): ClinicalReference =
        delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none())

    /** @see delete */
    fun delete(
        clinicalReferenceId: String,
        params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference =
        delete(params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        clinicalReferenceId: String,
        params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
    ): ClinicalReference = delete(clinicalReferenceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ClinicalReferenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference

    /** @see delete */
    fun delete(params: ClinicalReferenceDeleteParams): ClinicalReference =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(clinicalReferenceId: String, requestOptions: RequestOptions): ClinicalReference =
        delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none(), requestOptions)

    /**
     * Retrieves a single clinical reference by its integrator-provided external reference
     * identifier.
     */
    fun retrieveByExternalReferenceId(externalReferenceId: String): ClinicalReference =
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
    ): ClinicalReference =
        retrieveByExternalReferenceId(
            params.toBuilder().externalReferenceId(externalReferenceId).build(),
            requestOptions,
        )

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        externalReferenceId: String,
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
            ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
    ): ClinicalReference =
        retrieveByExternalReferenceId(externalReferenceId, params, RequestOptions.none())

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClinicalReference

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        params: ClinicalReferenceRetrieveByExternalReferenceIdParams
    ): ClinicalReference = retrieveByExternalReferenceId(params, RequestOptions.none())

    /** @see retrieveByExternalReferenceId */
    fun retrieveByExternalReferenceId(
        externalReferenceId: String,
        requestOptions: RequestOptions,
    ): ClinicalReference =
        retrieveByExternalReferenceId(
            externalReferenceId,
            ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [ClinicalReferenceService] that provides access to raw HTTP responses for each
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
        ): ClinicalReferenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/clinicalReferences`, but is
         * otherwise the same as [ClinicalReferenceService.create].
         */
        @MustBeClosed
        fun create(params: ClinicalReferenceCreateParams): HttpResponseFor<ClinicalReference> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ClinicalReferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference>

        /**
         * Returns a raw HTTP response for `get
         * /v1/autoScribe/clinicalReferences/{clinicalReferenceId}`, but is otherwise the same as
         * [ClinicalReferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(clinicalReferenceId: String): HttpResponseFor<ClinicalReference> =
            retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            clinicalReferenceId: String,
            params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference> =
            retrieve(
                params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            clinicalReferenceId: String,
            params: ClinicalReferenceRetrieveParams = ClinicalReferenceRetrieveParams.none(),
        ): HttpResponseFor<ClinicalReference> =
            retrieve(clinicalReferenceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ClinicalReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ClinicalReferenceRetrieveParams): HttpResponseFor<ClinicalReference> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            clinicalReferenceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> =
            retrieve(clinicalReferenceId, ClinicalReferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/autoScribe/clinicalReferences/{clinicalReferenceId}`, but is otherwise the same as
         * [ClinicalReferenceService.update].
         */
        @MustBeClosed
        fun update(clinicalReferenceId: String): HttpResponseFor<ClinicalReference> =
            update(clinicalReferenceId, ClinicalReferenceUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            clinicalReferenceId: String,
            params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference> =
            update(
                params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            clinicalReferenceId: String,
            params: ClinicalReferenceUpdateParams = ClinicalReferenceUpdateParams.none(),
        ): HttpResponseFor<ClinicalReference> =
            update(clinicalReferenceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ClinicalReferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference>

        /** @see update */
        @MustBeClosed
        fun update(params: ClinicalReferenceUpdateParams): HttpResponseFor<ClinicalReference> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            clinicalReferenceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> =
            update(clinicalReferenceId, ClinicalReferenceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/clinicalReferences`, but is otherwise
         * the same as [ClinicalReferenceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ClinicalReferenceListPage> =
            list(ClinicalReferenceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClinicalReferenceListParams = ClinicalReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReferenceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ClinicalReferenceListParams = ClinicalReferenceListParams.none()
        ): HttpResponseFor<ClinicalReferenceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ClinicalReferenceListPage> =
            list(ClinicalReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/autoScribe/clinicalReferences/{clinicalReferenceId}/delete`, but is otherwise the
         * same as [ClinicalReferenceService.delete].
         */
        @MustBeClosed
        fun delete(clinicalReferenceId: String): HttpResponseFor<ClinicalReference> =
            delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            clinicalReferenceId: String,
            params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference> =
            delete(
                params.toBuilder().clinicalReferenceId(clinicalReferenceId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            clinicalReferenceId: String,
            params: ClinicalReferenceDeleteParams = ClinicalReferenceDeleteParams.none(),
        ): HttpResponseFor<ClinicalReference> =
            delete(clinicalReferenceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ClinicalReferenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ClinicalReferenceDeleteParams): HttpResponseFor<ClinicalReference> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            clinicalReferenceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> =
            delete(clinicalReferenceId, ClinicalReferenceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/autoScribe/clinicalReferences/byExternalReferenceId/{externalReferenceId}`, but is
         * otherwise the same as [ClinicalReferenceService.retrieveByExternalReferenceId].
         */
        @MustBeClosed
        fun retrieveByExternalReferenceId(
            externalReferenceId: String
        ): HttpResponseFor<ClinicalReference> =
            retrieveByExternalReferenceId(
                externalReferenceId,
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
            )

        /** @see retrieveByExternalReferenceId */
        @MustBeClosed
        fun retrieveByExternalReferenceId(
            externalReferenceId: String,
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference> =
            retrieveByExternalReferenceId(
                params.toBuilder().externalReferenceId(externalReferenceId).build(),
                requestOptions,
            )

        /** @see retrieveByExternalReferenceId */
        @MustBeClosed
        fun retrieveByExternalReferenceId(
            externalReferenceId: String,
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams =
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
        ): HttpResponseFor<ClinicalReference> =
            retrieveByExternalReferenceId(externalReferenceId, params, RequestOptions.none())

        /** @see retrieveByExternalReferenceId */
        @MustBeClosed
        fun retrieveByExternalReferenceId(
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClinicalReference>

        /** @see retrieveByExternalReferenceId */
        @MustBeClosed
        fun retrieveByExternalReferenceId(
            params: ClinicalReferenceRetrieveByExternalReferenceIdParams
        ): HttpResponseFor<ClinicalReference> =
            retrieveByExternalReferenceId(params, RequestOptions.none())

        /** @see retrieveByExternalReferenceId */
        @MustBeClosed
        fun retrieveByExternalReferenceId(
            externalReferenceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClinicalReference> =
            retrieveByExternalReferenceId(
                externalReferenceId,
                ClinicalReferenceRetrieveByExternalReferenceIdParams.none(),
                requestOptions,
            )
    }
}
