import scala.collection.immutable.StringOps

val a = new StringOps("aa")

val b = List(1,2)
val c = List(3,4)
val e = List(5,6)
val d = b ++ c ++ e

val f = List('a')

val x = b ++ c ++ e ++ f
val y = b ++: c

val m = "abc"
m.startsWith("ab")