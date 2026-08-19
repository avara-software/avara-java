// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.webhooks

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkKnown
import com.avarasoftware.core.toImmutable
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Soft enrichment response. No authorized field — return any subset of fields (including {}). */
class ClinicalContextEnrichmentRequestedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clinicalIndication: JsonField<String>,
    private val documents: JsonField<List<ClinicalContextEnrichmentDocument>>,
    private val documentUrls: JsonField<List<ClinicalContextEnrichmentDocumentUrl>>,
    private val priorReports: JsonField<List<ClinicalContextEnrichmentPriorReport>>,
    private val technologistNotes: JsonField<List<String>>,
    private val technologistTechnique: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clinicalIndication")
        @ExcludeMissing
        clinicalIndication: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<ClinicalContextEnrichmentDocument>> = JsonMissing.of(),
        @JsonProperty("documentUrls")
        @ExcludeMissing
        documentUrls: JsonField<List<ClinicalContextEnrichmentDocumentUrl>> = JsonMissing.of(),
        @JsonProperty("priorReports")
        @ExcludeMissing
        priorReports: JsonField<List<ClinicalContextEnrichmentPriorReport>> = JsonMissing.of(),
        @JsonProperty("technologistNotes")
        @ExcludeMissing
        technologistNotes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("technologistTechnique")
        @ExcludeMissing
        technologistTechnique: JsonField<String> = JsonMissing.of(),
    ) : this(
        clinicalIndication,
        documents,
        documentUrls,
        priorReports,
        technologistNotes,
        technologistTechnique,
        mutableMapOf(),
    )

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clinicalIndication(): Optional<String> =
        clinicalIndication.getOptional("clinicalIndication")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<ClinicalContextEnrichmentDocument>> =
        documents.getOptional("documents")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documentUrls(): Optional<List<ClinicalContextEnrichmentDocumentUrl>> =
        documentUrls.getOptional("documentUrls")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priorReports(): Optional<List<ClinicalContextEnrichmentPriorReport>> =
        priorReports.getOptional("priorReports")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistNotes(): Optional<List<String>> =
        technologistNotes.getOptional("technologistNotes")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun technologistTechnique(): Optional<String> =
        technologistTechnique.getOptional("technologistTechnique")

    /**
     * Returns the raw JSON value of [clinicalIndication].
     *
     * Unlike [clinicalIndication], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("clinicalIndication")
    @ExcludeMissing
    fun _clinicalIndication(): JsonField<String> = clinicalIndication

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<ClinicalContextEnrichmentDocument>> = documents

    /**
     * Returns the raw JSON value of [documentUrls].
     *
     * Unlike [documentUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentUrls")
    @ExcludeMissing
    fun _documentUrls(): JsonField<List<ClinicalContextEnrichmentDocumentUrl>> = documentUrls

    /**
     * Returns the raw JSON value of [priorReports].
     *
     * Unlike [priorReports], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priorReports")
    @ExcludeMissing
    fun _priorReports(): JsonField<List<ClinicalContextEnrichmentPriorReport>> = priorReports

    /**
     * Returns the raw JSON value of [technologistNotes].
     *
     * Unlike [technologistNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("technologistNotes")
    @ExcludeMissing
    fun _technologistNotes(): JsonField<List<String>> = technologistNotes

    /**
     * Returns the raw JSON value of [technologistTechnique].
     *
     * Unlike [technologistTechnique], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("technologistTechnique")
    @ExcludeMissing
    fun _technologistTechnique(): JsonField<String> = technologistTechnique

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
         * [ClinicalContextEnrichmentRequestedResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalContextEnrichmentRequestedResponse]. */
    class Builder internal constructor() {

        private var clinicalIndication: JsonField<String> = JsonMissing.of()
        private var documents: JsonField<MutableList<ClinicalContextEnrichmentDocument>>? = null
        private var documentUrls: JsonField<MutableList<ClinicalContextEnrichmentDocumentUrl>>? =
            null
        private var priorReports: JsonField<MutableList<ClinicalContextEnrichmentPriorReport>>? =
            null
        private var technologistNotes: JsonField<MutableList<String>>? = null
        private var technologistTechnique: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            clinicalContextEnrichmentRequestedResponse: ClinicalContextEnrichmentRequestedResponse
        ) = apply {
            clinicalIndication = clinicalContextEnrichmentRequestedResponse.clinicalIndication
            documents =
                clinicalContextEnrichmentRequestedResponse.documents.map { it.toMutableList() }
            documentUrls =
                clinicalContextEnrichmentRequestedResponse.documentUrls.map { it.toMutableList() }
            priorReports =
                clinicalContextEnrichmentRequestedResponse.priorReports.map { it.toMutableList() }
            technologistNotes =
                clinicalContextEnrichmentRequestedResponse.technologistNotes.map {
                    it.toMutableList()
                }
            technologistTechnique = clinicalContextEnrichmentRequestedResponse.technologistTechnique
            additionalProperties =
                clinicalContextEnrichmentRequestedResponse.additionalProperties.toMutableMap()
        }

        fun clinicalIndication(clinicalIndication: String) =
            clinicalIndication(JsonField.of(clinicalIndication))

        /**
         * Sets [Builder.clinicalIndication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clinicalIndication] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clinicalIndication(clinicalIndication: JsonField<String>) = apply {
            this.clinicalIndication = clinicalIndication
        }

        fun documents(documents: List<ClinicalContextEnrichmentDocument>) =
            documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed
         * `List<ClinicalContextEnrichmentDocument>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun documents(documents: JsonField<List<ClinicalContextEnrichmentDocument>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [ClinicalContextEnrichmentDocument] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: ClinicalContextEnrichmentDocument) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        fun documentUrls(documentUrls: List<ClinicalContextEnrichmentDocumentUrl>) =
            documentUrls(JsonField.of(documentUrls))

        /**
         * Sets [Builder.documentUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentUrls] with a well-typed
         * `List<ClinicalContextEnrichmentDocumentUrl>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun documentUrls(documentUrls: JsonField<List<ClinicalContextEnrichmentDocumentUrl>>) =
            apply {
                this.documentUrls = documentUrls.map { it.toMutableList() }
            }

        /**
         * Adds a single [ClinicalContextEnrichmentDocumentUrl] to [documentUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocumentUrl(documentUrl: ClinicalContextEnrichmentDocumentUrl) = apply {
            documentUrls =
                (documentUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documentUrls", it).add(documentUrl)
                }
        }

        fun priorReports(priorReports: List<ClinicalContextEnrichmentPriorReport>) =
            priorReports(JsonField.of(priorReports))

        /**
         * Sets [Builder.priorReports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priorReports] with a well-typed
         * `List<ClinicalContextEnrichmentPriorReport>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun priorReports(priorReports: JsonField<List<ClinicalContextEnrichmentPriorReport>>) =
            apply {
                this.priorReports = priorReports.map { it.toMutableList() }
            }

        /**
         * Adds a single [ClinicalContextEnrichmentPriorReport] to [priorReports].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriorReport(priorReport: ClinicalContextEnrichmentPriorReport) = apply {
            priorReports =
                (priorReports ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priorReports", it).add(priorReport)
                }
        }

        fun technologistNotes(technologistNotes: List<String>) =
            technologistNotes(JsonField.of(technologistNotes))

        /**
         * Sets [Builder.technologistNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technologistNotes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun technologistNotes(technologistNotes: JsonField<List<String>>) = apply {
            this.technologistNotes = technologistNotes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [technologistNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTechnologistNote(technologistNote: String) = apply {
            technologistNotes =
                (technologistNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("technologistNotes", it).add(technologistNote)
                }
        }

        fun technologistTechnique(technologistTechnique: String) =
            technologistTechnique(JsonField.of(technologistTechnique))

        /**
         * Sets [Builder.technologistTechnique] to an arbitrary JSON value.
         *
         * You should usually call [Builder.technologistTechnique] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun technologistTechnique(technologistTechnique: JsonField<String>) = apply {
            this.technologistTechnique = technologistTechnique
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
         * Returns an immutable instance of [ClinicalContextEnrichmentRequestedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClinicalContextEnrichmentRequestedResponse =
            ClinicalContextEnrichmentRequestedResponse(
                clinicalIndication,
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                (documentUrls ?: JsonMissing.of()).map { it.toImmutable() },
                (priorReports ?: JsonMissing.of()).map { it.toImmutable() },
                (technologistNotes ?: JsonMissing.of()).map { it.toImmutable() },
                technologistTechnique,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): ClinicalContextEnrichmentRequestedResponse = apply {
        if (validated) {
            return@apply
        }

        clinicalIndication()
        documents().ifPresent { it.forEach { it.validate() } }
        documentUrls().ifPresent { it.forEach { it.validate() } }
        priorReports().ifPresent { it.forEach { it.validate() } }
        technologistNotes()
        technologistTechnique()
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
        (if (clinicalIndication.asKnown().isPresent) 1 else 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (documentUrls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (priorReports.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (technologistNotes.asKnown().getOrNull()?.size ?: 0) +
            (if (technologistTechnique.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalContextEnrichmentRequestedResponse &&
            clinicalIndication == other.clinicalIndication &&
            documents == other.documents &&
            documentUrls == other.documentUrls &&
            priorReports == other.priorReports &&
            technologistNotes == other.technologistNotes &&
            technologistTechnique == other.technologistTechnique &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clinicalIndication,
            documents,
            documentUrls,
            priorReports,
            technologistNotes,
            technologistTechnique,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClinicalContextEnrichmentRequestedResponse{clinicalIndication=$clinicalIndication, documents=$documents, documentUrls=$documentUrls, priorReports=$priorReports, technologistNotes=$technologistNotes, technologistTechnique=$technologistTechnique, additionalProperties=$additionalProperties}"
}
