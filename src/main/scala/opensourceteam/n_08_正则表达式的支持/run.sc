
/**
  * 正则表达式
  */
val pattern ="[a-z]+".r
val str ="hello 123 world 456"
//匹配
for( v <- pattern.findAllIn(str)) println(v)

//替换
val a = pattern.replaceAllIn(str,"aaaa")

val b = pattern.replaceFirstIn(str,"aaaa")