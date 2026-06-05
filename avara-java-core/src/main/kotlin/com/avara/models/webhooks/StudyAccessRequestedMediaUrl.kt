// File generated from our OpenAPI spec by Stainless.

package com.avara.models.webhooks

import com.avara.core.ExcludeMissing
import com.avara.core.JsonField
import com.avara.core.JsonMissing
import com.avara.core.JsonValue
import com.avara.core.checkRequired
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Presigned URL for non-DICOM media (images, PDFs, videos) */
class StudyAccessRequestedMediaUrl
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mimeType: JsonField<String>,
    private val url: JsonField<String>,
    private val fileName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mimeType") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
    ) : this(mimeType, url, fileName, mutableMapOf())

    /**
     * MIME type of the media file (e.g., application/pdf, image/jpeg, video/mp4)
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mimeType(): String = mimeType.getRequired("mimeType")

    /**
     * Presigned URL to download the media file
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Optional display name for the media file
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileName(): Optional<String> = fileName.getOptional("fileName")

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mimeType") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [StudyAccessRequestedMediaUrl].
         *
         * The following fields are required:
         * ```java
         * .mimeType()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StudyAccessRequestedMediaUrl]. */
    class Builder internal constructor() {

        private var mimeType: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var fileName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(studyAccessRequestedMediaUrl: StudyAccessRequestedMediaUrl) = apply {
            mimeType = studyAccessRequestedMediaUrl.mimeType
            url = studyAccessRequestedMediaUrl.url
            fileName = studyAccessRequestedMediaUrl.fileName
            additionalProperties = studyAccessRequestedMediaUrl.additionalProperties.toMutableMap()
        }

        /** MIME type of the media file (e.g., application/pdf, image/jpeg, video/mp4) */
        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        /** Presigned URL to download the media file */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Optional display name for the media file */
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
         * Returns an immutable instance of [StudyAccessRequestedMediaUrl].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mimeType()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StudyAccessRequestedMediaUrl =
            StudyAccessRequestedMediaUrl(
                checkRequired("mimeType", mimeType),
                checkRequired("url", url),
                fileName,
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
    fun validate(): StudyAccessRequestedMediaUrl = apply {
        if (validated) {
            return@apply
        }

        mimeType()
        url()
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
        (if (mimeType.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (fileName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyAccessRequestedMediaUrl &&
            mimeType == other.mimeType &&
            url == other.url &&
            fileName == other.fileName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(mimeType, url, fileName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StudyAccessRequestedMediaUrl{mimeType=$mimeType, url=$url, fileName=$fileName, additionalProperties=$additionalProperties}"
}
