package de.tfr.slides.interoperabel


class CallJava {

    fun callJava() {
        val backend = LegacyJavaBackend()
        backend.sendEmailToAllOurCustomers("Be prepared... we deploy")
    }
}
