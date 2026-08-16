// File generated from our OpenAPI spec by Stainless.

package com.avara.services.async.viewer

import com.avara.core.ClientOptions
import com.avara.core.RequestOptions
import com.avara.core.http.HttpResponseFor
import com.avara.models.viewer.ephemeralsessions.EphemeralSessionCreateParams
import com.avara.models.viewer.ephemeralsessions.EphemeralSessionCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EphemeralSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemeralSessionServiceAsync

    /**
     * Mints a 30-second tokenized landing URL for a userless, studyless Viewer session. The token
     * names a customer retrievalId (not an Avara study). Optional options are echoed verbatim on
     * ephemeral.access_requested (max 3072 bytes JSON). Optional hangingProtocol applies a
     * single-monitor layout when the viewer loads. Requires a customer study webhook on the API
     * key.
     */
    fun create(
        params: EphemeralSessionCreateParams
    ): CompletableFuture<EphemeralSessionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EphemeralSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EphemeralSessionCreateResponse>

    /**
     * A view of [EphemeralSessionServiceAsync] that provides access to raw HTTP responses for each
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
        ): EphemeralSessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/viewer/ephemeral-sessions`, but is otherwise
         * the same as [EphemeralSessionServiceAsync.create].
         */
        fun create(
            params: EphemeralSessionCreateParams
        ): CompletableFuture<HttpResponseFor<EphemeralSessionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EphemeralSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EphemeralSessionCreateResponse>>
    }
}
