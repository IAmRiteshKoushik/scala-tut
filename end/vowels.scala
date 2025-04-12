object VowelCountArray{
  def main(args: Array[String]): Unit = {
    println("Enter the number of string")
    val n = scala.io.StdIn.readInt()
    println(s"Enter $n strings: ")
    val strArray = Array.fill(n)(scala.io.StdIn.readLine())
    // map function takes each value of an iterable and passed it through a
    // function which is to be supplied as a parameter to the map()
    val vowelCounts = strArray.map(countVowels)
    println("Vowel count in each string")
    vowelCounts.foreach(println)
    }

  def countVowels(str: String): Int = {
    val vowels = Set('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    str.count(vowels.contains)
    }
}
