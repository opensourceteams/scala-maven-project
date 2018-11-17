
val map = scala.collection.immutable.Map("red" -> "#FF0000" ,"blue" -> "#F0FFFF")
import scala.collection.JavaConversions.mapAsJavaMap
val javaMap:java.util.Map[String,String] = map
