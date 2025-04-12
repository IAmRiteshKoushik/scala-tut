import scala.io.StdIn

object Welcome {
  def main(args: Array[String]): Unit = {
    print("Enter your name: ")
    val name = StdIn.readLine()
    println(s"Hi $name, Welcome to Scala!")
  }
}
