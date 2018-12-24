package opensourceteam.n_020_Iterable.n_01_iterator_遍历

object Run {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3)
    list.iterator.foreach(
      x => {
        print("元素:")
        println(x)
      }
    )
  }
}
