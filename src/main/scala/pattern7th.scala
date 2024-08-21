object pattern7th {
  def main(args:Array[String]):
  Unit =
  {
    var num = 7
    for(l<-1 to 4)
    {
      for (m <- 1 to l) {
        print(" ")
      }
      for (k <- 1 to num) {
        print("*")
      }
      println()
      num = num - 2
    }
    num = 1
    for(i<-4 to 1 by -1)
      {
        for(j<-1 to i)
          {
            print(" ")
          }
        for(n<-1 to num)
          {
            print("*")
          }
           println
        num = num+2
      }


    }}






