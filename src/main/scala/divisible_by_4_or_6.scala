object divisible_by_4_or_6 {
  def main(args:Array[String]):
  Unit= {
    val a = 18
    val c = a % 4 == 0 || a % 6 == 0
    print(c)
  }

}
