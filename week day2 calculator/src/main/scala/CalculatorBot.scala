
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }

object CalculatorBot {
  final case class CalculatorBotClass(numberArr: Array[Double], str: String)
  def apply(): Behavior[CalculatorBotClass] = Behaviors.receive{(context, message) =>
    val calc = new Calculator(message.numberArr, message.str)
    calc.printNum()
    Behaviors.same
  }
}
