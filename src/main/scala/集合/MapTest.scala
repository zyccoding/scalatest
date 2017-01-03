package 集合

/**
  * Created by zyc on 2016/12/29.
  */
object MapTest {
  /**
    * 序列
    * scala Seq分IndexedSeq和LinearSeq两大类
    * IndexedSeq的默认实现是Vector, LinearSeq的默认实现是List
    *
    *
    */

  def main(args: Array[String]): Unit = {
    val m1 = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4)
    val c1 = Map("a" -> 2, "b" -> 4)
    println(m1 - "a")
    println(m1 -- Vector("a","b"))
    val seq = collection.immutable.LinearSeq(1,2,3)
    println(seq)

  }
}
