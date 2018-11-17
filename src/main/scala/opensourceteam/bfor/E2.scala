package opensourceteam.bfor

object E2  {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10 if i % 2 ==0){
      println("i:" + i )
    }
  }
}
