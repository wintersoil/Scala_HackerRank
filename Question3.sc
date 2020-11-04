object Solution extends App {
  def f(n: Int) = (0 until n).foreach( _ => println("Hello World"))

  var n = scala.io.StdIn.readInt
  f(n)
}

// Link: https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem
