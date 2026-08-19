@file:JvmName("JsonHandler")

package com.avarasoftware.core.handlers

import com.avarasoftware.core.http.HttpResponse
import com.avarasoftware.core.http.HttpResponse.Handler
import com.avarasoftware.errors.AvaraInvalidDataException
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
