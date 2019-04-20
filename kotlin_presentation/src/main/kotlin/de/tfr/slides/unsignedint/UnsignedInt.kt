package de.tfr.slides.unsignedint


fun main() {
    val theAnswer = 42u
    pronounce(theAnswer)
    pronounce(42.toUInt())
    //pronounce(42) // ⚡ Compile error
}

fun pronounce(answer: UInt){
    print("The answer is $answer")
}


