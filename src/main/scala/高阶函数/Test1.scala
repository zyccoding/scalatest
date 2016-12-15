package 高阶函数

/**
  * Created by zyc on 2016/12/15.
  */
object Test1 {

  def main(args: Array[String]): Unit = {
    //带函数参数的函数
    def addNum(f: (Int,Int) => Int) = f(5,3)

    //定义一个函数作为参数传入上面定义的方法内
    def function1(x: Int, y: Int): Int = {
      println("function1: " + (x*y))
      x * y
    }

    def function2(x: Int, y: Int): Int = {
      println("function2: " + (x + y))
      x + y
    }

    //调用高阶函数addNum

    addNum(function1)
    addNum(function2)

    test3(function3)

    val a = (x: Int) => x + 1
    println(a(2))

  }

  /**
    * 关于高阶函数的使用
    * 定义后输入参数相当于固定
    * 相当于给你一个西红柿，你自己去做菜，但还要求做出来的菜是川菜口味
    *
    * addNum(f: (Int,Int) => Int) =  f(5,3)
    *              蔬菜     川菜     西红柿
    *
    *  这种模式类似于java的工厂模式
    *  给定一个输入，可以有多种输出，但是对于用户具体的实现方式是透明的
    *  对于态势感知项目的应用：给定输入FLOW，可以对FLOW多多种操作，比如报表，mapping，obj等
    *
    */

    def function3(a: Int, b: Int): Int ={
        a + b
    }
    def test3(a: (Int,Int) => (Int)): Int ={
      2
    }


}
