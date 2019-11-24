package de.tfr.slides.coroutines.sequence

val fibonacci = sequence {

    yield(1) // first Fibonacci number

    var current = 1
    var next = 1

    while (true) {

        yield(next) // next Fibonacci number

        val tmp = current + next
        current = next
        next = tmp
    }

}

fun main() {
    println(fibonacci.take(42).joinToString())
}