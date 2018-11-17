package opensourceteam.bfor

class Rational(n:Int,d:Int){
  require(d !=0)
  private val g =gcd(n.abs,d.abs)
  val number:Int = n /g
  val denom:Int =d /g
  def this(n:Int) = this(n,1)
  override def toString = s"n:$number d:$denom   $number / $denom"

  def add(that:Rational):Rational ={
    new Rational( n * that.denom +  that.number * denom,denom * that.denom)
  }

  private def gcd(a:Int,b:Int):Int =
    if(b==0) a else gcd(b,a %b)
}