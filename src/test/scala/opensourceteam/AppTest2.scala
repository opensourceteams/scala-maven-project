package opensourceteam
import scala.util.control.Breaks._
object AppTest2  {
  def main(args: Array[String]): Unit = {
    import java.io._

    val fis = new FileInputStream(new File("E:\\temp\\a.txt"))
    val fos = new FileOutputStream(new File("E:\\temp\\a2.txt"))

    val buf = new Array[Byte](1024)

    var len = -1
    var lastIndex =0
    /*fis.read(buf)
    fos.write(buf,0,1024)*/

    var flag = true
    breakable{
      while(flag) {
        len = fis.read(buf)

        if(len < 0) {
          flag = false
          break()
        }
        fos.write(buf,lastIndex,len)
        lastIndex = len
      }
    }



    fis.close()
    fos.close()
    println("结束")
  }
}
