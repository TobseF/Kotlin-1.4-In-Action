package de.tfr.slides.coroutines.performance

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.time.Duration
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

const val loopCount = 100_000L

fun main() {
    loopWithThreads()
    loopWithCoroutine()
}

fun loopWithThreads() {
    val c = AtomicLong()
    println("🦙🦙🦙🦙🦙🦙🦙🦙🦙🦙")

    measureTime {
        for (i in 1..loopCount) {
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
        for (i in 1..loopCount)
            GlobalScope.launch {
                c.addAndGet(1).printProgress()
            }
    }

}


fun Long.printProgress() {
    if ((this % (loopCount / 10)) == 0L) {
        print("🥩")
    }
}

fun measureTime(block: () -> Unit) {
    val time = Duration.ofMillis(measureTimeMillis(block))
    println("\ntime: ${time.toMinutesPart()}m ${time.toSecondsPart()}s ${time.toMillisPart()}ms")
}
