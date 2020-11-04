import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.collection.mutable.HashSet
object Solution {

  def main(args: Array[String]) {
    val cases: Int = readInt()
    var hs: HashSet[String] = HashSet()
    for(i <- 1 to cases)
    {
      var points: Int = readInt()
      hs.clear()
      var isFunction: Boolean = true
      for(p <- 1 to points)
      {
        val c: List[String] = readLine().split(" ").toList
        if(hs.contains(c(0)))
        {
          isFunction = false
        }
        else
        {
          hs.add(c(0))
        }
      }
      if(isFunction == true)
        println("YES")
      else
        println("NO")
    }
  }
}

// Link : https://www.hackerrank.com/challenges/functions-or-not/problem
