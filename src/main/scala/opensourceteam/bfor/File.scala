package opensourceteam.bfor

import scala.io.Source

object File {
  def main(args: Array[String]): Unit = {
    Source.fromFile("e://temp/a.txt").mkString
  }


}
