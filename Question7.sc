import scala.collection.mutable.ListBuffer
def f(arr:List[Int]):List[Int] = {
  var rev = new ListBuffer[Int]()
  val lengthy: Int = arr.size
  val range1 = List.range[Int](0, lengthy)
  for(i <- range1)
  {
    rev += arr(lengthy-i-1)
  }
  return rev.toList
}

// Link: https://www.hackerrank.com/challenges/fp-reverse-a-list/problem
