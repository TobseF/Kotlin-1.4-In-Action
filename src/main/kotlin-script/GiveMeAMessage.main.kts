import java.io.File
import java.io.FileWriter
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


val file = File("Follow the white rabbit.txt")
val fileWriter = FileWriter(file)
fileWriter.write("Hi Kotlin nerds \n" + getFormattedTimeStamp())
fileWriter.close()
println("Written file: ${file.absolutePath}")


fun getFormattedTimeStamp(): String {
    val timeFormatter = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.FULL)
        .withZone(ZoneId.systemDefault())
    return LocalDateTime.now().format(timeFormatter)
}