package de.tfr.slides.interoperabel

fun String.between(start: String, end: String): String {
    return this.substringAfter(start).substringBefore(end)
}
