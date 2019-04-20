import java.io.File
import java.io.FileWriter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.ZoneId


val file = File("Follow the white rabbit.txt")
val fileWriter = FileWriter(file)
fileWriter.write("Hi Kotlin nerds \n"+ getFormattedDate())
fileWriter.close()
println("Written file: ${file.absolutePath}")


fun getFormattedDate(): String {
    val timeFormatter = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.FULL)
        .withZone(ZoneId.systemDefault())
    return LocalDateTime.now().format(timeFormatter)
}