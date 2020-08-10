package com.jjh.imp.objects

object Test extends App {
  import LabelMaker._
  val a = Address("High Street", 10)
  // method printLabel uses Label maker to convert to labels
  // implicitly uses the object instance of AddressLabelMaker
  println(label(a))
}
