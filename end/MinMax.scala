object MinMax {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5)
    // println(list.max)
    // println(list.min)

    println(nums.reduceLeft((x, y) => if (x > y) x else y))
    println(nums.reduceLeft((x, y) => if (x > y) y else x))
    }
}
