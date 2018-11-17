import scala.actors.Actor

case class Message(message:String,sender:Actor)
class LeoActor extends Actor{
  override def act: Unit ={
    while (true){
      receive{
        case Message(message,sender) =>{
          println(s"leo收到消息:$message")
          sender !Message("leo 发出的水息",this)
        }
      }
    }
  }
}


class JimActor extends Actor{
  override def act: Unit ={
    while (true){
      receive{
        case Message(message,sender) =>{
          println(s"Jim收到消息:$message")
          sender !Message("jim 发出的水息",this)
        }
      }
    }
  }
}
val leoActor = new LeoActor
val jimActor = new JimActor
leoActor.start()
jimActor.start()

leoActor ! Message("good",jimActor)
jimActor ! Message("good2",leoActor)