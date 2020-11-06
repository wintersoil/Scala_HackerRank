import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Solution {

    def main(args: Array[String]) {
        val cases: Int = readInt()
        var count: Int = 0
        for(a <- 1 to cases)
        {
            val inputs: List[Int] = readLine().split(" ").toList.map((x) => x.toInt)
            var min: Int = inputs(0).min(inputs(1))
            for( ptr <- 1 to min )
            {
                if(inputs(0) % ptr == 0 && inputs(1) % ptr == 0)
                    count = count + 1
            }
            println(count)
            count = 0
        }
    }
}
