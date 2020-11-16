package de.tfr.slides.`typealias`

typealias cm = Double

fun main() {
    cutTheRope( 20.0)
}

var ropeLength : cm = 100.0

fun cutTheRope(length: cm){
    ropeLength-= length
    println("New rope length: $ropeLength")
}

