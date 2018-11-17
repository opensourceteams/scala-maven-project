package opensourceteam.bfor

object E6 {
  def main(args: Array[String]): Unit = {
    println(add(1.to(3) :_*))
  }

  def add(nums:Int*):Int= {
    var result = 0
    for(num <- nums){
      result += num
    }
    result
  }
}
