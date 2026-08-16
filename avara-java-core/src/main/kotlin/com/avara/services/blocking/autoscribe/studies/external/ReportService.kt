// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe.studies.external

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.studies.external.reports.ReportCreateParams
import com.avara.models.autoscribe.studies.external.reports.ReportCreateResponse
import com.avara.models.autoscribe.studies.external.reports.ReportListPage
import com.avara.models.autoscribe.studies.external.reports.ReportListParams
import com.avara.models.autoscribe.studies.external.reports.ReportRetrieveParams
import com.avara.models.autoscribe.studies.external.reports.ReportRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService

    /**
     * Attach or fill missing report fields on an existing external study. Text and file are
     * write-once. readerName and signedAt overwrite when provided.
     */
    fun create(): ReportCreateResponse = create(ReportCreateParams.none())

    /** @see create */
    fun create(
        params: ReportCreateParams = ReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreateResponse

    /** @see create */
    fun create(params: ReportCreateParams = ReportCreateParams.none()): ReportCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ReportCreateResponse =
        create(ReportCreateParams.none(), requestOptions)

    /**
     * Returns snapshot metadata plus report text and/or a short-lived download URL. Text is what AI
     * priors use; the file is reader-only and is not used for AI.
     */
    fun retrieve(externalReportId: String): ReportRetrieveResponse =
        retrieve(externalReportId, ReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        externalReportId: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportRetrieveResponse =
        retrieve(params.toBuilder().externalReportId(externalReportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        externalReportId: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
    ): ReportRetrieveResponse = retrieve(externalReportId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ReportRetrieveParams): ReportRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(externalReportId: String, requestOptions: RequestOptions): ReportRetrieveResponse =
        retrieve(externalReportId, ReportRetrieveParams.none(), requestOptions)

    /** Cursor-paginated list of external reports. List items omit report text and download URLs. */
    fun list(): ReportListPage = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportListPage

    /** @see list */
    fun list(params: ReportListParams = ReportListParams.none()): ReportListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ReportListPage =
        list(ReportListParams.none(), requestOptions)

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/external/reports`, but is
         * otherwise the same as [ReportService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ReportCreateResponse> = create(ReportCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ReportCreateParams = ReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ReportCreateParams = ReportCreateParams.none()
        ): HttpResponseFor<ReportCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ReportCreateResponse> =
            create(ReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/autoScribe/studies/external/reports/{externalReportId}`, but is otherwise the same as
         * [ReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(externalReportId: String): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(externalReportId, ReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalReportId: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(params.toBuilder().externalReportId(externalReportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalReportId: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
        ): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(externalReportId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ReportRetrieveParams): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalReportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportRetrieveResponse> =
            retrieve(externalReportId, ReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies/external/reports`, but is
         * otherwise the same as [ReportService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ReportListPage> = list(ReportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): HttpResponseFor<ReportListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ReportListPage> =
            list(ReportListParams.none(), requestOptions)
    }
}
