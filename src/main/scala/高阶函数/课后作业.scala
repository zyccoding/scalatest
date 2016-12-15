package 高阶函数

/**
  * Created by zyc on 2016/12/15.
  */
object 课后作业 {


  /**
    * 输出给定序列中的给定函数的最大值，不得使用循环和递归
    * @param fun
    * @param inputs
    */
  def largest(fun: (Int) => Int, inputs: Seq[Int]): Unit ={
     val a = fun

  }

  //柯里化
  def curryFunction(fun: (Int) => Int)(inputs: Seq[Int]) ={
    inputs.iterator.foreach(x => {

    })
  }

  //给定序列
  val seq = 1 to 5

  //给定函数
  def f1(x: Int): Int ={
    x*x
  }
}
