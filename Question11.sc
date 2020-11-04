import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {
    
    def fc(i: Int):Int = {
        var product: Int = 1
        for(a <- 1 to i)
        {
            product = product * a
        }
        return product
    }

    def e(x: Double):Double = {
        var sum: Double = 1.0000
        for(i <- 1 to 9)
        {
            sum = sum + (scala.math.pow(x, i))/(fc(i))
        }
        return sum
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        for (nItr <- 1 to n) {
            val x = stdin.readLine.trim.toDouble
            println(e(x))
        }
    }
}

// Link: https://www.hackerrank.com/challenges/eval-ex/problem
