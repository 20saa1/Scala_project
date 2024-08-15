object divisible_by_3_or_8 {
  def main(args:Array[String]):
  Unit = {
    val a = 24
    val c = (a%3 == 0 || a%8 == 0)
    print(c)
  }


}
