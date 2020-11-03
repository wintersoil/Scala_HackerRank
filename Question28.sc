import scala.io.StdIn.readLine
object Solution {

    def main(args: Array[String]) {
        val p: String = readLine()
        val q: String = readLine()
        var r: String = ""
        for(i <- 0 to p.length - 1)
        {
            r = r.concat(p(i).toString).concat(q(i).toString)
        }
        println(r)
        return r
    }
}
