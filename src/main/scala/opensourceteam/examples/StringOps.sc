import scala.collection.immutable.StringOps

val a = new StringOps("aa")
val b = new StringOps("bb")

val d = a * 4
val c = a ++ b
val f = a ++: b

s"a"
