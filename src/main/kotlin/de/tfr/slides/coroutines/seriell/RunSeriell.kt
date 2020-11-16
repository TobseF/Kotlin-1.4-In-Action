package de.tfr.slides.coroutines.seriell

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val start = System.currentTimeMillis()


    val position = checkPosition()

    val weather = getWeather(position)

    playForecast(weather)


    println(System.currentTimeMillis() - start)
}



suspend fun checkPosition(): Position {
    delay(1000)
    println("🔍 Checked Position")
    return Position()
}

suspend fun getWeather(position: Position): Weather {
    delay(1000)
    println("☀ Checked Weather")
    return Weather()
}

suspend fun playForecast(weather: Weather) {
    delay(1000)
    println("🔊 Play Forecast")
}


class Position
class Weather
