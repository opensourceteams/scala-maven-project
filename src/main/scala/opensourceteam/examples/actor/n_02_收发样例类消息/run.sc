import scala.actors.Actor

case class Login(name:String)
case class Register(name:String)
class UserManagerActor extends Actor{
  override def act(): Unit ={
    while (true){
      receive{
        case Login(name) => println(s"login name:$name")
        case Register(name) =>  println(s"login name:$name")
      }
    }
  }
}

val userManagerActor = new UserManagerActor
userManagerActor.start()
userManagerActor !Login("小明")
userManagerActor !Register("小黄")
