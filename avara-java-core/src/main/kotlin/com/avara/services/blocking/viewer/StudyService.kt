// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.viewer

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.viewer.studies.StudyCancelParams
import com.avara.models.viewer.studies.StudyCancelResponse
import com.avara.models.viewer.studies.StudyCreateParams
import com.avara.models.viewer.studies.StudyCreateResponse
import com.avara.models.viewer.studies.StudyListPage
import com.avara.models.viewer.studies.StudyListParams
import com.avara.models.viewer.studies.StudyRerouteUrlParams
import com.avara.models.viewer.studies.StudyRerouteUrlResponse
import com.avara.models.viewer.studies.StudyRetrieveByUidParams
import com.avara.models.viewer.studies.StudyRetrieveByUidResponse
import com.avara.models.viewer.studies.StudyRetrieveParams
import com.avara.models.viewer.studies.StudyRetrieveResponse
import com.avara.models.viewer.studies.StudyUncancelParams
import com.avara.models.viewer.studies.StudyUncancelResponse
import com.avara.models.viewer.studies.StudyUpdateParams
import com.avara.models.viewer.studies.StudyUpdateResponse
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
     * Creates a new study in the Viewer system with the specified DICOM Study Instance UID and
     * metadata. The study can be optionally assigned to a user.
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
     * metadata and status information.
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
     * Updates a study's properties including description, severity, assignment, organization, and
     * metadata. All fields are optional - only provided fields will be updated.
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
     * description, cancellation status, and viewer status. Returns up to 100 studies per request.
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
     * Generates a tokenized URL that redirects users directly to the Avara Viewer for the specified
     * study. The URL includes authentication and is time-limited for security.
     */
    fun rerouteUrl(): StudyRerouteUrlResponse = rerouteUrl(StudyRerouteUrlParams.none())

    /** @see rerouteUrl */
    fun rerouteUrl(
        params: StudyRerouteUrlParams = StudyRerouteUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StudyRerouteUrlResponse

    /** @see rerouteUrl */
    fun rerouteUrl(
        params: StudyRerouteUrlParams = StudyRerouteUrlParams.none()
    ): StudyRerouteUrlResponse = rerouteUrl(params, RequestOptions.none())

    /** @see rerouteUrl */
    fun rerouteUrl(requestOptions: RequestOptions): StudyRerouteUrlResponse =
        rerouteUrl(StudyRerouteUrlParams.none(), requestOptions)

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

    /** A view of [StudyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StudyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/viewer/studies`, but is otherwise the same as
         * [StudyService.create].
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
         * Returns a raw HTTP response for `get /v1/viewer/studies/{studyId}`, but is otherwise the
         * same as [StudyService.retrieve].
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
         * Returns a raw HTTP response for `patch /v1/viewer/studies/{studyId}`, but is otherwise
         * the same as [StudyService.update].
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
         * Returns a raw HTTP response for `get /v1/viewer/studies`, but is otherwise the same as
         * [StudyService.list].
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
         * Returns a raw HTTP response for `post /v1/viewer/studies/cancel`, but is otherwise the
         * same as [StudyService.cancel].
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
         * Returns a raw HTTP response for `post /v1/viewer/studies/reroute-url`, but is otherwise
         * the same as [StudyService.rerouteUrl].
         */
        @MustBeClosed
        fun rerouteUrl(): HttpResponseFor<StudyRerouteUrlResponse> =
            rerouteUrl(StudyRerouteUrlParams.none())

        /** @see rerouteUrl */
        @MustBeClosed
        fun rerouteUrl(
            params: StudyRerouteUrlParams = StudyRerouteUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StudyRerouteUrlResponse>

        /** @see rerouteUrl */
        @MustBeClosed
        fun rerouteUrl(
            params: StudyRerouteUrlParams = StudyRerouteUrlParams.none()
        ): HttpResponseFor<StudyRerouteUrlResponse> = rerouteUrl(params, RequestOptions.none())

        /** @see rerouteUrl */
        @MustBeClosed
        fun rerouteUrl(requestOptions: RequestOptions): HttpResponseFor<StudyRerouteUrlResponse> =
            rerouteUrl(StudyRerouteUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/viewer/studies/by-uid/{studyInstanceUid}`, but
         * is otherwise the same as [StudyService.retrieveByUid].
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
         * Returns a raw HTTP response for `post /v1/viewer/studies/uncancel`, but is otherwise the
         * same as [StudyService.uncancel].
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
    }
}
