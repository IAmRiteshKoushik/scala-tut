object Scala_ListDiff{
  def main(args: Array[String]): Unit = {
    val L1 = List(1, 2, 3, 4, 5)
    val L2 = List(4, 5, 6, 7, 8)
    val difference = L1.diff(L2)
    println(s"Difference (L1-L2): $difference")
    }
}
