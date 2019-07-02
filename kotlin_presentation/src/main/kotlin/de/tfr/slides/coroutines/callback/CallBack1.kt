package de.tfr.slides.coroutines.callback

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val app = app()

    (0..10).forEach {
        println("Having time " + it)
        delay(500)
    }

    app.join()

    println("finished")
}

fun app() = GlobalScope.launch {

    val start = System.currentTimeMillis()
    val position = checkPosition()
    val weather = getWeather(position)
    showWeather(weather)

    println(System.currentTimeMillis() - start)
}

suspend fun checkPosition(): Position {
    delay(1000)
    println("Checked Position")
    return Position()
}

fun getWeather(position: Position): Weather {
    Thread.sleep(1000)
    println("Checked Weather")
    return Weather()
}


fun showWeather(weather: Weather) {
    Thread.sleep(1000)
    println("Showed Weather")
}


class Position
class Weather

