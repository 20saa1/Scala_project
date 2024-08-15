object div_2_or_3 {
  def main(args:Array[String]):
  Unit =
  {
    val a = 9
    val c = (a%5 == 2 || a%3 == 0)
    print(c)
  }

}
