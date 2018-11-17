

val javaMap = new java.util.HashMap[String,Int]()
javaMap.put("a",1)
javaMap.put("b",1)

import  scala.collection.JavaConversions.mapAsScalaMap
val scalaMap : scala.collection.mutable.Map[String,Int] = javaMap

for( v <- scalaMap){
  println( v._1 + v._2)
}