class Exam{
  def wirte(content:String)=println(content)
}

implicit val exam = new Exam();

def personExam(name:String)(implicit exam:Exam)={
  exam.wirte(name +"打印")
}

personExam("小明")