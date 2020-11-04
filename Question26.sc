import scala.io.StdIn.readInt
object Solution {
    
     def fibonacci(x:Int):Int = {
        if(x == 1)
            return 0
        else if(x == 2)
            return 1
        else
            return fibonacci(x-1) + fibonacci(x-2)
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}

// Link: https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem
