import scala.xml._
var books = <books><book>book1</book><book>book2</book></books>

/**
  * 增加元素
  */
books = books.copy(child = books.child ++ <book>book3</book> )

/**
  * 增加属性，修改属性
  */
var book = <book>book1</book>
book = book % Attribute(null,"id","1",Null)
book = book % Attribute(null,"id","2",Null)
book = book % Attribute(null,"price","3.4",Null)





