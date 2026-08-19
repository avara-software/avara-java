// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe.studies

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.Params
import com.avarasoftware.core.checkRequired
import com.avarasoftware.core.http.Headers
import com.avarasoftware.core.http.QueryParams
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Generates a tokenized URL that redirects users to the AutoScribe interface (viewer + dictation)
 * for the specified study and user. The URL includes authentication and is time-limited for
 * security.
 */
class StudyRerouteUrlParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * User ID to assign study to. Format: usr_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assignedToUserId(): String = body.assignedToUserId()

    /**
     * Unique study identifier. Format: stu_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyId(): Optional<String> = body.studyId()

    /**
     * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
     * '1.2.840.10008.5.1.4.1.1.2')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun studyInstanceUid(): Optional<String> = body.studyInstanceUid()

    /**
     * Returns the raw JSON value of [assignedToUserId].
     *
     * Unlike [assignedToUserId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _assignedToUserId(): JsonField<String> = body._assignedToUserId()

    /**
     * Returns the raw JSON value of [studyId].
     *
     * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _studyId(): JsonField<String> = body._studyId()

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _studyInstanceUid(): JsonField<String> = body._studyInstanceUid()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StudyRerouteUrlParams].
         *
         * The following fields are required:
         * ```java
         * .assignedToUserId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyRerouteUrlParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(studyRerouteUrlParams: StudyRerouteUrlParams) = apply {
            body = studyRerouteUrlParams.body.toBuilder()
            additionalHeaders = studyRerouteUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams = studyRerouteUrlParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [assignedToUserId]
         * - [studyId]
         * - [studyInstanceUid]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** User ID to assign study to. Format: usr_{32-hex-chars} */
        fun assignedToUserId(assignedToUserId: String) = apply {
            body.assignedToUserId(assignedToUserId)
        }

        /**
         * Sets [Builder.assignedToUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedToUserId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun assignedToUserId(assignedToUserId: JsonField<String>) = apply {
            body.assignedToUserId(assignedToUserId)
        }

        /** Unique study identifier. Format: stu_{32-hex-chars} */
        fun studyId(studyId: String) = apply { body.studyId(studyId) }

        /**
         * Sets [Builder.studyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun studyId(studyId: JsonField<String>) = apply { body.studyId(studyId) }

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         */
        fun studyInstanceUid(studyInstanceUid: String) = apply {
            body.studyInstanceUid(studyInstanceUid)
        }

        /**
         * Sets [Builder.studyInstanceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyInstanceUid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
            body.studyInstanceUid(studyInstanceUid)
        }

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
         * Returns an immutable instance of [StudyRerouteUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .assignedToUserId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyRerouteUrlParams =
            StudyRerouteUrlParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for generating a reroute URL for AutoScribe (viewer + dictation). Viewer
     * component is only accessible if configured for your clinic; dictation works independently.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assignedToUserId: JsonField<String>,
        private val studyId: JsonField<String>,
        private val studyInstanceUid: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assignedToUserId")
            @ExcludeMissing
            assignedToUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyId") @ExcludeMissing studyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            studyInstanceUid: JsonField<String> = JsonMissing.of(),
        ) : this(assignedToUserId, studyId, studyInstanceUid, mutableMapOf())

        /**
         * User ID to assign study to. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun assignedToUserId(): String = assignedToUserId.getRequired("assignedToUserId")

        /**
         * Unique study identifier. Format: stu_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyId(): Optional<String> = studyId.getOptional("studyId")

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun studyInstanceUid(): Optional<String> = studyInstanceUid.getOptional("studyInstanceUid")

        /**
         * Returns the raw JSON value of [assignedToUserId].
         *
         * Unlike [assignedToUserId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("assignedToUserId")
        @ExcludeMissing
        fun _assignedToUserId(): JsonField<String> = assignedToUserId

        /**
         * Returns the raw JSON value of [studyId].
         *
         * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("studyId") @ExcludeMissing fun _studyId(): JsonField<String> = studyId

        /**
         * Returns the raw JSON value of [studyInstanceUid].
         *
         * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

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
             * .assignedToUserId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var assignedToUserId: JsonField<String>? = null
            private var studyId: JsonField<String> = JsonMissing.of()
            private var studyInstanceUid: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assignedToUserId = body.assignedToUserId
                studyId = body.studyId
                studyInstanceUid = body.studyInstanceUid
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** User ID to assign study to. Format: usr_{32-hex-chars} */
            fun assignedToUserId(assignedToUserId: String) =
                assignedToUserId(JsonField.of(assignedToUserId))

            /**
             * Sets [Builder.assignedToUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedToUserId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignedToUserId(assignedToUserId: JsonField<String>) = apply {
                this.assignedToUserId = assignedToUserId
            }

            /** Unique study identifier. Format: stu_{32-hex-chars} */
            fun studyId(studyId: String) = studyId(JsonField.of(studyId))

            /**
             * Sets [Builder.studyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyId(studyId: JsonField<String>) = apply { this.studyId = studyId }

            /**
             * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
             * '1.2.840.10008.5.1.4.1.1.2')
             */
            fun studyInstanceUid(studyInstanceUid: String) =
                studyInstanceUid(JsonField.of(studyInstanceUid))

            /**
             * Sets [Builder.studyInstanceUid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyInstanceUid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
                this.studyInstanceUid = studyInstanceUid
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .assignedToUserId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("assignedToUserId", assignedToUserId),
                    studyId,
                    studyInstanceUid,
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

            assignedToUserId()
            studyId()
            studyInstanceUid()
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
            (if (assignedToUserId.asKnown().isPresent) 1 else 0) +
                (if (studyId.asKnown().isPresent) 1 else 0) +
                (if (studyInstanceUid.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assignedToUserId == other.assignedToUserId &&
                studyId == other.studyId &&
                studyInstanceUid == other.studyInstanceUid &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(assignedToUserId, studyId, studyInstanceUid, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assignedToUserId=$assignedToUserId, studyId=$studyId, studyInstanceUid=$studyInstanceUid, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyRerouteUrlParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StudyRerouteUrlParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
