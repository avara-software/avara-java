// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking.autoscribe.studies

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.studies.external.ExternalCreateParams
import com.avara.models.autoscribe.studies.external.ExternalCreateResponse
import com.avara.models.autoscribe.studies.external.ExternalDeleteParams
import com.avara.models.autoscribe.studies.external.ExternalDeleteResponse
import com.avara.services.blocking.autoscribe.studies.external.ReportService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ExternalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalService

    fun reports(): ReportService

    /**
     * Creates an archive (external) AutoScribe study. Clinical context fields are not accepted. If
     * no report fields are sent, no report row is created. Study create is all-or-nothing,
     * including file ingest.
     */
    fun create(params: ExternalCreateParams): ExternalCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalCreateResponse

    /**
     * Soft-deletes an external study. This is one-way; POST /studies/uncancel cannot reverse it.
     */
    fun delete(): ExternalDeleteResponse = delete(ExternalDeleteParams.none())

    /** @see delete */
    fun delete(
        params: ExternalDeleteParams = ExternalDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalDeleteResponse

    /** @see delete */
    fun delete(params: ExternalDeleteParams = ExternalDeleteParams.none()): ExternalDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions): ExternalDeleteResponse =
        delete(ExternalDeleteParams.none(), requestOptions)

    /** A view of [ExternalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalService.WithRawResponse

        fun reports(): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/external`, but is otherwise
         * the same as [ExternalService.create].
         */
        @MustBeClosed
        fun create(params: ExternalCreateParams): HttpResponseFor<ExternalCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExternalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/external/delete`, but is
         * otherwise the same as [ExternalService.delete].
         */
        @MustBeClosed
        fun delete(): HttpResponseFor<ExternalDeleteResponse> = delete(ExternalDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExternalDeleteParams = ExternalDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExternalDeleteParams = ExternalDeleteParams.none()
        ): HttpResponseFor<ExternalDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(requestOptions: RequestOptions): HttpResponseFor<ExternalDeleteResponse> =
            delete(ExternalDeleteParams.none(), requestOptions)
    }
}
