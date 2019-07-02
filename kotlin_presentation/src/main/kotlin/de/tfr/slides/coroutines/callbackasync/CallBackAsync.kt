package de.tfr.slides.coroutines.callbackasync

import kotlinx.coroutines.*

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
    val position = async { checkPosition() }
    println("Having so much time")
    val weather =  async {getWeather(position.await()) }
    showWeather(weather.await())

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

