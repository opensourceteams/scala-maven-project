import java.io._

val file = new File("E:\\temp\\a.txt")
val bytes = new Array[Byte](file.length().toInt)
val fis = new FileInputStream(file)
fis.read(bytes)
fis.close()
bytes