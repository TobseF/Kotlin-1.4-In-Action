package de.tfr.slides.lamdas

import java.util.*

fun localize(messageKey: String, translateable: (String, Locale) -> String): String {
    return translateable.invoke(messageKey, getCurrentUserLocale())
}

fun message(message: String, locale: Locale) = "Lorem ipsum"

fun getCurrentUserLocale(): Locale = Locale.GERMANY
