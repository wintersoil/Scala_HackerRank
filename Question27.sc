import scala.io.StdIn.readInt
object Solution {

    def factorial(x: Int):Int = {
        if(x <= 1)
            return 1
        else
            return x * factorial(x-1)
    }

    def main(args: Array[String]) {
        val iterations: Int = readInt()
        
        for(i <- 0 to iterations - 1)
        {
            var column:Int = 0
            for(j <- column to i)
            {
                print((factorial(i)/(factorial(column) * factorial(i-column))) + " ")
                column = column + 1
            }
            println()
        }
    }
}
