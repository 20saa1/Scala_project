object pattern4th {
  def main(args:Array[String]):
  Unit =
  {
    for(i<-1 to 4)
    {
      if (i == 1 || i == 4) {
        for (j <- 1 to 6) {
          print("* ")
        }
        println()
      }
      else {
        for (k <- 1 to 6) {
          if (k == 1 || k == 6) {
            print("* ")
          }
          else {
            print("  ")
          }
        }
        println()

      }
    }
    println()

}}
