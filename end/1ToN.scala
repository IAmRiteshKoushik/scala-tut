object cmdCheck{
  def main(args: Array[String]): Unit = {
    // check(5);

    val age1 = 20
    val age = "50"

    // Pattern match for age1 (Int type)
    age1 match {
      case 20 => println(age1)
      case 18 => println(age1)
      case 30 => println(age1)
      case 40 => println(age1)
      case 50 => println(age1)
      case _ => println("Default")
    }
    }
  def check(args: Int): Unit = {
    // var i = 1;
    // while(i <= args){
    //   println(i)
    //   i += 1
    //   }
    for(i <- 1 to args) {
      println(i)
      }
    }
}
