package com.jjh.expression

sealed abstract class Expr

case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object SealedTypeDescripter {
  def describe(x: Expr): String = x match {
    case Var(name) => s"Variable $name"
    case Number(44) => "Number with 44"
    case UnOp("++", _) => "An increment operator"
    case BinOp("-", Var("total"), Var("count")) => "Deep Match"
  }
}

object SealedClassExampleApp extends App {
  import SealedTypeDescripter._

  println(describe(Var("count")))
  println(describe(Number(44)))
  println(describe(UnOp("++", Var("count"))))
  println(describe(BinOp("-", Var("total"), Var("count"))))
}

