class SpecialPerson(val name:String)
class Student(val name:String)
class Older(val name:String)

var ticketNumber = 0
def buySpecialTicket(p:SpecialPerson)={
  ticketNumber += 1
  "T-" + ticketNumber
}

implicit def object2SpecialPersion(obj:Object):SpecialPerson ={
  if(obj.getClass == classOf[Student]){
    val stu = obj.asInstanceOf[Student]
    new SpecialPerson(stu.name)
  }else if(obj.getClass == classOf[Older]){
    val stu = obj.asInstanceOf[Older]
    new SpecialPerson(stu.name)
  }else Nil
}
buySpecialTicket(new SpecialPerson("军人"))
buySpecialTicket(new SpecialPerson("军人2"))
buySpecialTicket(new Student("军人2"))
buySpecialTicket(new Older("军人2"))