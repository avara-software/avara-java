// File generated from our OpenAPI spec by Stainless.

package com.avarasoftware.models.autoscribe

import com.avarasoftware.core.Enum
import com.avarasoftware.core.JsonField
import com.avarasoftware.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * AutoScribe report workflow status for a study. 'unassigned' = no radiologist assigned, 'assigned'
 * = assigned but not started, 'in_progress' = actively being dictated, 'completed' = report signed,
 * 'addendum_active' = addendum in progress.
 */
class StudyReportStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val UNASSIGNED = of("unassigned")

        @JvmField val ASSIGNED = of("assigned")

        @JvmField val IN_PROGRESS = of("in_progress")

        @JvmField val COMPLETED = of("completed")

        @JvmField val ADDENDUM_ACTIVE = of("addendum_active")

        @JvmStatic fun of(value: String) = StudyReportStatus(JsonField.of(value))
    }

    /** An enum containing [StudyReportStatus]'s known values. */
    enum class Known {
        UNASSIGNED,
        ASSIGNED,
        IN_PROGRESS,
        COMPLETED,
        ADDENDUM_ACTIVE,
    }

    /**
     * An enum containing [StudyReportStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [StudyReportStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        UNASSIGNED,
        ASSIGNED,
        IN_PROGRESS,
        COMPLETED,
        ADDENDUM_ACTIVE,
        /**
         * An enum member indicating that [StudyReportStatus] was instantiated with an unknown
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
            UNASSIGNED -> Value.UNASSIGNED
            ASSIGNED -> Value.ASSIGNED
            IN_PROGRESS -> Value.IN_PROGRESS
            COMPLETED -> Value.COMPLETED
            ADDENDUM_ACTIVE -> Value.ADDENDUM_ACTIVE
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
            UNASSIGNED -> Known.UNASSIGNED
            ASSIGNED -> Known.ASSIGNED
            IN_PROGRESS -> Known.IN_PROGRESS
            COMPLETED -> Known.COMPLETED
            ADDENDUM_ACTIVE -> Known.ADDENDUM_ACTIVE
            else -> throw AvaraInvalidDataException("Unknown StudyReportStatus: $value")
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
    fun validate(): StudyReportStatus = apply {
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

        return other is StudyReportStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
