package de.tfr.slides.operator


fun main() {
    test()
}

fun test() {
    val title = Message("The") + Message(" X Files")
    print(title)
}


data class Message(val text: String) {

    operator fun plus(message: Message): Message {
        return Message(text + message.text)
    }
}