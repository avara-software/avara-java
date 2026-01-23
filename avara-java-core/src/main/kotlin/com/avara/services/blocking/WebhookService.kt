// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.core.ClientOptions
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.webhooks.UnwrapWebhookEvent
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws AvaraInvalidDataException if the body could not be parsed.
     */
    fun unwrap(body: String): UnwrapWebhookEvent

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse
    }
}
