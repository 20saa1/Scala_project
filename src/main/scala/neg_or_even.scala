object neg_or_even {
  def main(args:Array[String]):
  Unit = {
    val a = -8
    val c = (a<0 || a%2 == 0)
    print(c)
  }

}
