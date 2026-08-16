// File generated from our OpenAPI spec by Stainless.

package com.avara.models

import com.avara.core.Enum
import com.avara.core.JsonField
import com.avara.errors.AvaraInvalidDataException
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

        @JvmField val _1X1 = of("1x1")

        @JvmField val _1X2 = of("1x2")

        @JvmField val _1X3 = of("1x3")

        @JvmField val _1X4 = of("1x4")

        @JvmField val _2X1 = of("2x1")

        @JvmField val _2X2 = of("2x2")

        @JvmField val _2X3 = of("2x3")

        @JvmField val _2X4 = of("2x4")

        @JvmField val _3X1 = of("3x1")

        @JvmField val _3X2 = of("3x2")

        @JvmField val _3X3 = of("3x3")

        @JvmField val _3X4 = of("3x4")

        @JvmField val _4X1 = of("4x1")

        @JvmField val _4X2 = of("4x2")

        @JvmField val _4X3 = of("4x3")

        @JvmField val _4X4 = of("4x4")

        @JvmStatic fun of(value: String) = ViewerLayout(JsonField.of(value))
    }

    /** An enum containing [ViewerLayout]'s known values. */
    enum class Known {
        _1X1,
        _1X2,
        _1X3,
        _1X4,
        _2X1,
        _2X2,
        _2X3,
        _2X4,
        _3X1,
        _3X2,
        _3X3,
        _3X4,
        _4X1,
        _4X2,
        _4X3,
        _4X4,
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
        _1X1,
        _1X2,
        _1X3,
        _1X4,
        _2X1,
        _2X2,
        _2X3,
        _2X4,
        _3X1,
        _3X2,
        _3X3,
        _3X4,
        _4X1,
        _4X2,
        _4X3,
        _4X4,
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
            _1X1 -> Value._1X1
            _1X2 -> Value._1X2
            _1X3 -> Value._1X3
            _1X4 -> Value._1X4
            _2X1 -> Value._2X1
            _2X2 -> Value._2X2
            _2X3 -> Value._2X3
            _2X4 -> Value._2X4
            _3X1 -> Value._3X1
            _3X2 -> Value._3X2
            _3X3 -> Value._3X3
            _3X4 -> Value._3X4
            _4X1 -> Value._4X1
            _4X2 -> Value._4X2
            _4X3 -> Value._4X3
            _4X4 -> Value._4X4
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
            _1X1 -> Known._1X1
            _1X2 -> Known._1X2
            _1X3 -> Known._1X3
            _1X4 -> Known._1X4
            _2X1 -> Known._2X1
            _2X2 -> Known._2X2
            _2X3 -> Known._2X3
            _2X4 -> Known._2X4
            _3X1 -> Known._3X1
            _3X2 -> Known._3X2
            _3X3 -> Known._3X3
            _3X4 -> Known._3X4
            _4X1 -> Known._4X1
            _4X2 -> Known._4X2
            _4X3 -> Known._4X3
            _4X4 -> Known._4X4
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
