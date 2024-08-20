object smartJustSmart {
  def main(args:Array[String]):
  Unit =
  {
    var a = 90

    if(a>=1 && a<=100)
    {
      if(a<=100 && a>=90)
      {
        print("Super Smart")
      }
      if(a<90 && a>=80)
      {
        print("Smart")
      }
      if(a<80 && a>=70)
      {
        print("Enough Smart")
      }
      if(a<70 && a>=60)
      {
        print("Just Smart")
      }
      if(a<60 && a>=35)
      {
        print("No Smart")
      }
      if(a<35 && a>=0)
      {
        print("Dumb")
      }}
    else {
      print("Not a valid number")
    }
}}
