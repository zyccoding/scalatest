package 高阶函数

/**
  * 柯里化
  * 首先死记硬背柯里化的概念：将原来接受两个参数的函数变成新的接受一个参数的函数的过程，新的函数返回一个以原来第二个参数为参数的函数
  *
  * 柯里化是指将原来接受两个参数的函数编程新的接受一个参数的函数的过程。新的函数返回一个以原有第二个参数为参数的函数
  *
  * 柯里化是一个过程，是一种修改代码传参的形式
  *
  * Created by zyc on 2016/12/15.
  */
object CurryingTest {

  def mul(x: Int, y: Int) = x * y

  def mulOneAtATime(x: Int, z: Int) =  (y: Int) => x * y + y * z //高阶函数产生另一个函数

  def main(args: Array[String]): Unit = {
    val r = mulOneAtATime(1,2)
    r(3) //可以这样写

    mulOneAtATime(1,2)(3) //可以这样写

    println(r(3))
  }

}
