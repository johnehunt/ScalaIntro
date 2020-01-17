package com.jjh.collections

object CollectExampleApp extends App {

  val dad = Person()
  val mum = Person("Denise")
  val adam = Person("Adam", 12)
  val phoebe = Person("Phoebe", age = 14)

  val family = List[Person](dad, mum, adam, phoebe)

  val names: Seq[String] = family.collect{case person: Person => person.name}
  println(names)
}
