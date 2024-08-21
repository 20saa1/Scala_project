object pattern10th {
  def main(args:Array[String]):
  Unit =
  {
    var num = 1
    for(i<-1 to 5)
    {
      for(j<-5 to i by -1)
      {
        print(" ")
      }

      for(k<-1 to num)
      {
        print("*")
      }
      println()
      num=num+2
    }
  }
}

