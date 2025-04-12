object ScalarProd {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List(4, 5, 6, 7, 8)
    // using zip() we created a collection of tuples and using map we took
    // each of its element and using the function that was inside map
    // we have performed some computation on it and then returned them in the
    // form of a list which is getting a summation using the .sum function
    val scalarProd = list1.zip(list2).map{case (x, y) => x * y}.sum
    println(scalarProd)
    }
}
