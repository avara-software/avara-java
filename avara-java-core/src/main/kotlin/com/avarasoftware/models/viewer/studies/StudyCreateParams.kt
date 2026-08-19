// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.viewer.studies

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.Params
import com.avarasoftware.core.checkRequired
import com.avarasoftware.core.http.Headers
import com.avarasoftware.core.http.QueryParams
import com.avarasoftware.core.toImmutable
import com.avarasoftware.errors.AvaraInvalidDataException
import com.avarasoftware.models.Severity
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new study in the Viewer system with the specified DICOM Study Instance UID and
 * metadata. The study can be optionally assigned to a user.
 */
class StudyCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
     * attention.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun severity(): Severity = body.severity()

    /**
     * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyDescription(): String = body.studyDescription()

    /**
     * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
     * '1.2.840.10008.5.1.4.1.1.2')
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun studyInstanceUid(): String = body.studyInstanceUid()

    /**
     * User ID to assign the study to. Format: usr_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<String> = body.assignedTo()

    /**
     * Express customer ID for the study. Format: cus_{32-hex-chars}
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expressCustomerId(): Optional<String> = body.expressCustomerId()

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _severity(): JsonField<Severity> = body._severity()

    /**
     * Returns the raw JSON value of [studyDescription].
     *
     * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _studyDescription(): JsonField<String> = body._studyDescription()

    /**
     * Returns the raw JSON value of [studyInstanceUid].
     *
     * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _studyInstanceUid(): JsonField<String> = body._studyInstanceUid()

    /**
     * Returns the raw JSON value of [assignedTo].
     *
     * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignedTo(): JsonField<String> = body._assignedTo()

    /**
     * Returns the raw JSON value of [expressCustomerId].
     *
     * Unlike [expressCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expressCustomerId(): JsonField<String> = body._expressCustomerId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StudyCreateParams].
         *
         * The following fields are required:
         * ```java
         * .severity()
         * .studyDescription()
         * .studyInstanceUid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(studyCreateParams: StudyCreateParams) = apply {
            body = studyCreateParams.body.toBuilder()
            additionalHeaders = studyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = studyCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [severity]
         * - [studyDescription]
         * - [studyInstanceUid]
         * - [assignedTo]
         * - [expressCustomerId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
         * attention.
         */
        fun severity(severity: Severity) = apply { body.severity(severity) }

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { body.severity(severity) }

        /** Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT') */
        fun studyDescription(studyDescription: String) = apply {
            body.studyDescription(studyDescription)
        }

        /**
         * Sets [Builder.studyDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.studyDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun studyDescription(studyDescription: JsonField<String>) = apply {
            body.studyDescription(studyDescription)
        }

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

        /** User ID to assign the study to. Format: usr_{32-hex-chars} */
        fun assignedTo(assignedTo: String) = apply { body.assignedTo(assignedTo) }

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedTo(assignedTo: JsonField<String>) = apply { body.assignedTo(assignedTo) }

        /** Express customer ID for the study. Format: cus_{32-hex-chars} */
        fun expressCustomerId(expressCustomerId: String) = apply {
            body.expressCustomerId(expressCustomerId)
        }

        /**
         * Sets [Builder.expressCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expressCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expressCustomerId(expressCustomerId: JsonField<String>) = apply {
            body.expressCustomerId(expressCustomerId)
        }

        /**
         * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values
         * up to 1000 chars
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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
         * Returns an immutable instance of [StudyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .severity()
         * .studyDescription()
         * .studyInstanceUid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyCreateParams =
            StudyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for creating a study in Viewer */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val severity: JsonField<Severity>,
        private val studyDescription: JsonField<String>,
        private val studyInstanceUid: JsonField<String>,
        private val assignedTo: JsonField<String>,
        private val expressCustomerId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("studyDescription")
            @ExcludeMissing
            studyDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            studyInstanceUid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assignedTo")
            @ExcludeMissing
            assignedTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expressCustomerId")
            @ExcludeMissing
            expressCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(
            severity,
            studyDescription,
            studyInstanceUid,
            assignedTo,
            expressCustomerId,
            metadata,
            mutableMapOf(),
        )

        /**
         * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for immediate
         * attention.
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun severity(): Severity = severity.getRequired("severity")

        /**
         * Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyDescription(): String = studyDescription.getRequired("studyDescription")

        /**
         * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
         * '1.2.840.10008.5.1.4.1.1.2')
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

        /**
         * User ID to assign the study to. Format: usr_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignedTo(): Optional<String> = assignedTo.getOptional("assignedTo")

        /**
         * Express customer ID for the study. Format: cus_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expressCustomerId(): Optional<String> =
            expressCustomerId.getOptional("expressCustomerId")

        /**
         * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values
         * up to 1000 chars
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        /**
         * Returns the raw JSON value of [studyDescription].
         *
         * Unlike [studyDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("studyDescription")
        @ExcludeMissing
        fun _studyDescription(): JsonField<String> = studyDescription

        /**
         * Returns the raw JSON value of [studyInstanceUid].
         *
         * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("studyInstanceUid")
        @ExcludeMissing
        fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

        /**
         * Returns the raw JSON value of [assignedTo].
         *
         * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignedTo")
        @ExcludeMissing
        fun _assignedTo(): JsonField<String> = assignedTo

        /**
         * Returns the raw JSON value of [expressCustomerId].
         *
         * Unlike [expressCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expressCustomerId")
        @ExcludeMissing
        fun _expressCustomerId(): JsonField<String> = expressCustomerId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * .severity()
             * .studyDescription()
             * .studyInstanceUid()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var severity: JsonField<Severity>? = null
            private var studyDescription: JsonField<String>? = null
            private var studyInstanceUid: JsonField<String>? = null
            private var assignedTo: JsonField<String> = JsonMissing.of()
            private var expressCustomerId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                severity = body.severity
                studyDescription = body.studyDescription
                studyInstanceUid = body.studyInstanceUid
                assignedTo = body.assignedTo
                expressCustomerId = body.expressCustomerId
                metadata = body.metadata
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Priority level of a study. 'normal' for routine, 'high' for urgent, 'stat' for
             * immediate attention.
             */
            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            /** Description of the study/scan (e.g., 'Brain MRI with Contrast', 'Chest CT') */
            fun studyDescription(studyDescription: String) =
                studyDescription(JsonField.of(studyDescription))

            /**
             * Sets [Builder.studyDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.studyDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun studyDescription(studyDescription: JsonField<String>) = apply {
                this.studyDescription = studyDescription
            }

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

            /** User ID to assign the study to. Format: usr_{32-hex-chars} */
            fun assignedTo(assignedTo: String) = assignedTo(JsonField.of(assignedTo))

            /**
             * Sets [Builder.assignedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

            /** Express customer ID for the study. Format: cus_{32-hex-chars} */
            fun expressCustomerId(expressCustomerId: String) =
                expressCustomerId(JsonField.of(expressCustomerId))

            /**
             * Sets [Builder.expressCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expressCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expressCustomerId(expressCustomerId: JsonField<String>) = apply {
                this.expressCustomerId = expressCustomerId
            }

            /**
             * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars,
             * values up to 1000 chars
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * .severity()
             * .studyDescription()
             * .studyInstanceUid()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("severity", severity),
                    checkRequired("studyDescription", studyDescription),
                    checkRequired("studyInstanceUid", studyInstanceUid),
                    assignedTo,
                    expressCustomerId,
                    metadata,
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

            severity().validate()
            studyDescription()
            studyInstanceUid()
            assignedTo()
            expressCustomerId()
            metadata().ifPresent { it.validate() }
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
            (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (studyDescription.asKnown().isPresent) 1 else 0) +
                (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
                (if (assignedTo.asKnown().isPresent) 1 else 0) +
                (if (expressCustomerId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                severity == other.severity &&
                studyDescription == other.studyDescription &&
                studyInstanceUid == other.studyInstanceUid &&
                assignedTo == other.assignedTo &&
                expressCustomerId == other.expressCustomerId &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                severity,
                studyDescription,
                studyInstanceUid,
                assignedTo,
                expressCustomerId,
                metadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{severity=$severity, studyDescription=$studyDescription, studyInstanceUid=$studyInstanceUid, assignedTo=$assignedTo, expressCustomerId=$expressCustomerId, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /**
     * Custom key-value metadata for the study. Maximum 50 pairs, keys up to 100 chars, values up to
     * 1000 chars
     */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StudyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
