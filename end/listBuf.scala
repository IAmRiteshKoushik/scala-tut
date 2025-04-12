import scala.collection.mutable.ListBuffer

object Scala_List {
  def main(args: Array[String]): Unit = {
    var colors = new ListBuffer[String]()
    println(colors)
    colors += "Red"
    println(colors)
    colors += "Black"
    println(colors)
    colors += "Green"
    println(colors)
    colors += "Green"
    colors -= "Black"
    val colors_list = colors.toList
    println(colors_list)
    }
}
