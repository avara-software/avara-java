// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe

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
     * Retrieves all reports (including versions and addendums) for a specific study. Must provide
     * either study ID or DICOM Study Instance UID. Returns report metadata including status,
     * version, and timestamps.
     */
    fun list(): ReportListResponse = list(ReportListParams.none())

    /** @see list */
    fun list(
        params: ReportListParams = ReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportListResponse

    /** @see list */
    fun list(params: ReportListParams = ReportListParams.none()): ReportListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ReportListResponse =
        list(ReportListParams.none(), requestOptions)

    /**
     * Initiates the creation of an addendum to an existing completed report. The study status will
     * change to 'addendum_active' allowing the radiologist to dictate additional findings.
     */
    fun addendum(reportId: String): ReportAddendumResponse =
        addendum(reportId, ReportAddendumParams.none())

    /** @see addendum */
    fun addendum(
        reportId: String,
        params: ReportAddendumParams = ReportAddendumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportAddendumResponse =
        addendum(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see addendum */
    fun addendum(
        reportId: String,
        params: ReportAddendumParams = ReportAddendumParams.none(),
    ): ReportAddendumResponse = addendum(reportId, params, RequestOptions.none())

    /** @see addendum */
    fun addendum(
        params: ReportAddendumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportAddendumResponse

    /** @see addendum */
    fun addendum(params: ReportAddendumParams): ReportAddendumResponse =
        addendum(params, RequestOptions.none())

    /** @see addendum */
    fun addendum(reportId: String, requestOptions: RequestOptions): ReportAddendumResponse =
        addendum(reportId, ReportAddendumParams.none(), requestOptions)

    /**
     * Cancels an in-progress addendum and reverts the study status to 'completed'. The original
     * report remains unchanged. Only valid for active addendums.
     */
    fun cancelAddendum(reportId: String): ReportCancelAddendumResponse =
        cancelAddendum(reportId, ReportCancelAddendumParams.none())

    /** @see cancelAddendum */
    fun cancelAddendum(
        reportId: String,
        params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCancelAddendumResponse =
        cancelAddendum(params.toBuilder().reportId(reportId).build(), requestOptions)

    /** @see cancelAddendum */
    fun cancelAddendum(
        reportId: String,
        params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
    ): ReportCancelAddendumResponse = cancelAddendum(reportId, params, RequestOptions.none())

    /** @see cancelAddendum */
    fun cancelAddendum(
        params: ReportCancelAddendumParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCancelAddendumResponse

    /** @see cancelAddendum */
    fun cancelAddendum(params: ReportCancelAddendumParams): ReportCancelAddendumResponse =
        cancelAddendum(params, RequestOptions.none())

    /** @see cancelAddendum */
    fun cancelAddendum(
        reportId: String,
        requestOptions: RequestOptions,
    ): ReportCancelAddendumResponse =
        cancelAddendum(reportId, ReportCancelAddendumParams.none(), requestOptions)

    /**
     * Retrieves presigned URLs for accessing report PDFs. Can fetch a single report by report ID,
     * or all reports for a study by study ID/DICOM UID. URLs are time-limited for security.
     */
    fun pdf(): ReportPdfResponse = pdf(ReportPdfParams.none())

    /** @see pdf */
    fun pdf(
        params: ReportPdfParams = ReportPdfParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportPdfResponse

    /** @see pdf */
    fun pdf(params: ReportPdfParams = ReportPdfParams.none()): ReportPdfResponse =
        pdf(params, RequestOptions.none())

    /** @see pdf */
    fun pdf(requestOptions: RequestOptions): ReportPdfResponse =
        pdf(ReportPdfParams.none(), requestOptions)

    /**
     * Retrieves the text content of a report. Can fetch a single report by report ID, or all
     * reports for a study by study ID/DICOM UID. Returns plain text report content.
     */
    fun text(): ReportTextResponse = text(ReportTextParams.none())

    /** @see text */
    fun text(
        params: ReportTextParams = ReportTextParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportTextResponse

    /** @see text */
    fun text(params: ReportTextParams = ReportTextParams.none()): ReportTextResponse =
        text(params, RequestOptions.none())

    /** @see text */
    fun text(requestOptions: RequestOptions): ReportTextResponse =
        text(ReportTextParams.none(), requestOptions)

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/reports`, but is otherwise the same
         * as [ReportService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ReportListResponse> = list(ReportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportListParams = ReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportListParams = ReportListParams.none()
        ): HttpResponseFor<ReportListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ReportListResponse> =
            list(ReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/reports/{reportId}/addendum`, but is
         * otherwise the same as [ReportService.addendum].
         */
        @MustBeClosed
        fun addendum(reportId: String): HttpResponseFor<ReportAddendumResponse> =
            addendum(reportId, ReportAddendumParams.none())

        /** @see addendum */
        @MustBeClosed
        fun addendum(
            reportId: String,
            params: ReportAddendumParams = ReportAddendumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportAddendumResponse> =
            addendum(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see addendum */
        @MustBeClosed
        fun addendum(
            reportId: String,
            params: ReportAddendumParams = ReportAddendumParams.none(),
        ): HttpResponseFor<ReportAddendumResponse> =
            addendum(reportId, params, RequestOptions.none())

        /** @see addendum */
        @MustBeClosed
        fun addendum(
            params: ReportAddendumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportAddendumResponse>

        /** @see addendum */
        @MustBeClosed
        fun addendum(params: ReportAddendumParams): HttpResponseFor<ReportAddendumResponse> =
            addendum(params, RequestOptions.none())

        /** @see addendum */
        @MustBeClosed
        fun addendum(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportAddendumResponse> =
            addendum(reportId, ReportAddendumParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/reports/{reportId}/cancel-addendum`,
         * but is otherwise the same as [ReportService.cancelAddendum].
         */
        @MustBeClosed
        fun cancelAddendum(reportId: String): HttpResponseFor<ReportCancelAddendumResponse> =
            cancelAddendum(reportId, ReportCancelAddendumParams.none())

        /** @see cancelAddendum */
        @MustBeClosed
        fun cancelAddendum(
            reportId: String,
            params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCancelAddendumResponse> =
            cancelAddendum(params.toBuilder().reportId(reportId).build(), requestOptions)

        /** @see cancelAddendum */
        @MustBeClosed
        fun cancelAddendum(
            reportId: String,
            params: ReportCancelAddendumParams = ReportCancelAddendumParams.none(),
        ): HttpResponseFor<ReportCancelAddendumResponse> =
            cancelAddendum(reportId, params, RequestOptions.none())

        /** @see cancelAddendum */
        @MustBeClosed
        fun cancelAddendum(
            params: ReportCancelAddendumParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCancelAddendumResponse>

        /** @see cancelAddendum */
        @MustBeClosed
        fun cancelAddendum(
            params: ReportCancelAddendumParams
        ): HttpResponseFor<ReportCancelAddendumResponse> =
            cancelAddendum(params, RequestOptions.none())

        /** @see cancelAddendum */
        @MustBeClosed
        fun cancelAddendum(
            reportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCancelAddendumResponse> =
            cancelAddendum(reportId, ReportCancelAddendumParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/reports/pdf`, but is otherwise the
         * same as [ReportService.pdf].
         */
        @MustBeClosed fun pdf(): HttpResponseFor<ReportPdfResponse> = pdf(ReportPdfParams.none())

        /** @see pdf */
        @MustBeClosed
        fun pdf(
            params: ReportPdfParams = ReportPdfParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportPdfResponse>

        /** @see pdf */
        @MustBeClosed
        fun pdf(
            params: ReportPdfParams = ReportPdfParams.none()
        ): HttpResponseFor<ReportPdfResponse> = pdf(params, RequestOptions.none())

        /** @see pdf */
        @MustBeClosed
        fun pdf(requestOptions: RequestOptions): HttpResponseFor<ReportPdfResponse> =
            pdf(ReportPdfParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/autoScribe/reports/text`, but is otherwise the
         * same as [ReportService.text].
         */
        @MustBeClosed
        fun text(): HttpResponseFor<ReportTextResponse> = text(ReportTextParams.none())

        /** @see text */
        @MustBeClosed
        fun text(
            params: ReportTextParams = ReportTextParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportTextResponse>

        /** @see text */
        @MustBeClosed
        fun text(
            params: ReportTextParams = ReportTextParams.none()
        ): HttpResponseFor<ReportTextResponse> = text(params, RequestOptions.none())

        /** @see text */
        @MustBeClosed
        fun text(requestOptions: RequestOptions): HttpResponseFor<ReportTextResponse> =
            text(ReportTextParams.none(), requestOptions)
    }
}
