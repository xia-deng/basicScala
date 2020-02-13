package lindeng.hello

object ScalaArray_4 {
  def main(args: Array[String]): Unit = {
    printArray()
  }

  def printArray()={
    //声明数组是一个String数组，长度为3
    val array = new Array[String](3)

    /**
     * 为什么 Scala 中使用 () 来访问数组元素，
     * 在 Scala 中，数组和其它普遍的类定义一样，没有什么特别之处，
     * 当你在某个值后面使用 () 时，
     * Scala 将其翻译成对应对象的 apply 方法
     */
    array(0)="cao"
    array(1)="ni"
    array(2)="ma"
    //array(3)="what?" //java.lang.ArrayIndexOutOfBoundsException: 3

    /**
     * 这里的 0 to 2， 其实为 (0).to(2) 调用的为整数类型的 to 方法，to 方法使用一个参数。
     * Scala 中所有的基本数据类型也是对象（和 Java 不同），
     * 因此 0 可以有方法（实际上调用的是 RichInt 的方法），
     * 这种只有一个参数的方法可以使用操作符的写法（不用 . 和括号），
     * 实际上 Scala 中表达式 1+2 ，最终解释为 (1).+(2)+，这也是 Int 的一个方法
     */
    for (i<-0 to 1){
      println(array(i))
    }
  }
}
