object Solution extends App {
  import scala.io.StdIn.readInt
  def f(num:Int) : List[Int] = {
    val list = List.range[Int](0,num)

    //print(list + "\n")
    return list
  }

  println(f(readInt))
}
