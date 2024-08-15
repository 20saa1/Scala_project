object divisible_5_or_9 {
  def main(args:Array[String]):
  Unit = {
    val a = 45
    val c = (a%5 == 0 || a%9 == 0)
    print(c)
  }

}
