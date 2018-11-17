class Person(name:String)
object Person{
  def unapply(name: String): Option[String] = Some(name)
}
val Person(name) = "小明"


