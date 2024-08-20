object series1234DivisibleBy5 {
  def main(args: Array[String]):
  Unit = {
    for (a <- 1 to 36 by 2)
    {
      if(a%5==0)
      {
        print("divisible by five,")
      }
      else
      {
        print(a+",")
      }
}}}
