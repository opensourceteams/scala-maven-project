case class Person(name:String,age:Int)

val p = Person("小明",25)

p match {
  case Person(name,age) => println(s"person类 $name  $age")
}