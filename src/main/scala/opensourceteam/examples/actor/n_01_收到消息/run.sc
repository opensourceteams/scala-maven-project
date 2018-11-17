/**
  * 在控制台运行，才有效
  */

import scala.actors.Actor
class HelloActor extends Actor{
  def act()={
    while (true){
      receive{
        case name:String => println(s"-----hello:%s",name)
      }
    }
  }
}

val helloActor = new HelloActor
helloActor.start()
helloActor !"hello"