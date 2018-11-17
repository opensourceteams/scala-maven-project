try{
  throw new IllegalArgumentException("自定义异常")
}catch {
  case e2: IndexOutOfBoundsException => print( "异常处理2\n")
  case e1: IllegalArgumentException => print( e1.getMessage + "异常处理1\n")
}

