object sumEven700to900 {
  def main(args:Array[String]):
  Unit =
  {
    var sum = 0
    for(a<- 700 to 900)
    {
      if(a%2==0)
        {
        sum = sum+a
        }
    }
    print(sum)
    }

}
