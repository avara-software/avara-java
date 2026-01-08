// File generated from our OpenAPI spec by Stainless.

package com.avara.api.errors

import com.avara.api.core.JsonValue
import com.avara.api.core.http.Headers

abstract class AvaraServiceException
protected constructor(message: String, cause: Throwable? = null) : AvaraException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
