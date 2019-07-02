package de.tfr.slides.coroutines.performance

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    loopWithThreads()
    loopWithCoroutine()
}

fun loopWithThreads() {
    val c = AtomicLong()

    val time = measureTimeMillis {
        for (i in 1..1_000_000L) {
            thread(start = true) {
                c.addAndGet(i)
            }
        }
    }

    println("time: ${time}ms ${c.get()}")

}

fun loopWithCoroutine() {
    val c = AtomicLong()

    val time = measureTimeMillis {
        for (i in 1..1_000_000L)
            GlobalScope.launch {
                c.addAndGet(i)
            }
    }
    println("time: ${time}ms ${c.get()}")

}