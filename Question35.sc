import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Solution {

    def main(args: Array[String]) {
        val cases: Int = readInt()
        for(i <- 1 to cases)
        {
            var red: Int = 0
            var blue: Int = 0
            var green: Int = 0
            var yellow: Int = 0
            var isFalse = false
            val stringy: String = readLine()
            for(p <- 0 to stringy.length()-1)
            {
                if(stringy(p).toString == "B")
                    blue = blue + 1
                if(stringy(p).toString == "R")
                    red = red + 1
                if(stringy(p).toString == "G")
                    green = green + 1
                if(stringy(p).toString == "Y")
                    yellow = yellow + 1
                if((red - green).abs > 1 && !isFalse)
                {
                    isFalse = true
                    println("False")
                }
                if((yellow - blue).abs > 1 && !isFalse)
                {
                    isFalse = true
                    println("False")
                }
            }
            if((red != green || yellow != blue) && !isFalse)
            {
                isFalse = true
                println("False")
            }
            if(!isFalse)
                println("True")
        }
    }
}

// Link: https://www.hackerrank.com/challenges/sequence-full-of-colors/problem
