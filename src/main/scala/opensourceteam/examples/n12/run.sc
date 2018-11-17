trait Philosophical{
  def philosophize()={
    println("trait")
  }
}

trait B{
  def a()={
    println("trait a")
  }
}


class Frog extends  Philosophical with B{
  override def philosophize(): Unit = "gree"
}



new Frog().philosophize()
new Frog().a()

