//匿名函数
(x:Double) => 3 * x

//把函数赋值给变量
val triple = (x:Double) => 3 * x

def triple2(x:Double) = 3 * x

//不需要给函数命名,直接将它传递给另一个函数
Array(3.14,1.42,2.0).map((x:Double) => 3 * x)