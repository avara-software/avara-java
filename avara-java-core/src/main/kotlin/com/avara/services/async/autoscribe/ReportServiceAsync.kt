// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.reports.ReportAddendumParams
import com.avara.models.autoscribe.reports.ReportAddendumResponse
import com.avara.models.autoscribe.reports.ReportCancelAddendumParams
import com.avara.models.autoscribe.reports.ReportCancelAddendumResponse
import com.avara.models.autoscribe.reports.ReportListParams
import com.avara.models.autoscribe.reports.ReportListResponse
import com.avara.models.autoscribe.reports.ReportPdfParams
import com.avara.models.autoscribe.reports.ReportPdfResponse
import com.avara.models.autoscribe.reports.ReportTextParams
import com.avara.models.autoscribe.reports.ReportTextResponse
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
     * Retrieves all reports (including versions and addendums) for a specific study. Must provide
     * either study ID or DICOM Study Instance UID. Returns report metadata including status,
     * version, and timestamps.
     */
    fun list(): CompletableFuture<ReportListResponse> = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportListResponse>

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none()
    ): CompletableFuture<ReportListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReportListResponse> =
        list(ReportListParams.none(), requestOptions)

    /**
     * Initiates the creation of an addendum to an existing completed report. The study status will
     * change to 'addendum_active' allowing the radiologist to dictate additional findings.
     */
    fun addendum(reportId: String): CompletableFuture<ReportAddendumResponse> =
        addendum(reportId, ReportAddendumParams.none())

    /** @see addendum */
    fun addendum(
        reportId: String,
        params: ReportAddendumParams = ReportAddendumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportAddendumResponse> =
        addendum(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see addendum */
    fun addendum(
        reportId: String,
        params: ReportAddendumParams = ReportAddendumParams.none(),
    ): CompletableFuture<ReportAddendumResponse> = addendum(reportId, params, RequestOptions.none())

    /** @see addendum */
    fun addendum(
        params: ReportAddendumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportAddendumResponse>

    /** @see addendum */
    fun addendum(params: ReportAddendumParams): CompletableFuture<ReportAddendumResponse> =
        addendum(params, RequestOptions.none())

    /** @see addendum */
    fun addendum(
        reportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportAddendumResponse> =
        addendum(reportId, ReportAddendumParams.none(), requestOptions)

    /**
     * Cancels an in-progress addendum and reverts the study status to 'completed'. The original
     * report remains unchanged. Only valid for active addendums.
     */
    fun cancelAddendum(reportId: String): CompletableFuture<ReportCancelAddendumResponse> =
        cancelAddendum(reportId, ReportCancelAddendumParams.none())

    /** @see cancelAddendum */
    fun cancelAddendum(
        reportId: String,
        params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCancelAddendumResponse> =
        cancelAddendum(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see cancelAddendum */
    fun cancelAddendum(
        reportId: String,
        params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
    ): CompletableFuture<ReportCancelAddendumResponse> =
        cancelAddendum(reportId, params, RequestOptions.none())

    /** @see cancelAddendum */
    fun cancelAddendum(
        params: ReportCancelAddendumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCancelAddendumResponse>

    /** @see cancelAddendum */
    fun cancelAddendum(
        params: ReportCancelAddendumParams
    ): CompletableFuture<ReportCancelAddendumResponse> =
        cancelAddendum(params, RequestOptions.none())

    /** @see cancelAddendum */
    fun cancelAddendum(
        reportId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportCancelAddendumResponse> =
        cancelAddendum(reportId, ReportCancelAddendumParams.none(), requestOptions)

    /**
     * Retrieves presigned URLs for accessing report PDFs. Can fetch a single report by report ID,
     * or all reports for a study by study ID/DICOM UID. URLs are time-limited for security.
     */
    fun pdf(): CompletableFuture<ReportPdfResponse> = pdf(ReportPdfParams.none())

    /** @see pdf */
    fun pdf(
        params: ReportPdfParams = ReportPdfParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportPdfResponse>

    /** @see pdf */
    fun pdf(
        params: ReportPdfParams = ReportPdfParams.none()
    ): CompletableFuture<ReportPdfResponse> = pdf(params, RequestOptions.none())

    /** @see pdf */
    fun pdf(requestOptions: RequestOptions): CompletableFuture<ReportPdfResponse> =
        pdf(ReportPdfParams.none(), requestOptions)

    /**
     * Retrieves the text content of a report. Can fetch a single report by report ID, or all
     * reports for a study by study ID/DICOM UID. Returns plain text report content.
     */
    fun text(): CompletableFuture<ReportTextResponse> = text(ReportTextParams.none())

    /** @see text */
    fun text(
        params: ReportTextParams = ReportTextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportTextResponse>

    /** @see text */
    fun text(
        params: ReportTextParams = ReportTextParams.none()
    ): CompletableFuture<ReportTextResponse> = text(params, RequestOptions.none())

    /** @see text */
    fun text(requestOptions: RequestOptions): CompletableFuture<ReportTextResponse> =
        text(ReportTextParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /v1/autoScribe/reports`, but is otherwise the same
         * as [ReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ReportListResponse>> =
            list(ReportListParams.none())

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportListResponse>>

        /** @see list */
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): CompletableFuture<HttpResponseFor<ReportListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportListResponse>> =
            list(ReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/reports/{reportId}/addendum`, but is
         * otherwise the same as [ReportServiceAsync.addendum].
         */
        fun addendum(reportId: String): CompletableFuture<HttpResponseFor<ReportAddendumResponse>> =
            addendum(reportId, ReportAddendumParams.none())

        /** @see addendum */
        fun addendum(
            reportId: String,
            params: ReportAddendumParams = ReportAddendumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportAddendumResponse>> =
            addendum(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see addendum */
        fun addendum(
            reportId: String,
            params: ReportAddendumParams = ReportAddendumParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportAddendumResponse>> =
            addendum(reportId, params, RequestOptions.none())

        /** @see addendum */
        fun addendum(
            params: ReportAddendumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportAddendumResponse>>

        /** @see addendum */
        fun addendum(
            params: ReportAddendumParams
        ): CompletableFuture<HttpResponseFor<ReportAddendumResponse>> =
            addendum(params, RequestOptions.none())

        /** @see addendum */
        fun addendum(
            reportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportAddendumResponse>> =
            addendum(reportId, ReportAddendumParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/reports/{reportId}/cancel-addendum`,
         * but is otherwise the same as [ReportServiceAsync.cancelAddendum].
         */
        fun cancelAddendum(
            reportId: String
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>> =
            cancelAddendum(reportId, ReportCancelAddendumParams.none())

        /** @see cancelAddendum */
        fun cancelAddendum(
            reportId: String,
            params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>> =
            cancelAddendum(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see cancelAddendum */
        fun cancelAddendum(
            reportId: String,
            params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>> =
            cancelAddendum(reportId, params, RequestOptions.none())

        /** @see cancelAddendum */
        fun cancelAddendum(
            params: ReportCancelAddendumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>>

        /** @see cancelAddendum */
        fun cancelAddendum(
            params: ReportCancelAddendumParams
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>> =
            cancelAddendum(params, RequestOptions.none())

        /** @see cancelAddendum */
        fun cancelAddendum(
            reportId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportCancelAddendumResponse>> =
            cancelAddendum(reportId, ReportCancelAddendumParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/reports/pdf`, but is otherwise the
         * same as [ReportServiceAsync.pdf].
         */
        fun pdf(): CompletableFuture<HttpResponseFor<ReportPdfResponse>> =
            pdf(ReportPdfParams.none())

        /** @see pdf */
        fun pdf(
            params: ReportPdfParams = ReportPdfParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportPdfResponse>>

        /** @see pdf */
        fun pdf(
            params: ReportPdfParams = ReportPdfParams.none()
        ): CompletableFuture<HttpResponseFor<ReportPdfResponse>> =
            pdf(params, RequestOptions.none())

        /** @see pdf */
        fun pdf(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportPdfResponse>> =
            pdf(ReportPdfParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/reports/text`, but is otherwise the
         * same as [ReportServiceAsync.text].
         */
        fun text(): CompletableFuture<HttpResponseFor<ReportTextResponse>> =
            text(ReportTextParams.none())

        /** @see text */
        fun text(
            params: ReportTextParams = ReportTextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportTextResponse>>

        /** @see text */
        fun text(
            params: ReportTextParams = ReportTextParams.none()
        ): CompletableFuture<HttpResponseFor<ReportTextResponse>> =
            text(params, RequestOptions.none())

        /** @see text */
        fun text(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportTextResponse>> =
            text(ReportTextParams.none(), requestOptions)
    }
}
