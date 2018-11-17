def outer={
    def inner(){
      for(i <- 0 to 5 ) {
        if(i == 2)
          return
        println(i)
      }

    }
  inner()
}
outer