package scheme.SelfEvaluating.Num

import scheme.SelfEvaluating.SelfEvaluating

class Num(val n: Double) extends SelfEvaluating {
  override def eval(): Double = n

  def + (b: Num): Num = {
    new Num(n + b.eval())
  }
}
