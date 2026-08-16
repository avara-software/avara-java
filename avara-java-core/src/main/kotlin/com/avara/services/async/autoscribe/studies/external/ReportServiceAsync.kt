// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe.studies.external

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.studies.external.reports.ReportCreateParams
import com.avara.models.autoscribe.studies.external.reports.ReportCreateResponse
import com.avara.models.autoscribe.studies.external.reports.ReportListPageAsync
import com.avara.models.autoscribe.studies.external.reports.ReportListParams
import com.avara.models.autoscribe.studies.external.reports.ReportRetrieveParams
import com.avara.models.autoscribe.studies.external.reports.ReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync

    /**
     * Attach or fill missing report fields on an existing external study. Text and file are
     * write-once. readerName and signedAt overwrite when provided.
     */
    fun create(): CompletableFuture<ReportCreateResponse> = create(ReportCreateParams.none())

    /** @see create */
    fun create(
        params: ReportCreateParams = ReportCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreateResponse>

    /** @see create */
    fun create(
        params: ReportCreateParams = ReportCreateParams.none()
    ): CompletableFuture<ReportCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ReportCreateResponse> =
        create(ReportCreateParams.none(), requestOptions)

    /**
     * Returns snapshot metadata plus report text and/or a short-lived download URL. Text is what AI
     * priors use; the file is reader-only and is not used for AI.
     */
    fun retrieve(externalReportId: String): CompletableFuture<ReportRetrieveResponse> =
        retrieve(externalReportId, ReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        externalReportId: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportRetrieveResponse> =
        retrieve(params.toBuilder().externalReportId(externalReportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        externalReportId: String,
        params: ReportRetrieveParams = ReportRetrieveParams.none(),
    ): CompletableFuture<ReportRetrieveResponse> =
        retrieve(externalReportId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ReportRetrieveParams): CompletableFuture<ReportRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        externalReportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportRetrieveResponse> =
        retrieve(externalReportId, ReportRetrieveParams.none(), requestOptions)

    /** Cursor-paginated list of external reports. List items omit report text and download URLs. */
    fun list(): CompletableFuture<ReportListPageAsync> = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListPageAsync>

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none()
    ): CompletableFuture<ReportListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReportListPageAsync> =
        list(ReportListParams.none(), requestOptions)

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/external/reports`, but is
         * otherwise the same as [ReportServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ReportCreateResponse>> =
            create(ReportCreateParams.none())

        /** @see create */
        fun create(
            params: ReportCreateParams = ReportCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreateResponse>>

        /** @see create */
        fun create(
            params: ReportCreateParams = ReportCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportCreateResponse>> =
            create(ReportCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/autoScribe/studies/external/reports/{externalReportId}`, but is otherwise the same as
         * [ReportServiceAsync.retrieve].
         */
        fun retrieve(
            externalReportId: String
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(externalReportId, ReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            externalReportId: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(params.toBuilder().externalReportId(externalReportId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            externalReportId: String,
            params: ReportRetrieveParams = ReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(externalReportId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            externalReportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportRetrieveResponse>> =
            retrieve(externalReportId, ReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/studies/external/reports`, but is
         * otherwise the same as [ReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ReportListPageAsync>> =
            list(ReportListParams.none())

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListPageAsync>>

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListPageAsync>> =
            list(ReportListParams.none(), requestOptions)
    }
}
