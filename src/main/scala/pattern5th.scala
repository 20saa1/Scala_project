object pattern5th {
  def main(args: Array[String]):
  Unit = {
    var num = 1
    for (i <- 1 to 5)
    {
      for (j <- 1 to num)
      {
       if(j%2==0)
         {
           print("_")
         }
       else
         {
           print("*")
         }
      }
      num = num + 2
      println()
    }

  }}
