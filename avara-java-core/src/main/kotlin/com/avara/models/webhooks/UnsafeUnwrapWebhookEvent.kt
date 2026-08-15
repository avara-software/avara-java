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
 * Webhook event sent when Avara needs presigned URLs for an ephemeral viewer session. This is a
 * synchronous webhook — you must respond with the URLs within the request timeout. There is no
 * Avara study; use retrievalId (and optional options) to resolve images.
 */
@JsonDeserialize(using = UnsafeUnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnsafeUnwrapWebhookEvent.Serializer::class)
class UnsafeUnwrapWebhookEvent
private constructor(
    private val ephemeralAccessRequested: EphemeralAccessRequestedEvent? = null,
    private val studyAccessRequested: StudyAccessRequestedEvent? = null,
    private val reportDelivered: ReportDeliveredEvent? = null,
    private val secondaryCaptureAccessRequested: SecondaryCaptureAccessRequestedEvent? = null,
    private val modalityWorklistRequested: ModalityWorklistRequestedEvent? = null,
    private val patientStudyEnrichmentRequested: PatientStudyEnrichmentRequestedEvent? = null,
    private val clinicalContextEnrichmentRequested: ClinicalContextEnrichmentRequestedEvent? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Webhook event sent when Avara needs presigned URLs for an ephemeral viewer session. This is a
     * synchronous webhook — you must respond with the URLs within the request timeout. There is no
     * Avara study; use retrievalId (and optional options) to resolve images.
     */
    fun ephemeralAccessRequested(): Optional<EphemeralAccessRequestedEvent> =
        Optional.ofNullable(ephemeralAccessRequested)

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
    fun secondaryCaptureAccessRequested(): Optional<SecondaryCaptureAccessRequestedEvent> =
        Optional.ofNullable(secondaryCaptureAccessRequested)

    /**
     * Webhook event sent when an on-prem modality issues a C-FIND MWL. This is a synchronous
     * webhook - you must respond with authorized + items within the request timeout.
     */
    fun modalityWorklistRequested(): Optional<ModalityWorklistRequestedEvent> =
        Optional.ofNullable(modalityWorklistRequested)

    /**
     * Soft synchronous webhook sent after Avara PACS seeds a study so the partner can enrich
     * demographics and report headers. Failures / timeouts / invalid bodies are treated as empty
     * enrichment.
     */
    fun patientStudyEnrichmentRequested(): Optional<PatientStudyEnrichmentRequestedEvent> =
        Optional.ofNullable(patientStudyEnrichmentRequested)

    /**
     * Soft synchronous webhook sent when AutoScribe needs clinical context from the partner EHR.
     * Failures / timeouts / invalid bodies are treated as empty enrichment.
     */
    fun clinicalContextEnrichmentRequested(): Optional<ClinicalContextEnrichmentRequestedEvent> =
        Optional.ofNullable(clinicalContextEnrichmentRequested)

    fun isEphemeralAccessRequested(): Boolean = ephemeralAccessRequested != null

    fun isStudyAccessRequested(): Boolean = studyAccessRequested != null

    fun isReportDelivered(): Boolean = reportDelivered != null

    fun isSecondaryCaptureAccessRequested(): Boolean = secondaryCaptureAccessRequested != null

    fun isModalityWorklistRequested(): Boolean = modalityWorklistRequested != null

    fun isPatientStudyEnrichmentRequested(): Boolean = patientStudyEnrichmentRequested != null

    fun isClinicalContextEnrichmentRequested(): Boolean = clinicalContextEnrichmentRequested != null

    /**
     * Webhook event sent when Avara needs presigned URLs for an ephemeral viewer session. This is a
     * synchronous webhook — you must respond with the URLs within the request timeout. There is no
     * Avara study; use retrievalId (and optional options) to resolve images.
     */
    fun asEphemeralAccessRequested(): EphemeralAccessRequestedEvent =
        ephemeralAccessRequested.getOrThrow("ephemeralAccessRequested")

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
    fun asSecondaryCaptureAccessRequested(): SecondaryCaptureAccessRequestedEvent =
        secondaryCaptureAccessRequested.getOrThrow("secondaryCaptureAccessRequested")

    /**
     * Webhook event sent when an on-prem modality issues a C-FIND MWL. This is a synchronous
     * webhook - you must respond with authorized + items within the request timeout.
     */
    fun asModalityWorklistRequested(): ModalityWorklistRequestedEvent =
        modalityWorklistRequested.getOrThrow("modalityWorklistRequested")

    /**
     * Soft synchronous webhook sent after Avara PACS seeds a study so the partner can enrich
     * demographics and report headers. Failures / timeouts / invalid bodies are treated as empty
     * enrichment.
     */
    fun asPatientStudyEnrichmentRequested(): PatientStudyEnrichmentRequestedEvent =
        patientStudyEnrichmentRequested.getOrThrow("patientStudyEnrichmentRequested")

    /**
     * Soft synchronous webhook sent when AutoScribe needs clinical context from the partner EHR.
     * Failures / timeouts / invalid bodies are treated as empty enrichment.
     */
    fun asClinicalContextEnrichmentRequested(): ClinicalContextEnrichmentRequestedEvent =
        clinicalContextEnrichmentRequested.getOrThrow("clinicalContextEnrichmentRequested")

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
     * Optional<String> result = unsafeUnwrapWebhookEvent.accept(new UnsafeUnwrapWebhookEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitEphemeralAccessRequested(EphemeralAccessRequestedEvent ephemeralAccessRequested) {
     *         return Optional.of(ephemeralAccessRequested.toString());
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
            ephemeralAccessRequested != null ->
                visitor.visitEphemeralAccessRequested(ephemeralAccessRequested)
            studyAccessRequested != null -> visitor.visitStudyAccessRequested(studyAccessRequested)
            reportDelivered != null -> visitor.visitReportDelivered(reportDelivered)
            secondaryCaptureAccessRequested != null ->
                visitor.visitSecondaryCaptureAccessRequested(secondaryCaptureAccessRequested)
            modalityWorklistRequested != null ->
                visitor.visitModalityWorklistRequested(modalityWorklistRequested)
            patientStudyEnrichmentRequested != null ->
                visitor.visitPatientStudyEnrichmentRequested(patientStudyEnrichmentRequested)
            clinicalContextEnrichmentRequested != null ->
                visitor.visitClinicalContextEnrichmentRequested(clinicalContextEnrichmentRequested)
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
    fun validate(): UnsafeUnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitEphemeralAccessRequested(
                    ephemeralAccessRequested: EphemeralAccessRequestedEvent
                ) {
                    ephemeralAccessRequested.validate()
                }

                override fun visitStudyAccessRequested(
                    studyAccessRequested: StudyAccessRequestedEvent
                ) {
                    studyAccessRequested.validate()
                }

                override fun visitReportDelivered(reportDelivered: ReportDeliveredEvent) {
                    reportDelivered.validate()
                }

                override fun visitSecondaryCaptureAccessRequested(
                    secondaryCaptureAccessRequested: SecondaryCaptureAccessRequestedEvent
                ) {
                    secondaryCaptureAccessRequested.validate()
                }

                override fun visitModalityWorklistRequested(
                    modalityWorklistRequested: ModalityWorklistRequestedEvent
                ) {
                    modalityWorklistRequested.validate()
                }

                override fun visitPatientStudyEnrichmentRequested(
                    patientStudyEnrichmentRequested: PatientStudyEnrichmentRequestedEvent
                ) {
                    patientStudyEnrichmentRequested.validate()
                }

                override fun visitClinicalContextEnrichmentRequested(
                    clinicalContextEnrichmentRequested: ClinicalContextEnrichmentRequestedEvent
                ) {
                    clinicalContextEnrichmentRequested.validate()
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
                override fun visitEphemeralAccessRequested(
                    ephemeralAccessRequested: EphemeralAccessRequestedEvent
                ) = ephemeralAccessRequested.validity()

                override fun visitStudyAccessRequested(
                    studyAccessRequested: StudyAccessRequestedEvent
                ) = studyAccessRequested.validity()

                override fun visitReportDelivered(reportDelivered: ReportDeliveredEvent) =
                    reportDelivered.validity()

                override fun visitSecondaryCaptureAccessRequested(
                    secondaryCaptureAccessRequested: SecondaryCaptureAccessRequestedEvent
                ) = secondaryCaptureAccessRequested.validity()

                override fun visitModalityWorklistRequested(
                    modalityWorklistRequested: ModalityWorklistRequestedEvent
                ) = modalityWorklistRequested.validity()

                override fun visitPatientStudyEnrichmentRequested(
                    patientStudyEnrichmentRequested: PatientStudyEnrichmentRequestedEvent
                ) = patientStudyEnrichmentRequested.validity()

                override fun visitClinicalContextEnrichmentRequested(
                    clinicalContextEnrichmentRequested: ClinicalContextEnrichmentRequestedEvent
                ) = clinicalContextEnrichmentRequested.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnsafeUnwrapWebhookEvent &&
            ephemeralAccessRequested == other.ephemeralAccessRequested &&
            studyAccessRequested == other.studyAccessRequested &&
            reportDelivered == other.reportDelivered &&
            secondaryCaptureAccessRequested == other.secondaryCaptureAccessRequested &&
            modalityWorklistRequested == other.modalityWorklistRequested &&
            patientStudyEnrichmentRequested == other.patientStudyEnrichmentRequested &&
            clinicalContextEnrichmentRequested == other.clinicalContextEnrichmentRequested
    }

    override fun hashCode(): Int =
        Objects.hash(
            ephemeralAccessRequested,
            studyAccessRequested,
            reportDelivered,
            secondaryCaptureAccessRequested,
            modalityWorklistRequested,
            patientStudyEnrichmentRequested,
            clinicalContextEnrichmentRequested,
        )

    override fun toString(): String =
        when {
            ephemeralAccessRequested != null ->
                "UnsafeUnwrapWebhookEvent{ephemeralAccessRequested=$ephemeralAccessRequested}"
            studyAccessRequested != null ->
                "UnsafeUnwrapWebhookEvent{studyAccessRequested=$studyAccessRequested}"
            reportDelivered != null -> "UnsafeUnwrapWebhookEvent{reportDelivered=$reportDelivered}"
            secondaryCaptureAccessRequested != null ->
                "UnsafeUnwrapWebhookEvent{secondaryCaptureAccessRequested=$secondaryCaptureAccessRequested}"
            modalityWorklistRequested != null ->
                "UnsafeUnwrapWebhookEvent{modalityWorklistRequested=$modalityWorklistRequested}"
            patientStudyEnrichmentRequested != null ->
                "UnsafeUnwrapWebhookEvent{patientStudyEnrichmentRequested=$patientStudyEnrichmentRequested}"
            clinicalContextEnrichmentRequested != null ->
                "UnsafeUnwrapWebhookEvent{clinicalContextEnrichmentRequested=$clinicalContextEnrichmentRequested}"
            _json != null -> "UnsafeUnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnsafeUnwrapWebhookEvent")
        }

    companion object {

        /**
         * Webhook event sent when Avara needs presigned URLs for an ephemeral viewer session. This
         * is a synchronous webhook — you must respond with the URLs within the request timeout.
         * There is no Avara study; use retrievalId (and optional options) to resolve images.
         */
        @JvmStatic
        fun ofEphemeralAccessRequested(ephemeralAccessRequested: EphemeralAccessRequestedEvent) =
            UnsafeUnwrapWebhookEvent(ephemeralAccessRequested = ephemeralAccessRequested)

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

        /**
         * Webhook event sent when Avara needs presigned UPLOAD URLs for a secondary capture DICOM.
         * This is a synchronous webhook - you must respond with the upload URLs within the request
         * timeout.
         */
        @JvmStatic
        fun ofSecondaryCaptureAccessRequested(
            secondaryCaptureAccessRequested: SecondaryCaptureAccessRequestedEvent
        ) =
            UnsafeUnwrapWebhookEvent(
                secondaryCaptureAccessRequested = secondaryCaptureAccessRequested
            )

        /**
         * Webhook event sent when an on-prem modality issues a C-FIND MWL. This is a synchronous
         * webhook - you must respond with authorized + items within the request timeout.
         */
        @JvmStatic
        fun ofModalityWorklistRequested(modalityWorklistRequested: ModalityWorklistRequestedEvent) =
            UnsafeUnwrapWebhookEvent(modalityWorklistRequested = modalityWorklistRequested)

        /**
         * Soft synchronous webhook sent after Avara PACS seeds a study so the partner can enrich
         * demographics and report headers. Failures / timeouts / invalid bodies are treated as
         * empty enrichment.
         */
        @JvmStatic
        fun ofPatientStudyEnrichmentRequested(
            patientStudyEnrichmentRequested: PatientStudyEnrichmentRequestedEvent
        ) =
            UnsafeUnwrapWebhookEvent(
                patientStudyEnrichmentRequested = patientStudyEnrichmentRequested
            )

        /**
         * Soft synchronous webhook sent when AutoScribe needs clinical context from the partner
         * EHR. Failures / timeouts / invalid bodies are treated as empty enrichment.
         */
        @JvmStatic
        fun ofClinicalContextEnrichmentRequested(
            clinicalContextEnrichmentRequested: ClinicalContextEnrichmentRequestedEvent
        ) =
            UnsafeUnwrapWebhookEvent(
                clinicalContextEnrichmentRequested = clinicalContextEnrichmentRequested
            )
    }

    /**
     * An interface that defines how to map each variant of [UnsafeUnwrapWebhookEvent] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /**
         * Webhook event sent when Avara needs presigned URLs for an ephemeral viewer session. This
         * is a synchronous webhook — you must respond with the URLs within the request timeout.
         * There is no Avara study; use retrievalId (and optional options) to resolve images.
         */
        fun visitEphemeralAccessRequested(
            ephemeralAccessRequested: EphemeralAccessRequestedEvent
        ): T

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
            secondaryCaptureAccessRequested: SecondaryCaptureAccessRequestedEvent
        ): T

        /**
         * Webhook event sent when an on-prem modality issues a C-FIND MWL. This is a synchronous
         * webhook - you must respond with authorized + items within the request timeout.
         */
        fun visitModalityWorklistRequested(
            modalityWorklistRequested: ModalityWorklistRequestedEvent
        ): T

        /**
         * Soft synchronous webhook sent after Avara PACS seeds a study so the partner can enrich
         * demographics and report headers. Failures / timeouts / invalid bodies are treated as
         * empty enrichment.
         */
        fun visitPatientStudyEnrichmentRequested(
            patientStudyEnrichmentRequested: PatientStudyEnrichmentRequestedEvent
        ): T

        /**
         * Soft synchronous webhook sent when AutoScribe needs clinical context from the partner
         * EHR. Failures / timeouts / invalid bodies are treated as empty enrichment.
         */
        fun visitClinicalContextEnrichmentRequested(
            clinicalContextEnrichmentRequested: ClinicalContextEnrichmentRequestedEvent
        ): T

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
                "ephemeral.access_requested" -> {
                    return tryDeserialize(node, jacksonTypeRef<EphemeralAccessRequestedEvent>())
                        ?.let {
                            UnsafeUnwrapWebhookEvent(ephemeralAccessRequested = it, _json = json)
                        } ?: UnsafeUnwrapWebhookEvent(_json = json)
                }
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
                "secondary_capture.access_requested" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<SecondaryCaptureAccessRequestedEvent>(),
                        )
                        ?.let {
                            UnsafeUnwrapWebhookEvent(
                                secondaryCaptureAccessRequested = it,
                                _json = json,
                            )
                        } ?: UnsafeUnwrapWebhookEvent(_json = json)
                }
                "modality_worklist.requested" -> {
                    return tryDeserialize(node, jacksonTypeRef<ModalityWorklistRequestedEvent>())
                        ?.let {
                            UnsafeUnwrapWebhookEvent(modalityWorklistRequested = it, _json = json)
                        } ?: UnsafeUnwrapWebhookEvent(_json = json)
                }
                "patient_study.enrichment_requested" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<PatientStudyEnrichmentRequestedEvent>(),
                        )
                        ?.let {
                            UnsafeUnwrapWebhookEvent(
                                patientStudyEnrichmentRequested = it,
                                _json = json,
                            )
                        } ?: UnsafeUnwrapWebhookEvent(_json = json)
                }
                "clinical_context.enrichment_requested" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ClinicalContextEnrichmentRequestedEvent>(),
                        )
                        ?.let {
                            UnsafeUnwrapWebhookEvent(
                                clinicalContextEnrichmentRequested = it,
                                _json = json,
                            )
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
                value.ephemeralAccessRequested != null ->
                    generator.writeObject(value.ephemeralAccessRequested)
                value.studyAccessRequested != null ->
                    generator.writeObject(value.studyAccessRequested)
                value.reportDelivered != null -> generator.writeObject(value.reportDelivered)
                value.secondaryCaptureAccessRequested != null ->
                    generator.writeObject(value.secondaryCaptureAccessRequested)
                value.modalityWorklistRequested != null ->
                    generator.writeObject(value.modalityWorklistRequested)
                value.patientStudyEnrichmentRequested != null ->
                    generator.writeObject(value.patientStudyEnrichmentRequested)
                value.clinicalContextEnrichmentRequested != null ->
                    generator.writeObject(value.clinicalContextEnrichmentRequested)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnsafeUnwrapWebhookEvent")
            }
        }
    }
}
