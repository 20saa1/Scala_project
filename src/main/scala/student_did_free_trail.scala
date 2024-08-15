object student_did_free_trail {
  def main(args:Array[String]):
  Unit = {
    val age = 22
    val free_trail = true
    val c = (age<25 || free_trail)
    print(c)
  }
}
