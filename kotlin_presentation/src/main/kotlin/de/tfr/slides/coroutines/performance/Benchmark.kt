package de.tfr.slides.coroutines.performance

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import java.util.concurrent.atomic.AtomicLong
import java.time.Duration
import kotlin.system.measureTimeMillis

fun main() {
    loopWithThreads()
    loopWithCoroutine()
}

fun loopWithThreads() {
    val c = AtomicLong()
    println("🦙🦙🦙🦙🦙🦙🦙🦙🦙🦙")

    measureTime {
        for (i in 1..1_000_000L) {
            thread(start = true) {
                c.addAndGet(1).printProgress()
            }
        }
    }

}


fun loopWithCoroutine() {
    val c = AtomicLong()
    println("🦙🦙🦙🦙🦙🦙🦙🦙🦙🦙")

    measureTime {
        for (i in 1..1_000_000L)
            GlobalScope.launch {
                c.addAndGet(1).printProgress()
            }
    }

}


fun Long.printProgress() {
    if ((this % 100_000L) == 0L) {
        print("🥩")
    }
}

fun measureTime(block: () -> Unit) {
    val time = Duration.ofMillis(measureTimeMillis(block))
    println("\ntime: ${time.toMinutesPart()}m ${time.toSecondsPart()}s ${time.toMillisPart()}ms")
}
