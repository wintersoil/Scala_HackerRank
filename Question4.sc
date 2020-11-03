def f(num: Int, arr:List[Int]):List[Int] = {
  val p1 = List.empty[Int]
  for (e <- arr)
  {
    (0 until num).foreach(_ => println(e))
  }
  p1
}
