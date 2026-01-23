// File generated from our OpenAPI spec by Stainless.

package com.avara.errors

import com.avara.core.JsonValue
import com.avara.core.http.Headers

abstract class AvaraServiceException
protected constructor(message: String, cause: Throwable? = null) : AvaraException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
