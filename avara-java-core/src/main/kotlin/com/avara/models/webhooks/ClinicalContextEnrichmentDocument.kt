// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkKnown
import com.avara.core.checkRequired
import com.avara.core.toImmutable
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Inline text document for clinical history synthesize */
class ClinicalContextEnrichmentDocument
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<List<String>>,
    private val fileName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        content: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
    ) : this(content, fileName, mutableMapOf())

    /**
     * Text chunks for the document
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): List<String> = content.getRequired("content")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = fileName.getRequired("fileName")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<List<String>> = content

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

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
         * [ClinicalContextEnrichmentDocument].
         *
         * The following fields are required:
         * ```java
         * .content()
         * .fileName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClinicalContextEnrichmentDocument]. */
    class Builder internal constructor() {

        private var content: JsonField<MutableList<String>>? = null
        private var fileName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clinicalContextEnrichmentDocument: ClinicalContextEnrichmentDocument) =
            apply {
                content = clinicalContextEnrichmentDocument.content.map { it.toMutableList() }
                fileName = clinicalContextEnrichmentDocument.fileName
                additionalProperties =
                    clinicalContextEnrichmentDocument.additionalProperties.toMutableMap()
            }

        /** Text chunks for the document */
        fun content(content: List<String>) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun content(content: JsonField<List<String>>) = apply {
            this.content = content.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.content].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContent(content: String) = apply {
            this.content =
                (this.content ?: JsonField.of(mutableListOf())).also {
                    checkKnown("content", it).add(content)
                }
        }

        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

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
         * Returns an immutable instance of [ClinicalContextEnrichmentDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * .fileName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClinicalContextEnrichmentDocument =
            ClinicalContextEnrichmentDocument(
                checkRequired("content", content).map { it.toImmutable() },
                checkRequired("fileName", fileName),
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
    fun validate(): ClinicalContextEnrichmentDocument = apply {
        if (validated) {
            return@apply
        }

        content()
        fileName()
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
        (content.asKnown().getOrNull()?.size ?: 0) + (if (fileName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClinicalContextEnrichmentDocument &&
            content == other.content &&
            fileName == other.fileName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(content, fileName, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClinicalContextEnrichmentDocument{content=$content, fileName=$fileName, additionalProperties=$additionalProperties}"
}
