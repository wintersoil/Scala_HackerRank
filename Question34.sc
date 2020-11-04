import scala.io.StdIn.readLine
import scala.collection.mutable.HashSet
object Solution {

    def main(args: Array[String]) {
        val stringy: String = readLine()
        var hs: HashSet[String] = HashSet[String]()
        val result: StringBuilder = new StringBuilder("")
        for(i <- 0 to stringy.length()-1)
        {
            if(!hs.contains(stringy(i).toString))
            {
                result.append(stringy(i))
                hs.add(stringy(i).toString)
            }
        }
        println(result)
    }
}

// Link: https://www.hackerrank.com/challenges/string-reductions/problem
