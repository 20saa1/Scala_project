object odd_and_not_div_by_4 {
  def main(args:Array[String]):
  Unit = {
    val a = 15
    val c = (a%2 != 0 && a%4 != 0)
    print(c)
  }

}
