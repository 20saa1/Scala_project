object series1even3even5even {
  def main(args: Array[String]):
  Unit = {
    for (a <- 1 to 36)
    {
      if(a%2==0)
        {
          print("even,")
        }
      else
        {
          print(a+",")
        }
    }

    }
}
