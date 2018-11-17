package opensourceteam.bfor

class Rational2(n:Int,d:Int){
  require(d !=0)
  private val g =gcd(n.abs,d.abs)
  val number:Int = n /g
  val denom:Int =d /g
  def this(n:Int) = this(n,1)
  override def toString = s"n:$number d:$denom   $number / $denom"

  def *(that:Rational2):Rational2 ={
    new Rational2( n * that.denom +  that.number * denom,denom * that.denom)
  }

  private def gcd(a:Int,b:Int):Int =
    if(b==0) a else gcd(b,a %b)


}



//implicit def aaaaaa(x:Int) = new Rational2(x)
