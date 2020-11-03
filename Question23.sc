import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Solution {

    def main(args: Array[String]) {
        val iterations: Int = readInt()
        var perimeter: Double = 0
        var c1: List[Int] = List[Int]()
        var c2: List[Int] = List[Int]()
        var initial: List[Int] = List[Int]()
        if(iterations > 0)
            c1 = readLine().split(" ").toList.map((k) => k.toInt)
        initial = c1
        for(i <- 1 to iterations)
        {
            var line2: String = readLine()
            if(line2 != null)
            {
                c2 = line2.split(" ").toList.map((k) => k.toInt)
                perimeter = perimeter + scala.math.pow((scala.math.pow((c2(0) - c1(0)), 2) + scala.math.pow((c2(1) - c1(1)), 2)), 0.5)
            }
            c1 = c2
        }
        perimeter = perimeter + scala.math.pow((scala.math.pow((initial(0) - c1(0)), 2) + scala.math.pow((initial(1) - c1(1)), 2)), 0.5)
        println(perimeter)
        return perimeter
    }
}
