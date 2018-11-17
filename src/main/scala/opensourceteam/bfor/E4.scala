package opensourceteam.bfor

object E4 {
  def main(args: Array[String]): Unit = {
    println(add(4))
    println(add(a=3))
  }

  def add(a:Int,b:Int =3):Int= {
    a + b
  }
}
