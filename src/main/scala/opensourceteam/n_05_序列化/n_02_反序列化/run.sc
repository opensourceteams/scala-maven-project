import java.io.{FileInputStream, ObjectInputStream}

@SerialVersionUID(1000L)
class Person(val name:String) extends Serializable


val ois = new ObjectInputStream(new FileInputStream("e:\\temp\\a\\d.obj"))
val tom = ois.readObject().asInstanceOf[Person]
tom.name