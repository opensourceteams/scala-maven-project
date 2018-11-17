class Man(val name:String)
class SuperMan(name:String){
   def superFunction= println("超级功能")
}

new SuperMan("超人").superFunction

implicit def man2Superman(man:Man):SuperMan =new SuperMan(man.name)
new Man("超人").superFunction