import java.io.File

def getSubdirIterator(dir:File):Iterator[File] ={
  val childDirs = dir.listFiles().filter(_.isDirectory)
  childDirs.toIterator ++ childDirs.toIterator.flatMap(getSubdirIterator( _))
  //childDirs.toIterator
}

val iterator = getSubdirIterator(new File("E:\\temp"))
for(v <- iterator) println(v)