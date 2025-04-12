object Demo{
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10)  println(sum(i))
    }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) 1
    else n * factorial(n - 1)
    }

  def sum(num: Int): Int = {
    if (num == 1) 1
    else sum(num - 1) + num
    }
}
