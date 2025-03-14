// val a = 0 // immutable
// var b = 1 // mutable
//
// var msg = "Hello, world"
// // msg = "Aloha"   // this compiles because a var can be reassigned
//
// val x: Int = 1 // explicit
// val y = 1 // implicit
//
// val nums: List[Int] = List(1, 2, 3)
//
// // Builtins
// val b: Byte = 1
// val i: Int = 1 // default
// val l: Long = 1
// val s: Short = 1
// val d: Double = 2.0 // default
// val f: Float = 3.0
//
// val xx = 1_000L // long
// val yy = 2.2D // double
// val zz = 3.3F // float
//
// var aa = BigInt(1_234_567_987_654_321L)
// var bb = BigDecimal(123_456.789)
//
// val name: String = "Bill" // string
// val c = 'a' // char
//

@main def main() = 
  val firstName = "Ritesh"
  val lastName = "Koushik"
  println(s"Name: $firstName $lastName")
  println(s"2 + 2 = ${2 + 2}")
  val x = -1 // integer has an absolute member on top of it
  println(s"x.abs = ${x.abs}")

  // Return of docstrings
  val quote = """The essence of Scala:
This is a second line
    This is a third line but indented"""
  println(quote)
