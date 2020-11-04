import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import scala.collection.mutable.HashMap
import scala.collection.mutable.HashSet
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._
object Solution {

    def main(args: Array[String]) {
        val cases: Int = readInt()
        for(i <- 1 to cases)
        {
            val nums_limit: List[Int] = readLine().split(" ").toList.map((x) => x.toInt)
            val hm: HashMap[Int, Int] = HashMap[Int, Int]()
            var hasMany: Boolean = false
            val done: HashSet[Int] = HashSet[Int]()
            var numbers: List[Int] = readLine().split(" ").toList.map((x) => x.toInt)
            val hm2: HashMap[Int, Int] = HashMap[Int, Int]()
            val hm3: HashMap[Int, Int] = HashMap[Int, Int]()
            var listy1: ListBuffer[Int] = ListBuffer[Int]()
            for(j <- 0 to numbers.length-1)
            {
                var val1: Int = numbers(j)
                if(!hm.contains(val1))
                {
                    hm.put(val1, 1)
                    hm2.put(val1, j)
                    hm3.put(j, val1)
                }
                else
                {
                    hm.put(val1, (hm(val1).toInt + 1))
                }
                if(!done.contains(val1) && hm(val1) >= nums_limit(1))
                {
                    hasMany = true
                    listy1 += hm2(val1)
                    done.add(val1)
                }
            }
            listy1 = listy1.sorted
            for(b <- listy1)
            {
                print(hm3(b) + " ")
            }
            if(hasMany)
                println()
            else
                println(-1)
        }
    }
}

// Link: https://www.hackerrank.com/challenges/filter-elements/problem
