object senior_or_student_discount {
  def main(args:Array[String]):
  Unit =
    {
      val a = 63
      val c = (a<=25 && a>=60)
      println(c)
      if (a<=25)
        {println("student discount")}
      else if (a>=60)
        {println("Senior Discount")}
      else
        {println("Tere liye kuch nahi hai, ya to chota ho jao ya to bada ho jao")}
    }

}
