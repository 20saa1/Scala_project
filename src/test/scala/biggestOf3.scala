object biggestOf3 {
def main(args:Array[String]):
Unit =
{
  var a = 12
  var b = 32
  var c = 37
  var B = 1
  if (a>b)
    {
      B = a
    }
  else
    B = b
  if (c>B)
    {
      B=c
    }
    print(B)
}
}
