class Calculator(var operands:Array[Double], var operators: String) {
  var res: Double = 0
  var temp:Int = 0
  val indexedSequence = for(i <- 0 to 10 if i % 2 == 0) yield i

  operators(0) match {
    case '+' => res = operands(0) + operands(1)
    case '-' => res = operands(0) - operands(1)
    case '*' => res = operands(0) * operands(1)
    case '/' => res = operands(0) / operands(1)
  }
  for(i <- 1 to operators.length - 1; j <- 2 to operands.length - 1){
    operators(i) match {
      case '+' => res += operands(j)
      case '*' => res *= operands(j)
      case '-' => res -= operands(j)
      case '/' => res /= operands(j)
    }
  }
  def printNum() = print(res)
}
