package de.tfr.slides.delegation

import kotlin.reflect.KProperty

var name by CountAccess()

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main() {
    name = "Hannibal"
    name = "Murdock"
    name = "Face"
    println(name)

    println(lazyValue)
    println(lazyValue)
}

class CountAccess {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Do you need help?"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("Hallo my name is $value... and I will help you'")
    }
}