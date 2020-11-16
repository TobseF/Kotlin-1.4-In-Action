package de.tfr.slides.extensions

fun main() {
    val email = "Tobse4Git@gmail.com"
    email.toLowerCase()

    val username = "tobse"
    println(username.toFirstUpperCase())

}

fun String.toFirstUpperCase(): String {
    return if (this.isEmpty()) {
        ""
    } else {
        this[0].toTitleCase() + this.substring(1)
    }
}