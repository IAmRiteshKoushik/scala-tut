object CheckTupleEquality {
  def main(args: Array[String]): Unit = {
    val tuple1 = (1, "Scala", true)
    val tuple2 = (1, "Scala", true)
    val tuple3 = (2, "Java", false)
    val areEqual1 = tuple1 == tuple2
    val areEqual2 = tuple1 == tuple3
    println(areEqual1)
    println(areEqual2)
    }
}
