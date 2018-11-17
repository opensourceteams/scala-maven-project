def mulBy(factor:Double) = (x:Double) => factor * x

mulBy(4)(5)

val quituple = mulBy(4)
quituple(5)