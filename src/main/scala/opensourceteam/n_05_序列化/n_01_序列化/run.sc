
@SerialVersionUID(1000L)
class Person(val name:String) extends Serializable{}

val p = new Person("Tom")
import java.io._
val oos = new ObjectOutputStream(new FileOutputStream("e:\\temp\\a\\d.obj"))
oos.writeObject(p)
oos.close()