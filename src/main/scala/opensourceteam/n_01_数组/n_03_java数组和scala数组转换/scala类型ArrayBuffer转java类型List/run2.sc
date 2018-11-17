
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer

/**
  * scala 对象 scala.collection.mutable.ArrayBuffer
  */
val command = ArrayBuffer("javac","e:\\temp\\a\\Hello.java")

/**
  * 原参数为: java.util.List
  * 现传入的为:scala.collection.mutable.ArrayBuffer
  * 自动类型转换:隐式类型转换
  */
val processBuilder = new ProcessBuilder(command)
val process = processBuilder.start()
val res = process.waitFor()