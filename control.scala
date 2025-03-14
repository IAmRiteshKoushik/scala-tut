@main def main =
  val x = 20

  // If statements
  if x < 0 then
    println("Negative")
  else if x == 0 then
    println("zero")
  else
    println("positive")

  // For loops
  val ints: List[Int] = List(1, 2, 3, 4, 5, 6)
  // <- is the generator and everything the "do" keyword is body of the loop
  for i <- ints do
    println(i)

  // Setting up guards
  print("Guards\n")
  for
    i <- ints
    if i > 2
  do
    println(i)

  // Iterating over multiple generators at the same time
  for
    i <- 1 to 3
    j <- 'a' to 'c'
    if i == 2
    if j == 'b'
  do
    println(s"i = $i, j = $j")

  // list comprehension with "for"
  // for-expressions
  val doubles = for i <- ints yield i * 2
  println(doubles)

  val names = List("chris", "ed", "maurice")
  val capNames = for name <- names yield name.capitalize
  println(capNames)

  val fruits = List("apple", "banana", "lime", "orange")
  val fruitsLengths = for
    f <- fruits
    if f.length > 4
  yield
    f.length
  println(fruitsLengths)

  val i = 1
  i match
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("other")

  // while loop
  var xxx = 1
  while
    xxx < 3
  do
    println(xxx)
    xxx += 1
