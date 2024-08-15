object non_neg_and_div7 {
  def main(args:Array[String]):
  Unit = {
    val a = 14
    val c = (a> 0 && a%7 != 0)
    print(c)
  }

}
