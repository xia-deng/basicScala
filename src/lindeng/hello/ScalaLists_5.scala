package lindeng.hello

/**
 * 和 Java 的 List 不同，Scala 的 Lists 对象是不可修改的。
 * 它被设计用来满足函数编程风格的代码。它有点像 Java 的 String，String 也是不可以修改的
 */
object ScalaLists_5 {
  def main(args: Array[String]): Unit = {
    opLists()
  }

  def opLists()={
    val oneLists=List(1,12,21)
    val twoLists=List(3,4,15)
    val upLists=oneLists:::twoLists
    println("one lists:"+oneLists)
    println("two lists:"+twoLists)
    println("merge the lists to upLists:"+upLists)

    println("\n-----------------------------\n")
    oneLists.foreach(println)
    println("\n-----------------------------\n")
    oneLists.sorted.foreach(println)
    println("\n-----------------------------\n")
    //oneLists=oneLists::45 //Error:(25, 13) reassignment to val
    //val oneListsNew = oneLists::45::31::9 //Error:(26, 39) value :: is not a member of Int
    val oneListsNew = oneLists::45::31::9::Nil //List(List(1, 12, 21), 45, 31, 9)
    println(oneListsNew)
    oneListsNew.foreach(println)
    println("\n-----------------------------\n")
    println("head:"+oneLists.head)
    println("last:"+oneLists.last)
    println(oneLists.reverse)   //排序，降序
    println(oneLists.tail.tail)   //tail 弹出
  }
}
