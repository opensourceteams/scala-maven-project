//从左向右开始，依次进行两无素运算
// 1 - 2 -3 -4 =-8
List(1,2,3,4).reduceLeft(_ - _)

//从右向左开始，依次进行两无素运算
List(1,2,3,4).reduceRight(_ - _)
// 4 - 3 -2 -1 =-2

//从左向右开始，依次进行两无素运算,从10开始
//10 - 1 - 2 -3 -4 = 0
List(1,2,3,4).foldLeft(10)(_ - _)

/**
  * 从左向右开始，依次进行两无素运算,从10开始
  * 1- (2-(3 - (4-10))) =8
  * 4 10
  * 3 -6
  * 2 9
  * 1 -7
  */
List(1,2,3,4).foldRight(10)(_ - _)
List(1,2,3,4).foldRight(10){(m,n) => println(s"$m $n"); m - n}


