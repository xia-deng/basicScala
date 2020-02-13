package lindeng.hello

import scala.io.Source

object ScalaFile_8 {
  def main(args: Array[String]): Unit = {
    read()
  }

  def read()={
    var lines=Source.fromFile("C:\\triggerfullhinv.LOG")
    lines.getLines().foreach(println)
  }

}
