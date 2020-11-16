package de.tfr.slides.lamdas

import java.util.*

fun localize(messageKey: String, translateAble: (String, Locale) -> String): String {
    return translateAble.invoke(messageKey, getCurrentUserLocale())
}

fun message(message: String, locale: Locale) = "Lorem ipsum"

fun getCurrentUserLocale(): Locale = Locale.GERMANY
