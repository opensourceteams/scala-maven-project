class Person(val name:String ,val age:Int)

object Person{
  def apply(name:String,age:Int)=new Person(name,age)
  def unapply(str:String)={
    val splitIndex = str.indexOf(" ")
    if(splitIndex == -1) None
    else Some((str.substring(0,splitIndex), str.substring(splitIndex +1)))
  }



}

val Person(name,age) ="leo 25"