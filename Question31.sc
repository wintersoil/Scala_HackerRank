import scala.io.StdIn.readLine
object Solution {

  def main(args: Array[String]) {
    val x = readLine()
    val y = readLine()
    val minimumLength = x.length().min(y.length())
    var p: StringBuilder = new StringBuilder("")
    var i: Int = 0
    while(i < minimumLength && x(i) == y(i))
    {
      p.append(x(i))
      i = i + 1
    }
    println(p.length() + " " + p)
    val xCompressed = x.substring(p.length())
    val yCompressed = y.substring(p.length())
    println(xCompressed.length() + " " + xCompressed)
    println(yCompressed.length() + " " + yCompressed)
  }
}

// Link: https://www.hackerrank.com/challenges/prefix-compression/problem
