// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer.ephemeralsessions

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.Params
import com.avara.core.checkRequired
import com.avara.core.http.Headers
import com.avara.core.http.QueryParams
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.avara.models.EphemeralHangingProtocol
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Mints a 30-second tokenized landing URL for a userless, studyless Viewer session. The token names
 * a customer retrievalId (not an Avara study). Optional options are echoed verbatim on
 * ephemeral.access_requested (max 3072 bytes JSON). Optional hangingProtocol applies a
 * single-monitor layout when the viewer loads. Requires a customer study webhook on the API key.
 */
class EphemeralSessionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Opaque customer handle for this view session. Avara stores and echoes it; it is not an Avara
     * study ID.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retrievalId(): String = body.retrievalId()

    /**
     * Optional single-monitor hanging protocol applied when the ephemeral viewer loads. Omitted =
     * no protocol. Invalid shape is rejected.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hangingProtocol(): Optional<EphemeralHangingProtocol> = body.hangingProtocol()

    /**
     * Optional JSON object echoed verbatim on ephemeral.access_requested. Avara does not read or
     * edit it. Hard cap 3072 bytes on JSON.stringify. Examples: studyInstanceUids or internal ids
     * for multi-study reads. Not for URLs or manifests.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<Options> = body.options()

    /**
     * Returns the raw JSON value of [retrievalId].
     *
     * Unlike [retrievalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _retrievalId(): JsonField<String> = body._retrievalId()

    /**
     * Returns the raw JSON value of [hangingProtocol].
     *
     * Unlike [hangingProtocol], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hangingProtocol(): JsonField<EphemeralHangingProtocol> = body._hangingProtocol()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EphemeralSessionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .retrievalId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemeralSessionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ephemeralSessionCreateParams: EphemeralSessionCreateParams) = apply {
            body = ephemeralSessionCreateParams.body.toBuilder()
            additionalHeaders = ephemeralSessionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ephemeralSessionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [retrievalId]
         * - [hangingProtocol]
         * - [options]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Opaque customer handle for this view session. Avara stores and echoes it; it is not an
         * Avara study ID.
         */
        fun retrievalId(retrievalId: String) = apply { body.retrievalId(retrievalId) }

        /**
         * Sets [Builder.retrievalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retrievalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retrievalId(retrievalId: JsonField<String>) = apply { body.retrievalId(retrievalId) }

        /**
         * Optional single-monitor hanging protocol applied when the ephemeral viewer loads. Omitted
         * = no protocol. Invalid shape is rejected.
         */
        fun hangingProtocol(hangingProtocol: EphemeralHangingProtocol) = apply {
            body.hangingProtocol(hangingProtocol)
        }

        /**
         * Sets [Builder.hangingProtocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hangingProtocol] with a well-typed
         * [EphemeralHangingProtocol] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun hangingProtocol(hangingProtocol: JsonField<EphemeralHangingProtocol>) = apply {
            body.hangingProtocol(hangingProtocol)
        }

        /**
         * Optional JSON object echoed verbatim on ephemeral.access_requested. Avara does not read
         * or edit it. Hard cap 3072 bytes on JSON.stringify. Examples: studyInstanceUids or
         * internal ids for multi-study reads. Not for URLs or manifests.
         */
        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [EphemeralSessionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .retrievalId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemeralSessionCreateParams =
            EphemeralSessionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for creating a userless, studyless ephemeral Viewer session. No userId. Requires
     * a customer study webhook on the API key.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retrievalId: JsonField<String>,
        private val hangingProtocol: JsonField<EphemeralHangingProtocol>,
        private val options: JsonField<Options>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retrievalId")
            @ExcludeMissing
            retrievalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hangingProtocol")
            @ExcludeMissing
            hangingProtocol: JsonField<EphemeralHangingProtocol> = JsonMissing.of(),
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
        ) : this(retrievalId, hangingProtocol, options, mutableMapOf())

        /**
         * Opaque customer handle for this view session. Avara stores and echoes it; it is not an
         * Avara study ID.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retrievalId(): String = retrievalId.getRequired("retrievalId")

        /**
         * Optional single-monitor hanging protocol applied when the ephemeral viewer loads. Omitted
         * = no protocol. Invalid shape is rejected.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hangingProtocol(): Optional<EphemeralHangingProtocol> =
            hangingProtocol.getOptional("hangingProtocol")

        /**
         * Optional JSON object echoed verbatim on ephemeral.access_requested. Avara does not read
         * or edit it. Hard cap 3072 bytes on JSON.stringify. Examples: studyInstanceUids or
         * internal ids for multi-study reads. Not for URLs or manifests.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun options(): Optional<Options> = options.getOptional("options")

        /**
         * Returns the raw JSON value of [retrievalId].
         *
         * Unlike [retrievalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retrievalId")
        @ExcludeMissing
        fun _retrievalId(): JsonField<String> = retrievalId

        /**
         * Returns the raw JSON value of [hangingProtocol].
         *
         * Unlike [hangingProtocol], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hangingProtocol")
        @ExcludeMissing
        fun _hangingProtocol(): JsonField<EphemeralHangingProtocol> = hangingProtocol

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .retrievalId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var retrievalId: JsonField<String>? = null
            private var hangingProtocol: JsonField<EphemeralHangingProtocol> = JsonMissing.of()
            private var options: JsonField<Options> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                retrievalId = body.retrievalId
                hangingProtocol = body.hangingProtocol
                options = body.options
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Opaque customer handle for this view session. Avara stores and echoes it; it is not
             * an Avara study ID.
             */
            fun retrievalId(retrievalId: String) = retrievalId(JsonField.of(retrievalId))

            /**
             * Sets [Builder.retrievalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retrievalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retrievalId(retrievalId: JsonField<String>) = apply {
                this.retrievalId = retrievalId
            }

            /**
             * Optional single-monitor hanging protocol applied when the ephemeral viewer loads.
             * Omitted = no protocol. Invalid shape is rejected.
             */
            fun hangingProtocol(hangingProtocol: EphemeralHangingProtocol) =
                hangingProtocol(JsonField.of(hangingProtocol))

            /**
             * Sets [Builder.hangingProtocol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hangingProtocol] with a well-typed
             * [EphemeralHangingProtocol] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun hangingProtocol(hangingProtocol: JsonField<EphemeralHangingProtocol>) = apply {
                this.hangingProtocol = hangingProtocol
            }

            /**
             * Optional JSON object echoed verbatim on ephemeral.access_requested. Avara does not
             * read or edit it. Hard cap 3072 bytes on JSON.stringify. Examples: studyInstanceUids
             * or internal ids for multi-study reads. Not for URLs or manifests.
             */
            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .retrievalId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("retrievalId", retrievalId),
                    hangingProtocol,
                    options,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            retrievalId()
            hangingProtocol().ifPresent { it.validate() }
            options().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: AvaraInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (retrievalId.asKnown().isPresent) 1 else 0) +
                (hangingProtocol.asKnown().getOrNull()?.validity() ?: 0) +
                (options.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                retrievalId == other.retrievalId &&
                hangingProtocol == other.hangingProtocol &&
                options == other.options &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(retrievalId, hangingProtocol, options, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{retrievalId=$retrievalId, hangingProtocol=$hangingProtocol, options=$options, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional JSON object echoed verbatim on ephemeral.access_requested. Avara does not read or
     * edit it. Hard cap 3072 bytes on JSON.stringify. Examples: studyInstanceUids or internal ids
     * for multi-study reads. Not for URLs or manifests.
     */
    class Options
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options = Options(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AvaraInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: AvaraInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Options{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemeralSessionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EphemeralSessionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
