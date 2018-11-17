
val getStudentGrade: PartialFunction[String,Int]={
  case "Leo" => 90;
  case "Jack" => 95;
  case "Marry" => 96;
}

getStudentGrade("Leo" )