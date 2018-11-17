import java.io._

val fis = new FileInputStream(new File("E:\\temp\\a.txt"))
val fos = new FileOutputStream(new File("E:\\temp\\a2.txt"))

val buf = new Array[Byte](1024)

var len = -1
var lastIndex =0
/*fis.read(buf)
fos.write(buf,0,1024)*/
do{
  len = fis.read(buf)
  fos.write(buf,lastIndex,len)
  lastIndex = len
}while(len > 0)


fis.close()
fos.close()