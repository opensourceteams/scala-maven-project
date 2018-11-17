import scala.collection.mutable.ArrayBuffer

class Class(val name:String) {
  outer =>
  class Student(val name: String) {
     def introduceMyself = s"我是:$name  外部的名字是:$outer.name"
  }
  val students = new ArrayBuffer[Class#Student]
  def register(name:String)={
    new Student(name)
  }
}

val c1 = new Class("c1")
val s1 = c1.register("s1")
s1.introduceMyself




