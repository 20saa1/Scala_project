object discount_and_customer {
  def main(args:Array[String]):
  Unit =
    {
      val new_customer = false
      val age = 70
      val c = (age>65 && !(new_customer))
      print(c)
    }

}
