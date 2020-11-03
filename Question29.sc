import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Solution {

    def main(args: Array[String]) {
        val cases: Int = readInt()
        for(i <- 1 to cases)
        {
            val stringy: String = readLine()
            var result: StringBuilder = new StringBuilder("")
            var ptr: Int = 0
            while(ptr < stringy.length)
            {
                result = result.append(stringy(ptr+1)).append(stringy(ptr))
                ptr = ptr + 2
            }
            println(result)
        }
    }
}
