import scala.io.StdIn.readLine
object Solution {
    def gcd(x: Int, y: Int): Int =
   {
        var maximum: Int = x.max(y)
        var minimum: Int = x.min(y)
        var q: Int = maximum / minimum
        var r: Int = maximum % minimum
        while(r != 0)
        {
            maximum = minimum
            minimum = r
            q = maximum / minimum
            r = maximum % minimum
        }
        return minimum
   }
  

/**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
		println(gcd(pair.head,pair.reverse.head))
  } 

    def main(args: Array[String]) {
/** The part relates to the input/output. Do not change or modify it **/
         acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

    }
}
