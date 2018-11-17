abstract class Element{
  def conents:Array[String]
  def height:Int = conents.length
  def width:Int = if(height==0) 0 else conents(0).length
}

class ArrayElement(conts:Array[String]) extends Element{
  override def conents: Array[String] = conts
}
val arrayElement = new ArrayElement(Array("小明军","小红") )

arrayElement.width
arrayElement.height