package de.tfr.slides.lists

fun fixedList() {
    val daltons = listOf("Joe", "William", "Jack", "Averell ")
    // daltons += "Luckey Luke" // compile error
}

fun mutable() {
    val characters = mutableListOf("Joe", "William", "Jack", "Averell ")
    characters += "Luckey Luke"
}

fun fixedVar() {
    var characters = listOf("Joe", "William", "Jack", "Averell ")
    characters = mutableListOf("Joe", "William", "Jack", "Averell ")
}


fun main() {
    fixedVar()
}