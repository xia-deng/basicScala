package lindeng.hello

object ScalaValAndVar_1 {
  def main(args: Array[String]): Unit = {
    /**
     * Scala 定义了两种类型的变量 val 和 var ，
     * val 类似于Java中的 final 变量，一旦初始化之后，不可以重新赋值（我们可以称它为 常变量 ）。
     * 而 var 类似于一般的非 final 变量。可以任意重新赋值。
     */
    val test=0;
    println(test==1)

    var name="tom"
    println("my name is: "+name)
    name = "jim"
    println("my name is: "+name)
  }
}
