import scala.collection.mutable.ListBuffer

object ListRemoveItem {
  def main(args: Array[String]): Unit = {
    val colors= List("Red", "Orange", "Green", "Black", "White", "Pink", "Orange")
    println(colors)
    val col_buf = ListBuffer(colors*)
    println(col_buf)
    col_buf -= "Orange"
    println(col_buf)
    val updated = col_buf.toList
    println(updated)
    }
}
