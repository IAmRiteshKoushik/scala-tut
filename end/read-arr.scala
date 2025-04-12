import scala.io.StdIn

object MinMaxFinder {
  def main(args: Array[String]): Unit = {
    println("Enter the number of elements: ")
    val n = StdIn.readInt()
    println(s"Enter $n integers separated by space.")
    val arr = StdIn.readLine().split(" ").map(_.toInt)
    val maxElement = arr.max
    val minElement = arr.min
    println(s"Maximum Element: $maxElement")
    println(s"Minimum Element: $minElement")
    }
}
