object countOfEven {
  def main(args: Array[String]):
  Unit = {
    var count = 0
    for (a <- 56 to 60)
    {
      if(a%2==0)
        {
          count=count+1
        }
    }
    print(count)
  }
}