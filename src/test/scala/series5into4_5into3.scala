object series5into4_5into3 {
  def main(args: Array[String]):
  Unit = {
    for (a <- 4 to -12 by -1)
      {
        print((5*a)+",")
      }
    println()
    for (j <- 4 to -12 by -1)
    {
      print(5+"*"+j+",")
    }
  }
}
