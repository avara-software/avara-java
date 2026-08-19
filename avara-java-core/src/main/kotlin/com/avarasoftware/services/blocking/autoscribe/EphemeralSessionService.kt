// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking.autoscribe

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.autoscribe.ephemeralsessions.EphemeralSessionCreateParams
import com.avarasoftware.models.autoscribe.ephemeralsessions.EphemeralSessionCreateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface EphemeralSessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EphemeralSessionService

    /**
     * Mints a 30-second tokenized landing URL for a userless, studyless AutoScribe viewer session.
     * The token names a customer retrievalId (not an Avara study). Optional options are echoed
     * verbatim on ephemeral.access_requested (max 3072 bytes JSON). Optional hangingProtocol
     * applies a single-monitor layout when the viewer loads. Requires a customer study webhook on
     * the API key.
     */
    fun create(params: EphemeralSessionCreateParams): EphemeralSessionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EphemeralSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EphemeralSessionCreateResponse

    /**
     * A view of [EphemeralSessionService] that provides access to raw HTTP responses for each
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
        ): EphemeralSessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/autoScribe/ephemeral-sessions`, but is
         * otherwise the same as [EphemeralSessionService.create].
         */
        @MustBeClosed
        fun create(
            params: EphemeralSessionCreateParams
        ): HttpResponseFor<EphemeralSessionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EphemeralSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EphemeralSessionCreateResponse>
    }
}
