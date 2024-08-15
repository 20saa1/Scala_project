object test2 {
  def main(args:Array[String]):
  Unit = {
    val a = 24
    val c = (a%4 == 0 || a%6 == 0)
    print(c)
  }
}
