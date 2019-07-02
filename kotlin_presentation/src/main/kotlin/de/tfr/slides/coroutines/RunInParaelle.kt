package de.tfr.slides.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("main: ${Thread.currentThread()}")
    app()
    println("Finished")
}

fun app() = GlobalScope.launch  {

    val start = System.currentTimeMillis()

    launch {checkPosition()}
    launch {checkWeather()}
    launch { showWeather() }

    println(System.currentTimeMillis() - start)
}

suspend fun checkPosition() {
    delay(1000)
    println("Checked Calendar")
    println()
}

fun showWeather() {
    Thread.sleep(1000)
    println("Checked Sensor")
}

fun checkWeather() {
    Thread.sleep(1000)
    println("Checked Weather")
}
