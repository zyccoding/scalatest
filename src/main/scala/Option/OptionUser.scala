package Option

/**
  * Created by zyc on 2016/12/19.
  */
object OptionUser {
  def main(args: Array[String]): Unit = {
    div(8,1) match{
      case None => println("none")
      case Some(x) => println(x)
    }
  }


  def div(x: Int, y: Int): Option[Int] = if(y == 0) None else Some(x/y)
}
