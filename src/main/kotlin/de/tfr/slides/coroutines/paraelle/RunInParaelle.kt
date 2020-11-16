package de.tfr.slides.coroutines.paraelle

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val start = System.currentTimeMillis()

    val position = launch { checkPosition() }
    println("Having so much time 💤")

    val weather = launch { getWeather() }
    println("We can do everything 💤")

    val forecast = launch { playForecast() }
    println("Lets count Kotlins 💤")

    forecast.join()
    position.join()
    weather.join()
    println(System.currentTimeMillis() - start)
}

suspend fun checkPosition(): Position {
    delay(1000)
    println("🔍 Checked Position")
    return Position()
}

suspend fun getWeather(): Weather {
    delay(1000)
    println("☀ Checked Weather")
    return Weather()
}

suspend fun playForecast() {
    delay(1000)
    println("🔊 Play Forecast")
}


class Position
class Weather