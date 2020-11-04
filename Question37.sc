import scala.io.StdIn.readLine

object Solution {

    def superDigit(number: BigInt): BigInt = {
        var number1: BigInt = number
        if(number1 < 10)
            return number1
        var stringy = number1.toString
        var sum: BigInt = 0
        var limit1: Int = stringy.length()-1
        for(pt <- 0 to limit1)
        {
            sum = sum + stringy(pt).toString.toInt
        }
        superDigit(sum)
    }

    def main(args: Array[String]) {
        val values: List[String] = readLine.split(" ").toList
        val times: Int = values(1).toInt
        
        var number1: BigInt = BigInt(values(0))
        if(number1 < 10)
            return number1
        var digit: BigInt = number1 % 10
        var sum: BigInt = 0
        var limit1: Int = values(0).length()-1
        var stringy = values(0)
        for(pt <- 0 to limit1)
        {
            sum = sum + stringy(pt).toString.toInt
        }
        sum = sum * times
        val final1: BigInt = superDigit(sum)
        println(final1)
    
    }
}

// Link: https://www.hackerrank.com/challenges/super-digit/problem
