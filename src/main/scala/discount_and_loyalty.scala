object discount_and_loyalty {
  def main(args:Array[String]):
  Unit = {
    val loyalty = true
    val purchase_amount = 180
    val c = purchase_amount > 200 || loyalty
    print(c)

  }


}
