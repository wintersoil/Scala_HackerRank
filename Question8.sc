def f(arr:List[Int]):Int =
{
  var sum: Int = 0
  for(a <- arr){
    if(a % 2 != 0)
      sum = sum + a
  }
  return sum
}

// Link: https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem
