import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer
import java.util
/**
  * scala 对象 scala.collection.mutable.ArrayBuffer
  */
val arrayBuffer = ArrayBuffer("aa","bb")

val javaList :util.List[String]  = arrayBuffer

