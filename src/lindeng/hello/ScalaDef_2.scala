package lindeng.hello

object ScalaDef_2 {

  def main(args: Array[String]): Unit = {
    print("the max number is: "+max(4,78))
  }

  /**
   * max 函数的返回值类型为 Int
   * @param x
   * @param y
   * @return
   */
  def max(x:Int, y:Int):Int={
    if(x>y) x else y
  }

  /**
   * print 函数的返回值类型为 Unit ，表示该函数不返回任何有意义的值，Unit 类似于 Java 中的 void 类型。
   * @param msg
   */
  def print(msg:String)=println("the msg:"+msg)
}
