import scala.io.Source

/**
  * 方式一
  * 使用 Source.getLines 返回的迭代器
  */
val source = Source.fromFile("E:\\temp\\a.txt","UTF-8")
val lineIterator = source.getLines()
for( line <- lineIterator) println(line)


/**
  * 方式二
  * 使用 Source.getLines 返回的迭代器,转换成数组
  */
val lineArray = source.getLines().toArray
for( line <- lineArray) println(line)

/**
  * 方式三
  * 使用 Source.getLines 返回文件中的所有内容
  */
val lines = source.mkString



/**
  * 方式四
  * 使用 Source.getLines 返回文件中的每一个字符
  */
for(c <- source) print(":"+c)

/**
  * 方式五
  * 使用 Source.fromURL URL
  */
val html = Source.fromURL("https://www.baidu.com","UTF-8")
val htmlString = html.mkString


