object pattern9 {
  def main(args: Array[String]):
  Unit = {
    for (i <- 1 to 5)
    {
      for (j <- 1 to i) {
        print("* ")
      }
      println()
    }
    for(m<-4 to 1 by -1)
      {
        for(l<-1 to m)
        {
          print("* ")
        }
        println()
      }
  }
}

