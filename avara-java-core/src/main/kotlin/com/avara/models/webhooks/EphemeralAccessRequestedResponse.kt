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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Synchronous response with presigned DICOM URLs and optionally non-DICOM media. Optionally include
 * a manifests array (one study per item) to improve progressive loading of legacy DICOM; it is not
 * required.
 */
class EphemeralAccessRequestedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorized: JsonField<Boolean>,
    private val urls: JsonField<List<String>>,
    private val error: JsonField<String>,
    private val manifests: JsonField<List<StudyAccessRequestedManifest>>,
    private val mediaUrls: JsonField<List<StudyAccessRequestedMediaUrl>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorized")
        @ExcludeMissing
        authorized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manifests")
        @ExcludeMissing
        manifests: JsonField<List<StudyAccessRequestedManifest>> = JsonMissing.of(),
        @JsonProperty("mediaUrls")
        @ExcludeMissing
        mediaUrls: JsonField<List<StudyAccessRequestedMediaUrl>> = JsonMissing.of(),
    ) : this(authorized, urls, error, manifests, mediaUrls, mutableMapOf())

    /**
     * Whether access is authorized for this ephemeral session
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorized(): Boolean = authorized.getRequired("authorized")

    /**
     * Flat list of presigned URLs for DICOM images across the session.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun urls(): List<String> = urls.getRequired("urls")

    /**
     * Error message if authorization failed or URLs cannot be provided
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Optional sidecars, one study per item (an array, not a single object). Not required — omit if
     * you do not have them. Recommended when you can provide them, especially for very large or
     * multi-study legacy DICOM. Enables progressive loading so readers can scroll before every file
     * is parsed. Invalid or incomplete values are ignored; URLs still load.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manifests(): Optional<List<StudyAccessRequestedManifest>> =
        manifests.getOptional("manifests")

    /**
     * Optional presigned URLs for non-DICOM media (images, PDFs, videos).
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrls(): Optional<List<StudyAccessRequestedMediaUrl>> =
        mediaUrls.getOptional("mediaUrls")

    /**
     * Returns the raw JSON value of [authorized].
     *
     * Unlike [authorized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [manifests].
     *
     * Unlike [manifests], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifests")
    @ExcludeMissing
    fun _manifests(): JsonField<List<StudyAccessRequestedManifest>> = manifests

    /**
     * Returns the raw JSON value of [mediaUrls].
     *
     * Unlike [mediaUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mediaUrls")
    @ExcludeMissing
    fun _mediaUrls(): JsonField<List<StudyAccessRequestedMediaUrl>> = mediaUrls

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
         * [EphemeralAccessRequestedResponse].
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .urls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemeralAccessRequestedResponse]. */
    class Builder internal constructor() {

        private var authorized: JsonField<Boolean>? = null
        private var urls: JsonField<MutableList<String>>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var manifests: JsonField<MutableList<StudyAccessRequestedManifest>>? = null
        private var mediaUrls: JsonField<MutableList<StudyAccessRequestedMediaUrl>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ephemeralAccessRequestedResponse: EphemeralAccessRequestedResponse) =
            apply {
                authorized = ephemeralAccessRequestedResponse.authorized
                urls = ephemeralAccessRequestedResponse.urls.map { it.toMutableList() }
                error = ephemeralAccessRequestedResponse.error
                manifests = ephemeralAccessRequestedResponse.manifests.map { it.toMutableList() }
                mediaUrls = ephemeralAccessRequestedResponse.mediaUrls.map { it.toMutableList() }
                additionalProperties =
                    ephemeralAccessRequestedResponse.additionalProperties.toMutableMap()
            }

        /** Whether access is authorized for this ephemeral session */
        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * Sets [Builder.authorized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        /** Flat list of presigned URLs for DICOM images across the session. */
        fun urls(urls: List<String>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urls(urls: JsonField<List<String>>) = apply {
            this.urls = urls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) = apply {
            urls = (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
        }

        /** Error message if authorization failed or URLs cannot be provided */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /**
         * Optional sidecars, one study per item (an array, not a single object). Not required —
         * omit if you do not have them. Recommended when you can provide them, especially for very
         * large or multi-study legacy DICOM. Enables progressive loading so readers can scroll
         * before every file is parsed. Invalid or incomplete values are ignored; URLs still load.
         */
        fun manifests(manifests: List<StudyAccessRequestedManifest>) =
            manifests(JsonField.of(manifests))

        /**
         * Sets [Builder.manifests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifests] with a well-typed
         * `List<StudyAccessRequestedManifest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun manifests(manifests: JsonField<List<StudyAccessRequestedManifest>>) = apply {
            this.manifests = manifests.map { it.toMutableList() }
        }

        /**
         * Adds a single [StudyAccessRequestedManifest] to [manifests].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManifest(manifest: StudyAccessRequestedManifest) = apply {
            manifests =
                (manifests ?: JsonField.of(mutableListOf())).also {
                    checkKnown("manifests", it).add(manifest)
                }
        }

        /** Optional presigned URLs for non-DICOM media (images, PDFs, videos). */
        fun mediaUrls(mediaUrls: List<StudyAccessRequestedMediaUrl>) =
            mediaUrls(JsonField.of(mediaUrls))

        /**
         * Sets [Builder.mediaUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrls] with a well-typed
         * `List<StudyAccessRequestedMediaUrl>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun mediaUrls(mediaUrls: JsonField<List<StudyAccessRequestedMediaUrl>>) = apply {
            this.mediaUrls = mediaUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [StudyAccessRequestedMediaUrl] to [mediaUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMediaUrl(mediaUrl: StudyAccessRequestedMediaUrl) = apply {
            mediaUrls =
                (mediaUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mediaUrls", it).add(mediaUrl)
                }
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
         * Returns an immutable instance of [EphemeralAccessRequestedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .urls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemeralAccessRequestedResponse =
            EphemeralAccessRequestedResponse(
                checkRequired("authorized", authorized),
                checkRequired("urls", urls).map { it.toImmutable() },
                error,
                (manifests ?: JsonMissing.of()).map { it.toImmutable() },
                (mediaUrls ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): EphemeralAccessRequestedResponse = apply {
        if (validated) {
            return@apply
        }

        authorized()
        urls()
        error()
        manifests().ifPresent { it.forEach { it.validate() } }
        mediaUrls().ifPresent { it.forEach { it.validate() } }
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
        (if (authorized.asKnown().isPresent) 1 else 0) +
            (urls.asKnown().getOrNull()?.size ?: 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (manifests.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (mediaUrls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemeralAccessRequestedResponse &&
            authorized == other.authorized &&
            urls == other.urls &&
            error == other.error &&
            manifests == other.manifests &&
            mediaUrls == other.mediaUrls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authorized, urls, error, manifests, mediaUrls, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EphemeralAccessRequestedResponse{authorized=$authorized, urls=$urls, error=$error, manifests=$manifests, mediaUrls=$mediaUrls, additionalProperties=$additionalProperties}"
}
