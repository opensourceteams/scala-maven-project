import scala.collection.mutable.ArrayBuffer

class Class {
  class Student(val name: String) {
    override def toString: String = name
  }
  val students = new ArrayBuffer[Student]
  def register(name:String)={
    new Student(name)
  }
}

val c1 = new Class
val s1 = c1.register("c1")
val s3 = c1.register("c3")
c1.students += s1
c1.students += s3


val c2 = new Class
val s2 = c2.register("s2")



