/**
  * xml 定义
  */
val a = <books><book>book1</book></books>
val b = <books><book>book1</book><book>book2</book></books>

a.label
a.child
b.child

val booksBuffer = new scala.xml.NodeBuffer
booksBuffer += <book>book1</book>
booksBuffer += <book>book2</book>

for( v<- booksBuffer)println(v)

val aa = <book id="1" price="34.5">book1</book>
println("===========")
for( v<- aa.attributes ) println(v)

aa.attributes.asAttrMap
aa.attributes.asAttrMap("id")
