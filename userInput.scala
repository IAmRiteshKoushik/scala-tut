import scala.io.StdIn.readLine

@main def helloInteractive() = 
  print("Please enter your name: ")

  // To declare immutable variables, we use the "val" keyword
  val name = readLine()

  println("Hello, " + name + "!")
