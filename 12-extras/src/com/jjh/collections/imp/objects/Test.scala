package com.jjh.collections.imp.objects

object Test extends App {
  import LabelMaker._
  val a = Address("High Street", 10)
  // method label uses Label maker to convert to labels
  // implicitly uses the object instance of AddressLabelMaker
  println(label(a))
}
