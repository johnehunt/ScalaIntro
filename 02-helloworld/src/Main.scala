object Main extends App {
  println("Starting")
  val age = 42L
  val shortAge: Short = age.toShort
  val byteAge: Byte = age.toByte
  val floatAge: Float = age.toFloat
  val doubleAge:Double = age.toDouble
  println(s"$age, $shortAge, $byteAge, $floatAge, $doubleAge")
  println("Done")
}
