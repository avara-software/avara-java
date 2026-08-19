// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.services.blocking

import com.avarasoftware.core.ClientOptions
import com.avarasoftware.core.RequestOptions
import com.avarasoftware.core.http.HttpResponseFor
import com.avarasoftware.models.express.ExpressCreateParams
import com.avarasoftware.models.express.ExpressCreateResponse
import com.avarasoftware.models.express.ExpressDeactivateParams
import com.avarasoftware.models.express.ExpressDeactivateResponse
import com.avarasoftware.models.express.ExpressListPage
import com.avarasoftware.models.express.ExpressListParams
import com.avarasoftware.models.express.ExpressReactivateParams
import com.avarasoftware.models.express.ExpressReactivateResponse
import com.avarasoftware.models.express.ExpressRetrieveParams
import com.avarasoftware.models.express.ExpressRetrieveResponse
import com.avarasoftware.models.express.ExpressUpdateParams
import com.avarasoftware.models.express.ExpressUpdateResponse
import com.avarasoftware.services.blocking.express.UserService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ExpressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpressService

    fun users(): UserService

    /**
     * Creates a new customer with a unique identifier and name. Customers can be used to group and
     * manage users, studies, and access permissions across the Avara platform.
     */
    fun create(params: ExpressCreateParams): ExpressCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExpressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressCreateResponse

    /**
     * Retrieves a single customer by its unique customer ID. Returns the complete customer object
     * with name, status, and timestamps.
     */
    fun retrieve(expressCustomerId: String): ExpressRetrieveResponse =
        retrieve(expressCustomerId, ExpressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        expressCustomerId: String,
        params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressRetrieveResponse =
        retrieve(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        expressCustomerId: String,
        params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
    ): ExpressRetrieveResponse = retrieve(expressCustomerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExpressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ExpressRetrieveParams): ExpressRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): ExpressRetrieveResponse =
        retrieve(expressCustomerId, ExpressRetrieveParams.none(), requestOptions)

    /**
     * Updates a customer's properties such as name or other metadata. All fields are optional -
     * only provided fields will be updated.
     */
    fun update(expressCustomerId: String): ExpressUpdateResponse =
        update(expressCustomerId, ExpressUpdateParams.none())

    /** @see update */
    fun update(
        expressCustomerId: String,
        params: ExpressUpdateParams = ExpressUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressUpdateResponse =
        update(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see update */
    fun update(
        expressCustomerId: String,
        params: ExpressUpdateParams = ExpressUpdateParams.none(),
    ): ExpressUpdateResponse = update(expressCustomerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExpressUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressUpdateResponse

    /** @see update */
    fun update(params: ExpressUpdateParams): ExpressUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(expressCustomerId: String, requestOptions: RequestOptions): ExpressUpdateResponse =
        update(expressCustomerId, ExpressUpdateParams.none(), requestOptions)

    /**
     * Retrieves a paginated list of customers with optional filtering by name. Returns up to 100
     * customers per request.
     */
    fun list(): ExpressListPage = list(ExpressListParams.none())

    /** @see list */
    fun list(
        params: ExpressListParams = ExpressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressListPage

    /** @see list */
    fun list(params: ExpressListParams = ExpressListParams.none()): ExpressListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ExpressListPage =
        list(ExpressListParams.none(), requestOptions)

    /**
     * Deactivates a customer, preventing it from being used for new studies or user assignments.
     * Existing data is preserved and the customer can be reactivated later.
     */
    fun deactivate(expressCustomerId: String): ExpressDeactivateResponse =
        deactivate(expressCustomerId, ExpressDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        expressCustomerId: String,
        params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressDeactivateResponse =
        deactivate(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        expressCustomerId: String,
        params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
    ): ExpressDeactivateResponse = deactivate(expressCustomerId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: ExpressDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressDeactivateResponse

    /** @see deactivate */
    fun deactivate(params: ExpressDeactivateParams): ExpressDeactivateResponse =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): ExpressDeactivateResponse =
        deactivate(expressCustomerId, ExpressDeactivateParams.none(), requestOptions)

    /**
     * Restores a deactivated customer to active status, allowing it to be used for new studies and
     * user assignments again.
     */
    fun reactivate(expressCustomerId: String): ExpressReactivateResponse =
        reactivate(expressCustomerId, ExpressReactivateParams.none())

    /** @see reactivate */
    fun reactivate(
        expressCustomerId: String,
        params: ExpressReactivateParams = ExpressReactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressReactivateResponse =
        reactivate(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

    /** @see reactivate */
    fun reactivate(
        expressCustomerId: String,
        params: ExpressReactivateParams = ExpressReactivateParams.none(),
    ): ExpressReactivateResponse = reactivate(expressCustomerId, params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        params: ExpressReactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpressReactivateResponse

    /** @see reactivate */
    fun reactivate(params: ExpressReactivateParams): ExpressReactivateResponse =
        reactivate(params, RequestOptions.none())

    /** @see reactivate */
    fun reactivate(
        expressCustomerId: String,
        requestOptions: RequestOptions,
    ): ExpressReactivateResponse =
        reactivate(expressCustomerId, ExpressReactivateParams.none(), requestOptions)

    /** A view of [ExpressService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpressService.WithRawResponse

        fun users(): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/express`, but is otherwise the same as
         * [ExpressService.create].
         */
        @MustBeClosed
        fun create(params: ExpressCreateParams): HttpResponseFor<ExpressCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExpressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/express/{expressCustomerId}`, but is otherwise
         * the same as [ExpressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(expressCustomerId: String): HttpResponseFor<ExpressRetrieveResponse> =
            retrieve(expressCustomerId, ExpressRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            expressCustomerId: String,
            params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressRetrieveResponse> =
            retrieve(
                params.toBuilder().expressCustomerId(expressCustomerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            expressCustomerId: String,
            params: ExpressRetrieveParams = ExpressRetrieveParams.none(),
        ): HttpResponseFor<ExpressRetrieveResponse> =
            retrieve(expressCustomerId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ExpressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ExpressRetrieveParams): HttpResponseFor<ExpressRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressRetrieveResponse> =
            retrieve(expressCustomerId, ExpressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/express/{expressCustomerId}`, but is otherwise
         * the same as [ExpressService.update].
         */
        @MustBeClosed
        fun update(expressCustomerId: String): HttpResponseFor<ExpressUpdateResponse> =
            update(expressCustomerId, ExpressUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            expressCustomerId: String,
            params: ExpressUpdateParams = ExpressUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressUpdateResponse> =
            update(params.toBuilder().expressCustomerId(expressCustomerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            expressCustomerId: String,
            params: ExpressUpdateParams = ExpressUpdateParams.none(),
        ): HttpResponseFor<ExpressUpdateResponse> =
            update(expressCustomerId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExpressUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ExpressUpdateParams): HttpResponseFor<ExpressUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressUpdateResponse> =
            update(expressCustomerId, ExpressUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/express`, but is otherwise the same as
         * [ExpressService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ExpressListPage> = list(ExpressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExpressListParams = ExpressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExpressListParams = ExpressListParams.none()
        ): HttpResponseFor<ExpressListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExpressListPage> =
            list(ExpressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/express/{expressCustomerId}/deactivate`, but is
         * otherwise the same as [ExpressService.deactivate].
         */
        @MustBeClosed
        fun deactivate(expressCustomerId: String): HttpResponseFor<ExpressDeactivateResponse> =
            deactivate(expressCustomerId, ExpressDeactivateParams.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            expressCustomerId: String,
            params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressDeactivateResponse> =
            deactivate(
                params.toBuilder().expressCustomerId(expressCustomerId).build(),
                requestOptions,
            )

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            expressCustomerId: String,
            params: ExpressDeactivateParams = ExpressDeactivateParams.none(),
        ): HttpResponseFor<ExpressDeactivateResponse> =
            deactivate(expressCustomerId, params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: ExpressDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: ExpressDeactivateParams
        ): HttpResponseFor<ExpressDeactivateResponse> = deactivate(params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressDeactivateResponse> =
            deactivate(expressCustomerId, ExpressDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/express/{expressCustomerId}/reactivate`, but is
         * otherwise the same as [ExpressService.reactivate].
         */
        @MustBeClosed
        fun reactivate(expressCustomerId: String): HttpResponseFor<ExpressReactivateResponse> =
            reactivate(expressCustomerId, ExpressReactivateParams.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            expressCustomerId: String,
            params: ExpressReactivateParams = ExpressReactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressReactivateResponse> =
            reactivate(
                params.toBuilder().expressCustomerId(expressCustomerId).build(),
                requestOptions,
            )

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            expressCustomerId: String,
            params: ExpressReactivateParams = ExpressReactivateParams.none(),
        ): HttpResponseFor<ExpressReactivateResponse> =
            reactivate(expressCustomerId, params, RequestOptions.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            params: ExpressReactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpressReactivateResponse>

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            params: ExpressReactivateParams
        ): HttpResponseFor<ExpressReactivateResponse> = reactivate(params, RequestOptions.none())

        /** @see reactivate */
        @MustBeClosed
        fun reactivate(
            expressCustomerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExpressReactivateResponse> =
            reactivate(expressCustomerId, ExpressReactivateParams.none(), requestOptions)
    }
}
