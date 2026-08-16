// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.autoscribe.studies

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.autoscribe.studies.external.ExternalCreateParams
import com.avara.models.autoscribe.studies.external.ExternalCreateResponse
import com.avara.models.autoscribe.studies.external.ExternalDeleteParams
import com.avara.models.autoscribe.studies.external.ExternalDeleteResponse
import com.avara.services.async.autoscribe.studies.external.ReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalServiceAsync

    fun reports(): ReportServiceAsync

    /**
     * Creates an archive (external) AutoScribe study. Clinical context fields are not accepted. If
     * no report fields are sent, no report row is created. Study create is all-or-nothing,
     * including file ingest.
     */
    fun create(params: ExternalCreateParams): CompletableFuture<ExternalCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalCreateResponse>

    /**
     * Soft-deletes an external study. This is one-way; POST /studies/uncancel cannot reverse it.
     */
    fun delete(): CompletableFuture<ExternalDeleteResponse> = delete(ExternalDeleteParams.none())

    /** @see delete */
    fun delete(
        params: ExternalDeleteParams = ExternalDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalDeleteResponse>

    /** @see delete */
    fun delete(
        params: ExternalDeleteParams = ExternalDeleteParams.none()
    ): CompletableFuture<ExternalDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions): CompletableFuture<ExternalDeleteResponse> =
        delete(ExternalDeleteParams.none(), requestOptions)

    /**
     * A view of [ExternalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/external`, but is otherwise
         * the same as [ExternalServiceAsync.create].
         */
        fun create(
            params: ExternalCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExternalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/studies/external/delete`, but is
         * otherwise the same as [ExternalServiceAsync.delete].
         */
        fun delete(): CompletableFuture<HttpResponseFor<ExternalDeleteResponse>> =
            delete(ExternalDeleteParams.none())

        /** @see delete */
        fun delete(
            params: ExternalDeleteParams = ExternalDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ExternalDeleteParams = ExternalDeleteParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalDeleteResponse>> =
            delete(ExternalDeleteParams.none(), requestOptions)
    }
}
