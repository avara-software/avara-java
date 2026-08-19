// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models

import com.avarasoftware.core.ExcludeMissing
import com.avarasoftware.core.JsonField
import com.avarasoftware.core.JsonMissing
import com.avarasoftware.core.JsonValue
import com.avarasoftware.core.checkKnown
import com.avarasoftware.core.checkRequired
import com.avarasoftware.core.toImmutable
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Optional single-monitor hanging protocol applied when the ephemeral viewer loads. Omitted = no
 * protocol. Invalid shape is rejected.
 */
class EphemeralHangingProtocol
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val layout: JsonField<ViewerLayout>,
    private val viewportAssignments: JsonField<List<String?>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("layout") @ExcludeMissing layout: JsonField<ViewerLayout> = JsonMissing.of(),
        @JsonProperty("viewportAssignments")
        @ExcludeMissing
        viewportAssignments: JsonField<List<String?>> = JsonMissing.of(),
    ) : this(layout, viewportAssignments, mutableMapOf())

    /**
     * Viewport grid layout for an ephemeral hanging protocol. Wire values match first-party viewer
     * layouts ('1x1' through '4x4').
     *
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun layout(): ViewerLayout = layout.getRequired("layout")

    /**
     * @throws AvaraInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun viewportAssignments(): List<String?> =
        viewportAssignments.getRequired("viewportAssignments")

    /**
     * Returns the raw JSON value of [layout].
     *
     * Unlike [layout], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("layout") @ExcludeMissing fun _layout(): JsonField<ViewerLayout> = layout

    /**
     * Returns the raw JSON value of [viewportAssignments].
     *
     * Unlike [viewportAssignments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("viewportAssignments")
    @ExcludeMissing
    fun _viewportAssignments(): JsonField<List<String?>> = viewportAssignments

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
         * Returns a mutable builder for constructing an instance of [EphemeralHangingProtocol].
         *
         * The following fields are required:
         * ```java
         * .layout()
         * .viewportAssignments()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EphemeralHangingProtocol]. */
    class Builder internal constructor() {

        private var layout: JsonField<ViewerLayout>? = null
        private var viewportAssignments: JsonField<MutableList<String?>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ephemeralHangingProtocol: EphemeralHangingProtocol) = apply {
            layout = ephemeralHangingProtocol.layout
            viewportAssignments =
                ephemeralHangingProtocol.viewportAssignments.map { it.toMutableList() }
            additionalProperties = ephemeralHangingProtocol.additionalProperties.toMutableMap()
        }

        /**
         * Viewport grid layout for an ephemeral hanging protocol. Wire values match first-party
         * viewer layouts ('1x1' through '4x4').
         */
        fun layout(layout: ViewerLayout) = layout(JsonField.of(layout))

        /**
         * Sets [Builder.layout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.layout] with a well-typed [ViewerLayout] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun layout(layout: JsonField<ViewerLayout>) = apply { this.layout = layout }

        fun viewportAssignments(viewportAssignments: List<String?>) =
            viewportAssignments(JsonField.of(viewportAssignments))

        /**
         * Sets [Builder.viewportAssignments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.viewportAssignments] with a well-typed `List<String?>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun viewportAssignments(viewportAssignments: JsonField<List<String?>>) = apply {
            this.viewportAssignments = viewportAssignments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [viewportAssignments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addViewportAssignment(viewportAssignment: String) = apply {
            viewportAssignments =
                (viewportAssignments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("viewportAssignments", it).add(viewportAssignment)
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
         * Returns an immutable instance of [EphemeralHangingProtocol].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .layout()
         * .viewportAssignments()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EphemeralHangingProtocol =
            EphemeralHangingProtocol(
                checkRequired("layout", layout),
                checkRequired("viewportAssignments", viewportAssignments).map { it.toImmutable() },
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
    fun validate(): EphemeralHangingProtocol = apply {
        if (validated) {
            return@apply
        }

        layout().validate()
        viewportAssignments()
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
        (layout.asKnown().getOrNull()?.validity() ?: 0) +
            (viewportAssignments.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() }
                ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EphemeralHangingProtocol &&
            layout == other.layout &&
            viewportAssignments == other.viewportAssignments &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(layout, viewportAssignments, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EphemeralHangingProtocol{layout=$layout, viewportAssignments=$viewportAssignments, additionalProperties=$additionalProperties}"
}
