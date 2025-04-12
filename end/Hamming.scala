object Hamming {
  def main(args: Array[String]): Unit = {
    val dna1 = "GAGCCTACTAACGGGAT"
    val dna2 = "CATCGTAATGACGGGCT"
    val res = compute(dna1, dna2)
    println(res)
  }

  def compute(s1: String, s2: String): Int = {
    if(s1.length != s2.length){
      println("Error: DNA strands must be of equal length")
      return -1
      }
    s1.zip(s2).count { case (c1, c2) => c1 != c2 }
    }

}
