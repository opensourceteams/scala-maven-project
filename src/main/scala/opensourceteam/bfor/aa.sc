val a =true
def b(x: => Boolean) =
  if(a && !x)  throw new AssertionError

b( 5>6)

