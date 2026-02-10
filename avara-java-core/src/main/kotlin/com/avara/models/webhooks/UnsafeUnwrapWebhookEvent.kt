// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.BaseDeserializer
import com.avara.core.BaseSerializer
import com.avara.core.JsonValue
import com.avara.core.getOrThrow
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Webhook event sent when Avara needs presigned URLs for DICOM images. This is a synchronous
 * webhook - you must respond with the URLs within the request timeout.
 */
@JsonDeserialize(using = UnsafeUnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnsafeUnwrapWebhookEvent.Serializer::class)
class UnsafeUnwrapWebhookEvent
private constructor(
    private val studyAccessRequested: StudyAccessRequestedEvent? = null,
    private val reportDelivered: ReportDeliveredEvent? = null,
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

    fun isStudyAccessRequested(): Boolean = studyAccessRequested != null

    fun isReportDelivered(): Boolean = reportDelivered != null

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

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            studyAccessRequested != null -> visitor.visitStudyAccessRequested(studyAccessRequested)
            reportDelivered != null -> visitor.visitReportDelivered(reportDelivered)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnsafeUnwrapWebhookEvent = apply {
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

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnsafeUnwrapWebhookEvent &&
            studyAccessRequested == other.studyAccessRequested &&
            reportDelivered == other.reportDelivered
    }

    override fun hashCode(): Int = Objects.hash(studyAccessRequested, reportDelivered)

    override fun toString(): String =
        when {
            studyAccessRequested != null ->
                "UnsafeUnwrapWebhookEvent{studyAccessRequested=$studyAccessRequested}"
            reportDelivered != null -> "UnsafeUnwrapWebhookEvent{reportDelivered=$reportDelivered}"
            _json != null -> "UnsafeUnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnsafeUnwrapWebhookEvent")
        }

    companion object {

        /**
         * Webhook event sent when Avara needs presigned URLs for DICOM images. This is a
         * synchronous webhook - you must respond with the URLs within the request timeout.
         */
        @JvmStatic
        fun ofStudyAccessRequested(studyAccessRequested: StudyAccessRequestedEvent) =
            UnsafeUnwrapWebhookEvent(studyAccessRequested = studyAccessRequested)

        /**
         * Webhook event sent when a report is completed. This is an asynchronous notification -
         * respond with a simple acknowledgment.
         */
        @JvmStatic
        fun ofReportDelivered(reportDelivered: ReportDeliveredEvent) =
            UnsafeUnwrapWebhookEvent(reportDelivered = reportDelivered)
    }

    /**
     * An interface that defines how to map each variant of [UnsafeUnwrapWebhookEvent] to a value of
     * type [T].
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
         * Maps an unknown variant of [UnsafeUnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnsafeUnwrapWebhookEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws AvaraInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw AvaraInvalidDataException("Unknown UnsafeUnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<UnsafeUnwrapWebhookEvent>(UnsafeUnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnsafeUnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "study.access_requested" -> {
                    return tryDeserialize(node, jacksonTypeRef<StudyAccessRequestedEvent>())?.let {
                        UnsafeUnwrapWebhookEvent(studyAccessRequested = it, _json = json)
                    } ?: UnsafeUnwrapWebhookEvent(_json = json)
                }
                "report.delivered" -> {
                    return tryDeserialize(node, jacksonTypeRef<ReportDeliveredEvent>())?.let {
                        UnsafeUnwrapWebhookEvent(reportDelivered = it, _json = json)
                    } ?: UnsafeUnwrapWebhookEvent(_json = json)
                }
            }

            return UnsafeUnwrapWebhookEvent(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<UnsafeUnwrapWebhookEvent>(UnsafeUnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnsafeUnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.studyAccessRequested != null ->
                    generator.writeObject(value.studyAccessRequested)
                value.reportDelivered != null -> generator.writeObject(value.reportDelivered)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnsafeUnwrapWebhookEvent")
            }
        }
    }
}
