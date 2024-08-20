object average {
  def main(args: Array[String]):
  Unit = {
    var sum,count = 0
    for (a <- 24 to 100)
    {
      sum = sum+a
      count = count+1
      }
      var avg = sum/count
    print(avg)
}}
