@file:JvmName("EmptyHandler")

package com.avara.api.core.handlers

import com.avara.api.core.http.HttpResponse
import com.avara.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
