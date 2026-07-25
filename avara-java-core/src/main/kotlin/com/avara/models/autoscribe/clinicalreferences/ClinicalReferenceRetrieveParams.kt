// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.clinicalreferences

import com.avara.core.Params
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves a single clinical reference by its unique identifier. */
class ClinicalReferenceRetrieveParams
private constructor(
    private val clinicalReferenceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique clinical reference identifier. Format: ref_{32-hex-chars} */
    fun clinicalReferenceId(): Optional<String> = Optional.ofNullable(clinicalReferenceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ClinicalReferenceRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ClinicalReferenceRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalReferenceRetrieveParams]. */
    class Builder internal constructor() {

        private var clinicalReferenceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(clinicalReferenceRetrieveParams: ClinicalReferenceRetrieveParams) =
            apply {
                clinicalReferenceId = clinicalReferenceRetrieveParams.clinicalReferenceId
                additionalHeaders = clinicalReferenceRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    clinicalReferenceRetrieveParams.additionalQueryParams.toBuilder()
            }

        /** Unique clinical reference identifier. Format: ref_{32-hex-chars} */
        fun clinicalReferenceId(clinicalReferenceId: String?) = apply {
            this.clinicalReferenceId = clinicalReferenceId
        }

        /**
         * Alias for calling [Builder.clinicalReferenceId] with `clinicalReferenceId.orElse(null)`.
         */
        fun clinicalReferenceId(clinicalReferenceId: Optional<String>) =
            clinicalReferenceId(clinicalReferenceId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ClinicalReferenceRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClinicalReferenceRetrieveParams =
            ClinicalReferenceRetrieveParams(
                clinicalReferenceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> clinicalReferenceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalReferenceRetrieveParams &&
            clinicalReferenceId == other.clinicalReferenceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(clinicalReferenceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ClinicalReferenceRetrieveParams{clinicalReferenceId=$clinicalReferenceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
