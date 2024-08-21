object pattern8th {
  def main(args:Array[String]):
  Unit =
  {
    var num = 1
    for(i<-1 to 3)
    {
      for (j <- 1 to i) {
        print("*")
      }
      for (k <- 3 to i by -1) {
        print("  ")
      }
      for (l <- 1 to i) {
        print("*")
      }
      println()
    }



    for(i<-2 to 1 by -1)
    {
      for (j <- 1 to i)
      {
        print("*")
      }
      for (k <- 2 to 1 by -1)
      {
        print("  ")
      }
      for (l <- 1 to i)
      {
        print("*")
      }
      println()

  }}}


