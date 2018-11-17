class B(name:String ,age:Int)
object B{
  def apply(name: String, age: Int): B = new B(name, age)
}
val b =  B("a",1)