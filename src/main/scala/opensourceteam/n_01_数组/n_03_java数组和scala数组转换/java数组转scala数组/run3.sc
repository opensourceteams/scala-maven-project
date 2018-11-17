import java.util

val javaList :util.List[String]  = new util.ArrayList[String]()
javaList.add("a")
javaList.add("b")

import  scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer
val cmd:Buffer[String] = javaList