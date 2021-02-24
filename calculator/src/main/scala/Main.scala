import scala.io.StdIn.readLine

object Main extends App{

  class OperationObject{
    private var mValue: Double = 0.0
    def setValue(x : Double){
      mValue = x
    }
    def getValue(): Double ={
      mValue
    }
  }

  class CalculatorOperation(){
    var num: Double = 0.0
    var operation: String = ""
    def calculation(a: Double, b: Double) : Double ={
      operation match {
        case "=" => num=a
        case "+" => num=a+b
        case "-" => num=a-b
        case "*" => num=a*b
        case "/" => num=a/b
      }
      num
    }
  }

  var operation: CalculatorOperation = new CalculatorOperation()
  var firstOperand: OperationObject = new OperationObject()
  var count: Double = 0.0
  var isOperand: Boolean = false
  println("Enter value")
  count = readLine().toDouble
  println("Enter operation")
  operation.operation=readLine()

  while(operation.operation != "="){
      println("Enter value")
      firstOperand.setValue(readLine().toDouble)
      count=operation.calculation(count,firstOperand.getValue())
      println("Enter operation")
      operation.operation=readLine()
  }

  println(count)
}