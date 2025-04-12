object ListOps {
  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 4, 5)
    nums.foreach(println)
    val sum = nums.foldLeft(0)((acc, x) => acc + x)
    val prod = nums.foldLeft(1)((acc, x) => acc * x)
    println(sum)
    println(prod)
    }
}
