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
 * Response expected by Avara for the secondary capture webhook. Provide presigned PUT URLs the
 * viewer will upload the DICOM to.
 */
class SecondaryCaptureAccessRequestedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authorized: JsonField<Boolean>,
    private val uploadUrls: JsonField<List<String>>,
    private val contentCreatorName: JsonField<String>,
    private val error: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorized")
        @ExcludeMissing
        authorized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("uploadUrls")
        @ExcludeMissing
        uploadUrls: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("contentCreatorName")
        @ExcludeMissing
        contentCreatorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
    ) : this(authorized, uploadUrls, contentCreatorName, error, mutableMapOf())

    /**
     * Whether the secondary capture upload is authorized for this study
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorized(): Boolean = authorized.getRequired("authorized")

    /**
     * Presigned PUT URLs for uploading the secondary capture DICOM. The viewer uploads the same
     * object to every URL.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadUrls(): List<String> = uploadUrls.getRequired("uploadUrls")

    /**
     * Optional content creator name. Avara derives this server-side; this field is ignored if
     * provided.
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentCreatorName(): Optional<String> =
        contentCreatorName.getOptional("contentCreatorName")

    /**
     * Error message if authorization failed or upload URLs cannot be provided
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Returns the raw JSON value of [authorized].
     *
     * Unlike [authorized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /**
     * Returns the raw JSON value of [uploadUrls].
     *
     * Unlike [uploadUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uploadUrls")
    @ExcludeMissing
    fun _uploadUrls(): JsonField<List<String>> = uploadUrls

    /**
     * Returns the raw JSON value of [contentCreatorName].
     *
     * Unlike [contentCreatorName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contentCreatorName")
    @ExcludeMissing
    fun _contentCreatorName(): JsonField<String> = contentCreatorName

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
         * [SecondaryCaptureAccessRequestedResponse].
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .uploadUrls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecondaryCaptureAccessRequestedResponse]. */
    class Builder internal constructor() {

        private var authorized: JsonField<Boolean>? = null
        private var uploadUrls: JsonField<MutableList<String>>? = null
        private var contentCreatorName: JsonField<String> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            secondaryCaptureAccessRequestedResponse: SecondaryCaptureAccessRequestedResponse
        ) = apply {
            authorized = secondaryCaptureAccessRequestedResponse.authorized
            uploadUrls =
                secondaryCaptureAccessRequestedResponse.uploadUrls.map { it.toMutableList() }
            contentCreatorName = secondaryCaptureAccessRequestedResponse.contentCreatorName
            error = secondaryCaptureAccessRequestedResponse.error
            additionalProperties =
                secondaryCaptureAccessRequestedResponse.additionalProperties.toMutableMap()
        }

        /** Whether the secondary capture upload is authorized for this study */
        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * Sets [Builder.authorized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        /**
         * Presigned PUT URLs for uploading the secondary capture DICOM. The viewer uploads the same
         * object to every URL.
         */
        fun uploadUrls(uploadUrls: List<String>) = uploadUrls(JsonField.of(uploadUrls))

        /**
         * Sets [Builder.uploadUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun uploadUrls(uploadUrls: JsonField<List<String>>) = apply {
            this.uploadUrls = uploadUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [uploadUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUploadUrl(uploadUrl: String) = apply {
            uploadUrls =
                (uploadUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("uploadUrls", it).add(uploadUrl)
                }
        }

        /**
         * Optional content creator name. Avara derives this server-side; this field is ignored if
         * provided.
         */
        fun contentCreatorName(contentCreatorName: String) =
            contentCreatorName(JsonField.of(contentCreatorName))

        /**
         * Sets [Builder.contentCreatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentCreatorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentCreatorName(contentCreatorName: JsonField<String>) = apply {
            this.contentCreatorName = contentCreatorName
        }

        /** Error message if authorization failed or upload URLs cannot be provided */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

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
         * Returns an immutable instance of [SecondaryCaptureAccessRequestedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authorized()
         * .uploadUrls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SecondaryCaptureAccessRequestedResponse =
            SecondaryCaptureAccessRequestedResponse(
                checkRequired("authorized", authorized),
                checkRequired("uploadUrls", uploadUrls).map { it.toImmutable() },
                contentCreatorName,
                error,
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
    fun validate(): SecondaryCaptureAccessRequestedResponse = apply {
        if (validated) {
            return@apply
        }

        authorized()
        uploadUrls()
        contentCreatorName()
        error()
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
            (uploadUrls.asKnown().getOrNull()?.size ?: 0) +
            (if (contentCreatorName.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecondaryCaptureAccessRequestedResponse &&
            authorized == other.authorized &&
            uploadUrls == other.uploadUrls &&
            contentCreatorName == other.contentCreatorName &&
            error == other.error &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authorized, uploadUrls, contentCreatorName, error, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SecondaryCaptureAccessRequestedResponse{authorized=$authorized, uploadUrls=$uploadUrls, contentCreatorName=$contentCreatorName, error=$error, additionalProperties=$additionalProperties}"
}
