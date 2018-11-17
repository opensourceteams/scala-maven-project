package opensourceteam.bfor

object E7 {
  def main(args: Array[String]): Unit = {
    println(add(1.to(4) :_*))
  }

  def add(nums:Int*):Int= {
    if(nums.length ==0) 0
    else nums.head + add(nums.tail:_*)
  }
}
