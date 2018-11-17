import scala.util.control.Breaks._

def outer={
breakable{
  for(i <- 0 to 5 ) {
    if(i == 2) break()
    println(i)
  }
}

}
outer