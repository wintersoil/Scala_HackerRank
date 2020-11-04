import scala.io.StdIn.readLine
object Solution {
  def main(args: Array[String]) {
    val stringy: String = readLine()
    var result: StringBuilder = new StringBuilder("")
    var prevChar: Character = stringy(0)
    var count: Int = 1
    if(stringy.length > 1)
    {
      for(i <- 1 to stringy.length-1)
      {
        if((prevChar != stringy(i) && count == 1))
        {
          result.append(prevChar)
          if(((prevChar != stringy(i) && count == 1) && i == stringy.length-1))
            result.append(stringy(i))
          prevChar = stringy(i)
        }
        else if((prevChar != stringy(i) && count != 1) || i == stringy.length-1)
        {
          if(i == stringy.length-1 && prevChar == stringy(i))
            count = count + 1
          result.append(prevChar)
          result.append(count.toString)
          prevChar = stringy(i)
          count = 1
          if(i == stringy.length-1 && stringy(i) != stringy(i-1))
            result.append(stringy(i))
        }
        else
          count = count + 1
      }
    }
    else
      result = result.append(stringy)
    println(result)
  }
}

// Link : https://www.hackerrank.com/challenges/string-compression/problem
