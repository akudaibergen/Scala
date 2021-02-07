object Hello extends App {
//  println("Hello, world")

  def ex1(): Unit={
    val x = 1
    var y = 2
//    x = x + 1 неправильно
    y = y + 1
    println(x)
    println(y)
  }
//  ex1()

  def ex2(a: Int, b: Int): Int={
    a+b
  }
//  println(ex2(12,3))

  def ex4(a: Int, b: Int): Int={
    if(a>b) a else b
  }
//  println(ex4(12,45))

  def ex5(a: Int): String={
     a match {
      case 1 => "one"
      case 2 => "two"
      case _ => "not 1 or 2"
    }
  }
//  println(ex5(2))

  def ex6():Unit={
//    for (i <- 0 to 5) println(i)
//    for (i <- 0 to 10 by 2) println(i)
    val x = for (i <- 1 to 5) yield i * 2
    println(x)
  }
//  ex6()

  def ex7(a: Int):Unit={
    var b=a+1
//    while(b>0){
//      println(a)
//      b=b-1
//    }
    do{
      println(a)
      b=b-1
    }
    while (b>0)
  }
  ex7(2)
}