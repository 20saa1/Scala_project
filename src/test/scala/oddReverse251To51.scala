object oddReverse251To51 {
  def main(args:Array[String]):
  Unit =
  {
    for(a<- 251 to 51 by -1)
    {
    if(a%2 != 0)
      {
        println(a)
      }
    }
  }
}
