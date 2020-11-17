package de.tfr.slides.functional_interfaces


fun interface Runnable {
    fun run()
}


fun executeThisStuff(runnable: Runnable) {
    runnable.run()
}


fun main() {
    executeThisStuff { println("Job 1") }
}

