// File generated from our OpenAPI spec by Stainless.

package com.avara.services.blocking

import com.avara.core.ClientOptions
import com.avara.services.blocking.orgs.UserService
import com.avara.services.blocking.orgs.UserServiceImpl
import java.util.function.Consumer

class OrgServiceImpl internal constructor(private val clientOptions: ClientOptions) : OrgService {

    private val withRawResponse: OrgService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): OrgService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService =
        OrgServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserService = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgService.WithRawResponse {

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgService.WithRawResponse =
            OrgServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserService.WithRawResponse = users
    }
}
