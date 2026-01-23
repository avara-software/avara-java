package com.avara.errors

class AvaraInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : AvaraException(message, cause)
