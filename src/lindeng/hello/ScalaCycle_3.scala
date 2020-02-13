package lindeng.hello

//循环
object ScalaCycle_3 {

  val args = Array("I", "do", "not", "like", "Scala")

  def main(args: Array[String]): Unit = {
    theWhile()
    theEach()
    theFor()
  }

  def theWhile()={
    var i=0
    while (i<args.length){
      //Scala 访问数组的语法是使用 () 而非 [] 。
      println(args(i))
      // Scala 不支持 ++i 和 i++ 运算符，因此需要使用 i += 1 来加一
      i+=1
    }
  }

  def theEach()={
    args.foreach(println)
  }

  def theFor()={
    for(arg<-args)
      println(arg)
  }
}
