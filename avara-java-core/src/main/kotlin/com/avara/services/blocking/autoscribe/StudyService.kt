// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.studies.StudyCancelParams
import com.avara.models.autoscribe.studies.StudyCancelResponse
import com.avara.models.autoscribe.studies.StudyCreateParams
import com.avara.models.autoscribe.studies.StudyCreateResponse
import com.avara.models.autoscribe.studies.StudyListPage
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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface StudyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyService

    /**
     * Creates a new study in the AutoScribe system with DICOM metadata and report generation
     * information. The study can include patient demographics, scan details, and references to
     * prior studies/reports for context.
     */
    fun create(params: StudyCreateParams): StudyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StudyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyCreateResponse

    /**
     * Retrieves a single study by its unique study ID. Returns the complete study object with all
     * metadata, report status, and patient information.
     */
    fun retrieve(studyId: String): StudyRetrieveResponse =
        retrieve(studyId, StudyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        studyId: String,
        params: StudyRetrieveParams = StudyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyRetrieveResponse = retrieve(params.toBuilder().studyId(studyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        studyId: String,
        params: StudyRetrieveParams = StudyRetrieveParams.none(),
    ): StudyRetrieveResponse = retrieve(studyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StudyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: StudyRetrieveParams): StudyRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(studyId: String, requestOptions: RequestOptions): StudyRetrieveResponse =
        retrieve(studyId, StudyRetrieveParams.none(), requestOptions)

    /**
     * Updates a study's properties including description, severity, assignment, organization,
     * metadata, and report metadata. All fields are optional - only provided fields will be
     * updated.
     */
    fun update(studyId: String): StudyUpdateResponse = update(studyId, StudyUpdateParams.none())

    /** @see update */
    fun update(
        studyId: String,
        params: StudyUpdateParams = StudyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyUpdateResponse = update(params.toBuilder().studyId(studyId).build(), requestOptions)

    /** @see update */
    fun update(
        studyId: String,
        params: StudyUpdateParams = StudyUpdateParams.none(),
    ): StudyUpdateResponse = update(studyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StudyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyUpdateResponse

    /** @see update */
    fun update(params: StudyUpdateParams): StudyUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(studyId: String, requestOptions: RequestOptions): StudyUpdateResponse =
        update(studyId, StudyUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of studies with optional filtering by assignment, severity,
     * description, cancellation status, and report status. Returns up to 100 studies per request.
     */
    fun list(): StudyListPage = list(StudyListParams.none())

    /** @see list */
    fun list(
        params: StudyListParams = StudyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyListPage

    /** @see list */
    fun list(params: StudyListParams = StudyListParams.none()): StudyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): StudyListPage =
        list(StudyListParams.none(), requestOptions)

    /**
     * Marks a study as cancelled. Cancelled studies are preserved but flagged as inactive. Can be
     * identified by either study ID or DICOM Study Instance UID.
     */
    fun cancel(): StudyCancelResponse = cancel(StudyCancelParams.none())

    /** @see cancel */
    fun cancel(
        params: StudyCancelParams = StudyCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyCancelResponse

    /** @see cancel */
    fun cancel(params: StudyCancelParams = StudyCancelParams.none()): StudyCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(requestOptions: RequestOptions): StudyCancelResponse =
        cancel(StudyCancelParams.none(), requestOptions)

    /**
     * Generates a tokenized URL that redirects users to the AutoScribe interface (viewer +
     * dictation) for the specified study and user. The URL includes authentication and is
     * time-limited for security.
     */
    fun rerouteUrl(params: StudyRerouteUrlParams): StudyRerouteUrlResponse =
        rerouteUrl(params, RequestOptions.none())

    /** @see rerouteUrl */
    fun rerouteUrl(
        params: StudyRerouteUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyRerouteUrlResponse

    /**
     * Retrieves a single study by its DICOM Study Instance UID. This is useful when you have the
     * DICOM UID but not the Avara study ID.
     */
    fun retrieveByUid(studyInstanceUid: String): StudyRetrieveByUidResponse =
        retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none())

    /** @see retrieveByUid */
    fun retrieveByUid(
        studyInstanceUid: String,
        params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyRetrieveByUidResponse =
        retrieveByUid(params.toBuilder().studyInstanceUid(studyInstanceUid).build(), requestOptions)

    /** @see retrieveByUid */
    fun retrieveByUid(
        studyInstanceUid: String,
        params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
    ): StudyRetrieveByUidResponse = retrieveByUid(studyInstanceUid, params, RequestOptions.none())

    /** @see retrieveByUid */
    fun retrieveByUid(
        params: StudyRetrieveByUidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyRetrieveByUidResponse

    /** @see retrieveByUid */
    fun retrieveByUid(params: StudyRetrieveByUidParams): StudyRetrieveByUidResponse =
        retrieveByUid(params, RequestOptions.none())

    /** @see retrieveByUid */
    fun retrieveByUid(
        studyInstanceUid: String,
        requestOptions: RequestOptions,
    ): StudyRetrieveByUidResponse =
        retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none(), requestOptions)

    /**
     * Restores a cancelled study to active status. The study must have been previously cancelled.
     * Can be identified by either study ID or DICOM Study Instance UID.
     */
    fun uncancel(): StudyUncancelResponse = uncancel(StudyUncancelParams.none())

    /** @see uncancel */
    fun uncancel(
        params: StudyUncancelParams = StudyUncancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyUncancelResponse

    /** @see uncancel */
    fun uncancel(params: StudyUncancelParams = StudyUncancelParams.none()): StudyUncancelResponse =
        uncancel(params, RequestOptions.none())

    /** @see uncancel */
    fun uncancel(requestOptions: RequestOptions): StudyUncancelResponse =
        uncancel(StudyUncancelParams.none(), requestOptions)

    /**
     * Generates a tokenized URL that redirects users to the viewer interface only (no dictation)
     * for the specified study. Useful for read-only access or referring physicians. The URL
     * includes authentication and is time-limited.
     */
    fun viewerOnlyRerouteUrl(): StudyViewerOnlyRerouteUrlResponse =
        viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none())

    /** @see viewerOnlyRerouteUrl */
    fun viewerOnlyRerouteUrl(
        params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyViewerOnlyRerouteUrlResponse

    /** @see viewerOnlyRerouteUrl */
    fun viewerOnlyRerouteUrl(
        params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none()
    ): StudyViewerOnlyRerouteUrlResponse = viewerOnlyRerouteUrl(params, RequestOptions.none())

    /** @see viewerOnlyRerouteUrl */
    fun viewerOnlyRerouteUrl(requestOptions: RequestOptions): StudyViewerOnlyRerouteUrlResponse =
        viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none(), requestOptions)

    /** A view of [StudyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies`, but is otherwise the same
         * as [StudyService.create].
         */
        @MustBeClosed
        fun create(params: StudyCreateParams): HttpResponseFor<StudyCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: StudyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies/{studyId}`, but is otherwise
         * the same as [StudyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(studyId: String): HttpResponseFor<StudyRetrieveResponse> =
            retrieve(studyId, StudyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            studyId: String,
            params: StudyRetrieveParams = StudyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyRetrieveResponse> =
            retrieve(params.toBuilder().studyId(studyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            studyId: String,
            params: StudyRetrieveParams = StudyRetrieveParams.none(),
        ): HttpResponseFor<StudyRetrieveResponse> = retrieve(studyId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StudyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: StudyRetrieveParams): HttpResponseFor<StudyRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            studyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyRetrieveResponse> =
            retrieve(studyId, StudyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/autoScribe/studies/{studyId}`, but is
         * otherwise the same as [StudyService.update].
         */
        @MustBeClosed
        fun update(studyId: String): HttpResponseFor<StudyUpdateResponse> =
            update(studyId, StudyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            studyId: String,
            params: StudyUpdateParams = StudyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyUpdateResponse> =
            update(params.toBuilder().studyId(studyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            studyId: String,
            params: StudyUpdateParams = StudyUpdateParams.none(),
        ): HttpResponseFor<StudyUpdateResponse> = update(studyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: StudyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: StudyUpdateParams): HttpResponseFor<StudyUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            studyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyUpdateResponse> =
            update(studyId, StudyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies`, but is otherwise the same
         * as [StudyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<StudyListPage> = list(StudyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: StudyListParams = StudyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: StudyListParams = StudyListParams.none()): HttpResponseFor<StudyListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StudyListPage> =
            list(StudyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/cancel`, but is otherwise
         * the same as [StudyService.cancel].
         */
        @MustBeClosed
        fun cancel(): HttpResponseFor<StudyCancelResponse> = cancel(StudyCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: StudyCancelParams = StudyCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: StudyCancelParams = StudyCancelParams.none()
        ): HttpResponseFor<StudyCancelResponse> = cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(requestOptions: RequestOptions): HttpResponseFor<StudyCancelResponse> =
            cancel(StudyCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/reroute-url`, but is
         * otherwise the same as [StudyService.rerouteUrl].
         */
        @MustBeClosed
        fun rerouteUrl(params: StudyRerouteUrlParams): HttpResponseFor<StudyRerouteUrlResponse> =
            rerouteUrl(params, RequestOptions.none())

        /** @see rerouteUrl */
        @MustBeClosed
        fun rerouteUrl(
            params: StudyRerouteUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyRerouteUrlResponse>

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies/by-uid/{studyInstanceUid}`,
         * but is otherwise the same as [StudyService.retrieveByUid].
         */
        @MustBeClosed
        fun retrieveByUid(studyInstanceUid: String): HttpResponseFor<StudyRetrieveByUidResponse> =
            retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none())

        /** @see retrieveByUid */
        @MustBeClosed
        fun retrieveByUid(
            studyInstanceUid: String,
            params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyRetrieveByUidResponse> =
            retrieveByUid(
                params.toBuilder().studyInstanceUid(studyInstanceUid).build(),
                requestOptions,
            )

        /** @see retrieveByUid */
        @MustBeClosed
        fun retrieveByUid(
            studyInstanceUid: String,
            params: StudyRetrieveByUidParams = StudyRetrieveByUidParams.none(),
        ): HttpResponseFor<StudyRetrieveByUidResponse> =
            retrieveByUid(studyInstanceUid, params, RequestOptions.none())

        /** @see retrieveByUid */
        @MustBeClosed
        fun retrieveByUid(
            params: StudyRetrieveByUidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyRetrieveByUidResponse>

        /** @see retrieveByUid */
        @MustBeClosed
        fun retrieveByUid(
            params: StudyRetrieveByUidParams
        ): HttpResponseFor<StudyRetrieveByUidResponse> =
            retrieveByUid(params, RequestOptions.none())

        /** @see retrieveByUid */
        @MustBeClosed
        fun retrieveByUid(
            studyInstanceUid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StudyRetrieveByUidResponse> =
            retrieveByUid(studyInstanceUid, StudyRetrieveByUidParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/uncancel`, but is otherwise
         * the same as [StudyService.uncancel].
         */
        @MustBeClosed
        fun uncancel(): HttpResponseFor<StudyUncancelResponse> =
            uncancel(StudyUncancelParams.none())

        /** @see uncancel */
        @MustBeClosed
        fun uncancel(
            params: StudyUncancelParams = StudyUncancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyUncancelResponse>

        /** @see uncancel */
        @MustBeClosed
        fun uncancel(
            params: StudyUncancelParams = StudyUncancelParams.none()
        ): HttpResponseFor<StudyUncancelResponse> = uncancel(params, RequestOptions.none())

        /** @see uncancel */
        @MustBeClosed
        fun uncancel(requestOptions: RequestOptions): HttpResponseFor<StudyUncancelResponse> =
            uncancel(StudyUncancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/viewer-only-reroute-url`,
         * but is otherwise the same as [StudyService.viewerOnlyRerouteUrl].
         */
        @MustBeClosed
        fun viewerOnlyRerouteUrl(): HttpResponseFor<StudyViewerOnlyRerouteUrlResponse> =
            viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none())

        /** @see viewerOnlyRerouteUrl */
        @MustBeClosed
        fun viewerOnlyRerouteUrl(
            params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyViewerOnlyRerouteUrlResponse>

        /** @see viewerOnlyRerouteUrl */
        @MustBeClosed
        fun viewerOnlyRerouteUrl(
            params: StudyViewerOnlyRerouteUrlParams = StudyViewerOnlyRerouteUrlParams.none()
        ): HttpResponseFor<StudyViewerOnlyRerouteUrlResponse> =
            viewerOnlyRerouteUrl(params, RequestOptions.none())

        /** @see viewerOnlyRerouteUrl */
        @MustBeClosed
        fun viewerOnlyRerouteUrl(
            requestOptions: RequestOptions
        ): HttpResponseFor<StudyViewerOnlyRerouteUrlResponse> =
            viewerOnlyRerouteUrl(StudyViewerOnlyRerouteUrlParams.none(), requestOptions)
    }
}
