// File generated from our OpenAPI spec by Stainless.

package com.avara.models

import com.avara.core.Enum
import com.avara.core.JsonField
import com.avara.errors.AvaraInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** A user's clinical or organizational role within the clinic. */
class ClinicRole @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val DOCTOR = of("Doctor")

        @JvmField val PHYSICIAN = of("Physician")

        @JvmField val SURGEON = of("Surgeon")

        @JvmField val RADIOLOGIST = of("Radiologist")

        @JvmField val CARDIOLOGIST = of("Cardiologist")

        @JvmField val NEUROLOGIST = of("Neurologist")

        @JvmField val UROLOGIST = of("Urologist")

        @JvmField val GYNECOLOGIST = of("Gynecologist")

        @JvmField val ENDOCRINOLOGIST = of("Endocrinologist")

        @JvmField val ONCOLOGIST = of("Oncologist")

        @JvmField val RADIATION_ONCOLOGIST = of("Radiation Oncologist")

        @JvmField val HEMATOLOGIST = of("Hematologist")

        @JvmField val GASTROENTEROLOGIST = of("Gastroenterologist")

        @JvmField val PULMONOLOGIST = of("Pulmonologist")

        @JvmField val NEPHROLOGIST = of("Nephrologist")

        @JvmField val RHEUMATOLOGIST = of("Rheumatologist")

        @JvmField val DERMATOLOGIST = of("Dermatologist")

        @JvmField val OPHTHALMOLOGIST = of("Ophthalmologist")

        @JvmField val OTOLARYNGOLOGIST = of("Otolaryngologist")

        @JvmField val PEDIATRICIAN = of("Pediatrician")

        @JvmField val OBSTETRICIAN = of("Obstetrician")

        @JvmField val PSYCHIATRIST = of("Psychiatrist")

        @JvmField val ANESTHESIOLOGIST = of("Anesthesiologist")

        @JvmField val EMERGENCY_MEDICINE_PHYSICIAN = of("Emergency Medicine Physician")

        @JvmField val FAMILY_MEDICINE_PHYSICIAN = of("Family Medicine Physician")

        @JvmField val INTERNAL_MEDICINE_PHYSICIAN = of("Internal Medicine Physician")

        @JvmField val PATHOLOGIST = of("Pathologist")

        @JvmField val NUCLEAR_MEDICINE_PHYSICIAN = of("Nuclear Medicine Physician")

        @JvmField val PAIN_MANAGEMENT_SPECIALIST = of("Pain Management Specialist")

        @JvmField val INFECTIOUS_DISEASE_SPECIALIST = of("Infectious Disease Specialist")

        @JvmField val IMMUNOLOGIST = of("Immunologist")

        @JvmField val PHYSICIAN_ASSISTANT = of("Physician Assistant")

        @JvmField val NURSE_PRACTITIONER = of("Nurse Practitioner")

        @JvmField
        val CERTIFIED_REGISTERED_NURSE_ANESTHETIST = of("Certified Registered Nurse Anesthetist")

        @JvmField val PSYCHOLOGIST = of("Psychologist")

        @JvmField val MEDICAL_ASSISTANT = of("Medical Assistant")

        @JvmField val SCRIBE = of("Scribe")

        @JvmField val REGISTERED_NURSE = of("Registered Nurse")

        @JvmField val NURSE_MANAGER = of("Nurse Manager")

        @JvmField val PATIENT_CARE_COORDINATOR = of("Patient Care Coordinator")

        @JvmField val IMAGING_TECHNOLOGIST = of("Imaging Technologist")

        @JvmField val LABORATORY_TECHNICIAN = of("Laboratory Technician")

        @JvmField val MEDICAL_LABORATORY_SCIENTIST = of("Medical Laboratory Scientist")

        @JvmField val PATHOLOGISTS_ASSISTANT = of("Pathologists' Assistant")

        @JvmField val PHLEBOTOMIST = of("Phlebotomist")

        @JvmField val PHARMACIST = of("Pharmacist")

        @JvmField val PHARMACY_TECHNICIAN = of("Pharmacy Technician")

        @JvmField val PHYSICAL_THERAPIST = of("Physical Therapist")

        @JvmField val OCCUPATIONAL_THERAPIST = of("Occupational Therapist")

        @JvmField val SPEECH_LANGUAGE_PATHOLOGIST = of("Speech-Language Pathologist")

        @JvmField val RESPIRATORY_THERAPIST = of("Respiratory Therapist")

        @JvmField val NUTRITIONIST = of("Nutritionist")

        @JvmField val FRONT_DESK_OPERATOR = of("Front Desk Operator")

        @JvmField val REVENUE_CYCLE_MANAGER = of("Revenue Cycle Manager")

        @JvmField val ADMINISTRATIVE_DIRECTOR = of("Administrative Director")

        @JvmField val ADMINISTRATIVE_ASSISTANT = of("Administrative Assistant")

        @JvmField val LEGAL_ADMINISTRATOR = of("Legal Administrator")

        @JvmField val IT_ADMINISTRATOR = of("IT Administrator")

        @JvmField val IT_SUPPORT = of("IT Support")

        @JvmField val SOFTWARE_ENGINEER = of("Software Engineer")

        @JvmField val OTHER = of("Other")

        @JvmStatic fun of(value: String) = ClinicRole(JsonField.of(value))
    }

    /** An enum containing [ClinicRole]'s known values. */
    enum class Known {
        DOCTOR,
        PHYSICIAN,
        SURGEON,
        RADIOLOGIST,
        CARDIOLOGIST,
        NEUROLOGIST,
        UROLOGIST,
        GYNECOLOGIST,
        ENDOCRINOLOGIST,
        ONCOLOGIST,
        RADIATION_ONCOLOGIST,
        HEMATOLOGIST,
        GASTROENTEROLOGIST,
        PULMONOLOGIST,
        NEPHROLOGIST,
        RHEUMATOLOGIST,
        DERMATOLOGIST,
        OPHTHALMOLOGIST,
        OTOLARYNGOLOGIST,
        PEDIATRICIAN,
        OBSTETRICIAN,
        PSYCHIATRIST,
        ANESTHESIOLOGIST,
        EMERGENCY_MEDICINE_PHYSICIAN,
        FAMILY_MEDICINE_PHYSICIAN,
        INTERNAL_MEDICINE_PHYSICIAN,
        PATHOLOGIST,
        NUCLEAR_MEDICINE_PHYSICIAN,
        PAIN_MANAGEMENT_SPECIALIST,
        INFECTIOUS_DISEASE_SPECIALIST,
        IMMUNOLOGIST,
        PHYSICIAN_ASSISTANT,
        NURSE_PRACTITIONER,
        CERTIFIED_REGISTERED_NURSE_ANESTHETIST,
        PSYCHOLOGIST,
        MEDICAL_ASSISTANT,
        SCRIBE,
        REGISTERED_NURSE,
        NURSE_MANAGER,
        PATIENT_CARE_COORDINATOR,
        IMAGING_TECHNOLOGIST,
        LABORATORY_TECHNICIAN,
        MEDICAL_LABORATORY_SCIENTIST,
        PATHOLOGISTS_ASSISTANT,
        PHLEBOTOMIST,
        PHARMACIST,
        PHARMACY_TECHNICIAN,
        PHYSICAL_THERAPIST,
        OCCUPATIONAL_THERAPIST,
        SPEECH_LANGUAGE_PATHOLOGIST,
        RESPIRATORY_THERAPIST,
        NUTRITIONIST,
        FRONT_DESK_OPERATOR,
        REVENUE_CYCLE_MANAGER,
        ADMINISTRATIVE_DIRECTOR,
        ADMINISTRATIVE_ASSISTANT,
        LEGAL_ADMINISTRATOR,
        IT_ADMINISTRATOR,
        IT_SUPPORT,
        SOFTWARE_ENGINEER,
        OTHER,
    }

    /**
     * An enum containing [ClinicRole]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ClinicRole] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        DOCTOR,
        PHYSICIAN,
        SURGEON,
        RADIOLOGIST,
        CARDIOLOGIST,
        NEUROLOGIST,
        UROLOGIST,
        GYNECOLOGIST,
        ENDOCRINOLOGIST,
        ONCOLOGIST,
        RADIATION_ONCOLOGIST,
        HEMATOLOGIST,
        GASTROENTEROLOGIST,
        PULMONOLOGIST,
        NEPHROLOGIST,
        RHEUMATOLOGIST,
        DERMATOLOGIST,
        OPHTHALMOLOGIST,
        OTOLARYNGOLOGIST,
        PEDIATRICIAN,
        OBSTETRICIAN,
        PSYCHIATRIST,
        ANESTHESIOLOGIST,
        EMERGENCY_MEDICINE_PHYSICIAN,
        FAMILY_MEDICINE_PHYSICIAN,
        INTERNAL_MEDICINE_PHYSICIAN,
        PATHOLOGIST,
        NUCLEAR_MEDICINE_PHYSICIAN,
        PAIN_MANAGEMENT_SPECIALIST,
        INFECTIOUS_DISEASE_SPECIALIST,
        IMMUNOLOGIST,
        PHYSICIAN_ASSISTANT,
        NURSE_PRACTITIONER,
        CERTIFIED_REGISTERED_NURSE_ANESTHETIST,
        PSYCHOLOGIST,
        MEDICAL_ASSISTANT,
        SCRIBE,
        REGISTERED_NURSE,
        NURSE_MANAGER,
        PATIENT_CARE_COORDINATOR,
        IMAGING_TECHNOLOGIST,
        LABORATORY_TECHNICIAN,
        MEDICAL_LABORATORY_SCIENTIST,
        PATHOLOGISTS_ASSISTANT,
        PHLEBOTOMIST,
        PHARMACIST,
        PHARMACY_TECHNICIAN,
        PHYSICAL_THERAPIST,
        OCCUPATIONAL_THERAPIST,
        SPEECH_LANGUAGE_PATHOLOGIST,
        RESPIRATORY_THERAPIST,
        NUTRITIONIST,
        FRONT_DESK_OPERATOR,
        REVENUE_CYCLE_MANAGER,
        ADMINISTRATIVE_DIRECTOR,
        ADMINISTRATIVE_ASSISTANT,
        LEGAL_ADMINISTRATOR,
        IT_ADMINISTRATOR,
        IT_SUPPORT,
        SOFTWARE_ENGINEER,
        OTHER,
        /** An enum member indicating that [ClinicRole] was instantiated with an unknown value. */
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
            DOCTOR -> Value.DOCTOR
            PHYSICIAN -> Value.PHYSICIAN
            SURGEON -> Value.SURGEON
            RADIOLOGIST -> Value.RADIOLOGIST
            CARDIOLOGIST -> Value.CARDIOLOGIST
            NEUROLOGIST -> Value.NEUROLOGIST
            UROLOGIST -> Value.UROLOGIST
            GYNECOLOGIST -> Value.GYNECOLOGIST
            ENDOCRINOLOGIST -> Value.ENDOCRINOLOGIST
            ONCOLOGIST -> Value.ONCOLOGIST
            RADIATION_ONCOLOGIST -> Value.RADIATION_ONCOLOGIST
            HEMATOLOGIST -> Value.HEMATOLOGIST
            GASTROENTEROLOGIST -> Value.GASTROENTEROLOGIST
            PULMONOLOGIST -> Value.PULMONOLOGIST
            NEPHROLOGIST -> Value.NEPHROLOGIST
            RHEUMATOLOGIST -> Value.RHEUMATOLOGIST
            DERMATOLOGIST -> Value.DERMATOLOGIST
            OPHTHALMOLOGIST -> Value.OPHTHALMOLOGIST
            OTOLARYNGOLOGIST -> Value.OTOLARYNGOLOGIST
            PEDIATRICIAN -> Value.PEDIATRICIAN
            OBSTETRICIAN -> Value.OBSTETRICIAN
            PSYCHIATRIST -> Value.PSYCHIATRIST
            ANESTHESIOLOGIST -> Value.ANESTHESIOLOGIST
            EMERGENCY_MEDICINE_PHYSICIAN -> Value.EMERGENCY_MEDICINE_PHYSICIAN
            FAMILY_MEDICINE_PHYSICIAN -> Value.FAMILY_MEDICINE_PHYSICIAN
            INTERNAL_MEDICINE_PHYSICIAN -> Value.INTERNAL_MEDICINE_PHYSICIAN
            PATHOLOGIST -> Value.PATHOLOGIST
            NUCLEAR_MEDICINE_PHYSICIAN -> Value.NUCLEAR_MEDICINE_PHYSICIAN
            PAIN_MANAGEMENT_SPECIALIST -> Value.PAIN_MANAGEMENT_SPECIALIST
            INFECTIOUS_DISEASE_SPECIALIST -> Value.INFECTIOUS_DISEASE_SPECIALIST
            IMMUNOLOGIST -> Value.IMMUNOLOGIST
            PHYSICIAN_ASSISTANT -> Value.PHYSICIAN_ASSISTANT
            NURSE_PRACTITIONER -> Value.NURSE_PRACTITIONER
            CERTIFIED_REGISTERED_NURSE_ANESTHETIST -> Value.CERTIFIED_REGISTERED_NURSE_ANESTHETIST
            PSYCHOLOGIST -> Value.PSYCHOLOGIST
            MEDICAL_ASSISTANT -> Value.MEDICAL_ASSISTANT
            SCRIBE -> Value.SCRIBE
            REGISTERED_NURSE -> Value.REGISTERED_NURSE
            NURSE_MANAGER -> Value.NURSE_MANAGER
            PATIENT_CARE_COORDINATOR -> Value.PATIENT_CARE_COORDINATOR
            IMAGING_TECHNOLOGIST -> Value.IMAGING_TECHNOLOGIST
            LABORATORY_TECHNICIAN -> Value.LABORATORY_TECHNICIAN
            MEDICAL_LABORATORY_SCIENTIST -> Value.MEDICAL_LABORATORY_SCIENTIST
            PATHOLOGISTS_ASSISTANT -> Value.PATHOLOGISTS_ASSISTANT
            PHLEBOTOMIST -> Value.PHLEBOTOMIST
            PHARMACIST -> Value.PHARMACIST
            PHARMACY_TECHNICIAN -> Value.PHARMACY_TECHNICIAN
            PHYSICAL_THERAPIST -> Value.PHYSICAL_THERAPIST
            OCCUPATIONAL_THERAPIST -> Value.OCCUPATIONAL_THERAPIST
            SPEECH_LANGUAGE_PATHOLOGIST -> Value.SPEECH_LANGUAGE_PATHOLOGIST
            RESPIRATORY_THERAPIST -> Value.RESPIRATORY_THERAPIST
            NUTRITIONIST -> Value.NUTRITIONIST
            FRONT_DESK_OPERATOR -> Value.FRONT_DESK_OPERATOR
            REVENUE_CYCLE_MANAGER -> Value.REVENUE_CYCLE_MANAGER
            ADMINISTRATIVE_DIRECTOR -> Value.ADMINISTRATIVE_DIRECTOR
            ADMINISTRATIVE_ASSISTANT -> Value.ADMINISTRATIVE_ASSISTANT
            LEGAL_ADMINISTRATOR -> Value.LEGAL_ADMINISTRATOR
            IT_ADMINISTRATOR -> Value.IT_ADMINISTRATOR
            IT_SUPPORT -> Value.IT_SUPPORT
            SOFTWARE_ENGINEER -> Value.SOFTWARE_ENGINEER
            OTHER -> Value.OTHER
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
            DOCTOR -> Known.DOCTOR
            PHYSICIAN -> Known.PHYSICIAN
            SURGEON -> Known.SURGEON
            RADIOLOGIST -> Known.RADIOLOGIST
            CARDIOLOGIST -> Known.CARDIOLOGIST
            NEUROLOGIST -> Known.NEUROLOGIST
            UROLOGIST -> Known.UROLOGIST
            GYNECOLOGIST -> Known.GYNECOLOGIST
            ENDOCRINOLOGIST -> Known.ENDOCRINOLOGIST
            ONCOLOGIST -> Known.ONCOLOGIST
            RADIATION_ONCOLOGIST -> Known.RADIATION_ONCOLOGIST
            HEMATOLOGIST -> Known.HEMATOLOGIST
            GASTROENTEROLOGIST -> Known.GASTROENTEROLOGIST
            PULMONOLOGIST -> Known.PULMONOLOGIST
            NEPHROLOGIST -> Known.NEPHROLOGIST
            RHEUMATOLOGIST -> Known.RHEUMATOLOGIST
            DERMATOLOGIST -> Known.DERMATOLOGIST
            OPHTHALMOLOGIST -> Known.OPHTHALMOLOGIST
            OTOLARYNGOLOGIST -> Known.OTOLARYNGOLOGIST
            PEDIATRICIAN -> Known.PEDIATRICIAN
            OBSTETRICIAN -> Known.OBSTETRICIAN
            PSYCHIATRIST -> Known.PSYCHIATRIST
            ANESTHESIOLOGIST -> Known.ANESTHESIOLOGIST
            EMERGENCY_MEDICINE_PHYSICIAN -> Known.EMERGENCY_MEDICINE_PHYSICIAN
            FAMILY_MEDICINE_PHYSICIAN -> Known.FAMILY_MEDICINE_PHYSICIAN
            INTERNAL_MEDICINE_PHYSICIAN -> Known.INTERNAL_MEDICINE_PHYSICIAN
            PATHOLOGIST -> Known.PATHOLOGIST
            NUCLEAR_MEDICINE_PHYSICIAN -> Known.NUCLEAR_MEDICINE_PHYSICIAN
            PAIN_MANAGEMENT_SPECIALIST -> Known.PAIN_MANAGEMENT_SPECIALIST
            INFECTIOUS_DISEASE_SPECIALIST -> Known.INFECTIOUS_DISEASE_SPECIALIST
            IMMUNOLOGIST -> Known.IMMUNOLOGIST
            PHYSICIAN_ASSISTANT -> Known.PHYSICIAN_ASSISTANT
            NURSE_PRACTITIONER -> Known.NURSE_PRACTITIONER
            CERTIFIED_REGISTERED_NURSE_ANESTHETIST -> Known.CERTIFIED_REGISTERED_NURSE_ANESTHETIST
            PSYCHOLOGIST -> Known.PSYCHOLOGIST
            MEDICAL_ASSISTANT -> Known.MEDICAL_ASSISTANT
            SCRIBE -> Known.SCRIBE
            REGISTERED_NURSE -> Known.REGISTERED_NURSE
            NURSE_MANAGER -> Known.NURSE_MANAGER
            PATIENT_CARE_COORDINATOR -> Known.PATIENT_CARE_COORDINATOR
            IMAGING_TECHNOLOGIST -> Known.IMAGING_TECHNOLOGIST
            LABORATORY_TECHNICIAN -> Known.LABORATORY_TECHNICIAN
            MEDICAL_LABORATORY_SCIENTIST -> Known.MEDICAL_LABORATORY_SCIENTIST
            PATHOLOGISTS_ASSISTANT -> Known.PATHOLOGISTS_ASSISTANT
            PHLEBOTOMIST -> Known.PHLEBOTOMIST
            PHARMACIST -> Known.PHARMACIST
            PHARMACY_TECHNICIAN -> Known.PHARMACY_TECHNICIAN
            PHYSICAL_THERAPIST -> Known.PHYSICAL_THERAPIST
            OCCUPATIONAL_THERAPIST -> Known.OCCUPATIONAL_THERAPIST
            SPEECH_LANGUAGE_PATHOLOGIST -> Known.SPEECH_LANGUAGE_PATHOLOGIST
            RESPIRATORY_THERAPIST -> Known.RESPIRATORY_THERAPIST
            NUTRITIONIST -> Known.NUTRITIONIST
            FRONT_DESK_OPERATOR -> Known.FRONT_DESK_OPERATOR
            REVENUE_CYCLE_MANAGER -> Known.REVENUE_CYCLE_MANAGER
            ADMINISTRATIVE_DIRECTOR -> Known.ADMINISTRATIVE_DIRECTOR
            ADMINISTRATIVE_ASSISTANT -> Known.ADMINISTRATIVE_ASSISTANT
            LEGAL_ADMINISTRATOR -> Known.LEGAL_ADMINISTRATOR
            IT_ADMINISTRATOR -> Known.IT_ADMINISTRATOR
            IT_SUPPORT -> Known.IT_SUPPORT
            SOFTWARE_ENGINEER -> Known.SOFTWARE_ENGINEER
            OTHER -> Known.OTHER
            else -> throw AvaraInvalidDataException("Unknown ClinicRole: $value")
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
    fun validate(): ClinicRole = apply {
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

        return other is ClinicRole && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
