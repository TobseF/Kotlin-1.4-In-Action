package de.tfr.slides.inlineclasses

inline class CM(val number: Double = 1.0) {
    fun toInch() = number * 2.54
    fun toFeet() = number * 0.0328084

    override fun toString(): String {
        return "$number cm"
    }
}

fun main() {
    println(CM(1.0))
    println(CM(1.0).toFeet())
    println(CM(1.0).toInch())
    cutTheRope(length = CM(20.0))
    weeNeedBoxedValue(CM(1.0))
}

var ropeLength = CM(100.0)

fun cutTheRope(length: CM) {
    ropeLength = CM(ropeLength.number - length.number)
    if (ropeLength.number > 0) {
        println("Remaining rope: $ropeLength")
    } else {
        ropeLength = CM(0.0)
        println("I have no rope")
    }
}

fun weeNeedBoxedValue(value: CM?) {
    value?.apply(::println)
}

