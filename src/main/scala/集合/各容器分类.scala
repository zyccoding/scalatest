package 集合

/**
  * Created by zyc on 2017/1/3.
  */
object 各容器分类 {
  /**
    * 序列按访问方式分两类，一是按索引查找元素，二是按下标查找元素
    * 序列按是否可修改分：一是可变序列，二是不可变序列
    *
    * 不可变索引序列：Vector（默认实现）
    * 可变索引序列： ArrayBuffer
    * 不可变链表序列：List（默认实现）
    * 可变链表序列：ListBuffer
    *
    *
    * ****索引****
    *  Vector不可变索引序列
    *  Range
    *  String比较特殊，实际上是一个不可变的字符序列（索引方式存储）
    *
    *  Array家族
    *  Array和ArrayBuffer都是可变索引序列，Array可以改变元素内容但不能改变序列大小，ArrayBuffer可以改变序列大小
    *  ArrayStack后进先出索引序列
    *
    *
    *
    * ****链表****
    *  Queue 先进先出
    *  Stack 后进先出
    *  Stream 懒加载List链表
    *
    *  List家族
    *  DoubleLinkedList可变双向链表，删除效率高
    *  LinkedList可变单向链表
    *  ListBuffer可变链表
    *  MutableList可变单向链表，可以在常数时间内添加元素
    *
    *
    *
    * 可变容器通用方法
    * c += x
    * c += (x,y,z)
    * c1 ++= c2
    * c -= x
    * c -= (x,y,z)
    * c1 --= c2
    * c(n) = x
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    */
}
