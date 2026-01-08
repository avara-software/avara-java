@file:JvmName("JsonHandler")

package com.avara.api.core.handlers

import com.avara.api.core.http.HttpResponse
import com.avara.api.core.http.HttpResponse.Handler
import com.avara.api.errors.AvaraInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw AvaraInvalidDataException("Error reading response", e)
            }
    }
