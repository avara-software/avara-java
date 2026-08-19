// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.async

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.express.ExpressCreateParams
import com.avarasoftware.models.express.ExpressCreateResponse
import com.avarasoftware.models.express.ExpressDeactivateParams
import com.avarasoftware.models.express.ExpressDeactivateResponse
import com.avarasoftware.models.express.ExpressListPageAsync
import com.avarasoftware.models.express.ExpressListParams
import com.avarasoftware.models.express.ExpressReactivateParams
import com.avarasoftware.models.express.ExpressReactivateResponse
import com.avarasoftware.models.express.ExpressRetrieveParams
import com.avarasoftware.models.express.ExpressRetrieveResponse
import com.avarasoftware.models.express.ExpressUpdateParams
import com.avarasoftware.models.express.ExpressUpdateResponse
import com.avarasoftware.services.async.express.UserServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExpressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpressServiceAsync

    fun users(): UserServiceAsync

    /**
     * Creates a new customer with a unique identifier and name. Customers can be used to group and
     * manage users, studies, and access permissions across the Avara platform.
     */
    fun create(params: ExpressCreateParams): CompletableFuture<ExpressCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExpressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressCreateResponse>

    /**
     * Retrieves a single customer by its unique customer ID. Returns the complete customer object
     * with name, status, and timestamps.
     */
    fun retrieve(expressCustomerId: String): CompletableFuture<ExpressRetrieveResponse> =
        retrieve(expressCustomerId, ExpressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        expressCustomerId: String,
        params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressRetrieveResponse> =
        retrieve(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        expressCustomerId: String,
        params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
    ): CompletableFuture<ExpressRetrieveResponse> =
        retrieve(expressCustomerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExpressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ExpressRetrieveParams): CompletableFuture<ExpressRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressRetrieveResponse> =
        retrieve(expressCustomerId, ExpressRetrieveParams.none(), requestOptions)

    /**
     * Updates a customer's properties such as name or other metadata. All fields are optional -
     * only provided fields will be updated.
     */
    fun update(expressCustomerId: String): CompletableFuture<ExpressUpdateResponse> =
        update(expressCustomerId, ExpressUpdateParams.none())

    /** @see update */
    fun update(
        expressCustomerId: String,
        params: ExpressUpdateParams = ExpressUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressUpdateResponse> =
        update(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see update */
    fun update(
        expressCustomerId: String,
        params: ExpressUpdateParams = ExpressUpdateParams.none(),
    ): CompletableFuture<ExpressUpdateResponse> =
        update(expressCustomerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExpressUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressUpdateResponse>

    /** @see update */
    fun update(params: ExpressUpdateParams): CompletableFuture<ExpressUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressUpdateResponse> =
        update(expressCustomerId, ExpressUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of customers with optional filtering by name. Returns up to 100
     * customers per request.
     */
    fun list(): CompletableFuture<ExpressListPageAsync> = list(ExpressListParams.none())

    /** @see list */
    fun list(
        params: ExpressListParams = ExpressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressListPageAsync>

    /** @see list */
    fun list(
        params: ExpressListParams = ExpressListParams.none()
    ): CompletableFuture<ExpressListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExpressListPageAsync> =
        list(ExpressListParams.none(), requestOptions)

    /**
     * Deactivates a customer, preventing it from being used for new studies or user assignments.
     * Existing data is preserved and the customer can be reactivated later.
     */
    fun deactivate(expressCustomerId: String): CompletableFuture<ExpressDeactivateResponse> =
        deactivate(expressCustomerId, ExpressDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        expressCustomerId: String,
        params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressDeactivateResponse> =
        deactivate(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        expressCustomerId: String,
        params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
    ): CompletableFuture<ExpressDeactivateResponse> =
        deactivate(expressCustomerId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: ExpressDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressDeactivateResponse>

    /** @see deactivate */
    fun deactivate(params: ExpressDeactivateParams): CompletableFuture<ExpressDeactivateResponse> =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressDeactivateResponse> =
        deactivate(expressCustomerId, ExpressDeactivateParams.none(), requestOptions)

    /**
     * Restores a deactivated customer to active status, allowing it to be used for new studies and
     * user assignments again.
     */
    fun reactivate(expressCustomerId: String): CompletableFuture<ExpressReactivateResponse> =
        reactivate(expressCustomerId, ExpressReactivateParams.none())

    /** @see reactivate */
    fun reactivate(
        expressCustomerId: String,
        params: ExpressReactivateParams = ExpressReactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressReactivateResponse> =
        reactivate(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see reactivate */
    fun reactivate(
        expressCustomerId: String,
        params: ExpressReactivateParams = ExpressReactivateParams.none(),
    ): CompletableFuture<ExpressReactivateResponse> =
        reactivate(expressCustomerId, params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        params: ExpressReactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpressReactivateResponse>

    /** @see reactivate */
    fun reactivate(params: ExpressReactivateParams): CompletableFuture<ExpressReactivateResponse> =
        reactivate(params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExpressReactivateResponse> =
        reactivate(expressCustomerId, ExpressReactivateParams.none(), requestOptions)

    /**
     * A view of [ExpressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExpressServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/express`, but is otherwise the same as
         * [ExpressServiceAsync.create].
         */
        fun create(
            params: ExpressCreateParams
        ): CompletableFuture<HttpResponseFor<ExpressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExpressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/express/{expressCustomerId}`, but is otherwise
         * the same as [ExpressServiceAsync.retrieve].
         */
        fun retrieve(
            expressCustomerId: String
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>> =
            retrieve(expressCustomerId, ExpressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            expressCustomerId: String,
            params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>> =
            retrieve(
                params.toBuilder().expressCustomerId(expressCustomerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            expressCustomerId: String,
            params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>> =
            retrieve(expressCustomerId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExpressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ExpressRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressRetrieveResponse>> =
            retrieve(expressCustomerId, ExpressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/express/{expressCustomerId}`, but is otherwise
         * the same as [ExpressServiceAsync.update].
         */
        fun update(
            expressCustomerId: String
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>> =
            update(expressCustomerId, ExpressUpdateParams.none())

        /** @see update */
        fun update(
            expressCustomerId: String,
            params: ExpressUpdateParams = ExpressUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>> =
            update(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

        /** @see update */
        fun update(
            expressCustomerId: String,
            params: ExpressUpdateParams = ExpressUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>> =
            update(expressCustomerId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExpressUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>>

        /** @see update */
        fun update(
            params: ExpressUpdateParams
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressUpdateResponse>> =
            update(expressCustomerId, ExpressUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/express`, but is otherwise the same as
         * [ExpressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExpressListPageAsync>> =
            list(ExpressListParams.none())

        /** @see list */
        fun list(
            params: ExpressListParams = ExpressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressListPageAsync>>

        /** @see list */
        fun list(
            params: ExpressListParams = ExpressListParams.none()
        ): CompletableFuture<HttpResponseFor<ExpressListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpressListPageAsync>> =
            list(ExpressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/express/{expressCustomerId}/deactivate`, but is
         * otherwise the same as [ExpressServiceAsync.deactivate].
         */
        fun deactivate(
            expressCustomerId: String
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>> =
            deactivate(expressCustomerId, ExpressDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            expressCustomerId: String,
            params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>> =
            deactivate(
                params.toBuilder().expressCustomerId(expressCustomerId).build(),
                requestOptions,
            )

        /** @see deactivate */
        fun deactivate(
            expressCustomerId: String,
            params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>> =
            deactivate(expressCustomerId, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: ExpressDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: ExpressDeactivateParams
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressDeactivateResponse>> =
            deactivate(expressCustomerId, ExpressDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/express/{expressCustomerId}/reactivate`, but is
         * otherwise the same as [ExpressServiceAsync.reactivate].
         */
        fun reactivate(
            expressCustomerId: String
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>> =
            reactivate(expressCustomerId, ExpressReactivateParams.none())

        /** @see reactivate */
        fun reactivate(
            expressCustomerId: String,
            params: ExpressReactivateParams = ExpressReactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>> =
            reactivate(
                params.toBuilder().expressCustomerId(expressCustomerId).build(),
                requestOptions,
            )

        /** @see reactivate */
        fun reactivate(
            expressCustomerId: String,
            params: ExpressReactivateParams = ExpressReactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>> =
            reactivate(expressCustomerId, params, RequestOptions.none())

        /** @see reactivate */
        fun reactivate(
            params: ExpressReactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>>

        /** @see reactivate */
        fun reactivate(
            params: ExpressReactivateParams
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>> =
            reactivate(params, RequestOptions.none())

        /** @see reactivate */
        fun reactivate(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpressReactivateResponse>> =
            reactivate(expressCustomerId, ExpressReactivateParams.none(), requestOptions)
    }
}
