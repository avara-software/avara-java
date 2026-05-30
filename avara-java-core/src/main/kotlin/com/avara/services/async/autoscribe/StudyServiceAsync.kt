// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.studies.StudyCancelParams
import com.avara.models.autoscribe.studies.StudyCancelResponse
import com.avara.models.autoscribe.studies.StudyCreateParams
import com.avara.models.autoscribe.studies.StudyCreateResponse
import com.avara.models.autoscribe.studies.StudyListPageAsync
import com.avara.models.autoscribe.studies.StudyListParams
import com.avara.models.autoscribe.studies.StudyRerouteUrlParams
import com.avara.models.autoscribe.studies.StudyRerouteUrlResponse
import com.avara.models.autoscribe.studies.StudyRetrieveByUidParams
import com.avara.models.autoscribe.studies.StudyRetrieveByUidResponse
import com.avara.models.autoscribe.studies.StudyRetrieveParams
import com.avara.models.autoscribe.studies.StudyRetrieveResponse
import com.avara.models.autoscribe.studies.StudyUncancelParams
import com.avara.models.autoscribe.studies.StudyUncancelResponse
import com.avara.models.autoscribe.studies.StudyUpdateParams
import com.avara.models.autoscribe.studies.StudyUpdateResponse
import com.avara.models.autoscribe.studies.StudyViewerOnlyRerouteUrlParams
import com.avara.models.autoscribe.studies.StudyViewerOnlyRerouteUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StudyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyServiceAsync

    /**
     * Creates a new study in the AutoScribe system with DICOM metadata and report generation
     * information. The study can include patient demographics, scan details, clinical context
     * (indication, history, technologist technique/notes), an imaging modality, an external patient
     * identifier for linking studies, and external prior reports for comparison context.
     */
    fun create(params: StudyCreateParams): CompletableFuture<StudyCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StudyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyCreateResponse>

    /**
     * Retrieves a single study by its unique study ID. Returns the complete study object with all
     * metadata, report status, and patient information.
     */
    fun retrieve(studyId: String): CompletableFuture<StudyRetrieveResponse> =
        retrieve(studyId, StudyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        studyId: String,
        params: StudyRetrieveParams = StudyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyRetrieveResponse> =
        retrieve(params.toBuilder().studyId(studyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        studyId: String,
        params: StudyRetrieveParams = StudyRetrieveParams.none(),
    ): CompletableFuture<StudyRetrieveResponse> = retrieve(studyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StudyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: StudyRetrieveParams): CompletableFuture<StudyRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        studyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRetrieveResponse> =
        retrieve(studyId, StudyRetrieveParams.none(), requestOptions)

    /**
     * Updates a study's properties including description, severity, assignment, organization,
     * metadata, and report metadata. All fields are optional - only provided fields will be
     * updated.
     */
    fun update(studyId: String): CompletableFuture<StudyUpdateResponse> =
        update(studyId, StudyUpdateParams.none())

    /** @see update */
    fun update(
        studyId: String,
        params: StudyUpdateParams = StudyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyUpdateResponse> =
        update(params.toBuilder().studyId(studyId).build(), requestOptions)

    /** @see update */
    fun update(
        studyId: String,
        params: StudyUpdateParams = StudyUpdateParams.none(),
    ): CompletableFuture<StudyUpdateResponse> = update(studyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StudyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyUpdateResponse>

    /** @see update */
    fun update(params: StudyUpdateParams): CompletableFuture<StudyUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        studyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyUpdateResponse> =
        update(studyId, StudyUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of studies with optional filtering by assignment, severity,
     * description, cancellation status, and report status. Returns up to 100 studies per request.
     */
    fun list(): CompletableFuture<StudyListPageAsync> = list(StudyListParams.none())

    /** @see list */
    fun list(
        params: StudyListParams = StudyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyListPageAsync>

    /** @see list */
    fun list(
        params: StudyListParams = StudyListParams.none()
    ): CompletableFuture<StudyListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<StudyListPageAsync> =
        list(StudyListParams.none(), requestOptions)

    /**
     * Marks a study as cancelled. Cancelled studies are preserved but flagged as inactive. Can be
     * identified by either study ID or DICOM Study Instance UID.
     */
    fun cancel(): CompletableFuture<StudyCancelResponse> = cancel(StudyCancelParams.none())

    /** @see cancel */
    fun cancel(
        params: StudyCancelParams = StudyCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyCancelResponse>

    /** @see cancel */
    fun cancel(
        params: StudyCancelParams = StudyCancelParams.none()
    ): CompletableFuture<StudyCancelResponse> = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(requestOptions: RequestOptions): CompletableFuture<StudyCancelResponse> =
        cancel(StudyCancelParams.none(), requestOptions)

    /**
     * Generates a tokenized URL that redirects users to the AutoScribe interface (viewer +
     * dictation) for the specified study and user. The URL includes authentication and is
     * time-limited for security.
     */
    fun rerouteUrl(params: StudyRerouteUrlParams): CompletableFuture<StudyRerouteUrlResponse> =
        rerouteUrl(params, RequestOptions.none())

    /** @see rerouteUrl */
    fun rerouteUrl(
        params: StudyRerouteUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyRerouteUrlResponse>

    /**
     * Retrieves a single study by its DICOM Study Instance UID. This is useful when you have the
     * DICOM UID but not the Avara study ID.
     */
    fun retrieveByUid(studyInstanceUid: String): CompletableFuture<StudyRetrieveByUidResponse> =
        retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none())

    /** @see retrieveByUid */
    fun retrieveByUid(
        studyInstanceUid: String,
        params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyRetrieveByUidResponse> =
        retrieveByUid(params.toBuilder().studyInstanceUid(studyInstanceUid).build(), requestOptions)

    /** @see retrieveByUid */
    fun retrieveByUid(
        studyInstanceUid: String,
        params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
    ): CompletableFuture<StudyRetrieveByUidResponse> =
        retrieveByUid(studyInstanceUid, params, RequestOptions.none())

    /** @see retrieveByUid */
    fun retrieveByUid(
        params: StudyRetrieveByUidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyRetrieveByUidResponse>

    /** @see retrieveByUid */
    fun retrieveByUid(
        params: StudyRetrieveByUidParams
    ): CompletableFuture<StudyRetrieveByUidResponse> = retrieveByUid(params, RequestOptions.none())

    /** @see retrieveByUid */
    fun retrieveByUid(
        studyInstanceUid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StudyRetrieveByUidResponse> =
        retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none(), requestOptions)

    /**
     * Restores a cancelled study to active status. The study must have been previously cancelled.
     * Can be identified by either study ID or DICOM Study Instance UID.
     */
    fun uncancel(): CompletableFuture<StudyUncancelResponse> = uncancel(StudyUncancelParams.none())

    /** @see uncancel */
    fun uncancel(
        params: StudyUncancelParams = StudyUncancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyUncancelResponse>

    /** @see uncancel */
    fun uncancel(
        params: StudyUncancelParams = StudyUncancelParams.none()
    ): CompletableFuture<StudyUncancelResponse> = uncancel(params, RequestOptions.none())

    /** @see uncancel */
    fun uncancel(requestOptions: RequestOptions): CompletableFuture<StudyUncancelResponse> =
        uncancel(StudyUncancelParams.none(), requestOptions)

    /**
     * Generates a tokenized URL that redirects users to the viewer interface only (no dictation)
     * for the specified study. Useful for read-only access or referring physicians. The URL
     * includes authentication and is time-limited.
     */
    fun viewerOnlyRerouteUrl(): CompletableFuture<StudyViewerOnlyRerouteUrlResponse> =
        viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none())

    /** @see viewerOnlyRerouteUrl */
    fun viewerOnlyRerouteUrl(
        params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StudyViewerOnlyRerouteUrlResponse>

    /** @see viewerOnlyRerouteUrl */
    fun viewerOnlyRerouteUrl(
        params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none()
    ): CompletableFuture<StudyViewerOnlyRerouteUrlResponse> =
        viewerOnlyRerouteUrl(params, RequestOptions.none())

    /** @see viewerOnlyRerouteUrl */
    fun viewerOnlyRerouteUrl(
        requestOptions: RequestOptions
    ): CompletableFuture<StudyViewerOnlyRerouteUrlResponse> =
        viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none(), requestOptions)

    /** A view of [StudyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StudyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies`, but is otherwise the same
         * as [StudyServiceAsync.create].
         */
        fun create(
            params: StudyCreateParams
        ): CompletableFuture<HttpResponseFor<StudyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StudyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies/{studyId}`, but is otherwise
         * the same as [StudyServiceAsync.retrieve].
         */
        fun retrieve(studyId: String): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>> =
            retrieve(studyId, StudyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            studyId: String,
            params: StudyRetrieveParams = StudyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>> =
            retrieve(params.toBuilder().studyId(studyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            studyId: String,
            params: StudyRetrieveParams = StudyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>> =
            retrieve(studyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StudyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StudyRetrieveParams
        ): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            studyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyRetrieveResponse>> =
            retrieve(studyId, StudyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/autoScribe/studies/{studyId}`, but is
         * otherwise the same as [StudyServiceAsync.update].
         */
        fun update(studyId: String): CompletableFuture<HttpResponseFor<StudyUpdateResponse>> =
            update(studyId, StudyUpdateParams.none())

        /** @see update */
        fun update(
            studyId: String,
            params: StudyUpdateParams = StudyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyUpdateResponse>> =
            update(params.toBuilder().studyId(studyId).build(), requestOptions)

        /** @see update */
        fun update(
            studyId: String,
            params: StudyUpdateParams = StudyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<StudyUpdateResponse>> =
            update(studyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StudyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyUpdateResponse>>

        /** @see update */
        fun update(
            params: StudyUpdateParams
        ): CompletableFuture<HttpResponseFor<StudyUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            studyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyUpdateResponse>> =
            update(studyId, StudyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies`, but is otherwise the same
         * as [StudyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StudyListPageAsync>> =
            list(StudyListParams.none())

        /** @see list */
        fun list(
            params: StudyListParams = StudyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyListPageAsync>>

        /** @see list */
        fun list(
            params: StudyListParams = StudyListParams.none()
        ): CompletableFuture<HttpResponseFor<StudyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StudyListPageAsync>> =
            list(StudyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/cancel`, but is otherwise
         * the same as [StudyServiceAsync.cancel].
         */
        fun cancel(): CompletableFuture<HttpResponseFor<StudyCancelResponse>> =
            cancel(StudyCancelParams.none())

        /** @see cancel */
        fun cancel(
            params: StudyCancelParams = StudyCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: StudyCancelParams = StudyCancelParams.none()
        ): CompletableFuture<HttpResponseFor<StudyCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StudyCancelResponse>> =
            cancel(StudyCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/reroute-url`, but is
         * otherwise the same as [StudyServiceAsync.rerouteUrl].
         */
        fun rerouteUrl(
            params: StudyRerouteUrlParams
        ): CompletableFuture<HttpResponseFor<StudyRerouteUrlResponse>> =
            rerouteUrl(params, RequestOptions.none())

        /** @see rerouteUrl */
        fun rerouteUrl(
            params: StudyRerouteUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyRerouteUrlResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies/by-uid/{studyInstanceUid}`,
         * but is otherwise the same as [StudyServiceAsync.retrieveByUid].
         */
        fun retrieveByUid(
            studyInstanceUid: String
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>> =
            retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none())

        /** @see retrieveByUid */
        fun retrieveByUid(
            studyInstanceUid: String,
            params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>> =
            retrieveByUid(
                params.toBuilder().studyInstanceUid(studyInstanceUid).build(),
                requestOptions,
            )

        /** @see retrieveByUid */
        fun retrieveByUid(
            studyInstanceUid: String,
            params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>> =
            retrieveByUid(studyInstanceUid, params, RequestOptions.none())

        /** @see retrieveByUid */
        fun retrieveByUid(
            params: StudyRetrieveByUidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>>

        /** @see retrieveByUid */
        fun retrieveByUid(
            params: StudyRetrieveByUidParams
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>> =
            retrieveByUid(params, RequestOptions.none())

        /** @see retrieveByUid */
        fun retrieveByUid(
            studyInstanceUid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StudyRetrieveByUidResponse>> =
            retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/uncancel`, but is otherwise
         * the same as [StudyServiceAsync.uncancel].
         */
        fun uncancel(): CompletableFuture<HttpResponseFor<StudyUncancelResponse>> =
            uncancel(StudyUncancelParams.none())

        /** @see uncancel */
        fun uncancel(
            params: StudyUncancelParams = StudyUncancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyUncancelResponse>>

        /** @see uncancel */
        fun uncancel(
            params: StudyUncancelParams = StudyUncancelParams.none()
        ): CompletableFuture<HttpResponseFor<StudyUncancelResponse>> =
            uncancel(params, RequestOptions.none())

        /** @see uncancel */
        fun uncancel(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StudyUncancelResponse>> =
            uncancel(StudyUncancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/viewer-only-reroute-url`,
         * but is otherwise the same as [StudyServiceAsync.viewerOnlyRerouteUrl].
         */
        fun viewerOnlyRerouteUrl():
            CompletableFuture<HttpResponseFor<StudyViewerOnlyRerouteUrlResponse>> =
            viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none())

        /** @see viewerOnlyRerouteUrl */
        fun viewerOnlyRerouteUrl(
            params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StudyViewerOnlyRerouteUrlResponse>>

        /** @see viewerOnlyRerouteUrl */
        fun viewerOnlyRerouteUrl(
            params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none()
        ): CompletableFuture<HttpResponseFor<StudyViewerOnlyRerouteUrlResponse>> =
            viewerOnlyRerouteUrl(params, RequestOptions.none())

        /** @see viewerOnlyRerouteUrl */
        fun viewerOnlyRerouteUrl(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StudyViewerOnlyRerouteUrlResponse>> =
            viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none(), requestOptions)
    }
}
