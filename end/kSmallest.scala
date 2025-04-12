object KSmallest{
  def main(args: Array[String]): Unit = {
    val list = List(1, 8, 2, 3, 20, 15)
    val k = 3
    val kSmallest = findKSmallestUsingSorting(list, k)
    val kLargest = findKLargestUsingSorting(list, k)
    println(kSmallest)
    println(kLargest)
    }

  def findKSmallestUsingSorting(list: List[Int], k: Int): Int = {
    val sortedList = list.sorted
    return sortedList(k - 1)
    }

  def findKLargestUsingSorting(list: List[Int], k: Int): Int = {
    val sortedList = list.sorted.reverse
    return sortedList(k - 1)
    }
}
