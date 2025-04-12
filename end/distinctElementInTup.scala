object DistinctTuple {
  def main(args: Array[String]): Unit = {
    val myTup = (1, 2, 3, 4, 5, 5, 4, 3, 2, 1)
    println(myTup.toList.distinct)
    }
}
