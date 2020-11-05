import scala.io.StdIn.readInt
import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet
object Solution {

    def pentagonalNumbers(n: Int, hm: HashMap[Int, Long]): Long = {
        if(n == 1)
            return 1L
        else
        {
            var nextIter: Long = 0
            if(!hm.contains(n))
            {
                nextIter = pentagonalNumbers(n-1, hm)
                hm.put(n, (nextIter + (3*n) - 2))
                return hm(n)
            }
            else
            {
                return hm(n)
            }
        }
    }

    def main(args: Array[String]) {
        val iterations = readInt()
        val hm: HashMap[Int, Long] = HashMap[Int, Long]()
        for(i <- 1 to iterations)
        {
            var num: Int = readInt()
            var pN: Long = 0
            if(!hm.contains(num))
            {
                pN = pentagonalNumbers(num, hm)
            }
            else
                pN = hm(num)
            println(pN)
        }
    }
}


// Link: https://www.hackerrank.com/challenges/pentagonal-numbers/problem
