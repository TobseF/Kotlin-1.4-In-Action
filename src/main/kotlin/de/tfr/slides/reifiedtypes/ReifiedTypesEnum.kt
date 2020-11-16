package de.highlights


inline fun <reified T : Enum<T>> T.next(): T {
    val values = enumValues<T>()
    val nextOrdinal = (ordinal + 1) % values.size
    return values[nextOrdinal]
}


fun <T : Enum<*>> T.nextEnum(): T {
    val values = this::class.java.enumConstants
    val nextOrdinal = (ordinal + 1) % values.size

    return values[nextOrdinal]
}

enum class WorkDay { GetUp, WorkHungry, Lunch, WorkHard, Chill, Netflix, Sleep }

fun <T : Enum<T>> enumOf(enumType: Class<T>, enumName: String): T? {
    return enumType.enumConstants.firstOrNull(enumName::equals)
}

inline fun <reified T : Enum<T>> enumOff(enumName: String, default: T): T {
    return enumValues<T>().firstOrNull(enumName::equals) ?: default
}




enum class AppParam { Debug, Hidden, Pink }

fun main() {
    println(WorkDay.Netflix.next().next())
    println(WorkDay.Netflix.nextEnum())
    val parsedParam = AppParam.valueOf("Debug")
    val parsed = AppParam.valueOf("Debug")
    val parse2 = enumOf(AppParam::class.java, "Debug")

    val parsed3 = enumOff<AppParam>("Debug", AppParam.Debug)
    val parsed5 = enumOff("Debug", AppParam.Debug)
    val parsed4: AppParam = enumOff("Debug",AppParam.Pink);
}

fun startApp(param: AppParam) {

}
