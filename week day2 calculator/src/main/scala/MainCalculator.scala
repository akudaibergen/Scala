import scala.io.StdIn
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }

object MainCalculator extends App{
  final case class CalculatorData(myarr: Array[Double],symbols: String)

  val numbers = new StringBuilder("")
  var operatorsSymbols: String = ""
  var arr = Array[Double]()

  var input = StdIn.readLine()
  while (input != "="){
    if (input == "+" || input == "*" || input == "/" || input == "-")
      operatorsSymbols ++= input
    else {
      arr = arr :+ input.toInt
    }
    input = StdIn.readLine()
  }

  def apply(): Behavior[CalculatorData] = Behaviors.setup{context =>
    val replyTo = context.spawn(CalculatorBot(), "TempObject")
    Behaviors.receiveMessage{ message =>
      replyTo ! CalculatorBot.CalculatorBotClass(message.myarr, message.symbols)
      Behaviors.same
    }
  }
  val system: ActorSystem[CalculatorData] = ActorSystem(MainCalculator(), "calculatorObject")
  system ! CalculatorData(arr, operatorsSymbols)
}
