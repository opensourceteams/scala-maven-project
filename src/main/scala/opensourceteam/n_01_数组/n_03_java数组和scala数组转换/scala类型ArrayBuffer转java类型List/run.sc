import java.util

val javaList :util.List[String]  = new util.ArrayList[String]()
javaList.add("javac")
javaList.add("e:\\temp\\a\\Hello.java")
val processBuilder = new ProcessBuilder(javaList)
val process = processBuilder.start()
val res = process.waitFor()