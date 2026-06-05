// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.BaseDeserializer
import com.avara.core.BaseSerializer
import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.core.getOrThrow
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Union of all Avara webhook event types. Use the 'type' field to discriminate between event types.
 * Events: study.access_requested (synchronous), report.delivered (asynchronous),
 * secondary_capture.access_requested (synchronous).
 */
@JsonDeserialize(using = WebhookEvent.Deserializer::class)
@JsonSerialize(using = WebhookEvent.Serializer::class)
class WebhookEvent
private constructor(
    private val studyAccessRequested: StudyAccessRequestedEvent? = null,
    private val reportDelivered: ReportDeliveredEvent? = null,
    private val secondaryCaptureAccessRequested: SecondaryCaptureAccessRequested? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Webhook event sent when Avara needs presigned URLs for DICOM images. This is a synchronous
     * webhook - you must respond with the URLs within the request timeout.
     */
    fun studyAccessRequested(): Optional<StudyAccessRequestedEvent> =
        Optional.ofNullable(studyAccessRequested)

    /**
     * Webhook event sent when a report is completed. This is an asynchronous notification - respond
     * with a simple acknowledgment.
     */
    fun reportDelivered(): Optional<ReportDeliveredEvent> = Optional.ofNullable(reportDelivered)

    /**
     * Webhook event sent when Avara needs presigned UPLOAD URLs for a secondary capture DICOM. This
     * is a synchronous webhook - you must respond with the upload URLs within the request timeout.
     */
    fun secondaryCaptureAccessRequested(): Optional<SecondaryCaptureAccessRequested> =
        Optional.ofNullable(secondaryCaptureAccessRequested)

    fun isStudyAccessRequested(): Boolean = studyAccessRequested != null

    fun isReportDelivered(): Boolean = reportDelivered != null

    fun isSecondaryCaptureAccessRequested(): Boolean = secondaryCaptureAccessRequested != null

    /**
     * Webhook event sent when Avara needs presigned URLs for DICOM images. This is a synchronous
     * webhook - you must respond with the URLs within the request timeout.
     */
    fun asStudyAccessRequested(): StudyAccessRequestedEvent =
        studyAccessRequested.getOrThrow("studyAccessRequested")

    /**
     * Webhook event sent when a report is completed. This is an asynchronous notification - respond
     * with a simple acknowledgment.
     */
    fun asReportDelivered(): ReportDeliveredEvent = reportDelivered.getOrThrow("reportDelivered")

    /**
     * Webhook event sent when Avara needs presigned UPLOAD URLs for a secondary capture DICOM. This
     * is a synchronous webhook - you must respond with the upload URLs within the request timeout.
     */
    fun asSecondaryCaptureAccessRequested(): SecondaryCaptureAccessRequested =
        secondaryCaptureAccessRequested.getOrThrow("secondaryCaptureAccessRequested")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.avara.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = webhookEvent.accept(new WebhookEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitStudyAccessRequested(StudyAccessRequestedEvent studyAccessRequested) {
     *         return Optional.of(studyAccessRequested.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws AvaraInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and the
     *   current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            studyAccessRequested != null -> visitor.visitStudyAccessRequested(studyAccessRequested)
            reportDelivered != null -> visitor.visitReportDelivered(reportDelivered)
            secondaryCaptureAccessRequested != null ->
                visitor.visitSecondaryCaptureAccessRequested(secondaryCaptureAccessRequested)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws AvaraInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): WebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitStudyAccessRequested(
                    studyAccessRequested: StudyAccessRequestedEvent
                ) {
                    studyAccessRequested.validate()
                }

                override fun visitReportDelivered(reportDelivered: ReportDeliveredEvent) {
                    reportDelivered.validate()
                }

                override fun visitSecondaryCaptureAccessRequested(
                    secondaryCaptureAccessRequested: SecondaryCaptureAccessRequested
                ) {
                    secondaryCaptureAccessRequested.validate()
                }
            }
        )
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitStudyAccessRequested(
                    studyAccessRequested: StudyAccessRequestedEvent
                ) = studyAccessRequested.validity()

                override fun visitReportDelivered(reportDelivered: ReportDeliveredEvent) =
                    reportDelivered.validity()

                override fun visitSecondaryCaptureAccessRequested(
                    secondaryCaptureAccessRequested: SecondaryCaptureAccessRequested
                ) = secondaryCaptureAccessRequested.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookEvent &&
            studyAccessRequested == other.studyAccessRequested &&
            reportDelivered == other.reportDelivered &&
            secondaryCaptureAccessRequested == other.secondaryCaptureAccessRequested
    }

    override fun hashCode(): Int =
        Objects.hash(studyAccessRequested, reportDelivered, secondaryCaptureAccessRequested)

    override fun toString(): String =
        when {
            studyAccessRequested != null ->
                "WebhookEvent{studyAccessRequested=$studyAccessRequested}"
            reportDelivered != null -> "WebhookEvent{reportDelivered=$reportDelivered}"
            secondaryCaptureAccessRequested != null ->
                "WebhookEvent{secondaryCaptureAccessRequested=$secondaryCaptureAccessRequested}"
            _json != null -> "WebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid WebhookEvent")
        }

    companion object {

        /**
         * Webhook event sent when Avara needs presigned URLs for DICOM images. This is a
         * synchronous webhook - you must respond with the URLs within the request timeout.
         */
        @JvmStatic
        fun ofStudyAccessRequested(studyAccessRequested: StudyAccessRequestedEvent) =
            WebhookEvent(studyAccessRequested = studyAccessRequested)

        /**
         * Webhook event sent when a report is completed. This is an asynchronous notification -
         * respond with a simple acknowledgment.
         */
        @JvmStatic
        fun ofReportDelivered(reportDelivered: ReportDeliveredEvent) =
            WebhookEvent(reportDelivered = reportDelivered)

        /**
         * Webhook event sent when Avara needs presigned UPLOAD URLs for a secondary capture DICOM.
         * This is a synchronous webhook - you must respond with the upload URLs within the request
         * timeout.
         */
        @JvmStatic
        fun ofSecondaryCaptureAccessRequested(
            secondaryCaptureAccessRequested: SecondaryCaptureAccessRequested
        ) = WebhookEvent(secondaryCaptureAccessRequested = secondaryCaptureAccessRequested)
    }

    /**
     * An interface that defines how to map each variant of [WebhookEvent] to a value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Webhook event sent when Avara needs presigned URLs for DICOM images. This is a
         * synchronous webhook - you must respond with the URLs within the request timeout.
         */
        fun visitStudyAccessRequested(studyAccessRequested: StudyAccessRequestedEvent): T

        /**
         * Webhook event sent when a report is completed. This is an asynchronous notification -
         * respond with a simple acknowledgment.
         */
        fun visitReportDelivered(reportDelivered: ReportDeliveredEvent): T

        /**
         * Webhook event sent when Avara needs presigned UPLOAD URLs for a secondary capture DICOM.
         * This is a synchronous webhook - you must respond with the upload URLs within the request
         * timeout.
         */
        fun visitSecondaryCaptureAccessRequested(
            secondaryCaptureAccessRequested: SecondaryCaptureAccessRequested
        ): T

        /**
         * Maps an unknown variant of [WebhookEvent] to a value of type [T].
         *
         * An instance of [WebhookEvent] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws AvaraInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw AvaraInvalidDataException("Unknown WebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<WebhookEvent>(WebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): WebhookEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "study.access_requested" -> {
                    return tryDeserialize(node, jacksonTypeRef<StudyAccessRequestedEvent>())?.let {
                        WebhookEvent(studyAccessRequested = it, _json = json)
                    } ?: WebhookEvent(_json = json)
                }
                "report.delivered" -> {
                    return tryDeserialize(node, jacksonTypeRef<ReportDeliveredEvent>())?.let {
                        WebhookEvent(reportDelivered = it, _json = json)
                    } ?: WebhookEvent(_json = json)
                }
                "secondary_capture.access_requested" -> {
                    return tryDeserialize(node, jacksonTypeRef<SecondaryCaptureAccessRequested>())
                        ?.let { WebhookEvent(secondaryCaptureAccessRequested = it, _json = json) }
                        ?: WebhookEvent(_json = json)
                }
            }

            return WebhookEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<WebhookEvent>(WebhookEvent::class) {

        override fun serialize(
            value: WebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.studyAccessRequested != null ->
                    generator.writeObject(value.studyAccessRequested)
                value.reportDelivered != null -> generator.writeObject(value.reportDelivered)
                value.secondaryCaptureAccessRequested != null ->
                    generator.writeObject(value.secondaryCaptureAccessRequested)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid WebhookEvent")
            }
        }
    }

    /**
     * Webhook event sent when Avara needs presigned UPLOAD URLs for a secondary capture DICOM. This
     * is a synchronous webhook - you must respond with the upload URLs within the request timeout.
     */
    class SecondaryCaptureAccessRequested
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val data: JsonField<Data>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(id, data, type, mutableMapOf())

        /**
         * Unique webhook event ID. Format: whe_{32-hex-chars}
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Event payload containing study + (optional) series/SOP information for a secondary
         * capture upload
         *
         * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): Data = data.getRequired("data")

        /**
         * Event type identifier
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("secondary_capture.access_requested")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
             * Returns a mutable builder for constructing an instance of
             * [SecondaryCaptureAccessRequested].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .data()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SecondaryCaptureAccessRequested]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var data: JsonField<Data>? = null
            private var type: JsonValue = JsonValue.from("secondary_capture.access_requested")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(secondaryCaptureAccessRequested: SecondaryCaptureAccessRequested) =
                apply {
                    id = secondaryCaptureAccessRequested.id
                    data = secondaryCaptureAccessRequested.data
                    type = secondaryCaptureAccessRequested.type
                    additionalProperties =
                        secondaryCaptureAccessRequested.additionalProperties.toMutableMap()
                }

            /** Unique webhook event ID. Format: whe_{32-hex-chars} */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Event payload containing study + (optional) series/SOP information for a secondary
             * capture upload
             */
            fun data(data: Data) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("secondary_capture.access_requested")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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
             * Returns an immutable instance of [SecondaryCaptureAccessRequested].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .data()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SecondaryCaptureAccessRequested =
                SecondaryCaptureAccessRequested(
                    checkRequired("id", id),
                    checkRequired("data", data),
                    type,
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
        fun validate(): SecondaryCaptureAccessRequested = apply {
            if (validated) {
                return@apply
            }

            id()
            data().validate()
            _type().let {
                if (it != JsonValue.from("secondary_capture.access_requested")) {
                    throw AvaraInvalidDataException("'type' is invalid, received $it")
                }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                type.let {
                    if (it == JsonValue.from("secondary_capture.access_requested")) 1 else 0
                }

        /**
         * Event payload containing study + (optional) series/SOP information for a secondary
         * capture upload
         */
        class Data
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val studyId: JsonField<String>,
            private val studyInstanceUid: JsonField<String>,
            private val seriesInstanceUid: JsonField<String>,
            private val sopInstanceUid: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("studyId")
                @ExcludeMissing
                studyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("studyInstanceUid")
                @ExcludeMissing
                studyInstanceUid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("seriesInstanceUid")
                @ExcludeMissing
                seriesInstanceUid: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sopInstanceUid")
                @ExcludeMissing
                sopInstanceUid: JsonField<String> = JsonMissing.of(),
            ) : this(studyId, studyInstanceUid, seriesInstanceUid, sopInstanceUid, mutableMapOf())

            /**
             * Avara study ID. Format: stu_{32-hex-chars}
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun studyId(): String = studyId.getRequired("studyId")

            /**
             * DICOM Study Instance UID. Must be a valid DICOM UID format (e.g.,
             * '1.2.840.10008.5.1.4.1.1.2')
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun studyInstanceUid(): String = studyInstanceUid.getRequired("studyInstanceUid")

            /**
             * DICOM Series Instance UID generated for the new secondary capture series (when
             * available).
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun seriesInstanceUid(): Optional<String> =
                seriesInstanceUid.getOptional("seriesInstanceUid")

            /**
             * DICOM SOP Instance UID generated for the new secondary capture object (when
             * available).
             *
             * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sopInstanceUid(): Optional<String> = sopInstanceUid.getOptional("sopInstanceUid")

            /**
             * Returns the raw JSON value of [studyId].
             *
             * Unlike [studyId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("studyId") @ExcludeMissing fun _studyId(): JsonField<String> = studyId

            /**
             * Returns the raw JSON value of [studyInstanceUid].
             *
             * Unlike [studyInstanceUid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("studyInstanceUid")
            @ExcludeMissing
            fun _studyInstanceUid(): JsonField<String> = studyInstanceUid

            /**
             * Returns the raw JSON value of [seriesInstanceUid].
             *
             * Unlike [seriesInstanceUid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("seriesInstanceUid")
            @ExcludeMissing
            fun _seriesInstanceUid(): JsonField<String> = seriesInstanceUid

            /**
             * Returns the raw JSON value of [sopInstanceUid].
             *
             * Unlike [sopInstanceUid], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sopInstanceUid")
            @ExcludeMissing
            fun _sopInstanceUid(): JsonField<String> = sopInstanceUid

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
                 * Returns a mutable builder for constructing an instance of [Data].
                 *
                 * The following fields are required:
                 * ```java
                 * .studyId()
                 * .studyInstanceUid()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var studyId: JsonField<String>? = null
                private var studyInstanceUid: JsonField<String>? = null
                private var seriesInstanceUid: JsonField<String> = JsonMissing.of()
                private var sopInstanceUid: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    studyId = data.studyId
                    studyInstanceUid = data.studyInstanceUid
                    seriesInstanceUid = data.seriesInstanceUid
                    sopInstanceUid = data.sopInstanceUid
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                /** Avara study ID. Format: stu_{32-hex-chars} */
                fun studyId(studyId: String) = studyId(JsonField.of(studyId))

                /**
                 * Sets [Builder.studyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.studyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.studyInstanceUid] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun studyInstanceUid(studyInstanceUid: JsonField<String>) = apply {
                    this.studyInstanceUid = studyInstanceUid
                }

                /**
                 * DICOM Series Instance UID generated for the new secondary capture series (when
                 * available).
                 */
                fun seriesInstanceUid(seriesInstanceUid: String) =
                    seriesInstanceUid(JsonField.of(seriesInstanceUid))

                /**
                 * Sets [Builder.seriesInstanceUid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seriesInstanceUid] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun seriesInstanceUid(seriesInstanceUid: JsonField<String>) = apply {
                    this.seriesInstanceUid = seriesInstanceUid
                }

                /**
                 * DICOM SOP Instance UID generated for the new secondary capture object (when
                 * available).
                 */
                fun sopInstanceUid(sopInstanceUid: String) =
                    sopInstanceUid(JsonField.of(sopInstanceUid))

                /**
                 * Sets [Builder.sopInstanceUid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sopInstanceUid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sopInstanceUid(sopInstanceUid: JsonField<String>) = apply {
                    this.sopInstanceUid = sopInstanceUid
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .studyId()
                 * .studyInstanceUid()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Data =
                    Data(
                        checkRequired("studyId", studyId),
                        checkRequired("studyInstanceUid", studyInstanceUid),
                        seriesInstanceUid,
                        sopInstanceUid,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws AvaraInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                studyId()
                studyInstanceUid()
                seriesInstanceUid()
                sopInstanceUid()
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
                (if (studyId.asKnown().isPresent) 1 else 0) +
                    (if (studyInstanceUid.asKnown().isPresent) 1 else 0) +
                    (if (seriesInstanceUid.asKnown().isPresent) 1 else 0) +
                    (if (sopInstanceUid.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Data &&
                    studyId == other.studyId &&
                    studyInstanceUid == other.studyInstanceUid &&
                    seriesInstanceUid == other.seriesInstanceUid &&
                    sopInstanceUid == other.sopInstanceUid &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    studyId,
                    studyInstanceUid,
                    seriesInstanceUid,
                    sopInstanceUid,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{studyId=$studyId, studyInstanceUid=$studyInstanceUid, seriesInstanceUid=$seriesInstanceUid, sopInstanceUid=$sopInstanceUid, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SecondaryCaptureAccessRequested &&
                id == other.id &&
                data == other.data &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, data, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SecondaryCaptureAccessRequested{id=$id, data=$data, type=$type, additionalProperties=$additionalProperties}"
    }
}
