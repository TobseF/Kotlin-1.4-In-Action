package de.highlights.refied

import java.io.Serializable


fun main(args: Array<String>) {
    val count = getDataOrNull<Int>("count")
    // ⚡ val data  = getDataOrNull<Int>("data")

    val count2 = getDataOrNullCool<Int>("count")
    val data2 = getDataOrNullCool<Int>("data")
}

private inline fun <reified T> getDataOrNullCool(key: String): T? {
    println("Type:" + T::class.simpleName)
    return getSerializable(key) as? T
}

fun <T> getDataOrNull(key: String): T? {
    return getSerializable(key) as? T
}

fun getSerializable(key: String): Serializable? = when (key) {
    "count" -> 42
    "data" -> "Pony"
    else -> null
}