package de.tfr.slides.coroutines.async

import kotlinx.coroutines.*


fun main(): Unit = runBlocking {
    val start = System.currentTimeMillis()

    val position = async { checkPosition() }
    println("Having so much time 💤")

    val weather = async { getWeather(position.await()) }
    println("We can do everything 💤")

    val forecast = launch { playForecast(weather.await()) }
    println("Lets count Kotlins 💤")

    forecast.join()
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