import scala.io.StdIn

object CheckPrime {
  def main(args: Array[String]): Unit = {
    println("Enter numbers separated by space: ")
    val numbers = StdIn.readLine().split(" ").map(_.toInt)

    val primes = numbers.filter(isPrime)
    val composites = numbers.filter(num => num > 1 && !isPrime(num))
    println(s"Prime numbers: ${primes.mkString(", ")}")
    println(s"Composite numbers: ${composites.mkString(", ")}")
    }

  def isPrime(num: Int): Boolean = {
    if(num < 2) return false
    for(i <- 2 to math.sqrt(num).toInt if num % i == 0) return false
    return true
    }
}
