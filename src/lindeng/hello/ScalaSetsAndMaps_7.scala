package lindeng.hello

object ScalaSetsAndMaps_7 {
  def main(args: Array[String]): Unit = {
    theSets()
    theMaps()
  }

  /**
   * Set(集合)是没有重复对象的集合，所有的元素都是唯一的。
   *  Scala API 定义了 Set 的 基Trait 类型 Set （Trait 的概念类似于Java中的 Interface，所不同的是Scala中的 Trait 可以有方法的实现），
   *  分两个包定义 Mutable （可变）和 Immutable （不可变），使用同样名称的子 Trait 。下图为 Trait 和类的基础关系：
   */

  def theSets() = {
    var set1=scala.collection.immutable.Set(1,"tom",4,"green")
    set1+=8
    println(set1)
    set1=Set("reset")
    println("reset:"+set1)
    println(set1.contains("Lil"))

    println("\n-----------------------------\n")

    var set2=scala.collection.mutable.Set("A","B","B","C","D")
    set2.add("E")
    set2.add("E")
    set2+="F"
    println(set2)
    println("\n-----------------------------\n")
  }

  /**
   * Map(映射)是一种可迭代的key/value结构，所有的值都可以通过键来获取。
   * Scala 也提供了 Mutable 和 Immutable 两种 Map 类型
   */
  def theMaps() = {
  var map1=Map("key1"->"value1","key2"->"value2")
    println(map1("key1"))

    var map2=Map()
    println(map2)
  }
}
