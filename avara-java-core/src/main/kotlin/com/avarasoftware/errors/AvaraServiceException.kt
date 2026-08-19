// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.errors

import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.http.Headers

abstract class AvaraServiceException
protected constructor(message: String, cause: Throwable? = null) : AvaraException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
