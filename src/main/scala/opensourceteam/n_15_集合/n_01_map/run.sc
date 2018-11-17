
/**
  * map
  */
var scoreMap = Map("leo" -> 90 ,"jack" -> 60 ,"tom" -> 70 ,"jim" -> 55 )
var names = List("leo","jim","tom")

names.map(scoreMap)



/**
  * map
  */
var scoreMap2 = Map("leo" -> List(90,40,68) ,"jack" -> List(80,40,58) ,"tom" -> List(90,30,68) ,"jim" -> List(90,4028 )  )
var names2 = List("leo","jim","tom")

names2.map(scoreMap2)
names2.flatMap(scoreMap2)

"abc".collect{case 'a' => 1;case 'b' => 2 ;case 'c' => 3}