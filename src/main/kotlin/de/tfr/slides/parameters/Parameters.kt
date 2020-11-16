package de.tfr.slides.parameters

import java.time.Duration


fun sendMail(address: String, subject: String, message: String, cc: String, bcc: String, attachment: Attachment) {}

fun sendMailK(
    address: String, subject: String, message: String,
    cc: String, bcc: String = "", attachment: Attachment?,
    timeout: Duration
) {}

fun sendMailO(
    address: String = "", subject: String = "", message: String = "",
    cc: String = "", bcc: String = "", attachment: Attachment? = null,
    timeout: Duration = Duration.ofSeconds(100)
) {}

fun main() {
    sendMailO(address = "diskette@mail.org", message = "Your time is over")
}

class Attachment