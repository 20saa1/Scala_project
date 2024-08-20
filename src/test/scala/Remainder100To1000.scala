object Remainder100To1000 {
  def main(args:Array[String]):
  Unit =
    {
      var a = 10
      var rem = 0
      if(a>=100 && a<=1000)
        {
          if (a%2==0)
            {
              rem = a%3
            }
          else
            {
              rem = a%2
            }
          print(rem)
        }
      else print("Not a valid number")


    }
}
