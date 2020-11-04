def f(arr:List[Int]):List[Int] = {
  var ptr:Int = 0
  val ret1 = List[Int]()
  for(e <- arr)
  {
    if(ptr % 2 != 0)
    {
      println(e)
    }
    ptr = ptr + 1
  }
  ret1
}

// Link: https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem
