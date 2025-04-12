object RomanToInteger {
  val romanValues = Map(
      'I' -> 1,
      'V' -> 5,
      'X' -> 10,
      'L' -> 50,
      'C' -> 100,
      'D' -> 500,
      'M' -> 1000
    )

  def romanToInt(s: String): Int = {
    if (s.isEmpty) return 0

    var result = 0
    var prevValue = 0 // keep track of previous value for subtractive measures

    for (c <- s.reverse){
      val currentValue = romanValues.getOrElse(c, 0)
      if (currentValue >= prevValue){
        result += currentValue
      } else {
        result -= currentValue
      }
      prevValue = currentValue
    }
  }

  def main(args: Array[String]): Unit = {
    // Test cases
    val tests = List("III", "IV", "IX")
    for (test <- tests){
      val result = romanToInt(test)
      println(s"$test = $result")
    }
  }
}
