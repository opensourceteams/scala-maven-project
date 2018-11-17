package opensourceteam.bfor

object E3  {
  def main(args: Array[String]): Unit = {
   val result = ab(4)
    println(result)
  }

  def ab(n:Int):Int={
     if(n ==1) 0
     else if (n ==2) 1
     else ab(n-1) + ab(n-2)
  }
}
