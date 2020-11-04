import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.math
object Solution {

    def main(args: Array[String]) {
        val iterations: Int = readInt()
        var line1: String = readLine()
        var c1:List[Int] = line1.split(" ").toList.map((j) => j.toInt)
        var line2: String = readLine()
        var c2:List[Int] = line2.split(" ").toList.map((j) => j.toInt)
        var area: Double = 0
        for(i <- 1 to iterations)
        {
            var line3: String = readLine()
            if(line3 != null)
            {
                var c3:List[Int] = line3.split(" ").toList.map((j) => j.toInt)
                area = area + 0.5 * (c1(0)*(c2(1) - c3(1)) + c2(0)*(c3(1) - c1(1)) + c3(0)*(c1(1) - c2(1)))
                c2 = c3
            }
        }
        println(area)
        return area
    }
}

// Link: https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem
