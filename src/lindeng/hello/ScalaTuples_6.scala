package lindeng.hello

object ScalaTuples_6 {
  def main(args: Array[String]): Unit = {
    theTuples()
  }

  def theTuples()={
    val pair=(99, "the tuples", Nil.::(3).::(2).::(1))
    println(pair._1)
    println(pair._2)
    println(pair._3)
  }
}
