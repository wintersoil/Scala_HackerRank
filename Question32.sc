import scala.io.StdIn.readInt
import scala.collection.mutable.ListBuffer

def f(delim:Int,arr:List[Int]):List[Int] = {
    val filtered: ListBuffer[Int] = ListBuffer[Int]()
    for(num <- arr)
    {
        if(num < delim)
        {
            filtered += num
        }
    }
    return filtered.toList
}

//Link : https://www.hackerrank.com/challenges/fp-filter-array/problem
