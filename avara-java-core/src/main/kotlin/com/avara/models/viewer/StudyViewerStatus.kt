// File generated from our OpenAPI spec by Stainless.

package com.avara.models.viewer

import com.avara.core.Enum
import com.avara.core.JsonField
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Viewer completion status for a study. 'incomplete' = not yet finished in the viewer, 'complete' =
 * finished.
 */
class StudyViewerStatus @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val INCOMPLETE = of("incomplete")

        @JvmField val COMPLETE = of("complete")

        @JvmStatic fun of(value: String) = StudyViewerStatus(JsonField.of(value))
    }

    /** An enum containing [StudyViewerStatus]'s known values. */
    enum class Known {
        INCOMPLETE,
        COMPLETE,
    }

    /**
     * An enum containing [StudyViewerStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [StudyViewerStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        INCOMPLETE,
        COMPLETE,
        /**
         * An enum member indicating that [StudyViewerStatus] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            INCOMPLETE -> Value.INCOMPLETE
            COMPLETE -> Value.COMPLETE
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws AvaraInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            INCOMPLETE -> Known.INCOMPLETE
            COMPLETE -> Known.COMPLETE
            else -> throw AvaraInvalidDataException("Unknown StudyViewerStatus: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws AvaraInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { AvaraInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws AvaraInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): StudyViewerStatus = apply {
        if (validated) {
            return@apply
        }

        known()
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
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StudyViewerStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
