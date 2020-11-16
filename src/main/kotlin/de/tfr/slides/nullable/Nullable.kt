package de.tfr.slides.nullable


fun main() {
    test()
}

fun test() {
    val company = loadCompany()
    println(company.name)

    val loadedCompany = loadCompanyByName("Die Anstalt")
    if (loadedCompany != null) {
        println(loadedCompany.name)
    }
}


fun loadCompany(): Company {
    return Company("Reynholm Industries")
}

fun loadCompanyByName(name: String): Company? {
    return Company(name)
}

class Company(val name: String)