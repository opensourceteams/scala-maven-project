package opensourceteam.bfor

object E5 {
  def main(args: Array[String]): Unit = {
    println(add(1,2,4))
  }

  def add(nums:Int*):Int= {
    var result = 0
    for(num <- nums){
      result += num
    }
    result
  }
}
