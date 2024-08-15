object free_delivery_or_discount {
  def main(args:Array[String]):
  Unit = {
    val a = 120
    if (a>100)
    {print("free shipping only")}
    else if (a>150)
    {print("eligible for both free shipping and discount as well")}
    else
      {print("Thoda aur kharcha karo")}
  }


}
