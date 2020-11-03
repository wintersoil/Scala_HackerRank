// new question
import scala.io.StdIn.readLine
def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
{
  var ptr: Int = 0
  var sum: Double = 0
  for(a <- coefficients)
  {
    sum = sum + a * scala.math.pow(x, powers(ptr))
    ptr = ptr + 1
  }
  return sum
}

def area(coefficients:List[Int],powers:List[Int],x:Double):Double =
{

  return (scala.math.pow(f(coefficients, powers, x),2) * scala.math.Pi)
}


def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
{
  var sum: Double = 0
  var ptr: Double = lowerLimit
  while(ptr < upperLimit)
  {
    sum = sum + 0.001 * func(coefficients,  powers, ptr)
    ptr = ptr + 0.001
  }
  return sum
}
