// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models

import com.avarasoftware.core.Enum
import com.avarasoftware.core.JsonField
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Viewport grid layout for an ephemeral hanging protocol. Wire values match first-party viewer
 * layouts ('1x1' through '4x4').
 */
class ViewerLayout @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ONE_BY_ONE = of("1x1")

        @JvmField val ONE_BY_TWO = of("1x2")

        @JvmField val ONE_BY_THREE = of("1x3")

        @JvmField val ONE_BY_FOUR = of("1x4")

        @JvmField val TWO_BY_ONE = of("2x1")

        @JvmField val TWO_BY_TWO = of("2x2")

        @JvmField val TWO_BY_THREE = of("2x3")

        @JvmField val TWO_BY_FOUR = of("2x4")

        @JvmField val THREE_BY_ONE = of("3x1")

        @JvmField val THREE_BY_TWO = of("3x2")

        @JvmField val THREE_BY_THREE = of("3x3")

        @JvmField val THREE_BY_FOUR = of("3x4")

        @JvmField val FOUR_BY_ONE = of("4x1")

        @JvmField val FOUR_BY_TWO = of("4x2")

        @JvmField val FOUR_BY_THREE = of("4x3")

        @JvmField val FOUR_BY_FOUR = of("4x4")

        @JvmStatic fun of(value: String) = ViewerLayout(JsonField.of(value))
    }

    /** An enum containing [ViewerLayout]'s known values. */
    enum class Known {
        ONE_BY_ONE,
        ONE_BY_TWO,
        ONE_BY_THREE,
        ONE_BY_FOUR,
        TWO_BY_ONE,
        TWO_BY_TWO,
        TWO_BY_THREE,
        TWO_BY_FOUR,
        THREE_BY_ONE,
        THREE_BY_TWO,
        THREE_BY_THREE,
        THREE_BY_FOUR,
        FOUR_BY_ONE,
        FOUR_BY_TWO,
        FOUR_BY_THREE,
        FOUR_BY_FOUR,
    }

    /**
     * An enum containing [ViewerLayout]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ViewerLayout] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ONE_BY_ONE,
        ONE_BY_TWO,
        ONE_BY_THREE,
        ONE_BY_FOUR,
        TWO_BY_ONE,
        TWO_BY_TWO,
        TWO_BY_THREE,
        TWO_BY_FOUR,
        THREE_BY_ONE,
        THREE_BY_TWO,
        THREE_BY_THREE,
        THREE_BY_FOUR,
        FOUR_BY_ONE,
        FOUR_BY_TWO,
        FOUR_BY_THREE,
        FOUR_BY_FOUR,
        /** An enum member indicating that [ViewerLayout] was instantiated with an unknown value. */
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
            ONE_BY_ONE -> Value.ONE_BY_ONE
            ONE_BY_TWO -> Value.ONE_BY_TWO
            ONE_BY_THREE -> Value.ONE_BY_THREE
            ONE_BY_FOUR -> Value.ONE_BY_FOUR
            TWO_BY_ONE -> Value.TWO_BY_ONE
            TWO_BY_TWO -> Value.TWO_BY_TWO
            TWO_BY_THREE -> Value.TWO_BY_THREE
            TWO_BY_FOUR -> Value.TWO_BY_FOUR
            THREE_BY_ONE -> Value.THREE_BY_ONE
            THREE_BY_TWO -> Value.THREE_BY_TWO
            THREE_BY_THREE -> Value.THREE_BY_THREE
            THREE_BY_FOUR -> Value.THREE_BY_FOUR
            FOUR_BY_ONE -> Value.FOUR_BY_ONE
            FOUR_BY_TWO -> Value.FOUR_BY_TWO
            FOUR_BY_THREE -> Value.FOUR_BY_THREE
            FOUR_BY_FOUR -> Value.FOUR_BY_FOUR
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
            ONE_BY_ONE -> Known.ONE_BY_ONE
            ONE_BY_TWO -> Known.ONE_BY_TWO
            ONE_BY_THREE -> Known.ONE_BY_THREE
            ONE_BY_FOUR -> Known.ONE_BY_FOUR
            TWO_BY_ONE -> Known.TWO_BY_ONE
            TWO_BY_TWO -> Known.TWO_BY_TWO
            TWO_BY_THREE -> Known.TWO_BY_THREE
            TWO_BY_FOUR -> Known.TWO_BY_FOUR
            THREE_BY_ONE -> Known.THREE_BY_ONE
            THREE_BY_TWO -> Known.THREE_BY_TWO
            THREE_BY_THREE -> Known.THREE_BY_THREE
            THREE_BY_FOUR -> Known.THREE_BY_FOUR
            FOUR_BY_ONE -> Known.FOUR_BY_ONE
            FOUR_BY_TWO -> Known.FOUR_BY_TWO
            FOUR_BY_THREE -> Known.FOUR_BY_THREE
            FOUR_BY_FOUR -> Known.FOUR_BY_FOUR
            else -> throw AvaraInvalidDataException("Unknown ViewerLayout: $value")
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
    fun validate(): ViewerLayout = apply {
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

        return other is ViewerLayout && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
