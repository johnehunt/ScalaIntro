package com.jjh.exceptions

import scala.annotation.tailrec

class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator)

  def +(i: Int): Rational = {
    if (i < 0) {
      throw new RuntimeException("Argument can't be Zero")
    }
    new Rational(numerator + i * denominator, denominator)
  }

  def -(that: Rational): Rational =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator)

  def -(i: Int): Rational =
    new Rational(numerator - i * denominator, denominator)

  def *(that: Rational): Rational =
    new Rational(numerator * that.numerator, denominator * that.denominator)

  def *(i: Int): Rational =
    new Rational(numerator * i, denominator)

  def /(that: Rational): Rational =
    new Rational(numerator * that.denominator, denominator * that.numerator)

  def /(i: Int): Rational =
    new Rational(numerator, denominator * i)

  override def toString: String = s"$numerator / $denominator"

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def equals(other: Any): Boolean =
    other match {

      case that: Rational =>
        (that canEqual this) &&
          numerator == that.numerator &&
          denominator == that.denominator

      case _ => false
    }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Rational]

  override def hashCode: Int = 41 * (41 + numerator) + denominator

}