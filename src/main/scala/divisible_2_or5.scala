object divisible_2_or5 {
  def main(args:Array[String]):
  Unit = {
    val a = 25
    val c = (a%2 == 0 || a%5 == 0)
    print(c)
  }


}
