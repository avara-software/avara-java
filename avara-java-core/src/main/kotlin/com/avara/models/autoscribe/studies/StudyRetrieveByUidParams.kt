// File generated from our OpenAPI spec by Stainless.

package com.avara.models.autoscribe.studies

import com.avara.core.Params
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a single study by its DICOM Study Instance UID. This is useful when you have the DICOM
 * UID but not the Avara study ID.
 */
class StudyRetrieveByUidParams
private constructor(
    private val studyInstanceUid: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** DICOM Study Instance UID. Format: numbers and dots (e.g., 1.2.840.10008.5.1.4.1.1.2). */
    fun studyInstanceUid(): Optional<String> = Optional.ofNullable(studyInstanceUid)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StudyRetrieveByUidParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [StudyRetrieveByUidParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyRetrieveByUidParams]. */
    class Builder internal constructor() {

        private var studyInstanceUid: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(studyRetrieveByUidParams: StudyRetrieveByUidParams) = apply {
            studyInstanceUid = studyRetrieveByUidParams.studyInstanceUid
            additionalHeaders = studyRetrieveByUidParams.additionalHeaders.toBuilder()
            additionalQueryParams = studyRetrieveByUidParams.additionalQueryParams.toBuilder()
        }

        /** DICOM Study Instance UID. Format: numbers and dots (e.g., 1.2.840.10008.5.1.4.1.1.2). */
        fun studyInstanceUid(studyInstanceUid: String?) = apply {
            this.studyInstanceUid = studyInstanceUid
        }

        /** Alias for calling [Builder.studyInstanceUid] with `studyInstanceUid.orElse(null)`. */
        fun studyInstanceUid(studyInstanceUid: Optional<String>) =
            studyInstanceUid(studyInstanceUid.getOrNull())

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
         * Returns an immutable instance of [StudyRetrieveByUidParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StudyRetrieveByUidParams =
            StudyRetrieveByUidParams(
                studyInstanceUid,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> studyInstanceUid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyRetrieveByUidParams &&
            studyInstanceUid == other.studyInstanceUid &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(studyInstanceUid, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StudyRetrieveByUidParams{studyInstanceUid=$studyInstanceUid, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
