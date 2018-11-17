val scores = Array(80,90,70)
val students = Array("Leo","Jack","Jem")

val studentScores = students.zip(scores)

for(v <- studentScores) println(v._1 +v._2)

val studentScoreMap = studentScores.toMap

for(v <- studentScoreMap){
  println(v._1 +v._2)
}
studentScoreMap("Leo")